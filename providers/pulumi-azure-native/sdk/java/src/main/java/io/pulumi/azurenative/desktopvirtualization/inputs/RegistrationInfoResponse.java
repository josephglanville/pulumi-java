// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistrationInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final RegistrationInfoResponse Empty = new RegistrationInfoResponse();

    @InputImport(name="expirationTime")
    private final @Nullable String expirationTime;

    public Optional<String> getExpirationTime() {
        return this.expirationTime == null ? Optional.empty() : Optional.ofNullable(this.expirationTime);
    }

    @InputImport(name="registrationTokenOperation")
    private final @Nullable String registrationTokenOperation;

    public Optional<String> getRegistrationTokenOperation() {
        return this.registrationTokenOperation == null ? Optional.empty() : Optional.ofNullable(this.registrationTokenOperation);
    }

    @InputImport(name="token")
    private final @Nullable String token;

    public Optional<String> getToken() {
        return this.token == null ? Optional.empty() : Optional.ofNullable(this.token);
    }

    public RegistrationInfoResponse(
        @Nullable String expirationTime,
        @Nullable String registrationTokenOperation,
        @Nullable String token) {
        this.expirationTime = expirationTime;
        this.registrationTokenOperation = registrationTokenOperation;
        this.token = token;
    }

    private RegistrationInfoResponse() {
        this.expirationTime = null;
        this.registrationTokenOperation = null;
        this.token = null;
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
