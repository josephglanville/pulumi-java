// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectLambdaAccessPointState extends io.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointState Empty = new ObjectLambdaAccessPointState();

    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Output.empty() : this.accountId;
    }

    /**
     * Amazon Resource Name (ARN) of the Object Lambda Access Point.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     * 
     */
    @Import(name="configuration")
      private final @Nullable Output<ObjectLambdaAccessPointConfigurationGetArgs> configuration;

    public Output<ObjectLambdaAccessPointConfigurationGetArgs> getConfiguration() {
        return this.configuration == null ? Output.empty() : this.configuration;
    }

    /**
     * The name for this Object Lambda Access Point.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public ObjectLambdaAccessPointState(
        @Nullable Output<String> accountId,
        @Nullable Output<String> arn,
        @Nullable Output<ObjectLambdaAccessPointConfigurationGetArgs> configuration,
        @Nullable Output<String> name) {
        this.accountId = accountId;
        this.arn = arn;
        this.configuration = configuration;
        this.name = name;
    }

    private ObjectLambdaAccessPointState() {
        this.accountId = Output.empty();
        this.arn = Output.empty();
        this.configuration = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> arn;
        private @Nullable Output<ObjectLambdaAccessPointConfigurationGetArgs> configuration;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.arn = defaults.arn;
    	      this.configuration = defaults.configuration;
    	      this.name = defaults.name;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Output.ofNullable(accountId);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder configuration(@Nullable Output<ObjectLambdaAccessPointConfigurationGetArgs> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable ObjectLambdaAccessPointConfigurationGetArgs configuration) {
            this.configuration = Output.ofNullable(configuration);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public ObjectLambdaAccessPointState build() {
            return new ObjectLambdaAccessPointState(accountId, arn, configuration, name);
        }
    }
}