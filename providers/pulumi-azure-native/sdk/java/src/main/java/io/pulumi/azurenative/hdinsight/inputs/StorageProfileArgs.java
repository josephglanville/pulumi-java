// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.StorageAccountArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The storage profile.
 * 
 */
public final class StorageProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageProfileArgs Empty = new StorageProfileArgs();

    /**
     * The list of storage accounts in the cluster.
     * 
     */
    @Import(name="storageaccounts")
      private final @Nullable Output<List<StorageAccountArgs>> storageaccounts;

    public Output<List<StorageAccountArgs>> getStorageaccounts() {
        return this.storageaccounts == null ? Codegen.empty() : this.storageaccounts;
    }

    public StorageProfileArgs(@Nullable Output<List<StorageAccountArgs>> storageaccounts) {
        this.storageaccounts = storageaccounts;
    }

    private StorageProfileArgs() {
        this.storageaccounts = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<StorageAccountArgs>> storageaccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageaccounts = defaults.storageaccounts;
        }

        public Builder storageaccounts(@Nullable Output<List<StorageAccountArgs>> storageaccounts) {
            this.storageaccounts = storageaccounts;
            return this;
        }
        public Builder storageaccounts(@Nullable List<StorageAccountArgs> storageaccounts) {
            this.storageaccounts = Codegen.ofNullable(storageaccounts);
            return this;
        }
        public Builder storageaccounts(StorageAccountArgs... storageaccounts) {
            return storageaccounts(List.of(storageaccounts));
        }        public StorageProfileArgs build() {
            return new StorageProfileArgs(storageaccounts);
        }
    }
}
