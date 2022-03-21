// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes authentication configuration that uses a Google account.
 * 
 */
public final class GoogleAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleAccountArgs Empty = new GoogleAccountArgs();

    /**
     * Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> getPassword() {
        return this.password;
    }

    /**
     * The user name of the Google account.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> getUsername() {
        return this.username;
    }

    public GoogleAccountArgs(
        Output<String> password,
        Output<String> username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private GoogleAccountArgs() {
        this.password = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> password;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
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
        }        public GoogleAccountArgs build() {
            return new GoogleAccountArgs(password, username);
        }
    }
}
