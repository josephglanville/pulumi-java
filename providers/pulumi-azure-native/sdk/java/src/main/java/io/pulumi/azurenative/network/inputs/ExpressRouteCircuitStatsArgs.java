// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains stats associated with the peering.
 * 
 */
public final class ExpressRouteCircuitStatsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitStatsArgs Empty = new ExpressRouteCircuitStatsArgs();

    /**
     * The Primary BytesIn of the peering.
     * 
     */
    @InputImport(name="primarybytesIn")
      private final @Nullable Input<Double> primarybytesIn;

    public Input<Double> getPrimarybytesIn() {
        return this.primarybytesIn == null ? Input.empty() : this.primarybytesIn;
    }

    /**
     * The primary BytesOut of the peering.
     * 
     */
    @InputImport(name="primarybytesOut")
      private final @Nullable Input<Double> primarybytesOut;

    public Input<Double> getPrimarybytesOut() {
        return this.primarybytesOut == null ? Input.empty() : this.primarybytesOut;
    }

    /**
     * The secondary BytesIn of the peering.
     * 
     */
    @InputImport(name="secondarybytesIn")
      private final @Nullable Input<Double> secondarybytesIn;

    public Input<Double> getSecondarybytesIn() {
        return this.secondarybytesIn == null ? Input.empty() : this.secondarybytesIn;
    }

    /**
     * The secondary BytesOut of the peering.
     * 
     */
    @InputImport(name="secondarybytesOut")
      private final @Nullable Input<Double> secondarybytesOut;

    public Input<Double> getSecondarybytesOut() {
        return this.secondarybytesOut == null ? Input.empty() : this.secondarybytesOut;
    }

    public ExpressRouteCircuitStatsArgs(
        @Nullable Input<Double> primarybytesIn,
        @Nullable Input<Double> primarybytesOut,
        @Nullable Input<Double> secondarybytesIn,
        @Nullable Input<Double> secondarybytesOut) {
        this.primarybytesIn = primarybytesIn;
        this.primarybytesOut = primarybytesOut;
        this.secondarybytesIn = secondarybytesIn;
        this.secondarybytesOut = secondarybytesOut;
    }

    private ExpressRouteCircuitStatsArgs() {
        this.primarybytesIn = Input.empty();
        this.primarybytesOut = Input.empty();
        this.secondarybytesIn = Input.empty();
        this.secondarybytesOut = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitStatsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> primarybytesIn;
        private @Nullable Input<Double> primarybytesOut;
        private @Nullable Input<Double> secondarybytesIn;
        private @Nullable Input<Double> secondarybytesOut;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitStatsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primarybytesIn = defaults.primarybytesIn;
    	      this.primarybytesOut = defaults.primarybytesOut;
    	      this.secondarybytesIn = defaults.secondarybytesIn;
    	      this.secondarybytesOut = defaults.secondarybytesOut;
        }

        public Builder setPrimarybytesIn(@Nullable Input<Double> primarybytesIn) {
            this.primarybytesIn = primarybytesIn;
            return this;
        }

        public Builder setPrimarybytesIn(@Nullable Double primarybytesIn) {
            this.primarybytesIn = Input.ofNullable(primarybytesIn);
            return this;
        }

        public Builder setPrimarybytesOut(@Nullable Input<Double> primarybytesOut) {
            this.primarybytesOut = primarybytesOut;
            return this;
        }

        public Builder setPrimarybytesOut(@Nullable Double primarybytesOut) {
            this.primarybytesOut = Input.ofNullable(primarybytesOut);
            return this;
        }

        public Builder setSecondarybytesIn(@Nullable Input<Double> secondarybytesIn) {
            this.secondarybytesIn = secondarybytesIn;
            return this;
        }

        public Builder setSecondarybytesIn(@Nullable Double secondarybytesIn) {
            this.secondarybytesIn = Input.ofNullable(secondarybytesIn);
            return this;
        }

        public Builder setSecondarybytesOut(@Nullable Input<Double> secondarybytesOut) {
            this.secondarybytesOut = secondarybytesOut;
            return this;
        }

        public Builder setSecondarybytesOut(@Nullable Double secondarybytesOut) {
            this.secondarybytesOut = Input.ofNullable(secondarybytesOut);
            return this;
        }
        public ExpressRouteCircuitStatsArgs build() {
            return new ExpressRouteCircuitStatsArgs(primarybytesIn, primarybytesOut, secondarybytesIn, secondarybytesOut);
        }
    }
}
