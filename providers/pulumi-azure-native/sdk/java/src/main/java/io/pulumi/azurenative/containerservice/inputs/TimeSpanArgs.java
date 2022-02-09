// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TimeSpanArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeSpanArgs Empty = new TimeSpanArgs();

    @InputImport(name="end")
    private final @Nullable Input<String> end;

    public Input<String> getEnd() {
        return this.end == null ? Input.empty() : this.end;
    }

    @InputImport(name="start")
    private final @Nullable Input<String> start;

    public Input<String> getStart() {
        return this.start == null ? Input.empty() : this.start;
    }

    public TimeSpanArgs(
        @Nullable Input<String> end,
        @Nullable Input<String> start) {
        this.end = end;
        this.start = start;
    }

    private TimeSpanArgs() {
        this.end = Input.empty();
        this.start = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSpanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> end;
        private @Nullable Input<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSpanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder setEnd(@Nullable Input<String> end) {
            this.end = end;
            return this;
        }

        public Builder setEnd(@Nullable String end) {
            this.end = Input.ofNullable(end);
            return this;
        }

        public Builder setStart(@Nullable Input<String> start) {
            this.start = start;
            return this;
        }

        public Builder setStart(@Nullable String start) {
            this.start = Input.ofNullable(start);
            return this;
        }

        public TimeSpanArgs build() {
            return new TimeSpanArgs(end, start);
        }
    }
}
