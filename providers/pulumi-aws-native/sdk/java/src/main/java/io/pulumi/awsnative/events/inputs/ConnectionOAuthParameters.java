// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.awsnative.events.enums.ConnectionOAuthParametersHttpMethod;
import io.pulumi.awsnative.events.inputs.ConnectionClientParameters;
import io.pulumi.awsnative.events.inputs.ConnectionHttpParameters;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOAuthParameters extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionOAuthParameters Empty = new ConnectionOAuthParameters();

    @Import(name="authorizationEndpoint", required=true)
      private final String authorizationEndpoint;

    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    @Import(name="clientParameters", required=true)
      private final ConnectionClientParameters clientParameters;

    public ConnectionClientParameters getClientParameters() {
        return this.clientParameters;
    }

    @Import(name="httpMethod", required=true)
      private final ConnectionOAuthParametersHttpMethod httpMethod;

    public ConnectionOAuthParametersHttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    @Import(name="oAuthHttpParameters")
      private final @Nullable ConnectionHttpParameters oAuthHttpParameters;

    public Optional<ConnectionHttpParameters> getOAuthHttpParameters() {
        return this.oAuthHttpParameters == null ? Optional.empty() : Optional.ofNullable(this.oAuthHttpParameters);
    }

    public ConnectionOAuthParameters(
        String authorizationEndpoint,
        ConnectionClientParameters clientParameters,
        ConnectionOAuthParametersHttpMethod httpMethod,
        @Nullable ConnectionHttpParameters oAuthHttpParameters) {
        this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
        this.clientParameters = Objects.requireNonNull(clientParameters, "expected parameter 'clientParameters' to be non-null");
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.oAuthHttpParameters = oAuthHttpParameters;
    }

    private ConnectionOAuthParameters() {
        this.authorizationEndpoint = null;
        this.clientParameters = null;
        this.httpMethod = null;
        this.oAuthHttpParameters = null;
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
