// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoginRoutesResponse {
    /**
     * The endpoint at which a logout request should be made.
     * 
     */
    private final @Nullable String logoutEndpoint;

    @CustomType.Constructor
    private LoginRoutesResponse(@CustomType.Parameter("logoutEndpoint") @Nullable String logoutEndpoint) {
        this.logoutEndpoint = logoutEndpoint;
    }

    /**
     * The endpoint at which a logout request should be made.
     * 
    */
    public Optional<String> getLogoutEndpoint() {
        return Optional.ofNullable(this.logoutEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoginRoutesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logoutEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(LoginRoutesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logoutEndpoint = defaults.logoutEndpoint;
        }

        public Builder logoutEndpoint(@Nullable String logoutEndpoint) {
            this.logoutEndpoint = logoutEndpoint;
            return this;
        }        public LoginRoutesResponse build() {
            return new LoginRoutesResponse(logoutEndpoint);
        }
    }
}
