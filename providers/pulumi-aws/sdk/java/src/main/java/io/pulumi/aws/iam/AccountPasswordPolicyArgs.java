// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountPasswordPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountPasswordPolicyArgs Empty = new AccountPasswordPolicyArgs();

    /**
     * Whether to allow users to change their own password
     * 
     */
    @InputImport(name="allowUsersToChangePassword")
      private final @Nullable Output<Boolean> allowUsersToChangePassword;

    public Output<Boolean> getAllowUsersToChangePassword() {
        return this.allowUsersToChangePassword == null ? Output.empty() : this.allowUsersToChangePassword;
    }

    /**
     * Whether users are prevented from setting a new password after their password has expired (i.e., require administrator reset)
     * 
     */
    @InputImport(name="hardExpiry")
      private final @Nullable Output<Boolean> hardExpiry;

    public Output<Boolean> getHardExpiry() {
        return this.hardExpiry == null ? Output.empty() : this.hardExpiry;
    }

    /**
     * The number of days that an user password is valid.
     * 
     */
    @InputImport(name="maxPasswordAge")
      private final @Nullable Output<Integer> maxPasswordAge;

    public Output<Integer> getMaxPasswordAge() {
        return this.maxPasswordAge == null ? Output.empty() : this.maxPasswordAge;
    }

    /**
     * Minimum length to require for user passwords.
     * 
     */
    @InputImport(name="minimumPasswordLength")
      private final @Nullable Output<Integer> minimumPasswordLength;

    public Output<Integer> getMinimumPasswordLength() {
        return this.minimumPasswordLength == null ? Output.empty() : this.minimumPasswordLength;
    }

    /**
     * The number of previous passwords that users are prevented from reusing.
     * 
     */
    @InputImport(name="passwordReusePrevention")
      private final @Nullable Output<Integer> passwordReusePrevention;

    public Output<Integer> getPasswordReusePrevention() {
        return this.passwordReusePrevention == null ? Output.empty() : this.passwordReusePrevention;
    }

    /**
     * Whether to require lowercase characters for user passwords.
     * 
     */
    @InputImport(name="requireLowercaseCharacters")
      private final @Nullable Output<Boolean> requireLowercaseCharacters;

    public Output<Boolean> getRequireLowercaseCharacters() {
        return this.requireLowercaseCharacters == null ? Output.empty() : this.requireLowercaseCharacters;
    }

    /**
     * Whether to require numbers for user passwords.
     * 
     */
    @InputImport(name="requireNumbers")
      private final @Nullable Output<Boolean> requireNumbers;

    public Output<Boolean> getRequireNumbers() {
        return this.requireNumbers == null ? Output.empty() : this.requireNumbers;
    }

    /**
     * Whether to require symbols for user passwords.
     * 
     */
    @InputImport(name="requireSymbols")
      private final @Nullable Output<Boolean> requireSymbols;

    public Output<Boolean> getRequireSymbols() {
        return this.requireSymbols == null ? Output.empty() : this.requireSymbols;
    }

    /**
     * Whether to require uppercase characters for user passwords.
     * 
     */
    @InputImport(name="requireUppercaseCharacters")
      private final @Nullable Output<Boolean> requireUppercaseCharacters;

    public Output<Boolean> getRequireUppercaseCharacters() {
        return this.requireUppercaseCharacters == null ? Output.empty() : this.requireUppercaseCharacters;
    }

    public AccountPasswordPolicyArgs(
        @Nullable Output<Boolean> allowUsersToChangePassword,
        @Nullable Output<Boolean> hardExpiry,
        @Nullable Output<Integer> maxPasswordAge,
        @Nullable Output<Integer> minimumPasswordLength,
        @Nullable Output<Integer> passwordReusePrevention,
        @Nullable Output<Boolean> requireLowercaseCharacters,
        @Nullable Output<Boolean> requireNumbers,
        @Nullable Output<Boolean> requireSymbols,
        @Nullable Output<Boolean> requireUppercaseCharacters) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
        this.hardExpiry = hardExpiry;
        this.maxPasswordAge = maxPasswordAge;
        this.minimumPasswordLength = minimumPasswordLength;
        this.passwordReusePrevention = passwordReusePrevention;
        this.requireLowercaseCharacters = requireLowercaseCharacters;
        this.requireNumbers = requireNumbers;
        this.requireSymbols = requireSymbols;
        this.requireUppercaseCharacters = requireUppercaseCharacters;
    }

    private AccountPasswordPolicyArgs() {
        this.allowUsersToChangePassword = Output.empty();
        this.hardExpiry = Output.empty();
        this.maxPasswordAge = Output.empty();
        this.minimumPasswordLength = Output.empty();
        this.passwordReusePrevention = Output.empty();
        this.requireLowercaseCharacters = Output.empty();
        this.requireNumbers = Output.empty();
        this.requireSymbols = Output.empty();
        this.requireUppercaseCharacters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountPasswordPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowUsersToChangePassword;
        private @Nullable Output<Boolean> hardExpiry;
        private @Nullable Output<Integer> maxPasswordAge;
        private @Nullable Output<Integer> minimumPasswordLength;
        private @Nullable Output<Integer> passwordReusePrevention;
        private @Nullable Output<Boolean> requireLowercaseCharacters;
        private @Nullable Output<Boolean> requireNumbers;
        private @Nullable Output<Boolean> requireSymbols;
        private @Nullable Output<Boolean> requireUppercaseCharacters;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountPasswordPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowUsersToChangePassword = defaults.allowUsersToChangePassword;
    	      this.hardExpiry = defaults.hardExpiry;
    	      this.maxPasswordAge = defaults.maxPasswordAge;
    	      this.minimumPasswordLength = defaults.minimumPasswordLength;
    	      this.passwordReusePrevention = defaults.passwordReusePrevention;
    	      this.requireLowercaseCharacters = defaults.requireLowercaseCharacters;
    	      this.requireNumbers = defaults.requireNumbers;
    	      this.requireSymbols = defaults.requireSymbols;
    	      this.requireUppercaseCharacters = defaults.requireUppercaseCharacters;
        }

        public Builder allowUsersToChangePassword(@Nullable Output<Boolean> allowUsersToChangePassword) {
            this.allowUsersToChangePassword = allowUsersToChangePassword;
            return this;
        }

        public Builder allowUsersToChangePassword(@Nullable Boolean allowUsersToChangePassword) {
            this.allowUsersToChangePassword = Output.ofNullable(allowUsersToChangePassword);
            return this;
        }

        public Builder hardExpiry(@Nullable Output<Boolean> hardExpiry) {
            this.hardExpiry = hardExpiry;
            return this;
        }

        public Builder hardExpiry(@Nullable Boolean hardExpiry) {
            this.hardExpiry = Output.ofNullable(hardExpiry);
            return this;
        }

        public Builder maxPasswordAge(@Nullable Output<Integer> maxPasswordAge) {
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }

        public Builder maxPasswordAge(@Nullable Integer maxPasswordAge) {
            this.maxPasswordAge = Output.ofNullable(maxPasswordAge);
            return this;
        }

        public Builder minimumPasswordLength(@Nullable Output<Integer> minimumPasswordLength) {
            this.minimumPasswordLength = minimumPasswordLength;
            return this;
        }

        public Builder minimumPasswordLength(@Nullable Integer minimumPasswordLength) {
            this.minimumPasswordLength = Output.ofNullable(minimumPasswordLength);
            return this;
        }

        public Builder passwordReusePrevention(@Nullable Output<Integer> passwordReusePrevention) {
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }

        public Builder passwordReusePrevention(@Nullable Integer passwordReusePrevention) {
            this.passwordReusePrevention = Output.ofNullable(passwordReusePrevention);
            return this;
        }

        public Builder requireLowercaseCharacters(@Nullable Output<Boolean> requireLowercaseCharacters) {
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            return this;
        }

        public Builder requireLowercaseCharacters(@Nullable Boolean requireLowercaseCharacters) {
            this.requireLowercaseCharacters = Output.ofNullable(requireLowercaseCharacters);
            return this;
        }

        public Builder requireNumbers(@Nullable Output<Boolean> requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }

        public Builder requireNumbers(@Nullable Boolean requireNumbers) {
            this.requireNumbers = Output.ofNullable(requireNumbers);
            return this;
        }

        public Builder requireSymbols(@Nullable Output<Boolean> requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }

        public Builder requireSymbols(@Nullable Boolean requireSymbols) {
            this.requireSymbols = Output.ofNullable(requireSymbols);
            return this;
        }

        public Builder requireUppercaseCharacters(@Nullable Output<Boolean> requireUppercaseCharacters) {
            this.requireUppercaseCharacters = requireUppercaseCharacters;
            return this;
        }

        public Builder requireUppercaseCharacters(@Nullable Boolean requireUppercaseCharacters) {
            this.requireUppercaseCharacters = Output.ofNullable(requireUppercaseCharacters);
            return this;
        }
        public AccountPasswordPolicyArgs build() {
            return new AccountPasswordPolicyArgs(allowUsersToChangePassword, hardExpiry, maxPasswordAge, minimumPasswordLength, passwordReusePrevention, requireLowercaseCharacters, requireNumbers, requireSymbols, requireUppercaseCharacters);
        }
    }
}
