// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.enums.LoadBalancerSku;
import io.pulumi.azurenative.containerservice.enums.NetworkMode;
import io.pulumi.azurenative.containerservice.enums.NetworkPlugin;
import io.pulumi.azurenative.containerservice.enums.NetworkPolicy;
import io.pulumi.azurenative.containerservice.enums.OutboundType;
import io.pulumi.azurenative.containerservice.inputs.ManagedClusterLoadBalancerProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerServiceNetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerServiceNetworkProfileArgs Empty = new ContainerServiceNetworkProfileArgs();

    @InputImport(name="dnsServiceIP")
    private final @Nullable Input<String> dnsServiceIP;

    public Input<String> getDnsServiceIP() {
        return this.dnsServiceIP == null ? Input.empty() : this.dnsServiceIP;
    }

    @InputImport(name="dockerBridgeCidr")
    private final @Nullable Input<String> dockerBridgeCidr;

    public Input<String> getDockerBridgeCidr() {
        return this.dockerBridgeCidr == null ? Input.empty() : this.dockerBridgeCidr;
    }

    @InputImport(name="loadBalancerProfile")
    private final @Nullable Input<ManagedClusterLoadBalancerProfileArgs> loadBalancerProfile;

    public Input<ManagedClusterLoadBalancerProfileArgs> getLoadBalancerProfile() {
        return this.loadBalancerProfile == null ? Input.empty() : this.loadBalancerProfile;
    }

    @InputImport(name="loadBalancerSku")
    private final @Nullable Input<Either<String,LoadBalancerSku>> loadBalancerSku;

    public Input<Either<String,LoadBalancerSku>> getLoadBalancerSku() {
        return this.loadBalancerSku == null ? Input.empty() : this.loadBalancerSku;
    }

    @InputImport(name="networkMode")
    private final @Nullable Input<Either<String,NetworkMode>> networkMode;

    public Input<Either<String,NetworkMode>> getNetworkMode() {
        return this.networkMode == null ? Input.empty() : this.networkMode;
    }

    @InputImport(name="networkPlugin")
    private final @Nullable Input<Either<String,NetworkPlugin>> networkPlugin;

    public Input<Either<String,NetworkPlugin>> getNetworkPlugin() {
        return this.networkPlugin == null ? Input.empty() : this.networkPlugin;
    }

    @InputImport(name="networkPolicy")
    private final @Nullable Input<Either<String,NetworkPolicy>> networkPolicy;

    public Input<Either<String,NetworkPolicy>> getNetworkPolicy() {
        return this.networkPolicy == null ? Input.empty() : this.networkPolicy;
    }

    @InputImport(name="outboundType")
    private final @Nullable Input<Either<String,OutboundType>> outboundType;

    public Input<Either<String,OutboundType>> getOutboundType() {
        return this.outboundType == null ? Input.empty() : this.outboundType;
    }

    @InputImport(name="podCidr")
    private final @Nullable Input<String> podCidr;

    public Input<String> getPodCidr() {
        return this.podCidr == null ? Input.empty() : this.podCidr;
    }

    @InputImport(name="serviceCidr")
    private final @Nullable Input<String> serviceCidr;

    public Input<String> getServiceCidr() {
        return this.serviceCidr == null ? Input.empty() : this.serviceCidr;
    }

    public ContainerServiceNetworkProfileArgs(
        @Nullable Input<String> dnsServiceIP,
        @Nullable Input<String> dockerBridgeCidr,
        @Nullable Input<ManagedClusterLoadBalancerProfileArgs> loadBalancerProfile,
        @Nullable Input<Either<String,LoadBalancerSku>> loadBalancerSku,
        @Nullable Input<Either<String,NetworkMode>> networkMode,
        @Nullable Input<Either<String,NetworkPlugin>> networkPlugin,
        @Nullable Input<Either<String,NetworkPolicy>> networkPolicy,
        @Nullable Input<Either<String,OutboundType>> outboundType,
        @Nullable Input<String> podCidr,
        @Nullable Input<String> serviceCidr) {
        this.dnsServiceIP = dnsServiceIP == null ? Input.ofNullable("10.0.0.10") : dnsServiceIP;
        this.dockerBridgeCidr = dockerBridgeCidr == null ? Input.ofNullable("172.17.0.1/16") : dockerBridgeCidr;
        this.loadBalancerProfile = loadBalancerProfile;
        this.loadBalancerSku = loadBalancerSku;
        this.networkMode = networkMode;
        this.networkPlugin = networkPlugin == null ? Input.ofLeft("kubenet") : networkPlugin;
        this.networkPolicy = networkPolicy;
        this.outboundType = outboundType == null ? Input.ofLeft("loadBalancer") : outboundType;
        this.podCidr = podCidr == null ? Input.ofNullable("10.244.0.0/16") : podCidr;
        this.serviceCidr = serviceCidr == null ? Input.ofNullable("10.0.0.0/16") : serviceCidr;
    }

    private ContainerServiceNetworkProfileArgs() {
        this.dnsServiceIP = Input.empty();
        this.dockerBridgeCidr = Input.empty();
        this.loadBalancerProfile = Input.empty();
        this.loadBalancerSku = Input.empty();
        this.networkMode = Input.empty();
        this.networkPlugin = Input.empty();
        this.networkPolicy = Input.empty();
        this.outboundType = Input.empty();
        this.podCidr = Input.empty();
        this.serviceCidr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dnsServiceIP;
        private @Nullable Input<String> dockerBridgeCidr;
        private @Nullable Input<ManagedClusterLoadBalancerProfileArgs> loadBalancerProfile;
        private @Nullable Input<Either<String,LoadBalancerSku>> loadBalancerSku;
        private @Nullable Input<Either<String,NetworkMode>> networkMode;
        private @Nullable Input<Either<String,NetworkPlugin>> networkPlugin;
        private @Nullable Input<Either<String,NetworkPolicy>> networkPolicy;
        private @Nullable Input<Either<String,OutboundType>> outboundType;
        private @Nullable Input<String> podCidr;
        private @Nullable Input<String> serviceCidr;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceNetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServiceIP = defaults.dnsServiceIP;
    	      this.dockerBridgeCidr = defaults.dockerBridgeCidr;
    	      this.loadBalancerProfile = defaults.loadBalancerProfile;
    	      this.loadBalancerSku = defaults.loadBalancerSku;
    	      this.networkMode = defaults.networkMode;
    	      this.networkPlugin = defaults.networkPlugin;
    	      this.networkPolicy = defaults.networkPolicy;
    	      this.outboundType = defaults.outboundType;
    	      this.podCidr = defaults.podCidr;
    	      this.serviceCidr = defaults.serviceCidr;
        }

        public Builder setDnsServiceIP(@Nullable Input<String> dnsServiceIP) {
            this.dnsServiceIP = dnsServiceIP;
            return this;
        }

        public Builder setDnsServiceIP(@Nullable String dnsServiceIP) {
            this.dnsServiceIP = Input.ofNullable(dnsServiceIP);
            return this;
        }

        public Builder setDockerBridgeCidr(@Nullable Input<String> dockerBridgeCidr) {
            this.dockerBridgeCidr = dockerBridgeCidr;
            return this;
        }

        public Builder setDockerBridgeCidr(@Nullable String dockerBridgeCidr) {
            this.dockerBridgeCidr = Input.ofNullable(dockerBridgeCidr);
            return this;
        }

        public Builder setLoadBalancerProfile(@Nullable Input<ManagedClusterLoadBalancerProfileArgs> loadBalancerProfile) {
            this.loadBalancerProfile = loadBalancerProfile;
            return this;
        }

        public Builder setLoadBalancerProfile(@Nullable ManagedClusterLoadBalancerProfileArgs loadBalancerProfile) {
            this.loadBalancerProfile = Input.ofNullable(loadBalancerProfile);
            return this;
        }

        public Builder setLoadBalancerSku(@Nullable Input<Either<String,LoadBalancerSku>> loadBalancerSku) {
            this.loadBalancerSku = loadBalancerSku;
            return this;
        }

        public Builder setLoadBalancerSku(@Nullable Either<String,LoadBalancerSku> loadBalancerSku) {
            this.loadBalancerSku = Input.ofNullable(loadBalancerSku);
            return this;
        }

        public Builder setNetworkMode(@Nullable Input<Either<String,NetworkMode>> networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        public Builder setNetworkMode(@Nullable Either<String,NetworkMode> networkMode) {
            this.networkMode = Input.ofNullable(networkMode);
            return this;
        }

        public Builder setNetworkPlugin(@Nullable Input<Either<String,NetworkPlugin>> networkPlugin) {
            this.networkPlugin = networkPlugin;
            return this;
        }

        public Builder setNetworkPlugin(@Nullable Either<String,NetworkPlugin> networkPlugin) {
            this.networkPlugin = Input.ofNullable(networkPlugin);
            return this;
        }

        public Builder setNetworkPolicy(@Nullable Input<Either<String,NetworkPolicy>> networkPolicy) {
            this.networkPolicy = networkPolicy;
            return this;
        }

        public Builder setNetworkPolicy(@Nullable Either<String,NetworkPolicy> networkPolicy) {
            this.networkPolicy = Input.ofNullable(networkPolicy);
            return this;
        }

        public Builder setOutboundType(@Nullable Input<Either<String,OutboundType>> outboundType) {
            this.outboundType = outboundType;
            return this;
        }

        public Builder setOutboundType(@Nullable Either<String,OutboundType> outboundType) {
            this.outboundType = Input.ofNullable(outboundType);
            return this;
        }

        public Builder setPodCidr(@Nullable Input<String> podCidr) {
            this.podCidr = podCidr;
            return this;
        }

        public Builder setPodCidr(@Nullable String podCidr) {
            this.podCidr = Input.ofNullable(podCidr);
            return this;
        }

        public Builder setServiceCidr(@Nullable Input<String> serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }

        public Builder setServiceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = Input.ofNullable(serviceCidr);
            return this;
        }

        public ContainerServiceNetworkProfileArgs build() {
            return new ContainerServiceNetworkProfileArgs(dnsServiceIP, dockerBridgeCidr, loadBalancerProfile, loadBalancerSku, networkMode, networkPlugin, networkPolicy, outboundType, podCidr, serviceCidr);
        }
    }
}
