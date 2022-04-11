// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesAdditionalExtensionArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesCaOptionsArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesPolicyIdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateTemplatePredefinedValuesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePredefinedValuesArgs Empty = new CertificateTemplatePredefinedValuesArgs();

    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    @Import(name="additionalExtensions")
      private final @Nullable Output<List<CertificateTemplatePredefinedValuesAdditionalExtensionArgs>> additionalExtensions;

    public Output<List<CertificateTemplatePredefinedValuesAdditionalExtensionArgs>> getAdditionalExtensions() {
        return this.additionalExtensions == null ? Codegen.empty() : this.additionalExtensions;
    }

    /**
     * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate.
     * 
     */
    @Import(name="aiaOcspServers")
      private final @Nullable Output<List<String>> aiaOcspServers;

    public Output<List<String>> getAiaOcspServers() {
        return this.aiaOcspServers == null ? Codegen.empty() : this.aiaOcspServers;
    }

    /**
     * Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
     * 
     */
    @Import(name="caOptions")
      private final @Nullable Output<CertificateTemplatePredefinedValuesCaOptionsArgs> caOptions;

    public Output<CertificateTemplatePredefinedValuesCaOptionsArgs> getCaOptions() {
        return this.caOptions == null ? Codegen.empty() : this.caOptions;
    }

    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    @Import(name="keyUsage")
      private final @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageArgs> keyUsage;

    public Output<CertificateTemplatePredefinedValuesKeyUsageArgs> getKeyUsage() {
        return this.keyUsage == null ? Codegen.empty() : this.keyUsage;
    }

    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    @Import(name="policyIds")
      private final @Nullable Output<List<CertificateTemplatePredefinedValuesPolicyIdArgs>> policyIds;

    public Output<List<CertificateTemplatePredefinedValuesPolicyIdArgs>> getPolicyIds() {
        return this.policyIds == null ? Codegen.empty() : this.policyIds;
    }

    public CertificateTemplatePredefinedValuesArgs(
        @Nullable Output<List<CertificateTemplatePredefinedValuesAdditionalExtensionArgs>> additionalExtensions,
        @Nullable Output<List<String>> aiaOcspServers,
        @Nullable Output<CertificateTemplatePredefinedValuesCaOptionsArgs> caOptions,
        @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageArgs> keyUsage,
        @Nullable Output<List<CertificateTemplatePredefinedValuesPolicyIdArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = keyUsage;
        this.policyIds = policyIds;
    }

    private CertificateTemplatePredefinedValuesArgs() {
        this.additionalExtensions = Codegen.empty();
        this.aiaOcspServers = Codegen.empty();
        this.caOptions = Codegen.empty();
        this.keyUsage = Codegen.empty();
        this.policyIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CertificateTemplatePredefinedValuesAdditionalExtensionArgs>> additionalExtensions;
        private @Nullable Output<List<String>> aiaOcspServers;
        private @Nullable Output<CertificateTemplatePredefinedValuesCaOptionsArgs> caOptions;
        private @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageArgs> keyUsage;
        private @Nullable Output<List<CertificateTemplatePredefinedValuesPolicyIdArgs>> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder additionalExtensions(@Nullable Output<List<CertificateTemplatePredefinedValuesAdditionalExtensionArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }
        public Builder additionalExtensions(@Nullable List<CertificateTemplatePredefinedValuesAdditionalExtensionArgs> additionalExtensions) {
            this.additionalExtensions = Codegen.ofNullable(additionalExtensions);
            return this;
        }
        public Builder additionalExtensions(CertificateTemplatePredefinedValuesAdditionalExtensionArgs... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }
        public Builder aiaOcspServers(@Nullable Output<List<String>> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }
        public Builder aiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = Codegen.ofNullable(aiaOcspServers);
            return this;
        }
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }
        public Builder caOptions(@Nullable Output<CertificateTemplatePredefinedValuesCaOptionsArgs> caOptions) {
            this.caOptions = caOptions;
            return this;
        }
        public Builder caOptions(@Nullable CertificateTemplatePredefinedValuesCaOptionsArgs caOptions) {
            this.caOptions = Codegen.ofNullable(caOptions);
            return this;
        }
        public Builder keyUsage(@Nullable Output<CertificateTemplatePredefinedValuesKeyUsageArgs> keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public Builder keyUsage(@Nullable CertificateTemplatePredefinedValuesKeyUsageArgs keyUsage) {
            this.keyUsage = Codegen.ofNullable(keyUsage);
            return this;
        }
        public Builder policyIds(@Nullable Output<List<CertificateTemplatePredefinedValuesPolicyIdArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public Builder policyIds(@Nullable List<CertificateTemplatePredefinedValuesPolicyIdArgs> policyIds) {
            this.policyIds = Codegen.ofNullable(policyIds);
            return this;
        }
        public Builder policyIds(CertificateTemplatePredefinedValuesPolicyIdArgs... policyIds) {
            return policyIds(List.of(policyIds));
        }        public CertificateTemplatePredefinedValuesArgs build() {
            return new CertificateTemplatePredefinedValuesArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
