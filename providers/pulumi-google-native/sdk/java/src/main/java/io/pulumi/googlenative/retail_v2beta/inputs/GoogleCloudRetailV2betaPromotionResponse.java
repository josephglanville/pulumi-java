// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Promotion information.
 * 
 */
public final class GoogleCloudRetailV2betaPromotionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2betaPromotionResponse Empty = new GoogleCloudRetailV2betaPromotionResponse();

    /**
     * ID of the promotion. For example, "free gift". The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [promotion](https://support.google.com/merchants/answer/7050148).
     * 
     */
    @Import(name="promotionId", required=true)
      private final String promotionId;

    public String getPromotionId() {
        return this.promotionId;
    }

    public GoogleCloudRetailV2betaPromotionResponse(String promotionId) {
        this.promotionId = Objects.requireNonNull(promotionId, "expected parameter 'promotionId' to be non-null");
    }

    private GoogleCloudRetailV2betaPromotionResponse() {
        this.promotionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaPromotionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String promotionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaPromotionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.promotionId = defaults.promotionId;
        }

        public Builder promotionId(String promotionId) {
            this.promotionId = Objects.requireNonNull(promotionId);
            return this;
        }        public GoogleCloudRetailV2betaPromotionResponse build() {
            return new GoogleCloudRetailV2betaPromotionResponse(promotionId);
        }
    }
}
