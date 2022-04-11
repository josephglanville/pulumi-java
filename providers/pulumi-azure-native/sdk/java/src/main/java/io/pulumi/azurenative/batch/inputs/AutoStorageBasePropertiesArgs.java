// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The properties related to the auto-storage account.
 * 
 */
public final class AutoStorageBasePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoStorageBasePropertiesArgs Empty = new AutoStorageBasePropertiesArgs();

    /**
     * The resource ID of the storage account to be used for auto-storage account.
     * 
     */
    @Import(name="storageAccountId", required=true)
      private final Output<String> storageAccountId;

    public Output<String> getStorageAccountId() {
        return this.storageAccountId;
    }

    public AutoStorageBasePropertiesArgs(Output<String> storageAccountId) {
        this.storageAccountId = Objects.requireNonNull(storageAccountId, "expected parameter 'storageAccountId' to be non-null");
    }

    private AutoStorageBasePropertiesArgs() {
        this.storageAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoStorageBasePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoStorageBasePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder storageAccountId(Output<String> storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }
        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Output.of(Objects.requireNonNull(storageAccountId));
            return this;
        }        public AutoStorageBasePropertiesArgs build() {
            return new AutoStorageBasePropertiesArgs(storageAccountId);
        }
    }
}
