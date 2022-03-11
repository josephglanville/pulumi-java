// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.awsnative.acmpca.inputs.CertificateAuthorityAccessDescriptionArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificateAuthorityKeyUsageArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Structure that contains CSR pass though extensions information.
 * 
 */
public final class CertificateAuthorityCsrExtensionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityCsrExtensionsArgs Empty = new CertificateAuthorityCsrExtensionsArgs();

    @InputImport(name="keyUsage")
      private final @Nullable Output<CertificateAuthorityKeyUsageArgs> keyUsage;

    public Output<CertificateAuthorityKeyUsageArgs> getKeyUsage() {
        return this.keyUsage == null ? Output.empty() : this.keyUsage;
    }

    @InputImport(name="subjectInformationAccess")
      private final @Nullable Output<List<CertificateAuthorityAccessDescriptionArgs>> subjectInformationAccess;

    public Output<List<CertificateAuthorityAccessDescriptionArgs>> getSubjectInformationAccess() {
        return this.subjectInformationAccess == null ? Output.empty() : this.subjectInformationAccess;
    }

    public CertificateAuthorityCsrExtensionsArgs(
        @Nullable Output<CertificateAuthorityKeyUsageArgs> keyUsage,
        @Nullable Output<List<CertificateAuthorityAccessDescriptionArgs>> subjectInformationAccess) {
        this.keyUsage = keyUsage;
        this.subjectInformationAccess = subjectInformationAccess;
    }

    private CertificateAuthorityCsrExtensionsArgs() {
        this.keyUsage = Output.empty();
        this.subjectInformationAccess = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityCsrExtensionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CertificateAuthorityKeyUsageArgs> keyUsage;
        private @Nullable Output<List<CertificateAuthorityAccessDescriptionArgs>> subjectInformationAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityCsrExtensionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUsage = defaults.keyUsage;
    	      this.subjectInformationAccess = defaults.subjectInformationAccess;
        }

        public Builder keyUsage(@Nullable Output<CertificateAuthorityKeyUsageArgs> keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        public Builder keyUsage(@Nullable CertificateAuthorityKeyUsageArgs keyUsage) {
            this.keyUsage = Output.ofNullable(keyUsage);
            return this;
        }

        public Builder subjectInformationAccess(@Nullable Output<List<CertificateAuthorityAccessDescriptionArgs>> subjectInformationAccess) {
            this.subjectInformationAccess = subjectInformationAccess;
            return this;
        }

        public Builder subjectInformationAccess(@Nullable List<CertificateAuthorityAccessDescriptionArgs> subjectInformationAccess) {
            this.subjectInformationAccess = Output.ofNullable(subjectInformationAccess);
            return this;
        }
        public CertificateAuthorityCsrExtensionsArgs build() {
            return new CertificateAuthorityCsrExtensionsArgs(keyUsage, subjectInformationAccess);
        }
    }
}
