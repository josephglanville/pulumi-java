// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowS3OutputFormatConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowS3DestinationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowS3DestinationPropertiesArgs Empty = new FlowS3DestinationPropertiesArgs();

    @InputImport(name="bucketName", required=true)
      private final Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName;
    }

    @InputImport(name="bucketPrefix")
      private final @Nullable Input<String> bucketPrefix;

    public Input<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Input.empty() : this.bucketPrefix;
    }

    @InputImport(name="s3OutputFormatConfig")
      private final @Nullable Input<FlowS3OutputFormatConfigArgs> s3OutputFormatConfig;

    public Input<FlowS3OutputFormatConfigArgs> getS3OutputFormatConfig() {
        return this.s3OutputFormatConfig == null ? Input.empty() : this.s3OutputFormatConfig;
    }

    public FlowS3DestinationPropertiesArgs(
        Input<String> bucketName,
        @Nullable Input<String> bucketPrefix,
        @Nullable Input<FlowS3OutputFormatConfigArgs> s3OutputFormatConfig) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.bucketPrefix = bucketPrefix;
        this.s3OutputFormatConfig = s3OutputFormatConfig;
    }

    private FlowS3DestinationPropertiesArgs() {
        this.bucketName = Input.empty();
        this.bucketPrefix = Input.empty();
        this.s3OutputFormatConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowS3DestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketName;
        private @Nullable Input<String> bucketPrefix;
        private @Nullable Input<FlowS3OutputFormatConfigArgs> s3OutputFormatConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowS3DestinationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.s3OutputFormatConfig = defaults.s3OutputFormatConfig;
        }

        public Builder setBucketName(Input<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Input.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder setBucketPrefix(@Nullable Input<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Input.ofNullable(bucketPrefix);
            return this;
        }

        public Builder setS3OutputFormatConfig(@Nullable Input<FlowS3OutputFormatConfigArgs> s3OutputFormatConfig) {
            this.s3OutputFormatConfig = s3OutputFormatConfig;
            return this;
        }

        public Builder setS3OutputFormatConfig(@Nullable FlowS3OutputFormatConfigArgs s3OutputFormatConfig) {
            this.s3OutputFormatConfig = Input.ofNullable(s3OutputFormatConfig);
            return this;
        }
        public FlowS3DestinationPropertiesArgs build() {
            return new FlowS3DestinationPropertiesArgs(bucketName, bucketPrefix, s3OutputFormatConfig);
        }
    }
}
