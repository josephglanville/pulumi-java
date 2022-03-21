// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LabelDescriptorResponse {
    /**
     * A human-readable description for the label.
     * 
     */
    private final String description;
    /**
     * The label key.
     * 
     */
    private final String key;
    /**
     * The type of data that can be assigned to the label.
     * 
     */
    private final String valueType;

    @CustomType.Constructor
    private LabelDescriptorResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("valueType") String valueType) {
        this.description = description;
        this.key = key;
        this.valueType = valueType;
    }

    /**
     * A human-readable description for the label.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The label key.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The type of data that can be assigned to the label.
     * 
    */
    public String getValueType() {
        return this.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String key;
        private String valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.key = defaults.key;
    	      this.valueType = defaults.valueType;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder valueType(String valueType) {
            this.valueType = Objects.requireNonNull(valueType);
            return this;
        }        public LabelDescriptorResponse build() {
            return new LabelDescriptorResponse(description, key, valueType);
        }
    }
}
