// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VpnNatRuleMappingResponse {
    private final @Nullable String addressSpace;

    @OutputCustomType.Constructor({"addressSpace"})
    private VpnNatRuleMappingResponse(@Nullable String addressSpace) {
        this.addressSpace = addressSpace;
    }

    public Optional<String> getAddressSpace() {
        return Optional.ofNullable(this.addressSpace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnNatRuleMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressSpace;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnNatRuleMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressSpace = defaults.addressSpace;
        }

        public Builder setAddressSpace(@Nullable String addressSpace) {
            this.addressSpace = addressSpace;
            return this;
        }

        public VpnNatRuleMappingResponse build() {
            return new VpnNatRuleMappingResponse(addressSpace);
        }
    }
}
