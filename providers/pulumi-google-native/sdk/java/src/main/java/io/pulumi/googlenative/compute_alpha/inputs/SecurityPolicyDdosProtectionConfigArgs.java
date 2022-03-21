// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.SecurityPolicyDdosProtectionConfigDdosProtection;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyDdosProtectionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyDdosProtectionConfigArgs Empty = new SecurityPolicyDdosProtectionConfigArgs();

    @Import(name="ddosProtection")
      private final @Nullable Output<SecurityPolicyDdosProtectionConfigDdosProtection> ddosProtection;

    public Output<SecurityPolicyDdosProtectionConfigDdosProtection> getDdosProtection() {
        return this.ddosProtection == null ? Output.empty() : this.ddosProtection;
    }

    public SecurityPolicyDdosProtectionConfigArgs(@Nullable Output<SecurityPolicyDdosProtectionConfigDdosProtection> ddosProtection) {
        this.ddosProtection = ddosProtection;
    }

    private SecurityPolicyDdosProtectionConfigArgs() {
        this.ddosProtection = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyDdosProtectionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecurityPolicyDdosProtectionConfigDdosProtection> ddosProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyDdosProtectionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddosProtection = defaults.ddosProtection;
        }

        public Builder ddosProtection(@Nullable Output<SecurityPolicyDdosProtectionConfigDdosProtection> ddosProtection) {
            this.ddosProtection = ddosProtection;
            return this;
        }
        public Builder ddosProtection(@Nullable SecurityPolicyDdosProtectionConfigDdosProtection ddosProtection) {
            this.ddosProtection = Output.ofNullable(ddosProtection);
            return this;
        }        public SecurityPolicyDdosProtectionConfigArgs build() {
            return new SecurityPolicyDdosProtectionConfigArgs(ddosProtection);
        }
    }
}
