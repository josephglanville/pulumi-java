// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.kendra.FaqArgs;
import io.pulumi.awsnative.kendra.enums.FaqFileFormat;
import io.pulumi.awsnative.kendra.outputs.FaqS3Path;
import io.pulumi.awsnative.kendra.outputs.FaqTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Kendra FAQ resource
 * 
 */
@ResourceType(type="aws-native:kendra:Faq")
public class Faq extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * FAQ description
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return FAQ description
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * FAQ file format
     * 
     */
    @OutputExport(name="fileFormat", type=FaqFileFormat.class, parameters={})
    private Output</* @Nullable */ FaqFileFormat> fileFormat;

    /**
     * @return FAQ file format
     * 
     */
    public Output</* @Nullable */ FaqFileFormat> getFileFormat() {
        return this.fileFormat;
    }
    /**
     * Index ID
     * 
     */
    @OutputExport(name="indexId", type=String.class, parameters={})
    private Output<String> indexId;

    /**
     * @return Index ID
     * 
     */
    public Output<String> getIndexId() {
        return this.indexId;
    }
    /**
     * FAQ name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return FAQ name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * FAQ role ARN
     * 
     */
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return FAQ role ARN
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * FAQ S3 path
     * 
     */
    @OutputExport(name="s3Path", type=FaqS3Path.class, parameters={})
    private Output<FaqS3Path> s3Path;

    /**
     * @return FAQ S3 path
     * 
     */
    public Output<FaqS3Path> getS3Path() {
        return this.s3Path;
    }
    /**
     * Tags for labeling the FAQ
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={FaqTag.class})
    private Output</* @Nullable */ List<FaqTag>> tags;

    /**
     * @return Tags for labeling the FAQ
     * 
     */
    public Output</* @Nullable */ List<FaqTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(FaqArgs.Builder a);
    }
    private static io.pulumi.awsnative.kendra.FaqArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.kendra.FaqArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Faq(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Faq(String name) {
        this(name, FaqArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Faq(String name, FaqArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Faq(String name, FaqArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kendra:Faq", name, args == null ? FaqArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Faq(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kendra:Faq", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Faq get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Faq(name, id, options);
    }
}
