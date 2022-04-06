// from https://github.com/pulumi/examples/blob/8cc8b1a4384c8b33f70ba65c701e19daecfa6399/aws-ts-s3-folder/index.ts
package s3site;

import io.pulumi.Stack;
import io.pulumi.aws.s3.BucketObject;
import io.pulumi.aws.s3.BucketObjectArgs;
import io.pulumi.aws.s3.BucketPolicy;
import io.pulumi.aws.s3.BucketPolicyArgs;
import io.pulumi.awsnative.s3.Bucket;
import io.pulumi.awsnative.s3.BucketArgs;
import io.pulumi.awsnative.s3.inputs.BucketWebsiteConfigurationArgs;
import io.pulumi.core.Asset.FileAsset;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class MyStack extends Stack {

    @Export(type = String.class)
    private final Output<String> websiteUrl;

    @Export(type = String.class)
    private final Output<String> bucketName;

    public MyStack() {

        final var siteBucket = new Bucket("s3-website-bucket",
            BucketArgs.builder().websiteConfiguration(BucketWebsiteConfigurationArgs.builder()
                .indexDocument("index.html")
                .build()).build());

        final String siteDir = "www/";
        try {
            for (var path : Files.walk(Paths.get(siteDir)).filter(Files::isRegularFile).toList()) {
                var contentType = Files.probeContentType(path);
                new BucketObject(path.toString().replace(siteDir, ""),
                    BucketObjectArgs.builder().bucket(siteBucket.getId())
                        .source(new FileAsset(path.toAbsolutePath().toString()))
                        .contentType(contentType).build()
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        final var bucketPolicy = new BucketPolicy("bucketPolicy",
            BucketPolicyArgs.builder().bucket(siteBucket.getId())
                .policy(siteBucket.getArn()
                    .applyValue(bucketArn -> """
                        {
                            "Version":"2012-10-17",
                            "Statement":[{
                                "Effect":"Allow",
                                "Principal":"*",
                                "Action":["s3:GetObject"],
                                "Resource":["%s/*"]
                            }]
                        }
                    """.formatted(bucketArn))
                ).build());

        this.bucketName = siteBucket.getBucketName();
        this.websiteUrl = siteBucket.getWebsiteURL();
    }
}