// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayClientAuthConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayClientAuthConfigurationResponse Empty = new ApplicationGatewayClientAuthConfigurationResponse();

    @InputImport(name="verifyClientCertIssuerDN")
    private final @Nullable Boolean verifyClientCertIssuerDN;

    public Optional<Boolean> getVerifyClientCertIssuerDN() {
        return this.verifyClientCertIssuerDN == null ? Optional.empty() : Optional.ofNullable(this.verifyClientCertIssuerDN);
    }

    public ApplicationGatewayClientAuthConfigurationResponse(@Nullable Boolean verifyClientCertIssuerDN) {
        this.verifyClientCertIssuerDN = verifyClientCertIssuerDN;
    }

    private ApplicationGatewayClientAuthConfigurationResponse() {
        this.verifyClientCertIssuerDN = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayClientAuthConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean verifyClientCertIssuerDN;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayClientAuthConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.verifyClientCertIssuerDN = defaults.verifyClientCertIssuerDN;
        }

        public Builder setVerifyClientCertIssuerDN(@Nullable Boolean verifyClientCertIssuerDN) {
            this.verifyClientCertIssuerDN = verifyClientCertIssuerDN;
            return this;
        }

        public ApplicationGatewayClientAuthConfigurationResponse build() {
            return new ApplicationGatewayClientAuthConfigurationResponse(verifyClientCertIssuerDN);
        }
    }
}
