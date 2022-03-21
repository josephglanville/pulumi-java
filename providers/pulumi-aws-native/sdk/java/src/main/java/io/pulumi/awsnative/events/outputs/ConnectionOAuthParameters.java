// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.outputs;

import io.pulumi.awsnative.events.enums.ConnectionOAuthParametersHttpMethod;
import io.pulumi.awsnative.events.outputs.ConnectionClientParameters;
import io.pulumi.awsnative.events.outputs.ConnectionHttpParameters;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOAuthParameters {
    private final String authorizationEndpoint;
    private final ConnectionClientParameters clientParameters;
    private final ConnectionOAuthParametersHttpMethod httpMethod;
    private final @Nullable ConnectionHttpParameters oAuthHttpParameters;

    @CustomType.Constructor
    private ConnectionOAuthParameters(
        @CustomType.Parameter("authorizationEndpoint") String authorizationEndpoint,
        @CustomType.Parameter("clientParameters") ConnectionClientParameters clientParameters,
        @CustomType.Parameter("httpMethod") ConnectionOAuthParametersHttpMethod httpMethod,
        @CustomType.Parameter("oAuthHttpParameters") @Nullable ConnectionHttpParameters oAuthHttpParameters) {
        this.authorizationEndpoint = authorizationEndpoint;
        this.clientParameters = clientParameters;
        this.httpMethod = httpMethod;
        this.oAuthHttpParameters = oAuthHttpParameters;
    }

    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }
    public ConnectionClientParameters getClientParameters() {
        return this.clientParameters;
    }
    public ConnectionOAuthParametersHttpMethod getHttpMethod() {
        return this.httpMethod;
    }
    public Optional<ConnectionHttpParameters> getOAuthHttpParameters() {
        return Optional.ofNullable(this.oAuthHttpParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOAuthParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationEndpoint;
        private ConnectionClientParameters clientParameters;
        private ConnectionOAuthParametersHttpMethod httpMethod;
        private @Nullable ConnectionHttpParameters oAuthHttpParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionOAuthParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.clientParameters = defaults.clientParameters;
    	      this.httpMethod = defaults.httpMethod;
    	      this.oAuthHttpParameters = defaults.oAuthHttpParameters;
        }

        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }
        public Builder clientParameters(ConnectionClientParameters clientParameters) {
            this.clientParameters = Objects.requireNonNull(clientParameters);
            return this;
        }
        public Builder httpMethod(ConnectionOAuthParametersHttpMethod httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }
        public Builder oAuthHttpParameters(@Nullable ConnectionHttpParameters oAuthHttpParameters) {
            this.oAuthHttpParameters = oAuthHttpParameters;
            return this;
        }        public ConnectionOAuthParameters build() {
            return new ConnectionOAuthParameters(authorizationEndpoint, clientParameters, httpMethod, oAuthHttpParameters);
        }
    }
}
