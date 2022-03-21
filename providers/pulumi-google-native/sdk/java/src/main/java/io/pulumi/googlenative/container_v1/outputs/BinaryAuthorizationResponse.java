// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class BinaryAuthorizationResponse {
    /**
     * Enable Binary Authorization for this cluster. If enabled, all container images will be validated by Binary Authorization.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private BinaryAuthorizationResponse(@CustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Enable Binary Authorization for this cluster. If enabled, all container images will be validated by Binary Authorization.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BinaryAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BinaryAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public BinaryAuthorizationResponse build() {
            return new BinaryAuthorizationResponse(enabled);
        }
    }
}
