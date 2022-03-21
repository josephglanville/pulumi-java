// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.inputs.SshConfigurationResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the Linux operating system settings on the virtual machine.
 * 
 */
public final class LinuxConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinuxConfigurationResponse Empty = new LinuxConfigurationResponse();

    /**
     * Specifies the ssh key configuration for a Linux OS.
     * 
     */
    @Import(name="ssh")
      private final @Nullable SshConfigurationResponse ssh;

    public Optional<SshConfigurationResponse> getSsh() {
        return this.ssh == null ? Optional.empty() : Optional.ofNullable(this.ssh);
    }

    public LinuxConfigurationResponse(@Nullable SshConfigurationResponse ssh) {
        this.ssh = ssh;
    }

    private LinuxConfigurationResponse() {
        this.ssh = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SshConfigurationResponse ssh;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssh = defaults.ssh;
        }

        public Builder ssh(@Nullable SshConfigurationResponse ssh) {
            this.ssh = ssh;
            return this;
        }        public LinuxConfigurationResponse build() {
            return new LinuxConfigurationResponse(ssh);
        }
    }
}
