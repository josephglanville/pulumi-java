// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxAgentSpeechToTextSettingsGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxAgentState extends io.pulumi.resources.ResourceArgs {

    public static final CxAgentState Empty = new CxAgentState();

    /**
     * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted Web Demo integration.
     * 
     */
    @InputImport(name="avatarUri")
      private final @Nullable Input<String> avatarUri;

    public Input<String> getAvatarUri() {
        return this.avatarUri == null ? Input.empty() : this.avatarUri;
    }

    /**
     * The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * for a list of the currently supported language codes. This field cannot be updated after creation.
     * 
     */
    @InputImport(name="defaultLanguageCode")
      private final @Nullable Input<String> defaultLanguageCode;

    public Input<String> getDefaultLanguageCode() {
        return this.defaultLanguageCode == null ? Input.empty() : this.defaultLanguageCode;
    }

    /**
     * The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The human-readable name of the agent, unique within the location.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    @InputImport(name="enableSpellCorrection")
      private final @Nullable Input<Boolean> enableSpellCorrection;

    public Input<Boolean> getEnableSpellCorrection() {
        return this.enableSpellCorrection == null ? Input.empty() : this.enableSpellCorrection;
    }

    /**
     * Determines whether this agent should log conversation queries.
     * 
     */
    @InputImport(name="enableStackdriverLogging")
      private final @Nullable Input<Boolean> enableStackdriverLogging;

    public Input<Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Input.empty() : this.enableStackdriverLogging;
    }

    /**
     * The name of the location this agent is located in.
     * > **Note:** The first time you are deploying an Agent in your project you must configure location settings.
     * This is a one time step but at the moment you can only [configure location settings](https://cloud.google.com/dialogflow/cx/docs/concept/region#location-settings) via the Dialogflow CX console.
     * Another options is to use global location so you don't need to manually configure location settings.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The unique identifier of the agent.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Name of the SecuritySettings reference for the agent. Format: projects/<Project ID>/locations/<Location ID>/securitySettings/<Security Settings ID>.
     * 
     */
    @InputImport(name="securitySettings")
      private final @Nullable Input<String> securitySettings;

    public Input<String> getSecuritySettings() {
        return this.securitySettings == null ? Input.empty() : this.securitySettings;
    }

    /**
     * Settings related to speech recognition.
     * Structure is documented below.
     * 
     */
    @InputImport(name="speechToTextSettings")
      private final @Nullable Input<CxAgentSpeechToTextSettingsGetArgs> speechToTextSettings;

    public Input<CxAgentSpeechToTextSettingsGetArgs> getSpeechToTextSettings() {
        return this.speechToTextSettings == null ? Input.empty() : this.speechToTextSettings;
    }

    /**
     * Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only
     * be deleted by deleting the agent. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow
     * ID>.
     * 
     */
    @InputImport(name="startFlow")
      private final @Nullable Input<String> startFlow;

    public Input<String> getStartFlow() {
        return this.startFlow == null ? Input.empty() : this.startFlow;
    }

    /**
     * The list of all languages supported by this agent (except for the default_language_code).
     * 
     */
    @InputImport(name="supportedLanguageCodes")
      private final @Nullable Input<List<String>> supportedLanguageCodes;

    public Input<List<String>> getSupportedLanguageCodes() {
        return this.supportedLanguageCodes == null ? Input.empty() : this.supportedLanguageCodes;
    }

    /**
     * The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
     * Europe/Paris.
     * 
     */
    @InputImport(name="timeZone")
      private final @Nullable Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone == null ? Input.empty() : this.timeZone;
    }

    public CxAgentState(
        @Nullable Input<String> avatarUri,
        @Nullable Input<String> defaultLanguageCode,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> enableSpellCorrection,
        @Nullable Input<Boolean> enableStackdriverLogging,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> securitySettings,
        @Nullable Input<CxAgentSpeechToTextSettingsGetArgs> speechToTextSettings,
        @Nullable Input<String> startFlow,
        @Nullable Input<List<String>> supportedLanguageCodes,
        @Nullable Input<String> timeZone) {
        this.avatarUri = avatarUri;
        this.defaultLanguageCode = defaultLanguageCode;
        this.description = description;
        this.displayName = displayName;
        this.enableSpellCorrection = enableSpellCorrection;
        this.enableStackdriverLogging = enableStackdriverLogging;
        this.location = location;
        this.name = name;
        this.project = project;
        this.securitySettings = securitySettings;
        this.speechToTextSettings = speechToTextSettings;
        this.startFlow = startFlow;
        this.supportedLanguageCodes = supportedLanguageCodes;
        this.timeZone = timeZone;
    }

    private CxAgentState() {
        this.avatarUri = Input.empty();
        this.defaultLanguageCode = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.enableSpellCorrection = Input.empty();
        this.enableStackdriverLogging = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.securitySettings = Input.empty();
        this.speechToTextSettings = Input.empty();
        this.startFlow = Input.empty();
        this.supportedLanguageCodes = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxAgentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> avatarUri;
        private @Nullable Input<String> defaultLanguageCode;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> enableSpellCorrection;
        private @Nullable Input<Boolean> enableStackdriverLogging;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> securitySettings;
        private @Nullable Input<CxAgentSpeechToTextSettingsGetArgs> speechToTextSettings;
        private @Nullable Input<String> startFlow;
        private @Nullable Input<List<String>> supportedLanguageCodes;
        private @Nullable Input<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(CxAgentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.avatarUri = defaults.avatarUri;
    	      this.defaultLanguageCode = defaults.defaultLanguageCode;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enableSpellCorrection = defaults.enableSpellCorrection;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.securitySettings = defaults.securitySettings;
    	      this.speechToTextSettings = defaults.speechToTextSettings;
    	      this.startFlow = defaults.startFlow;
    	      this.supportedLanguageCodes = defaults.supportedLanguageCodes;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setAvatarUri(@Nullable Input<String> avatarUri) {
            this.avatarUri = avatarUri;
            return this;
        }

        public Builder setAvatarUri(@Nullable String avatarUri) {
            this.avatarUri = Input.ofNullable(avatarUri);
            return this;
        }

        public Builder setDefaultLanguageCode(@Nullable Input<String> defaultLanguageCode) {
            this.defaultLanguageCode = defaultLanguageCode;
            return this;
        }

        public Builder setDefaultLanguageCode(@Nullable String defaultLanguageCode) {
            this.defaultLanguageCode = Input.ofNullable(defaultLanguageCode);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEnableSpellCorrection(@Nullable Input<Boolean> enableSpellCorrection) {
            this.enableSpellCorrection = enableSpellCorrection;
            return this;
        }

        public Builder setEnableSpellCorrection(@Nullable Boolean enableSpellCorrection) {
            this.enableSpellCorrection = Input.ofNullable(enableSpellCorrection);
            return this;
        }

        public Builder setEnableStackdriverLogging(@Nullable Input<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        public Builder setEnableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Input.ofNullable(enableStackdriverLogging);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSecuritySettings(@Nullable Input<String> securitySettings) {
            this.securitySettings = securitySettings;
            return this;
        }

        public Builder setSecuritySettings(@Nullable String securitySettings) {
            this.securitySettings = Input.ofNullable(securitySettings);
            return this;
        }

        public Builder setSpeechToTextSettings(@Nullable Input<CxAgentSpeechToTextSettingsGetArgs> speechToTextSettings) {
            this.speechToTextSettings = speechToTextSettings;
            return this;
        }

        public Builder setSpeechToTextSettings(@Nullable CxAgentSpeechToTextSettingsGetArgs speechToTextSettings) {
            this.speechToTextSettings = Input.ofNullable(speechToTextSettings);
            return this;
        }

        public Builder setStartFlow(@Nullable Input<String> startFlow) {
            this.startFlow = startFlow;
            return this;
        }

        public Builder setStartFlow(@Nullable String startFlow) {
            this.startFlow = Input.ofNullable(startFlow);
            return this;
        }

        public Builder setSupportedLanguageCodes(@Nullable Input<List<String>> supportedLanguageCodes) {
            this.supportedLanguageCodes = supportedLanguageCodes;
            return this;
        }

        public Builder setSupportedLanguageCodes(@Nullable List<String> supportedLanguageCodes) {
            this.supportedLanguageCodes = Input.ofNullable(supportedLanguageCodes);
            return this;
        }

        public Builder setTimeZone(@Nullable Input<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = Input.ofNullable(timeZone);
            return this;
        }
        public CxAgentState build() {
            return new CxAgentState(avatarUri, defaultLanguageCode, description, displayName, enableSpellCorrection, enableStackdriverLogging, location, name, project, securitySettings, speechToTextSettings, startFlow, supportedLanguageCodes, timeZone);
        }
    }
}
