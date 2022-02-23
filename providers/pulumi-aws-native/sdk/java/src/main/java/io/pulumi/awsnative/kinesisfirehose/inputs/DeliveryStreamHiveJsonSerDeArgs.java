// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamHiveJsonSerDeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamHiveJsonSerDeArgs Empty = new DeliveryStreamHiveJsonSerDeArgs();

    @InputImport(name="timestampFormats")
      private final @Nullable Input<List<String>> timestampFormats;

    public Input<List<String>> getTimestampFormats() {
        return this.timestampFormats == null ? Input.empty() : this.timestampFormats;
    }

    public DeliveryStreamHiveJsonSerDeArgs(@Nullable Input<List<String>> timestampFormats) {
        this.timestampFormats = timestampFormats;
    }

    private DeliveryStreamHiveJsonSerDeArgs() {
        this.timestampFormats = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamHiveJsonSerDeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> timestampFormats;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamHiveJsonSerDeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timestampFormats = defaults.timestampFormats;
        }

        public Builder setTimestampFormats(@Nullable Input<List<String>> timestampFormats) {
            this.timestampFormats = timestampFormats;
            return this;
        }

        public Builder setTimestampFormats(@Nullable List<String> timestampFormats) {
            this.timestampFormats = Input.ofNullable(timestampFormats);
            return this;
        }
        public DeliveryStreamHiveJsonSerDeArgs build() {
            return new DeliveryStreamHiveJsonSerDeArgs(timestampFormats);
        }
    }
}
