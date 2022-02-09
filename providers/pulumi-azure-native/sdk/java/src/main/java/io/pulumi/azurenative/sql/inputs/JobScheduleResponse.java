// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobScheduleResponse Empty = new JobScheduleResponse();

    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    @InputImport(name="endTime")
    private final @Nullable String endTime;

    public Optional<String> getEndTime() {
        return this.endTime == null ? Optional.empty() : Optional.ofNullable(this.endTime);
    }

    @InputImport(name="interval")
    private final @Nullable String interval;

    public Optional<String> getInterval() {
        return this.interval == null ? Optional.empty() : Optional.ofNullable(this.interval);
    }

    @InputImport(name="startTime")
    private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public JobScheduleResponse(
        @Nullable Boolean enabled,
        @Nullable String endTime,
        @Nullable String interval,
        @Nullable String startTime,
        @Nullable String type) {
        this.enabled = enabled;
        this.endTime = endTime == null ? "9999-12-31T11:59:59+00:00" : endTime;
        this.interval = interval;
        this.startTime = startTime == null ? "0001-01-01T00:00:00+00:00" : startTime;
        this.type = type == null ? "Once" : type;
    }

    private JobScheduleResponse() {
        this.enabled = null;
        this.endTime = null;
        this.interval = null;
        this.startTime = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String endTime;
        private @Nullable String interval;
        private @Nullable String startTime;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.endTime = defaults.endTime;
    	      this.interval = defaults.interval;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setInterval(@Nullable String interval) {
            this.interval = interval;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public JobScheduleResponse build() {
            return new JobScheduleResponse(enabled, endTime, interval, startTime, type);
        }
    }
}
