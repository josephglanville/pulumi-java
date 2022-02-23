// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.SubResourceArgs;
import io.pulumi.azurenative.servicefabric.inputs.VaultCertificateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * Specifies set of certificates that should be installed onto the virtual machines.
 * 
 */
public final class VaultSecretGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultSecretGroupArgs Empty = new VaultSecretGroupArgs();

    /**
     * The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     * 
     */
    @InputImport(name="sourceVault", required=true)
      private final Input<SubResourceArgs> sourceVault;

    public Input<SubResourceArgs> getSourceVault() {
        return this.sourceVault;
    }

    /**
     * The list of key vault references in SourceVault which contain certificates.
     * 
     */
    @InputImport(name="vaultCertificates", required=true)
      private final Input<List<VaultCertificateArgs>> vaultCertificates;

    public Input<List<VaultCertificateArgs>> getVaultCertificates() {
        return this.vaultCertificates;
    }

    public VaultSecretGroupArgs(
        Input<SubResourceArgs> sourceVault,
        Input<List<VaultCertificateArgs>> vaultCertificates) {
        this.sourceVault = Objects.requireNonNull(sourceVault, "expected parameter 'sourceVault' to be non-null");
        this.vaultCertificates = Objects.requireNonNull(vaultCertificates, "expected parameter 'vaultCertificates' to be non-null");
    }

    private VaultSecretGroupArgs() {
        this.sourceVault = Input.empty();
        this.vaultCertificates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultSecretGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SubResourceArgs> sourceVault;
        private Input<List<VaultCertificateArgs>> vaultCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultSecretGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceVault = defaults.sourceVault;
    	      this.vaultCertificates = defaults.vaultCertificates;
        }

        public Builder setSourceVault(Input<SubResourceArgs> sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }

        public Builder setSourceVault(SubResourceArgs sourceVault) {
            this.sourceVault = Input.of(Objects.requireNonNull(sourceVault));
            return this;
        }

        public Builder setVaultCertificates(Input<List<VaultCertificateArgs>> vaultCertificates) {
            this.vaultCertificates = Objects.requireNonNull(vaultCertificates);
            return this;
        }

        public Builder setVaultCertificates(List<VaultCertificateArgs> vaultCertificates) {
            this.vaultCertificates = Input.of(Objects.requireNonNull(vaultCertificates));
            return this;
        }
        public VaultSecretGroupArgs build() {
            return new VaultSecretGroupArgs(sourceVault, vaultCertificates);
        }
    }
}
