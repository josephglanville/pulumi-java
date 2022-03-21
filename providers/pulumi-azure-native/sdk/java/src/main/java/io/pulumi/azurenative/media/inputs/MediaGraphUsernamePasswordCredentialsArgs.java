// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Username/password credential pair.
 * 
 */
public final class MediaGraphUsernamePasswordCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MediaGraphUsernamePasswordCredentialsArgs Empty = new MediaGraphUsernamePasswordCredentialsArgs();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphUsernamePasswordCredentials'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Password for a username/password pair.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> getPassword() {
        return this.password;
    }

    /**
     * Username for a username/password pair.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> getUsername() {
        return this.username;
    }

    public MediaGraphUsernamePasswordCredentialsArgs(
        Output<String> odataType,
        Output<String> password,
        Output<String> username) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private MediaGraphUsernamePasswordCredentialsArgs() {
        this.odataType = Output.empty();
        this.password = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphUsernamePasswordCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> odataType;
        private Output<String> password;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphUsernamePasswordCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder password(Output<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder password(String password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }
        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public MediaGraphUsernamePasswordCredentialsArgs build() {
            return new MediaGraphUsernamePasswordCredentialsArgs(odataType, password, username);
        }
    }
}
