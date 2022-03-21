// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.inputs;

import io.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationCrlConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateAuthorityRevocationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityRevocationConfigurationArgs Empty = new CertificateAuthorityRevocationConfigurationArgs();

    /**
     * Nested argument containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority. Defined below.
     * 
     */
    @Import(name="crlConfiguration")
      private final @Nullable Output<CertificateAuthorityRevocationConfigurationCrlConfigurationArgs> crlConfiguration;

    public Output<CertificateAuthorityRevocationConfigurationCrlConfigurationArgs> getCrlConfiguration() {
        return this.crlConfiguration == null ? Output.empty() : this.crlConfiguration;
    }

    public CertificateAuthorityRevocationConfigurationArgs(@Nullable Output<CertificateAuthorityRevocationConfigurationCrlConfigurationArgs> crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
    }

    private CertificateAuthorityRevocationConfigurationArgs() {
        this.crlConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityRevocationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CertificateAuthorityRevocationConfigurationCrlConfigurationArgs> crlConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityRevocationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crlConfiguration = defaults.crlConfiguration;
        }

        public Builder crlConfiguration(@Nullable Output<CertificateAuthorityRevocationConfigurationCrlConfigurationArgs> crlConfiguration) {
            this.crlConfiguration = crlConfiguration;
            return this;
        }
        public Builder crlConfiguration(@Nullable CertificateAuthorityRevocationConfigurationCrlConfigurationArgs crlConfiguration) {
            this.crlConfiguration = Output.ofNullable(crlConfiguration);
            return this;
        }        public CertificateAuthorityRevocationConfigurationArgs build() {
            return new CertificateAuthorityRevocationConfigurationArgs(crlConfiguration);
        }
    }
}
