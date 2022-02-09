// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.VirtualMachineSshCredentialsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineResponseProperties {
    private final @Nullable String address;
    private final @Nullable VirtualMachineSshCredentialsResponse administratorAccount;
    private final @Nullable Integer sshPort;
    private final @Nullable String virtualMachineSize;

    @OutputCustomType.Constructor({"address","administratorAccount","sshPort","virtualMachineSize"})
    private VirtualMachineResponseProperties(
        @Nullable String address,
        @Nullable VirtualMachineSshCredentialsResponse administratorAccount,
        @Nullable Integer sshPort,
        @Nullable String virtualMachineSize) {
        this.address = address;
        this.administratorAccount = administratorAccount;
        this.sshPort = sshPort;
        this.virtualMachineSize = virtualMachineSize;
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }
    public Optional<VirtualMachineSshCredentialsResponse> getAdministratorAccount() {
        return Optional.ofNullable(this.administratorAccount);
    }
    public Optional<Integer> getSshPort() {
        return Optional.ofNullable(this.sshPort);
    }
    public Optional<String> getVirtualMachineSize() {
        return Optional.ofNullable(this.virtualMachineSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable VirtualMachineSshCredentialsResponse administratorAccount;
        private @Nullable Integer sshPort;
        private @Nullable String virtualMachineSize;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.administratorAccount = defaults.administratorAccount;
    	      this.sshPort = defaults.sshPort;
    	      this.virtualMachineSize = defaults.virtualMachineSize;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder setAdministratorAccount(@Nullable VirtualMachineSshCredentialsResponse administratorAccount) {
            this.administratorAccount = administratorAccount;
            return this;
        }

        public Builder setSshPort(@Nullable Integer sshPort) {
            this.sshPort = sshPort;
            return this;
        }

        public Builder setVirtualMachineSize(@Nullable String virtualMachineSize) {
            this.virtualMachineSize = virtualMachineSize;
            return this;
        }

        public VirtualMachineResponseProperties build() {
            return new VirtualMachineResponseProperties(address, administratorAccount, sshPort, virtualMachineSize);
        }
    }
}
