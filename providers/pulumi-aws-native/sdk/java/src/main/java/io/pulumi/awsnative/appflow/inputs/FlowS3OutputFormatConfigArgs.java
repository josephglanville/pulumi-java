// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowFileType;
import io.pulumi.awsnative.appflow.inputs.FlowAggregationConfigArgs;
import io.pulumi.awsnative.appflow.inputs.FlowPrefixConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowS3OutputFormatConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowS3OutputFormatConfigArgs Empty = new FlowS3OutputFormatConfigArgs();

    @InputImport(name="aggregationConfig")
      private final @Nullable Output<FlowAggregationConfigArgs> aggregationConfig;

    public Output<FlowAggregationConfigArgs> getAggregationConfig() {
        return this.aggregationConfig == null ? Output.empty() : this.aggregationConfig;
    }

    @InputImport(name="fileType")
      private final @Nullable Output<FlowFileType> fileType;

    public Output<FlowFileType> getFileType() {
        return this.fileType == null ? Output.empty() : this.fileType;
    }

    @InputImport(name="prefixConfig")
      private final @Nullable Output<FlowPrefixConfigArgs> prefixConfig;

    public Output<FlowPrefixConfigArgs> getPrefixConfig() {
        return this.prefixConfig == null ? Output.empty() : this.prefixConfig;
    }

    public FlowS3OutputFormatConfigArgs(
        @Nullable Output<FlowAggregationConfigArgs> aggregationConfig,
        @Nullable Output<FlowFileType> fileType,
        @Nullable Output<FlowPrefixConfigArgs> prefixConfig) {
        this.aggregationConfig = aggregationConfig;
        this.fileType = fileType;
        this.prefixConfig = prefixConfig;
    }

    private FlowS3OutputFormatConfigArgs() {
        this.aggregationConfig = Output.empty();
        this.fileType = Output.empty();
        this.prefixConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowS3OutputFormatConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowAggregationConfigArgs> aggregationConfig;
        private @Nullable Output<FlowFileType> fileType;
        private @Nullable Output<FlowPrefixConfigArgs> prefixConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowS3OutputFormatConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationConfig = defaults.aggregationConfig;
    	      this.fileType = defaults.fileType;
    	      this.prefixConfig = defaults.prefixConfig;
        }

        public Builder aggregationConfig(@Nullable Output<FlowAggregationConfigArgs> aggregationConfig) {
            this.aggregationConfig = aggregationConfig;
            return this;
        }

        public Builder aggregationConfig(@Nullable FlowAggregationConfigArgs aggregationConfig) {
            this.aggregationConfig = Output.ofNullable(aggregationConfig);
            return this;
        }

        public Builder fileType(@Nullable Output<FlowFileType> fileType) {
            this.fileType = fileType;
            return this;
        }

        public Builder fileType(@Nullable FlowFileType fileType) {
            this.fileType = Output.ofNullable(fileType);
            return this;
        }

        public Builder prefixConfig(@Nullable Output<FlowPrefixConfigArgs> prefixConfig) {
            this.prefixConfig = prefixConfig;
            return this;
        }

        public Builder prefixConfig(@Nullable FlowPrefixConfigArgs prefixConfig) {
            this.prefixConfig = Output.ofNullable(prefixConfig);
            return this;
        }
        public FlowS3OutputFormatConfigArgs build() {
            return new FlowS3OutputFormatConfigArgs(aggregationConfig, fileType, prefixConfig);
        }
    }
}
