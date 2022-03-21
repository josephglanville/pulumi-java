// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EntityTypeEntityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntityTypeEntityGetArgs Empty = new EntityTypeEntityGetArgs();

    /**
     * A collection of value synonyms. For example, if the entity type is vegetable, and value is scallions, a synonym
     * could be green onions.
     * For KIND_LIST entity types:
     * * This collection must contain exactly one synonym equal to value.
     * 
     */
    @Import(name="synonyms", required=true)
      private final Output<List<String>> synonyms;

    public Output<List<String>> getSynonyms() {
        return this.synonyms;
    }

    /**
     * The primary value associated with this entity entry. For example, if the entity type is vegetable, the value
     * could be scallions.
     * For KIND_MAP entity types:
     * * A reference value to be used in place of synonyms.
     *   For KIND_LIST entity types:
     * * A string that can contain references to other entity types (with or without aliases).
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public EntityTypeEntityGetArgs(
        Output<List<String>> synonyms,
        Output<String> value) {
        this.synonyms = Objects.requireNonNull(synonyms, "expected parameter 'synonyms' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private EntityTypeEntityGetArgs() {
        this.synonyms = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityTypeEntityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> synonyms;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityTypeEntityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
        }

        public Builder synonyms(Output<List<String>> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }
        public Builder synonyms(List<String> synonyms) {
            this.synonyms = Output.of(Objects.requireNonNull(synonyms));
            return this;
        }
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public EntityTypeEntityGetArgs build() {
            return new EntityTypeEntityGetArgs(synonyms, value);
        }
    }
}
