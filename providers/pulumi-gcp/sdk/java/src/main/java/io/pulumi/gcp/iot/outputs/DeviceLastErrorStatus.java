// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeviceLastErrorStatus {
    private final @Nullable List<Map<String,Object>> details;
    private final @Nullable String message;
    private final @Nullable Integer number;

    @OutputCustomType.Constructor({"details","message","number"})
    private DeviceLastErrorStatus(
        @Nullable List<Map<String,Object>> details,
        @Nullable String message,
        @Nullable Integer number) {
        this.details = details;
        this.message = message;
        this.number = number;
    }

    public List<Map<String,Object>> getDetails() {
        return this.details == null ? List.of() : this.details;
    }
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<Integer> getNumber() {
        return Optional.ofNullable(this.number);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceLastErrorStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Map<String,Object>> details;
        private @Nullable String message;
        private @Nullable Integer number;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceLastErrorStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.number = defaults.number;
        }

        public Builder setDetails(@Nullable List<Map<String,Object>> details) {
            this.details = details;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setNumber(@Nullable Integer number) {
            this.number = number;
            return this;
        }

        public DeviceLastErrorStatus build() {
            return new DeviceLastErrorStatus(details, message, number);
        }
    }
}