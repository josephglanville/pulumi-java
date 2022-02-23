// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledSynchronizationSettingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScheduledSynchronizationSettingArgs Empty = new GetScheduledSynchronizationSettingArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share.
     * 
     */
    @InputImport(name="shareName", required=true)
      private final String shareName;

    public String getShareName() {
        return this.shareName;
    }

    /**
     * The name of the synchronizationSetting.
     * 
     */
    @InputImport(name="synchronizationSettingName", required=true)
      private final String synchronizationSettingName;

    public String getSynchronizationSettingName() {
        return this.synchronizationSettingName;
    }

    public GetScheduledSynchronizationSettingArgs(
        String accountName,
        String resourceGroupName,
        String shareName,
        String synchronizationSettingName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.synchronizationSettingName = Objects.requireNonNull(synchronizationSettingName, "expected parameter 'synchronizationSettingName' to be non-null");
    }

    private GetScheduledSynchronizationSettingArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.shareName = null;
        this.synchronizationSettingName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledSynchronizationSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;
        private String shareName;
        private String synchronizationSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledSynchronizationSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
    	      this.synchronizationSettingName = defaults.synchronizationSettingName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setShareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public Builder setSynchronizationSettingName(String synchronizationSettingName) {
            this.synchronizationSettingName = Objects.requireNonNull(synchronizationSettingName);
            return this;
        }
        public GetScheduledSynchronizationSettingArgs build() {
            return new GetScheduledSynchronizationSettingArgs(accountName, resourceGroupName, shareName, synchronizationSettingName);
        }
    }
}
