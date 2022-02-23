// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The properties of an enrichment that your IoT hub applies to messages delivered to endpoints.
 * 
 */
public final class EnrichmentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnrichmentPropertiesArgs Empty = new EnrichmentPropertiesArgs();

    /**
     * The list of endpoints for which the enrichment is applied to the message.
     * 
     */
    @InputImport(name="endpointNames", required=true)
      private final Input<List<String>> endpointNames;

    public Input<List<String>> getEndpointNames() {
        return this.endpointNames;
    }

    /**
     * The key or name for the enrichment property.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * The value for the enrichment property.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public EnrichmentPropertiesArgs(
        Input<List<String>> endpointNames,
        Input<String> key,
        Input<String> value) {
        this.endpointNames = Objects.requireNonNull(endpointNames, "expected parameter 'endpointNames' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private EnrichmentPropertiesArgs() {
        this.endpointNames = Input.empty();
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnrichmentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> endpointNames;
        private Input<String> key;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnrichmentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointNames = defaults.endpointNames;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setEndpointNames(Input<List<String>> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }

        public Builder setEndpointNames(List<String> endpointNames) {
            this.endpointNames = Input.of(Objects.requireNonNull(endpointNames));
            return this;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public EnrichmentPropertiesArgs build() {
            return new EnrichmentPropertiesArgs(endpointNames, key, value);
        }
    }
}
