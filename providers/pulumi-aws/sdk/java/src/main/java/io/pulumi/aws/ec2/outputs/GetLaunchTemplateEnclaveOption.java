// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetLaunchTemplateEnclaveOption {
    /**
     * Whether Nitro Enclaves are enabled.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private GetLaunchTemplateEnclaveOption(@CustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether Nitro Enclaves are enabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateEnclaveOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateEnclaveOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GetLaunchTemplateEnclaveOption build() {
            return new GetLaunchTemplateEnclaveOption(enabled);
        }
    }
}
