// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.inputs.SshConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinuxConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinuxConfigurationArgs Empty = new LinuxConfigurationArgs();

    @InputImport(name="ssh")
    private final @Nullable Input<SshConfigurationArgs> ssh;

    public Input<SshConfigurationArgs> getSsh() {
        return this.ssh == null ? Input.empty() : this.ssh;
    }

    public LinuxConfigurationArgs(@Nullable Input<SshConfigurationArgs> ssh) {
        this.ssh = ssh;
    }

    private LinuxConfigurationArgs() {
        this.ssh = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SshConfigurationArgs> ssh;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssh = defaults.ssh;
        }

        public Builder setSsh(@Nullable Input<SshConfigurationArgs> ssh) {
            this.ssh = ssh;
            return this;
        }

        public Builder setSsh(@Nullable SshConfigurationArgs ssh) {
            this.ssh = Input.ofNullable(ssh);
            return this;
        }

        public LinuxConfigurationArgs build() {
            return new LinuxConfigurationArgs(ssh);
        }
    }
}
