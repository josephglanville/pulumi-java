// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2beta1.IntentArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1ContextResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentParameterResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentTrainingPhraseResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an intent in the specified agent. Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dialogflow/v2beta1:Intent")
public class Intent extends io.pulumi.resources.CustomResource {
    /**
     * Optional. The name of the action associated with the intent. Note: The action name must not contain whitespaces.
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return Optional. The name of the action associated with the intent. Note: The action name must not contain whitespaces.
     * 
     */
    public Output<String> getAction() {
        return this.action;
    }
    /**
     * Optional. The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
     * 
     */
    @Export(name="defaultResponsePlatforms", type=List.class, parameters={String.class})
    private Output<List<String>> defaultResponsePlatforms;

    /**
     * @return Optional. The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
     * 
     */
    public Output<List<String>> getDefaultResponsePlatforms() {
        return this.defaultResponsePlatforms;
    }
    /**
     * The name of this intent.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The name of this intent.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. Indicates that this intent ends an interaction. Some integrations (e.g., Actions on Google or Dialogflow phone gateway) use this information to close interaction with an end user. Default is false.
     * 
     */
    @Export(name="endInteraction", type=Boolean.class, parameters={})
    private Output<Boolean> endInteraction;

    /**
     * @return Optional. Indicates that this intent ends an interaction. Some integrations (e.g., Actions on Google or Dialogflow phone gateway) use this information to close interaction with an end user. Default is false.
     * 
     */
    public Output<Boolean> getEndInteraction() {
        return this.endInteraction;
    }
    /**
     * Optional. The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of the contexts must be present in the active user session for an event to trigger this intent. Event names are limited to 150 characters.
     * 
     */
    @Export(name="events", type=List.class, parameters={String.class})
    private Output<List<String>> events;

    /**
     * @return Optional. The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of the contexts must be present in the active user session for an event to trigger this intent. Event names are limited to 150 characters.
     * 
     */
    public Output<List<String>> getEvents() {
        return this.events;
    }
    /**
     * Information about all followup intents that have this intent as a direct or indirect parent. We populate this field only in the output.
     * 
     */
    @Export(name="followupIntentInfo", type=List.class, parameters={GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse.class})
    private Output<List<GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse>> followupIntentInfo;

    /**
     * @return Information about all followup intents that have this intent as a direct or indirect parent. We populate this field only in the output.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2beta1IntentFollowupIntentInfoResponse>> getFollowupIntentInfo() {
        return this.followupIntentInfo;
    }
    /**
     * Optional. The list of context names required for this intent to be triggered. Formats: - `projects//agent/sessions/-/contexts/` - `projects//locations//agent/sessions/-/contexts/`
     * 
     */
    @Export(name="inputContextNames", type=List.class, parameters={String.class})
    private Output<List<String>> inputContextNames;

    /**
     * @return Optional. The list of context names required for this intent to be triggered. Formats: - `projects//agent/sessions/-/contexts/` - `projects//locations//agent/sessions/-/contexts/`
     * 
     */
    public Output<List<String>> getInputContextNames() {
        return this.inputContextNames;
    }
    /**
     * Optional. Indicates whether this is a fallback intent.
     * 
     */
    @Export(name="isFallback", type=Boolean.class, parameters={})
    private Output<Boolean> isFallback;

    /**
     * @return Optional. Indicates whether this is a fallback intent.
     * 
     */
    public Output<Boolean> getIsFallback() {
        return this.isFallback;
    }
    /**
     * Optional. Indicates that a live agent should be brought in to handle the interaction with the user. In most cases, when you set this flag to true, you would also want to set end_interaction to true as well. Default is false.
     * 
     */
    @Export(name="liveAgentHandoff", type=Boolean.class, parameters={})
    private Output<Boolean> liveAgentHandoff;

    /**
     * @return Optional. Indicates that a live agent should be brought in to handle the interaction with the user. In most cases, when you set this flag to true, you would also want to set end_interaction to true as well. Default is false.
     * 
     */
    public Output<Boolean> getLiveAgentHandoff() {
        return this.liveAgentHandoff;
    }
    /**
     * Optional. The collection of rich messages corresponding to the `Response` field in the Dialogflow console.
     * 
     */
    @Export(name="messages", type=List.class, parameters={GoogleCloudDialogflowV2beta1IntentMessageResponse.class})
    private Output<List<GoogleCloudDialogflowV2beta1IntentMessageResponse>> messages;

    /**
     * @return Optional. The collection of rich messages corresponding to the `Response` field in the Dialogflow console.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageResponse>> getMessages() {
        return this.messages;
    }
    /**
     * Optional. Indicates whether Machine Learning is disabled for the intent. Note: If `ml_disabled` setting is set to true, then this intent is not taken into account during inference in `ML ONLY` match mode. Also, auto-markup in the UI is turned off.
     * 
     */
    @Export(name="mlDisabled", type=Boolean.class, parameters={})
    private Output<Boolean> mlDisabled;

