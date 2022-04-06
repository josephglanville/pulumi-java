// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleSourceSourceDetail {
    /**
     * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources. This defaults to `aws.config` and is the only valid value.
     * 
     */
    private final @Nullable String eventSource;
    /**
     * The frequency that you want AWS Config to run evaluations for a rule that is triggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
     * 
     */
    private final @Nullable String maximumExecutionFrequency;
    /**
     * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:
     * 
     */
    private final @Nullable String messageType;

    @CustomType.Constructor
    private RuleSourceSourceDetail(
        @CustomType.Parameter("eventSource") @Nullable String eventSource,
        @CustomType.Parameter("maximumExecutionFrequency") @Nullable String maximumExecutionFrequency,
        @CustomType.Parameter("messageType") @Nullable String messageType) {
        this.eventSource = eventSource;
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        this.messageType = messageType;
    }

    /**
     * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources. This defaults to `aws.config` and is the only valid value.
     * 
    */
    public Optional<String> getEventSource() {
        return Optional.ofNullable(this.eventSource);
    }
    /**
     * The frequency that you want AWS Config to run evaluations for a rule that is triggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
     * 
    */
    public Optional<String> getMaximumExecutionFrequency() {
        return Optional.ofNullable(this.maximumExecutionFrequency);
    }
    /**
     * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:
     * 
    */
    public Optional<String> getMessageType() {
        return Optional.ofNullable(this.messageType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSourceSourceDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventSource;
        private @Nullable String maximumExecutionFrequency;
        private @Nullable String messageType;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleSourceSourceDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSource = defaults.eventSource;
    	      this.maximumExecutionFrequency = defaults.maximumExecutionFrequency;
    	      this.messageType = defaults.messageType;
        }

        public Builder eventSource(@Nullable String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public Builder maximumExecutionFrequency(@Nullable String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public Builder messageType(@Nullable String messageType) {
            this.messageType = messageType;
            return this;
        }        public RuleSourceSourceDetail build() {
            return new RuleSourceSourceDetail(eventSource, maximumExecutionFrequency, messageType);
        }
    }
}