// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineExtensionHandlerInstanceViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineExtensionHandlerInstanceViewResponse Empty = new VirtualMachineExtensionHandlerInstanceViewResponse();

    @InputImport(name="status")
    private final @Nullable InstanceViewStatusResponse status;

    public Optional<InstanceViewStatusResponse> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    @InputImport(name="typeHandlerVersion")
    private final @Nullable String typeHandlerVersion;

    public Optional<String> getTypeHandlerVersion() {
        return this.typeHandlerVersion == null ? Optional.empty() : Optional.ofNullable(this.typeHandlerVersion);
    }

    public VirtualMachineExtensionHandlerInstanceViewResponse(
        @Nullable InstanceViewStatusResponse status,
        @Nullable String type,
        @Nullable String typeHandlerVersion) {
        this.status = status;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private VirtualMachineExtensionHandlerInstanceViewResponse() {
        this.status = null;
        this.type = null;
        this.typeHandlerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineExtensionHandlerInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InstanceViewStatusResponse status;
        private @Nullable String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineExtensionHandlerInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setStatus(@Nullable InstanceViewStatusResponse status) {
            this.status = status;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setTypeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        public VirtualMachineExtensionHandlerInstanceViewResponse build() {
            return new VirtualMachineExtensionHandlerInstanceViewResponse(status, type, typeHandlerVersion);
        }
    }
}
