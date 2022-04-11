// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamOrcSerDeArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamParquetSerDeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamSerializerArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamSerializerArgs Empty = new DeliveryStreamSerializerArgs();

    @Import(name="orcSerDe")
      private final @Nullable Output<DeliveryStreamOrcSerDeArgs> orcSerDe;

    public Output<DeliveryStreamOrcSerDeArgs> getOrcSerDe() {
        return this.orcSerDe == null ? Codegen.empty() : this.orcSerDe;
    }

    @Import(name="parquetSerDe")
      private final @Nullable Output<DeliveryStreamParquetSerDeArgs> parquetSerDe;

    public Output<DeliveryStreamParquetSerDeArgs> getParquetSerDe() {
        return this.parquetSerDe == null ? Codegen.empty() : this.parquetSerDe;
    }

    public DeliveryStreamSerializerArgs(
        @Nullable Output<DeliveryStreamOrcSerDeArgs> orcSerDe,
        @Nullable Output<DeliveryStreamParquetSerDeArgs> parquetSerDe) {
        this.orcSerDe = orcSerDe;
        this.parquetSerDe = parquetSerDe;
    }

    private DeliveryStreamSerializerArgs() {
        this.orcSerDe = Codegen.empty();
        this.parquetSerDe = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamSerializerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeliveryStreamOrcSerDeArgs> orcSerDe;
        private @Nullable Output<DeliveryStreamParquetSerDeArgs> parquetSerDe;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamSerializerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.orcSerDe = defaults.orcSerDe;
    	      this.parquetSerDe = defaults.parquetSerDe;
        }

        public Builder orcSerDe(@Nullable Output<DeliveryStreamOrcSerDeArgs> orcSerDe) {
            this.orcSerDe = orcSerDe;
            return this;
        }
        public Builder orcSerDe(@Nullable DeliveryStreamOrcSerDeArgs orcSerDe) {
            this.orcSerDe = Codegen.ofNullable(orcSerDe);
            return this;
        }
        public Builder parquetSerDe(@Nullable Output<DeliveryStreamParquetSerDeArgs> parquetSerDe) {
            this.parquetSerDe = parquetSerDe;
            return this;
        }
        public Builder parquetSerDe(@Nullable DeliveryStreamParquetSerDeArgs parquetSerDe) {
            this.parquetSerDe = Codegen.ofNullable(parquetSerDe);
            return this;
        }        public DeliveryStreamSerializerArgs build() {
            return new DeliveryStreamSerializerArgs(orcSerDe, parquetSerDe);
        }
    }
}
