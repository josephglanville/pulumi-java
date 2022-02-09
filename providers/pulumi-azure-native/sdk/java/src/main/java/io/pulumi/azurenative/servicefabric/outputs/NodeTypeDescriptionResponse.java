// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.azurenative.servicefabric.outputs.EndpointRangeDescriptionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodeTypeDescriptionResponse {
    private final @Nullable EndpointRangeDescriptionResponse applicationPorts;
    private final @Nullable Map<String,String> capacities;
    private final Integer clientConnectionEndpointPort;
    private final @Nullable String durabilityLevel;
    private final @Nullable EndpointRangeDescriptionResponse ephemeralPorts;
    private final Integer httpGatewayEndpointPort;
    private final Boolean isPrimary;
    private final String name;
    private final @Nullable Map<String,String> placementProperties;
    private final @Nullable Integer reverseProxyEndpointPort;
    private final Integer vmInstanceCount;

    @OutputCustomType.Constructor({"applicationPorts","capacities","clientConnectionEndpointPort","durabilityLevel","ephemeralPorts","httpGatewayEndpointPort","isPrimary","name","placementProperties","reverseProxyEndpointPort","vmInstanceCount"})
    private NodeTypeDescriptionResponse(
        @Nullable EndpointRangeDescriptionResponse applicationPorts,
        @Nullable Map<String,String> capacities,
        Integer clientConnectionEndpointPort,
        @Nullable String durabilityLevel,
        @Nullable EndpointRangeDescriptionResponse ephemeralPorts,
        Integer httpGatewayEndpointPort,
        Boolean isPrimary,
        String name,
        @Nullable Map<String,String> placementProperties,
        @Nullable Integer reverseProxyEndpointPort,
        Integer vmInstanceCount) {
        this.applicationPorts = applicationPorts;
        this.capacities = capacities;
        this.clientConnectionEndpointPort = Objects.requireNonNull(clientConnectionEndpointPort);
        this.durabilityLevel = durabilityLevel;
        this.ephemeralPorts = ephemeralPorts;
        this.httpGatewayEndpointPort = Objects.requireNonNull(httpGatewayEndpointPort);
        this.isPrimary = Objects.requireNonNull(isPrimary);
        this.name = Objects.requireNonNull(name);
        this.placementProperties = placementProperties;
        this.reverseProxyEndpointPort = reverseProxyEndpointPort;
        this.vmInstanceCount = Objects.requireNonNull(vmInstanceCount);
    }

    public Optional<EndpointRangeDescriptionResponse> getApplicationPorts() {
        return Optional.ofNullable(this.applicationPorts);
    }
    public Map<String,String> getCapacities() {
        return this.capacities == null ? Map.of() : this.capacities;
    }
    public Integer getClientConnectionEndpointPort() {
        return this.clientConnectionEndpointPort;
    }
    public Optional<String> getDurabilityLevel() {
        return Optional.ofNullable(this.durabilityLevel);
    }
    public Optional<EndpointRangeDescriptionResponse> getEphemeralPorts() {
        return Optional.ofNullable(this.ephemeralPorts);
    }
    public Integer getHttpGatewayEndpointPort() {
        return this.httpGatewayEndpointPort;
    }
    public Boolean getIsPrimary() {
        return this.isPrimary;
    }
    public String getName() {
        return this.name;
    }
    public Map<String,String> getPlacementProperties() {
        return this.placementProperties == null ? Map.of() : this.placementProperties;
    }
    public Optional<Integer> getReverseProxyEndpointPort() {
        return Optional.ofNullable(this.reverseProxyEndpointPort);
    }
    public Integer getVmInstanceCount() {
        return this.vmInstanceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTypeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EndpointRangeDescriptionResponse applicationPorts;
        private @Nullable Map<String,String> capacities;
        private Integer clientConnectionEndpointPort;
        private @Nullable String durabilityLevel;
        private @Nullable EndpointRangeDescriptionResponse ephemeralPorts;
        private Integer httpGatewayEndpointPort;
        private Boolean isPrimary;
        private String name;
        private @Nullable Map<String,String> placementProperties;
        private @Nullable Integer reverseProxyEndpointPort;
        private Integer vmInstanceCount;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTypeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationPorts = defaults.applicationPorts;
    	      this.capacities = defaults.capacities;
    	      this.clientConnectionEndpointPort = defaults.clientConnectionEndpointPort;
    	      this.durabilityLevel = defaults.durabilityLevel;
    	      this.ephemeralPorts = defaults.ephemeralPorts;
    	      this.httpGatewayEndpointPort = defaults.httpGatewayEndpointPort;
    	      this.isPrimary = defaults.isPrimary;
    	      this.name = defaults.name;
    	      this.placementProperties = defaults.placementProperties;
    	      this.reverseProxyEndpointPort = defaults.reverseProxyEndpointPort;
    	      this.vmInstanceCount = defaults.vmInstanceCount;
        }

        public Builder setApplicationPorts(@Nullable EndpointRangeDescriptionResponse applicationPorts) {
            this.applicationPorts = applicationPorts;
            return this;
        }

        public Builder setCapacities(@Nullable Map<String,String> capacities) {
            this.capacities = capacities;
            return this;
        }

        public Builder setClientConnectionEndpointPort(Integer clientConnectionEndpointPort) {
            this.clientConnectionEndpointPort = Objects.requireNonNull(clientConnectionEndpointPort);
            return this;
        }

        public Builder setDurabilityLevel(@Nullable String durabilityLevel) {
            this.durabilityLevel = durabilityLevel;
            return this;
        }

        public Builder setEphemeralPorts(@Nullable EndpointRangeDescriptionResponse ephemeralPorts) {
            this.ephemeralPorts = ephemeralPorts;
            return this;
        }

        public Builder setHttpGatewayEndpointPort(Integer httpGatewayEndpointPort) {
            this.httpGatewayEndpointPort = Objects.requireNonNull(httpGatewayEndpointPort);
            return this;
        }

        public Builder setIsPrimary(Boolean isPrimary) {
            this.isPrimary = Objects.requireNonNull(isPrimary);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlacementProperties(@Nullable Map<String,String> placementProperties) {
            this.placementProperties = placementProperties;
            return this;
        }

        public Builder setReverseProxyEndpointPort(@Nullable Integer reverseProxyEndpointPort) {
            this.reverseProxyEndpointPort = reverseProxyEndpointPort;
            return this;
        }

        public Builder setVmInstanceCount(Integer vmInstanceCount) {
            this.vmInstanceCount = Objects.requireNonNull(vmInstanceCount);
            return this;
        }

        public NodeTypeDescriptionResponse build() {
            return new NodeTypeDescriptionResponse(applicationPorts, capacities, clientConnectionEndpointPort, durabilityLevel, ephemeralPorts, httpGatewayEndpointPort, isPrimary, name, placementProperties, reverseProxyEndpointPort, vmInstanceCount);
        }
    }
}
