// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.domains_v1beta1.inputs.ContactResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the contact information associated with a `Registration`. [ICANN](https://icann.org/) requires all domain names to have associated contact information. The `registrant_contact` is considered the domain's legal owner, and often the other contacts are identical.
 * 
 */
public final class ContactSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContactSettingsResponse Empty = new ContactSettingsResponse();

    /**
     * The administrative contact for the `Registration`.
     * 
     */
    @Import(name="adminContact", required=true)
      private final ContactResponse adminContact;

    public ContactResponse getAdminContact() {
        return this.adminContact;
    }

    /**
     * Privacy setting for the contacts associated with the `Registration`.
     * 
     */
    @Import(name="privacy", required=true)
      private final String privacy;

    public String getPrivacy() {
        return this.privacy;
    }

    /**
     * The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.* *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
     * 
     */
    @Import(name="registrantContact", required=true)
      private final ContactResponse registrantContact;

    public ContactResponse getRegistrantContact() {
        return this.registrantContact;
    }

    /**
     * The technical contact for the `Registration`.
     * 
     */
    @Import(name="technicalContact", required=true)
      private final ContactResponse technicalContact;

    public ContactResponse getTechnicalContact() {
        return this.technicalContact;
    }

    public ContactSettingsResponse(
        ContactResponse adminContact,
        String privacy,
        ContactResponse registrantContact,
        ContactResponse technicalContact) {
        this.adminContact = Objects.requireNonNull(adminContact, "expected parameter 'adminContact' to be non-null");
        this.privacy = Objects.requireNonNull(privacy, "expected parameter 'privacy' to be non-null");
        this.registrantContact = Objects.requireNonNull(registrantContact, "expected parameter 'registrantContact' to be non-null");
        this.technicalContact = Objects.requireNonNull(technicalContact, "expected parameter 'technicalContact' to be non-null");
    }

    private ContactSettingsResponse() {
        this.adminContact = null;
        this.privacy = null;
        this.registrantContact = null;
        this.technicalContact = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactResponse adminContact;
        private String privacy;
        private ContactResponse registrantContact;
        private ContactResponse technicalContact;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminContact = defaults.adminContact;
    	      this.privacy = defaults.privacy;
    	      this.registrantContact = defaults.registrantContact;
    	      this.technicalContact = defaults.technicalContact;
        }

        public Builder adminContact(ContactResponse adminContact) {
            this.adminContact = Objects.requireNonNull(adminContact);
            return this;
        }
        public Builder privacy(String privacy) {
            this.privacy = Objects.requireNonNull(privacy);
            return this;
        }
        public Builder registrantContact(ContactResponse registrantContact) {
            this.registrantContact = Objects.requireNonNull(registrantContact);
            return this;
        }
        public Builder technicalContact(ContactResponse technicalContact) {
            this.technicalContact = Objects.requireNonNull(technicalContact);
            return this;
        }        public ContactSettingsResponse build() {
            return new ContactSettingsResponse(adminContact, privacy, registrantContact, technicalContact);
        }
    }
}
