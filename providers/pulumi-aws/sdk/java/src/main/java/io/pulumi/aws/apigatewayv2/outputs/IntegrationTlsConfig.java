// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationTlsConfig {
    /**
     * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * 
     */
    private final @Nullable String serverNameToVerify;

    @CustomType.Constructor
    private IntegrationTlsConfig(@CustomType.Parameter("serverNameToVerify") @Nullable String serverNameToVerify) {
        this.serverNameToVerify = serverNameToVerify;
    }

    /**
     * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * 
    */
    public Optional<String> getServerNameToVerify() {
        return Optional.ofNullable(this.serverNameToVerify);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationTlsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String serverNameToVerify;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationTlsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverNameToVerify = defaults.serverNameToVerify;
        }

        public Builder serverNameToVerify(@Nullable String serverNameToVerify) {
            this.serverNameToVerify = serverNameToVerify;
            return this;
        }        public IntegrationTlsConfig build() {
            return new IntegrationTlsConfig(serverNameToVerify);
        }
    }
}