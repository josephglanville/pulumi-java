// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamProcessorType;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessorParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamProcessorArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamProcessorArgs Empty = new DeliveryStreamProcessorArgs();

    @InputImport(name="parameters")
      private final @Nullable Input<List<DeliveryStreamProcessorParameterArgs>> parameters;

    public Input<List<DeliveryStreamProcessorParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="type", required=true)
      private final Input<DeliveryStreamProcessorType> type;

    public Input<DeliveryStreamProcessorType> getType() {
        return this.type;
    }

    public DeliveryStreamProcessorArgs(
        @Nullable Input<List<DeliveryStreamProcessorParameterArgs>> parameters,
        Input<DeliveryStreamProcessorType> type) {
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DeliveryStreamProcessorArgs() {
        this.parameters = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DeliveryStreamProcessorParameterArgs>> parameters;
        private Input<DeliveryStreamProcessorType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamProcessorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder setParameters(@Nullable Input<List<DeliveryStreamProcessorParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<DeliveryStreamProcessorParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setType(Input<DeliveryStreamProcessorType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(DeliveryStreamProcessorType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public DeliveryStreamProcessorArgs build() {
            return new DeliveryStreamProcessorArgs(parameters, type);
        }
    }
}
