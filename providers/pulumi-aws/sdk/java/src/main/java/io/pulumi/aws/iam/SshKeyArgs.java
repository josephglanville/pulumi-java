// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SshKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SshKeyArgs Empty = new SshKeyArgs();

    /**
     * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
     * 
     */
    @Import(name="encoding", required=true)
      private final Output<String> encoding;

    public Output<String> getEncoding() {
        return this.encoding;
    }

    /**
     * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
     * 
     */
    @Import(name="publicKey", required=true)
      private final Output<String> publicKey;

    public Output<String> getPublicKey() {
        return this.publicKey;
    }

    /**
     * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * The name of the IAM user to associate the SSH public key with.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> getUsername() {
        return this.username;
    }

    public SshKeyArgs(
        Output<String> encoding,
        Output<String> publicKey,
        @Nullable Output<String> status,
        Output<String> username) {
        this.encoding = Objects.requireNonNull(encoding, "expected parameter 'encoding' to be non-null");
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
        this.status = status;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private SshKeyArgs() {
        this.encoding = Codegen.empty();
        this.publicKey = Codegen.empty();
        this.status = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> encoding;
        private Output<String> publicKey;
        private @Nullable Output<String> status;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(SshKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.publicKey = defaults.publicKey;
    	      this.status = defaults.status;
    	      this.username = defaults.username;
        }

        public Builder encoding(Output<String> encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }
        public Builder encoding(String encoding) {
            this.encoding = Output.of(Objects.requireNonNull(encoding));
            return this;
        }
        public Builder publicKey(Output<String> publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        public Builder publicKey(String publicKey) {
            this.publicKey = Output.of(Objects.requireNonNull(publicKey));
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public SshKeyArgs build() {
            return new SshKeyArgs(encoding, publicKey, status, username);
        }
    }
}
