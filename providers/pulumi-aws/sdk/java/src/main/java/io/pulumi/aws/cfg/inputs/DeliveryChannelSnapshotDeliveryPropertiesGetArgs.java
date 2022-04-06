// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryChannelSnapshotDeliveryPropertiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryChannelSnapshotDeliveryPropertiesGetArgs Empty = new DeliveryChannelSnapshotDeliveryPropertiesGetArgs();

    /**
     * - The frequency with which AWS Config recurringly delivers configuration snapshotsE.g., `One_Hour` or `Three_Hours`. Valid values are listed [here](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html#API_ConfigSnapshotDeliveryProperties_Contents).
     * 
     */
    @Import(name="deliveryFrequency")
      private final @Nullable Output<String> deliveryFrequency;

    public Output<String> getDeliveryFrequency() {
        return this.deliveryFrequency == null ? Output.empty() : this.deliveryFrequency;
    }

    public DeliveryChannelSnapshotDeliveryPropertiesGetArgs(@Nullable Output<String> deliveryFrequency) {
        this.deliveryFrequency = deliveryFrequency;
    }

    private DeliveryChannelSnapshotDeliveryPropertiesGetArgs() {
        this.deliveryFrequency = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryChannelSnapshotDeliveryPropertiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deliveryFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryChannelSnapshotDeliveryPropertiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryFrequency = defaults.deliveryFrequency;
        }

        public Builder deliveryFrequency(@Nullable Output<String> deliveryFrequency) {
            this.deliveryFrequency = deliveryFrequency;
            return this;
        }
        public Builder deliveryFrequency(@Nullable String deliveryFrequency) {
            this.deliveryFrequency = Output.ofNullable(deliveryFrequency);
            return this;
        }        public DeliveryChannelSnapshotDeliveryPropertiesGetArgs build() {
            return new DeliveryChannelSnapshotDeliveryPropertiesGetArgs(deliveryFrequency);
        }
    }
}