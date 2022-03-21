// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.inputs;

import io.pulumi.awsnative.stepfunctions.inputs.StateMachineCloudWatchLogsLogGroup;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StateMachineLogDestination extends io.pulumi.resources.InvokeArgs {

    public static final StateMachineLogDestination Empty = new StateMachineLogDestination();

    @Import(name="cloudWatchLogsLogGroup")
      private final @Nullable StateMachineCloudWatchLogsLogGroup cloudWatchLogsLogGroup;

    public Optional<StateMachineCloudWatchLogsLogGroup> getCloudWatchLogsLogGroup() {
        return this.cloudWatchLogsLogGroup == null ? Optional.empty() : Optional.ofNullable(this.cloudWatchLogsLogGroup);
    }

    public StateMachineLogDestination(@Nullable StateMachineCloudWatchLogsLogGroup cloudWatchLogsLogGroup) {
        this.cloudWatchLogsLogGroup = cloudWatchLogsLogGroup;
    }

    private StateMachineLogDestination() {
        this.cloudWatchLogsLogGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StateMachineCloudWatchLogsLogGroup cloudWatchLogsLogGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogsLogGroup = defaults.cloudWatchLogsLogGroup;
        }

        public Builder cloudWatchLogsLogGroup(@Nullable StateMachineCloudWatchLogsLogGroup cloudWatchLogsLogGroup) {
            this.cloudWatchLogsLogGroup = cloudWatchLogsLogGroup;
            return this;
        }        public StateMachineLogDestination build() {
            return new StateMachineLogDestination(cloudWatchLogsLogGroup);
        }
    }
}
