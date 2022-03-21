// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerBackendServerPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerBackendServerPolicyState Empty = new LoadBalancerBackendServerPolicyState();

    /**
     * The instance port to apply the policy to.
     * 
     */
    @Import(name="instancePort")
      private final @Nullable Output<Integer> instancePort;

    public Output<Integer> getInstancePort() {
        return this.instancePort == null ? Output.empty() : this.instancePort;
    }

    /**
     * The load balancer to attach the policy to.
     * 
     */
    @Import(name="loadBalancerName")
      private final @Nullable Output<String> loadBalancerName;

    public Output<String> getLoadBalancerName() {
        return this.loadBalancerName == null ? Output.empty() : this.loadBalancerName;
    }

    /**
     * List of Policy Names to apply to the backend server.
     * 
     */
    @Import(name="policyNames")
      private final @Nullable Output<List<String>> policyNames;

    public Output<List<String>> getPolicyNames() {
        return this.policyNames == null ? Output.empty() : this.policyNames;
    }

    public LoadBalancerBackendServerPolicyState(
        @Nullable Output<Integer> instancePort,
        @Nullable Output<String> loadBalancerName,
        @Nullable Output<List<String>> policyNames) {
        this.instancePort = instancePort;
        this.loadBalancerName = loadBalancerName;
        this.policyNames = policyNames;
    }

    private LoadBalancerBackendServerPolicyState() {
        this.instancePort = Output.empty();
        this.loadBalancerName = Output.empty();
        this.policyNames = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerBackendServerPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> instancePort;
        private @Nullable Output<String> loadBalancerName;
        private @Nullable Output<List<String>> policyNames;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerBackendServerPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePort = defaults.instancePort;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.policyNames = defaults.policyNames;
        }

        public Builder instancePort(@Nullable Output<Integer> instancePort) {
            this.instancePort = instancePort;
            return this;
        }
        public Builder instancePort(@Nullable Integer instancePort) {
            this.instancePort = Output.ofNullable(instancePort);
            return this;
        }
        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public Builder loadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = Output.ofNullable(loadBalancerName);
            return this;
        }
        public Builder policyNames(@Nullable Output<List<String>> policyNames) {
            this.policyNames = policyNames;
            return this;
        }
        public Builder policyNames(@Nullable List<String> policyNames) {
            this.policyNames = Output.ofNullable(policyNames);
            return this;
        }
        public Builder policyNames(String... policyNames) {
            return policyNames(List.of(policyNames));
        }        public LoadBalancerBackendServerPolicyState build() {
            return new LoadBalancerBackendServerPolicyState(instancePort, loadBalancerName, policyNames);
        }
    }
}
