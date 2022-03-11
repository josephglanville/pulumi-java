// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3.BucketPublicAccessBlockArgs;
import io.pulumi.aws.s3.inputs.BucketPublicAccessBlockState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages S3 bucket-level Public Access Block configuration. For more information about these settings, see the [AWS S3 Block Public Access documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_s3_bucket_public_access_block` can be imported by using the bucket name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketPublicAccessBlock:BucketPublicAccessBlock example my-bucket
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketPublicAccessBlock:BucketPublicAccessBlock")
public class BucketPublicAccessBlock extends io.pulumi.resources.CustomResource {
    /**
     * Whether Amazon S3 should block public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
     * * PUT Object calls will fail if the request includes an object ACL.
     * 
     */
    @OutputExport(name="blockPublicAcls", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> blockPublicAcls;

    /**
     * @return Whether Amazon S3 should block public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
     * * PUT Object calls will fail if the request includes an object ACL.
     * 
     */
    public Output</* @Nullable */ Boolean> getBlockPublicAcls() {
        return this.blockPublicAcls;
    }
    /**
     * Whether Amazon S3 should block public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the existing bucket policy. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    @OutputExport(name="blockPublicPolicy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> blockPublicPolicy;

    /**
     * @return Whether Amazon S3 should block public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the existing bucket policy. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    public Output</* @Nullable */ Boolean> getBlockPublicPolicy() {
        return this.blockPublicPolicy;
    }
    /**
     * S3 Bucket to which this Public Access Block configuration should be applied.
     * 
     */
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return S3 Bucket to which this Public Access Block configuration should be applied.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * Whether Amazon S3 should ignore public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore public ACLs on this bucket and any objects that it contains.
     * 
     */
    @OutputExport(name="ignorePublicAcls", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignorePublicAcls;

    /**
     * @return Whether Amazon S3 should ignore public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore public ACLs on this bucket and any objects that it contains.
     * 
     */
    public Output</* @Nullable */ Boolean> getIgnorePublicAcls() {
        return this.ignorePublicAcls;
    }
    /**
     * Whether Amazon S3 should restrict public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the previously stored bucket policy, except that public and cross-account access within the public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access this buckets if it has a public policy.
     * 
     */
    @OutputExport(name="restrictPublicBuckets", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> restrictPublicBuckets;

    /**
     * @return Whether Amazon S3 should restrict public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the previously stored bucket policy, except that public and cross-account access within the public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access this buckets if it has a public policy.
     * 
     */
    public Output</* @Nullable */ Boolean> getRestrictPublicBuckets() {
        return this.restrictPublicBuckets;
    }

    public interface BuilderApplicator {
        public void apply(BucketPublicAccessBlockArgs.Builder a);
    }
    private static io.pulumi.aws.s3.BucketPublicAccessBlockArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.s3.BucketPublicAccessBlockArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BucketPublicAccessBlock(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketPublicAccessBlock(String name) {
        this(name, BucketPublicAccessBlockArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketPublicAccessBlock(String name, BucketPublicAccessBlockArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketPublicAccessBlock(String name, BucketPublicAccessBlockArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketPublicAccessBlock:BucketPublicAccessBlock", name, args == null ? BucketPublicAccessBlockArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private BucketPublicAccessBlock(String name, Output<String> id, @Nullable BucketPublicAccessBlockState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketPublicAccessBlock:BucketPublicAccessBlock", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BucketPublicAccessBlock get(String name, Output<String> id, @Nullable BucketPublicAccessBlockState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketPublicAccessBlock(name, id, state, options);
    }
}
