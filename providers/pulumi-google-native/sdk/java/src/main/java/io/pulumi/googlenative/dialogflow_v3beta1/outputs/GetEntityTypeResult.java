// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEntityTypeResult {
    /**
     * Indicates whether the entity type can be automatically expanded.
     * 
     */
    private final String autoExpansionMode;
    /**
     * The human-readable name of the entity type, unique within the agent.
     * 
     */
    private final String displayName;
    /**
     * Enables fuzzy entity extraction during classification.
     * 
     */
    private final Boolean enableFuzzyExtraction;
    /**
     * The collection of entity entries associated with the entity type.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse> entities;
    /**
     * Collection of exceptional words and phrases that shouldn't be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse> excludedPhrases;
    /**
     * Indicates the kind of entity type.
     * 
     */
    private final String kind;
    /**
     * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
     * 
     */
    private final String name;
    /**
     * Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name during logging.
     * 
     */
    private final Boolean redact;

    @CustomType.Constructor
    private GetEntityTypeResult(
        @CustomType.Parameter("autoExpansionMode") String autoExpansionMode,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("enableFuzzyExtraction") Boolean enableFuzzyExtraction,
        @CustomType.Parameter("entities") List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse> entities,
        @CustomType.Parameter("excludedPhrases") List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse> excludedPhrases,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("redact") Boolean redact) {
        this.autoExpansionMode = autoExpansionMode;
        this.displayName = displayName;
        this.enableFuzzyExtraction = enableFuzzyExtraction;
        this.entities = entities;
        this.excludedPhrases = excludedPhrases;
        this.kind = kind;
        this.name = name;
        this.redact = redact;
    }

    /**
     * Indicates whether the entity type can be automatically expanded.
     * 
    */
    public String getAutoExpansionMode() {
        return this.autoExpansionMode;
    }
    /**
     * The human-readable name of the entity type, unique within the agent.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Enables fuzzy entity extraction during classification.
     * 
    */
    public Boolean getEnableFuzzyExtraction() {
        return this.enableFuzzyExtraction;
    }
    /**
     * The collection of entity entries associated with the entity type.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse> getEntities() {
        return this.entities;
    }
    /**
     * Collection of exceptional words and phrases that shouldn't be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse> getExcludedPhrases() {
        return this.excludedPhrases;
    }
    /**
     * Indicates the kind of entity type.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name during logging.
     * 
    */
    public Boolean getRedact() {
        return this.redact;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntityTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoExpansionMode;
        private String displayName;
        private Boolean enableFuzzyExtraction;
        private List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse> entities;
        private List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse> excludedPhrases;
        private String kind;
        private String name;
        private Boolean redact;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntityTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoExpansionMode = defaults.autoExpansionMode;
    	      this.displayName = defaults.displayName;
    	      this.enableFuzzyExtraction = defaults.enableFuzzyExtraction;
    	      this.entities = defaults.entities;
    	      this.excludedPhrases = defaults.excludedPhrases;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.redact = defaults.redact;
        }

        public Builder autoExpansionMode(String autoExpansionMode) {
            this.autoExpansionMode = Objects.requireNonNull(autoExpansionMode);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder enableFuzzyExtraction(Boolean enableFuzzyExtraction) {
            this.enableFuzzyExtraction = Objects.requireNonNull(enableFuzzyExtraction);
            return this;
        }
        public Builder entities(List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse> entities) {
            this.entities = Objects.requireNonNull(entities);
            return this;
        }
        public Builder entities(GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse... entities) {
            return entities(List.of(entities));
        }
        public Builder excludedPhrases(List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse> excludedPhrases) {
            this.excludedPhrases = Objects.requireNonNull(excludedPhrases);
            return this;
        }
        public Builder excludedPhrases(GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse... excludedPhrases) {
            return excludedPhrases(List.of(excludedPhrases));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder redact(Boolean redact) {
            this.redact = Objects.requireNonNull(redact);
            return this;
        }        public GetEntityTypeResult build() {
            return new GetEntityTypeResult(autoExpansionMode, displayName, enableFuzzyExtraction, entities, excludedPhrases, kind, name, redact);
        }
    }
}
