// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * User info
 * 
 */
public final class UserInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserInfoArgs Empty = new UserInfoArgs();

    /**
     * Email of the user used by Datadog for contacting them if needed
     * 
     */
    @InputImport(name="emailAddress")
      private final @Nullable Input<String> emailAddress;

    public Input<String> getEmailAddress() {
        return this.emailAddress == null ? Input.empty() : this.emailAddress;
    }

    /**
     * Name of the user
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Phone number of the user used by Datadog for contacting them if needed
     * 
     */
    @InputImport(name="phoneNumber")
      private final @Nullable Input<String> phoneNumber;

    public Input<String> getPhoneNumber() {
        return this.phoneNumber == null ? Input.empty() : this.phoneNumber;
    }

    public UserInfoArgs(
        @Nullable Input<String> emailAddress,
        @Nullable Input<String> name,
        @Nullable Input<String> phoneNumber) {
        this.emailAddress = emailAddress;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    private UserInfoArgs() {
        this.emailAddress = Input.empty();
        this.name = Input.empty();
        this.phoneNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> emailAddress;
        private @Nullable Input<String> name;
        private @Nullable Input<String> phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder setEmailAddress(@Nullable Input<String> emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setEmailAddress(@Nullable String emailAddress) {
            this.emailAddress = Input.ofNullable(emailAddress);
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

        public Builder setPhoneNumber(@Nullable Input<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setPhoneNumber(@Nullable String phoneNumber) {
            this.phoneNumber = Input.ofNullable(phoneNumber);
            return this;
        }
        public UserInfoArgs build() {
            return new UserInfoArgs(emailAddress, name, phoneNumber);
        }
    }
}
