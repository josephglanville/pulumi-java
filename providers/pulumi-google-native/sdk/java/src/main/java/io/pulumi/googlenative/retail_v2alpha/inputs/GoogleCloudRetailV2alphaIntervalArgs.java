// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A floating point interval.
 * 
 */
public final class GoogleCloudRetailV2alphaIntervalArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaIntervalArgs Empty = new GoogleCloudRetailV2alphaIntervalArgs();

    /**
     * Exclusive upper bound.
     * 
     */
    @Import(name="exclusiveMaximum")
      private final @Nullable Output<Double> exclusiveMaximum;

    public Output<Double> getExclusiveMaximum() {
        return this.exclusiveMaximum == null ? Codegen.empty() : this.exclusiveMaximum;
    }

    /**
     * Exclusive lower bound.
     * 
     */
    @Import(name="exclusiveMinimum")
      private final @Nullable Output<Double> exclusiveMinimum;

    public Output<Double> getExclusiveMinimum() {
        return this.exclusiveMinimum == null ? Codegen.empty() : this.exclusiveMinimum;
    }

    /**
     * Inclusive upper bound.
     * 
     */
    @Import(name="maximum")
      private final @Nullable Output<Double> maximum;

    public Output<Double> getMaximum() {
        return this.maximum == null ? Codegen.empty() : this.maximum;
    }

    /**
     * Inclusive lower bound.
     * 
     */
    @Import(name="minimum")
      private final @Nullable Output<Double> minimum;

    public Output<Double> getMinimum() {
        return this.minimum == null ? Codegen.empty() : this.minimum;
    }

    public GoogleCloudRetailV2alphaIntervalArgs(
        @Nullable Output<Double> exclusiveMaximum,
        @Nullable Output<Double> exclusiveMinimum,
        @Nullable Output<Double> maximum,
        @Nullable Output<Double> minimum) {
        this.exclusiveMaximum = exclusiveMaximum;
        this.exclusiveMinimum = exclusiveMinimum;
        this.maximum = maximum;
        this.minimum = minimum;
    }

    private GoogleCloudRetailV2alphaIntervalArgs() {
        this.exclusiveMaximum = Codegen.empty();
        this.exclusiveMinimum = Codegen.empty();
        this.maximum = Codegen.empty();
        this.minimum = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaIntervalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> exclusiveMaximum;
        private @Nullable Output<Double> exclusiveMinimum;
        private @Nullable Output<Double> maximum;
        private @Nullable Output<Double> minimum;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaIntervalArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusiveMaximum = defaults.exclusiveMaximum;
    	      this.exclusiveMinimum = defaults.exclusiveMinimum;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
        }

        public Builder exclusiveMaximum(@Nullable Output<Double> exclusiveMaximum) {
            this.exclusiveMaximum = exclusiveMaximum;
            return this;
        }
        public Builder exclusiveMaximum(@Nullable Double exclusiveMaximum) {
            this.exclusiveMaximum = Codegen.ofNullable(exclusiveMaximum);
            return this;
        }
        public Builder exclusiveMinimum(@Nullable Output<Double> exclusiveMinimum) {
            this.exclusiveMinimum = exclusiveMinimum;
            return this;
        }
        public Builder exclusiveMinimum(@Nullable Double exclusiveMinimum) {
            this.exclusiveMinimum = Codegen.ofNullable(exclusiveMinimum);
            return this;
        }
        public Builder maximum(@Nullable Output<Double> maximum) {
            this.maximum = maximum;
            return this;
        }
        public Builder maximum(@Nullable Double maximum) {
            this.maximum = Codegen.ofNullable(maximum);
            return this;
        }
        public Builder minimum(@Nullable Output<Double> minimum) {
            this.minimum = minimum;
            return this;
        }
        public Builder minimum(@Nullable Double minimum) {
            this.minimum = Codegen.ofNullable(minimum);
            return this;
        }        public GoogleCloudRetailV2alphaIntervalArgs build() {
            return new GoogleCloudRetailV2alphaIntervalArgs(exclusiveMaximum, exclusiveMinimum, maximum, minimum);
        }
    }
}
