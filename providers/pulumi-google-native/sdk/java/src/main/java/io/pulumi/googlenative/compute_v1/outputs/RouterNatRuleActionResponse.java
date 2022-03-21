// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RouterNatRuleActionResponse {
    /**
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * 
     */
    private final List<String> sourceNatActiveIps;
    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * 
     */
    private final List<String> sourceNatDrainIps;

    @CustomType.Constructor
    private RouterNatRuleActionResponse(
        @CustomType.Parameter("sourceNatActiveIps") List<String> sourceNatActiveIps,
        @CustomType.Parameter("sourceNatDrainIps") List<String> sourceNatDrainIps) {
        this.sourceNatActiveIps = sourceNatActiveIps;
        this.sourceNatDrainIps = sourceNatDrainIps;
    }

    /**
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * 
    */
    public List<String> getSourceNatActiveIps() {
        return this.sourceNatActiveIps;
    }
    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * 
    */
    public List<String> getSourceNatDrainIps() {
        return this.sourceNatDrainIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatRuleActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> sourceNatActiveIps;
        private List<String> sourceNatDrainIps;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatRuleActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceNatActiveIps = defaults.sourceNatActiveIps;
    	      this.sourceNatDrainIps = defaults.sourceNatDrainIps;
        }

        public Builder sourceNatActiveIps(List<String> sourceNatActiveIps) {
            this.sourceNatActiveIps = Objects.requireNonNull(sourceNatActiveIps);
            return this;
        }
        public Builder sourceNatActiveIps(String... sourceNatActiveIps) {
            return sourceNatActiveIps(List.of(sourceNatActiveIps));
        }
        public Builder sourceNatDrainIps(List<String> sourceNatDrainIps) {
            this.sourceNatDrainIps = Objects.requireNonNull(sourceNatDrainIps);
            return this;
        }
        public Builder sourceNatDrainIps(String... sourceNatDrainIps) {
            return sourceNatDrainIps(List.of(sourceNatDrainIps));
        }        public RouterNatRuleActionResponse build() {
            return new RouterNatRuleActionResponse(sourceNatActiveIps, sourceNatDrainIps);
        }
    }
}
