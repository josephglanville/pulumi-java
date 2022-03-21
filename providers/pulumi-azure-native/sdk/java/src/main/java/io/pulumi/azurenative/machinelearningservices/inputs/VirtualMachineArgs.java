// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.VirtualMachinePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Machine Learning compute based on Azure Virtual Machines.
 * 
 */
public final class VirtualMachineArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineArgs Empty = new VirtualMachineArgs();

    /**
     * Location for the underlying compute
     * 
     */
    @Import(name="computeLocation")
      private final @Nullable Output<String> computeLocation;

    public Output<String> getComputeLocation() {
        return this.computeLocation == null ? Output.empty() : this.computeLocation;
    }

    /**
     * The type of compute
     * Expected value is 'VirtualMachine'.
     * 
     */
    @Import(name="computeType", required=true)
      private final Output<String> computeType;

    public Output<String> getComputeType() {
        return this.computeType;
    }

    /**
     * The description of the Machine Learning compute.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="properties")
      private final @Nullable Output<VirtualMachinePropertiesArgs> properties;

    public Output<VirtualMachinePropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * ARM resource id of the underlying compute
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    public VirtualMachineArgs(
        @Nullable Output<String> computeLocation,
        Output<String> computeType,
        @Nullable Output<String> description,
        @Nullable Output<VirtualMachinePropertiesArgs> properties,
        @Nullable Output<String> resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.description = description;
        this.properties = properties;
        this.resourceId = resourceId;
    }

    private VirtualMachineArgs() {
        this.computeLocation = Output.empty();
        this.computeType = Output.empty();
        this.description = Output.empty();
        this.properties = Output.empty();
        this.resourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> computeLocation;
        private Output<String> computeType;
        private @Nullable Output<String> description;
        private @Nullable Output<VirtualMachinePropertiesArgs> properties;
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeLocation = defaults.computeLocation;
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder computeLocation(@Nullable Output<String> computeLocation) {
            this.computeLocation = computeLocation;
            return this;
        }
        public Builder computeLocation(@Nullable String computeLocation) {
            this.computeLocation = Output.ofNullable(computeLocation);
            return this;
        }
        public Builder computeType(Output<String> computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }
        public Builder computeType(String computeType) {
            this.computeType = Output.of(Objects.requireNonNull(computeType));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder properties(@Nullable Output<VirtualMachinePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable VirtualMachinePropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }        public VirtualMachineArgs build() {
            return new VirtualMachineArgs(computeLocation, computeType, description, properties, resourceId);
        }
    }
}
