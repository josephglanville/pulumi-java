// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecoveryPlanProtectedItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecoveryPlanProtectedItemResponse Empty = new RecoveryPlanProtectedItemResponse();

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="virtualMachineId")
    private final @Nullable String virtualMachineId;

    public Optional<String> getVirtualMachineId() {
        return this.virtualMachineId == null ? Optional.empty() : Optional.ofNullable(this.virtualMachineId);
    }

    public RecoveryPlanProtectedItemResponse(
        @Nullable String id,
        @Nullable String virtualMachineId) {
        this.id = id;
        this.virtualMachineId = virtualMachineId;
    }

    private RecoveryPlanProtectedItemResponse() {
        this.id = null;
        this.virtualMachineId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String virtualMachineId;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanProtectedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.virtualMachineId = defaults.virtualMachineId;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setVirtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }

        public RecoveryPlanProtectedItemResponse build() {
            return new RecoveryPlanProtectedItemResponse(id, virtualMachineId);
        }
    }
}
