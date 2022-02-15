// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInsightsAnalysisAnalysisLoadBalancerListener {
    private final @Nullable Integer instancePort;
    private final @Nullable Integer loadBalancerPort;

    @OutputCustomType.Constructor({"instancePort","loadBalancerPort"})
    private NetworkInsightsAnalysisAnalysisLoadBalancerListener(
        @Nullable Integer instancePort,
        @Nullable Integer loadBalancerPort) {
        this.instancePort = instancePort;
        this.loadBalancerPort = loadBalancerPort;
    }

    public Optional<Integer> getInstancePort() {
        return Optional.ofNullable(this.instancePort);
    }
    public Optional<Integer> getLoadBalancerPort() {
        return Optional.ofNullable(this.loadBalancerPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAnalysisLoadBalancerListener defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instancePort;
        private @Nullable Integer loadBalancerPort;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAnalysisLoadBalancerListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePort = defaults.instancePort;
    	      this.loadBalancerPort = defaults.loadBalancerPort;
        }

        public Builder setInstancePort(@Nullable Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }

        public Builder setLoadBalancerPort(@Nullable Integer loadBalancerPort) {
            this.loadBalancerPort = loadBalancerPort;
            return this;
        }

        public NetworkInsightsAnalysisAnalysisLoadBalancerListener build() {
            return new NetworkInsightsAnalysisAnalysisLoadBalancerListener(instancePort, loadBalancerPort);
        }
    }
}