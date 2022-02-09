// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DayDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DayDetailsArgs Empty = new DayDetailsArgs();

    @InputImport(name="time")
    private final @Nullable Input<String> time;

    public Input<String> getTime() {
        return this.time == null ? Input.empty() : this.time;
    }

    public DayDetailsArgs(@Nullable Input<String> time) {
        this.time = time;
    }

    private DayDetailsArgs() {
        this.time = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DayDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> time;

        public Builder() {
    	      // Empty
        }

        public Builder(DayDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.time = defaults.time;
        }

        public Builder setTime(@Nullable Input<String> time) {
            this.time = time;
            return this;
        }

        public Builder setTime(@Nullable String time) {
            this.time = Input.ofNullable(time);
            return this;
        }

        public DayDetailsArgs build() {
            return new DayDetailsArgs(time);
        }
    }
}
