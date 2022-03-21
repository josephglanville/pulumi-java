// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * A class that contains the optimized auto scale definition.
 * 
 */
public final class OptimizedAutoscaleArgs extends io.pulumi.resources.ResourceArgs {

    public static final OptimizedAutoscaleArgs Empty = new OptimizedAutoscaleArgs();

    /**
     * A boolean value that indicate if the optimized autoscale feature is enabled or not.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Maximum allowed instances count.
     * 
     */
    @Import(name="maximum", required=true)
      private final Output<Integer> maximum;

    public Output<Integer> getMaximum() {
        return this.maximum;
    }

    /**
     * Minimum allowed instances count.
     * 
     */
    @Import(name="minimum", required=true)
      private final Output<Integer> minimum;

    public Output<Integer> getMinimum() {
        return this.minimum;
    }

    /**
     * The version of the template defined, for instance 1.
     * 
     */
    @Import(name="version", required=true)
      private final Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version;
    }

    public OptimizedAutoscaleArgs(
        Output<Boolean> isEnabled,
        Output<Integer> maximum,
        Output<Integer> minimum,
        Output<Integer> version) {
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.maximum = Objects.requireNonNull(maximum, "expected parameter 'maximum' to be non-null");
        this.minimum = Objects.requireNonNull(minimum, "expected parameter 'minimum' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private OptimizedAutoscaleArgs() {
        this.isEnabled = Output.empty();
        this.maximum = Output.empty();
        this.minimum = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptimizedAutoscaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> isEnabled;
        private Output<Integer> maximum;
        private Output<Integer> minimum;
        private Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(OptimizedAutoscaleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.version = defaults.version;
        }

        public Builder isEnabled(Output<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Output.of(Objects.requireNonNull(isEnabled));
            return this;
        }
        public Builder maximum(Output<Integer> maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }
        public Builder maximum(Integer maximum) {
            this.maximum = Output.of(Objects.requireNonNull(maximum));
            return this;
        }
        public Builder minimum(Output<Integer> minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }
        public Builder minimum(Integer minimum) {
            this.minimum = Output.of(Objects.requireNonNull(minimum));
            return this;
        }
        public Builder version(Output<Integer> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(Integer version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public OptimizedAutoscaleArgs build() {
            return new OptimizedAutoscaleArgs(isEnabled, maximum, minimum, version);
        }
    }
}
