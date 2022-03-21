// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryconnection_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudSqlCredentialResponse {
    /**
     * The password for the credential.
     * 
     */
    private final String password;
    /**
     * The username for the credential.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private CloudSqlCredentialResponse(
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("username") String username) {
        this.password = password;
        this.username = username;
    }

    /**
     * The password for the credential.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * The username for the credential.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSqlCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSqlCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public CloudSqlCredentialResponse build() {
            return new CloudSqlCredentialResponse(password, username);
        }
    }
}
