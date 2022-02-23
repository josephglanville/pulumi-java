// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.ContainerServiceSshConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Profile for Linux VMs in the container service cluster.
 * 
 */
public final class ContainerServiceLinuxProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerServiceLinuxProfileArgs Empty = new ContainerServiceLinuxProfileArgs();

    /**
     * The administrator username to use for Linux VMs.
     * 
     */
    @InputImport(name="adminUsername", required=true)
      private final Input<String> adminUsername;

    public Input<String> getAdminUsername() {
        return this.adminUsername;
    }

    /**
     * SSH configuration for Linux-based VMs running on Azure.
     * 
     */
    @InputImport(name="ssh", required=true)
      private final Input<ContainerServiceSshConfigurationArgs> ssh;

    public Input<ContainerServiceSshConfigurationArgs> getSsh() {
        return this.ssh;
    }

    public ContainerServiceLinuxProfileArgs(
        Input<String> adminUsername,
        Input<ContainerServiceSshConfigurationArgs> ssh) {
        this.adminUsername = Objects.requireNonNull(adminUsername, "expected parameter 'adminUsername' to be non-null");
        this.ssh = Objects.requireNonNull(ssh, "expected parameter 'ssh' to be non-null");
    }

    private ContainerServiceLinuxProfileArgs() {
        this.adminUsername = Input.empty();
        this.ssh = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceLinuxProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> adminUsername;
        private Input<ContainerServiceSshConfigurationArgs> ssh;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceLinuxProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsername = defaults.adminUsername;
    	      this.ssh = defaults.ssh;
        }

        public Builder setAdminUsername(Input<String> adminUsername) {
            this.adminUsername = Objects.requireNonNull(adminUsername);
            return this;
        }

        public Builder setAdminUsername(String adminUsername) {
            this.adminUsername = Input.of(Objects.requireNonNull(adminUsername));
            return this;
        }

        public Builder setSsh(Input<ContainerServiceSshConfigurationArgs> ssh) {
            this.ssh = Objects.requireNonNull(ssh);
            return this;
        }

        public Builder setSsh(ContainerServiceSshConfigurationArgs ssh) {
            this.ssh = Input.of(Objects.requireNonNull(ssh));
            return this;
        }
        public ContainerServiceLinuxProfileArgs build() {
            return new ContainerServiceLinuxProfileArgs(adminUsername, ssh);
        }
    }
}
