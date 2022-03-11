// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.chime.VoiceConnectorStreamingArgs;
import io.pulumi.aws.chime.inputs.VoiceConnectorStreamingState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Adds a streaming configuration for the specified Amazon Chime Voice Connector. The streaming configuration specifies whether media streaming is enabled for sending to Amazon Kinesis.
 * It also sets the retention period, in hours, for the Amazon Kinesis data.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Chime Voice Connector Streaming can be imported using the `voice_connector_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:chime/voiceConnectorStreaming:VoiceConnectorStreaming default abcdef1ghij2klmno3pqr4
 * ```
 * 
 */
@ResourceType(type="aws:chime/voiceConnectorStreaming:VoiceConnectorStreaming")
public class VoiceConnectorStreaming extends io.pulumi.resources.CustomResource {
    /**
     * The retention period, in hours, for the Amazon Kinesis data.
     * 
     */
    @OutputExport(name="dataRetention", type=Integer.class, parameters={})
    private Output<Integer> dataRetention;

    /**
     * @return The retention period, in hours, for the Amazon Kinesis data.
     * 
     */
    public Output<Integer> getDataRetention() {
        return this.dataRetention;
    }
    /**
     * When true, media streaming to Amazon Kinesis is turned off. Default: `false`
     * 
     */
    @OutputExport(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return When true, media streaming to Amazon Kinesis is turned off. Default: `false`
     * 
     */
    public Output</* @Nullable */ Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
     * 
     */
    @OutputExport(name="streamingNotificationTargets", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> streamingNotificationTargets;

    /**
     * @return The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
     * 
     */
    public Output</* @Nullable */ List<String>> getStreamingNotificationTargets() {
        return this.streamingNotificationTargets;
    }
    /**
     * The Amazon Chime Voice Connector ID.
     * 
     */
    @OutputExport(name="voiceConnectorId", type=String.class, parameters={})
    private Output<String> voiceConnectorId;

    /**
     * @return The Amazon Chime Voice Connector ID.
     * 
     */
    public Output<String> getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    public interface BuilderApplicator {
        public void apply(VoiceConnectorStreamingArgs.Builder a);
    }
    private static io.pulumi.aws.chime.VoiceConnectorStreamingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.chime.VoiceConnectorStreamingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VoiceConnectorStreaming(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VoiceConnectorStreaming(String name) {
        this(name, VoiceConnectorStreamingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VoiceConnectorStreaming(String name, VoiceConnectorStreamingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VoiceConnectorStreaming(String name, VoiceConnectorStreamingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnectorStreaming:VoiceConnectorStreaming", name, args == null ? VoiceConnectorStreamingArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VoiceConnectorStreaming(String name, Output<String> id, @Nullable VoiceConnectorStreamingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnectorStreaming:VoiceConnectorStreaming", name, state, makeResourceOptions(options, id));
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
    public static VoiceConnectorStreaming get(String name, Output<String> id, @Nullable VoiceConnectorStreamingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VoiceConnectorStreaming(name, id, state, options);
    }
}
