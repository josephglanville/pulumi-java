// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EnrichmentPropertiesResponse {
    /**
     * The list of endpoints for which the enrichment is applied to the message.
     * 
     */
    private final List<String> endpointNames;
    /**
     * The key or name for the enrichment property.
     * 
     */
    private final String key;
    /**
     * The value for the enrichment property.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private EnrichmentPropertiesResponse(
        @CustomType.Parameter("endpointNames") List<String> endpointNames,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.endpointNames = endpointNames;
        this.key = key;
        this.value = value;
    }

    /**
     * The list of endpoints for which the enrichment is applied to the message.
     * 
    */
    public List<String> getEndpointNames() {
        return this.endpointNames;
    }
    /**
     * The key or name for the enrichment property.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The value for the enrichment property.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnrichmentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> endpointNames;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnrichmentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointNames = defaults.endpointNames;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder endpointNames(List<String> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }
        public Builder endpointNames(String... endpointNames) {
            return endpointNames(List.of(endpointNames));
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public EnrichmentPropertiesResponse build() {
            return new EnrichmentPropertiesResponse(endpointNames, key, value);
        }
    }
}
