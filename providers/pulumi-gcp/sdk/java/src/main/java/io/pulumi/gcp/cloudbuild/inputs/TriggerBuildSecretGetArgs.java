// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildSecretGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildSecretGetArgs Empty = new TriggerBuildSecretGetArgs();

    /**
     * Cloud KMS key name to use to decrypt these envs.
     * 
     */
    @InputImport(name="kmsKeyName", required=true)
      private final Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName;
    }

    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management
     * Service crypto key. These values must be specified in the build's Secret. These variables
     * will be available to all build steps in this build.
     * 
     */
    @InputImport(name="secretEnv")
      private final @Nullable Output<Map<String,String>> secretEnv;

    public Output<Map<String,String>> getSecretEnv() {
        return this.secretEnv == null ? Output.empty() : this.secretEnv;
    }

    public TriggerBuildSecretGetArgs(
        Output<String> kmsKeyName,
        @Nullable Output<Map<String,String>> secretEnv) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
        this.secretEnv = secretEnv;
    }

    private TriggerBuildSecretGetArgs() {
        this.kmsKeyName = Output.empty();
        this.secretEnv = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildSecretGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kmsKeyName;
        private @Nullable Output<Map<String,String>> secretEnv;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildSecretGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.secretEnv = defaults.secretEnv;
        }

        public Builder kmsKeyName(Output<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Output.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }

        public Builder secretEnv(@Nullable Output<Map<String,String>> secretEnv) {
            this.secretEnv = secretEnv;
            return this;
        }

        public Builder secretEnv(@Nullable Map<String,String> secretEnv) {
            this.secretEnv = Output.ofNullable(secretEnv);
            return this;
        }
        public TriggerBuildSecretGetArgs build() {
            return new TriggerBuildSecretGetArgs(kmsKeyName, secretEnv);
        }
    }
}
