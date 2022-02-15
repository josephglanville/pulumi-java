// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.outputs;

import io.pulumi.awsnative.stepfunctions.outputs.StateMachineCloudWatchLogsLogGroup;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StateMachineLogDestination {
    private final @Nullable StateMachineCloudWatchLogsLogGroup cloudWatchLogsLogGroup;

    @OutputCustomType.Constructor({"cloudWatchLogsLogGroup"})
    private StateMachineLogDestination(@Nullable StateMachineCloudWatchLogsLogGroup cloudWatchLogsLogGroup) {
        this.cloudWatchLogsLogGroup = cloudWatchLogsLogGroup;
    }

    public Optional<StateMachineCloudWatchLogsLogGroup> getCloudWatchLogsLogGroup() {
        return Optional.ofNullable(this.cloudWatchLogsLogGroup);
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

        public Builder setCloudWatchLogsLogGroup(@Nullable StateMachineCloudWatchLogsLogGroup cloudWatchLogsLogGroup) {
            this.cloudWatchLogsLogGroup = cloudWatchLogsLogGroup;
            return this;
        }

        public StateMachineLogDestination build() {
            return new StateMachineLogDestination(cloudWatchLogsLogGroup);
        }
    }
}