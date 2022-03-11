// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EnvironmentConfigMaintenanceWindowGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigMaintenanceWindowGetArgs Empty = new EnvironmentConfigMaintenanceWindowGetArgs();

    @InputImport(name="endTime", required=true)
      private final Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime;
    }

    @InputImport(name="recurrence", required=true)
      private final Output<String> recurrence;

    public Output<String> getRecurrence() {
        return this.recurrence;
    }

    @InputImport(name="startTime", required=true)
      private final Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime;
    }

    public EnvironmentConfigMaintenanceWindowGetArgs(
        Output<String> endTime,
        Output<String> recurrence,
        Output<String> startTime) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.recurrence = Objects.requireNonNull(recurrence, "expected parameter 'recurrence' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private EnvironmentConfigMaintenanceWindowGetArgs() {
        this.endTime = Output.empty();
        this.recurrence = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigMaintenanceWindowGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endTime;
        private Output<String> recurrence;
        private Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigMaintenanceWindowGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(Output<String> endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = Output.of(Objects.requireNonNull(endTime));
            return this;
        }

        public Builder recurrence(Output<String> recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }

        public Builder recurrence(String recurrence) {
            this.recurrence = Output.of(Objects.requireNonNull(recurrence));
            return this;
        }

        public Builder startTime(Output<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }
        public EnvironmentConfigMaintenanceWindowGetArgs build() {
            return new EnvironmentConfigMaintenanceWindowGetArgs(endTime, recurrence, startTime);
        }
    }
}
