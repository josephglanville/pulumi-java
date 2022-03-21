// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SlotTypeEnumerationValue {
    /**
     * Additional values related to the slot type value. Each item must be less than or equal to 140 characters in length.
     * 
     */
    private final @Nullable List<String> synonyms;
    /**
     * The value of the slot type. Must be less than or equal to 140 characters in length.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private SlotTypeEnumerationValue(
        @CustomType.Parameter("synonyms") @Nullable List<String> synonyms,
        @CustomType.Parameter("value") String value) {
        this.synonyms = synonyms;
        this.value = value;
    }

    /**
     * Additional values related to the slot type value. Each item must be less than or equal to 140 characters in length.
     * 
    */
    public List<String> getSynonyms() {
        return this.synonyms == null ? List.of() : this.synonyms;
    }
    /**
     * The value of the slot type. Must be less than or equal to 140 characters in length.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlotTypeEnumerationValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> synonyms;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SlotTypeEnumerationValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
        }

        public Builder synonyms(@Nullable List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public SlotTypeEnumerationValue build() {
            return new SlotTypeEnumerationValue(synonyms, value);
        }
    }
}
