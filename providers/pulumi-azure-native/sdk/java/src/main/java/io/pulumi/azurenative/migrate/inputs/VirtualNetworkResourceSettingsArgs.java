// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.SubnetResourceSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkResourceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkResourceSettingsArgs Empty = new VirtualNetworkResourceSettingsArgs();

    @InputImport(name="addressSpace")
    private final @Nullable Input<List<String>> addressSpace;

    public Input<List<String>> getAddressSpace() {
        return this.addressSpace == null ? Input.empty() : this.addressSpace;
    }

    @InputImport(name="dnsServers")
    private final @Nullable Input<List<String>> dnsServers;

    public Input<List<String>> getDnsServers() {
        return this.dnsServers == null ? Input.empty() : this.dnsServers;
    }

    @InputImport(name="enableDdosProtection")
    private final @Nullable Input<Boolean> enableDdosProtection;

    public Input<Boolean> getEnableDdosProtection() {
        return this.enableDdosProtection == null ? Input.empty() : this.enableDdosProtection;
    }

    @InputImport(name="resourceType", required=true)
    private final Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType;
    }

    @InputImport(name="subnets")
    private final @Nullable Input<List<SubnetResourceSettingsArgs>> subnets;

    public Input<List<SubnetResourceSettingsArgs>> getSubnets() {
        return this.subnets == null ? Input.empty() : this.subnets;
    }

    @InputImport(name="targetResourceName", required=true)
    private final Input<String> targetResourceName;

    public Input<String> getTargetResourceName() {
        return this.targetResourceName;
    }

    public VirtualNetworkResourceSettingsArgs(
        @Nullable Input<List<String>> addressSpace,
        @Nullable Input<List<String>> dnsServers,
        @Nullable Input<Boolean> enableDdosProtection,
        Input<String> resourceType,
        @Nullable Input<List<SubnetResourceSettingsArgs>> subnets,
        Input<String> targetResourceName) {
        this.addressSpace = addressSpace;
        this.dnsServers = dnsServers;
        this.enableDdosProtection = enableDdosProtection;
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.subnets = subnets;
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
    }

    private VirtualNetworkResourceSettingsArgs() {
        this.addressSpace = Input.empty();
        this.dnsServers = Input.empty();
        this.enableDdosProtection = Input.empty();
        this.resourceType = Input.empty();
        this.subnets = Input.empty();
        this.targetResourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> addressSpace;
        private @Nullable Input<List<String>> dnsServers;
        private @Nullable Input<Boolean> enableDdosProtection;
        private Input<String> resourceType;
        private @Nullable Input<List<SubnetResourceSettingsArgs>> subnets;
        private Input<String> targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkResourceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressSpace = defaults.addressSpace;
    	      this.dnsServers = defaults.dnsServers;
    	      this.enableDdosProtection = defaults.enableDdosProtection;
    	      this.resourceType = defaults.resourceType;
    	      this.subnets = defaults.subnets;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder setAddressSpace(@Nullable Input<List<String>> addressSpace) {
            this.addressSpace = addressSpace;
            return this;
        }

        public Builder setAddressSpace(@Nullable List<String> addressSpace) {
            this.addressSpace = Input.ofNullable(addressSpace);
            return this;
        }

        public Builder setDnsServers(@Nullable Input<List<String>> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = Input.ofNullable(dnsServers);
            return this;
        }

        public Builder setEnableDdosProtection(@Nullable Input<Boolean> enableDdosProtection) {
            this.enableDdosProtection = enableDdosProtection;
            return this;
        }

        public Builder setEnableDdosProtection(@Nullable Boolean enableDdosProtection) {
            this.enableDdosProtection = Input.ofNullable(enableDdosProtection);
            return this;
        }

        public Builder setResourceType(Input<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Input.of(Objects.requireNonNull(resourceType));
            return this;
        }

        public Builder setSubnets(@Nullable Input<List<SubnetResourceSettingsArgs>> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setSubnets(@Nullable List<SubnetResourceSettingsArgs> subnets) {
            this.subnets = Input.ofNullable(subnets);
            return this;
        }

        public Builder setTargetResourceName(Input<String> targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder setTargetResourceName(String targetResourceName) {
            this.targetResourceName = Input.of(Objects.requireNonNull(targetResourceName));
            return this;
        }

        public VirtualNetworkResourceSettingsArgs build() {
            return new VirtualNetworkResourceSettingsArgs(addressSpace, dnsServers, enableDdosProtection, resourceType, subnets, targetResourceName);
        }
    }
}
