// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecurityPolicyDdosProtectionConfigResponse {
    private final String ddosProtection;

    @CustomType.Constructor
    private SecurityPolicyDdosProtectionConfigResponse(@CustomType.Parameter("ddosProtection") String ddosProtection) {
        this.ddosProtection = ddosProtection;
    }

    public String getDdosProtection() {
        return this.ddosProtection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyDdosProtectionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ddosProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyDdosProtectionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddosProtection = defaults.ddosProtection;
        }

        public Builder ddosProtection(String ddosProtection) {
            this.ddosProtection = Objects.requireNonNull(ddosProtection);
            return this;
        }        public SecurityPolicyDdosProtectionConfigResponse build() {
            return new SecurityPolicyDdosProtectionConfigResponse(ddosProtection);
        }
    }
}
