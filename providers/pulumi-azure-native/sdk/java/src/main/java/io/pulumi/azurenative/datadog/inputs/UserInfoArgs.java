// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="emailAddress")
      private final @Nullable Output<String> emailAddress;

    public Output<String> getEmailAddress() {
        return this.emailAddress == null ? Output.empty() : this.emailAddress;
    }

    /**
     * Name of the user
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Phone number of the user used by Datadog for contacting them if needed
     * 
     */
    @Import(name="phoneNumber")
      private final @Nullable Output<String> phoneNumber;

    public Output<String> getPhoneNumber() {
        return this.phoneNumber == null ? Output.empty() : this.phoneNumber;
    }

    public UserInfoArgs(
        @Nullable Output<String> emailAddress,
        @Nullable Output<String> name,
        @Nullable Output<String> phoneNumber) {
        this.emailAddress = emailAddress;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    private UserInfoArgs() {
        this.emailAddress = Output.empty();
        this.name = Output.empty();
        this.phoneNumber = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> emailAddress;
        private @Nullable Output<String> name;
        private @Nullable Output<String> phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder emailAddress(@Nullable String emailAddress) {
            this.emailAddress = Output.ofNullable(emailAddress);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder phoneNumber(@Nullable Output<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder phoneNumber(@Nullable String phoneNumber) {
            this.phoneNumber = Output.ofNullable(phoneNumber);
            return this;
        }        public UserInfoArgs build() {
            return new UserInfoArgs(emailAddress, name, phoneNumber);
        }
    }
}
