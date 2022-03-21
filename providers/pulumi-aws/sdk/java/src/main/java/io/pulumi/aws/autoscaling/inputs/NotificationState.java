// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationState extends io.pulumi.resources.ResourceArgs {

    public static final NotificationState Empty = new NotificationState();

    /**
     * A list of AutoScaling Group Names
     * 
     */
    @Import(name="groupNames")
      private final @Nullable Output<List<String>> groupNames;

    public Output<List<String>> getGroupNames() {
        return this.groupNames == null ? Output.empty() : this.groupNames;
    }

    /**
     * A list of Notification Types that trigger
     * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
     * 
     */
    @Import(name="notifications")
      private final @Nullable Output<List<String>> notifications;

    public Output<List<String>> getNotifications() {
        return this.notifications == null ? Output.empty() : this.notifications;
    }

    /**
     * The Topic ARN for notifications to be sent through
     * 
     */
    @Import(name="topicArn")
      private final @Nullable Output<String> topicArn;

    public Output<String> getTopicArn() {
        return this.topicArn == null ? Output.empty() : this.topicArn;
    }

    public NotificationState(
        @Nullable Output<List<String>> groupNames,
        @Nullable Output<List<String>> notifications,
        @Nullable Output<String> topicArn) {
        this.groupNames = groupNames;
        this.notifications = notifications;
        this.topicArn = topicArn;
    }

    private NotificationState() {
        this.groupNames = Output.empty();
        this.notifications = Output.empty();
        this.topicArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> groupNames;
        private @Nullable Output<List<String>> notifications;
        private @Nullable Output<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupNames = defaults.groupNames;
    	      this.notifications = defaults.notifications;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder groupNames(@Nullable Output<List<String>> groupNames) {
            this.groupNames = groupNames;
            return this;
        }
        public Builder groupNames(@Nullable List<String> groupNames) {
            this.groupNames = Output.ofNullable(groupNames);
            return this;
        }
        public Builder groupNames(String... groupNames) {
            return groupNames(List.of(groupNames));
        }
        public Builder notifications(@Nullable Output<List<String>> notifications) {
            this.notifications = notifications;
            return this;
        }
        public Builder notifications(@Nullable List<String> notifications) {
            this.notifications = Output.ofNullable(notifications);
            return this;
        }
        public Builder notifications(String... notifications) {
            return notifications(List.of(notifications));
        }
        public Builder topicArn(@Nullable Output<String> topicArn) {
            this.topicArn = topicArn;
            return this;
        }
        public Builder topicArn(@Nullable String topicArn) {
            this.topicArn = Output.ofNullable(topicArn);
            return this;
        }        public NotificationState build() {
            return new NotificationState(groupNames, notifications, topicArn);
        }
    }
}
