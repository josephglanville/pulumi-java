// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional info about the select item for when it is triggered in a dialog.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs();

    /**
     * A unique key that will be sent back to the agent if this response is given.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Optional. A list of synonyms that can also be used to trigger this item in dialog.
     * 
     */
    @Import(name="synonyms")
      private final @Nullable Output<List<String>> synonyms;

    public Output<List<String>> getSynonyms() {
        return this.synonyms == null ? Output.empty() : this.synonyms;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs(
        Output<String> key,
        @Nullable Output<List<String>> synonyms) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.synonyms = synonyms;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs() {
        this.key = Output.empty();
        this.synonyms = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private @Nullable Output<List<String>> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.synonyms = defaults.synonyms;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder synonyms(@Nullable Output<List<String>> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public Builder synonyms(@Nullable List<String> synonyms) {
            this.synonyms = Output.ofNullable(synonyms);
            return this;
        }
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }        public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoArgs(key, synonyms);
        }
    }
}
