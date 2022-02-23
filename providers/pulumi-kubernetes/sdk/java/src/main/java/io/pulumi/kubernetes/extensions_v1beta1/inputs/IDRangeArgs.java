// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * IDRange provides a min/max of an allowed range of IDs. Deprecated: use IDRange from policy API Group instead.
 * 
 */
public final class IDRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final IDRangeArgs Empty = new IDRangeArgs();

    /**
     * max is the end of the range, inclusive.
     * 
     */
    @InputImport(name="max", required=true)
      private final Input<Integer> max;

    public Input<Integer> getMax() {
        return this.max;
    }

    /**
     * min is the start of the range, inclusive.
     * 
     */
    @InputImport(name="min", required=true)
      private final Input<Integer> min;

    public Input<Integer> getMin() {
        return this.min;
    }

    public IDRangeArgs(
        Input<Integer> max,
        Input<Integer> min) {
        this.max = Objects.requireNonNull(max, "expected parameter 'max' to be non-null");
        this.min = Objects.requireNonNull(min, "expected parameter 'min' to be non-null");
    }

    private IDRangeArgs() {
        this.max = Input.empty();
        this.min = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IDRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> max;
        private Input<Integer> min;

        public Builder() {
    	      // Empty
        }

        public Builder(IDRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder setMax(Input<Integer> max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }

        public Builder setMax(Integer max) {
            this.max = Input.of(Objects.requireNonNull(max));
            return this;
        }

        public Builder setMin(Input<Integer> min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }

        public Builder setMin(Integer min) {
            this.min = Input.of(Objects.requireNonNull(min));
            return this;
        }
        public IDRangeArgs build() {
            return new IDRangeArgs(max, min);
        }
    }
}
