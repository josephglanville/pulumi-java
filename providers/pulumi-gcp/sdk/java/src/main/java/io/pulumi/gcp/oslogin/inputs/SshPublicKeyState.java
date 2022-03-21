// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.oslogin.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SshPublicKeyState extends io.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyState Empty = new SshPublicKeyState();

    /**
     * An expiration time in microseconds since epoch.
     * 
     */
    @Import(name="expirationTimeUsec")
      private final @Nullable Output<String> expirationTimeUsec;

    public Output<String> getExpirationTimeUsec() {
        return this.expirationTimeUsec == null ? Output.empty() : this.expirationTimeUsec;
    }

    /**
     * The SHA-256 fingerprint of the SSH public key.
     * 
     */
    @Import(name="fingerprint")
      private final @Nullable Output<String> fingerprint;

    public Output<String> getFingerprint() {
        return this.fingerprint == null ? Output.empty() : this.fingerprint;
    }

    /**
     * Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * The project ID of the Google Cloud Platform project.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The user email.
     * 
     */
    @Import(name="user")
      private final @Nullable Output<String> user;

    public Output<String> getUser() {
        return this.user == null ? Output.empty() : this.user;
    }

    public SshPublicKeyState(
        @Nullable Output<String> expirationTimeUsec,
        @Nullable Output<String> fingerprint,
        @Nullable Output<String> key,
        @Nullable Output<String> project,
        @Nullable Output<String> user) {
        this.expirationTimeUsec = expirationTimeUsec;
        this.fingerprint = fingerprint;
        this.key = key;
        this.project = project;
        this.user = user;
    }

    private SshPublicKeyState() {
        this.expirationTimeUsec = Output.empty();
        this.fingerprint = Output.empty();
        this.key = Output.empty();
        this.project = Output.empty();
        this.user = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expirationTimeUsec;
        private @Nullable Output<String> fingerprint;
        private @Nullable Output<String> key;
        private @Nullable Output<String> project;
        private @Nullable Output<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTimeUsec = defaults.expirationTimeUsec;
    	      this.fingerprint = defaults.fingerprint;
    	      this.key = defaults.key;
    	      this.project = defaults.project;
    	      this.user = defaults.user;
        }

        public Builder expirationTimeUsec(@Nullable Output<String> expirationTimeUsec) {
            this.expirationTimeUsec = expirationTimeUsec;
            return this;
        }
        public Builder expirationTimeUsec(@Nullable String expirationTimeUsec) {
            this.expirationTimeUsec = Output.ofNullable(expirationTimeUsec);
            return this;
        }
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public Builder fingerprint(@Nullable String fingerprint) {
            this.fingerprint = Output.ofNullable(fingerprint);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder user(@Nullable Output<String> user) {
            this.user = user;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = Output.ofNullable(user);
            return this;
        }        public SshPublicKeyState build() {
            return new SshPublicKeyState(expirationTimeUsec, fingerprint, key, project, user);
        }
    }
}
