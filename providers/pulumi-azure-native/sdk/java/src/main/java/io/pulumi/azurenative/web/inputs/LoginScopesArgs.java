// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the login flow, including the scopes that should be requested.
 * 
 */
public final class LoginScopesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoginScopesArgs Empty = new LoginScopesArgs();

    /**
     * A list of the scopes that should be requested while authenticating.
     * 
     */
    @InputImport(name="scopes")
      private final @Nullable Input<List<String>> scopes;

    public Input<List<String>> getScopes() {
        return this.scopes == null ? Input.empty() : this.scopes;
    }

    public LoginScopesArgs(@Nullable Input<List<String>> scopes) {
        this.scopes = scopes;
    }

    private LoginScopesArgs() {
        this.scopes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoginScopesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(LoginScopesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scopes = defaults.scopes;
        }

        public Builder setScopes(@Nullable Input<List<String>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder setScopes(@Nullable List<String> scopes) {
            this.scopes = Input.ofNullable(scopes);
            return this;
        }
        public LoginScopesArgs build() {
            return new LoginScopesArgs(scopes);
        }
    }
}
