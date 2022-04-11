// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ConnectionApiKeyAuthParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionApiKeyAuthParametersArgs Empty = new ConnectionApiKeyAuthParametersArgs();

    @Import(name="apiKeyName", required=true)
      private final Output<String> apiKeyName;

    public Output<String> getApiKeyName() {
        return this.apiKeyName;
    }

    @Import(name="apiKeyValue", required=true)
      private final Output<String> apiKeyValue;

    public Output<String> getApiKeyValue() {
        return this.apiKeyValue;
    }

    public ConnectionApiKeyAuthParametersArgs(
        Output<String> apiKeyName,
        Output<String> apiKeyValue) {
        this.apiKeyName = Objects.requireNonNull(apiKeyName, "expected parameter 'apiKeyName' to be non-null");
        this.apiKeyValue = Objects.requireNonNull(apiKeyValue, "expected parameter 'apiKeyValue' to be non-null");
    }

    private ConnectionApiKeyAuthParametersArgs() {
        this.apiKeyName = Codegen.empty();
        this.apiKeyValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionApiKeyAuthParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiKeyName;
        private Output<String> apiKeyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionApiKeyAuthParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyName = defaults.apiKeyName;
    	      this.apiKeyValue = defaults.apiKeyValue;
        }

        public Builder apiKeyName(Output<String> apiKeyName) {
            this.apiKeyName = Objects.requireNonNull(apiKeyName);
            return this;
        }
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = Output.of(Objects.requireNonNull(apiKeyName));
            return this;
        }
        public Builder apiKeyValue(Output<String> apiKeyValue) {
            this.apiKeyValue = Objects.requireNonNull(apiKeyValue);
            return this;
        }
        public Builder apiKeyValue(String apiKeyValue) {
            this.apiKeyValue = Output.of(Objects.requireNonNull(apiKeyValue));
            return this;
        }        public ConnectionApiKeyAuthParametersArgs build() {
            return new ConnectionApiKeyAuthParametersArgs(apiKeyName, apiKeyValue);
        }
    }
}
