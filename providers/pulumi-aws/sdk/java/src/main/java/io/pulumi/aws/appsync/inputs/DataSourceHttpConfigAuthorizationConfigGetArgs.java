// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceHttpConfigAuthorizationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceHttpConfigAuthorizationConfigGetArgs Empty = new DataSourceHttpConfigAuthorizationConfigGetArgs();

    /**
     * The authorization type that the HTTP endpoint requires. Default values is `AWS_IAM`.
     * 
     */
    @Import(name="authorizationType")
      private final @Nullable Output<String> authorizationType;

    public Output<String> getAuthorizationType() {
        return this.authorizationType == null ? Output.empty() : this.authorizationType;
    }

    /**
     * The Identity and Access Management (IAM) settings. See AWS IAM Config.
     * 
     */
    @Import(name="awsIamConfig")
      private final @Nullable Output<DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs> awsIamConfig;

    public Output<DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs> getAwsIamConfig() {
        return this.awsIamConfig == null ? Output.empty() : this.awsIamConfig;
    }

    public DataSourceHttpConfigAuthorizationConfigGetArgs(
        @Nullable Output<String> authorizationType,
        @Nullable Output<DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs> awsIamConfig) {
        this.authorizationType = authorizationType;
        this.awsIamConfig = awsIamConfig;
    }

    private DataSourceHttpConfigAuthorizationConfigGetArgs() {
        this.authorizationType = Output.empty();
        this.awsIamConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceHttpConfigAuthorizationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizationType;
        private @Nullable Output<DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs> awsIamConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceHttpConfigAuthorizationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.awsIamConfig = defaults.awsIamConfig;
        }

        public Builder authorizationType(@Nullable Output<String> authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public Builder authorizationType(@Nullable String authorizationType) {
            this.authorizationType = Output.ofNullable(authorizationType);
            return this;
        }
        public Builder awsIamConfig(@Nullable Output<DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs> awsIamConfig) {
            this.awsIamConfig = awsIamConfig;
            return this;
        }
        public Builder awsIamConfig(@Nullable DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs awsIamConfig) {
            this.awsIamConfig = Output.ofNullable(awsIamConfig);
            return this;
        }        public DataSourceHttpConfigAuthorizationConfigGetArgs build() {
            return new DataSourceHttpConfigAuthorizationConfigGetArgs(authorizationType, awsIamConfig);
        }
    }
}