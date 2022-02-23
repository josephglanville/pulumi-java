// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AppRegistrationArgs;
import io.pulumi.azurenative.web.inputs.LoginScopesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the Facebook provider.
 * 
 */
public final class FacebookArgs extends io.pulumi.resources.ResourceArgs {

    public static final FacebookArgs Empty = new FacebookArgs();

    /**
     * <code>false</code> if the Facebook provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The version of the Facebook api to be used while logging in.
     * 
     */
    @InputImport(name="graphApiVersion")
      private final @Nullable Input<String> graphApiVersion;

    public Input<String> getGraphApiVersion() {
        return this.graphApiVersion == null ? Input.empty() : this.graphApiVersion;
    }

    /**
     * The configuration settings of the login flow.
     * 
     */
    @InputImport(name="login")
      private final @Nullable Input<LoginScopesArgs> login;

    public Input<LoginScopesArgs> getLogin() {
        return this.login == null ? Input.empty() : this.login;
    }

    /**
     * The configuration settings of the app registration for the Facebook provider.
     * 
     */
    @InputImport(name="registration")
      private final @Nullable Input<AppRegistrationArgs> registration;

    public Input<AppRegistrationArgs> getRegistration() {
        return this.registration == null ? Input.empty() : this.registration;
    }

    public FacebookArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> graphApiVersion,
        @Nullable Input<LoginScopesArgs> login,
        @Nullable Input<AppRegistrationArgs> registration) {
        this.enabled = enabled;
        this.graphApiVersion = graphApiVersion;
        this.login = login;
        this.registration = registration;
    }

    private FacebookArgs() {
        this.enabled = Input.empty();
        this.graphApiVersion = Input.empty();
        this.login = Input.empty();
        this.registration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> graphApiVersion;
        private @Nullable Input<LoginScopesArgs> login;
        private @Nullable Input<AppRegistrationArgs> registration;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.graphApiVersion = defaults.graphApiVersion;
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

        public Builder setGraphApiVersion(@Nullable Input<String> graphApiVersion) {
            this.graphApiVersion = graphApiVersion;
            return this;
        }

        public Builder setGraphApiVersion(@Nullable String graphApiVersion) {
            this.graphApiVersion = Input.ofNullable(graphApiVersion);
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

        public Builder setRegistration(@Nullable Input<AppRegistrationArgs> registration) {
            this.registration = registration;
            return this;
        }

        public Builder setRegistration(@Nullable AppRegistrationArgs registration) {
            this.registration = Input.ofNullable(registration);
            return this;
        }
        public FacebookArgs build() {
            return new FacebookArgs(enabled, graphApiVersion, login, registration);
        }
    }
}
