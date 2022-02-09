// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.azurenative.operationalinsights.enums.WorkspaceSkuNameEnum;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceSkuArgs Empty = new WorkspaceSkuArgs();

    @InputImport(name="capacityReservationLevel")
    private final @Nullable Input<Integer> capacityReservationLevel;

    public Input<Integer> getCapacityReservationLevel() {
        return this.capacityReservationLevel == null ? Input.empty() : this.capacityReservationLevel;
    }

    @InputImport(name="name", required=true)
    private final Input<Either<String,WorkspaceSkuNameEnum>> name;

    public Input<Either<String,WorkspaceSkuNameEnum>> getName() {
        return this.name;
    }

    public WorkspaceSkuArgs(
        @Nullable Input<Integer> capacityReservationLevel,
        Input<Either<String,WorkspaceSkuNameEnum>> name) {
        this.capacityReservationLevel = capacityReservationLevel;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private WorkspaceSkuArgs() {
        this.capacityReservationLevel = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> capacityReservationLevel;
        private Input<Either<String,WorkspaceSkuNameEnum>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationLevel = defaults.capacityReservationLevel;
    	      this.name = defaults.name;
        }

        public Builder setCapacityReservationLevel(@Nullable Input<Integer> capacityReservationLevel) {
            this.capacityReservationLevel = capacityReservationLevel;
            return this;
        }

        public Builder setCapacityReservationLevel(@Nullable Integer capacityReservationLevel) {
            this.capacityReservationLevel = Input.ofNullable(capacityReservationLevel);
            return this;
        }

        public Builder setName(Input<Either<String,WorkspaceSkuNameEnum>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(Either<String,WorkspaceSkuNameEnum> name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public WorkspaceSkuArgs build() {
            return new WorkspaceSkuArgs(capacityReservationLevel, name);
        }
    }
}
