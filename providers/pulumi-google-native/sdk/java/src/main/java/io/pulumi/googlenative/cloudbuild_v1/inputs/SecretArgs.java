// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pairs a set of secret environment variables containing encrypted values with the Cloud KMS key to use to decrypt the value. Note: Use `kmsKeyName` with `available_secrets` instead of using `kmsKeyName` with `secret`. For instructions see: https://cloud.google.com/cloud-build/docs/securing-builds/use-encrypted-credentials.
 * 
 */
public final class SecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * Cloud KMS key name to use to decrypt these envs.
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Codegen.empty() : this.kmsKeyName;
    }

    /**
     * Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build's secrets.
     * 
     */
    @Import(name="secretEnv")
      private final @Nullable Output<Map<String,String>> secretEnv;

    public Output<Map<String,String>> getSecretEnv() {
        return this.secretEnv == null ? Codegen.empty() : this.secretEnv;
    }

    public SecretArgs(
        @Nullable Output<String> kmsKeyName,
        @Nullable Output<Map<String,String>> secretEnv) {
        this.kmsKeyName = kmsKeyName;
        this.secretEnv = secretEnv;
    }

    private SecretArgs() {
        this.kmsKeyName = Codegen.empty();
        this.secretEnv = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyName;
        private @Nullable Output<Map<String,String>> secretEnv;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.secretEnv = defaults.secretEnv;
        }

        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Codegen.ofNullable(kmsKeyName);
            return this;
        }
        public Builder secretEnv(@Nullable Output<Map<String,String>> secretEnv) {
            this.secretEnv = secretEnv;
            return this;
        }
        public Builder secretEnv(@Nullable Map<String,String> secretEnv) {
            this.secretEnv = Codegen.ofNullable(secretEnv);
            return this;
        }        public SecretArgs build() {
            return new SecretArgs(kmsKeyName, secretEnv);
        }
    }
}
