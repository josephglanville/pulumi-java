// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HourDetailsResponse {
    private final @Nullable Integer minute;

    @OutputCustomType.Constructor({"minute"})
    private HourDetailsResponse(@Nullable Integer minute) {
        this.minute = minute;
    }

    public Optional<Integer> getMinute() {
        return Optional.ofNullable(this.minute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HourDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minute;

        public Builder() {
    	      // Empty
        }

        public Builder(HourDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minute = defaults.minute;
        }

        public Builder setMinute(@Nullable Integer minute) {
            this.minute = minute;
            return this;
        }

        public HourDetailsResponse build() {
            return new HourDetailsResponse(minute);
        }
    }
}
