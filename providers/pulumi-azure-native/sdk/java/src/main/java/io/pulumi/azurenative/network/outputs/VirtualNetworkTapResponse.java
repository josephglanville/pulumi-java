// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FrontendIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceTapConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNetworkTapResponse {
    private final @Nullable FrontendIPConfigurationResponse destinationLoadBalancerFrontEndIPConfiguration;
    private final @Nullable NetworkInterfaceIPConfigurationResponse destinationNetworkInterfaceIPConfiguration;
    private final @Nullable Integer destinationPort;
    private final String etag;
    private final @Nullable String id;
    private final @Nullable String location;
    private final String name;
    private final List<NetworkInterfaceTapConfigurationResponse> networkInterfaceTapConfigurations;
    private final String provisioningState;
    private final String resourceGuid;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"destinationLoadBalancerFrontEndIPConfiguration","destinationNetworkInterfaceIPConfiguration","destinationPort","etag","id","location","name","networkInterfaceTapConfigurations","provisioningState","resourceGuid","tags","type"})
    private VirtualNetworkTapResponse(
        @Nullable FrontendIPConfigurationResponse destinationLoadBalancerFrontEndIPConfiguration,
        @Nullable NetworkInterfaceIPConfigurationResponse destinationNetworkInterfaceIPConfiguration,
        @Nullable Integer destinationPort,
        String etag,
        @Nullable String id,
        @Nullable String location,
        String name,
        List<NetworkInterfaceTapConfigurationResponse> networkInterfaceTapConfigurations,
        String provisioningState,
        String resourceGuid,
        @Nullable Map<String,String> tags,
        String type) {
        this.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
        this.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
        this.destinationPort = destinationPort;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.networkInterfaceTapConfigurations = Objects.requireNonNull(networkInterfaceTapConfigurations);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceGuid = Objects.requireNonNull(resourceGuid);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<FrontendIPConfigurationResponse> getDestinationLoadBalancerFrontEndIPConfiguration() {
        return Optional.ofNullable(this.destinationLoadBalancerFrontEndIPConfiguration);
    }
    public Optional<NetworkInterfaceIPConfigurationResponse> getDestinationNetworkInterfaceIPConfiguration() {
        return Optional.ofNullable(this.destinationNetworkInterfaceIPConfiguration);
    }
    public Optional<Integer> getDestinationPort() {
        return Optional.ofNullable(this.destinationPort);
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public List<NetworkInterfaceTapConfigurationResponse> getNetworkInterfaceTapConfigurations() {
        return this.networkInterfaceTapConfigurations;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkTapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FrontendIPConfigurationResponse destinationLoadBalancerFrontEndIPConfiguration;
        private @Nullable NetworkInterfaceIPConfigurationResponse destinationNetworkInterfaceIPConfiguration;
        private @Nullable Integer destinationPort;
        private String etag;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private List<NetworkInterfaceTapConfigurationResponse> networkInterfaceTapConfigurations;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkTapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationLoadBalancerFrontEndIPConfiguration = defaults.destinationLoadBalancerFrontEndIPConfiguration;
    	      this.destinationNetworkInterfaceIPConfiguration = defaults.destinationNetworkInterfaceIPConfiguration;
    	      this.destinationPort = defaults.destinationPort;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterfaceTapConfigurations = defaults.networkInterfaceTapConfigurations;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDestinationLoadBalancerFrontEndIPConfiguration(@Nullable FrontendIPConfigurationResponse destinationLoadBalancerFrontEndIPConfiguration) {
            this.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
            return this;
        }

        public Builder setDestinationNetworkInterfaceIPConfiguration(@Nullable NetworkInterfaceIPConfigurationResponse destinationNetworkInterfaceIPConfiguration) {
            this.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
            return this;
        }

        public Builder setDestinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkInterfaceTapConfigurations(List<NetworkInterfaceTapConfigurationResponse> networkInterfaceTapConfigurations) {
            this.networkInterfaceTapConfigurations = Objects.requireNonNull(networkInterfaceTapConfigurations);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public VirtualNetworkTapResponse build() {
            return new VirtualNetworkTapResponse(destinationLoadBalancerFrontEndIPConfiguration, destinationNetworkInterfaceIPConfiguration, destinationPort, etag, id, location, name, networkInterfaceTapConfigurations, provisioningState, resourceGuid, tags, type);
        }
    }
}
