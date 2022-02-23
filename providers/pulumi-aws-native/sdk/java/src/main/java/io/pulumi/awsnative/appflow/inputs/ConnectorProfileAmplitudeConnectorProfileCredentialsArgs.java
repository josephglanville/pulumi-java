// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileAmplitudeConnectorProfileCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileAmplitudeConnectorProfileCredentialsArgs Empty = new ConnectorProfileAmplitudeConnectorProfileCredentialsArgs();

    /**
     * A unique alphanumeric identiﬁer used to authenticate a user, developer, or calling program to your API.
     * 
     */
    @InputImport(name="apiKey", required=true)
      private final Input<String> apiKey;

    public Input<String> getApiKey() {
        return this.apiKey;
    }

    @InputImport(name="secretKey", required=true)
      private final Input<String> secretKey;

    public Input<String> getSecretKey() {
        return this.secretKey;
    }

    public ConnectorProfileAmplitudeConnectorProfileCredentialsArgs(
        Input<String> apiKey,
        Input<String> secretKey) {
        this.apiKey = Objects.requireNonNull(apiKey, "expected parameter 'apiKey' to be non-null");
        this.secretKey = Objects.requireNonNull(secretKey, "expected parameter 'secretKey' to be non-null");
    }

    private ConnectorProfileAmplitudeConnectorProfileCredentialsArgs() {
        this.apiKey = Input.empty();
        this.secretKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileAmplitudeConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiKey;
        private Input<String> secretKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileAmplitudeConnectorProfileCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.secretKey = defaults.secretKey;
        }

        public Builder setApiKey(Input<String> apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }

        public Builder setApiKey(String apiKey) {
            this.apiKey = Input.of(Objects.requireNonNull(apiKey));
            return this;
        }

        public Builder setSecretKey(Input<String> secretKey) {
            this.secretKey = Objects.requireNonNull(secretKey);
            return this;
        }

        public Builder setSecretKey(String secretKey) {
            this.secretKey = Input.of(Objects.requireNonNull(secretKey));
            return this;
        }
        public ConnectorProfileAmplitudeConnectorProfileCredentialsArgs build() {
            return new ConnectorProfileAmplitudeConnectorProfileCredentialsArgs(apiKey, secretKey);
        }
    }
}
