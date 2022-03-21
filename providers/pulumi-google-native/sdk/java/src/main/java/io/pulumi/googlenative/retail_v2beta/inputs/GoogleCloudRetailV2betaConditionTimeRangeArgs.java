// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Used for time-dependent conditions. Example: Want to have rule applied for week long sale.
 * 
 */
public final class GoogleCloudRetailV2betaConditionTimeRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaConditionTimeRangeArgs Empty = new GoogleCloudRetailV2betaConditionTimeRangeArgs();

    /**
     * End of time range. Range is inclusive.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Output.empty() : this.endTime;
    }

    /**
     * Start of time range. Range is inclusive.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    public GoogleCloudRetailV2betaConditionTimeRangeArgs(
        @Nullable Output<String> endTime,
        @Nullable Output<String> startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }

    private GoogleCloudRetailV2betaConditionTimeRangeArgs() {
        this.endTime = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaConditionTimeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endTime;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaConditionTimeRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = Output.ofNullable(endTime);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }        public GoogleCloudRetailV2betaConditionTimeRangeArgs build() {
            return new GoogleCloudRetailV2betaConditionTimeRangeArgs(endTime, startTime);
        }
    }
}
