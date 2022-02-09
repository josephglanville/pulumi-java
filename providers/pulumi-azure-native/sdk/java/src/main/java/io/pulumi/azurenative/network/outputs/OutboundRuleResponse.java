// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OutboundRuleResponse {
    private final @Nullable Integer allocatedOutboundPorts;
    private final SubResourceResponse backendAddressPool;
    private final @Nullable Boolean enableTcpReset;
    private final String etag;
    private final List<SubResourceResponse> frontendIPConfigurations;
    private final @Nullable String id;
    private final @Nullable Integer idleTimeoutInMinutes;
    private final @Nullable String name;
    private final String protocol;
    private final String provisioningState;
    private final String type;

    @OutputCustomType.Constructor({"allocatedOutboundPorts","backendAddressPool","enableTcpReset","etag","frontendIPConfigurations","id","idleTimeoutInMinutes","name","protocol","provisioningState","type"})
    private OutboundRuleResponse(
        @Nullable Integer allocatedOutboundPorts,
        SubResourceResponse backendAddressPool,
        @Nullable Boolean enableTcpReset,
        String etag,
        List<SubResourceResponse> frontendIPConfigurations,
        @Nullable String id,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable String name,
        String protocol,
        String provisioningState,
        String type) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
        this.backendAddressPool = Objects.requireNonNull(backendAddressPool);
        this.enableTcpReset = enableTcpReset;
        this.etag = Objects.requireNonNull(etag);
        this.frontendIPConfigurations = Objects.requireNonNull(frontendIPConfigurations);
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.name = name;
        this.protocol = Objects.requireNonNull(protocol);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Integer> getAllocatedOutboundPorts() {
        return Optional.ofNullable(this.allocatedOutboundPorts);
    }
    public SubResourceResponse getBackendAddressPool() {
        return this.backendAddressPool;
    }
    public Optional<Boolean> getEnableTcpReset() {
        return Optional.ofNullable(this.enableTcpReset);
    }
    public String getEtag() {
        return this.etag;
    }
    public List<SubResourceResponse> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Integer> getIdleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public String getProtocol() {
        return this.protocol;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutboundRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allocatedOutboundPorts;
        private SubResourceResponse backendAddressPool;
        private @Nullable Boolean enableTcpReset;
        private String etag;
        private List<SubResourceResponse> frontendIPConfigurations;
        private @Nullable String id;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable String name;
        private String protocol;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OutboundRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedOutboundPorts = defaults.allocatedOutboundPorts;
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.enableTcpReset = defaults.enableTcpReset;
    	      this.etag = defaults.etag;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAllocatedOutboundPorts(@Nullable Integer allocatedOutboundPorts) {
            this.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }

        public Builder setBackendAddressPool(SubResourceResponse backendAddressPool) {
            this.backendAddressPool = Objects.requireNonNull(backendAddressPool);
            return this;
        }

        public Builder setEnableTcpReset(@Nullable Boolean enableTcpReset) {
            this.enableTcpReset = enableTcpReset;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFrontendIPConfigurations(List<SubResourceResponse> frontendIPConfigurations) {
            this.frontendIPConfigurations = Objects.requireNonNull(frontendIPConfigurations);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public OutboundRuleResponse build() {
            return new OutboundRuleResponse(allocatedOutboundPorts, backendAddressPool, enableTcpReset, etag, frontendIPConfigurations, id, idleTimeoutInMinutes, name, protocol, provisioningState, type);
        }
    }
}
