// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationTlsConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationTlsConfigGetArgs Empty = new IntegrationTlsConfigGetArgs();

    /**
     * Specifies whether or not API Gateway skips verification that the certificate for an integration endpoint is issued by a [supported certificate authority](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html). This isn’t recommended, but it enables you to use certificates that are signed by private certificate authorities, or certificates that are self-signed. If enabled, API Gateway still performs basic certificate validation, which includes checking the certificate's expiration date, hostname, and presence of a root certificate authority. Supported only for `HTTP` and `HTTP_PROXY` integrations.
     * 
     */
    @Import(name="insecureSkipVerification")
      private final @Nullable Output<Boolean> insecureSkipVerification;

    public Output<Boolean> getInsecureSkipVerification() {
        return this.insecureSkipVerification == null ? Output.empty() : this.insecureSkipVerification;
    }

    public IntegrationTlsConfigGetArgs(@Nullable Output<Boolean> insecureSkipVerification) {
        this.insecureSkipVerification = insecureSkipVerification;
    }

    private IntegrationTlsConfigGetArgs() {
        this.insecureSkipVerification = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationTlsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> insecureSkipVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationTlsConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insecureSkipVerification = defaults.insecureSkipVerification;
        }

        public Builder insecureSkipVerification(@Nullable Output<Boolean> insecureSkipVerification) {
            this.insecureSkipVerification = insecureSkipVerification;
            return this;
        }
        public Builder insecureSkipVerification(@Nullable Boolean insecureSkipVerification) {
            this.insecureSkipVerification = Output.ofNullable(insecureSkipVerification);
            return this;
        }        public IntegrationTlsConfigGetArgs build() {
            return new IntegrationTlsConfigGetArgs(insecureSkipVerification);
        }
    }
}