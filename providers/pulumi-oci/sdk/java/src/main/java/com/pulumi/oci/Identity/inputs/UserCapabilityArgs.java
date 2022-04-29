// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserCapabilityArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserCapabilityArgs Empty = new UserCapabilityArgs();

    /**
     * Indicates if the user can use API keys.
     * 
     */
    @Import(name="canUseApiKeys")
    private @Nullable Output<Boolean> canUseApiKeys;

    /**
     * @return Indicates if the user can use API keys.
     * 
     */
    public Optional<Output<Boolean>> canUseApiKeys() {
        return Optional.ofNullable(this.canUseApiKeys);
    }

    /**
     * Indicates if the user can use SWIFT passwords / auth tokens.
     * 
     */
    @Import(name="canUseAuthTokens")
    private @Nullable Output<Boolean> canUseAuthTokens;

    /**
     * @return Indicates if the user can use SWIFT passwords / auth tokens.
     * 
     */
    public Optional<Output<Boolean>> canUseAuthTokens() {
        return Optional.ofNullable(this.canUseAuthTokens);
    }

    /**
     * Indicates if the user can log in to the console.
     * 
     */
    @Import(name="canUseConsolePassword")
    private @Nullable Output<Boolean> canUseConsolePassword;

    /**
     * @return Indicates if the user can log in to the console.
     * 
     */
    public Optional<Output<Boolean>> canUseConsolePassword() {
        return Optional.ofNullable(this.canUseConsolePassword);
    }

    /**
     * Indicates if the user can use SigV4 symmetric keys.
     * 
     */
    @Import(name="canUseCustomerSecretKeys")
    private @Nullable Output<Boolean> canUseCustomerSecretKeys;

    /**
     * @return Indicates if the user can use SigV4 symmetric keys.
     * 
     */
    public Optional<Output<Boolean>> canUseCustomerSecretKeys() {
        return Optional.ofNullable(this.canUseCustomerSecretKeys);
    }

    /**
     * Indicates if the user can use DB passwords.
     * 
     */
    @Import(name="canUseDbCredentials")
    private @Nullable Output<Boolean> canUseDbCredentials;

    /**
     * @return Indicates if the user can use DB passwords.
     * 
     */
    public Optional<Output<Boolean>> canUseDbCredentials() {
        return Optional.ofNullable(this.canUseDbCredentials);
    }

    /**
     * Indicates if the user can use OAuth2 credentials and tokens.
     * 
     */
    @Import(name="canUseOauth2clientCredentials")
    private @Nullable Output<Boolean> canUseOauth2clientCredentials;

    /**
     * @return Indicates if the user can use OAuth2 credentials and tokens.
     * 
     */
    public Optional<Output<Boolean>> canUseOauth2clientCredentials() {
        return Optional.ofNullable(this.canUseOauth2clientCredentials);
    }

    /**
     * Indicates if the user can use SMTP passwords.
     * 
     */
    @Import(name="canUseSmtpCredentials")
    private @Nullable Output<Boolean> canUseSmtpCredentials;

    /**
     * @return Indicates if the user can use SMTP passwords.
     * 
     */
    public Optional<Output<Boolean>> canUseSmtpCredentials() {
        return Optional.ofNullable(this.canUseSmtpCredentials);
    }

    private UserCapabilityArgs() {}

    private UserCapabilityArgs(UserCapabilityArgs $) {
        this.canUseApiKeys = $.canUseApiKeys;
        this.canUseAuthTokens = $.canUseAuthTokens;
        this.canUseConsolePassword = $.canUseConsolePassword;
        this.canUseCustomerSecretKeys = $.canUseCustomerSecretKeys;
        this.canUseDbCredentials = $.canUseDbCredentials;
        this.canUseOauth2clientCredentials = $.canUseOauth2clientCredentials;
        this.canUseSmtpCredentials = $.canUseSmtpCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserCapabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserCapabilityArgs $;

        public Builder() {
            $ = new UserCapabilityArgs();
        }

        public Builder(UserCapabilityArgs defaults) {
            $ = new UserCapabilityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param canUseApiKeys Indicates if the user can use API keys.
         * 
         * @return builder
         * 
         */
        public Builder canUseApiKeys(@Nullable Output<Boolean> canUseApiKeys) {
            $.canUseApiKeys = canUseApiKeys;
            return this;
        }

        /**
         * @param canUseApiKeys Indicates if the user can use API keys.
         * 
         * @return builder
         * 
         */
        public Builder canUseApiKeys(Boolean canUseApiKeys) {
            return canUseApiKeys(Output.of(canUseApiKeys));
        }

        /**
         * @param canUseAuthTokens Indicates if the user can use SWIFT passwords / auth tokens.
         * 
         * @return builder
         * 
         */
        public Builder canUseAuthTokens(@Nullable Output<Boolean> canUseAuthTokens) {
            $.canUseAuthTokens = canUseAuthTokens;
            return this;
        }

        /**
         * @param canUseAuthTokens Indicates if the user can use SWIFT passwords / auth tokens.
         * 
         * @return builder
         * 
         */
        public Builder canUseAuthTokens(Boolean canUseAuthTokens) {
            return canUseAuthTokens(Output.of(canUseAuthTokens));
        }

        /**
         * @param canUseConsolePassword Indicates if the user can log in to the console.
         * 
         * @return builder
         * 
         */
        public Builder canUseConsolePassword(@Nullable Output<Boolean> canUseConsolePassword) {
            $.canUseConsolePassword = canUseConsolePassword;
            return this;
        }

        /**
         * @param canUseConsolePassword Indicates if the user can log in to the console.
         * 
         * @return builder
         * 
         */
        public Builder canUseConsolePassword(Boolean canUseConsolePassword) {
            return canUseConsolePassword(Output.of(canUseConsolePassword));
        }

        /**
         * @param canUseCustomerSecretKeys Indicates if the user can use SigV4 symmetric keys.
         * 
         * @return builder
         * 
         */
        public Builder canUseCustomerSecretKeys(@Nullable Output<Boolean> canUseCustomerSecretKeys) {
            $.canUseCustomerSecretKeys = canUseCustomerSecretKeys;
            return this;
        }

        /**
         * @param canUseCustomerSecretKeys Indicates if the user can use SigV4 symmetric keys.
         * 
         * @return builder
         * 
         */
        public Builder canUseCustomerSecretKeys(Boolean canUseCustomerSecretKeys) {
            return canUseCustomerSecretKeys(Output.of(canUseCustomerSecretKeys));
        }

        /**
         * @param canUseDbCredentials Indicates if the user can use DB passwords.
         * 
         * @return builder
         * 
         */
        public Builder canUseDbCredentials(@Nullable Output<Boolean> canUseDbCredentials) {
            $.canUseDbCredentials = canUseDbCredentials;
            return this;
        }

        /**
         * @param canUseDbCredentials Indicates if the user can use DB passwords.
         * 
         * @return builder
         * 
         */
        public Builder canUseDbCredentials(Boolean canUseDbCredentials) {
            return canUseDbCredentials(Output.of(canUseDbCredentials));
        }

        /**
         * @param canUseOauth2clientCredentials Indicates if the user can use OAuth2 credentials and tokens.
         * 
         * @return builder
         * 
         */
        public Builder canUseOauth2clientCredentials(@Nullable Output<Boolean> canUseOauth2clientCredentials) {
            $.canUseOauth2clientCredentials = canUseOauth2clientCredentials;
            return this;
        }

        /**
         * @param canUseOauth2clientCredentials Indicates if the user can use OAuth2 credentials and tokens.
         * 
         * @return builder
         * 
         */
        public Builder canUseOauth2clientCredentials(Boolean canUseOauth2clientCredentials) {
            return canUseOauth2clientCredentials(Output.of(canUseOauth2clientCredentials));
        }

        /**
         * @param canUseSmtpCredentials Indicates if the user can use SMTP passwords.
         * 
         * @return builder
         * 
         */
        public Builder canUseSmtpCredentials(@Nullable Output<Boolean> canUseSmtpCredentials) {
            $.canUseSmtpCredentials = canUseSmtpCredentials;
            return this;
        }

        /**
         * @param canUseSmtpCredentials Indicates if the user can use SMTP passwords.
         * 
         * @return builder
         * 
         */
        public Builder canUseSmtpCredentials(Boolean canUseSmtpCredentials) {
            return canUseSmtpCredentials(Output.of(canUseSmtpCredentials));
        }

        public UserCapabilityArgs build() {
            return $;
        }
    }

}
