// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphQLApiAdditionalAuthenticationProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphQLApiAdditionalAuthenticationProviderArgs Empty = new GraphQLApiAdditionalAuthenticationProviderArgs();

    /**
     * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    @Import(name="authenticationType", required=true)
      private final Output<String> authenticationType;

    public Output<String> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    @Import(name="lambdaAuthorizerConfig")
      private final @Nullable Output<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig;

    public Output<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs> getLambdaAuthorizerConfig() {
        return this.lambdaAuthorizerConfig == null ? Output.empty() : this.lambdaAuthorizerConfig;
    }

    /**
     * Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    @Import(name="openidConnectConfig")
      private final @Nullable Output<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs> openidConnectConfig;

    public Output<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs> getOpenidConnectConfig() {
        return this.openidConnectConfig == null ? Output.empty() : this.openidConnectConfig;
    }

    /**
     * The Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    @Import(name="userPoolConfig")
      private final @Nullable Output<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs> userPoolConfig;

    public Output<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs> getUserPoolConfig() {
        return this.userPoolConfig == null ? Output.empty() : this.userPoolConfig;
    }

    public GraphQLApiAdditionalAuthenticationProviderArgs(
        Output<String> authenticationType,
        @Nullable Output<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig,
        @Nullable Output<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs> openidConnectConfig,
        @Nullable Output<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs> userPoolConfig) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
        this.openidConnectConfig = openidConnectConfig;
        this.userPoolConfig = userPoolConfig;
    }

    private GraphQLApiAdditionalAuthenticationProviderArgs() {
        this.authenticationType = Output.empty();
        this.lambdaAuthorizerConfig = Output.empty();
        this.openidConnectConfig = Output.empty();
        this.userPoolConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiAdditionalAuthenticationProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authenticationType;
        private @Nullable Output<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig;
        private @Nullable Output<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs> openidConnectConfig;
        private @Nullable Output<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs> userPoolConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiAdditionalAuthenticationProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.lambdaAuthorizerConfig = defaults.lambdaAuthorizerConfig;
    	      this.openidConnectConfig = defaults.openidConnectConfig;
    	      this.userPoolConfig = defaults.userPoolConfig;
        }

        public Builder authenticationType(Output<String> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Output.of(Objects.requireNonNull(authenticationType));
            return this;
        }
        public Builder lambdaAuthorizerConfig(@Nullable Output<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig) {
            this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
            return this;
        }
        public Builder lambdaAuthorizerConfig(@Nullable GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs lambdaAuthorizerConfig) {
            this.lambdaAuthorizerConfig = Output.ofNullable(lambdaAuthorizerConfig);
            return this;
        }
        public Builder openidConnectConfig(@Nullable Output<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs> openidConnectConfig) {
            this.openidConnectConfig = openidConnectConfig;
            return this;
        }
        public Builder openidConnectConfig(@Nullable GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs openidConnectConfig) {
            this.openidConnectConfig = Output.ofNullable(openidConnectConfig);
            return this;
        }
        public Builder userPoolConfig(@Nullable Output<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs> userPoolConfig) {
            this.userPoolConfig = userPoolConfig;
            return this;
        }
        public Builder userPoolConfig(@Nullable GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs userPoolConfig) {
            this.userPoolConfig = Output.ofNullable(userPoolConfig);
            return this;
        }        public GraphQLApiAdditionalAuthenticationProviderArgs build() {
            return new GraphQLApiAdditionalAuthenticationProviderArgs(authenticationType, lambdaAuthorizerConfig, openidConnectConfig, userPoolConfig);
        }
    }
}
