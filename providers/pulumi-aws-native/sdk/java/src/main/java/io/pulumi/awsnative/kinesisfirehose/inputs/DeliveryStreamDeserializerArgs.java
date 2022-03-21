// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamHiveJsonSerDeArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamOpenXJsonSerDeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamDeserializerArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamDeserializerArgs Empty = new DeliveryStreamDeserializerArgs();

    @Import(name="hiveJsonSerDe")
      private final @Nullable Output<DeliveryStreamHiveJsonSerDeArgs> hiveJsonSerDe;

    public Output<DeliveryStreamHiveJsonSerDeArgs> getHiveJsonSerDe() {
        return this.hiveJsonSerDe == null ? Output.empty() : this.hiveJsonSerDe;
    }

    @Import(name="openXJsonSerDe")
      private final @Nullable Output<DeliveryStreamOpenXJsonSerDeArgs> openXJsonSerDe;

    public Output<DeliveryStreamOpenXJsonSerDeArgs> getOpenXJsonSerDe() {
        return this.openXJsonSerDe == null ? Output.empty() : this.openXJsonSerDe;
    }

    public DeliveryStreamDeserializerArgs(
        @Nullable Output<DeliveryStreamHiveJsonSerDeArgs> hiveJsonSerDe,
        @Nullable Output<DeliveryStreamOpenXJsonSerDeArgs> openXJsonSerDe) {
        this.hiveJsonSerDe = hiveJsonSerDe;
        this.openXJsonSerDe = openXJsonSerDe;
    }

    private DeliveryStreamDeserializerArgs() {
        this.hiveJsonSerDe = Output.empty();
        this.openXJsonSerDe = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamDeserializerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeliveryStreamHiveJsonSerDeArgs> hiveJsonSerDe;
        private @Nullable Output<DeliveryStreamOpenXJsonSerDeArgs> openXJsonSerDe;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamDeserializerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hiveJsonSerDe = defaults.hiveJsonSerDe;
    	      this.openXJsonSerDe = defaults.openXJsonSerDe;
        }

        public Builder hiveJsonSerDe(@Nullable Output<DeliveryStreamHiveJsonSerDeArgs> hiveJsonSerDe) {
            this.hiveJsonSerDe = hiveJsonSerDe;
            return this;
        }
        public Builder hiveJsonSerDe(@Nullable DeliveryStreamHiveJsonSerDeArgs hiveJsonSerDe) {
            this.hiveJsonSerDe = Output.ofNullable(hiveJsonSerDe);
            return this;
        }
        public Builder openXJsonSerDe(@Nullable Output<DeliveryStreamOpenXJsonSerDeArgs> openXJsonSerDe) {
            this.openXJsonSerDe = openXJsonSerDe;
            return this;
        }
        public Builder openXJsonSerDe(@Nullable DeliveryStreamOpenXJsonSerDeArgs openXJsonSerDe) {
            this.openXJsonSerDe = Output.ofNullable(openXJsonSerDe);
            return this;
        }        public DeliveryStreamDeserializerArgs build() {
            return new DeliveryStreamDeserializerArgs(hiveJsonSerDe, openXJsonSerDe);
        }
    }
}
