// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthenticationPolicyPasswordPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationPolicyPasswordPolicyArgs Empty = new AuthenticationPolicyPasswordPolicyArgs();

    /**
     * (Updatable) At least one lower case character required.
     * 
     */
    @Import(name="isLowercaseCharactersRequired")
    private @Nullable Output<Boolean> isLowercaseCharactersRequired;

    /**
     * @return (Updatable) At least one lower case character required.
     * 
     */
    public Optional<Output<Boolean>> isLowercaseCharactersRequired() {
        return Optional.ofNullable(this.isLowercaseCharactersRequired);
    }

    /**
     * (Updatable) At least one numeric character required.
     * 
     */
    @Import(name="isNumericCharactersRequired")
    private @Nullable Output<Boolean> isNumericCharactersRequired;

    /**
     * @return (Updatable) At least one numeric character required.
     * 
     */
    public Optional<Output<Boolean>> isNumericCharactersRequired() {
        return Optional.ofNullable(this.isNumericCharactersRequired);
    }

    /**
     * (Updatable) At least one special character required.
     * 
     */
    @Import(name="isSpecialCharactersRequired")
    private @Nullable Output<Boolean> isSpecialCharactersRequired;

    /**
     * @return (Updatable) At least one special character required.
     * 
     */
    public Optional<Output<Boolean>> isSpecialCharactersRequired() {
        return Optional.ofNullable(this.isSpecialCharactersRequired);
    }

    /**
     * (Updatable) At least one uppercase character required.
     * 
     */
    @Import(name="isUppercaseCharactersRequired")
    private @Nullable Output<Boolean> isUppercaseCharactersRequired;

    /**
     * @return (Updatable) At least one uppercase character required.
     * 
     */
    public Optional<Output<Boolean>> isUppercaseCharactersRequired() {
        return Optional.ofNullable(this.isUppercaseCharactersRequired);
    }

    /**
     * (Updatable) User name is allowed to be part of the password.
     * 
     */
    @Import(name="isUsernameContainmentAllowed")
    private @Nullable Output<Boolean> isUsernameContainmentAllowed;

    /**
     * @return (Updatable) User name is allowed to be part of the password.
     * 
     */
    public Optional<Output<Boolean>> isUsernameContainmentAllowed() {
        return Optional.ofNullable(this.isUsernameContainmentAllowed);
    }

    /**
     * (Updatable) Minimum password length required.
     * 
     */
    @Import(name="minimumPasswordLength")
    private @Nullable Output<Integer> minimumPasswordLength;

    /**
     * @return (Updatable) Minimum password length required.
     * 
     */
    public Optional<Output<Integer>> minimumPasswordLength() {
        return Optional.ofNullable(this.minimumPasswordLength);
    }

    private AuthenticationPolicyPasswordPolicyArgs() {}

    private AuthenticationPolicyPasswordPolicyArgs(AuthenticationPolicyPasswordPolicyArgs $) {
        this.isLowercaseCharactersRequired = $.isLowercaseCharactersRequired;
        this.isNumericCharactersRequired = $.isNumericCharactersRequired;
        this.isSpecialCharactersRequired = $.isSpecialCharactersRequired;
        this.isUppercaseCharactersRequired = $.isUppercaseCharactersRequired;
        this.isUsernameContainmentAllowed = $.isUsernameContainmentAllowed;
        this.minimumPasswordLength = $.minimumPasswordLength;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationPolicyPasswordPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationPolicyPasswordPolicyArgs $;

        public Builder() {
            $ = new AuthenticationPolicyPasswordPolicyArgs();
        }

        public Builder(AuthenticationPolicyPasswordPolicyArgs defaults) {
            $ = new AuthenticationPolicyPasswordPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isLowercaseCharactersRequired (Updatable) At least one lower case character required.
         * 
         * @return builder
         * 
         */
        public Builder isLowercaseCharactersRequired(@Nullable Output<Boolean> isLowercaseCharactersRequired) {
            $.isLowercaseCharactersRequired = isLowercaseCharactersRequired;
            return this;
        }

        /**
         * @param isLowercaseCharactersRequired (Updatable) At least one lower case character required.
         * 
         * @return builder
         * 
         */
        public Builder isLowercaseCharactersRequired(Boolean isLowercaseCharactersRequired) {
            return isLowercaseCharactersRequired(Output.of(isLowercaseCharactersRequired));
        }

        /**
         * @param isNumericCharactersRequired (Updatable) At least one numeric character required.
         * 
         * @return builder
         * 
         */
        public Builder isNumericCharactersRequired(@Nullable Output<Boolean> isNumericCharactersRequired) {
            $.isNumericCharactersRequired = isNumericCharactersRequired;
            return this;
        }

        /**
         * @param isNumericCharactersRequired (Updatable) At least one numeric character required.
         * 
         * @return builder
         * 
         */
        public Builder isNumericCharactersRequired(Boolean isNumericCharactersRequired) {
            return isNumericCharactersRequired(Output.of(isNumericCharactersRequired));
        }

        /**
         * @param isSpecialCharactersRequired (Updatable) At least one special character required.
         * 
         * @return builder
         * 
         */
        public Builder isSpecialCharactersRequired(@Nullable Output<Boolean> isSpecialCharactersRequired) {
            $.isSpecialCharactersRequired = isSpecialCharactersRequired;
            return this;
        }

        /**
         * @param isSpecialCharactersRequired (Updatable) At least one special character required.
         * 
         * @return builder
         * 
         */
        public Builder isSpecialCharactersRequired(Boolean isSpecialCharactersRequired) {
            return isSpecialCharactersRequired(Output.of(isSpecialCharactersRequired));
        }

        /**
         * @param isUppercaseCharactersRequired (Updatable) At least one uppercase character required.
         * 
         * @return builder
         * 
         */
        public Builder isUppercaseCharactersRequired(@Nullable Output<Boolean> isUppercaseCharactersRequired) {
            $.isUppercaseCharactersRequired = isUppercaseCharactersRequired;
            return this;
        }

        /**
         * @param isUppercaseCharactersRequired (Updatable) At least one uppercase character required.
         * 
         * @return builder
         * 
         */
        public Builder isUppercaseCharactersRequired(Boolean isUppercaseCharactersRequired) {
            return isUppercaseCharactersRequired(Output.of(isUppercaseCharactersRequired));
        }

        /**
         * @param isUsernameContainmentAllowed (Updatable) User name is allowed to be part of the password.
         * 
         * @return builder
         * 
         */
        public Builder isUsernameContainmentAllowed(@Nullable Output<Boolean> isUsernameContainmentAllowed) {
            $.isUsernameContainmentAllowed = isUsernameContainmentAllowed;
            return this;
        }

        /**
         * @param isUsernameContainmentAllowed (Updatable) User name is allowed to be part of the password.
         * 
         * @return builder
         * 
         */
        public Builder isUsernameContainmentAllowed(Boolean isUsernameContainmentAllowed) {
            return isUsernameContainmentAllowed(Output.of(isUsernameContainmentAllowed));
        }

        /**
         * @param minimumPasswordLength (Updatable) Minimum password length required.
         * 
         * @return builder
         * 
         */
        public Builder minimumPasswordLength(@Nullable Output<Integer> minimumPasswordLength) {
            $.minimumPasswordLength = minimumPasswordLength;
            return this;
        }

        /**
         * @param minimumPasswordLength (Updatable) Minimum password length required.
         * 
         * @return builder
         * 
         */
        public Builder minimumPasswordLength(Integer minimumPasswordLength) {
            return minimumPasswordLength(Output.of(minimumPasswordLength));
        }

        public AuthenticationPolicyPasswordPolicyArgs build() {
            return $;
        }
    }

}
