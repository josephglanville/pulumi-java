// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.AppleRegistrationResponse;
import io.pulumi.azurenative.web.outputs.LoginScopesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AppleResponse {
    private final @Nullable Boolean enabled;
    private final @Nullable LoginScopesResponse login;
    private final @Nullable AppleRegistrationResponse registration;

    @OutputCustomType.Constructor({"enabled","login","registration"})
    private AppleResponse(
        @Nullable Boolean enabled,
        @Nullable LoginScopesResponse login,
        @Nullable AppleRegistrationResponse registration) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<LoginScopesResponse> getLogin() {
        return Optional.ofNullable(this.login);
    }
    public Optional<AppleRegistrationResponse> getRegistration() {
        return Optional.ofNullable(this.registration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable LoginScopesResponse login;
        private @Nullable AppleRegistrationResponse registration;

        public Builder() {
    	      // Empty
        }

        public Builder(AppleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setLogin(@Nullable LoginScopesResponse login) {
            this.login = login;
            return this;
        }

        public Builder setRegistration(@Nullable AppleRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }

        public AppleResponse build() {
            return new AppleResponse(enabled, login, registration);
        }
    }
}
