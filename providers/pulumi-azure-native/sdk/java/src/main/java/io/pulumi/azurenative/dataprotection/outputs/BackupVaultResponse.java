// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.azurenative.dataprotection.outputs.StorageSettingResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BackupVaultResponse {
    private final String provisioningState;
    private final List<StorageSettingResponse> storageSettings;

    @OutputCustomType.Constructor({"provisioningState","storageSettings"})
    private BackupVaultResponse(
        String provisioningState,
        List<StorageSettingResponse> storageSettings) {
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.storageSettings = Objects.requireNonNull(storageSettings);
    }

    public String getProvisioningState() {
        return this.provisioningState;
    }
    public List<StorageSettingResponse> getStorageSettings() {
        return this.storageSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisioningState;
        private List<StorageSettingResponse> storageSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
    	      this.storageSettings = defaults.storageSettings;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStorageSettings(List<StorageSettingResponse> storageSettings) {
            this.storageSettings = Objects.requireNonNull(storageSettings);
            return this;
        }

        public BackupVaultResponse build() {
            return new BackupVaultResponse(provisioningState, storageSettings);
        }
    }
}
