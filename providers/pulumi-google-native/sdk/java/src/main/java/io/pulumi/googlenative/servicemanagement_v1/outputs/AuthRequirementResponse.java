// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AuthRequirementResponse {
    /**
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in all the runtime components. The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, only JWTs with audience "https://Service_name/API_name" will be accepted. For example, if no audiences are in the setting, LibraryService API will only accept JWTs with the following audience "https://library-example.googleapis.com/google.example.library.v1.LibraryService". Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    private final String audiences;
    /**
     * id from authentication provider. Example: provider_id: bookstore_auth
     * 
     */
    private final String providerId;

    @CustomType.Constructor
    private AuthRequirementResponse(
        @CustomType.Parameter("audiences") String audiences,
        @CustomType.Parameter("providerId") String providerId) {
        this.audiences = audiences;
        this.providerId = providerId;
    }

    /**
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in all the runtime components. The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, only JWTs with audience "https://Service_name/API_name" will be accepted. For example, if no audiences are in the setting, LibraryService API will only accept JWTs with the following audience "https://library-example.googleapis.com/google.example.library.v1.LibraryService". Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
    */
    public String getAudiences() {
        return this.audiences;
    }
    /**
     * id from authentication provider. Example: provider_id: bookstore_auth
     * 
    */
    public String getProviderId() {
        return this.providerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthRequirementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audiences;
        private String providerId;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthRequirementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.providerId = defaults.providerId;
        }

        public Builder audiences(String audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }
        public Builder providerId(String providerId) {
            this.providerId = Objects.requireNonNull(providerId);
            return this;
        }        public AuthRequirementResponse build() {
            return new AuthRequirementResponse(audiences, providerId);
        }
    }
}
