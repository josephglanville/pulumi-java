// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataDiskStorageTypeInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataDiskStorageTypeInfoResponse Empty = new DataDiskStorageTypeInfoResponse();

    @InputImport(name="lun")
    private final @Nullable String lun;

    public Optional<String> getLun() {
        return this.lun == null ? Optional.empty() : Optional.ofNullable(this.lun);
    }

    @InputImport(name="storageType")
    private final @Nullable String storageType;

    public Optional<String> getStorageType() {
        return this.storageType == null ? Optional.empty() : Optional.ofNullable(this.storageType);
    }

    public DataDiskStorageTypeInfoResponse(
        @Nullable String lun,
        @Nullable String storageType) {
        this.lun = lun;
        this.storageType = storageType;
    }

    private DataDiskStorageTypeInfoResponse() {
        this.lun = null;
        this.storageType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskStorageTypeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lun;
        private @Nullable String storageType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskStorageTypeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lun = defaults.lun;
    	      this.storageType = defaults.storageType;
        }

        public Builder setLun(@Nullable String lun) {
            this.lun = lun;
            return this;
        }

        public Builder setStorageType(@Nullable String storageType) {
            this.storageType = storageType;
            return this;
        }

        public DataDiskStorageTypeInfoResponse build() {
            return new DataDiskStorageTypeInfoResponse(lun, storageType);
        }
    }
}
