// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute {
    /**
     * List of Amazon Resource Names (ARNs) of the load balancer listeners.
     * 
     */
    private final List<String> listenerArns;

    @CustomType.Constructor
    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute(@CustomType.Parameter("listenerArns") List<String> listenerArns) {
        this.listenerArns = listenerArns;
    }

    /**
     * List of Amazon Resource Names (ARNs) of the load balancer listeners.
     * 
    */
    public List<String> getListenerArns() {
        return this.listenerArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> listenerArns;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listenerArns = defaults.listenerArns;
        }

        public Builder listenerArns(List<String> listenerArns) {
            this.listenerArns = Objects.requireNonNull(listenerArns);
            return this;
        }
        public Builder listenerArns(String... listenerArns) {
            return listenerArns(List.of(listenerArns));
        }        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute build() {
            return new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute(listenerArns);
        }
    }
}