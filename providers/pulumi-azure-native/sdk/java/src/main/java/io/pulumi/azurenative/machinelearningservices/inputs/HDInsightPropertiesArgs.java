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


public final class HDInsightPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final HDInsightPropertiesArgs Empty = new HDInsightPropertiesArgs();

    /**
     * Public IP address of the master node of the cluster.
     * 
     */
    @InputImport(name="address")
      private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    /**
     * Admin credentials for master node of the cluster
     * 
     */
    @InputImport(name="administratorAccount")
      private final @Nullable Input<VirtualMachineSshCredentialsArgs> administratorAccount;

    public Input<VirtualMachineSshCredentialsArgs> getAdministratorAccount() {
        return this.administratorAccount == null ? Input.empty() : this.administratorAccount;
    }

    /**
     * Port open for ssh connections on the master node of the cluster.
     * 
     */
    @InputImport(name="sshPort")
      private final @Nullable Input<Integer> sshPort;

    public Input<Integer> getSshPort() {
        return this.sshPort == null ? Input.empty() : this.sshPort;
    }

    public HDInsightPropertiesArgs(
        @Nullable Input<String> address,
        @Nullable Input<VirtualMachineSshCredentialsArgs> administratorAccount,
        @Nullable Input<Integer> sshPort) {
        this.address = address;
        this.administratorAccount = administratorAccount;
        this.sshPort = sshPort;
    }

    private HDInsightPropertiesArgs() {
        this.address = Input.empty();
        this.administratorAccount = Input.empty();
        this.sshPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<VirtualMachineSshCredentialsArgs> administratorAccount;
        private @Nullable Input<Integer> sshPort;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.administratorAccount = defaults.administratorAccount;
    	      this.sshPort = defaults.sshPort;
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
        public HDInsightPropertiesArgs build() {
            return new HDInsightPropertiesArgs(address, administratorAccount, sshPort);
        }
    }
}
