// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinuxUserConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinuxUserConfigurationArgs Empty = new LinuxUserConfigurationArgs();

    /**
     * The uid and gid properties must be specified together or not at all. If not specified the underlying operating system picks the gid.
     * 
     */
    @InputImport(name="gid")
      private final @Nullable Input<Integer> gid;

    public Input<Integer> getGid() {
        return this.gid == null ? Input.empty() : this.gid;
    }

    /**
     * The private key must not be password protected. The private key is used to automatically configure asymmetric-key based authentication for SSH between nodes in a Linux pool when the pool's enableInterNodeCommunication property is true (it is ignored if enableInterNodeCommunication is false). It does this by placing the key pair into the user's .ssh directory. If not specified, password-less SSH is not configured between nodes (no modification of the user's .ssh directory is done).
     * 
     */
    @InputImport(name="sshPrivateKey")
      private final @Nullable Input<String> sshPrivateKey;

    public Input<String> getSshPrivateKey() {
        return this.sshPrivateKey == null ? Input.empty() : this.sshPrivateKey;
    }

    /**
     * The uid and gid properties must be specified together or not at all. If not specified the underlying operating system picks the uid.
     * 
     */
    @InputImport(name="uid")
      private final @Nullable Input<Integer> uid;

    public Input<Integer> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    public LinuxUserConfigurationArgs(
        @Nullable Input<Integer> gid,
        @Nullable Input<String> sshPrivateKey,
        @Nullable Input<Integer> uid) {
        this.gid = gid;
        this.sshPrivateKey = sshPrivateKey;
        this.uid = uid;
    }

    private LinuxUserConfigurationArgs() {
        this.gid = Input.empty();
        this.sshPrivateKey = Input.empty();
        this.uid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxUserConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> gid;
        private @Nullable Input<String> sshPrivateKey;
        private @Nullable Input<Integer> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxUserConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.sshPrivateKey = defaults.sshPrivateKey;
    	      this.uid = defaults.uid;
        }

        public Builder setGid(@Nullable Input<Integer> gid) {
            this.gid = gid;
            return this;
        }

        public Builder setGid(@Nullable Integer gid) {
            this.gid = Input.ofNullable(gid);
            return this;
        }

        public Builder setSshPrivateKey(@Nullable Input<String> sshPrivateKey) {
            this.sshPrivateKey = sshPrivateKey;
            return this;
        }

        public Builder setSshPrivateKey(@Nullable String sshPrivateKey) {
            this.sshPrivateKey = Input.ofNullable(sshPrivateKey);
            return this;
        }

        public Builder setUid(@Nullable Input<Integer> uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUid(@Nullable Integer uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }
        public LinuxUserConfigurationArgs build() {
            return new LinuxUserConfigurationArgs(gid, sshPrivateKey, uid);
        }
    }
}
