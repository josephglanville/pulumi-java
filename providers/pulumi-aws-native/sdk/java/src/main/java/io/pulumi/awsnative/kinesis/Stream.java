// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesis;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.kinesis.StreamArgs;
import io.pulumi.awsnative.kinesis.outputs.StreamEncryption;
import io.pulumi.awsnative.kinesis.outputs.StreamModeDetails;
import io.pulumi.awsnative.kinesis.outputs.StreamTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Kinesis::Stream
 * 
 */
@ResourceType(type="aws-native:kinesis:Stream")
public class Stream extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon resource name (ARN) of the Kinesis stream
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon resource name (ARN) of the Kinesis stream
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the Kinesis stream.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the Kinesis stream.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The number of hours for the data records that are stored in shards to remain accessible.
     * 
     */
    @OutputExport(name="retentionPeriodHours", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionPeriodHours;

    /**
     * @return The number of hours for the data records that are stored in shards to remain accessible.
     * 
     */
    public Output</* @Nullable */ Integer> getRetentionPeriodHours() {
        return this.retentionPeriodHours;
    }
    /**
     * The number of shards that the stream uses. Required when StreamMode = PROVISIONED is passed.
     * 
     */
    @OutputExport(name="shardCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> shardCount;

    /**
     * @return The number of shards that the stream uses. Required when StreamMode = PROVISIONED is passed.
     * 
     */
    public Output</* @Nullable */ Integer> getShardCount() {
        return this.shardCount;
    }
    /**
     * When specified, enables or updates server-side encryption using an AWS KMS key for a specified stream.
     * 
     */
    @OutputExport(name="streamEncryption", type=StreamEncryption.class, parameters={})
    private Output</* @Nullable */ StreamEncryption> streamEncryption;

    /**
     * @return When specified, enables or updates server-side encryption using an AWS KMS key for a specified stream.
     * 
     */
    public Output</* @Nullable */ StreamEncryption> getStreamEncryption() {
        return this.streamEncryption;
    }
    /**
     * The mode in which the stream is running.
     * 
     */
    @OutputExport(name="streamModeDetails", type=StreamModeDetails.class, parameters={})
    private Output</* @Nullable */ StreamModeDetails> streamModeDetails;

    /**
     * @return The mode in which the stream is running.
     * 
     */
    public Output</* @Nullable */ StreamModeDetails> getStreamModeDetails() {
        return this.streamModeDetails;
    }
    /**
     * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={StreamTag.class})
    private Output</* @Nullable */ List<StreamTag>> tags;

    /**
     * @return An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream.
     * 
     */
    public Output</* @Nullable */ List<StreamTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stream(String name) {
        this(name, StreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stream(String name, @Nullable StreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stream(String name, @Nullable StreamArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kinesis:Stream", name, args == null ? StreamArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Stream(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kinesis:Stream", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static Stream get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Stream(name, id, options);
    }
}
