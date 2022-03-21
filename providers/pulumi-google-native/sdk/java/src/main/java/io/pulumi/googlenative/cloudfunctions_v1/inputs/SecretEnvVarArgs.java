// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a secret environment variable. It has the information necessary to fetch the secret value from secret manager and expose it as an environment variable. Secret value is not a part of the configuration. Secret values are only fetched when a new clone starts.
 * 
 */
public final class SecretEnvVarArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretEnvVarArgs Empty = new SecretEnvVarArgs();

    /**
     * Name of the environment variable.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function's project assuming that the secret exists in the same project as of the function.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
     */
    @Import(name="secret")
      private final @Nullable Output<String> secret;

    public Output<String> getSecret() {
        return this.secret == null ? Output.empty() : this.secret;
    }

    /**
     * Version of the secret (version number or the string 'latest'). It is recommended to use a numeric version for secret environment variables as any updates to the secret value is not reflected until new clones start.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public SecretEnvVarArgs(
        @Nullable Output<String> key,
        @Nullable Output<String> project,
        @Nullable Output<String> secret,
        @Nullable Output<String> version) {
        this.key = key;
        this.project = project;
        this.secret = secret;
        this.version = version;
    }

    private SecretEnvVarArgs() {
        this.key = Output.empty();
        this.project = Output.empty();
        this.secret = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretEnvVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private @Nullable Output<String> project;
        private @Nullable Output<String> secret;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretEnvVarArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.version = defaults.version;
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
        public Builder secret(@Nullable Output<String> secret) {
            this.secret = secret;
            return this;
        }
        public Builder secret(@Nullable String secret) {
            this.secret = Output.ofNullable(secret);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public SecretEnvVarArgs build() {
            return new SecretEnvVarArgs(key, project, secret, version);
        }
    }
}
