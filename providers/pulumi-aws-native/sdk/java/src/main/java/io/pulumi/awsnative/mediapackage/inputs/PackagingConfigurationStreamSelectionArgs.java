// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationStreamSelectionStreamOrder;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A StreamSelection configuration.
 * 
 */
public final class PackagingConfigurationStreamSelectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationStreamSelectionArgs Empty = new PackagingConfigurationStreamSelectionArgs();

    /**
     * The maximum video bitrate (bps) to include in output.
     * 
     */
    @Import(name="maxVideoBitsPerSecond")
      private final @Nullable Output<Integer> maxVideoBitsPerSecond;

    public Output<Integer> getMaxVideoBitsPerSecond() {
        return this.maxVideoBitsPerSecond == null ? Output.empty() : this.maxVideoBitsPerSecond;
    }

    /**
     * The minimum video bitrate (bps) to include in output.
     * 
     */
    @Import(name="minVideoBitsPerSecond")
      private final @Nullable Output<Integer> minVideoBitsPerSecond;

    public Output<Integer> getMinVideoBitsPerSecond() {
        return this.minVideoBitsPerSecond == null ? Output.empty() : this.minVideoBitsPerSecond;
    }

    /**
     * A directive that determines the order of streams in the output.
     * 
     */
    @Import(name="streamOrder")
      private final @Nullable Output<PackagingConfigurationStreamSelectionStreamOrder> streamOrder;

    public Output<PackagingConfigurationStreamSelectionStreamOrder> getStreamOrder() {
        return this.streamOrder == null ? Output.empty() : this.streamOrder;
    }

    public PackagingConfigurationStreamSelectionArgs(
        @Nullable Output<Integer> maxVideoBitsPerSecond,
        @Nullable Output<Integer> minVideoBitsPerSecond,
        @Nullable Output<PackagingConfigurationStreamSelectionStreamOrder> streamOrder) {
        this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
        this.minVideoBitsPerSecond = minVideoBitsPerSecond;
        this.streamOrder = streamOrder;
    }

    private PackagingConfigurationStreamSelectionArgs() {
        this.maxVideoBitsPerSecond = Output.empty();
        this.minVideoBitsPerSecond = Output.empty();
        this.streamOrder = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationStreamSelectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxVideoBitsPerSecond;
        private @Nullable Output<Integer> minVideoBitsPerSecond;
        private @Nullable Output<PackagingConfigurationStreamSelectionStreamOrder> streamOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationStreamSelectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxVideoBitsPerSecond = defaults.maxVideoBitsPerSecond;
    	      this.minVideoBitsPerSecond = defaults.minVideoBitsPerSecond;
    	      this.streamOrder = defaults.streamOrder;
        }

        public Builder maxVideoBitsPerSecond(@Nullable Output<Integer> maxVideoBitsPerSecond) {
            this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
            return this;
        }
        public Builder maxVideoBitsPerSecond(@Nullable Integer maxVideoBitsPerSecond) {
            this.maxVideoBitsPerSecond = Output.ofNullable(maxVideoBitsPerSecond);
            return this;
        }
        public Builder minVideoBitsPerSecond(@Nullable Output<Integer> minVideoBitsPerSecond) {
            this.minVideoBitsPerSecond = minVideoBitsPerSecond;
            return this;
        }
        public Builder minVideoBitsPerSecond(@Nullable Integer minVideoBitsPerSecond) {
            this.minVideoBitsPerSecond = Output.ofNullable(minVideoBitsPerSecond);
            return this;
        }
        public Builder streamOrder(@Nullable Output<PackagingConfigurationStreamSelectionStreamOrder> streamOrder) {
            this.streamOrder = streamOrder;
            return this;
        }
        public Builder streamOrder(@Nullable PackagingConfigurationStreamSelectionStreamOrder streamOrder) {
            this.streamOrder = Output.ofNullable(streamOrder);
            return this;
        }        public PackagingConfigurationStreamSelectionArgs build() {
            return new PackagingConfigurationStreamSelectionArgs(maxVideoBitsPerSecond, minVideoBitsPerSecond, streamOrder);
        }
    }
}
