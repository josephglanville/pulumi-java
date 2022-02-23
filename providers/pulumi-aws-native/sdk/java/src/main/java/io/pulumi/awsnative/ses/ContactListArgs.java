// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses;

import io.pulumi.awsnative.ses.inputs.ContactListTagArgs;
import io.pulumi.awsnative.ses.inputs.ContactListTopicArgs;
import io.pulumi.core.Input;
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
      private final @Nullable Input<String> contactListName;

    public Input<String> getContactListName() {
        return this.contactListName == null ? Input.empty() : this.contactListName;
    }

    /**
     * The description of the contact list.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The tags (keys and values) associated with the contact list.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<ContactListTagArgs>> tags;

    public Input<List<ContactListTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The topics associated with the contact list.
     * 
     */
    @InputImport(name="topics")
      private final @Nullable Input<List<ContactListTopicArgs>> topics;

    public Input<List<ContactListTopicArgs>> getTopics() {
        return this.topics == null ? Input.empty() : this.topics;
    }

    public ContactListArgs(
        @Nullable Input<String> contactListName,
        @Nullable Input<String> description,
        @Nullable Input<List<ContactListTagArgs>> tags,
        @Nullable Input<List<ContactListTopicArgs>> topics) {
        this.contactListName = contactListName;
        this.description = description;
        this.tags = tags;
        this.topics = topics;
    }

    private ContactListArgs() {
        this.contactListName = Input.empty();
        this.description = Input.empty();
        this.tags = Input.empty();
        this.topics = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contactListName;
        private @Nullable Input<String> description;
        private @Nullable Input<List<ContactListTagArgs>> tags;
        private @Nullable Input<List<ContactListTopicArgs>> topics;

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

        public Builder setContactListName(@Nullable Input<String> contactListName) {
            this.contactListName = contactListName;
            return this;
        }

        public Builder setContactListName(@Nullable String contactListName) {
            this.contactListName = Input.ofNullable(contactListName);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ContactListTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ContactListTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTopics(@Nullable Input<List<ContactListTopicArgs>> topics) {
            this.topics = topics;
            return this;
        }

        public Builder setTopics(@Nullable List<ContactListTopicArgs> topics) {
            this.topics = Input.ofNullable(topics);
            return this;
        }
        public ContactListArgs build() {
            return new ContactListArgs(contactListName, description, tags, topics);
        }
    }
}
