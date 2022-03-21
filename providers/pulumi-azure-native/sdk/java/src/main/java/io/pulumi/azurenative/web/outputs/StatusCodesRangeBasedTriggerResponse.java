// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatusCodesRangeBasedTriggerResponse {
    /**
     * Request Count.
     * 
     */
    private final @Nullable Integer count;
    private final @Nullable String path;
    /**
     * HTTP status code.
     * 
     */
    private final @Nullable String statusCodes;
    /**
     * Time interval.
     * 
     */
    private final @Nullable String timeInterval;

    @CustomType.Constructor
    private StatusCodesRangeBasedTriggerResponse(
        @CustomType.Parameter("count") @Nullable Integer count,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("statusCodes") @Nullable String statusCodes,
        @CustomType.Parameter("timeInterval") @Nullable String timeInterval) {
        this.count = count;
        this.path = path;
        this.statusCodes = statusCodes;
        this.timeInterval = timeInterval;
    }

    /**
     * Request Count.
     * 
    */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * HTTP status code.
     * 
    */
    public Optional<String> getStatusCodes() {
        return Optional.ofNullable(this.statusCodes);
    }
    /**
     * Time interval.
     * 
    */
    public Optional<String> getTimeInterval() {
        return Optional.ofNullable(this.timeInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCodesRangeBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String path;
        private @Nullable String statusCodes;
        private @Nullable String timeInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCodesRangeBasedTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.path = defaults.path;
    	      this.statusCodes = defaults.statusCodes;
    	      this.timeInterval = defaults.timeInterval;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder statusCodes(@Nullable String statusCodes) {
            this.statusCodes = statusCodes;
            return this;
        }
        public Builder timeInterval(@Nullable String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }        public StatusCodesRangeBasedTriggerResponse build() {
            return new StatusCodesRangeBasedTriggerResponse(count, path, statusCodes, timeInterval);
        }
    }
}
