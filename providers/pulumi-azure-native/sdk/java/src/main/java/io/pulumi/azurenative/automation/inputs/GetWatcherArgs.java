// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWatcherArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWatcherArgs Empty = new GetWatcherArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
      private final String automationAccountName;

    public String getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The watcher name.
     * 
     */
    @Import(name="watcherName", required=true)
      private final String watcherName;

    public String getWatcherName() {
        return this.watcherName;
    }

    public GetWatcherArgs(
        String automationAccountName,
        String resourceGroupName,
        String watcherName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.watcherName = Objects.requireNonNull(watcherName, "expected parameter 'watcherName' to be non-null");
    }

    private GetWatcherArgs() {
        this.automationAccountName = null;
        this.resourceGroupName = null;
        this.watcherName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String resourceGroupName;
        private String watcherName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.watcherName = defaults.watcherName;
        }

        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder watcherName(String watcherName) {
            this.watcherName = Objects.requireNonNull(watcherName);
            return this;
        }        public GetWatcherArgs build() {
            return new GetWatcherArgs(automationAccountName, resourceGroupName, watcherName);
        }
    }
}
