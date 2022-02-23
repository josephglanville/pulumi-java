// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.datashare.enums.TriggerKind;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Kind of synchronization on trigger.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<Either<String,TriggerKind>> kind;

    public Input<Either<String,TriggerKind>> getKind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share subscription which will hold the data set sink.
     * 
     */
    @InputImport(name="shareSubscriptionName", required=true)
      private final Input<String> shareSubscriptionName;

    public Input<String> getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * The name of the trigger.
     * 
     */
    @InputImport(name="triggerName")
      private final @Nullable Input<String> triggerName;

    public Input<String> getTriggerName() {
        return this.triggerName == null ? Input.empty() : this.triggerName;
    }

    public TriggerArgs(
        Input<String> accountName,
        Input<Either<String,TriggerKind>> kind,
        Input<String> resourceGroupName,
        Input<String> shareSubscriptionName,
        @Nullable Input<String> triggerName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
        this.triggerName = triggerName;
    }

    private TriggerArgs() {
        this.accountName = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shareSubscriptionName = Input.empty();
        this.triggerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private Input<Either<String,TriggerKind>> kind;
        private Input<String> resourceGroupName;
        private Input<String> shareSubscriptionName;
        private @Nullable Input<String> triggerName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
    	      this.triggerName = defaults.triggerName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setKind(Input<Either<String,TriggerKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,TriggerKind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setShareSubscriptionName(Input<String> shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }

        public Builder setShareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Input.of(Objects.requireNonNull(shareSubscriptionName));
            return this;
        }

        public Builder setTriggerName(@Nullable Input<String> triggerName) {
            this.triggerName = triggerName;
            return this;
        }

        public Builder setTriggerName(@Nullable String triggerName) {
            this.triggerName = Input.ofNullable(triggerName);
            return this;
        }
        public TriggerArgs build() {
            return new TriggerArgs(accountName, kind, resourceGroupName, shareSubscriptionName, triggerName);
        }
    }
}
