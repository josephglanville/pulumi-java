// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A service account.
 * 
 */
public final class ServiceAccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceAccountResponse Empty = new ServiceAccountResponse();

    /**
     * Email address of the service account.
     * 
     */
    @Import(name="email", required=true)
      private final String email;

    public String getEmail() {
        return this.email;
    }

    /**
     * The list of scopes to be made available for this service account.
     * 
     */
    @Import(name="scopes", required=true)
      private final List<String> scopes;

    public List<String> getScopes() {
        return this.scopes;
    }

    public ServiceAccountResponse(
        String email,
        List<String> scopes) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.scopes = Objects.requireNonNull(scopes, "expected parameter 'scopes' to be non-null");
    }

    private ServiceAccountResponse() {
        this.email = null;
        this.scopes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }        public ServiceAccountResponse build() {
            return new ServiceAccountResponse(email, scopes);
        }
    }
}
