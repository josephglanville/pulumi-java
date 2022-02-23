// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Qos Traffic Profiler Port range properties.
 * 
 */
public final class QosPortRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final QosPortRangeArgs Empty = new QosPortRangeArgs();

    /**
     * Qos Port Range end.
     * 
     */
    @InputImport(name="end")
      private final @Nullable Input<Integer> end;

    public Input<Integer> getEnd() {
        return this.end == null ? Input.empty() : this.end;
    }

    /**
     * Qos Port Range start.
     * 
     */
    @InputImport(name="start")
      private final @Nullable Input<Integer> start;

    public Input<Integer> getStart() {
        return this.start == null ? Input.empty() : this.start;
    }

    public QosPortRangeArgs(
        @Nullable Input<Integer> end,
        @Nullable Input<Integer> start) {
        this.end = end;
        this.start = start;
    }

    private QosPortRangeArgs() {
        this.end = Input.empty();
        this.start = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QosPortRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> end;
        private @Nullable Input<Integer> start;

        public Builder() {
    	      // Empty
        }

        public Builder(QosPortRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder setEnd(@Nullable Input<Integer> end) {
            this.end = end;
            return this;
        }

        public Builder setEnd(@Nullable Integer end) {
            this.end = Input.ofNullable(end);
            return this;
        }

        public Builder setStart(@Nullable Input<Integer> start) {
            this.start = start;
            return this;
        }

        public Builder setStart(@Nullable Integer start) {
            this.start = Input.ofNullable(start);
            return this;
        }
        public QosPortRangeArgs build() {
            return new QosPortRangeArgs(end, start);
        }
    }
}
