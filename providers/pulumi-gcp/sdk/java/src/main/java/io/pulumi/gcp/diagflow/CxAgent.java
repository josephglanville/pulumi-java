// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.diagflow.CxAgentArgs;
import io.pulumi.gcp.diagflow.inputs.CxAgentState;
import io.pulumi.gcp.diagflow.outputs.CxAgentSpeechToTextSettings;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Agents are best described as Natural Language Understanding (NLU) modules that transform user requests into actionable data. You can include agents in your app, product, or service to determine user intent and respond to the user in a natural way.
 * 
 * To get more information about Agent, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Agent can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxAgent:CxAgent default projects/{{project}}/locations/{{location}}/agents/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxAgent:CxAgent default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxAgent:CxAgent default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/cxAgent:CxAgent")
public class CxAgent extends io.pulumi.resources.CustomResource {
    /**
     * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted Web Demo integration.
     * 
     */
    @Export(name="avatarUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> avatarUri;

    /**
     * @return The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted Web Demo integration.
     * 
     */
    public Output</* @Nullable */ String> getAvatarUri() {
        return this.avatarUri;
    }
    /**
     * The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * for a list of the currently supported language codes. This field cannot be updated after creation.
     * 
     */
    @Export(name="defaultLanguageCode", type=String.class, parameters={})
    private Output<String> defaultLanguageCode;

    /**
     * @return The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * for a list of the currently supported language codes. This field cannot be updated after creation.
     * 
     */
    public Output<String> getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }
    /**
     * The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the agent, unique within the location.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the agent, unique within the location.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    @Export(name="enableSpellCorrection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableSpellCorrection;

    /**
     * @return Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableSpellCorrection() {
        return this.enableSpellCorrection;
    }
    /**
     * Determines whether this agent should log conversation queries.
     * 
     */
    @Export(name="enableStackdriverLogging", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableStackdriverLogging;

    /**
     * @return Determines whether this agent should log conversation queries.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }
    /**
     * The name of the location this agent is located in.
     * > **Note:** The first time you are deploying an Agent in your project you must configure location settings.
     * This is a one time step but at the moment you can only [configure location settings](https://cloud.google.com/dialogflow/cx/docs/concept/region#location-settings) via the Dialogflow CX console.
     * Another options is to use global location so you don't need to manually configure location settings.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The name of the location this agent is located in.
     * > **Note:** The first time you are deploying an Agent in your project you must configure location settings.
     * This is a one time step but at the moment you can only [configure location settings](https://cloud.google.com/dialogflow/cx/docs/concept/region#location-settings) via the Dialogflow CX console.
     * Another options is to use global location so you don't need to manually configure location settings.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The unique identifier of the agent.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the agent.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Name of the SecuritySettings reference for the agent. Format: projects/<Project ID>/locations/<Location ID>/securitySettings/<Security Settings ID>.
     * 
     */
    @Export(name="securitySettings", type=String.class, parameters={})
    private Output</* @Nullable */ String> securitySettings;

    /**
     * @return Name of the SecuritySettings reference for the agent. Format: projects/<Project ID>/locations/<Location ID>/securitySettings/<Security Settings ID>.
     * 
     */
    public Output</* @Nullable */ String> getSecuritySettings() {
        return this.securitySettings;
    }
    /**
     * Settings related to speech recognition.
     * Structure is documented below.
     * 
     */
    @Export(name="speechToTextSettings", type=CxAgentSpeechToTextSettings.class, parameters={})
    private Output</* @Nullable */ CxAgentSpeechToTextSettings> speechToTextSettings;

    /**
     * @return Settings related to speech recognition.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ CxAgentSpeechToTextSettings> getSpeechToTextSettings() {
        return this.speechToTextSettings;
    }
    /**
     * Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only
     * be deleted by deleting the agent. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow
     * ID>.
     * 
     */
    @Export(name="startFlow", type=String.class, parameters={})
    private Output<String> startFlow;

    /**
     * @return Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only
     * be deleted by deleting the agent. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow
     * ID>.
     * 
     */
    public Output<String> getStartFlow() {
        return this.startFlow;
    }
    /**
     * The list of all languages supported by this agent (except for the default_language_code).
     * 
     */
    @Export(name="supportedLanguageCodes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> supportedLanguageCodes;

    /**
     * @return The list of all languages supported by this agent (except for the default_language_code).
     * 
     */
    public Output</* @Nullable */ List<String>> getSupportedLanguageCodes() {
        return this.supportedLanguageCodes;
    }
    /**
     * The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
     * Europe/Paris.
     * 
     */
    @Export(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
     * Europe/Paris.
     * 
     */
    public Output<String> getTimeZone() {
        return this.timeZone;
    }

    public interface BuilderApplicator {
        public void apply(CxAgentArgs.Builder a);
    }
    private static io.pulumi.gcp.diagflow.CxAgentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.diagflow.CxAgentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CxAgent(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CxAgent(String name) {
        this(name, CxAgentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CxAgent(String name, CxAgentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CxAgent(String name, CxAgentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxAgent:CxAgent", name, args == null ? CxAgentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private CxAgent(String name, Output<String> id, @Nullable CxAgentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxAgent:CxAgent", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CxAgent get(String name, Output<String> id, @Nullable CxAgentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CxAgent(name, id, state, options);
    }
}
