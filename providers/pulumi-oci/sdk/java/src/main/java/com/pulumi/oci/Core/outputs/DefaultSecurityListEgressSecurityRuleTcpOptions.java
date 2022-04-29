// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRange;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DefaultSecurityListEgressSecurityRuleTcpOptions {
    private final @Nullable Integer max;
    private final @Nullable Integer min;
    private final @Nullable DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRange sourcePortRange;

    @CustomType.Constructor
    private DefaultSecurityListEgressSecurityRuleTcpOptions(
        @CustomType.Parameter("max") @Nullable Integer max,
        @CustomType.Parameter("min") @Nullable Integer min,
        @CustomType.Parameter("sourcePortRange") @Nullable DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRange sourcePortRange) {
        this.max = max;
        this.min = min;
        this.sourcePortRange = sourcePortRange;
    }

    public Optional<Integer> max() {
        return Optional.ofNullable(this.max);
    }
    public Optional<Integer> min() {
        return Optional.ofNullable(this.min);
    }
    public Optional<DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRange> sourcePortRange() {
        return Optional.ofNullable(this.sourcePortRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSecurityListEgressSecurityRuleTcpOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer max;
        private @Nullable Integer min;
        private @Nullable DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRange sourcePortRange;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSecurityListEgressSecurityRuleTcpOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
    	      this.sourcePortRange = defaults.sourcePortRange;
        }

        public Builder max(@Nullable Integer max) {
            this.max = max;
            return this;
        }
        public Builder min(@Nullable Integer min) {
            this.min = min;
            return this;
        }
        public Builder sourcePortRange(@Nullable DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRange sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }        public DefaultSecurityListEgressSecurityRuleTcpOptions build() {
            return new DefaultSecurityListEgressSecurityRuleTcpOptions(max, min, sourcePortRange);
        }
    }
}
