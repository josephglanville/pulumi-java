// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses;

import io.pulumi.awsnative.ses.inputs.ContactListTagArgs;
import io.pulumi.awsnative.ses.inputs.ContactListTopicArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactListArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactListArgs Empty = new ContactListArgs();

    /**
     * The name of the contact list.
     * 
     */
    @InputImport(name="contactListName")
      private final @Nullable Output<String> contactListName;

    public Output<String> getContactListName() {
        return this.contactListName == null ? Output.empty() : this.contactListName;
    }

    /**
     * The description of the contact list.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The tags (keys and values) associated with the contact list.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<ContactListTagArgs>> tags;

    public Output<List<ContactListTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The topics associated with the contact list.
     * 
     */
    @InputImport(name="topics")
      private final @Nullable Output<List<ContactListTopicArgs>> topics;

    public Output<List<ContactListTopicArgs>> getTopics() {
        return this.topics == null ? Output.empty() : this.topics;
    }

    public ContactListArgs(
        @Nullable Output<String> contactListName,
        @Nullable Output<String> description,
        @Nullable Output<List<ContactListTagArgs>> tags,
        @Nullable Output<List<ContactListTopicArgs>> topics) {
        this.contactListName = contactListName;
        this.description = description;
        this.tags = tags;
        this.topics = topics;
    }

    private ContactListArgs() {
        this.contactListName = Output.empty();
        this.description = Output.empty();
        this.tags = Output.empty();
        this.topics = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> contactListName;
        private @Nullable Output<String> description;
        private @Nullable Output<List<ContactListTagArgs>> tags;
        private @Nullable Output<List<ContactListTopicArgs>> topics;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactListName = defaults.contactListName;
    	      this.description = defaults.description;
    	      this.tags = defaults.tags;
    	      this.topics = defaults.topics;
        }

        public Builder contactListName(@Nullable Output<String> contactListName) {
            this.contactListName = contactListName;
            return this;
        }

        public Builder contactListName(@Nullable String contactListName) {
            this.contactListName = Output.ofNullable(contactListName);
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

        public Builder tags(@Nullable Output<List<ContactListTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<ContactListTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder topics(@Nullable Output<List<ContactListTopicArgs>> topics) {
            this.topics = topics;
            return this;
        }

        public Builder topics(@Nullable List<ContactListTopicArgs> topics) {
            this.topics = Output.ofNullable(topics);
            return this;
        }
        public ContactListArgs build() {
            return new ContactListArgs(contactListName, description, tags, topics);
        }
    }
}
