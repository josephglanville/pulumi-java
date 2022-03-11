// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.VirtualMachineSshCredentialsArgs;
import io.pulumi.core.Output;
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
      private final @Nullable Output<String> address;

    public Output<String> getAddress() {
        return this.address == null ? Output.empty() : this.address;
    }

    /**
     * Admin credentials for virtual machine
     * 
     */
    @InputImport(name="administratorAccount")
      private final @Nullable Output<VirtualMachineSshCredentialsArgs> administratorAccount;

    public Output<VirtualMachineSshCredentialsArgs> getAdministratorAccount() {
        return this.administratorAccount == null ? Output.empty() : this.administratorAccount;
    }

    /**
     * Port open for ssh connections.
     * 
     */
    @InputImport(name="sshPort")
      private final @Nullable Output<Integer> sshPort;

    public Output<Integer> getSshPort() {
        return this.sshPort == null ? Output.empty() : this.sshPort;
    }

    /**
     * Virtual Machine size
     * 
     */
    @InputImport(name="virtualMachineSize")
      private final @Nullable Output<String> virtualMachineSize;

    public Output<String> getVirtualMachineSize() {
        return this.virtualMachineSize == null ? Output.empty() : this.virtualMachineSize;
    }

    public VirtualMachinePropertiesArgs(
        @Nullable Output<String> address,
        @Nullable Output<VirtualMachineSshCredentialsArgs> administratorAccount,
        @Nullable Output<Integer> sshPort,
        @Nullable Output<String> virtualMachineSize) {
        this.address = address;
        this.administratorAccount = administratorAccount;
        this.sshPort = sshPort;
        this.virtualMachineSize = virtualMachineSize;
    }

    private VirtualMachinePropertiesArgs() {
        this.address = Output.empty();
        this.administratorAccount = Output.empty();
        this.sshPort = Output.empty();
        this.virtualMachineSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachinePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<VirtualMachineSshCredentialsArgs> administratorAccount;
        private @Nullable Output<Integer> sshPort;
        private @Nullable Output<String> virtualMachineSize;

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

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }

        public Builder address(@Nullable String address) {
            this.address = Output.ofNullable(address);
            return this;
        }

        public Builder administratorAccount(@Nullable Output<VirtualMachineSshCredentialsArgs> administratorAccount) {
            this.administratorAccount = administratorAccount;
            return this;
        }

        public Builder administratorAccount(@Nullable VirtualMachineSshCredentialsArgs administratorAccount) {
            this.administratorAccount = Output.ofNullable(administratorAccount);
            return this;
        }

        public Builder sshPort(@Nullable Output<Integer> sshPort) {
            this.sshPort = sshPort;
            return this;
        }

        public Builder sshPort(@Nullable Integer sshPort) {
            this.sshPort = Output.ofNullable(sshPort);
            return this;
        }

        public Builder virtualMachineSize(@Nullable Output<String> virtualMachineSize) {
            this.virtualMachineSize = virtualMachineSize;
            return this;
        }

        public Builder virtualMachineSize(@Nullable String virtualMachineSize) {
            this.virtualMachineSize = Output.ofNullable(virtualMachineSize);
            return this;
        }
        public VirtualMachinePropertiesArgs build() {
            return new VirtualMachinePropertiesArgs(address, administratorAccount, sshPort, virtualMachineSize);
        }
    }
}
