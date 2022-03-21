// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * a powershell credential object
 * 
 */
public final class PSCredentialExecutionParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final PSCredentialExecutionParameterResponse Empty = new PSCredentialExecutionParameterResponse();

    /**
     * The parameter name
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * password for login
     * 
     */
    @Import(name="password")
      private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * The type of execution parameter
     * Expected value is 'Credential'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * username for login
     * 
     */
    @Import(name="username")
      private final @Nullable String username;

    public Optional<String> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public PSCredentialExecutionParameterResponse(
        String name,
        @Nullable String password,
        String type,
        @Nullable String username) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private PSCredentialExecutionParameterResponse() {
        this.name = null;
        this.password = null;
        this.type = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PSCredentialExecutionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String password;
        private String type;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(PSCredentialExecutionParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public PSCredentialExecutionParameterResponse build() {
            return new PSCredentialExecutionParameterResponse(name, password, type, username);
        }
    }
}
