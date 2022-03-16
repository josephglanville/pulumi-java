// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2beta1.EnvironmentArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1FulfillmentResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an agent environment.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dialogflow/v2beta1:Environment")
public class Environment extends io.pulumi.resources.CustomResource {
    /**
     * Optional. The agent version loaded into this environment. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    @Export(name="agentVersion", type=String.class, parameters={})
    private Output<String> agentVersion;

    /**
     * @return Optional. The agent version loaded into this environment. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    public Output<String> getAgentVersion() {
        return this.agentVersion;
    }
    /**
     * Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Optional. The fulfillment settings to use for this environment.
     * 
     */
    @Export(name="fulfillment", type=GoogleCloudDialogflowV2beta1FulfillmentResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2beta1FulfillmentResponse> fulfillment;

    /**
     * @return Optional. The fulfillment settings to use for this environment.
     * 
     */
    public Output<GoogleCloudDialogflowV2beta1FulfillmentResponse> getFulfillment() {
        return this.fulfillment;
    }
    /**
     * The unique identifier of this agent environment. Supported formats: - `projects//agent/environments/` - `projects//locations//agent/environments/`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of this agent environment. Supported formats: - `projects//agent/environments/` - `projects//locations//agent/environments/`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The state of this environment. This field is read-only, i.e., it cannot be set by create and update methods.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of this environment. This field is read-only, i.e., it cannot be set by create and update methods.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Optional. Text to speech settings for this environment.
     * 
     */
    @Export(name="textToSpeechSettings", type=GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse> textToSpeechSettings;

    /**
     * @return Optional. Text to speech settings for this environment.
     * 
     */
    public Output<GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse> getTextToSpeechSettings() {
        return this.textToSpeechSettings;
    }
    /**
     * The last update time of this environment. This field is read-only, i.e., it cannot be set by create and update methods.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update time of this environment. This field is read-only, i.e., it cannot be set by create and update methods.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(EnvironmentArgs.Builder a);
    }
    private static io.pulumi.googlenative.dialogflow_v2beta1.EnvironmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.dialogflow_v2beta1.EnvironmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Environment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Environment(String name) {
        this(name, EnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Environment(String name, EnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2beta1:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Environment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2beta1:Environment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Environment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, options);
    }
}
