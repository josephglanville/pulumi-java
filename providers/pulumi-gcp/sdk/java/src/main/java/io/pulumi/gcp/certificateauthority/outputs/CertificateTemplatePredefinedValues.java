// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateTemplatePredefinedValuesAdditionalExtension;
import io.pulumi.gcp.certificateauthority.outputs.CertificateTemplatePredefinedValuesCaOptions;
import io.pulumi.gcp.certificateauthority.outputs.CertificateTemplatePredefinedValuesKeyUsage;
import io.pulumi.gcp.certificateauthority.outputs.CertificateTemplatePredefinedValuesPolicyId;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateTemplatePredefinedValues {
    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    private final @Nullable List<CertificateTemplatePredefinedValuesAdditionalExtension> additionalExtensions;
    /**
     * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate.
     * 
     */
    private final @Nullable List<String> aiaOcspServers;
    /**
     * Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
     * 
     */
    private final @Nullable CertificateTemplatePredefinedValuesCaOptions caOptions;
    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    private final @Nullable CertificateTemplatePredefinedValuesKeyUsage keyUsage;
    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    private final @Nullable List<CertificateTemplatePredefinedValuesPolicyId> policyIds;

    @CustomType.Constructor
    private CertificateTemplatePredefinedValues(
        @CustomType.Parameter("additionalExtensions") @Nullable List<CertificateTemplatePredefinedValuesAdditionalExtension> additionalExtensions,
        @CustomType.Parameter("aiaOcspServers") @Nullable List<String> aiaOcspServers,
        @CustomType.Parameter("caOptions") @Nullable CertificateTemplatePredefinedValuesCaOptions caOptions,
        @CustomType.Parameter("keyUsage") @Nullable CertificateTemplatePredefinedValuesKeyUsage keyUsage,
        @CustomType.Parameter("policyIds") @Nullable List<CertificateTemplatePredefinedValuesPolicyId> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = keyUsage;
        this.policyIds = policyIds;
    }

    /**
     * Optional. Describes custom X.509 extensions.
     * 
    */
    public List<CertificateTemplatePredefinedValuesAdditionalExtension> getAdditionalExtensions() {
        return this.additionalExtensions == null ? List.of() : this.additionalExtensions;
    }
    /**
     * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate.
     * 
    */
    public List<String> getAiaOcspServers() {
        return this.aiaOcspServers == null ? List.of() : this.aiaOcspServers;
    }
    /**
     * Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
     * 
    */
    public Optional<CertificateTemplatePredefinedValuesCaOptions> getCaOptions() {
        return Optional.ofNullable(this.caOptions);
    }
    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
    */
    public Optional<CertificateTemplatePredefinedValuesKeyUsage> getKeyUsage() {
        return Optional.ofNullable(this.keyUsage);
    }
    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
    */
    public List<CertificateTemplatePredefinedValuesPolicyId> getPolicyIds() {
        return this.policyIds == null ? List.of() : this.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValues defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CertificateTemplatePredefinedValuesAdditionalExtension> additionalExtensions;
        private @Nullable List<String> aiaOcspServers;
        private @Nullable CertificateTemplatePredefinedValuesCaOptions caOptions;
        private @Nullable CertificateTemplatePredefinedValuesKeyUsage keyUsage;
        private @Nullable List<CertificateTemplatePredefinedValuesPolicyId> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValues defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder additionalExtensions(@Nullable List<CertificateTemplatePredefinedValuesAdditionalExtension> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }
        public Builder additionalExtensions(CertificateTemplatePredefinedValuesAdditionalExtension... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }
        public Builder aiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }
        public Builder caOptions(@Nullable CertificateTemplatePredefinedValuesCaOptions caOptions) {
            this.caOptions = caOptions;
            return this;
        }
        public Builder keyUsage(@Nullable CertificateTemplatePredefinedValuesKeyUsage keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public Builder policyIds(@Nullable List<CertificateTemplatePredefinedValuesPolicyId> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public Builder policyIds(CertificateTemplatePredefinedValuesPolicyId... policyIds) {
            return policyIds(List.of(policyIds));
        }        public CertificateTemplatePredefinedValues build() {
            return new CertificateTemplatePredefinedValues(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
