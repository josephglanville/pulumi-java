// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigAdditionalExtensionGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigCaOptionsGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigPolicyIdGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateConfigX509ConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigGetArgs Empty = new CertificateConfigX509ConfigGetArgs();

    /**
     * Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    @InputImport(name="additionalExtensions")
      private final @Nullable Input<List<CertificateConfigX509ConfigAdditionalExtensionGetArgs>> additionalExtensions;

    public Input<List<CertificateConfigX509ConfigAdditionalExtensionGetArgs>> getAdditionalExtensions() {
        return this.additionalExtensions == null ? Input.empty() : this.additionalExtensions;
    }

    /**
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * "Authority Information Access" extension in the certificate.
     * 
     */
    @InputImport(name="aiaOcspServers")
      private final @Nullable Input<List<String>> aiaOcspServers;

    public Input<List<String>> getAiaOcspServers() {
        return this.aiaOcspServers == null ? Input.empty() : this.aiaOcspServers;
    }

    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @InputImport(name="caOptions")
      private final @Nullable Input<CertificateConfigX509ConfigCaOptionsGetArgs> caOptions;

    public Input<CertificateConfigX509ConfigCaOptionsGetArgs> getCaOptions() {
        return this.caOptions == null ? Input.empty() : this.caOptions;
    }

    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    @InputImport(name="keyUsage", required=true)
      private final Input<CertificateConfigX509ConfigKeyUsageGetArgs> keyUsage;

    public Input<CertificateConfigX509ConfigKeyUsageGetArgs> getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    @InputImport(name="policyIds")
      private final @Nullable Input<List<CertificateConfigX509ConfigPolicyIdGetArgs>> policyIds;

    public Input<List<CertificateConfigX509ConfigPolicyIdGetArgs>> getPolicyIds() {
        return this.policyIds == null ? Input.empty() : this.policyIds;
    }

    public CertificateConfigX509ConfigGetArgs(
        @Nullable Input<List<CertificateConfigX509ConfigAdditionalExtensionGetArgs>> additionalExtensions,
        @Nullable Input<List<String>> aiaOcspServers,
        @Nullable Input<CertificateConfigX509ConfigCaOptionsGetArgs> caOptions,
        Input<CertificateConfigX509ConfigKeyUsageGetArgs> keyUsage,
        @Nullable Input<List<CertificateConfigX509ConfigPolicyIdGetArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = Objects.requireNonNull(keyUsage, "expected parameter 'keyUsage' to be non-null");
        this.policyIds = policyIds;
    }

    private CertificateConfigX509ConfigGetArgs() {
        this.additionalExtensions = Input.empty();
        this.aiaOcspServers = Input.empty();
        this.caOptions = Input.empty();
        this.keyUsage = Input.empty();
        this.policyIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigX509ConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CertificateConfigX509ConfigAdditionalExtensionGetArgs>> additionalExtensions;
        private @Nullable Input<List<String>> aiaOcspServers;
        private @Nullable Input<CertificateConfigX509ConfigCaOptionsGetArgs> caOptions;
        private Input<CertificateConfigX509ConfigKeyUsageGetArgs> keyUsage;
        private @Nullable Input<List<CertificateConfigX509ConfigPolicyIdGetArgs>> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigX509ConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder setAdditionalExtensions(@Nullable Input<List<CertificateConfigX509ConfigAdditionalExtensionGetArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder setAdditionalExtensions(@Nullable List<CertificateConfigX509ConfigAdditionalExtensionGetArgs> additionalExtensions) {
            this.additionalExtensions = Input.ofNullable(additionalExtensions);
            return this;
        }

        public Builder setAiaOcspServers(@Nullable Input<List<String>> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }

        public Builder setAiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = Input.ofNullable(aiaOcspServers);
            return this;
        }

        public Builder setCaOptions(@Nullable Input<CertificateConfigX509ConfigCaOptionsGetArgs> caOptions) {
            this.caOptions = caOptions;
            return this;
        }

        public Builder setCaOptions(@Nullable CertificateConfigX509ConfigCaOptionsGetArgs caOptions) {
            this.caOptions = Input.ofNullable(caOptions);
            return this;
        }

        public Builder setKeyUsage(Input<CertificateConfigX509ConfigKeyUsageGetArgs> keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }

        public Builder setKeyUsage(CertificateConfigX509ConfigKeyUsageGetArgs keyUsage) {
            this.keyUsage = Input.of(Objects.requireNonNull(keyUsage));
            return this;
        }

        public Builder setPolicyIds(@Nullable Input<List<CertificateConfigX509ConfigPolicyIdGetArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }

        public Builder setPolicyIds(@Nullable List<CertificateConfigX509ConfigPolicyIdGetArgs> policyIds) {
            this.policyIds = Input.ofNullable(policyIds);
            return this;
        }
        public CertificateConfigX509ConfigGetArgs build() {
            return new CertificateConfigX509ConfigGetArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
