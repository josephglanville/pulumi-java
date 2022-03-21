// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxEntityTypeEntityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxEntityTypeEntityArgs Empty = new CxEntityTypeEntityArgs();

    /**
     * A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym could be green onions.
     * For KIND_LIST entity types: This collection must contain exactly one synonym equal to value.
     * 
     */
    @Import(name="synonyms")
      private final @Nullable Output<List<String>> synonyms;

    public Output<List<String>> getSynonyms() {
        return this.synonyms == null ? Output.empty() : this.synonyms;
    }

    /**
     * The word or phrase to be excluded.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public CxEntityTypeEntityArgs(
        @Nullable Output<List<String>> synonyms,
        @Nullable Output<String> value) {
        this.synonyms = synonyms;
        this.value = value;
    }

    private CxEntityTypeEntityArgs() {
        this.synonyms = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxEntityTypeEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> synonyms;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CxEntityTypeEntityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
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
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }        public CxEntityTypeEntityArgs build() {
            return new CxEntityTypeEntityArgs(synonyms, value);
        }
    }
}
