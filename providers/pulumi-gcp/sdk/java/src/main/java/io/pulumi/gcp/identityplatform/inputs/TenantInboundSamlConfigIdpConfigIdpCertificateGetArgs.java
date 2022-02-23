// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs Empty = new TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs();

    /**
     * - 
     * The x509 certificate
     * 
     */
    @InputImport(name="x509Certificate")
      private final @Nullable Input<String> x509Certificate;

    public Input<String> getX509Certificate() {
        return this.x509Certificate == null ? Input.empty() : this.x509Certificate;
    }

    public TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs(@Nullable Input<String> x509Certificate) {
        this.x509Certificate = x509Certificate;
    }

    private TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs() {
        this.x509Certificate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> x509Certificate;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x509Certificate = defaults.x509Certificate;
        }

        public Builder setX509Certificate(@Nullable Input<String> x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }

        public Builder setX509Certificate(@Nullable String x509Certificate) {
            this.x509Certificate = Input.ofNullable(x509Certificate);
            return this;
        }
        public TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs build() {
            return new TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs(x509Certificate);
        }
    }
}
