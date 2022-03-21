// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TopologySelectorLabelRequirement {
    /**
     * The label key that the selector applies to.
     * 
     */
    private final String key;
    /**
     * An array of string values. One value must match the label to be selected. Each entry in Values is ORed.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private TopologySelectorLabelRequirement(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("values") List<String> values) {
        this.key = key;
        this.values = values;
    }

    /**
     * The label key that the selector applies to.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * An array of string values. One value must match the label to be selected. Each entry in Values is ORed.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopologySelectorLabelRequirement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(TopologySelectorLabelRequirement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public TopologySelectorLabelRequirement build() {
            return new TopologySelectorLabelRequirement(key, values);
        }
    }
}
