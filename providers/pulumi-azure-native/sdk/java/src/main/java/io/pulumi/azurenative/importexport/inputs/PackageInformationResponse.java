// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about the package being shipped by the customer to the Microsoft data center.
 * 
 */
public final class PackageInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final PackageInformationResponse Empty = new PackageInformationResponse();

    /**
     * The name of the carrier that is used to ship the import or export drives.
     * 
     */
    @Import(name="carrierName", required=true)
      private final String carrierName;

    public String getCarrierName() {
        return this.carrierName;
    }

    /**
     * The number of drives included in the package.
     * 
     */
    @Import(name="driveCount", required=true)
      private final Double driveCount;

    public Double getDriveCount() {
        return this.driveCount;
    }

    /**
     * The date when the package is shipped.
     * 
     */
    @Import(name="shipDate", required=true)
      private final String shipDate;

    public String getShipDate() {
        return this.shipDate;
    }

    /**
     * The tracking number of the package.
     * 
     */
    @Import(name="trackingNumber", required=true)
      private final String trackingNumber;

    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    public PackageInformationResponse(
        String carrierName,
        Double driveCount,
        String shipDate,
        String trackingNumber) {
        this.carrierName = Objects.requireNonNull(carrierName, "expected parameter 'carrierName' to be non-null");
        this.driveCount = Objects.requireNonNull(driveCount, "expected parameter 'driveCount' to be non-null");
        this.shipDate = Objects.requireNonNull(shipDate, "expected parameter 'shipDate' to be non-null");
        this.trackingNumber = Objects.requireNonNull(trackingNumber, "expected parameter 'trackingNumber' to be non-null");
    }

    private PackageInformationResponse() {
        this.carrierName = null;
        this.driveCount = null;
        this.shipDate = null;
        this.trackingNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierName;
        private Double driveCount;
        private String shipDate;
        private String trackingNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierName = defaults.carrierName;
    	      this.driveCount = defaults.driveCount;
    	      this.shipDate = defaults.shipDate;
    	      this.trackingNumber = defaults.trackingNumber;
        }

        public Builder carrierName(String carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }
        public Builder driveCount(Double driveCount) {
            this.driveCount = Objects.requireNonNull(driveCount);
            return this;
        }
        public Builder shipDate(String shipDate) {
            this.shipDate = Objects.requireNonNull(shipDate);
            return this;
        }
        public Builder trackingNumber(String trackingNumber) {
            this.trackingNumber = Objects.requireNonNull(trackingNumber);
            return this;
        }        public PackageInformationResponse build() {
            return new PackageInformationResponse(carrierName, driveCount, shipDate, trackingNumber);
        }
    }
}
