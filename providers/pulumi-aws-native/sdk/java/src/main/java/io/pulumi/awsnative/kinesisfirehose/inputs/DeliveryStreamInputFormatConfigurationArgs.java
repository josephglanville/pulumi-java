// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamDeserializerArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamInputFormatConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamInputFormatConfigurationArgs Empty = new DeliveryStreamInputFormatConfigurationArgs();

    @InputImport(name="deserializer")
      private final @Nullable Input<DeliveryStreamDeserializerArgs> deserializer;

    public Input<DeliveryStreamDeserializerArgs> getDeserializer() {
        return this.deserializer == null ? Input.empty() : this.deserializer;
    }

    public DeliveryStreamInputFormatConfigurationArgs(@Nullable Input<DeliveryStreamDeserializerArgs> deserializer) {
        this.deserializer = deserializer;
    }

    private DeliveryStreamInputFormatConfigurationArgs() {
        this.deserializer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamInputFormatConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DeliveryStreamDeserializerArgs> deserializer;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamInputFormatConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
        }

        public Builder setDeserializer(@Nullable Input<DeliveryStreamDeserializerArgs> deserializer) {
            this.deserializer = deserializer;
            return this;
        }

        public Builder setDeserializer(@Nullable DeliveryStreamDeserializerArgs deserializer) {
            this.deserializer = Input.ofNullable(deserializer);
            return this;
        }
        public DeliveryStreamInputFormatConfigurationArgs build() {
            return new DeliveryStreamInputFormatConfigurationArgs(deserializer);
        }
    }
}
