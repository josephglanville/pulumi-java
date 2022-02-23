// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information about the delivery package being shipped by the customer to the Microsoft data center.
 * 
 */
public final class DeliveryPackageInformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryPackageInformationArgs Empty = new DeliveryPackageInformationArgs();

    /**
     * The name of the carrier that is used to ship the import or export drives.
     * 
     */
    @InputImport(name="carrierName", required=true)
      private final Input<String> carrierName;

    public Input<String> getCarrierName() {
        return this.carrierName;
    }

    /**
     * The number of drives included in the package.
     * 
     */
    @InputImport(name="driveCount")
      private final @Nullable Input<Double> driveCount;

    public Input<Double> getDriveCount() {
        return this.driveCount == null ? Input.empty() : this.driveCount;
    }

    /**
     * The date when the package is shipped.
     * 
     */
    @InputImport(name="shipDate")
      private final @Nullable Input<String> shipDate;

    public Input<String> getShipDate() {
        return this.shipDate == null ? Input.empty() : this.shipDate;
    }

    /**
     * The tracking number of the package.
     * 
     */
    @InputImport(name="trackingNumber", required=true)
      private final Input<String> trackingNumber;

    public Input<String> getTrackingNumber() {
        return this.trackingNumber;
    }

    public DeliveryPackageInformationArgs(
        Input<String> carrierName,
        @Nullable Input<Double> driveCount,
        @Nullable Input<String> shipDate,
        Input<String> trackingNumber) {
        this.carrierName = Objects.requireNonNull(carrierName, "expected parameter 'carrierName' to be non-null");
        this.driveCount = driveCount;
        this.shipDate = shipDate;
        this.trackingNumber = Objects.requireNonNull(trackingNumber, "expected parameter 'trackingNumber' to be non-null");
    }

    private DeliveryPackageInformationArgs() {
        this.carrierName = Input.empty();
        this.driveCount = Input.empty();
        this.shipDate = Input.empty();
        this.trackingNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPackageInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> carrierName;
        private @Nullable Input<Double> driveCount;
        private @Nullable Input<String> shipDate;
        private Input<String> trackingNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryPackageInformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierName = defaults.carrierName;
    	      this.driveCount = defaults.driveCount;
    	      this.shipDate = defaults.shipDate;
    	      this.trackingNumber = defaults.trackingNumber;
        }

        public Builder setCarrierName(Input<String> carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }

        public Builder setCarrierName(String carrierName) {
            this.carrierName = Input.of(Objects.requireNonNull(carrierName));
            return this;
        }

        public Builder setDriveCount(@Nullable Input<Double> driveCount) {
            this.driveCount = driveCount;
            return this;
        }

        public Builder setDriveCount(@Nullable Double driveCount) {
            this.driveCount = Input.ofNullable(driveCount);
            return this;
        }

        public Builder setShipDate(@Nullable Input<String> shipDate) {
            this.shipDate = shipDate;
            return this;
        }

        public Builder setShipDate(@Nullable String shipDate) {
            this.shipDate = Input.ofNullable(shipDate);
            return this;
        }

        public Builder setTrackingNumber(Input<String> trackingNumber) {
            this.trackingNumber = Objects.requireNonNull(trackingNumber);
            return this;
        }

        public Builder setTrackingNumber(String trackingNumber) {
            this.trackingNumber = Input.of(Objects.requireNonNull(trackingNumber));
            return this;
        }
        public DeliveryPackageInformationArgs build() {
            return new DeliveryPackageInformationArgs(carrierName, driveCount, shipDate, trackingNumber);
        }
    }
}
