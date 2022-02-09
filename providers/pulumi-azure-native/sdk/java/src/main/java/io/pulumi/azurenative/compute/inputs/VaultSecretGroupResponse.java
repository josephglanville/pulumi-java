// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SubResourceResponse;
import io.pulumi.azurenative.compute.inputs.VaultCertificateResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VaultSecretGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final VaultSecretGroupResponse Empty = new VaultSecretGroupResponse();

    @InputImport(name="sourceVault")
    private final @Nullable SubResourceResponse sourceVault;

    public Optional<SubResourceResponse> getSourceVault() {
        return this.sourceVault == null ? Optional.empty() : Optional.ofNullable(this.sourceVault);
    }

    @InputImport(name="vaultCertificates")
    private final @Nullable List<VaultCertificateResponse> vaultCertificates;

    public List<VaultCertificateResponse> getVaultCertificates() {
        return this.vaultCertificates == null ? List.of() : this.vaultCertificates;
    }

    public VaultSecretGroupResponse(
        @Nullable SubResourceResponse sourceVault,
        @Nullable List<VaultCertificateResponse> vaultCertificates) {
        this.sourceVault = sourceVault;
        this.vaultCertificates = vaultCertificates;
    }

    private VaultSecretGroupResponse() {
        this.sourceVault = null;
        this.vaultCertificates = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultSecretGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse sourceVault;
        private @Nullable List<VaultCertificateResponse> vaultCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultSecretGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceVault = defaults.sourceVault;
    	      this.vaultCertificates = defaults.vaultCertificates;
        }

        public Builder setSourceVault(@Nullable SubResourceResponse sourceVault) {
            this.sourceVault = sourceVault;
            return this;
        }

        public Builder setVaultCertificates(@Nullable List<VaultCertificateResponse> vaultCertificates) {
            this.vaultCertificates = vaultCertificates;
            return this;
        }

        public VaultSecretGroupResponse build() {
            return new VaultSecretGroupResponse(sourceVault, vaultCertificates);
        }
    }
}
