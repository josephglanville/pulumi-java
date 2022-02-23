// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs Empty = new ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs();

    /**
     * Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    @InputImport(name="schedule", required=true)
      private final Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule;
    }

    public ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs(Input<String> schedule) {
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
    }

    private ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs() {
        this.schedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
        }

        public Builder setSchedule(Input<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }
        public ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs build() {
            return new ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs(schedule);
        }
    }
}
