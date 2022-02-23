// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LifecycleHookArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecycleHookArgs Empty = new LifecycleHookArgs();

    /**
     * The name of the Auto Scaling group for the lifecycle hook.
     * 
     */
    @InputImport(name="autoScalingGroupName", required=true)
      private final Input<String> autoScalingGroupName;

    public Input<String> getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an unexpected failure occurs. The valid values are CONTINUE and ABANDON (default).
     * 
     */
    @InputImport(name="defaultResult")
      private final @Nullable Input<String> defaultResult;

    public Input<String> getDefaultResult() {
        return this.defaultResult == null ? Input.empty() : this.defaultResult;
    }

    /**
     * The maximum time, in seconds, that can elapse before the lifecycle hook times out. The range is from 30 to 7200 seconds. The default value is 3600 seconds (1 hour). If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult property.
     * 
     */
    @InputImport(name="heartbeatTimeout")
      private final @Nullable Input<Integer> heartbeatTimeout;

    public Input<Integer> getHeartbeatTimeout() {
        return this.heartbeatTimeout == null ? Input.empty() : this.heartbeatTimeout;
    }

    /**
     * The name of the lifecycle hook.
     * 
     */
    @InputImport(name="lifecycleHookName")
      private final @Nullable Input<String> lifecycleHookName;

    public Input<String> getLifecycleHookName() {
        return this.lifecycleHookName == null ? Input.empty() : this.lifecycleHookName;
    }

    /**
     * The instance state to which you want to attach the lifecycle hook.
     * 
     */
    @InputImport(name="lifecycleTransition", required=true)
      private final Input<String> lifecycleTransition;

    public Input<String> getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    /**
     * Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification target.
     * 
     */
    @InputImport(name="notificationMetadata")
      private final @Nullable Input<String> notificationMetadata;

    public Input<String> getNotificationMetadata() {
        return this.notificationMetadata == null ? Input.empty() : this.notificationMetadata;
    }

    /**
     * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling uses to notify you when an instance is in the transition state for the lifecycle hook. You can specify an Amazon SQS queue or an Amazon SNS topic. The notification message includes the following information: lifecycle action token, user account ID, Auto Scaling group name, lifecycle hook name, instance ID, lifecycle transition, and notification metadata.
     * 
     */
    @InputImport(name="notificationTargetARN")
      private final @Nullable Input<String> notificationTargetARN;

    public Input<String> getNotificationTargetARN() {
        return this.notificationTargetARN == null ? Input.empty() : this.notificationTargetARN;
    }

    /**
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for example, an Amazon SNS topic or an Amazon SQS queue.
     * 
     */
    @InputImport(name="roleARN")
      private final @Nullable Input<String> roleARN;

    public Input<String> getRoleARN() {
        return this.roleARN == null ? Input.empty() : this.roleARN;
    }

    public LifecycleHookArgs(
        Input<String> autoScalingGroupName,
        @Nullable Input<String> defaultResult,
        @Nullable Input<Integer> heartbeatTimeout,
        @Nullable Input<String> lifecycleHookName,
        Input<String> lifecycleTransition,
        @Nullable Input<String> notificationMetadata,
        @Nullable Input<String> notificationTargetARN,
        @Nullable Input<String> roleARN) {
        this.autoScalingGroupName = Objects.requireNonNull(autoScalingGroupName, "expected parameter 'autoScalingGroupName' to be non-null");
        this.defaultResult = defaultResult;
        this.heartbeatTimeout = heartbeatTimeout;
        this.lifecycleHookName = lifecycleHookName;
        this.lifecycleTransition = Objects.requireNonNull(lifecycleTransition, "expected parameter 'lifecycleTransition' to be non-null");
        this.notificationMetadata = notificationMetadata;
        this.notificationTargetARN = notificationTargetARN;
        this.roleARN = roleARN;
    }

    private LifecycleHookArgs() {
        this.autoScalingGroupName = Input.empty();
        this.defaultResult = Input.empty();
        this.heartbeatTimeout = Input.empty();
        this.lifecycleHookName = Input.empty();
        this.lifecycleTransition = Input.empty();
        this.notificationMetadata = Input.empty();
        this.notificationTargetARN = Input.empty();
        this.roleARN = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecycleHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> autoScalingGroupName;
        private @Nullable Input<String> defaultResult;
        private @Nullable Input<Integer> heartbeatTimeout;
        private @Nullable Input<String> lifecycleHookName;
        private Input<String> lifecycleTransition;
        private @Nullable Input<String> notificationMetadata;
        private @Nullable Input<String> notificationTargetARN;
        private @Nullable Input<String> roleARN;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecycleHookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupName = defaults.autoScalingGroupName;
    	      this.defaultResult = defaults.defaultResult;
    	      this.heartbeatTimeout = defaults.heartbeatTimeout;
    	      this.lifecycleHookName = defaults.lifecycleHookName;
    	      this.lifecycleTransition = defaults.lifecycleTransition;
    	      this.notificationMetadata = defaults.notificationMetadata;
    	      this.notificationTargetARN = defaults.notificationTargetARN;
    	      this.roleARN = defaults.roleARN;
        }

        public Builder setAutoScalingGroupName(Input<String> autoScalingGroupName) {
            this.autoScalingGroupName = Objects.requireNonNull(autoScalingGroupName);
            return this;
        }

        public Builder setAutoScalingGroupName(String autoScalingGroupName) {
            this.autoScalingGroupName = Input.of(Objects.requireNonNull(autoScalingGroupName));
            return this;
        }

        public Builder setDefaultResult(@Nullable Input<String> defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }

        public Builder setDefaultResult(@Nullable String defaultResult) {
            this.defaultResult = Input.ofNullable(defaultResult);
            return this;
        }

        public Builder setHeartbeatTimeout(@Nullable Input<Integer> heartbeatTimeout) {
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        public Builder setHeartbeatTimeout(@Nullable Integer heartbeatTimeout) {
            this.heartbeatTimeout = Input.ofNullable(heartbeatTimeout);
            return this;
        }

        public Builder setLifecycleHookName(@Nullable Input<String> lifecycleHookName) {
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }

        public Builder setLifecycleHookName(@Nullable String lifecycleHookName) {
            this.lifecycleHookName = Input.ofNullable(lifecycleHookName);
            return this;
        }

        public Builder setLifecycleTransition(Input<String> lifecycleTransition) {
            this.lifecycleTransition = Objects.requireNonNull(lifecycleTransition);
            return this;
        }

        public Builder setLifecycleTransition(String lifecycleTransition) {
            this.lifecycleTransition = Input.of(Objects.requireNonNull(lifecycleTransition));
            return this;
        }

        public Builder setNotificationMetadata(@Nullable Input<String> notificationMetadata) {
            this.notificationMetadata = notificationMetadata;
            return this;
        }

        public Builder setNotificationMetadata(@Nullable String notificationMetadata) {
            this.notificationMetadata = Input.ofNullable(notificationMetadata);
            return this;
        }

        public Builder setNotificationTargetARN(@Nullable Input<String> notificationTargetARN) {
            this.notificationTargetARN = notificationTargetARN;
            return this;
        }

        public Builder setNotificationTargetARN(@Nullable String notificationTargetARN) {
            this.notificationTargetARN = Input.ofNullable(notificationTargetARN);
            return this;
        }

        public Builder setRoleARN(@Nullable Input<String> roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        public Builder setRoleARN(@Nullable String roleARN) {
            this.roleARN = Input.ofNullable(roleARN);
            return this;
        }
        public LifecycleHookArgs build() {
            return new LifecycleHookArgs(autoScalingGroupName, defaultResult, heartbeatTimeout, lifecycleHookName, lifecycleTransition, notificationMetadata, notificationTargetARN, roleARN);
        }
    }
}
