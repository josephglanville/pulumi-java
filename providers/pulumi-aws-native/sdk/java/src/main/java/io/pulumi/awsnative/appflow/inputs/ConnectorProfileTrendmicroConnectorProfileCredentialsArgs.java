// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileTrendmicroConnectorProfileCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileTrendmicroConnectorProfileCredentialsArgs Empty = new ConnectorProfileTrendmicroConnectorProfileCredentialsArgs();

    /**
     * The Secret Access Key portion of the credentials.
     * 
     */
    @Import(name="apiSecretKey", required=true)
      private final Output<String> apiSecretKey;

    public Output<String> getApiSecretKey() {
        return this.apiSecretKey;
    }

    public ConnectorProfileTrendmicroConnectorProfileCredentialsArgs(Output<String> apiSecretKey) {
        this.apiSecretKey = Objects.requireNonNull(apiSecretKey, "expected parameter 'apiSecretKey' to be non-null");
    }

    private ConnectorProfileTrendmicroConnectorProfileCredentialsArgs() {
        this.apiSecretKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileTrendmicroConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiSecretKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileTrendmicroConnectorProfileCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiSecretKey = defaults.apiSecretKey;
        }

        public Builder apiSecretKey(Output<String> apiSecretKey) {
            this.apiSecretKey = Objects.requireNonNull(apiSecretKey);
            return this;
        }
        public Builder apiSecretKey(String apiSecretKey) {
            this.apiSecretKey = Output.of(Objects.requireNonNull(apiSecretKey));
            return this;
        }        public ConnectorProfileTrendmicroConnectorProfileCredentialsArgs build() {
            return new ConnectorProfileTrendmicroConnectorProfileCredentialsArgs(apiSecretKey);
        }
    }
}
