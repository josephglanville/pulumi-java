// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NonceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NonceArgs Empty = new NonceArgs();

    @InputImport(name="nonceExpirationInterval")
    private final @Nullable Input<String> nonceExpirationInterval;

    public Input<String> getNonceExpirationInterval() {
        return this.nonceExpirationInterval == null ? Input.empty() : this.nonceExpirationInterval;
    }

    @InputImport(name="validateNonce")
    private final @Nullable Input<Boolean> validateNonce;

    public Input<Boolean> getValidateNonce() {
        return this.validateNonce == null ? Input.empty() : this.validateNonce;
    }

    public NonceArgs(
        @Nullable Input<String> nonceExpirationInterval,
        @Nullable Input<Boolean> validateNonce) {
        this.nonceExpirationInterval = nonceExpirationInterval;
        this.validateNonce = validateNonce;
    }

    private NonceArgs() {
        this.nonceExpirationInterval = Input.empty();
        this.validateNonce = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> nonceExpirationInterval;
        private @Nullable Input<Boolean> validateNonce;

        public Builder() {
    	      // Empty
        }

        public Builder(NonceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonceExpirationInterval = defaults.nonceExpirationInterval;
    	      this.validateNonce = defaults.validateNonce;
        }

        public Builder setNonceExpirationInterval(@Nullable Input<String> nonceExpirationInterval) {
            this.nonceExpirationInterval = nonceExpirationInterval;
            return this;
        }

        public Builder setNonceExpirationInterval(@Nullable String nonceExpirationInterval) {
            this.nonceExpirationInterval = Input.ofNullable(nonceExpirationInterval);
            return this;
        }

        public Builder setValidateNonce(@Nullable Input<Boolean> validateNonce) {
            this.validateNonce = validateNonce;
            return this;
        }

        public Builder setValidateNonce(@Nullable Boolean validateNonce) {
            this.validateNonce = Input.ofNullable(validateNonce);
            return this;
        }

        public NonceArgs build() {
            return new NonceArgs(nonceExpirationInterval, validateNonce);
        }
    }
}
