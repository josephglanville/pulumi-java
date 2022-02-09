// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AppleRegistrationArgs;
import io.pulumi.azurenative.web.inputs.LoginScopesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppleArgs Empty = new AppleArgs();

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="login")
    private final @Nullable Input<LoginScopesArgs> login;

    public Input<LoginScopesArgs> getLogin() {
        return this.login == null ? Input.empty() : this.login;
    }

    @InputImport(name="registration")
    private final @Nullable Input<AppleRegistrationArgs> registration;

    public Input<AppleRegistrationArgs> getRegistration() {
        return this.registration == null ? Input.empty() : this.registration;
    }

    public AppleArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<LoginScopesArgs> login,
        @Nullable Input<AppleRegistrationArgs> registration) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
    }

    private AppleArgs() {
        this.enabled = Input.empty();
        this.login = Input.empty();
        this.registration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<LoginScopesArgs> login;
        private @Nullable Input<AppleRegistrationArgs> registration;

        public Builder() {
    	      // Empty
        }

        public Builder(AppleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLogin(@Nullable Input<LoginScopesArgs> login) {
            this.login = login;
            return this;
        }

        public Builder setLogin(@Nullable LoginScopesArgs login) {
            this.login = Input.ofNullable(login);
            return this;
        }

        public Builder setRegistration(@Nullable Input<AppleRegistrationArgs> registration) {
            this.registration = registration;
            return this;
        }

        public Builder setRegistration(@Nullable AppleRegistrationArgs registration) {
            this.registration = Input.ofNullable(registration);
            return this;
        }

        public AppleArgs build() {
            return new AppleArgs(enabled, login, registration);
        }
    }
}
