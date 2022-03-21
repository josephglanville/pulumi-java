// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs Empty = new ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs();

    /**
     * Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    @Import(name="schedule", required=true)
      private final Output<String> schedule;

    public Output<String> getSchedule() {
        return this.schedule;
    }

    public ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs(Output<String> schedule) {
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
    }

    private ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs() {
        this.schedule = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
        }

        public Builder schedule(Output<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder schedule(String schedule) {
            this.schedule = Output.of(Objects.requireNonNull(schedule));
            return this;
        }        public ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs build() {
            return new ResourcePolicyInstanceSchedulePolicyVmStopScheduleGetArgs(schedule);
        }
    }
}
