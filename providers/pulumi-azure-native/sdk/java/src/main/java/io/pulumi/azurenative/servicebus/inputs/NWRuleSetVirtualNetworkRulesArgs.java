// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.azurenative.servicebus.inputs.SubnetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NWRuleSetVirtualNetworkRulesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NWRuleSetVirtualNetworkRulesArgs Empty = new NWRuleSetVirtualNetworkRulesArgs();

    @InputImport(name="ignoreMissingVnetServiceEndpoint")
    private final @Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint;

    public Input<Boolean> getIgnoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint == null ? Input.empty() : this.ignoreMissingVnetServiceEndpoint;
    }

    @InputImport(name="subnet")
    private final @Nullable Input<SubnetArgs> subnet;

    public Input<SubnetArgs> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    public NWRuleSetVirtualNetworkRulesArgs(
        @Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint,
        @Nullable Input<SubnetArgs> subnet) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        this.subnet = subnet;
    }

    private NWRuleSetVirtualNetworkRulesArgs() {
        this.ignoreMissingVnetServiceEndpoint = Input.empty();
        this.subnet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NWRuleSetVirtualNetworkRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint;
        private @Nullable Input<SubnetArgs> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NWRuleSetVirtualNetworkRulesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
    	      this.subnet = defaults.subnet;
        }

        public Builder setIgnoreMissingVnetServiceEndpoint(@Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }

        public Builder setIgnoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = Input.ofNullable(ignoreMissingVnetServiceEndpoint);
            return this;
        }

        public Builder setSubnet(@Nullable Input<SubnetArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setSubnet(@Nullable SubnetArgs subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }

        public NWRuleSetVirtualNetworkRulesArgs build() {
            return new NWRuleSetVirtualNetworkRulesArgs(ignoreMissingVnetServiceEndpoint, subnet);
        }
    }
}
