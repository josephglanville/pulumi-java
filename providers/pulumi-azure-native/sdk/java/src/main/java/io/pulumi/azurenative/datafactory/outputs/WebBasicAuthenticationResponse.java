// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebBasicAuthenticationResponse {
    /**
     * Type of authentication used to connect to the web table source.
     * Expected value is 'Basic'.
     * 
     */
    private final String authenticationType;
    /**
     * The password for Basic authentication.
     * 
     */
    private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * The URL of the web service endpoint, e.g. http://www.microsoft.com . Type: string (or Expression with resultType string).
     * 
     */
    private final Object url;
    /**
     * User name for Basic authentication. Type: string (or Expression with resultType string).
     * 
     */
    private final Object username;

    @CustomType.Constructor
    private WebBasicAuthenticationResponse(
        @CustomType.Parameter("authenticationType") String authenticationType,
        @CustomType.Parameter("password") Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @CustomType.Parameter("url") Object url,
        @CustomType.Parameter("username") Object username) {
        this.authenticationType = authenticationType;
        this.password = password;
        this.url = url;
        this.username = username;
    }

    /**
     * Type of authentication used to connect to the web table source.
     * Expected value is 'Basic'.
     * 
    */
    public String getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * The password for Basic authentication.
     * 
    */
    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password;
    }
    /**
     * The URL of the web service endpoint, e.g. http://www.microsoft.com . Type: string (or Expression with resultType string).
     * 
    */
    public Object getUrl() {
        return this.url;
    }
    /**
     * User name for Basic authentication. Type: string (or Expression with resultType string).
     * 
    */
    public Object getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebBasicAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authenticationType;
        private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private Object url;
        private Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(WebBasicAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder password(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder url(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder username(Object username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public WebBasicAuthenticationResponse build() {
            return new WebBasicAuthenticationResponse(authenticationType, password, url, username);
        }
    }
}
