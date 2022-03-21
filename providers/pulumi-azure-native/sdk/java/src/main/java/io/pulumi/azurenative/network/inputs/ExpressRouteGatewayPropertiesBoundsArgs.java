// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Minimum and maximum number of scale units to deploy.
 * 
 */
public final class ExpressRouteGatewayPropertiesBoundsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteGatewayPropertiesBoundsArgs Empty = new ExpressRouteGatewayPropertiesBoundsArgs();

    /**
     * Maximum number of scale units deployed for ExpressRoute gateway.
     * 
     */
    @Import(name="max")
      private final @Nullable Output<Integer> max;

    public Output<Integer> getMax() {
        return this.max == null ? Output.empty() : this.max;
    }

    /**
     * Minimum number of scale units deployed for ExpressRoute gateway.
     * 
     */
    @Import(name="min")
      private final @Nullable Output<Integer> min;

    public Output<Integer> getMin() {
        return this.min == null ? Output.empty() : this.min;
    }

    public ExpressRouteGatewayPropertiesBoundsArgs(
        @Nullable Output<Integer> max,
        @Nullable Output<Integer> min) {
        this.max = max;
        this.min = min;
    }

    private ExpressRouteGatewayPropertiesBoundsArgs() {
        this.max = Output.empty();
        this.min = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteGatewayPropertiesBoundsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> max;
        private @Nullable Output<Integer> min;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteGatewayPropertiesBoundsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(@Nullable Output<Integer> max) {
            this.max = max;
            return this;
        }
        public Builder max(@Nullable Integer max) {
            this.max = Output.ofNullable(max);
            return this;
        }
        public Builder min(@Nullable Output<Integer> min) {
            this.min = min;
            return this;
        }
        public Builder min(@Nullable Integer min) {
            this.min = Output.ofNullable(min);
            return this;
        }        public ExpressRouteGatewayPropertiesBoundsArgs build() {
            return new ExpressRouteGatewayPropertiesBoundsArgs(max, min);
        }
    }
}
