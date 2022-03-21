// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Shipping details.
 * 
 */
public final class PackageShippingDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final PackageShippingDetailsResponse Empty = new PackageShippingDetailsResponse();

    /**
     * Name of the carrier.
     * 
     */
    @Import(name="carrierName", required=true)
      private final String carrierName;

    public String getCarrierName() {
        return this.carrierName;
    }

    /**
     * Tracking Id of shipment.
     * 
     */
    @Import(name="trackingId", required=true)
      private final String trackingId;

    public String getTrackingId() {
        return this.trackingId;
    }

    /**
     * Url where shipment can be tracked.
     * 
     */
    @Import(name="trackingUrl", required=true)
      private final String trackingUrl;

    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public PackageShippingDetailsResponse(
        String carrierName,
        String trackingId,
        String trackingUrl) {
        this.carrierName = Objects.requireNonNull(carrierName, "expected parameter 'carrierName' to be non-null");
        this.trackingId = Objects.requireNonNull(trackingId, "expected parameter 'trackingId' to be non-null");
        this.trackingUrl = Objects.requireNonNull(trackingUrl, "expected parameter 'trackingUrl' to be non-null");
    }

    private PackageShippingDetailsResponse() {
        this.carrierName = null;
        this.trackingId = null;
        this.trackingUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageShippingDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierName;
        private String trackingId;
        private String trackingUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageShippingDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierName = defaults.carrierName;
    	      this.trackingId = defaults.trackingId;
    	      this.trackingUrl = defaults.trackingUrl;
        }

        public Builder carrierName(String carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }
        public Builder trackingId(String trackingId) {
            this.trackingId = Objects.requireNonNull(trackingId);
            return this;
        }
        public Builder trackingUrl(String trackingUrl) {
            this.trackingUrl = Objects.requireNonNull(trackingUrl);
            return this;
        }        public PackageShippingDetailsResponse build() {
            return new PackageShippingDetailsResponse(carrierName, trackingId, trackingUrl);
        }
    }
}
