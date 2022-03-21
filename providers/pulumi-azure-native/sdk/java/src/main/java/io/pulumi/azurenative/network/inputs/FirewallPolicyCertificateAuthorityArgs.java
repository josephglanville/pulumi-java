// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trusted Root certificates properties for tls.
 * 
 */
public final class FirewallPolicyCertificateAuthorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyCertificateAuthorityArgs Empty = new FirewallPolicyCertificateAuthorityArgs();

    /**
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
     */
    @Import(name="keyVaultSecretId")
      private final @Nullable Output<String> keyVaultSecretId;

    public Output<String> getKeyVaultSecretId() {
        return this.keyVaultSecretId == null ? Output.empty() : this.keyVaultSecretId;
    }

    /**
     * Name of the CA certificate.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public FirewallPolicyCertificateAuthorityArgs(
        @Nullable Output<String> keyVaultSecretId,
        @Nullable Output<String> name) {
        this.keyVaultSecretId = keyVaultSecretId;
        this.name = name;
    }

    private FirewallPolicyCertificateAuthorityArgs() {
        this.keyVaultSecretId = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyCertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyVaultSecretId;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyCertificateAuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
        }

        public Builder keyVaultSecretId(@Nullable Output<String> keyVaultSecretId) {
            this.keyVaultSecretId = keyVaultSecretId;
            return this;
        }
        public Builder keyVaultSecretId(@Nullable String keyVaultSecretId) {
            this.keyVaultSecretId = Output.ofNullable(keyVaultSecretId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public FirewallPolicyCertificateAuthorityArgs build() {
            return new FirewallPolicyCertificateAuthorityArgs(keyVaultSecretId, name);
        }
    }
}
