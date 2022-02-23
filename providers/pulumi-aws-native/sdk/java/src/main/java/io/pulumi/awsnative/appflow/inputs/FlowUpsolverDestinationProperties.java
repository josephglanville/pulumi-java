// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowUpsolverS3OutputFormatConfig;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowUpsolverDestinationProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowUpsolverDestinationProperties Empty = new FlowUpsolverDestinationProperties();

    @InputImport(name="bucketName", required=true)
      private final String bucketName;

    public String getBucketName() {
        return this.bucketName;
    }

    @InputImport(name="bucketPrefix")
      private final @Nullable String bucketPrefix;

    public Optional<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Optional.empty() : Optional.ofNullable(this.bucketPrefix);
    }

    @InputImport(name="s3OutputFormatConfig", required=true)
      private final FlowUpsolverS3OutputFormatConfig s3OutputFormatConfig;

    public FlowUpsolverS3OutputFormatConfig getS3OutputFormatConfig() {
        return this.s3OutputFormatConfig;
    }

    public FlowUpsolverDestinationProperties(
        String bucketName,
        @Nullable String bucketPrefix,
        FlowUpsolverS3OutputFormatConfig s3OutputFormatConfig) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.bucketPrefix = bucketPrefix;
        this.s3OutputFormatConfig = Objects.requireNonNull(s3OutputFormatConfig, "expected parameter 's3OutputFormatConfig' to be non-null");
    }

    private FlowUpsolverDestinationProperties() {
        this.bucketName = null;
        this.bucketPrefix = null;
        this.s3OutputFormatConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowUpsolverDestinationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String bucketPrefix;
        private FlowUpsolverS3OutputFormatConfig s3OutputFormatConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowUpsolverDestinationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.s3OutputFormatConfig = defaults.s3OutputFormatConfig;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder setS3OutputFormatConfig(FlowUpsolverS3OutputFormatConfig s3OutputFormatConfig) {
            this.s3OutputFormatConfig = Objects.requireNonNull(s3OutputFormatConfig);
            return this;
        }
        public FlowUpsolverDestinationProperties build() {
            return new FlowUpsolverDestinationProperties(bucketName, bucketPrefix, s3OutputFormatConfig);
        }
    }
}
