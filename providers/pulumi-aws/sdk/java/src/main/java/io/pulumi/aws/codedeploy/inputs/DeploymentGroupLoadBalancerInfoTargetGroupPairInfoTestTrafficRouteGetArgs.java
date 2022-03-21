// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs Empty = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs();

    /**
     * List of Amazon Resource Names (ARNs) of the load balancer listeners.
     * 
     */
    @Import(name="listenerArns", required=true)
      private final Output<List<String>> listenerArns;

    public Output<List<String>> getListenerArns() {
        return this.listenerArns;
    }

    public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs(Output<List<String>> listenerArns) {
        this.listenerArns = Objects.requireNonNull(listenerArns, "expected parameter 'listenerArns' to be non-null");
    }

    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs() {
        this.listenerArns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> listenerArns;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listenerArns = defaults.listenerArns;
        }

        public Builder listenerArns(Output<List<String>> listenerArns) {
            this.listenerArns = Objects.requireNonNull(listenerArns);
            return this;
        }
        public Builder listenerArns(List<String> listenerArns) {
            this.listenerArns = Output.of(Objects.requireNonNull(listenerArns));
            return this;
        }
        public Builder listenerArns(String... listenerArns) {
            return listenerArns(List.of(listenerArns));
        }        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs build() {
            return new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteGetArgs(listenerArns);
        }
    }
}
