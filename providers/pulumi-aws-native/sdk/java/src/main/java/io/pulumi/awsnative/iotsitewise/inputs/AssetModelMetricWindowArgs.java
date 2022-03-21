// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AssetModelTumblingWindowArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains a time interval window used for data aggregate computations (for example, average, sum, count, and so on).
 * 
 */
public final class AssetModelMetricWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetModelMetricWindowArgs Empty = new AssetModelMetricWindowArgs();

    @Import(name="tumbling")
      private final @Nullable Output<AssetModelTumblingWindowArgs> tumbling;

    public Output<AssetModelTumblingWindowArgs> getTumbling() {
        return this.tumbling == null ? Output.empty() : this.tumbling;
    }

    public AssetModelMetricWindowArgs(@Nullable Output<AssetModelTumblingWindowArgs> tumbling) {
        this.tumbling = tumbling;
    }

    private AssetModelMetricWindowArgs() {
        this.tumbling = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelMetricWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AssetModelTumblingWindowArgs> tumbling;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelMetricWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tumbling = defaults.tumbling;
        }

        public Builder tumbling(@Nullable Output<AssetModelTumblingWindowArgs> tumbling) {
            this.tumbling = tumbling;
            return this;
        }
        public Builder tumbling(@Nullable AssetModelTumblingWindowArgs tumbling) {
            this.tumbling = Output.ofNullable(tumbling);
            return this;
        }        public AssetModelMetricWindowArgs build() {
            return new AssetModelMetricWindowArgs(tumbling);
        }
    }
}
