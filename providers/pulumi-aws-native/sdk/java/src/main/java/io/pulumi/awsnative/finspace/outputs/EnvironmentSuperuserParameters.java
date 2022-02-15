// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.finspace.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentSuperuserParameters {
    private final @Nullable String emailAddress;
    private final @Nullable String firstName;
    private final @Nullable String lastName;

    @OutputCustomType.Constructor({"emailAddress","firstName","lastName"})
    private EnvironmentSuperuserParameters(
        @Nullable String emailAddress,
        @Nullable String firstName,
        @Nullable String lastName) {
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Optional<String> getEmailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }
    public Optional<String> getFirstName() {
        return Optional.ofNullable(this.firstName);
    }
    public Optional<String> getLastName() {
        return Optional.ofNullable(this.lastName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentSuperuserParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailAddress;
        private @Nullable String firstName;
        private @Nullable String lastName;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentSuperuserParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
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

        public EnvironmentSuperuserParameters build() {
            return new EnvironmentSuperuserParameters(emailAddress, firstName, lastName);
        }
    }
}