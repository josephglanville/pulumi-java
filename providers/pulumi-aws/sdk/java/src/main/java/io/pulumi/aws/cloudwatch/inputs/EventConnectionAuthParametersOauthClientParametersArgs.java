// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EventConnectionAuthParametersOauthClientParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersOauthClientParametersArgs Empty = new EventConnectionAuthParametersOauthClientParametersArgs();

    /**
     * The client ID for the credentials to use for authorization. Created and stored in AWS Secrets Manager.
     * 
     */
    @InputImport(name="clientId", required=true)
      private final Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId;
    }

    /**
     * The client secret for the credentials to use for authorization. Created and stored in AWS Secrets Manager.
     * 
     */
    @InputImport(name="clientSecret", required=true)
      private final Output<String> clientSecret;

    public Output<String> getClientSecret() {
        return this.clientSecret;
    }

    public EventConnectionAuthParametersOauthClientParametersArgs(
        Output<String> clientId,
        Output<String> clientSecret) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = Objects.requireNonNull(clientSecret, "expected parameter 'clientSecret' to be non-null");
    }

    private EventConnectionAuthParametersOauthClientParametersArgs() {
        this.clientId = Output.empty();
        this.clientSecret = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersOauthClientParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clientId;
        private Output<String> clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersOauthClientParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder clientId(Output<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder clientId(String clientId) {
            this.clientId = Output.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder clientSecret(Output<String> clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Output.of(Objects.requireNonNull(clientSecret));
            return this;
        }
        public EventConnectionAuthParametersOauthClientParametersArgs build() {
            return new EventConnectionAuthParametersOauthClientParametersArgs(clientId, clientSecret);
        }
    }
}
