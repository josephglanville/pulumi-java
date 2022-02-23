// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.VirtualMachineSshCredentialsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachinePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachinePropertiesArgs Empty = new VirtualMachinePropertiesArgs();

    /**
     * Public IP address of the virtual machine.
     * 
     */
    @InputImport(name="address")
      private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    /**
     * Admin credentials for virtual machine
     * 
     */
    @InputImport(name="administratorAccount")
      private final @Nullable Input<VirtualMachineSshCredentialsArgs> administratorAccount;

    public Input<VirtualMachineSshCredentialsArgs> getAdministratorAccount() {
        return this.administratorAccount == null ? Input.empty() : this.administratorAccount;
    }

    /**
     * Port open for ssh connections.
     * 
     */
    @InputImport(name="sshPort")
      private final @Nullable Input<Integer> sshPort;

    public Input<Integer> getSshPort() {
        return this.sshPort == null ? Input.empty() : this.sshPort;
    }

    /**
     * Virtual Machine size
     * 
     */
    @InputImport(name="virtualMachineSize")
      private final @Nullable Input<String> virtualMachineSize;

    public Input<String> getVirtualMachineSize() {
        return this.virtualMachineSize == null ? Input.empty() : this.virtualMachineSize;
    }

    public VirtualMachinePropertiesArgs(
        @Nullable Input<String> address,
        @Nullable Input<VirtualMachineSshCredentialsArgs> administratorAccount,
        @Nullable Input<Integer> sshPort,
        @Nullable Input<String> virtualMachineSize) {
        this.address = address;
        this.administratorAccount = administratorAccount;
        this.sshPort = sshPort;
        this.virtualMachineSize = virtualMachineSize;
    }

    private VirtualMachinePropertiesArgs() {
        this.address = Input.empty();
        this.administratorAccount = Input.empty();
        this.sshPort = Input.empty();
        this.virtualMachineSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachinePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<VirtualMachineSshCredentialsArgs> administratorAccount;
        private @Nullable Input<Integer> sshPort;
        private @Nullable Input<String> virtualMachineSize;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachinePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.administratorAccount = defaults.administratorAccount;
    	      this.sshPort = defaults.sshPort;
    	      this.virtualMachineSize = defaults.virtualMachineSize;
        }

        public Builder setAddress(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder setAdministratorAccount(@Nullable Input<VirtualMachineSshCredentialsArgs> administratorAccount) {
            this.administratorAccount = administratorAccount;
            return this;
        }

        public Builder setAdministratorAccount(@Nullable VirtualMachineSshCredentialsArgs administratorAccount) {
            this.administratorAccount = Input.ofNullable(administratorAccount);
            return this;
        }

        public Builder setSshPort(@Nullable Input<Integer> sshPort) {
            this.sshPort = sshPort;
            return this;
        }

        public Builder setSshPort(@Nullable Integer sshPort) {
            this.sshPort = Input.ofNullable(sshPort);
            return this;
        }

        public Builder setVirtualMachineSize(@Nullable Input<String> virtualMachineSize) {
            this.virtualMachineSize = virtualMachineSize;
            return this;
        }

        public Builder setVirtualMachineSize(@Nullable String virtualMachineSize) {
            this.virtualMachineSize = Input.ofNullable(virtualMachineSize);
            return this;
        }
        public VirtualMachinePropertiesArgs build() {
            return new VirtualMachinePropertiesArgs(address, administratorAccount, sshPort, virtualMachineSize);
        }
    }
}
