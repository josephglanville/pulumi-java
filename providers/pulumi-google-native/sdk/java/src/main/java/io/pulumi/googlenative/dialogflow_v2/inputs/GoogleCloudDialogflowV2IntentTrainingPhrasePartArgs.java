// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a part of a training phrase.
 * 
 */
public final class GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs Empty = new GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs();

    /**
     * Optional. The parameter name for the value extracted from the annotated part of the example. This field is required for annotated parts of the training phrase.
     * 
     */
    @Import(name="alias")
      private final @Nullable Output<String> alias;

    public Output<String> getAlias() {
        return this.alias == null ? Output.empty() : this.alias;
    }

    /**
     * Optional. The entity type name prefixed with `@`. This field is required for annotated parts of the training phrase.
     * 
     */
    @Import(name="entityType")
      private final @Nullable Output<String> entityType;

    public Output<String> getEntityType() {
        return this.entityType == null ? Output.empty() : this.entityType;
    }

    /**
     * The text for this part.
     * 
     */
    @Import(name="text", required=true)
      private final Output<String> text;

    public Output<String> getText() {
        return this.text;
    }

    /**
     * Optional. Indicates whether the text was manually annotated. This field is set to true when the Dialogflow Console is used to manually annotate the part. When creating an annotated part with the API, you must set this to true.
     * 
     */
    @Import(name="userDefined")
      private final @Nullable Output<Boolean> userDefined;

    public Output<Boolean> getUserDefined() {
        return this.userDefined == null ? Output.empty() : this.userDefined;
    }

    public GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs(
        @Nullable Output<String> alias,
        @Nullable Output<String> entityType,
        Output<String> text,
        @Nullable Output<Boolean> userDefined) {
        this.alias = alias;
        this.entityType = entityType;
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
        this.userDefined = userDefined;
    }

    private GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs() {
        this.alias = Output.empty();
        this.entityType = Output.empty();
        this.text = Output.empty();
        this.userDefined = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alias;
        private @Nullable Output<String> entityType;
        private Output<String> text;
        private @Nullable Output<Boolean> userDefined;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.entityType = defaults.entityType;
    	      this.text = defaults.text;
    	      this.userDefined = defaults.userDefined;
        }

        public Builder alias(@Nullable Output<String> alias) {
            this.alias = alias;
            return this;
        }
        public Builder alias(@Nullable String alias) {
            this.alias = Output.ofNullable(alias);
            return this;
        }
        public Builder entityType(@Nullable Output<String> entityType) {
            this.entityType = entityType;
            return this;
        }
        public Builder entityType(@Nullable String entityType) {
            this.entityType = Output.ofNullable(entityType);
            return this;
        }
        public Builder text(Output<String> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public Builder text(String text) {
            this.text = Output.of(Objects.requireNonNull(text));
            return this;
        }
        public Builder userDefined(@Nullable Output<Boolean> userDefined) {
            this.userDefined = userDefined;
            return this;
        }
        public Builder userDefined(@Nullable Boolean userDefined) {
            this.userDefined = Output.ofNullable(userDefined);
            return this;
        }        public GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs build() {
            return new GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs(alias, entityType, text, userDefined);
        }
    }
}
