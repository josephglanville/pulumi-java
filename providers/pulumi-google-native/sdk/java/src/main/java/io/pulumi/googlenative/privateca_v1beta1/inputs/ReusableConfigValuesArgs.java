// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.privateca_v1beta1.inputs.CaOptionsArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.KeyUsageArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ObjectIdArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.X509ExtensionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A ReusableConfigValues is used to describe certain fields of an X.509 certificate, such as the key usage fields, fields specific to CA certificates, certificate policy extensions and custom extensions.
 * 
 */
public final class ReusableConfigValuesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReusableConfigValuesArgs Empty = new ReusableConfigValuesArgs();

    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    @Import(name="additionalExtensions")
      private final @Nullable Output<List<X509ExtensionArgs>> additionalExtensions;

    public Output<List<X509ExtensionArgs>> getAdditionalExtensions() {
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
     * Optional. Describes options in this ReusableConfigValues that are relevant in a CA certificate.
     * 
     */
    @Import(name="caOptions")
      private final @Nullable Output<CaOptionsArgs> caOptions;

    public Output<CaOptionsArgs> getCaOptions() {
        return this.caOptions == null ? Codegen.empty() : this.caOptions;
    }

    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    @Import(name="keyUsage")
      private final @Nullable Output<KeyUsageArgs> keyUsage;

    public Output<KeyUsageArgs> getKeyUsage() {
        return this.keyUsage == null ? Codegen.empty() : this.keyUsage;
    }

    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    @Import(name="policyIds")
      private final @Nullable Output<List<ObjectIdArgs>> policyIds;

    public Output<List<ObjectIdArgs>> getPolicyIds() {
        return this.policyIds == null ? Codegen.empty() : this.policyIds;
    }

    public ReusableConfigValuesArgs(
        @Nullable Output<List<X509ExtensionArgs>> additionalExtensions,
        @Nullable Output<List<String>> aiaOcspServers,
        @Nullable Output<CaOptionsArgs> caOptions,
        @Nullable Output<KeyUsageArgs> keyUsage,
        @Nullable Output<List<ObjectIdArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = keyUsage;
        this.policyIds = policyIds;
    }

    private ReusableConfigValuesArgs() {
        this.additionalExtensions = Codegen.empty();
        this.aiaOcspServers = Codegen.empty();
        this.caOptions = Codegen.empty();
        this.keyUsage = Codegen.empty();
        this.policyIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReusableConfigValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<X509ExtensionArgs>> additionalExtensions;
        private @Nullable Output<List<String>> aiaOcspServers;
        private @Nullable Output<CaOptionsArgs> caOptions;
        private @Nullable Output<KeyUsageArgs> keyUsage;
        private @Nullable Output<List<ObjectIdArgs>> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ReusableConfigValuesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder additionalExtensions(@Nullable Output<List<X509ExtensionArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }
        public Builder additionalExtensions(@Nullable List<X509ExtensionArgs> additionalExtensions) {
            this.additionalExtensions = Codegen.ofNullable(additionalExtensions);
            return this;
        }
        public Builder additionalExtensions(X509ExtensionArgs... additionalExtensions) {
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
        public Builder caOptions(@Nullable Output<CaOptionsArgs> caOptions) {
            this.caOptions = caOptions;
            return this;
        }
        public Builder caOptions(@Nullable CaOptionsArgs caOptions) {
            this.caOptions = Codegen.ofNullable(caOptions);
            return this;
        }
        public Builder keyUsage(@Nullable Output<KeyUsageArgs> keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public Builder keyUsage(@Nullable KeyUsageArgs keyUsage) {
            this.keyUsage = Codegen.ofNullable(keyUsage);
            return this;
        }
        public Builder policyIds(@Nullable Output<List<ObjectIdArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public Builder policyIds(@Nullable List<ObjectIdArgs> policyIds) {
            this.policyIds = Codegen.ofNullable(policyIds);
            return this;
        }
        public Builder policyIds(ObjectIdArgs... policyIds) {
            return policyIds(List.of(policyIds));
        }        public ReusableConfigValuesArgs build() {
            return new ReusableConfigValuesArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
