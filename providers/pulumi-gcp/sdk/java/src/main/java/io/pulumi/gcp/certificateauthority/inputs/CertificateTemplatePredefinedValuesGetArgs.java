// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesAdditionalExtensionGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesCaOptionsGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesPolicyIdGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateTemplatePredefinedValuesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePredefinedValuesGetArgs Empty = new CertificateTemplatePredefinedValuesGetArgs();

    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    @InputImport(name="additionalExtensions")
      private final @Nullable Input<List<CertificateTemplatePredefinedValuesAdditionalExtensionGetArgs>> additionalExtensions;

    public Input<List<CertificateTemplatePredefinedValuesAdditionalExtensionGetArgs>> getAdditionalExtensions() {
        return this.additionalExtensions == null ? Input.empty() : this.additionalExtensions;
    }

    /**
     * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate.
     * 
     */
    @InputImport(name="aiaOcspServers")
      private final @Nullable Input<List<String>> aiaOcspServers;

    public Input<List<String>> getAiaOcspServers() {
        return this.aiaOcspServers == null ? Input.empty() : this.aiaOcspServers;
    }

    /**
     * Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
     * 
     */
    @InputImport(name="caOptions")
      private final @Nullable Input<CertificateTemplatePredefinedValuesCaOptionsGetArgs> caOptions;

    public Input<CertificateTemplatePredefinedValuesCaOptionsGetArgs> getCaOptions() {
        return this.caOptions == null ? Input.empty() : this.caOptions;
    }

    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    @InputImport(name="keyUsage")
      private final @Nullable Input<CertificateTemplatePredefinedValuesKeyUsageGetArgs> keyUsage;

    public Input<CertificateTemplatePredefinedValuesKeyUsageGetArgs> getKeyUsage() {
        return this.keyUsage == null ? Input.empty() : this.keyUsage;
    }

    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    @InputImport(name="policyIds")
      private final @Nullable Input<List<CertificateTemplatePredefinedValuesPolicyIdGetArgs>> policyIds;

    public Input<List<CertificateTemplatePredefinedValuesPolicyIdGetArgs>> getPolicyIds() {
        return this.policyIds == null ? Input.empty() : this.policyIds;
    }

    public CertificateTemplatePredefinedValuesGetArgs(
        @Nullable Input<List<CertificateTemplatePredefinedValuesAdditionalExtensionGetArgs>> additionalExtensions,
        @Nullable Input<List<String>> aiaOcspServers,
        @Nullable Input<CertificateTemplatePredefinedValuesCaOptionsGetArgs> caOptions,
        @Nullable Input<CertificateTemplatePredefinedValuesKeyUsageGetArgs> keyUsage,
        @Nullable Input<List<CertificateTemplatePredefinedValuesPolicyIdGetArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = keyUsage;
        this.policyIds = policyIds;
    }

    private CertificateTemplatePredefinedValuesGetArgs() {
        this.additionalExtensions = Input.empty();
        this.aiaOcspServers = Input.empty();
        this.caOptions = Input.empty();
        this.keyUsage = Input.empty();
        this.policyIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CertificateTemplatePredefinedValuesAdditionalExtensionGetArgs>> additionalExtensions;
        private @Nullable Input<List<String>> aiaOcspServers;
        private @Nullable Input<CertificateTemplatePredefinedValuesCaOptionsGetArgs> caOptions;
        private @Nullable Input<CertificateTemplatePredefinedValuesKeyUsageGetArgs> keyUsage;
        private @Nullable Input<List<CertificateTemplatePredefinedValuesPolicyIdGetArgs>> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder setAdditionalExtensions(@Nullable Input<List<CertificateTemplatePredefinedValuesAdditionalExtensionGetArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder setAdditionalExtensions(@Nullable List<CertificateTemplatePredefinedValuesAdditionalExtensionGetArgs> additionalExtensions) {
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

        public Builder setCaOptions(@Nullable Input<CertificateTemplatePredefinedValuesCaOptionsGetArgs> caOptions) {
            this.caOptions = caOptions;
            return this;
        }

        public Builder setCaOptions(@Nullable CertificateTemplatePredefinedValuesCaOptionsGetArgs caOptions) {
            this.caOptions = Input.ofNullable(caOptions);
            return this;
        }

        public Builder setKeyUsage(@Nullable Input<CertificateTemplatePredefinedValuesKeyUsageGetArgs> keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        public Builder setKeyUsage(@Nullable CertificateTemplatePredefinedValuesKeyUsageGetArgs keyUsage) {
            this.keyUsage = Input.ofNullable(keyUsage);
            return this;
        }

        public Builder setPolicyIds(@Nullable Input<List<CertificateTemplatePredefinedValuesPolicyIdGetArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }

        public Builder setPolicyIds(@Nullable List<CertificateTemplatePredefinedValuesPolicyIdGetArgs> policyIds) {
            this.policyIds = Input.ofNullable(policyIds);
            return this;
        }
        public CertificateTemplatePredefinedValuesGetArgs build() {
            return new CertificateTemplatePredefinedValuesGetArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
