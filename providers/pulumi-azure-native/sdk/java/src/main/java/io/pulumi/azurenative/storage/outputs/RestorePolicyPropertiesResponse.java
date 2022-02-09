// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RestorePolicyPropertiesResponse {
    private final @Nullable Integer days;
    private final Boolean enabled;
    private final String lastEnabledTime;
    private final String minRestoreTime;

    @OutputCustomType.Constructor({"days","enabled","lastEnabledTime","minRestoreTime"})
    private RestorePolicyPropertiesResponse(
        @Nullable Integer days,
        Boolean enabled,
        String lastEnabledTime,
        String minRestoreTime) {
        this.days = days;
        this.enabled = Objects.requireNonNull(enabled);
        this.lastEnabledTime = Objects.requireNonNull(lastEnabledTime);
        this.minRestoreTime = Objects.requireNonNull(minRestoreTime);
    }

    public Optional<Integer> getDays() {
        return Optional.ofNullable(this.days);
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public String getLastEnabledTime() {
        return this.lastEnabledTime;
    }
    public String getMinRestoreTime() {
        return this.minRestoreTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;
        private Boolean enabled;
        private String lastEnabledTime;
        private String minRestoreTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
    	      this.lastEnabledTime = defaults.lastEnabledTime;
    	      this.minRestoreTime = defaults.minRestoreTime;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = days;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setLastEnabledTime(String lastEnabledTime) {
            this.lastEnabledTime = Objects.requireNonNull(lastEnabledTime);
            return this;
        }

        public Builder setMinRestoreTime(String minRestoreTime) {
            this.minRestoreTime = Objects.requireNonNull(minRestoreTime);
            return this;
        }

        public RestorePolicyPropertiesResponse build() {
            return new RestorePolicyPropertiesResponse(days, enabled, lastEnabledTime, minRestoreTime);
        }
    }
}
