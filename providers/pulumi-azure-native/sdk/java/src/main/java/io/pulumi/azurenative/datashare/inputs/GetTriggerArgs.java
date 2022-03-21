// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTriggerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTriggerArgs Empty = new GetTriggerArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the shareSubscription.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
      private final String shareSubscriptionName;

    public String getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="triggerName", required=true)
      private final String triggerName;

    public String getTriggerName() {
        return this.triggerName;
    }

    public GetTriggerArgs(
        String accountName,
        String resourceGroupName,
        String shareSubscriptionName,
        String triggerName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
        this.triggerName = Objects.requireNonNull(triggerName, "expected parameter 'triggerName' to be non-null");
    }

    private GetTriggerArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.shareSubscriptionName = null;
        this.triggerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerArgs defaults) {
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

        public Builder(GetTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
    	      this.triggerName = defaults.triggerName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder shareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }
        public Builder triggerName(String triggerName) {
            this.triggerName = Objects.requireNonNull(triggerName);
            return this;
        }        public GetTriggerArgs build() {
            return new GetTriggerArgs(accountName, resourceGroupName, shareSubscriptionName, triggerName);
        }
    }
}
