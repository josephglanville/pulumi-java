// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs Empty = new GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs();

    /**
     * A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
     * 
     */
    @Import(name="appIdClientRegex")
      private final @Nullable Output<String> appIdClientRegex;

    public Output<String> getAppIdClientRegex() {
        return this.appIdClientRegex == null ? Output.empty() : this.appIdClientRegex;
    }

    /**
     * The AWS region in which the user pool was created.
     * 
     */
    @Import(name="awsRegion")
      private final @Nullable Output<String> awsRegion;

    public Output<String> getAwsRegion() {
        return this.awsRegion == null ? Output.empty() : this.awsRegion;
    }

    /**
     * The user pool ID.
     * 
     */
    @Import(name="userPoolId", required=true)
      private final Output<String> userPoolId;

    public Output<String> getUserPoolId() {
        return this.userPoolId;
    }

    public GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs(
        @Nullable Output<String> appIdClientRegex,
        @Nullable Output<String> awsRegion,
        Output<String> userPoolId) {
        this.appIdClientRegex = appIdClientRegex;
        this.awsRegion = awsRegion;
        this.userPoolId = Objects.requireNonNull(userPoolId, "expected parameter 'userPoolId' to be non-null");
    }

    private GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs() {
        this.appIdClientRegex = Output.empty();
        this.awsRegion = Output.empty();
        this.userPoolId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appIdClientRegex;
        private @Nullable Output<String> awsRegion;
        private Output<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appIdClientRegex = defaults.appIdClientRegex;
    	      this.awsRegion = defaults.awsRegion;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder appIdClientRegex(@Nullable Output<String> appIdClientRegex) {
            this.appIdClientRegex = appIdClientRegex;
            return this;
        }
        public Builder appIdClientRegex(@Nullable String appIdClientRegex) {
            this.appIdClientRegex = Output.ofNullable(appIdClientRegex);
            return this;
        }
        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }
        public Builder awsRegion(@Nullable String awsRegion) {
            this.awsRegion = Output.ofNullable(awsRegion);
            return this;
        }
        public Builder userPoolId(Output<String> userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }
        public Builder userPoolId(String userPoolId) {
            this.userPoolId = Output.of(Objects.requireNonNull(userPoolId));
            return this;
        }        public GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs build() {
            return new GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs(appIdClientRegex, awsRegion, userPoolId);
        }
    }
}