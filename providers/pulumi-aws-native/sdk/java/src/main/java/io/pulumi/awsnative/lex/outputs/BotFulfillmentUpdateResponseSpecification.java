// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotMessageGroup;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotFulfillmentUpdateResponseSpecification {
    /**
     * Determines whether the user can interrupt an update message while it is playing.
     * 
     */
    private final @Nullable Boolean allowInterrupt;
    /**
     * The frequency that a message is sent to the user. When the period ends, Amazon Lex chooses a message from the message groups and plays it to the user. If the fulfillment Lambda returns before the first period ends, an update message is not played to the user.
     * 
     */
    private final Integer frequencyInSeconds;
    private final List<BotMessageGroup> messageGroups;

    @CustomType.Constructor
    private BotFulfillmentUpdateResponseSpecification(
        @CustomType.Parameter("allowInterrupt") @Nullable Boolean allowInterrupt,
        @CustomType.Parameter("frequencyInSeconds") Integer frequencyInSeconds,
        @CustomType.Parameter("messageGroups") List<BotMessageGroup> messageGroups) {
        this.allowInterrupt = allowInterrupt;
        this.frequencyInSeconds = frequencyInSeconds;
        this.messageGroups = messageGroups;
    }

    /**
     * Determines whether the user can interrupt an update message while it is playing.
     * 
    */
    public Optional<Boolean> getAllowInterrupt() {
        return Optional.ofNullable(this.allowInterrupt);
    }
    /**
     * The frequency that a message is sent to the user. When the period ends, Amazon Lex chooses a message from the message groups and plays it to the user. If the fulfillment Lambda returns before the first period ends, an update message is not played to the user.
     * 
    */
    public Integer getFrequencyInSeconds() {
        return this.frequencyInSeconds;
    }
    public List<BotMessageGroup> getMessageGroups() {
        return this.messageGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotFulfillmentUpdateResponseSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowInterrupt;
        private Integer frequencyInSeconds;
        private List<BotMessageGroup> messageGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(BotFulfillmentUpdateResponseSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInterrupt = defaults.allowInterrupt;
    	      this.frequencyInSeconds = defaults.frequencyInSeconds;
    	      this.messageGroups = defaults.messageGroups;
        }

        public Builder allowInterrupt(@Nullable Boolean allowInterrupt) {
            this.allowInterrupt = allowInterrupt;
            return this;
        }
        public Builder frequencyInSeconds(Integer frequencyInSeconds) {
            this.frequencyInSeconds = Objects.requireNonNull(frequencyInSeconds);
            return this;
        }
        public Builder messageGroups(List<BotMessageGroup> messageGroups) {
            this.messageGroups = Objects.requireNonNull(messageGroups);
            return this;
        }
        public Builder messageGroups(BotMessageGroup... messageGroups) {
            return messageGroups(List.of(messageGroups));
        }        public BotFulfillmentUpdateResponseSpecification build() {
            return new BotFulfillmentUpdateResponseSpecification(allowInterrupt, frequencyInSeconds, messageGroups);
        }
    }
}
