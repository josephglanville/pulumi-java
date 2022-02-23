// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.essentialcontacts.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactState extends io.pulumi.resources.ResourceArgs {

    public static final ContactState Empty = new ContactState();

    /**
     * The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    @InputImport(name="email")
      private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * The preferred language for notifications, as a ISO 639-1 language code. See Supported languages for a list of supported languages.
     * 
     */
    @InputImport(name="languageTag")
      private final @Nullable Input<String> languageTag;

    public Input<String> getLanguageTag() {
        return this.languageTag == null ? Input.empty() : this.languageTag;
    }

    /**
     * The identifier for the contact. Format: {resourceType}/{resource_id}/contacts/{contact_id}
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The categories of notifications that the contact will receive communications for.
     * 
     */
    @InputImport(name="notificationCategorySubscriptions")
      private final @Nullable Input<List<String>> notificationCategorySubscriptions;

    public Input<List<String>> getNotificationCategorySubscriptions() {
        return this.notificationCategorySubscriptions == null ? Input.empty() : this.notificationCategorySubscriptions;
    }

    /**
     * The resource to save this contact for. Format: organizations/{organization_id}, folders/{folder_id} or projects/{project_id}
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    public ContactState(
        @Nullable Input<String> email,
        @Nullable Input<String> languageTag,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> notificationCategorySubscriptions,
        @Nullable Input<String> parent) {
        this.email = email;
        this.languageTag = languageTag;
        this.name = name;
        this.notificationCategorySubscriptions = notificationCategorySubscriptions;
        this.parent = parent;
    }

    private ContactState() {
        this.email = Input.empty();
        this.languageTag = Input.empty();
        this.name = Input.empty();
        this.notificationCategorySubscriptions = Input.empty();
        this.parent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> email;
        private @Nullable Input<String> languageTag;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> notificationCategorySubscriptions;
        private @Nullable Input<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.languageTag = defaults.languageTag;
    	      this.name = defaults.name;
    	      this.notificationCategorySubscriptions = defaults.notificationCategorySubscriptions;
    	      this.parent = defaults.parent;
        }

        public Builder setEmail(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setLanguageTag(@Nullable Input<String> languageTag) {
            this.languageTag = languageTag;
            return this;
        }

        public Builder setLanguageTag(@Nullable String languageTag) {
            this.languageTag = Input.ofNullable(languageTag);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNotificationCategorySubscriptions(@Nullable Input<List<String>> notificationCategorySubscriptions) {
            this.notificationCategorySubscriptions = notificationCategorySubscriptions;
            return this;
        }

        public Builder setNotificationCategorySubscriptions(@Nullable List<String> notificationCategorySubscriptions) {
            this.notificationCategorySubscriptions = Input.ofNullable(notificationCategorySubscriptions);
            return this;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }
        public ContactState build() {
            return new ContactState(email, languageTag, name, notificationCategorySubscriptions, parent);
        }
    }
}
