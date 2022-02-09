// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EnrichmentPropertiesResponse {
    private final List<String> endpointNames;
    private final String key;
    private final String value;

    @OutputCustomType.Constructor({"endpointNames","key","value"})
    private EnrichmentPropertiesResponse(
        List<String> endpointNames,
        String key,
        String value) {
        this.endpointNames = Objects.requireNonNull(endpointNames);
        this.key = Objects.requireNonNull(key);
        this.value = Objects.requireNonNull(value);
    }

    public List<String> getEndpointNames() {
        return this.endpointNames;
    }
    public String getKey() {
        return this.key;
    }
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

        public Builder setEndpointNames(List<String> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public EnrichmentPropertiesResponse build() {
            return new EnrichmentPropertiesResponse(endpointNames, key, value);
        }
    }
}
