// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options relating to the publication of each CertificateAuthority's CA certificate and CRLs and their inclusion as extensions in issued Certificates. The options set here apply to certificates issued by any CertificateAuthority in the CaPool.
 * 
 */
public final class PublishingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublishingOptionsArgs Empty = new PublishingOptionsArgs();

    /**
     * Optional. When true, publishes each CertificateAuthority's CA certificate and includes its URL in the "Authority Information Access" X.509 extension in all issued Certificates. If this is false, the CA certificate will not be published and the corresponding X.509 extension will not be written in issued certificates.
     * 
     */
    @Import(name="publishCaCert")
      private final @Nullable Output<Boolean> publishCaCert;

    public Output<Boolean> getPublishCaCert() {
        return this.publishCaCert == null ? Output.empty() : this.publishCaCert;
    }

    /**
     * Optional. When true, publishes each CertificateAuthority's CRL and includes its URL in the "CRL Distribution Points" X.509 extension in all issued Certificates. If this is false, CRLs will not be published and the corresponding X.509 extension will not be written in issued certificates. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
     * 
     */
    @Import(name="publishCrl")
      private final @Nullable Output<Boolean> publishCrl;

    public Output<Boolean> getPublishCrl() {
        return this.publishCrl == null ? Output.empty() : this.publishCrl;
    }

    public PublishingOptionsArgs(
        @Nullable Output<Boolean> publishCaCert,
        @Nullable Output<Boolean> publishCrl) {
        this.publishCaCert = publishCaCert;
        this.publishCrl = publishCrl;
    }

    private PublishingOptionsArgs() {
        this.publishCaCert = Output.empty();
        this.publishCrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublishingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> publishCaCert;
        private @Nullable Output<Boolean> publishCrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PublishingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishCaCert = defaults.publishCaCert;
    	      this.publishCrl = defaults.publishCrl;
        }

        public Builder publishCaCert(@Nullable Output<Boolean> publishCaCert) {
            this.publishCaCert = publishCaCert;
            return this;
        }
        public Builder publishCaCert(@Nullable Boolean publishCaCert) {
            this.publishCaCert = Output.ofNullable(publishCaCert);
            return this;
        }
        public Builder publishCrl(@Nullable Output<Boolean> publishCrl) {
            this.publishCrl = publishCrl;
            return this;
        }
        public Builder publishCrl(@Nullable Boolean publishCrl) {
            this.publishCrl = Output.ofNullable(publishCrl);
            return this;
        }        public PublishingOptionsArgs build() {
            return new PublishingOptionsArgs(publishCaCert, publishCrl);
        }
    }
}
