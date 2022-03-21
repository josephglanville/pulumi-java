// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CloudServiceVaultSecretGroupArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the OS profile for the cloud service.
 * 
 */
public final class CloudServiceOsProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceOsProfileArgs Empty = new CloudServiceOsProfileArgs();

    /**
     * Specifies set of certificates that should be installed onto the role instances.
     * 
     */
    @Import(name="secrets")
      private final @Nullable Output<List<CloudServiceVaultSecretGroupArgs>> secrets;

    public Output<List<CloudServiceVaultSecretGroupArgs>> getSecrets() {
        return this.secrets == null ? Output.empty() : this.secrets;
    }

    public CloudServiceOsProfileArgs(@Nullable Output<List<CloudServiceVaultSecretGroupArgs>> secrets) {
        this.secrets = secrets;
    }

    private CloudServiceOsProfileArgs() {
        this.secrets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceOsProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CloudServiceVaultSecretGroupArgs>> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceOsProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secrets = defaults.secrets;
        }

        public Builder secrets(@Nullable Output<List<CloudServiceVaultSecretGroupArgs>> secrets) {
            this.secrets = secrets;
            return this;
        }
        public Builder secrets(@Nullable List<CloudServiceVaultSecretGroupArgs> secrets) {
            this.secrets = Output.ofNullable(secrets);
            return this;
        }
        public Builder secrets(CloudServiceVaultSecretGroupArgs... secrets) {
            return secrets(List.of(secrets));
        }        public CloudServiceOsProfileArgs build() {
            return new CloudServiceOsProfileArgs(secrets);
        }
    }
}
