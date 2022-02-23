// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The instance view of a virtual machine extension.
 * 
 */
public final class VirtualMachineExtensionInstanceViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineExtensionInstanceViewResponse Empty = new VirtualMachineExtensionInstanceViewResponse();

    /**
     * The virtual machine extension name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The resource status information.
     * 
     */
    @InputImport(name="statuses")
      private final @Nullable List<InstanceViewStatusResponse> statuses;

    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    /**
     * The resource status information.
     * 
     */
    @InputImport(name="substatuses")
      private final @Nullable List<InstanceViewStatusResponse> substatuses;

    public List<InstanceViewStatusResponse> getSubstatuses() {
        return this.substatuses == null ? List.of() : this.substatuses;
    }

    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * Specifies the version of the script handler.
     * 
     */
    @InputImport(name="typeHandlerVersion")
      private final @Nullable String typeHandlerVersion;

    public Optional<String> getTypeHandlerVersion() {
        return this.typeHandlerVersion == null ? Optional.empty() : Optional.ofNullable(this.typeHandlerVersion);
    }

    public VirtualMachineExtensionInstanceViewResponse(
        @Nullable String name,
        @Nullable List<InstanceViewStatusResponse> statuses,
        @Nullable List<InstanceViewStatusResponse> substatuses,
        @Nullable String type,
        @Nullable String typeHandlerVersion) {
        this.name = name;
        this.statuses = statuses;
        this.substatuses = substatuses;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private VirtualMachineExtensionInstanceViewResponse() {
        this.name = null;
        this.statuses = List.of();
        this.substatuses = List.of();
        this.type = null;
        this.typeHandlerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineExtensionInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<InstanceViewStatusResponse> statuses;
        private @Nullable List<InstanceViewStatusResponse> substatuses;
        private @Nullable String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineExtensionInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.statuses = defaults.statuses;
    	      this.substatuses = defaults.substatuses;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStatuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setSubstatuses(@Nullable List<InstanceViewStatusResponse> substatuses) {
            this.substatuses = substatuses;
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
        public VirtualMachineExtensionInstanceViewResponse build() {
            return new VirtualMachineExtensionInstanceViewResponse(name, statuses, substatuses, type, typeHandlerVersion);
        }
    }
}
