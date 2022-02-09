// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.AutoscaleTimeAndCapacityResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoscaleScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscaleScheduleResponse Empty = new AutoscaleScheduleResponse();

    @InputImport(name="days")
    private final @Nullable List<String> days;

    public List<String> getDays() {
        return this.days == null ? List.of() : this.days;
    }

    @InputImport(name="timeAndCapacity")
    private final @Nullable AutoscaleTimeAndCapacityResponse timeAndCapacity;

    public Optional<AutoscaleTimeAndCapacityResponse> getTimeAndCapacity() {
        return this.timeAndCapacity == null ? Optional.empty() : Optional.ofNullable(this.timeAndCapacity);
    }

    public AutoscaleScheduleResponse(
        @Nullable List<String> days,
        @Nullable AutoscaleTimeAndCapacityResponse timeAndCapacity) {
        this.days = days;
        this.timeAndCapacity = timeAndCapacity;
    }

    private AutoscaleScheduleResponse() {
        this.days = List.of();
        this.timeAndCapacity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> days;
        private @Nullable AutoscaleTimeAndCapacityResponse timeAndCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.timeAndCapacity = defaults.timeAndCapacity;
        }

        public Builder setDays(@Nullable List<String> days) {
            this.days = days;
            return this;
        }

        public Builder setTimeAndCapacity(@Nullable AutoscaleTimeAndCapacityResponse timeAndCapacity) {
            this.timeAndCapacity = timeAndCapacity;
            return this;
        }

        public AutoscaleScheduleResponse build() {
            return new AutoscaleScheduleResponse(days, timeAndCapacity);
        }
    }
}
