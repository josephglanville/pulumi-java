// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildAvailableSecretsSecretManagerGetArgs;
import java.util.List;
import java.util.Objects;


public final class TriggerBuildAvailableSecretsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildAvailableSecretsGetArgs Empty = new TriggerBuildAvailableSecretsGetArgs();

    /**
     * Pairs a secret environment variable with a SecretVersion in Secret Manager.
     * Structure is documented below.
     * 
     */
    @Import(name="secretManagers", required=true)
      private final Output<List<TriggerBuildAvailableSecretsSecretManagerGetArgs>> secretManagers;

    public Output<List<TriggerBuildAvailableSecretsSecretManagerGetArgs>> getSecretManagers() {
        return this.secretManagers;
    }

    public TriggerBuildAvailableSecretsGetArgs(Output<List<TriggerBuildAvailableSecretsSecretManagerGetArgs>> secretManagers) {
        this.secretManagers = Objects.requireNonNull(secretManagers, "expected parameter 'secretManagers' to be non-null");
    }

    private TriggerBuildAvailableSecretsGetArgs() {
        this.secretManagers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildAvailableSecretsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<TriggerBuildAvailableSecretsSecretManagerGetArgs>> secretManagers;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildAvailableSecretsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretManagers = defaults.secretManagers;
        }

        public Builder secretManagers(Output<List<TriggerBuildAvailableSecretsSecretManagerGetArgs>> secretManagers) {
            this.secretManagers = Objects.requireNonNull(secretManagers);
            return this;
        }
        public Builder secretManagers(List<TriggerBuildAvailableSecretsSecretManagerGetArgs> secretManagers) {
            this.secretManagers = Output.of(Objects.requireNonNull(secretManagers));
            return this;
        }
        public Builder secretManagers(TriggerBuildAvailableSecretsSecretManagerGetArgs... secretManagers) {
            return secretManagers(List.of(secretManagers));
        }        public TriggerBuildAvailableSecretsGetArgs build() {
            return new TriggerBuildAvailableSecretsGetArgs(secretManagers);
        }
    }
}
