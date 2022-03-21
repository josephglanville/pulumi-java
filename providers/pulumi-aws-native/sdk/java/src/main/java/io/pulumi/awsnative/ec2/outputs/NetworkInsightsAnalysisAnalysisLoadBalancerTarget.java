// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisComponent;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAnalysisAnalysisLoadBalancerTarget {
    private final @Nullable String address;
    private final @Nullable String availabilityZone;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent instance;
    private final @Nullable Integer port;

    @CustomType.Constructor
    private NetworkInsightsAnalysisAnalysisLoadBalancerTarget(
        @CustomType.Parameter("address") @Nullable String address,
        @CustomType.Parameter("availabilityZone") @Nullable String availabilityZone,
        @CustomType.Parameter("instance") @Nullable NetworkInsightsAnalysisAnalysisComponent instance,
        @CustomType.Parameter("port") @Nullable Integer port) {
        this.address = address;
        this.availabilityZone = availabilityZone;
        this.instance = instance;
        this.port = port;
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }
    public Optional<String> getAvailabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getInstance() {
        return Optional.ofNullable(this.instance);
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAnalysisLoadBalancerTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String availabilityZone;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent instance;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAnalysisLoadBalancerTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.instance = defaults.instance;
    	      this.port = defaults.port;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder instance(@Nullable NetworkInsightsAnalysisAnalysisComponent instance) {
            this.instance = instance;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }        public NetworkInsightsAnalysisAnalysisLoadBalancerTarget build() {
            return new NetworkInsightsAnalysisAnalysisLoadBalancerTarget(address, availabilityZone, instance, port);
        }
    }
}
