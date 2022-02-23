// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmenEncryptionKeyReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The encryption configuration for the integration service environment.
 * 
 */
public final class IntegrationServiceEnvironmenEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceEnvironmenEncryptionConfigurationArgs Empty = new IntegrationServiceEnvironmenEncryptionConfigurationArgs();

    /**
     * The encryption key reference.
     * 
     */
    @InputImport(name="encryptionKeyReference")
      private final @Nullable Input<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> encryptionKeyReference;

    public Input<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> getEncryptionKeyReference() {
        return this.encryptionKeyReference == null ? Input.empty() : this.encryptionKeyReference;
    }

    public IntegrationServiceEnvironmenEncryptionConfigurationArgs(@Nullable Input<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> encryptionKeyReference) {
        this.encryptionKeyReference = encryptionKeyReference;
    }

    private IntegrationServiceEnvironmenEncryptionConfigurationArgs() {
        this.encryptionKeyReference = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmenEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> encryptionKeyReference;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmenEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionKeyReference = defaults.encryptionKeyReference;
        }

        public Builder setEncryptionKeyReference(@Nullable Input<IntegrationServiceEnvironmenEncryptionKeyReferenceArgs> encryptionKeyReference) {
            this.encryptionKeyReference = encryptionKeyReference;
            return this;
        }

        public Builder setEncryptionKeyReference(@Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceArgs encryptionKeyReference) {
            this.encryptionKeyReference = Input.ofNullable(encryptionKeyReference);
            return this;
        }
        public IntegrationServiceEnvironmenEncryptionConfigurationArgs build() {
            return new IntegrationServiceEnvironmenEncryptionConfigurationArgs(encryptionKeyReference);
        }
    }
}
