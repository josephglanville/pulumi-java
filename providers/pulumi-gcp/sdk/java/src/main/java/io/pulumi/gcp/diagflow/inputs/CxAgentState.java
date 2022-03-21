// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="avatarUri")
      private final @Nullable Output<String> avatarUri;

    public Output<String> getAvatarUri() {
        return this.avatarUri == null ? Output.empty() : this.avatarUri;
    }

    /**
     * The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * for a list of the currently supported language codes. This field cannot be updated after creation.
     * 
     */
    @Import(name="defaultLanguageCode")
      private final @Nullable Output<String> defaultLanguageCode;

    public Output<String> getDefaultLanguageCode() {
        return this.defaultLanguageCode == null ? Output.empty() : this.defaultLanguageCode;
    }

    /**
     * The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The human-readable name of the agent, unique within the location.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    @Import(name="enableSpellCorrection")
      private final @Nullable Output<Boolean> enableSpellCorrection;

    public Output<Boolean> getEnableSpellCorrection() {
        return this.enableSpellCorrection == null ? Output.empty() : this.enableSpellCorrection;
    }

    /**
     * Determines whether this agent should log conversation queries.
     * 
     */
    @Import(name="enableStackdriverLogging")
      private final @Nullable Output<Boolean> enableStackdriverLogging;

    public Output<Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Output.empty() : this.enableStackdriverLogging;
    }

    /**
     * The name of the location this agent is located in.
     * > **Note:** The first time you are deploying an Agent in your project you must configure location settings.
     * This is a one time step but at the moment you can only [configure location settings](https://cloud.google.com/dialogflow/cx/docs/concept/region#location-settings) via the Dialogflow CX console.
     * Another options is to use global location so you don't need to manually configure location settings.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The unique identifier of the agent.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Name of the SecuritySettings reference for the agent. Format: projects/<Project ID>/locations/<Location ID>/securitySettings/<Security Settings ID>.
     * 
     */
    @Import(name="securitySettings")
      private final @Nullable Output<String> securitySettings;

    public Output<String> getSecuritySettings() {
        return this.securitySettings == null ? Output.empty() : this.securitySettings;
    }

    /**
     * Settings related to speech recognition.
     * Structure is documented below.
     * 
     */
    @Import(name="speechToTextSettings")
      private final @Nullable Output<CxAgentSpeechToTextSettingsGetArgs> speechToTextSettings;

    public Output<CxAgentSpeechToTextSettingsGetArgs> getSpeechToTextSettings() {
        return this.speechToTextSettings == null ? Output.empty() : this.speechToTextSettings;
    }

    /**
     * Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only
     * be deleted by deleting the agent. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow
     * ID>.
     * 
     */
    @Import(name="startFlow")
      private final @Nullable Output<String> startFlow;

    public Output<String> getStartFlow() {
        return this.startFlow == null ? Output.empty() : this.startFlow;
    }

    /**
     * The list of all languages supported by this agent (except for the default_language_code).
     * 
     */
    @Import(name="supportedLanguageCodes")
      private final @Nullable Output<List<String>> supportedLanguageCodes;

    public Output<List<String>> getSupportedLanguageCodes() {
        return this.supportedLanguageCodes == null ? Output.empty() : this.supportedLanguageCodes;
    }

    /**
     * The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
     * Europe/Paris.
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Output.empty() : this.timeZone;
    }

    public CxAgentState(
        @Nullable Output<String> avatarUri,
        @Nullable Output<String> defaultLanguageCode,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<Boolean> enableSpellCorrection,
        @Nullable Output<Boolean> enableStackdriverLogging,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> securitySettings,
        @Nullable Output<CxAgentSpeechToTextSettingsGetArgs> speechToTextSettings,
        @Nullable Output<String> startFlow,
        @Nullable Output<List<String>> supportedLanguageCodes,
        @Nullable Output<String> timeZone) {
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
        this.avatarUri = Output.empty();
        this.defaultLanguageCode = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.enableSpellCorrection = Output.empty();
        this.enableStackdriverLogging = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.securitySettings = Output.empty();
        this.speechToTextSettings = Output.empty();
        this.startFlow = Output.empty();
        this.supportedLanguageCodes = Output.empty();
        this.timeZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxAgentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> avatarUri;
        private @Nullable Output<String> defaultLanguageCode;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Boolean> enableSpellCorrection;
        private @Nullable Output<Boolean> enableStackdriverLogging;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> securitySettings;
        private @Nullable Output<CxAgentSpeechToTextSettingsGetArgs> speechToTextSettings;
        private @Nullable Output<String> startFlow;
        private @Nullable Output<List<String>> supportedLanguageCodes;
        private @Nullable Output<String> timeZone;

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

        public Builder avatarUri(@Nullable Output<String> avatarUri) {
            this.avatarUri = avatarUri;
            return this;
        }
        public Builder avatarUri(@Nullable String avatarUri) {
            this.avatarUri = Output.ofNullable(avatarUri);
            return this;
        }
        public Builder defaultLanguageCode(@Nullable Output<String> defaultLanguageCode) {
            this.defaultLanguageCode = defaultLanguageCode;
            return this;
        }
        public Builder defaultLanguageCode(@Nullable String defaultLanguageCode) {
            this.defaultLanguageCode = Output.ofNullable(defaultLanguageCode);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder enableSpellCorrection(@Nullable Output<Boolean> enableSpellCorrection) {
            this.enableSpellCorrection = enableSpellCorrection;
            return this;
        }
        public Builder enableSpellCorrection(@Nullable Boolean enableSpellCorrection) {
            this.enableSpellCorrection = Output.ofNullable(enableSpellCorrection);
            return this;
        }
        public Builder enableStackdriverLogging(@Nullable Output<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }
        public Builder enableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Output.ofNullable(enableStackdriverLogging);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder securitySettings(@Nullable Output<String> securitySettings) {
            this.securitySettings = securitySettings;
            return this;
        }
        public Builder securitySettings(@Nullable String securitySettings) {
            this.securitySettings = Output.ofNullable(securitySettings);
            return this;
        }
        public Builder speechToTextSettings(@Nullable Output<CxAgentSpeechToTextSettingsGetArgs> speechToTextSettings) {
            this.speechToTextSettings = speechToTextSettings;
            return this;
        }
        public Builder speechToTextSettings(@Nullable CxAgentSpeechToTextSettingsGetArgs speechToTextSettings) {
            this.speechToTextSettings = Output.ofNullable(speechToTextSettings);
            return this;
        }
        public Builder startFlow(@Nullable Output<String> startFlow) {
            this.startFlow = startFlow;
            return this;
        }
        public Builder startFlow(@Nullable String startFlow) {
            this.startFlow = Output.ofNullable(startFlow);
            return this;
        }
        public Builder supportedLanguageCodes(@Nullable Output<List<String>> supportedLanguageCodes) {
            this.supportedLanguageCodes = supportedLanguageCodes;
            return this;
        }
        public Builder supportedLanguageCodes(@Nullable List<String> supportedLanguageCodes) {
            this.supportedLanguageCodes = Output.ofNullable(supportedLanguageCodes);
            return this;
        }
        public Builder supportedLanguageCodes(String... supportedLanguageCodes) {
            return supportedLanguageCodes(List.of(supportedLanguageCodes));
        }
        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Output.ofNullable(timeZone);
            return this;
        }        public CxAgentState build() {
            return new CxAgentState(avatarUri, defaultLanguageCode, description, displayName, enableSpellCorrection, enableStackdriverLogging, location, name, project, securitySettings, speechToTextSettings, startFlow, supportedLanguageCodes, timeZone);
        }
    }
}
