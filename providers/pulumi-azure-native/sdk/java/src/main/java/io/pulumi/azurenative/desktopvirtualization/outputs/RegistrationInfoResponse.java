// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegistrationInfoResponse {
    private final @Nullable String expirationTime;
    private final @Nullable String registrationTokenOperation;
    private final @Nullable String token;

    @OutputCustomType.Constructor({"expirationTime","registrationTokenOperation","token"})
    private RegistrationInfoResponse(
        @Nullable String expirationTime,
        @Nullable String registrationTokenOperation,
        @Nullable String token) {
        this.expirationTime = expirationTime;
        this.registrationTokenOperation = registrationTokenOperation;
        this.token = token;
    }

    public Optional<String> getExpirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }
    public Optional<String> getRegistrationTokenOperation() {
        return Optional.ofNullable(this.registrationTokenOperation);
    }
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

        public Builder setExpirationTime(@Nullable String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder setRegistrationTokenOperation(@Nullable String registrationTokenOperation) {
            this.registrationTokenOperation = registrationTokenOperation;
            return this;
        }

        public Builder setToken(@Nullable String token) {
            this.token = token;
            return this;
        }

        public RegistrationInfoResponse build() {
            return new RegistrationInfoResponse(expirationTime, registrationTokenOperation, token);
        }
    }
}
