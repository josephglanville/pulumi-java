// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LifecycleHookState extends io.pulumi.resources.ResourceArgs {

    public static final LifecycleHookState Empty = new LifecycleHookState();

    /**
     * The name of the Auto Scaling group to which you want to assign the lifecycle hook
     * 
     */
    @Import(name="autoscalingGroupName")
      private final @Nullable Output<String> autoscalingGroupName;

    public Output<String> getAutoscalingGroupName() {
        return this.autoscalingGroupName == null ? Output.empty() : this.autoscalingGroupName;
    }

    /**
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
     * 
     */
    @Import(name="defaultResult")
      private final @Nullable Output<String> defaultResult;

    public Output<String> getDefaultResult() {
        return this.defaultResult == null ? Output.empty() : this.defaultResult;
    }

    /**
     * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
     * 
     */
    @Import(name="heartbeatTimeout")
      private final @Nullable Output<Integer> heartbeatTimeout;

    public Output<Integer> getHeartbeatTimeout() {
        return this.heartbeatTimeout == null ? Output.empty() : this.heartbeatTimeout;
    }

    /**
     * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
     * 
     */
    @Import(name="lifecycleTransition")
      private final @Nullable Output<String> lifecycleTransition;

    public Output<String> getLifecycleTransition() {
        return this.lifecycleTransition == null ? Output.empty() : this.lifecycleTransition;
    }

    /**
     * The name of the lifecycle hook.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
     * 
     */
    @Import(name="notificationMetadata")
      private final @Nullable Output<String> notificationMetadata;

    public Output<String> getNotificationMetadata() {
        return this.notificationMetadata == null ? Output.empty() : this.notificationMetadata;
    }

    /**
     * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
     * 
     */
    @Import(name="notificationTargetArn")
      private final @Nullable Output<String> notificationTargetArn;

    public Output<String> getNotificationTargetArn() {
        return this.notificationTargetArn == null ? Output.empty() : this.notificationTargetArn;
    }

    /**
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    public LifecycleHookState(
        @Nullable Output<String> autoscalingGroupName,
        @Nullable Output<String> defaultResult,
        @Nullable Output<Integer> heartbeatTimeout,
        @Nullable Output<String> lifecycleTransition,
        @Nullable Output<String> name,
        @Nullable Output<String> notificationMetadata,
        @Nullable Output<String> notificationTargetArn,
        @Nullable Output<String> roleArn) {
        this.autoscalingGroupName = autoscalingGroupName;
        this.defaultResult = defaultResult;
        this.heartbeatTimeout = heartbeatTimeout;
        this.lifecycleTransition = lifecycleTransition;
        this.name = name;
        this.notificationMetadata = notificationMetadata;
        this.notificationTargetArn = notificationTargetArn;
        this.roleArn = roleArn;
    }

    private LifecycleHookState() {
        this.autoscalingGroupName = Output.empty();
        this.defaultResult = Output.empty();
        this.heartbeatTimeout = Output.empty();
        this.lifecycleTransition = Output.empty();
        this.name = Output.empty();
        this.notificationMetadata = Output.empty();
        this.notificationTargetArn = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecycleHookState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoscalingGroupName;
        private @Nullable Output<String> defaultResult;
        private @Nullable Output<Integer> heartbeatTimeout;
        private @Nullable Output<String> lifecycleTransition;
        private @Nullable Output<String> name;
        private @Nullable Output<String> notificationMetadata;
        private @Nullable Output<String> notificationTargetArn;
        private @Nullable Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecycleHookState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingGroupName = defaults.autoscalingGroupName;
    	      this.defaultResult = defaults.defaultResult;
    	      this.heartbeatTimeout = defaults.heartbeatTimeout;
    	      this.lifecycleTransition = defaults.lifecycleTransition;
    	      this.name = defaults.name;
    	      this.notificationMetadata = defaults.notificationMetadata;
    	      this.notificationTargetArn = defaults.notificationTargetArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder autoscalingGroupName(@Nullable Output<String> autoscalingGroupName) {
            this.autoscalingGroupName = autoscalingGroupName;
            return this;
        }
        public Builder autoscalingGroupName(@Nullable String autoscalingGroupName) {
            this.autoscalingGroupName = Output.ofNullable(autoscalingGroupName);
            return this;
        }
        public Builder defaultResult(@Nullable Output<String> defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }
        public Builder defaultResult(@Nullable String defaultResult) {
            this.defaultResult = Output.ofNullable(defaultResult);
            return this;
        }
        public Builder heartbeatTimeout(@Nullable Output<Integer> heartbeatTimeout) {
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }
        public Builder heartbeatTimeout(@Nullable Integer heartbeatTimeout) {
            this.heartbeatTimeout = Output.ofNullable(heartbeatTimeout);
            return this;
        }
        public Builder lifecycleTransition(@Nullable Output<String> lifecycleTransition) {
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }
        public Builder lifecycleTransition(@Nullable String lifecycleTransition) {
            this.lifecycleTransition = Output.ofNullable(lifecycleTransition);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder notificationMetadata(@Nullable Output<String> notificationMetadata) {
            this.notificationMetadata = notificationMetadata;
            return this;
        }
        public Builder notificationMetadata(@Nullable String notificationMetadata) {
            this.notificationMetadata = Output.ofNullable(notificationMetadata);
            return this;
        }
        public Builder notificationTargetArn(@Nullable Output<String> notificationTargetArn) {
            this.notificationTargetArn = notificationTargetArn;
            return this;
        }
        public Builder notificationTargetArn(@Nullable String notificationTargetArn) {
            this.notificationTargetArn = Output.ofNullable(notificationTargetArn);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }        public LifecycleHookState build() {
            return new LifecycleHookState(autoscalingGroupName, defaultResult, heartbeatTimeout, lifecycleTransition, name, notificationMetadata, notificationTargetArn, roleArn);
        }
    }
}
