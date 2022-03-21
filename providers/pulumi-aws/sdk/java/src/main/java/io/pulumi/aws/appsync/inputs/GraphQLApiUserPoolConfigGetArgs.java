// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphQLApiUserPoolConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphQLApiUserPoolConfigGetArgs Empty = new GraphQLApiUserPoolConfigGetArgs();

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
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito User Pool authentication doesn't match the Amazon Cognito User Pool configuration. Valid: `ALLOW` and `DENY`
     * 
     */
    @Import(name="defaultAction", required=true)
      private final Output<String> defaultAction;

    public Output<String> getDefaultAction() {
        return this.defaultAction;
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

    public GraphQLApiUserPoolConfigGetArgs(
        @Nullable Output<String> appIdClientRegex,
        @Nullable Output<String> awsRegion,
        Output<String> defaultAction,
        Output<String> userPoolId) {
        this.appIdClientRegex = appIdClientRegex;
        this.awsRegion = awsRegion;
        this.defaultAction = Objects.requireNonNull(defaultAction, "expected parameter 'defaultAction' to be non-null");
        this.userPoolId = Objects.requireNonNull(userPoolId, "expected parameter 'userPoolId' to be non-null");
    }

    private GraphQLApiUserPoolConfigGetArgs() {
        this.appIdClientRegex = Output.empty();
        this.awsRegion = Output.empty();
        this.defaultAction = Output.empty();
        this.userPoolId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiUserPoolConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appIdClientRegex;
        private @Nullable Output<String> awsRegion;
        private Output<String> defaultAction;
        private Output<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiUserPoolConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appIdClientRegex = defaults.appIdClientRegex;
    	      this.awsRegion = defaults.awsRegion;
    	      this.defaultAction = defaults.defaultAction;
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
        public Builder defaultAction(Output<String> defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }
        public Builder defaultAction(String defaultAction) {
            this.defaultAction = Output.of(Objects.requireNonNull(defaultAction));
            return this;
        }
        public Builder userPoolId(Output<String> userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }
        public Builder userPoolId(String userPoolId) {
            this.userPoolId = Output.of(Objects.requireNonNull(userPoolId));
            return this;
        }        public GraphQLApiUserPoolConfigGetArgs build() {
            return new GraphQLApiUserPoolConfigGetArgs(appIdClientRegex, awsRegion, defaultAction, userPoolId);
        }
    }
}
