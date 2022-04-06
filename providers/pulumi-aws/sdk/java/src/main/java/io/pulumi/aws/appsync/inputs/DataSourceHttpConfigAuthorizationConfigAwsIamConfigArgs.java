// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs Empty = new DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs();

    /**
     * The signing Amazon Web Services Region for IAM authorization.
     * 
     */
    @Import(name="signingRegion")
      private final @Nullable Output<String> signingRegion;

    public Output<String> getSigningRegion() {
        return this.signingRegion == null ? Output.empty() : this.signingRegion;
    }

    /**
     * The signing service name for IAM authorization.
     * 
     */
    @Import(name="signingServiceName")
      private final @Nullable Output<String> signingServiceName;

    public Output<String> getSigningServiceName() {
        return this.signingServiceName == null ? Output.empty() : this.signingServiceName;
    }

    public DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs(
        @Nullable Output<String> signingRegion,
        @Nullable Output<String> signingServiceName) {
        this.signingRegion = signingRegion;
        this.signingServiceName = signingServiceName;
    }

    private DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs() {
        this.signingRegion = Output.empty();
        this.signingServiceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> signingRegion;
        private @Nullable Output<String> signingServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signingRegion = defaults.signingRegion;
    	      this.signingServiceName = defaults.signingServiceName;
        }

        public Builder signingRegion(@Nullable Output<String> signingRegion) {
            this.signingRegion = signingRegion;
            return this;
        }
        public Builder signingRegion(@Nullable String signingRegion) {
            this.signingRegion = Output.ofNullable(signingRegion);
            return this;
        }
        public Builder signingServiceName(@Nullable Output<String> signingServiceName) {
            this.signingServiceName = signingServiceName;
            return this;
        }
        public Builder signingServiceName(@Nullable String signingServiceName) {
            this.signingServiceName = Output.ofNullable(signingServiceName);
            return this;
        }        public DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs build() {
            return new DataSourceHttpConfigAuthorizationConfigAwsIamConfigArgs(signingRegion, signingServiceName);
        }
    }
}