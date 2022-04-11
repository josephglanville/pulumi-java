// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class VoiceConnectorTerminationCredentialsCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorTerminationCredentialsCredentialArgs Empty = new VoiceConnectorTerminationCredentialsCredentialArgs();

    /**
     * RFC2617 compliant password associated with the SIP credentials.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> getPassword() {
        return this.password;
    }

    /**
     * RFC2617 compliant username associated with the SIP credentials.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> getUsername() {
        return this.username;
    }

    public VoiceConnectorTerminationCredentialsCredentialArgs(
        Output<String> password,
        Output<String> username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private VoiceConnectorTerminationCredentialsCredentialArgs() {
        this.password = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorTerminationCredentialsCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> password;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorTerminationCredentialsCredentialArgs defaults) {
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
        }        public VoiceConnectorTerminationCredentialsCredentialArgs build() {
            return new VoiceConnectorTerminationCredentialsCredentialArgs(password, username);
        }
    }
}
