// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ProxyProtocolPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProxyProtocolPolicyArgs Empty = new ProxyProtocolPolicyArgs();

    /**
     * List of instance ports to which the policy
     * should be applied. This can be specified if the protocol is SSL or TCP.
     * 
     */
    @Import(name="instancePorts", required=true)
      private final Output<List<String>> instancePorts;

    public Output<List<String>> getInstancePorts() {
        return this.instancePorts;
    }

    /**
     * The load balancer to which the policy
     * should be attached.
     * 
     */
    @Import(name="loadBalancer", required=true)
      private final Output<String> loadBalancer;

    public Output<String> getLoadBalancer() {
        return this.loadBalancer;
    }

    public ProxyProtocolPolicyArgs(
        Output<List<String>> instancePorts,
        Output<String> loadBalancer) {
        this.instancePorts = Objects.requireNonNull(instancePorts, "expected parameter 'instancePorts' to be non-null");
        this.loadBalancer = Objects.requireNonNull(loadBalancer, "expected parameter 'loadBalancer' to be non-null");
    }

    private ProxyProtocolPolicyArgs() {
        this.instancePorts = Output.empty();
        this.loadBalancer = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyProtocolPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> instancePorts;
        private Output<String> loadBalancer;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyProtocolPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePorts = defaults.instancePorts;
    	      this.loadBalancer = defaults.loadBalancer;
        }

        public Builder instancePorts(Output<List<String>> instancePorts) {
            this.instancePorts = Objects.requireNonNull(instancePorts);
            return this;
        }
        public Builder instancePorts(List<String> instancePorts) {
            this.instancePorts = Output.of(Objects.requireNonNull(instancePorts));
            return this;
        }
        public Builder instancePorts(String... instancePorts) {
            return instancePorts(List.of(instancePorts));
        }
        public Builder loadBalancer(Output<String> loadBalancer) {
            this.loadBalancer = Objects.requireNonNull(loadBalancer);
            return this;
        }
        public Builder loadBalancer(String loadBalancer) {
            this.loadBalancer = Output.of(Objects.requireNonNull(loadBalancer));
            return this;
        }        public ProxyProtocolPolicyArgs build() {
            return new ProxyProtocolPolicyArgs(instancePorts, loadBalancer);
        }
    }
}