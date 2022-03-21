// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudChannelV1ContactInfoResponse {
    /**
     * The customer account contact's display name, formatted as a combination of the customer's first and last name.
     * 
     */
    private final String displayName;
    /**
     * The customer account's contact email. Required for entitlements that create admin.google.com accounts, and serves as the customer's username for those accounts. Use this email to invite Team customers.
     * 
     */
    private final String email;
    /**
     * The customer account contact's first name. Optional for Team customers.
     * 
     */
    private final String firstName;
    /**
     * The customer account contact's last name. Optional for Team customers.
     * 
     */
    private final String lastName;
    /**
     * The customer account's contact phone number.
     * 
     */
    private final String phone;
    /**
     * Optional. The customer account contact's job title.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GoogleCloudChannelV1ContactInfoResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("firstName") String firstName,
        @CustomType.Parameter("lastName") String lastName,
        @CustomType.Parameter("phone") String phone,
        @CustomType.Parameter("title") String title) {
        this.displayName = displayName;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.title = title;
    }

    /**
     * The customer account contact's display name, formatted as a combination of the customer's first and last name.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The customer account's contact email. Required for entitlements that create admin.google.com accounts, and serves as the customer's username for those accounts. Use this email to invite Team customers.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * The customer account contact's first name. Optional for Team customers.
     * 
    */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * The customer account contact's last name. Optional for Team customers.
     * 
    */
    public String getLastName() {
        return this.lastName;
    }
    /**
     * The customer account's contact phone number.
     * 
    */
    public String getPhone() {
        return this.phone;
    }
    /**
     * Optional. The customer account contact's job title.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1ContactInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String email;
        private String firstName;
        private String lastName;
        private String phone;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1ContactInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.phone = defaults.phone;
    	      this.title = defaults.title;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GoogleCloudChannelV1ContactInfoResponse build() {
            return new GoogleCloudChannelV1ContactInfoResponse(displayName, email, firstName, lastName, phone, title);
        }
    }
}
