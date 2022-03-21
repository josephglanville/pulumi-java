// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizerState extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizerState Empty = new AuthorizerState();

    /**
     * The credentials required for the authorizer. To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
     * 
     */
    @Import(name="authorizerCredentials")
      private final @Nullable Output<String> authorizerCredentials;

    public Output<String> getAuthorizerCredentials() {
        return this.authorizerCredentials == null ? Output.empty() : this.authorizerCredentials;
    }

    /**
     * The TTL of cached authorizer results in seconds. Defaults to `300`.
     * 
     */
    @Import(name="authorizerResultTtlInSeconds")
      private final @Nullable Output<Integer> authorizerResultTtlInSeconds;

    public Output<Integer> getAuthorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds == null ? Output.empty() : this.authorizerResultTtlInSeconds;
    }

    /**
     * The authorizer's Uniform Resource Identifier (URI). This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
     * e.g., `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
     * 
     */
    @Import(name="authorizerUri")
      private final @Nullable Output<String> authorizerUri;

    public Output<String> getAuthorizerUri() {
        return this.authorizerUri == null ? Output.empty() : this.authorizerUri;
    }

    /**
     * The source of the identity in an incoming request. Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g., `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
     * 
     */
    @Import(name="identitySource")
      private final @Nullable Output<String> identitySource;

    public Output<String> getIdentitySource() {
        return this.identitySource == null ? Output.empty() : this.identitySource;
    }

    /**
     * A validation expression for the incoming identity. For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched against this expression, and will proceed if the token matches. If the token doesn't match, the client receives a 401 Unauthorized response.
     * 
     */
    @Import(name="identityValidationExpression")
      private final @Nullable Output<String> identityValidationExpression;

    public Output<String> getIdentityValidationExpression() {
        return this.identityValidationExpression == null ? Output.empty() : this.identityValidationExpression;
    }

    /**
     * The name of the authorizer
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A list of the Amazon Cognito user pool ARNs. Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
     * 
     */
    @Import(name="providerArns")
      private final @Nullable Output<List<String>> providerArns;

    public Output<List<String>> getProviderArns() {
        return this.providerArns == null ? Output.empty() : this.providerArns;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @Import(name="restApi")
      private final @Nullable Output<String> restApi;

    public Output<String> getRestApi() {
        return this.restApi == null ? Output.empty() : this.restApi;
    }

    /**
     * The type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool. Defaults to `TOKEN`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public AuthorizerState(
        @Nullable Output<String> authorizerCredentials,
        @Nullable Output<Integer> authorizerResultTtlInSeconds,
        @Nullable Output<String> authorizerUri,
        @Nullable Output<String> identitySource,
        @Nullable Output<String> identityValidationExpression,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> providerArns,
        @Nullable Output<String> restApi,
        @Nullable Output<String> type) {
        this.authorizerCredentials = authorizerCredentials;
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
        this.authorizerUri = authorizerUri;
        this.identitySource = identitySource;
        this.identityValidationExpression = identityValidationExpression;
        this.name = name;
        this.providerArns = providerArns;
        this.restApi = restApi;
        this.type = type;
    }

    private AuthorizerState() {
        this.authorizerCredentials = Output.empty();
        this.authorizerResultTtlInSeconds = Output.empty();
        this.authorizerUri = Output.empty();
        this.identitySource = Output.empty();
        this.identityValidationExpression = Output.empty();
        this.name = Output.empty();
        this.providerArns = Output.empty();
        this.restApi = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizerCredentials;
        private @Nullable Output<Integer> authorizerResultTtlInSeconds;
        private @Nullable Output<String> authorizerUri;
        private @Nullable Output<String> identitySource;
        private @Nullable Output<String> identityValidationExpression;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> providerArns;
        private @Nullable Output<String> restApi;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizerCredentials = defaults.authorizerCredentials;
    	      this.authorizerResultTtlInSeconds = defaults.authorizerResultTtlInSeconds;
    	      this.authorizerUri = defaults.authorizerUri;
    	      this.identitySource = defaults.identitySource;
    	      this.identityValidationExpression = defaults.identityValidationExpression;
    	      this.name = defaults.name;
    	      this.providerArns = defaults.providerArns;
    	      this.restApi = defaults.restApi;
    	      this.type = defaults.type;
        }

        public Builder authorizerCredentials(@Nullable Output<String> authorizerCredentials) {
            this.authorizerCredentials = authorizerCredentials;
            return this;
        }
        public Builder authorizerCredentials(@Nullable String authorizerCredentials) {
            this.authorizerCredentials = Output.ofNullable(authorizerCredentials);
            return this;
        }
        public Builder authorizerResultTtlInSeconds(@Nullable Output<Integer> authorizerResultTtlInSeconds) {
            this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
            return this;
        }
        public Builder authorizerResultTtlInSeconds(@Nullable Integer authorizerResultTtlInSeconds) {
            this.authorizerResultTtlInSeconds = Output.ofNullable(authorizerResultTtlInSeconds);
            return this;
        }
        public Builder authorizerUri(@Nullable Output<String> authorizerUri) {
            this.authorizerUri = authorizerUri;
            return this;
        }
        public Builder authorizerUri(@Nullable String authorizerUri) {
            this.authorizerUri = Output.ofNullable(authorizerUri);
            return this;
        }
        public Builder identitySource(@Nullable Output<String> identitySource) {
            this.identitySource = identitySource;
            return this;
        }
        public Builder identitySource(@Nullable String identitySource) {
            this.identitySource = Output.ofNullable(identitySource);
            return this;
        }
        public Builder identityValidationExpression(@Nullable Output<String> identityValidationExpression) {
            this.identityValidationExpression = identityValidationExpression;
            return this;
        }
        public Builder identityValidationExpression(@Nullable String identityValidationExpression) {
            this.identityValidationExpression = Output.ofNullable(identityValidationExpression);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder providerArns(@Nullable Output<List<String>> providerArns) {
            this.providerArns = providerArns;
            return this;
        }
        public Builder providerArns(@Nullable List<String> providerArns) {
            this.providerArns = Output.ofNullable(providerArns);
            return this;
        }
        public Builder providerArns(String... providerArns) {
            return providerArns(List.of(providerArns));
        }
        public Builder restApi(@Nullable Output<String> restApi) {
            this.restApi = restApi;
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public AuthorizerState build() {
            return new AuthorizerState(authorizerCredentials, authorizerResultTtlInSeconds, authorizerUri, identitySource, identityValidationExpression, name, providerArns, restApi, type);
        }
    }
}
