// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AllowedAudiencesValidationArgs;
import io.pulumi.azurenative.web.inputs.ClientRegistrationArgs;
import io.pulumi.azurenative.web.inputs.LoginScopesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the legacy Microsoft Account provider.
 * 
 */
public final class LegacyMicrosoftAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final LegacyMicrosoftAccountArgs Empty = new LegacyMicrosoftAccountArgs();

    /**
     * <code>false</code> if the legacy Microsoft Account provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The configuration settings of the login flow.
     * 
     */
    @Import(name="login")
      private final @Nullable Output<LoginScopesArgs> login;

    public Output<LoginScopesArgs> getLogin() {
        return this.login == null ? Output.empty() : this.login;
    }

    /**
     * The configuration settings of the app registration for the legacy Microsoft Account provider.
     * 
     */
    @Import(name="registration")
      private final @Nullable Output<ClientRegistrationArgs> registration;

    public Output<ClientRegistrationArgs> getRegistration() {
        return this.registration == null ? Output.empty() : this.registration;
    }

    /**
     * The configuration settings of the legacy Microsoft Account provider token validation flow.
     * 
     */
    @Import(name="validation")
      private final @Nullable Output<AllowedAudiencesValidationArgs> validation;

    public Output<AllowedAudiencesValidationArgs> getValidation() {
        return this.validation == null ? Output.empty() : this.validation;
    }

    public LegacyMicrosoftAccountArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<LoginScopesArgs> login,
        @Nullable Output<ClientRegistrationArgs> registration,
        @Nullable Output<AllowedAudiencesValidationArgs> validation) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
        this.validation = validation;
    }

    private LegacyMicrosoftAccountArgs() {
        this.enabled = Output.empty();
        this.login = Output.empty();
        this.registration = Output.empty();
        this.validation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LegacyMicrosoftAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<LoginScopesArgs> login;
        private @Nullable Output<ClientRegistrationArgs> registration;
        private @Nullable Output<AllowedAudiencesValidationArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(LegacyMicrosoftAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
    	      this.validation = defaults.validation;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder login(@Nullable Output<LoginScopesArgs> login) {
            this.login = login;
            return this;
        }
        public Builder login(@Nullable LoginScopesArgs login) {
            this.login = Output.ofNullable(login);
            return this;
        }
        public Builder registration(@Nullable Output<ClientRegistrationArgs> registration) {
            this.registration = registration;
            return this;
        }
        public Builder registration(@Nullable ClientRegistrationArgs registration) {
            this.registration = Output.ofNullable(registration);
            return this;
        }
        public Builder validation(@Nullable Output<AllowedAudiencesValidationArgs> validation) {
            this.validation = validation;
            return this;
        }
        public Builder validation(@Nullable AllowedAudiencesValidationArgs validation) {
            this.validation = Output.ofNullable(validation);
            return this;
        }        public LegacyMicrosoftAccountArgs build() {
            return new LegacyMicrosoftAccountArgs(enabled, login, registration, validation);
        }
    }
}
