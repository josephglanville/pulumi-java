// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AutoStoragePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoStoragePropertiesResponse Empty = new AutoStoragePropertiesResponse();

    @InputImport(name="lastKeySync", required=true)
    private final String lastKeySync;

    public String getLastKeySync() {
        return this.lastKeySync;
    }

    @InputImport(name="storageAccountId", required=true)
    private final String storageAccountId;

    public String getStorageAccountId() {
        return this.storageAccountId;
    }

    public AutoStoragePropertiesResponse(
        String lastKeySync,
        String storageAccountId) {
        this.lastKeySync = Objects.requireNonNull(lastKeySync, "expected parameter 'lastKeySync' to be non-null");
        this.storageAccountId = Objects.requireNonNull(storageAccountId, "expected parameter 'storageAccountId' to be non-null");
    }

    private AutoStoragePropertiesResponse() {
        this.lastKeySync = null;
        this.storageAccountId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoStoragePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastKeySync;
        private String storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoStoragePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastKeySync = defaults.lastKeySync;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder setLastKeySync(String lastKeySync) {
            this.lastKeySync = Objects.requireNonNull(lastKeySync);
            return this;
        }

        public Builder setStorageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }

        public AutoStoragePropertiesResponse build() {
            return new AutoStoragePropertiesResponse(lastKeySync, storageAccountId);
        }
    }
}