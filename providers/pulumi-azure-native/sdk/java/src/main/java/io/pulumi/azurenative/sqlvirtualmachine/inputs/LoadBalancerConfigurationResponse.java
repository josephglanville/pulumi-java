// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.inputs.PrivateIPAddressResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancerConfigurationResponse Empty = new LoadBalancerConfigurationResponse();

    @InputImport(name="loadBalancerResourceId")
    private final @Nullable String loadBalancerResourceId;

    public Optional<String> getLoadBalancerResourceId() {
        return this.loadBalancerResourceId == null ? Optional.empty() : Optional.ofNullable(this.loadBalancerResourceId);
    }

    @InputImport(name="privateIpAddress")
    private final @Nullable PrivateIPAddressResponse privateIpAddress;

    public Optional<PrivateIPAddressResponse> getPrivateIpAddress() {
        return this.privateIpAddress == null ? Optional.empty() : Optional.ofNullable(this.privateIpAddress);
    }

    @InputImport(name="probePort")
    private final @Nullable Integer probePort;

    public Optional<Integer> getProbePort() {
        return this.probePort == null ? Optional.empty() : Optional.ofNullable(this.probePort);
    }

    @InputImport(name="publicIpAddressResourceId")
    private final @Nullable String publicIpAddressResourceId;

    public Optional<String> getPublicIpAddressResourceId() {
        return this.publicIpAddressResourceId == null ? Optional.empty() : Optional.ofNullable(this.publicIpAddressResourceId);
    }

    @InputImport(name="sqlVirtualMachineInstances")
    private final @Nullable List<String> sqlVirtualMachineInstances;

    public List<String> getSqlVirtualMachineInstances() {
        return this.sqlVirtualMachineInstances == null ? List.of() : this.sqlVirtualMachineInstances;
    }

    public LoadBalancerConfigurationResponse(
        @Nullable String loadBalancerResourceId,
        @Nullable PrivateIPAddressResponse privateIpAddress,
        @Nullable Integer probePort,
        @Nullable String publicIpAddressResourceId,
        @Nullable List<String> sqlVirtualMachineInstances) {
        this.loadBalancerResourceId = loadBalancerResourceId;
        this.privateIpAddress = privateIpAddress;
        this.probePort = probePort;
        this.publicIpAddressResourceId = publicIpAddressResourceId;
        this.sqlVirtualMachineInstances = sqlVirtualMachineInstances;
    }

    private LoadBalancerConfigurationResponse() {
        this.loadBalancerResourceId = null;
        this.privateIpAddress = null;
        this.probePort = null;
        this.publicIpAddressResourceId = null;
        this.sqlVirtualMachineInstances = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String loadBalancerResourceId;
        private @Nullable PrivateIPAddressResponse privateIpAddress;
        private @Nullable Integer probePort;
        private @Nullable String publicIpAddressResourceId;
        private @Nullable List<String> sqlVirtualMachineInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerResourceId = defaults.loadBalancerResourceId;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.probePort = defaults.probePort;
    	      this.publicIpAddressResourceId = defaults.publicIpAddressResourceId;
    	      this.sqlVirtualMachineInstances = defaults.sqlVirtualMachineInstances;
        }

        public Builder setLoadBalancerResourceId(@Nullable String loadBalancerResourceId) {
            this.loadBalancerResourceId = loadBalancerResourceId;
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable PrivateIPAddressResponse privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder setProbePort(@Nullable Integer probePort) {
            this.probePort = probePort;
            return this;
        }

        public Builder setPublicIpAddressResourceId(@Nullable String publicIpAddressResourceId) {
            this.publicIpAddressResourceId = publicIpAddressResourceId;
            return this;
        }

        public Builder setSqlVirtualMachineInstances(@Nullable List<String> sqlVirtualMachineInstances) {
            this.sqlVirtualMachineInstances = sqlVirtualMachineInstances;
            return this;
        }

        public LoadBalancerConfigurationResponse build() {
            return new LoadBalancerConfigurationResponse(loadBalancerResourceId, privateIpAddress, probePort, publicIpAddressResourceId, sqlVirtualMachineInstances);
        }
    }
}
