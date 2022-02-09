// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserInfoResponse Empty = new UserInfoResponse();

    @InputImport(name="emailAddress")
    private final @Nullable String emailAddress;

    public Optional<String> getEmailAddress() {
        return this.emailAddress == null ? Optional.empty() : Optional.ofNullable(this.emailAddress);
    }

    @InputImport(name="firstName")
    private final @Nullable String firstName;

    public Optional<String> getFirstName() {
        return this.firstName == null ? Optional.empty() : Optional.ofNullable(this.firstName);
    }

    @InputImport(name="lastName")
    private final @Nullable String lastName;

    public Optional<String> getLastName() {
        return this.lastName == null ? Optional.empty() : Optional.ofNullable(this.lastName);
    }

    @InputImport(name="phoneNumber")
    private final @Nullable String phoneNumber;

    public Optional<String> getPhoneNumber() {
        return this.phoneNumber == null ? Optional.empty() : Optional.ofNullable(this.phoneNumber);
    }

    public UserInfoResponse(
        @Nullable String emailAddress,
        @Nullable String firstName,
        @Nullable String lastName,
        @Nullable String phoneNumber) {
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    private UserInfoResponse() {
        this.emailAddress = null;
        this.firstName = null;
        this.lastName = null;
        this.phoneNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailAddress;
        private @Nullable String firstName;
        private @Nullable String lastName;
        private @Nullable String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder setEmailAddress(@Nullable String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setFirstName(@Nullable String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(@Nullable String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setPhoneNumber(@Nullable String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserInfoResponse build() {
            return new UserInfoResponse(emailAddress, firstName, lastName, phoneNumber);
        }
    }
}
