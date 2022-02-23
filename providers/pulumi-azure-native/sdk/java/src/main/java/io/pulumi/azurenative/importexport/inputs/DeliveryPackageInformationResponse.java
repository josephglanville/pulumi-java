// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about the delivery package being shipped by the customer to the Microsoft data center.
 * 
 */
public final class DeliveryPackageInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryPackageInformationResponse Empty = new DeliveryPackageInformationResponse();

    /**
     * The name of the carrier that is used to ship the import or export drives.
     * 
     */
    @InputImport(name="carrierName", required=true)
      private final String carrierName;

    public String getCarrierName() {
        return this.carrierName;
    }

    /**
     * The number of drives included in the package.
     * 
     */
    @InputImport(name="driveCount")
      private final @Nullable Double driveCount;

    public Optional<Double> getDriveCount() {
        return this.driveCount == null ? Optional.empty() : Optional.ofNullable(this.driveCount);
    }

    /**
     * The date when the package is shipped.
     * 
     */
    @InputImport(name="shipDate")
      private final @Nullable String shipDate;

    public Optional<String> getShipDate() {
        return this.shipDate == null ? Optional.empty() : Optional.ofNullable(this.shipDate);
    }

    /**
     * The tracking number of the package.
     * 
     */
    @InputImport(name="trackingNumber", required=true)
      private final String trackingNumber;

    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    public DeliveryPackageInformationResponse(
        String carrierName,
        @Nullable Double driveCount,
        @Nullable String shipDate,
        String trackingNumber) {
        this.carrierName = Objects.requireNonNull(carrierName, "expected parameter 'carrierName' to be non-null");
        this.driveCount = driveCount;
        this.shipDate = shipDate;
        this.trackingNumber = Objects.requireNonNull(trackingNumber, "expected parameter 'trackingNumber' to be non-null");
    }

    private DeliveryPackageInformationResponse() {
        this.carrierName = null;
        this.driveCount = null;
        this.shipDate = null;
        this.trackingNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPackageInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierName;
        private @Nullable Double driveCount;
        private @Nullable String shipDate;
        private String trackingNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryPackageInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierName = defaults.carrierName;
    	      this.driveCount = defaults.driveCount;
    	      this.shipDate = defaults.shipDate;
    	      this.trackingNumber = defaults.trackingNumber;
        }

        public Builder setCarrierName(String carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }

        public Builder setDriveCount(@Nullable Double driveCount) {
            this.driveCount = driveCount;
            return this;
        }

        public Builder setShipDate(@Nullable String shipDate) {
            this.shipDate = shipDate;
            return this;
        }

        public Builder setTrackingNumber(String trackingNumber) {
            this.trackingNumber = Objects.requireNonNull(trackingNumber);
            return this;
        }
        public DeliveryPackageInformationResponse build() {
            return new DeliveryPackageInformationResponse(carrierName, driveCount, shipDate, trackingNumber);
        }
    }
}
