// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventRuleArgs Empty = new EventRuleArgs();

    /**
     * The description of the rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The event bus to associate with this rule. If you omit this, the `default` event bus is used.
     * 
     */
    @InputImport(name="eventBusName")
      private final @Nullable Output<String> eventBusName;

    public Output<String> getEventBusName() {
        return this.eventBusName == null ? Output.empty() : this.eventBusName;
    }

    /**
     * The event pattern described a JSON object. At least one of `schedule_expression` or `event_pattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details.
     * 
     */
    @InputImport(name="eventPattern")
      private final @Nullable Output<String> eventPattern;

    public Output<String> getEventPattern() {
        return this.eventPattern == null ? Output.empty() : this.eventPattern;
    }

    /**
     * Whether the rule should be enabled (defaults to `true`).
     * 
     */
    @InputImport(name="isEnabled")
      private final @Nullable Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled == null ? Output.empty() : this.isEnabled;
    }

    /**
     * The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Output.empty() : this.namePrefix;
    }

    /**
     * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
     * 
     */
    @InputImport(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    /**
     * The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `schedule_expression` or `event_pattern` is required. Can only be used on the default event bus. For more information, refer to the AWS documentation [Schedule Expressions for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html).
     * 
     */
    @InputImport(name="scheduleExpression")
      private final @Nullable Output<String> scheduleExpression;

    public Output<String> getScheduleExpression() {
        return this.scheduleExpression == null ? Output.empty() : this.scheduleExpression;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public EventRuleArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> eventBusName,
        @Nullable Output<String> eventPattern,
        @Nullable Output<Boolean> isEnabled,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> roleArn,
        @Nullable Output<String> scheduleExpression,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.eventBusName = eventBusName;
        this.eventPattern = eventPattern;
        this.isEnabled = isEnabled;
        this.name = name;
        this.namePrefix = namePrefix;
        this.roleArn = roleArn;
        this.scheduleExpression = scheduleExpression;
        this.tags = tags;
    }

    private EventRuleArgs() {
        this.description = Output.empty();
        this.eventBusName = Output.empty();
        this.eventPattern = Output.empty();
        this.isEnabled = Output.empty();
        this.name = Output.empty();
        this.namePrefix = Output.empty();
        this.roleArn = Output.empty();
        this.scheduleExpression = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> eventBusName;
        private @Nullable Output<String> eventPattern;
        private @Nullable Output<Boolean> isEnabled;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> scheduleExpression;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EventRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.eventBusName = defaults.eventBusName;
    	      this.eventPattern = defaults.eventPattern;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.roleArn = defaults.roleArn;
    	      this.scheduleExpression = defaults.scheduleExpression;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder eventBusName(@Nullable Output<String> eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }

        public Builder eventBusName(@Nullable String eventBusName) {
            this.eventBusName = Output.ofNullable(eventBusName);
            return this;
        }

        public Builder eventPattern(@Nullable Output<String> eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }

        public Builder eventPattern(@Nullable String eventPattern) {
            this.eventPattern = Output.ofNullable(eventPattern);
            return this;
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Output.ofNullable(isEnabled);
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

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Output.ofNullable(namePrefix);
            return this;
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }

        public Builder scheduleExpression(@Nullable Output<String> scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        public Builder scheduleExpression(@Nullable String scheduleExpression) {
            this.scheduleExpression = Output.ofNullable(scheduleExpression);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public EventRuleArgs build() {
            return new EventRuleArgs(description, eventBusName, eventPattern, isEnabled, name, namePrefix, roleArn, scheduleExpression, tags);
        }
    }
}
