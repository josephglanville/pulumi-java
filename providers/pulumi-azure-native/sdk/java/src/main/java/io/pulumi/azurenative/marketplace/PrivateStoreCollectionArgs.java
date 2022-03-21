// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateStoreCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateStoreCollectionArgs Empty = new PrivateStoreCollectionArgs();

    /**
     * Indicating whether all subscriptions are selected (=true) or not (=false).
     * 
     */
    @Import(name="allSubscriptions")
      private final @Nullable Output<Boolean> allSubscriptions;

    public Output<Boolean> getAllSubscriptions() {
        return this.allSubscriptions == null ? Output.empty() : this.allSubscriptions;
    }

    /**
     * Gets or sets the association with Commercial's Billing Account.
     * 
     */
    @Import(name="claim")
      private final @Nullable Output<String> claim;

    public Output<String> getClaim() {
        return this.claim == null ? Output.empty() : this.claim;
    }

    /**
     * The collection ID
     * 
     */
    @Import(name="collectionId")
      private final @Nullable Output<String> collectionId;

    public Output<String> getCollectionId() {
        return this.collectionId == null ? Output.empty() : this.collectionId;
    }

    /**
     * Gets or sets collection name.
     * 
     */
    @Import(name="collectionName")
      private final @Nullable Output<String> collectionName;

    public Output<String> getCollectionName() {
        return this.collectionName == null ? Output.empty() : this.collectionName;
    }

    /**
     * Indicating whether the collection is enabled or disabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The store ID - must use the tenant ID
     * 
     */
    @Import(name="privateStoreId", required=true)
      private final Output<String> privateStoreId;

    public Output<String> getPrivateStoreId() {
        return this.privateStoreId;
    }

    /**
     * Gets or sets subscription ids list. Empty list indicates all subscriptions are selected, null indicates no update is done, explicit list indicates the explicit selected subscriptions. On insert, null is considered as bad request
     * 
     */
    @Import(name="subscriptionsList")
      private final @Nullable Output<List<String>> subscriptionsList;

    public Output<List<String>> getSubscriptionsList() {
        return this.subscriptionsList == null ? Output.empty() : this.subscriptionsList;
    }

    public PrivateStoreCollectionArgs(
        @Nullable Output<Boolean> allSubscriptions,
        @Nullable Output<String> claim,
        @Nullable Output<String> collectionId,
        @Nullable Output<String> collectionName,
        @Nullable Output<Boolean> enabled,
        Output<String> privateStoreId,
        @Nullable Output<List<String>> subscriptionsList) {
        this.allSubscriptions = allSubscriptions;
        this.claim = claim;
        this.collectionId = collectionId;
        this.collectionName = collectionName;
        this.enabled = enabled;
        this.privateStoreId = Objects.requireNonNull(privateStoreId, "expected parameter 'privateStoreId' to be non-null");
        this.subscriptionsList = subscriptionsList;
    }

    private PrivateStoreCollectionArgs() {
        this.allSubscriptions = Output.empty();
        this.claim = Output.empty();
        this.collectionId = Output.empty();
        this.collectionName = Output.empty();
        this.enabled = Output.empty();
        this.privateStoreId = Output.empty();
        this.subscriptionsList = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateStoreCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allSubscriptions;
        private @Nullable Output<String> claim;
        private @Nullable Output<String> collectionId;
        private @Nullable Output<String> collectionName;
        private @Nullable Output<Boolean> enabled;
        private Output<String> privateStoreId;
        private @Nullable Output<List<String>> subscriptionsList;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateStoreCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allSubscriptions = defaults.allSubscriptions;
    	      this.claim = defaults.claim;
    	      this.collectionId = defaults.collectionId;
    	      this.collectionName = defaults.collectionName;
    	      this.enabled = defaults.enabled;
    	      this.privateStoreId = defaults.privateStoreId;
    	      this.subscriptionsList = defaults.subscriptionsList;
        }

        public Builder allSubscriptions(@Nullable Output<Boolean> allSubscriptions) {
            this.allSubscriptions = allSubscriptions;
            return this;
        }
        public Builder allSubscriptions(@Nullable Boolean allSubscriptions) {
            this.allSubscriptions = Output.ofNullable(allSubscriptions);
            return this;
        }
        public Builder claim(@Nullable Output<String> claim) {
            this.claim = claim;
            return this;
        }
        public Builder claim(@Nullable String claim) {
            this.claim = Output.ofNullable(claim);
            return this;
        }
        public Builder collectionId(@Nullable Output<String> collectionId) {
            this.collectionId = collectionId;
            return this;
        }
        public Builder collectionId(@Nullable String collectionId) {
            this.collectionId = Output.ofNullable(collectionId);
            return this;
        }
        public Builder collectionName(@Nullable Output<String> collectionName) {
            this.collectionName = collectionName;
            return this;
        }
        public Builder collectionName(@Nullable String collectionName) {
            this.collectionName = Output.ofNullable(collectionName);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder privateStoreId(Output<String> privateStoreId) {
            this.privateStoreId = Objects.requireNonNull(privateStoreId);
            return this;
        }
        public Builder privateStoreId(String privateStoreId) {
            this.privateStoreId = Output.of(Objects.requireNonNull(privateStoreId));
            return this;
        }
        public Builder subscriptionsList(@Nullable Output<List<String>> subscriptionsList) {
            this.subscriptionsList = subscriptionsList;
            return this;
        }
        public Builder subscriptionsList(@Nullable List<String> subscriptionsList) {
            this.subscriptionsList = Output.ofNullable(subscriptionsList);
            return this;
        }
        public Builder subscriptionsList(String... subscriptionsList) {
            return subscriptionsList(List.of(subscriptionsList));
        }        public PrivateStoreCollectionArgs build() {
            return new PrivateStoreCollectionArgs(allSubscriptions, claim, collectionId, collectionName, enabled, privateStoreId, subscriptionsList);
        }
    }
}
