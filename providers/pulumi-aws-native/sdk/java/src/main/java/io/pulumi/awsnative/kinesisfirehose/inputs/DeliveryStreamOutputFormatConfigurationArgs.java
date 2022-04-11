// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamSerializerArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamOutputFormatConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamOutputFormatConfigurationArgs Empty = new DeliveryStreamOutputFormatConfigurationArgs();

    @Import(name="serializer")
      private final @Nullable Output<DeliveryStreamSerializerArgs> serializer;

    public Output<DeliveryStreamSerializerArgs> getSerializer() {
        return this.serializer == null ? Codegen.empty() : this.serializer;
    }

    public DeliveryStreamOutputFormatConfigurationArgs(@Nullable Output<DeliveryStreamSerializerArgs> serializer) {
        this.serializer = serializer;
    }

    private DeliveryStreamOutputFormatConfigurationArgs() {
        this.serializer = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamOutputFormatConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeliveryStreamSerializerArgs> serializer;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamOutputFormatConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serializer = defaults.serializer;
        }

        public Builder serializer(@Nullable Output<DeliveryStreamSerializerArgs> serializer) {
            this.serializer = serializer;
            return this;
        }
        public Builder serializer(@Nullable DeliveryStreamSerializerArgs serializer) {
            this.serializer = Codegen.ofNullable(serializer);
            return this;
        }        public DeliveryStreamOutputFormatConfigurationArgs build() {
            return new DeliveryStreamOutputFormatConfigurationArgs(serializer);
        }
    }
}
