// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxIntentParameterGetArgs;
import io.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhraseGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxIntentState extends io.pulumi.resources.ResourceArgs {

    public static final CxIntentState Empty = new CxIntentState();

    /**
     * Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The human-readable name of the intent, unique within the agent.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation.
     * Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    @InputImport(name="isFallback")
      private final @Nullable Input<Boolean> isFallback;

    public Input<Boolean> getIsFallback() {
        return this.isFallback == null ? Input.empty() : this.isFallback;
    }

    /**
     * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols '-' and '_'. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes.
     * Prefix "sys-" is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. "sys-head" means the intent is a head intent. "sys.contextual" means the intent is a contextual intent.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The language of the following fields in intent:
     * Intent.training_phrases.parts.text
     * If not specified, the agent's default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @InputImport(name="languageCode")
      private final @Nullable Input<String> languageCode;

    public Input<String> getLanguageCode() {
        return this.languageCode == null ? Input.empty() : this.languageCode;
    }

    /**
     * The unique identifier of the intent. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent
     * ID>/intents/<Intent ID>.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The collection of parameters associated with the intent.
     * Structure is documented below.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<CxIntentParameterGetArgs>> parameters;

    public Input<List<CxIntentParameterGetArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The agent to create an intent for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>.
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * The priority of this intent. Higher numbers represent higher priorities.
     * If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the Normal priority in the console.
     * If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The collection of training phrases the agent is trained on to identify the intent.
     * Structure is documented below.
     * 
     */
    @InputImport(name="trainingPhrases")
      private final @Nullable Input<List<CxIntentTrainingPhraseGetArgs>> trainingPhrases;

    public Input<List<CxIntentTrainingPhraseGetArgs>> getTrainingPhrases() {
        return this.trainingPhrases == null ? Input.empty() : this.trainingPhrases;
    }

    public CxIntentState(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> isFallback,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> languageCode,
        @Nullable Input<String> name,
        @Nullable Input<List<CxIntentParameterGetArgs>> parameters,
        @Nullable Input<String> parent,
        @Nullable Input<Integer> priority,
        @Nullable Input<List<CxIntentTrainingPhraseGetArgs>> trainingPhrases) {
        this.description = description;
        this.displayName = displayName;
        this.isFallback = isFallback;
        this.labels = labels;
        this.languageCode = languageCode;
        this.name = name;
        this.parameters = parameters;
        this.parent = parent;
        this.priority = priority;
        this.trainingPhrases = trainingPhrases;
    }

    private CxIntentState() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.isFallback = Input.empty();
        this.labels = Input.empty();
        this.languageCode = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.parent = Input.empty();
        this.priority = Input.empty();
        this.trainingPhrases = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxIntentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> isFallback;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> languageCode;
        private @Nullable Input<String> name;
        private @Nullable Input<List<CxIntentParameterGetArgs>> parameters;
        private @Nullable Input<String> parent;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<List<CxIntentTrainingPhraseGetArgs>> trainingPhrases;

        public Builder() {
    	      // Empty
        }

        public Builder(CxIntentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isFallback = defaults.isFallback;
    	      this.labels = defaults.labels;
    	      this.languageCode = defaults.languageCode;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.parent = defaults.parent;
    	      this.priority = defaults.priority;
    	      this.trainingPhrases = defaults.trainingPhrases;
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

        public Builder setIsFallback(@Nullable Input<Boolean> isFallback) {
            this.isFallback = isFallback;
            return this;
        }

        public Builder setIsFallback(@Nullable Boolean isFallback) {
            this.isFallback = Input.ofNullable(isFallback);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLanguageCode(@Nullable Input<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder setLanguageCode(@Nullable String languageCode) {
            this.languageCode = Input.ofNullable(languageCode);
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

        public Builder setParameters(@Nullable Input<List<CxIntentParameterGetArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<CxIntentParameterGetArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setTrainingPhrases(@Nullable Input<List<CxIntentTrainingPhraseGetArgs>> trainingPhrases) {
            this.trainingPhrases = trainingPhrases;
            return this;
        }

        public Builder setTrainingPhrases(@Nullable List<CxIntentTrainingPhraseGetArgs> trainingPhrases) {
            this.trainingPhrases = Input.ofNullable(trainingPhrases);
            return this;
        }
        public CxIntentState build() {
            return new CxIntentState(description, displayName, isFallback, labels, languageCode, name, parameters, parent, priority, trainingPhrases);
        }
    }
}
