// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.enums.DatabaseEncryptionState;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of etcd encryption.
 * 
 */
public final class DatabaseEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseEncryptionArgs Empty = new DatabaseEncryptionArgs();

    /**
     * Name of CloudKMS key to use for the encryption of secrets in etcd. Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
     * 
     */
    @InputImport(name="keyName")
      private final @Nullable Output<String> keyName;

    public Output<String> getKeyName() {
        return this.keyName == null ? Output.empty() : this.keyName;
    }

    /**
     * Denotes the state of etcd encryption.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Output<DatabaseEncryptionState> state;

    public Output<DatabaseEncryptionState> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public DatabaseEncryptionArgs(
        @Nullable Output<String> keyName,
        @Nullable Output<DatabaseEncryptionState> state) {
        this.keyName = keyName;
        this.state = state;
    }

    private DatabaseEncryptionArgs() {
        this.keyName = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyName;
        private @Nullable Output<DatabaseEncryptionState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.state = defaults.state;
        }

        public Builder keyName(@Nullable Output<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = Output.ofNullable(keyName);
            return this;
        }

        public Builder state(@Nullable Output<DatabaseEncryptionState> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable DatabaseEncryptionState state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public DatabaseEncryptionArgs build() {
            return new DatabaseEncryptionArgs(keyName, state);
        }
    }
}
