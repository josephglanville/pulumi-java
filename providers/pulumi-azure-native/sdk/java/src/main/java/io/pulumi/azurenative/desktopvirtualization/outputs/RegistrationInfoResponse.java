// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegistrationInfoResponse {
    /**
     * Expiration time of registration token.
     * 
     */
    private final @Nullable String expirationTime;
    /**
     * The type of resetting the token.
     * 
     */
    private final @Nullable String registrationTokenOperation;
    /**
     * The registration token base64 encoded string.
     * 
     */
    private final @Nullable String token;

    @CustomType.Constructor
    private RegistrationInfoResponse(
        @CustomType.Parameter("expirationTime") @Nullable String expirationTime,
        @CustomType.Parameter("registrationTokenOperation") @Nullable String registrationTokenOperation,
        @CustomType.Parameter("token") @Nullable String token) {
        this.expirationTime = expirationTime;
        this.registrationTokenOperation = registrationTokenOperation;
        this.token = token;
    }

    /**
     * Expiration time of registration token.
     * 
    */
    public Optional<String> getExpirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }
    /**
     * The type of resetting the token.
     * 
    */
    public Optional<String> getRegistrationTokenOperation() {
        return Optional.ofNullable(this.registrationTokenOperation);
    }
    /**
     * The registration token base64 encoded string.
     * 
    */
    public Optional<String> getToken() {
        return Optional.ofNullable(this.token);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expirationTime;
        private @Nullable String registrationTokenOperation;
        private @Nullable String token;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.registrationTokenOperation = defaults.registrationTokenOperation;
    	      this.token = defaults.token;
        }

        public Builder expirationTime(@Nullable String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Builder registrationTokenOperation(@Nullable String registrationTokenOperation) {
            this.registrationTokenOperation = registrationTokenOperation;
            return this;
        }
        public Builder token(@Nullable String token) {
            this.token = token;
            return this;
        }        public RegistrationInfoResponse build() {
            return new RegistrationInfoResponse(expirationTime, registrationTokenOperation, token);
        }
    }
}
