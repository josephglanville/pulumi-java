// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledTriggerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScheduledTriggerArgs Empty = new GetScheduledTriggerArgs();

    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="shareSubscriptionName", required=true)
    private final String shareSubscriptionName;

    public String getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    @InputImport(name="triggerName", required=true)
    private final String triggerName;

    public String getTriggerName() {
        return this.triggerName;
    }

    public GetScheduledTriggerArgs(
        String accountName,
        String resourceGroupName,
        String shareSubscriptionName,
        String triggerName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
        this.triggerName = Objects.requireNonNull(triggerName, "expected parameter 'triggerName' to be non-null");
    }

    private GetScheduledTriggerArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.shareSubscriptionName = null;
        this.triggerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;
        private String shareSubscriptionName;
        private String triggerName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
    	      this.triggerName = defaults.triggerName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setShareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }

        public Builder setTriggerName(String triggerName) {
            this.triggerName = Objects.requireNonNull(triggerName);
            return this;
        }

        public GetScheduledTriggerArgs build() {
            return new GetScheduledTriggerArgs(accountName, resourceGroupName, shareSubscriptionName, triggerName);
        }
    }
}