    /**
     * @return Optional. Indicates whether Machine Learning is disabled for the intent. Note: If `ml_disabled` setting is set to true, then this intent is not taken into account during inference in `ML ONLY` match mode. Also, auto-markup in the UI is turned off.
     * 
     */
    public Output<Boolean> getMlDisabled() {
        return this.mlDisabled;
    }
    /**
     * Optional. The unique identifier of this intent. Required for Intents.UpdateIntent and Intents.BatchUpdateIntents methods. Supported formats: - `projects//agent/intents/` - `projects//locations//agent/intents/`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Optional. The unique identifier of this intent. Required for Intents.UpdateIntent and Intents.BatchUpdateIntents methods. Supported formats: - `projects//agent/intents/` - `projects//locations//agent/intents/`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. The collection of contexts that are activated when the intent is matched. Context messages in this collection should not set the parameters field. Setting the `lifespan_count` to 0 will reset the context when the intent is matched. Format: `projects//agent/sessions/-/contexts/`.
     * 
     */
    @Export(name="outputContexts", type=List.class, parameters={GoogleCloudDialogflowV2beta1ContextResponse.class})
    private Output<List<GoogleCloudDialogflowV2beta1ContextResponse>> outputContexts;

    /**
     * @return Optional. The collection of contexts that are activated when the intent is matched. Context messages in this collection should not set the parameters field. Setting the `lifespan_count` to 0 will reset the context when the intent is matched. Format: `projects//agent/sessions/-/contexts/`.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2beta1ContextResponse>> getOutputContexts() {
        return this.outputContexts;
    }
    /**
     * Optional. The collection of parameters associated with the intent.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={GoogleCloudDialogflowV2beta1IntentParameterResponse.class})
    private Output<List<GoogleCloudDialogflowV2beta1IntentParameterResponse>> parameters;

    /**
     * @return Optional. The collection of parameters associated with the intent.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2beta1IntentParameterResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * Optional. The unique identifier of the parent intent in the chain of followup intents. You can set this field when creating an intent, for example with CreateIntent or BatchUpdateIntents, in order to make this intent a followup intent. It identifies the parent followup intent. Format: `projects//agent/intents/`.
     * 
     */
    @Export(name="parentFollowupIntentName", type=String.class, parameters={})
    private Output<String> parentFollowupIntentName;

    /**
     * @return Optional. The unique identifier of the parent intent in the chain of followup intents. You can set this field when creating an intent, for example with CreateIntent or BatchUpdateIntents, in order to make this intent a followup intent. It identifies the parent followup intent. Format: `projects//agent/intents/`.
     * 
     */
    public Output<String> getParentFollowupIntentName() {
        return this.parentFollowupIntentName;
    }
    /**
     * Optional. The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return Optional. The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    public Output<Integer> getPriority() {
        return this.priority;
    }
    /**
     * Optional. Indicates whether to delete all contexts in the current session when this intent is matched.
     * 
     */
    @Export(name="resetContexts", type=Boolean.class, parameters={})
    private Output<Boolean> resetContexts;

    /**
     * @return Optional. Indicates whether to delete all contexts in the current session when this intent is matched.
     * 
     */
    public Output<Boolean> getResetContexts() {
        return this.resetContexts;
    }
    /**
     * The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup intents chain for this intent. Format: `projects//agent/intents/`.
     * 
     */
    @Export(name="rootFollowupIntentName", type=String.class, parameters={})
    private Output<String> rootFollowupIntentName;

    /**
     * @return The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup intents chain for this intent. Format: `projects//agent/intents/`.
     * 
     */
    public Output<String> getRootFollowupIntentName() {
        return this.rootFollowupIntentName;
    }
    /**
     * Optional. The collection of examples that the agent is trained on.
     * 
     */
    @Export(name="trainingPhrases", type=List.class, parameters={GoogleCloudDialogflowV2beta1IntentTrainingPhraseResponse.class})
    private Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhraseResponse>> trainingPhrases;

    /**
     * @return Optional. The collection of examples that the agent is trained on.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhraseResponse>> getTrainingPhrases() {
        return this.trainingPhrases;
    }
    /**
     * Optional. Indicates whether webhooks are enabled for the intent.
     * 
     */
    @Export(name="webhookState", type=String.class, parameters={})
    private Output<String> webhookState;

    /**
     * @return Optional. Indicates whether webhooks are enabled for the intent.
     * 
     */
    public Output<String> getWebhookState() {
        return this.webhookState;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Intent(String name) {
        this(name, IntentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Intent(String name, IntentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Intent(String name, IntentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2beta1:Intent", name, args == null ? IntentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Intent(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2beta1:Intent", name, null, makeResourceOptions(options, id));
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
    public static Intent get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Intent(name, id, options);
    }
}
