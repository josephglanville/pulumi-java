// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageReservationAffinityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageReservationAffinityGetArgs Empty = new InstanceFromMachineImageReservationAffinityGetArgs();

    @Import(name="specificReservation")
      private final @Nullable Output<InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs> specificReservation;

    public Output<InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs> getSpecificReservation() {
        return this.specificReservation == null ? Codegen.empty() : this.specificReservation;
    }

    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public InstanceFromMachineImageReservationAffinityGetArgs(
        @Nullable Output<InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs> specificReservation,
        Output<String> type) {
        this.specificReservation = specificReservation;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceFromMachineImageReservationAffinityGetArgs() {
        this.specificReservation = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageReservationAffinityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs> specificReservation;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageReservationAffinityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservation = defaults.specificReservation;
    	      this.type = defaults.type;
        }

        public Builder specificReservation(@Nullable Output<InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs> specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }
        public Builder specificReservation(@Nullable InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs specificReservation) {
            this.specificReservation = Codegen.ofNullable(specificReservation);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public InstanceFromMachineImageReservationAffinityGetArgs build() {
            return new InstanceFromMachineImageReservationAffinityGetArgs(specificReservation, type);
        }
    }
}
