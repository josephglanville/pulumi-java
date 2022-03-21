// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeploymentUpdateLabelEntryResponse {
    /**
     * Key of the label
     * 
     */
    private final String key;
    /**
     * Value of the label
     * 
     */
    private final String value;

    @CustomType.Constructor
    private DeploymentUpdateLabelEntryResponse(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Key of the label
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Value of the label
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentUpdateLabelEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentUpdateLabelEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public DeploymentUpdateLabelEntryResponse build() {
            return new DeploymentUpdateLabelEntryResponse(key, value);
        }
    }
}
