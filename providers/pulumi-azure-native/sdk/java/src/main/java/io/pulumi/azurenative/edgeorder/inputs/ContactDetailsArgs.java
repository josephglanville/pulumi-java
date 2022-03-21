// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contact Details.
 * 
 */
public final class ContactDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactDetailsArgs Empty = new ContactDetailsArgs();

    /**
     * Contact name of the person.
     * 
     */
    @Import(name="contactName", required=true)
      private final Output<String> contactName;

    public Output<String> getContactName() {
        return this.contactName;
    }

    /**
     * List of Email-ids to be notified about job progress.
     * 
     */
    @Import(name="emailList", required=true)
      private final Output<List<String>> emailList;

    public Output<List<String>> getEmailList() {
        return this.emailList;
    }

    /**
     * Mobile number of the contact person.
     * 
     */
    @Import(name="mobile")
      private final @Nullable Output<String> mobile;

    public Output<String> getMobile() {
        return this.mobile == null ? Output.empty() : this.mobile;
    }

    /**
     * Phone number of the contact person.
     * 
     */
    @Import(name="phone", required=true)
      private final Output<String> phone;

    public Output<String> getPhone() {
        return this.phone;
    }

    /**
     * Phone extension number of the contact person.
     * 
     */
    @Import(name="phoneExtension")
      private final @Nullable Output<String> phoneExtension;

    public Output<String> getPhoneExtension() {
        return this.phoneExtension == null ? Output.empty() : this.phoneExtension;
    }

    public ContactDetailsArgs(
        Output<String> contactName,
        Output<List<String>> emailList,
        @Nullable Output<String> mobile,
        Output<String> phone,
        @Nullable Output<String> phoneExtension) {
        this.contactName = Objects.requireNonNull(contactName, "expected parameter 'contactName' to be non-null");
        this.emailList = Objects.requireNonNull(emailList, "expected parameter 'emailList' to be non-null");
        this.mobile = mobile;
        this.phone = Objects.requireNonNull(phone, "expected parameter 'phone' to be non-null");
        this.phoneExtension = phoneExtension;
    }

    private ContactDetailsArgs() {
        this.contactName = Output.empty();
        this.emailList = Output.empty();
        this.mobile = Output.empty();
        this.phone = Output.empty();
        this.phoneExtension = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> contactName;
        private Output<List<String>> emailList;
        private @Nullable Output<String> mobile;
        private Output<String> phone;
        private @Nullable Output<String> phoneExtension;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactName = defaults.contactName;
    	      this.emailList = defaults.emailList;
    	      this.mobile = defaults.mobile;
    	      this.phone = defaults.phone;
    	      this.phoneExtension = defaults.phoneExtension;
        }

        public Builder contactName(Output<String> contactName) {
            this.contactName = Objects.requireNonNull(contactName);
            return this;
        }
        public Builder contactName(String contactName) {
            this.contactName = Output.of(Objects.requireNonNull(contactName));
            return this;
        }
        public Builder emailList(Output<List<String>> emailList) {
            this.emailList = Objects.requireNonNull(emailList);
            return this;
        }
        public Builder emailList(List<String> emailList) {
            this.emailList = Output.of(Objects.requireNonNull(emailList));
            return this;
        }
        public Builder emailList(String... emailList) {
            return emailList(List.of(emailList));
        }
        public Builder mobile(@Nullable Output<String> mobile) {
            this.mobile = mobile;
            return this;
        }
        public Builder mobile(@Nullable String mobile) {
            this.mobile = Output.ofNullable(mobile);
            return this;
        }
        public Builder phone(Output<String> phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }
        public Builder phone(String phone) {
            this.phone = Output.of(Objects.requireNonNull(phone));
            return this;
        }
        public Builder phoneExtension(@Nullable Output<String> phoneExtension) {
            this.phoneExtension = phoneExtension;
            return this;
        }
        public Builder phoneExtension(@Nullable String phoneExtension) {
            this.phoneExtension = Output.ofNullable(phoneExtension);
            return this;
        }        public ContactDetailsArgs build() {
            return new ContactDetailsArgs(contactName, emailList, mobile, phone, phoneExtension);
        }
    }
}
