// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about the package being shipped by the customer to the Microsoft data center.
 * 
 */
public final class PackageInformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageInformationArgs Empty = new PackageInformationArgs();

    /**
     * The name of the carrier that is used to ship the import or export drives.
     * 
     */
    @Import(name="carrierName", required=true)
      private final Output<String> carrierName;

    public Output<String> getCarrierName() {
        return this.carrierName;
    }

    /**
     * The number of drives included in the package.
     * 
     */
    @Import(name="driveCount", required=true)
      private final Output<Double> driveCount;

    public Output<Double> getDriveCount() {
        return this.driveCount;
    }

    /**
     * The date when the package is shipped.
     * 
     */
    @Import(name="shipDate", required=true)
      private final Output<String> shipDate;

    public Output<String> getShipDate() {
        return this.shipDate;
    }

    /**
     * The tracking number of the package.
     * 
     */
    @Import(name="trackingNumber", required=true)
      private final Output<String> trackingNumber;

    public Output<String> getTrackingNumber() {
        return this.trackingNumber;
    }

    public PackageInformationArgs(
        Output<String> carrierName,
        Output<Double> driveCount,
        Output<String> shipDate,
        Output<String> trackingNumber) {
        this.carrierName = Objects.requireNonNull(carrierName, "expected parameter 'carrierName' to be non-null");
        this.driveCount = Objects.requireNonNull(driveCount, "expected parameter 'driveCount' to be non-null");
        this.shipDate = Objects.requireNonNull(shipDate, "expected parameter 'shipDate' to be non-null");
        this.trackingNumber = Objects.requireNonNull(trackingNumber, "expected parameter 'trackingNumber' to be non-null");
    }

    private PackageInformationArgs() {
        this.carrierName = Output.empty();
        this.driveCount = Output.empty();
        this.shipDate = Output.empty();
        this.trackingNumber = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> carrierName;
        private Output<Double> driveCount;
        private Output<String> shipDate;
        private Output<String> trackingNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageInformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierName = defaults.carrierName;
    	      this.driveCount = defaults.driveCount;
    	      this.shipDate = defaults.shipDate;
    	      this.trackingNumber = defaults.trackingNumber;
        }

        public Builder carrierName(Output<String> carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }
        public Builder carrierName(String carrierName) {
            this.carrierName = Output.of(Objects.requireNonNull(carrierName));
            return this;
        }
        public Builder driveCount(Output<Double> driveCount) {
            this.driveCount = Objects.requireNonNull(driveCount);
            return this;
        }
        public Builder driveCount(Double driveCount) {
            this.driveCount = Output.of(Objects.requireNonNull(driveCount));
            return this;
        }
        public Builder shipDate(Output<String> shipDate) {
            this.shipDate = Objects.requireNonNull(shipDate);
            return this;
        }
        public Builder shipDate(String shipDate) {
            this.shipDate = Output.of(Objects.requireNonNull(shipDate));
            return this;
        }
        public Builder trackingNumber(Output<String> trackingNumber) {
            this.trackingNumber = Objects.requireNonNull(trackingNumber);
            return this;
        }
        public Builder trackingNumber(String trackingNumber) {
            this.trackingNumber = Output.of(Objects.requireNonNull(trackingNumber));
            return this;
        }        public PackageInformationArgs build() {
            return new PackageInformationArgs(carrierName, driveCount, shipDate, trackingNumber);
        }
    }
}
