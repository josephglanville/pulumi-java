// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AzureNodePoolConfigSshConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolConfigSshConfigGetArgs Empty = new AzureNodePoolConfigSshConfigGetArgs();

    /**
     * Required. The SSH public key data for VMs managed by Anthos. This accepts the authorized_keys file format used in OpenSSH according to the sshd(8) manual page.
     * 
     */
    @Import(name="authorizedKey", required=true)
      private final Output<String> authorizedKey;

    public Output<String> getAuthorizedKey() {
        return this.authorizedKey;
    }

    public AzureNodePoolConfigSshConfigGetArgs(Output<String> authorizedKey) {
        this.authorizedKey = Objects.requireNonNull(authorizedKey, "expected parameter 'authorizedKey' to be non-null");
    }

    private AzureNodePoolConfigSshConfigGetArgs() {
        this.authorizedKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolConfigSshConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authorizedKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolConfigSshConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedKey = defaults.authorizedKey;
        }

        public Builder authorizedKey(Output<String> authorizedKey) {
            this.authorizedKey = Objects.requireNonNull(authorizedKey);
            return this;
        }
        public Builder authorizedKey(String authorizedKey) {
            this.authorizedKey = Output.of(Objects.requireNonNull(authorizedKey));
            return this;
        }        public AzureNodePoolConfigSshConfigGetArgs build() {
            return new AzureNodePoolConfigSshConfigGetArgs(authorizedKey);
        }
    }
}
