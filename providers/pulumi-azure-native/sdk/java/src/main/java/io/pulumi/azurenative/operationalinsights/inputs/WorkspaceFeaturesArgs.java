// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Workspace features.
 * 
 */
public final class WorkspaceFeaturesArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceFeaturesArgs Empty = new WorkspaceFeaturesArgs();

    /**
     * Dedicated LA cluster resourceId that is linked to the workspaces.
     * 
     */
    @Import(name="clusterResourceId")
      private final @Nullable Output<String> clusterResourceId;

    public Output<String> getClusterResourceId() {
        return this.clusterResourceId == null ? Output.empty() : this.clusterResourceId;
    }

    /**
     * Disable Non-AAD based Auth.
     * 
     */
    @Import(name="disableLocalAuth")
      private final @Nullable Output<Boolean> disableLocalAuth;

    public Output<Boolean> getDisableLocalAuth() {
        return this.disableLocalAuth == null ? Output.empty() : this.disableLocalAuth;
    }

    /**
     * Flag that indicate if data should be exported.
     * 
     */
    @Import(name="enableDataExport")
      private final @Nullable Output<Boolean> enableDataExport;

    public Output<Boolean> getEnableDataExport() {
        return this.enableDataExport == null ? Output.empty() : this.enableDataExport;
    }

    /**
     * Flag that indicate which permission to use - resource or workspace or both.
     * 
     */
    @Import(name="enableLogAccessUsingOnlyResourcePermissions")
      private final @Nullable Output<Boolean> enableLogAccessUsingOnlyResourcePermissions;

    public Output<Boolean> getEnableLogAccessUsingOnlyResourcePermissions() {
        return this.enableLogAccessUsingOnlyResourcePermissions == null ? Output.empty() : this.enableLogAccessUsingOnlyResourcePermissions;
    }

    /**
     * Flag that describes if we want to remove the data after 30 days.
     * 
     */
    @Import(name="immediatePurgeDataOn30Days")
      private final @Nullable Output<Boolean> immediatePurgeDataOn30Days;

    public Output<Boolean> getImmediatePurgeDataOn30Days() {
        return this.immediatePurgeDataOn30Days == null ? Output.empty() : this.immediatePurgeDataOn30Days;
    }

    public WorkspaceFeaturesArgs(
        @Nullable Output<String> clusterResourceId,
        @Nullable Output<Boolean> disableLocalAuth,
        @Nullable Output<Boolean> enableDataExport,
        @Nullable Output<Boolean> enableLogAccessUsingOnlyResourcePermissions,
        @Nullable Output<Boolean> immediatePurgeDataOn30Days) {
        this.clusterResourceId = clusterResourceId;
        this.disableLocalAuth = disableLocalAuth;
        this.enableDataExport = enableDataExport;
        this.enableLogAccessUsingOnlyResourcePermissions = enableLogAccessUsingOnlyResourcePermissions;
        this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
    }

    private WorkspaceFeaturesArgs() {
        this.clusterResourceId = Output.empty();
        this.disableLocalAuth = Output.empty();
        this.enableDataExport = Output.empty();
        this.enableLogAccessUsingOnlyResourcePermissions = Output.empty();
        this.immediatePurgeDataOn30Days = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceFeaturesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterResourceId;
        private @Nullable Output<Boolean> disableLocalAuth;
        private @Nullable Output<Boolean> enableDataExport;
        private @Nullable Output<Boolean> enableLogAccessUsingOnlyResourcePermissions;
        private @Nullable Output<Boolean> immediatePurgeDataOn30Days;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceFeaturesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterResourceId = defaults.clusterResourceId;
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.enableDataExport = defaults.enableDataExport;
    	      this.enableLogAccessUsingOnlyResourcePermissions = defaults.enableLogAccessUsingOnlyResourcePermissions;
    	      this.immediatePurgeDataOn30Days = defaults.immediatePurgeDataOn30Days;
        }

        public Builder clusterResourceId(@Nullable Output<String> clusterResourceId) {
            this.clusterResourceId = clusterResourceId;
            return this;
        }
        public Builder clusterResourceId(@Nullable String clusterResourceId) {
            this.clusterResourceId = Output.ofNullable(clusterResourceId);
            return this;
        }
        public Builder disableLocalAuth(@Nullable Output<Boolean> disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }
        public Builder disableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = Output.ofNullable(disableLocalAuth);
            return this;
        }
        public Builder enableDataExport(@Nullable Output<Boolean> enableDataExport) {
            this.enableDataExport = enableDataExport;
            return this;
        }
        public Builder enableDataExport(@Nullable Boolean enableDataExport) {
            this.enableDataExport = Output.ofNullable(enableDataExport);
            return this;
        }
        public Builder enableLogAccessUsingOnlyResourcePermissions(@Nullable Output<Boolean> enableLogAccessUsingOnlyResourcePermissions) {
            this.enableLogAccessUsingOnlyResourcePermissions = enableLogAccessUsingOnlyResourcePermissions;
            return this;
        }
        public Builder enableLogAccessUsingOnlyResourcePermissions(@Nullable Boolean enableLogAccessUsingOnlyResourcePermissions) {
            this.enableLogAccessUsingOnlyResourcePermissions = Output.ofNullable(enableLogAccessUsingOnlyResourcePermissions);
            return this;
        }
        public Builder immediatePurgeDataOn30Days(@Nullable Output<Boolean> immediatePurgeDataOn30Days) {
            this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
            return this;
        }
        public Builder immediatePurgeDataOn30Days(@Nullable Boolean immediatePurgeDataOn30Days) {
            this.immediatePurgeDataOn30Days = Output.ofNullable(immediatePurgeDataOn30Days);
            return this;
        }        public WorkspaceFeaturesArgs build() {
            return new WorkspaceFeaturesArgs(clusterResourceId, disableLocalAuth, enableDataExport, enableLogAccessUsingOnlyResourcePermissions, immediatePurgeDataOn30Days);
        }
    }
}
