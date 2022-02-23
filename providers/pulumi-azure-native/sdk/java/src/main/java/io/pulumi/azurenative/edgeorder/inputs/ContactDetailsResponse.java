// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contact Details.
 * 
 */
public final class ContactDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContactDetailsResponse Empty = new ContactDetailsResponse();

    /**
     * Contact name of the person.
     * 
     */
    @InputImport(name="contactName", required=true)
      private final String contactName;

    public String getContactName() {
        return this.contactName;
    }

    /**
     * List of Email-ids to be notified about job progress.
     * 
     */
    @InputImport(name="emailList", required=true)
      private final List<String> emailList;

    public List<String> getEmailList() {
        return this.emailList;
    }

    /**
     * Mobile number of the contact person.
     * 
     */
    @InputImport(name="mobile")
      private final @Nullable String mobile;

    public Optional<String> getMobile() {
        return this.mobile == null ? Optional.empty() : Optional.ofNullable(this.mobile);
    }

    /**
     * Phone number of the contact person.
     * 
     */
    @InputImport(name="phone", required=true)
      private final String phone;

    public String getPhone() {
        return this.phone;
    }

    /**
     * Phone extension number of the contact person.
     * 
     */
    @InputImport(name="phoneExtension")
      private final @Nullable String phoneExtension;

    public Optional<String> getPhoneExtension() {
        return this.phoneExtension == null ? Optional.empty() : Optional.ofNullable(this.phoneExtension);
    }

    public ContactDetailsResponse(
        String contactName,
        List<String> emailList,
        @Nullable String mobile,
        String phone,
        @Nullable String phoneExtension) {
        this.contactName = Objects.requireNonNull(contactName, "expected parameter 'contactName' to be non-null");
        this.emailList = Objects.requireNonNull(emailList, "expected parameter 'emailList' to be non-null");
        this.mobile = mobile;
        this.phone = Objects.requireNonNull(phone, "expected parameter 'phone' to be non-null");
        this.phoneExtension = phoneExtension;
    }

    private ContactDetailsResponse() {
        this.contactName = null;
        this.emailList = List.of();
        this.mobile = null;
        this.phone = null;
        this.phoneExtension = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactName;
        private List<String> emailList;
        private @Nullable String mobile;
        private String phone;
        private @Nullable String phoneExtension;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactName = defaults.contactName;
    	      this.emailList = defaults.emailList;
    	      this.mobile = defaults.mobile;
    	      this.phone = defaults.phone;
    	      this.phoneExtension = defaults.phoneExtension;
        }

        public Builder setContactName(String contactName) {
            this.contactName = Objects.requireNonNull(contactName);
            return this;
        }

        public Builder setEmailList(List<String> emailList) {
            this.emailList = Objects.requireNonNull(emailList);
            return this;
        }

        public Builder setMobile(@Nullable String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }

        public Builder setPhoneExtension(@Nullable String phoneExtension) {
            this.phoneExtension = phoneExtension;
            return this;
        }
        public ContactDetailsResponse build() {
            return new ContactDetailsResponse(contactName, emailList, mobile, phone, phoneExtension);
        }
    }
}
