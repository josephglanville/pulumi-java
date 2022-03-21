// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.AsymmetricEncryptedSecretArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Symmetric key for authentication.
 * 
 */
public final class SymmetricKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SymmetricKeyArgs Empty = new SymmetricKeyArgs();

    /**
     * Connection string based on the symmetric key.
     * 
     */
    @Import(name="connectionString")
      private final @Nullable Output<AsymmetricEncryptedSecretArgs> connectionString;

    public Output<AsymmetricEncryptedSecretArgs> getConnectionString() {
        return this.connectionString == null ? Output.empty() : this.connectionString;
    }

    public SymmetricKeyArgs(@Nullable Output<AsymmetricEncryptedSecretArgs> connectionString) {
        this.connectionString = connectionString;
    }

    private SymmetricKeyArgs() {
        this.connectionString = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SymmetricKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AsymmetricEncryptedSecretArgs> connectionString;

        public Builder() {
    	      // Empty
        }

        public Builder(SymmetricKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
        }

        public Builder connectionString(@Nullable Output<AsymmetricEncryptedSecretArgs> connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public Builder connectionString(@Nullable AsymmetricEncryptedSecretArgs connectionString) {
            this.connectionString = Output.ofNullable(connectionString);
            return this;
        }        public SymmetricKeyArgs build() {
            return new SymmetricKeyArgs(connectionString);
        }
    }
}
