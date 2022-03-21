// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a part of a training phrase.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse Empty = new GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse();

    /**
     * Optional. The parameter name for the value extracted from the annotated part of the example. This field is required for annotated parts of the training phrase.
     * 
     */
    @Import(name="alias", required=true)
      private final String alias;

    public String getAlias() {
        return this.alias;
    }

    /**
     * Optional. The entity type name prefixed with `@`. This field is required for annotated parts of the training phrase.
     * 
     */
    @Import(name="entityType", required=true)
      private final String entityType;

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * The text for this part.
     * 
     */
    @Import(name="text", required=true)
      private final String text;

    public String getText() {
        return this.text;
    }

    /**
     * Optional. Indicates whether the text was manually annotated. This field is set to true when the Dialogflow Console is used to manually annotate the part. When creating an annotated part with the API, you must set this to true.
     * 
     */
    @Import(name="userDefined", required=true)
      private final Boolean userDefined;

    public Boolean getUserDefined() {
        return this.userDefined;
    }

    public GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse(
        String alias,
        String entityType,
        String text,
        Boolean userDefined) {
        this.alias = Objects.requireNonNull(alias, "expected parameter 'alias' to be non-null");
        this.entityType = Objects.requireNonNull(entityType, "expected parameter 'entityType' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
        this.userDefined = Objects.requireNonNull(userDefined, "expected parameter 'userDefined' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse() {
        this.alias = null;
        this.entityType = null;
        this.text = null;
        this.userDefined = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alias;
        private String entityType;
        private String text;
        private Boolean userDefined;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.entityType = defaults.entityType;
    	      this.text = defaults.text;
    	      this.userDefined = defaults.userDefined;
        }

        public Builder alias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }
        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public Builder userDefined(Boolean userDefined) {
            this.userDefined = Objects.requireNonNull(userDefined);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartResponse(alias, entityType, text, userDefined);
        }
    }
}
