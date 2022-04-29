// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserCapabilitiesManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserCapabilitiesManagementArgs Empty = new UserCapabilitiesManagementArgs();

    /**
     * (Updatable) Indicates if the user can use API keys.
     * 
     */
    @Import(name="canUseApiKeys")
    private @Nullable Output<Boolean> canUseApiKeys;

    /**
     * @return (Updatable) Indicates if the user can use API keys.
     * 
     */
    public Optional<Output<Boolean>> canUseApiKeys() {
        return Optional.ofNullable(this.canUseApiKeys);
    }

    /**
     * (Updatable) Indicates if the user can use SWIFT passwords / auth tokens.
     * 
     */
    @Import(name="canUseAuthTokens")
    private @Nullable Output<Boolean> canUseAuthTokens;

    /**
     * @return (Updatable) Indicates if the user can use SWIFT passwords / auth tokens.
     * 
     */
    public Optional<Output<Boolean>> canUseAuthTokens() {
        return Optional.ofNullable(this.canUseAuthTokens);
    }

    /**
     * (Updatable) Indicates if the user can log in to the console.
     * 
     */
    @Import(name="canUseConsolePassword")
    private @Nullable Output<Boolean> canUseConsolePassword;

    /**
     * @return (Updatable) Indicates if the user can log in to the console.
     * 
     */
    public Optional<Output<Boolean>> canUseConsolePassword() {
        return Optional.ofNullable(this.canUseConsolePassword);
    }

    /**
     * (Updatable) Indicates if the user can use SigV4 symmetric keys.
     * 
     */
    @Import(name="canUseCustomerSecretKeys")
    private @Nullable Output<Boolean> canUseCustomerSecretKeys;

    /**
     * @return (Updatable) Indicates if the user can use SigV4 symmetric keys.
     * 
     */
    public Optional<Output<Boolean>> canUseCustomerSecretKeys() {
        return Optional.ofNullable(this.canUseCustomerSecretKeys);
    }

    /**
     * (Updatable) Indicates if the user can use SMTP passwords.
     * 
     */
    @Import(name="canUseSmtpCredentials")
    private @Nullable Output<Boolean> canUseSmtpCredentials;

    /**
     * @return (Updatable) Indicates if the user can use SMTP passwords.
     * 
     */
    public Optional<Output<Boolean>> canUseSmtpCredentials() {
        return Optional.ofNullable(this.canUseSmtpCredentials);
    }

    /**
     * The OCID of the user.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The OCID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private UserCapabilitiesManagementArgs() {}

    private UserCapabilitiesManagementArgs(UserCapabilitiesManagementArgs $) {
        this.canUseApiKeys = $.canUseApiKeys;
        this.canUseAuthTokens = $.canUseAuthTokens;
        this.canUseConsolePassword = $.canUseConsolePassword;
        this.canUseCustomerSecretKeys = $.canUseCustomerSecretKeys;
        this.canUseSmtpCredentials = $.canUseSmtpCredentials;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserCapabilitiesManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserCapabilitiesManagementArgs $;

        public Builder() {
            $ = new UserCapabilitiesManagementArgs();
        }

        public Builder(UserCapabilitiesManagementArgs defaults) {
            $ = new UserCapabilitiesManagementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param canUseApiKeys (Updatable) Indicates if the user can use API keys.
         * 
         * @return builder
         * 
         */
        public Builder canUseApiKeys(@Nullable Output<Boolean> canUseApiKeys) {
            $.canUseApiKeys = canUseApiKeys;
            return this;
        }

        /**
         * @param canUseApiKeys (Updatable) Indicates if the user can use API keys.
         * 
         * @return builder
         * 
         */
        public Builder canUseApiKeys(Boolean canUseApiKeys) {
            return canUseApiKeys(Output.of(canUseApiKeys));
        }

        /**
         * @param canUseAuthTokens (Updatable) Indicates if the user can use SWIFT passwords / auth tokens.
         * 
         * @return builder
         * 
         */
        public Builder canUseAuthTokens(@Nullable Output<Boolean> canUseAuthTokens) {
            $.canUseAuthTokens = canUseAuthTokens;
            return this;
        }

        /**
         * @param canUseAuthTokens (Updatable) Indicates if the user can use SWIFT passwords / auth tokens.
         * 
         * @return builder
         * 
         */
        public Builder canUseAuthTokens(Boolean canUseAuthTokens) {
            return canUseAuthTokens(Output.of(canUseAuthTokens));
        }

        /**
         * @param canUseConsolePassword (Updatable) Indicates if the user can log in to the console.
         * 
         * @return builder
         * 
         */
        public Builder canUseConsolePassword(@Nullable Output<Boolean> canUseConsolePassword) {
            $.canUseConsolePassword = canUseConsolePassword;
            return this;
        }

        /**
         * @param canUseConsolePassword (Updatable) Indicates if the user can log in to the console.
         * 
         * @return builder
         * 
         */
        public Builder canUseConsolePassword(Boolean canUseConsolePassword) {
            return canUseConsolePassword(Output.of(canUseConsolePassword));
        }

        /**
         * @param canUseCustomerSecretKeys (Updatable) Indicates if the user can use SigV4 symmetric keys.
         * 
         * @return builder
         * 
         */
        public Builder canUseCustomerSecretKeys(@Nullable Output<Boolean> canUseCustomerSecretKeys) {
            $.canUseCustomerSecretKeys = canUseCustomerSecretKeys;
            return this;
        }

        /**
         * @param canUseCustomerSecretKeys (Updatable) Indicates if the user can use SigV4 symmetric keys.
         * 
         * @return builder
         * 
         */
        public Builder canUseCustomerSecretKeys(Boolean canUseCustomerSecretKeys) {
            return canUseCustomerSecretKeys(Output.of(canUseCustomerSecretKeys));
        }

        /**
         * @param canUseSmtpCredentials (Updatable) Indicates if the user can use SMTP passwords.
         * 
         * @return builder
         * 
         */
        public Builder canUseSmtpCredentials(@Nullable Output<Boolean> canUseSmtpCredentials) {
            $.canUseSmtpCredentials = canUseSmtpCredentials;
            return this;
        }

        /**
         * @param canUseSmtpCredentials (Updatable) Indicates if the user can use SMTP passwords.
         * 
         * @return builder
         * 
         */
        public Builder canUseSmtpCredentials(Boolean canUseSmtpCredentials) {
            return canUseSmtpCredentials(Output.of(canUseSmtpCredentials));
        }

        /**
         * @param userId The OCID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The OCID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserCapabilitiesManagementArgs build() {
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
