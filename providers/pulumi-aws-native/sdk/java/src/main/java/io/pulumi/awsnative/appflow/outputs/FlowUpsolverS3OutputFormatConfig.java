// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.enums.FlowFileType;
import io.pulumi.awsnative.appflow.outputs.FlowAggregationConfig;
import io.pulumi.awsnative.appflow.outputs.FlowPrefixConfig;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowUpsolverS3OutputFormatConfig {
    private final @Nullable FlowAggregationConfig aggregationConfig;
    private final @Nullable FlowFileType fileType;
    private final FlowPrefixConfig prefixConfig;

    @CustomType.Constructor
    private FlowUpsolverS3OutputFormatConfig(
        @CustomType.Parameter("aggregationConfig") @Nullable FlowAggregationConfig aggregationConfig,
        @CustomType.Parameter("fileType") @Nullable FlowFileType fileType,
        @CustomType.Parameter("prefixConfig") FlowPrefixConfig prefixConfig) {
        this.aggregationConfig = aggregationConfig;
        this.fileType = fileType;
        this.prefixConfig = prefixConfig;
    }

    public Optional<FlowAggregationConfig> getAggregationConfig() {
        return Optional.ofNullable(this.aggregationConfig);
    }
    public Optional<FlowFileType> getFileType() {
        return Optional.ofNullable(this.fileType);
    }
    public FlowPrefixConfig getPrefixConfig() {
        return this.prefixConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowUpsolverS3OutputFormatConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowAggregationConfig aggregationConfig;
        private @Nullable FlowFileType fileType;
        private FlowPrefixConfig prefixConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowUpsolverS3OutputFormatConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationConfig = defaults.aggregationConfig;
    	      this.fileType = defaults.fileType;
    	      this.prefixConfig = defaults.prefixConfig;
        }

        public Builder aggregationConfig(@Nullable FlowAggregationConfig aggregationConfig) {
            this.aggregationConfig = aggregationConfig;
            return this;
        }
        public Builder fileType(@Nullable FlowFileType fileType) {
            this.fileType = fileType;
            return this;
        }
        public Builder prefixConfig(FlowPrefixConfig prefixConfig) {
            this.prefixConfig = Objects.requireNonNull(prefixConfig);
            return this;
        }        public FlowUpsolverS3OutputFormatConfig build() {
            return new FlowUpsolverS3OutputFormatConfig(aggregationConfig, fileType, prefixConfig);
        }
    }
}
