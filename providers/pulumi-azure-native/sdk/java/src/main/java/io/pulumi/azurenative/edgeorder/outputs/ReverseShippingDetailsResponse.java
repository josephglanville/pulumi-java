// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReverseShippingDetailsResponse {
    private final String carrierDisplayName;
    private final String carrierName;
    private final String sasKeyForLabel;
    private final String trackingId;
    private final String trackingUrl;

    @OutputCustomType.Constructor({"carrierDisplayName","carrierName","sasKeyForLabel","trackingId","trackingUrl"})
    private ReverseShippingDetailsResponse(
        String carrierDisplayName,
        String carrierName,
        String sasKeyForLabel,
        String trackingId,
        String trackingUrl) {
        this.carrierDisplayName = Objects.requireNonNull(carrierDisplayName);
        this.carrierName = Objects.requireNonNull(carrierName);
        this.sasKeyForLabel = Objects.requireNonNull(sasKeyForLabel);
        this.trackingId = Objects.requireNonNull(trackingId);
        this.trackingUrl = Objects.requireNonNull(trackingUrl);
    }

    public String getCarrierDisplayName() {
        return this.carrierDisplayName;
    }
    public String getCarrierName() {
        return this.carrierName;
    }
    public String getSasKeyForLabel() {
        return this.sasKeyForLabel;
    }
    public String getTrackingId() {
        return this.trackingId;
    }
    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReverseShippingDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierDisplayName;
        private String carrierName;
        private String sasKeyForLabel;
        private String trackingId;
        private String trackingUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ReverseShippingDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierDisplayName = defaults.carrierDisplayName;
    	      this.carrierName = defaults.carrierName;
    	      this.sasKeyForLabel = defaults.sasKeyForLabel;
    	      this.trackingId = defaults.trackingId;
    	      this.trackingUrl = defaults.trackingUrl;
        }

        public Builder setCarrierDisplayName(String carrierDisplayName) {
            this.carrierDisplayName = Objects.requireNonNull(carrierDisplayName);
            return this;
        }

        public Builder setCarrierName(String carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }

        public Builder setSasKeyForLabel(String sasKeyForLabel) {
            this.sasKeyForLabel = Objects.requireNonNull(sasKeyForLabel);
            return this;
        }

        public Builder setTrackingId(String trackingId) {
            this.trackingId = Objects.requireNonNull(trackingId);
            return this;
        }

        public Builder setTrackingUrl(String trackingUrl) {
            this.trackingUrl = Objects.requireNonNull(trackingUrl);
            return this;
        }

        public ReverseShippingDetailsResponse build() {
            return new ReverseShippingDetailsResponse(carrierDisplayName, carrierName, sasKeyForLabel, trackingId, trackingUrl);
        }
    }
}
