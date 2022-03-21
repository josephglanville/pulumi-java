// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * Authentication type for the user. You must specify USERPOOL. Valid values: `API`, `SAML`, `USERPOOL`
     * 
     */
    @Import(name="authenticationType", required=true)
      private final Output<String> authenticationType;

    public Output<String> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Specifies whether the user in the user pool is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * First name, or given name, of the user.
     * 
     */
    @Import(name="firstName")
      private final @Nullable Output<String> firstName;

    public Output<String> getFirstName() {
        return this.firstName == null ? Output.empty() : this.firstName;
    }

    /**
     * Last name, or surname, of the user.
     * 
     */
    @Import(name="lastName")
      private final @Nullable Output<String> lastName;

    public Output<String> getLastName() {
        return this.lastName == null ? Output.empty() : this.lastName;
    }

    /**
     * Send an email notification.
     * 
     */
    @Import(name="sendEmailNotification")
      private final @Nullable Output<Boolean> sendEmailNotification;

    public Output<Boolean> getSendEmailNotification() {
        return this.sendEmailNotification == null ? Output.empty() : this.sendEmailNotification;
    }

    /**
     * Email address of the user.
     * 
     */
    @Import(name="userName", required=true)
      private final Output<String> userName;

    public Output<String> getUserName() {
        return this.userName;
    }

    public UserArgs(
        Output<String> authenticationType,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> firstName,
        @Nullable Output<String> lastName,
        @Nullable Output<Boolean> sendEmailNotification,
        Output<String> userName) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.enabled = enabled;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sendEmailNotification = sendEmailNotification;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private UserArgs() {
        this.authenticationType = Output.empty();
        this.enabled = Output.empty();
        this.firstName = Output.empty();
        this.lastName = Output.empty();
        this.sendEmailNotification = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authenticationType;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> firstName;
        private @Nullable Output<String> lastName;
        private @Nullable Output<Boolean> sendEmailNotification;
        private Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.enabled = defaults.enabled;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.sendEmailNotification = defaults.sendEmailNotification;
    	      this.userName = defaults.userName;
        }

        public Builder authenticationType(Output<String> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Output.of(Objects.requireNonNull(authenticationType));
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder firstName(@Nullable Output<String> firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder firstName(@Nullable String firstName) {
            this.firstName = Output.ofNullable(firstName);
            return this;
        }
        public Builder lastName(@Nullable Output<String> lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder lastName(@Nullable String lastName) {
            this.lastName = Output.ofNullable(lastName);
            return this;
        }
        public Builder sendEmailNotification(@Nullable Output<Boolean> sendEmailNotification) {
            this.sendEmailNotification = sendEmailNotification;
            return this;
        }
        public Builder sendEmailNotification(@Nullable Boolean sendEmailNotification) {
            this.sendEmailNotification = Output.ofNullable(sendEmailNotification);
            return this;
        }
        public Builder userName(Output<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }        public UserArgs build() {
            return new UserArgs(authenticationType, enabled, firstName, lastName, sendEmailNotification, userName);
        }
    }
}
