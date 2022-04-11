// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.account.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlternativeContactState extends io.pulumi.resources.ResourceArgs {

    public static final AlternativeContactState Empty = new AlternativeContactState();

    /**
     * The ID of the target account when managing member accounts. Will manage current user's account by default if omitted.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The type of the alternate contact. Allowed values are: `BILLING`, `OPERATIONS`, `SECURITY`.
     * 
     */
    @Import(name="alternateContactType")
      private final @Nullable Output<String> alternateContactType;

    public Output<String> getAlternateContactType() {
        return this.alternateContactType == null ? Codegen.empty() : this.alternateContactType;
    }

    /**
     * An email address for the alternate contact.
     * 
     */
    @Import(name="emailAddress")
      private final @Nullable Output<String> emailAddress;

    public Output<String> getEmailAddress() {
        return this.emailAddress == null ? Codegen.empty() : this.emailAddress;
    }

    /**
     * The name of the alternate contact.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A phone number for the alternate contact.
     * 
     */
    @Import(name="phoneNumber")
      private final @Nullable Output<String> phoneNumber;

    public Output<String> getPhoneNumber() {
        return this.phoneNumber == null ? Codegen.empty() : this.phoneNumber;
    }

    /**
     * A title for the alternate contact.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Codegen.empty() : this.title;
    }

    public AlternativeContactState(
        @Nullable Output<String> accountId,
        @Nullable Output<String> alternateContactType,
        @Nullable Output<String> emailAddress,
        @Nullable Output<String> name,
        @Nullable Output<String> phoneNumber,
        @Nullable Output<String> title) {
        this.accountId = accountId;
        this.alternateContactType = alternateContactType;
        this.emailAddress = emailAddress;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.title = title;
    }

    private AlternativeContactState() {
        this.accountId = Codegen.empty();
        this.alternateContactType = Codegen.empty();
        this.emailAddress = Codegen.empty();
        this.name = Codegen.empty();
        this.phoneNumber = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlternativeContactState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> alternateContactType;
        private @Nullable Output<String> emailAddress;
        private @Nullable Output<String> name;
        private @Nullable Output<String> phoneNumber;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(AlternativeContactState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.alternateContactType = defaults.alternateContactType;
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.title = defaults.title;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder alternateContactType(@Nullable Output<String> alternateContactType) {
            this.alternateContactType = alternateContactType;
            return this;
        }
        public Builder alternateContactType(@Nullable String alternateContactType) {
            this.alternateContactType = Codegen.ofNullable(alternateContactType);
            return this;
        }
        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder emailAddress(@Nullable String emailAddress) {
            this.emailAddress = Codegen.ofNullable(emailAddress);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder phoneNumber(@Nullable Output<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder phoneNumber(@Nullable String phoneNumber) {
            this.phoneNumber = Codegen.ofNullable(phoneNumber);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Codegen.ofNullable(title);
            return this;
        }        public AlternativeContactState build() {
            return new AlternativeContactState(accountId, alternateContactType, emailAddress, name, phoneNumber, title);
        }
    }
}
