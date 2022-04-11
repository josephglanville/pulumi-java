// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AcceleratorAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AcceleratorAttributesArgs Empty = new AcceleratorAttributesArgs();

    /**
     * Indicates whether flow logs are enabled. Defaults to `false`. Valid values: `true`, `false`.
     * 
     */
    @Import(name="flowLogsEnabled")
      private final @Nullable Output<Boolean> flowLogsEnabled;

    public Output<Boolean> getFlowLogsEnabled() {
        return this.flowLogsEnabled == null ? Codegen.empty() : this.flowLogsEnabled;
    }

    /**
     * The name of the Amazon S3 bucket for the flow logs. Required if `flow_logs_enabled` is `true`.
     * 
     */
    @Import(name="flowLogsS3Bucket")
      private final @Nullable Output<String> flowLogsS3Bucket;

    public Output<String> getFlowLogsS3Bucket() {
        return this.flowLogsS3Bucket == null ? Codegen.empty() : this.flowLogsS3Bucket;
    }

    /**
     * The prefix for the location in the Amazon S3 bucket for the flow logs. Required if `flow_logs_enabled` is `true`.
     * 
     */
    @Import(name="flowLogsS3Prefix")
      private final @Nullable Output<String> flowLogsS3Prefix;

    public Output<String> getFlowLogsS3Prefix() {
        return this.flowLogsS3Prefix == null ? Codegen.empty() : this.flowLogsS3Prefix;
    }

    public AcceleratorAttributesArgs(
        @Nullable Output<Boolean> flowLogsEnabled,
        @Nullable Output<String> flowLogsS3Bucket,
        @Nullable Output<String> flowLogsS3Prefix) {
        this.flowLogsEnabled = flowLogsEnabled;
        this.flowLogsS3Bucket = flowLogsS3Bucket;
        this.flowLogsS3Prefix = flowLogsS3Prefix;
    }

    private AcceleratorAttributesArgs() {
        this.flowLogsEnabled = Codegen.empty();
        this.flowLogsS3Bucket = Codegen.empty();
        this.flowLogsS3Prefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> flowLogsEnabled;
        private @Nullable Output<String> flowLogsS3Bucket;
        private @Nullable Output<String> flowLogsS3Prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowLogsEnabled = defaults.flowLogsEnabled;
    	      this.flowLogsS3Bucket = defaults.flowLogsS3Bucket;
    	      this.flowLogsS3Prefix = defaults.flowLogsS3Prefix;
        }

        public Builder flowLogsEnabled(@Nullable Output<Boolean> flowLogsEnabled) {
            this.flowLogsEnabled = flowLogsEnabled;
            return this;
        }
        public Builder flowLogsEnabled(@Nullable Boolean flowLogsEnabled) {
            this.flowLogsEnabled = Codegen.ofNullable(flowLogsEnabled);
            return this;
        }
        public Builder flowLogsS3Bucket(@Nullable Output<String> flowLogsS3Bucket) {
            this.flowLogsS3Bucket = flowLogsS3Bucket;
            return this;
        }
        public Builder flowLogsS3Bucket(@Nullable String flowLogsS3Bucket) {
            this.flowLogsS3Bucket = Codegen.ofNullable(flowLogsS3Bucket);
            return this;
        }
        public Builder flowLogsS3Prefix(@Nullable Output<String> flowLogsS3Prefix) {
            this.flowLogsS3Prefix = flowLogsS3Prefix;
            return this;
        }
        public Builder flowLogsS3Prefix(@Nullable String flowLogsS3Prefix) {
            this.flowLogsS3Prefix = Codegen.ofNullable(flowLogsS3Prefix);
            return this;
        }        public AcceleratorAttributesArgs build() {
            return new AcceleratorAttributesArgs(flowLogsEnabled, flowLogsS3Bucket, flowLogsS3Prefix);
        }
    }
}
