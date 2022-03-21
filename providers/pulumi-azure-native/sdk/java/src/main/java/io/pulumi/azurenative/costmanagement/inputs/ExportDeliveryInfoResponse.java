// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ExportDeliveryDestinationResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The delivery information associated with a export.
 * 
 */
public final class ExportDeliveryInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExportDeliveryInfoResponse Empty = new ExportDeliveryInfoResponse();

    /**
     * Has destination for the export being delivered.
     * 
     */
    @Import(name="destination", required=true)
      private final ExportDeliveryDestinationResponse destination;

    public ExportDeliveryDestinationResponse getDestination() {
        return this.destination;
    }

    public ExportDeliveryInfoResponse(ExportDeliveryDestinationResponse destination) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
    }

    private ExportDeliveryInfoResponse() {
        this.destination = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDeliveryInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExportDeliveryDestinationResponse destination;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDeliveryInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder destination(ExportDeliveryDestinationResponse destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }        public ExportDeliveryInfoResponse build() {
            return new ExportDeliveryInfoResponse(destination);
        }
    }
}
