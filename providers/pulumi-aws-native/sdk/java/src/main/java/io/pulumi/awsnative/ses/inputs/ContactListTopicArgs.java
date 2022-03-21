// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactListTopicArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactListTopicArgs Empty = new ContactListTopicArgs();

    @Import(name="defaultSubscriptionStatus", required=true)
      private final Output<String> defaultSubscriptionStatus;

    public Output<String> getDefaultSubscriptionStatus() {
        return this.defaultSubscriptionStatus;
    }

    /**
     * The description of the topic.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The display name of the topic.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The name of the topic.
     * 
     */
    @Import(name="topicName", required=true)
      private final Output<String> topicName;

    public Output<String> getTopicName() {
        return this.topicName;
    }

    public ContactListTopicArgs(
        Output<String> defaultSubscriptionStatus,
        @Nullable Output<String> description,
        Output<String> displayName,
        Output<String> topicName) {
        this.defaultSubscriptionStatus = Objects.requireNonNull(defaultSubscriptionStatus, "expected parameter 'defaultSubscriptionStatus' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private ContactListTopicArgs() {
        this.defaultSubscriptionStatus = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.topicName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactListTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> defaultSubscriptionStatus;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private Output<String> topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactListTopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultSubscriptionStatus = defaults.defaultSubscriptionStatus;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.topicName = defaults.topicName;
        }

        public Builder defaultSubscriptionStatus(Output<String> defaultSubscriptionStatus) {
            this.defaultSubscriptionStatus = Objects.requireNonNull(defaultSubscriptionStatus);
            return this;
        }
        public Builder defaultSubscriptionStatus(String defaultSubscriptionStatus) {
            this.defaultSubscriptionStatus = Output.of(Objects.requireNonNull(defaultSubscriptionStatus));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder topicName(Output<String> topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }
        public Builder topicName(String topicName) {
            this.topicName = Output.of(Objects.requireNonNull(topicName));
            return this;
        }        public ContactListTopicArgs build() {
            return new ContactListTopicArgs(defaultSubscriptionStatus, description, displayName, topicName);
        }
    }
}
