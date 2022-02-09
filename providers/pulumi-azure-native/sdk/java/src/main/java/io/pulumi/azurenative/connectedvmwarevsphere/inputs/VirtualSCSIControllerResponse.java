// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualSCSIControllerResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualSCSIControllerResponse Empty = new VirtualSCSIControllerResponse();

    @InputImport(name="busNumber")
    private final @Nullable Integer busNumber;

    public Optional<Integer> getBusNumber() {
        return this.busNumber == null ? Optional.empty() : Optional.ofNullable(this.busNumber);
    }

    @InputImport(name="controllerKey")
    private final @Nullable Integer controllerKey;

    public Optional<Integer> getControllerKey() {
        return this.controllerKey == null ? Optional.empty() : Optional.ofNullable(this.controllerKey);
    }

    @InputImport(name="scsiCtlrUnitNumber")
    private final @Nullable Integer scsiCtlrUnitNumber;

    public Optional<Integer> getScsiCtlrUnitNumber() {
        return this.scsiCtlrUnitNumber == null ? Optional.empty() : Optional.ofNullable(this.scsiCtlrUnitNumber);
    }

    @InputImport(name="sharing")
    private final @Nullable String sharing;

    public Optional<String> getSharing() {
        return this.sharing == null ? Optional.empty() : Optional.ofNullable(this.sharing);
    }

    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public VirtualSCSIControllerResponse(
        @Nullable Integer busNumber,
        @Nullable Integer controllerKey,
        @Nullable Integer scsiCtlrUnitNumber,
        @Nullable String sharing,
        @Nullable String type) {
        this.busNumber = busNumber;
        this.controllerKey = controllerKey;
        this.scsiCtlrUnitNumber = scsiCtlrUnitNumber;
        this.sharing = sharing;
        this.type = type;
    }

    private VirtualSCSIControllerResponse() {
        this.busNumber = null;
        this.controllerKey = null;
        this.scsiCtlrUnitNumber = null;
        this.sharing = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualSCSIControllerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer busNumber;
        private @Nullable Integer controllerKey;
        private @Nullable Integer scsiCtlrUnitNumber;
        private @Nullable String sharing;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualSCSIControllerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.busNumber = defaults.busNumber;
    	      this.controllerKey = defaults.controllerKey;
    	      this.scsiCtlrUnitNumber = defaults.scsiCtlrUnitNumber;
    	      this.sharing = defaults.sharing;
    	      this.type = defaults.type;
        }

        public Builder setBusNumber(@Nullable Integer busNumber) {
            this.busNumber = busNumber;
            return this;
        }

        public Builder setControllerKey(@Nullable Integer controllerKey) {
            this.controllerKey = controllerKey;
            return this;
        }

        public Builder setScsiCtlrUnitNumber(@Nullable Integer scsiCtlrUnitNumber) {
            this.scsiCtlrUnitNumber = scsiCtlrUnitNumber;
            return this;
        }

        public Builder setSharing(@Nullable String sharing) {
            this.sharing = sharing;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public VirtualSCSIControllerResponse build() {
            return new VirtualSCSIControllerResponse(busNumber, controllerKey, scsiCtlrUnitNumber, sharing, type);
        }
    }
}
