// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Username and password credentials.
 * 
 */
public final class UsernamePasswordCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final UsernamePasswordCredentialsResponse Empty = new UsernamePasswordCredentialsResponse();

    /**
     * Password to be presented as part of the credentials. It is recommended that this value is parameterized as a secret string in order to prevent this value to be returned as part of the resource on API requests.
     * 
     */
    @InputImport(name="password", required=true)
      private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.UsernamePasswordCredentials'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Username to be presented as part of the credentials.
     * 
     */
    @InputImport(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    public UsernamePasswordCredentialsResponse(
        String password,
        String type,
        String username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private UsernamePasswordCredentialsResponse() {
        this.password = null;
        this.type = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsernamePasswordCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String type;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(UsernamePasswordCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public UsernamePasswordCredentialsResponse build() {
            return new UsernamePasswordCredentialsResponse(password, type, username);
        }
    }
}
