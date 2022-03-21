// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about the identity of a user.
 * 
 */
public final class UserIdentityInfo extends io.pulumi.resources.InvokeArgs {

    public static final UserIdentityInfo Empty = new UserIdentityInfo();

    @Import(name="email")
      private final @Nullable String email;

    public Optional<String> getEmail() {
        return this.email == null ? Optional.empty() : Optional.ofNullable(this.email);
    }

    @Import(name="firstName")
      private final @Nullable String firstName;

    public Optional<String> getFirstName() {
        return this.firstName == null ? Optional.empty() : Optional.ofNullable(this.firstName);
    }

    @Import(name="lastName")
      private final @Nullable String lastName;

    public Optional<String> getLastName() {
        return this.lastName == null ? Optional.empty() : Optional.ofNullable(this.lastName);
    }

    public UserIdentityInfo(
        @Nullable String email,
        @Nullable String firstName,
        @Nullable String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private UserIdentityInfo() {
        this.email = null;
        this.firstName = null;
        this.lastName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private @Nullable String firstName;
        private @Nullable String lastName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
        }

        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public Builder firstName(@Nullable String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(@Nullable String lastName) {
            this.lastName = lastName;
            return this;
        }        public UserIdentityInfo build() {
            return new UserIdentityInfo(email, firstName, lastName);
        }
    }
}
