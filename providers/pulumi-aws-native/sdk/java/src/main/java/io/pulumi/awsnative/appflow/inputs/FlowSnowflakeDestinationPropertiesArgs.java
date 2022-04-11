// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowErrorHandlingConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowSnowflakeDestinationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSnowflakeDestinationPropertiesArgs Empty = new FlowSnowflakeDestinationPropertiesArgs();

    @Import(name="bucketPrefix")
      private final @Nullable Output<String> bucketPrefix;

    public Output<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Codegen.empty() : this.bucketPrefix;
    }

    @Import(name="errorHandlingConfig")
      private final @Nullable Output<FlowErrorHandlingConfigArgs> errorHandlingConfig;

    public Output<FlowErrorHandlingConfigArgs> getErrorHandlingConfig() {
        return this.errorHandlingConfig == null ? Codegen.empty() : this.errorHandlingConfig;
    }

    @Import(name="intermediateBucketName", required=true)
      private final Output<String> intermediateBucketName;

    public Output<String> getIntermediateBucketName() {
        return this.intermediateBucketName;
    }

    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> getObject() {
        return this.object;
    }

    public FlowSnowflakeDestinationPropertiesArgs(
        @Nullable Output<String> bucketPrefix,
        @Nullable Output<FlowErrorHandlingConfigArgs> errorHandlingConfig,
        Output<String> intermediateBucketName,
        Output<String> object) {
        this.bucketPrefix = bucketPrefix;
        this.errorHandlingConfig = errorHandlingConfig;
        this.intermediateBucketName = Objects.requireNonNull(intermediateBucketName, "expected parameter 'intermediateBucketName' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowSnowflakeDestinationPropertiesArgs() {
        this.bucketPrefix = Codegen.empty();
        this.errorHandlingConfig = Codegen.empty();
        this.intermediateBucketName = Codegen.empty();
        this.object = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSnowflakeDestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketPrefix;
        private @Nullable Output<FlowErrorHandlingConfigArgs> errorHandlingConfig;
        private Output<String> intermediateBucketName;
        private Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSnowflakeDestinationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.errorHandlingConfig = defaults.errorHandlingConfig;
    	      this.intermediateBucketName = defaults.intermediateBucketName;
    	      this.object = defaults.object;
        }

        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Codegen.ofNullable(bucketPrefix);
            return this;
        }
        public Builder errorHandlingConfig(@Nullable Output<FlowErrorHandlingConfigArgs> errorHandlingConfig) {
            this.errorHandlingConfig = errorHandlingConfig;
            return this;
        }
        public Builder errorHandlingConfig(@Nullable FlowErrorHandlingConfigArgs errorHandlingConfig) {
            this.errorHandlingConfig = Codegen.ofNullable(errorHandlingConfig);
            return this;
        }
        public Builder intermediateBucketName(Output<String> intermediateBucketName) {
            this.intermediateBucketName = Objects.requireNonNull(intermediateBucketName);
            return this;
        }
        public Builder intermediateBucketName(String intermediateBucketName) {
            this.intermediateBucketName = Output.of(Objects.requireNonNull(intermediateBucketName));
            return this;
        }
        public Builder object(Output<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder object(String object) {
            this.object = Output.of(Objects.requireNonNull(object));
            return this;
        }        public FlowSnowflakeDestinationPropertiesArgs build() {
            return new FlowSnowflakeDestinationPropertiesArgs(bucketPrefix, errorHandlingConfig, intermediateBucketName, object);
        }
    }
}
