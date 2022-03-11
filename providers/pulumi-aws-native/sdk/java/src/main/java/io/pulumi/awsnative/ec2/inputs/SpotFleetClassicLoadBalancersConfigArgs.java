// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.SpotFleetClassicLoadBalancerArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class SpotFleetClassicLoadBalancersConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetClassicLoadBalancersConfigArgs Empty = new SpotFleetClassicLoadBalancersConfigArgs();

    @InputImport(name="classicLoadBalancers", required=true)
      private final Output<List<SpotFleetClassicLoadBalancerArgs>> classicLoadBalancers;

    public Output<List<SpotFleetClassicLoadBalancerArgs>> getClassicLoadBalancers() {
        return this.classicLoadBalancers;
    }

    public SpotFleetClassicLoadBalancersConfigArgs(Output<List<SpotFleetClassicLoadBalancerArgs>> classicLoadBalancers) {
        this.classicLoadBalancers = Objects.requireNonNull(classicLoadBalancers, "expected parameter 'classicLoadBalancers' to be non-null");
    }

    private SpotFleetClassicLoadBalancersConfigArgs() {
        this.classicLoadBalancers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetClassicLoadBalancersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<SpotFleetClassicLoadBalancerArgs>> classicLoadBalancers;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetClassicLoadBalancersConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classicLoadBalancers = defaults.classicLoadBalancers;
        }

        public Builder classicLoadBalancers(Output<List<SpotFleetClassicLoadBalancerArgs>> classicLoadBalancers) {
            this.classicLoadBalancers = Objects.requireNonNull(classicLoadBalancers);
            return this;
        }

        public Builder classicLoadBalancers(List<SpotFleetClassicLoadBalancerArgs> classicLoadBalancers) {
            this.classicLoadBalancers = Output.of(Objects.requireNonNull(classicLoadBalancers));
            return this;
        }
        public SpotFleetClassicLoadBalancersConfigArgs build() {
            return new SpotFleetClassicLoadBalancersConfigArgs(classicLoadBalancers);
        }
    }
}
