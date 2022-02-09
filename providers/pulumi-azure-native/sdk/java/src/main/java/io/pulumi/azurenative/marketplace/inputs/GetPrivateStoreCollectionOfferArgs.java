// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateStoreCollectionOfferArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateStoreCollectionOfferArgs Empty = new GetPrivateStoreCollectionOfferArgs();

    @InputImport(name="collectionId", required=true)
    private final String collectionId;

    public String getCollectionId() {
        return this.collectionId;
    }

    @InputImport(name="offerId", required=true)
    private final String offerId;

    public String getOfferId() {
        return this.offerId;
    }

    @InputImport(name="privateStoreId", required=true)
    private final String privateStoreId;

    public String getPrivateStoreId() {
        return this.privateStoreId;
    }

    public GetPrivateStoreCollectionOfferArgs(
        String collectionId,
        String offerId,
        String privateStoreId) {
        this.collectionId = Objects.requireNonNull(collectionId, "expected parameter 'collectionId' to be non-null");
        this.offerId = Objects.requireNonNull(offerId, "expected parameter 'offerId' to be non-null");
        this.privateStoreId = Objects.requireNonNull(privateStoreId, "expected parameter 'privateStoreId' to be non-null");
    }

    private GetPrivateStoreCollectionOfferArgs() {
        this.collectionId = null;
        this.offerId = null;
        this.privateStoreId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateStoreCollectionOfferArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String collectionId;
        private String offerId;
        private String privateStoreId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateStoreCollectionOfferArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionId = defaults.collectionId;
    	      this.offerId = defaults.offerId;
    	      this.privateStoreId = defaults.privateStoreId;
        }

        public Builder setCollectionId(String collectionId) {
            this.collectionId = Objects.requireNonNull(collectionId);
            return this;
        }

        public Builder setOfferId(String offerId) {
            this.offerId = Objects.requireNonNull(offerId);
            return this;
        }

        public Builder setPrivateStoreId(String privateStoreId) {
            this.privateStoreId = Objects.requireNonNull(privateStoreId);
            return this;
        }

        public GetPrivateStoreCollectionOfferArgs build() {
            return new GetPrivateStoreCollectionOfferArgs(collectionId, offerId, privateStoreId);
        }
    }
}
