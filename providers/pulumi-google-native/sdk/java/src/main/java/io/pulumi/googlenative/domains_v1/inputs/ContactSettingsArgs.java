// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.domains_v1.enums.ContactSettingsPrivacy;
import io.pulumi.googlenative.domains_v1.inputs.ContactArgs;
import java.util.Objects;


/**
 * Defines the contact information associated with a `Registration`. [ICANN](https://icann.org/) requires all domain names to have associated contact information. The `registrant_contact` is considered the domain's legal owner, and often the other contacts are identical.
 * 
 */
public final class ContactSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactSettingsArgs Empty = new ContactSettingsArgs();

    /**
     * The administrative contact for the `Registration`.
     * 
     */
    @Import(name="adminContact", required=true)
      private final Output<ContactArgs> adminContact;

    public Output<ContactArgs> getAdminContact() {
        return this.adminContact;
    }

    /**
     * Privacy setting for the contacts associated with the `Registration`.
     * 
     */
    @Import(name="privacy", required=true)
      private final Output<ContactSettingsPrivacy> privacy;

    public Output<ContactSettingsPrivacy> getPrivacy() {
        return this.privacy;
    }

    /**
     * The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.* *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
     * 
     */
    @Import(name="registrantContact", required=true)
      private final Output<ContactArgs> registrantContact;

    public Output<ContactArgs> getRegistrantContact() {
        return this.registrantContact;
    }

    /**
     * The technical contact for the `Registration`.
     * 
     */
    @Import(name="technicalContact", required=true)
      private final Output<ContactArgs> technicalContact;

    public Output<ContactArgs> getTechnicalContact() {
        return this.technicalContact;
    }

    public ContactSettingsArgs(
        Output<ContactArgs> adminContact,
        Output<ContactSettingsPrivacy> privacy,
        Output<ContactArgs> registrantContact,
        Output<ContactArgs> technicalContact) {
        this.adminContact = Objects.requireNonNull(adminContact, "expected parameter 'adminContact' to be non-null");
        this.privacy = Objects.requireNonNull(privacy, "expected parameter 'privacy' to be non-null");
        this.registrantContact = Objects.requireNonNull(registrantContact, "expected parameter 'registrantContact' to be non-null");
        this.technicalContact = Objects.requireNonNull(technicalContact, "expected parameter 'technicalContact' to be non-null");
    }

    private ContactSettingsArgs() {
        this.adminContact = Output.empty();
        this.privacy = Output.empty();
        this.registrantContact = Output.empty();
        this.technicalContact = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ContactArgs> adminContact;
        private Output<ContactSettingsPrivacy> privacy;
        private Output<ContactArgs> registrantContact;
        private Output<ContactArgs> technicalContact;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminContact = defaults.adminContact;
    	      this.privacy = defaults.privacy;
    	      this.registrantContact = defaults.registrantContact;
    	      this.technicalContact = defaults.technicalContact;
        }

        public Builder adminContact(Output<ContactArgs> adminContact) {
            this.adminContact = Objects.requireNonNull(adminContact);
            return this;
        }
        public Builder adminContact(ContactArgs adminContact) {
            this.adminContact = Output.of(Objects.requireNonNull(adminContact));
            return this;
        }
        public Builder privacy(Output<ContactSettingsPrivacy> privacy) {
            this.privacy = Objects.requireNonNull(privacy);
            return this;
        }
        public Builder privacy(ContactSettingsPrivacy privacy) {
            this.privacy = Output.of(Objects.requireNonNull(privacy));
            return this;
        }
        public Builder registrantContact(Output<ContactArgs> registrantContact) {
            this.registrantContact = Objects.requireNonNull(registrantContact);
            return this;
        }
        public Builder registrantContact(ContactArgs registrantContact) {
            this.registrantContact = Output.of(Objects.requireNonNull(registrantContact));
            return this;
        }
        public Builder technicalContact(Output<ContactArgs> technicalContact) {
            this.technicalContact = Objects.requireNonNull(technicalContact);
            return this;
        }
        public Builder technicalContact(ContactArgs technicalContact) {
            this.technicalContact = Output.of(Objects.requireNonNull(technicalContact));
            return this;
        }        public ContactSettingsArgs build() {
            return new ContactSettingsArgs(adminContact, privacy, registrantContact, technicalContact);
        }
    }
}
