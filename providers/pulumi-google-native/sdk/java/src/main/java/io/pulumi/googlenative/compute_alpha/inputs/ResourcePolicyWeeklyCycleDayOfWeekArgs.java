// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.ResourcePolicyWeeklyCycleDayOfWeekDay;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyWeeklyCycleDayOfWeekArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyWeeklyCycleDayOfWeekArgs Empty = new ResourcePolicyWeeklyCycleDayOfWeekArgs();

    /**
     * Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
     * 
     */
    @InputImport(name="day")
      private final @Nullable Output<ResourcePolicyWeeklyCycleDayOfWeekDay> day;

    public Output<ResourcePolicyWeeklyCycleDayOfWeekDay> getDay() {
        return this.day == null ? Output.empty() : this.day;
    }

    /**
     * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    public ResourcePolicyWeeklyCycleDayOfWeekArgs(
        @Nullable Output<ResourcePolicyWeeklyCycleDayOfWeekDay> day,
        @Nullable Output<String> startTime) {
        this.day = day;
        this.startTime = startTime;
    }

    private ResourcePolicyWeeklyCycleDayOfWeekArgs() {
        this.day = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyWeeklyCycleDayOfWeekArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourcePolicyWeeklyCycleDayOfWeekDay> day;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyWeeklyCycleDayOfWeekArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(@Nullable Output<ResourcePolicyWeeklyCycleDayOfWeekDay> day) {
            this.day = day;
            return this;
        }

        public Builder day(@Nullable ResourcePolicyWeeklyCycleDayOfWeekDay day) {
            this.day = Output.ofNullable(day);
            return this;
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }
        public ResourcePolicyWeeklyCycleDayOfWeekArgs build() {
            return new ResourcePolicyWeeklyCycleDayOfWeekArgs(day, startTime);
        }
    }
}
