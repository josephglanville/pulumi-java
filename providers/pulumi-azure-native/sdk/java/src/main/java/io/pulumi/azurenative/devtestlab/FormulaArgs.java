// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.inputs.FormulaPropertiesFromVmArgs;
import io.pulumi.azurenative.devtestlab.inputs.LabVirtualMachineCreationParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FormulaArgs extends io.pulumi.resources.ResourceArgs {

    public static final FormulaArgs Empty = new FormulaArgs();

    /**
     * The description of the formula.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The content of the formula.
     * 
     */
    @Import(name="formulaContent")
      private final @Nullable Output<LabVirtualMachineCreationParameterArgs> formulaContent;

    public Output<LabVirtualMachineCreationParameterArgs> getFormulaContent() {
        return this.formulaContent == null ? Codegen.empty() : this.formulaContent;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
      private final Output<String> labName;

    public Output<String> getLabName() {
        return this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the formula.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The OS type of the formula.
     * 
     */
    @Import(name="osType")
      private final @Nullable Output<String> osType;

    public Output<String> getOsType() {
        return this.osType == null ? Codegen.empty() : this.osType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Information about a VM from which a formula is to be created.
     * 
     */
    @Import(name="vm")
      private final @Nullable Output<FormulaPropertiesFromVmArgs> vm;

    public Output<FormulaPropertiesFromVmArgs> getVm() {
        return this.vm == null ? Codegen.empty() : this.vm;
    }

    public FormulaArgs(
        @Nullable Output<String> description,
        @Nullable Output<LabVirtualMachineCreationParameterArgs> formulaContent,
        Output<String> labName,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> osType,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<FormulaPropertiesFromVmArgs> vm) {
        this.description = description;
        this.formulaContent = formulaContent;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.name = name;
        this.osType = osType;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vm = vm;
    }

    private FormulaArgs() {
        this.description = Codegen.empty();
        this.formulaContent = Codegen.empty();
        this.labName = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.osType = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.vm = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FormulaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<LabVirtualMachineCreationParameterArgs> formulaContent;
        private Output<String> labName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> osType;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<FormulaPropertiesFromVmArgs> vm;

        public Builder() {
    	      // Empty
        }

        public Builder(FormulaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.formulaContent = defaults.formulaContent;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vm = defaults.vm;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder formulaContent(@Nullable Output<LabVirtualMachineCreationParameterArgs> formulaContent) {
            this.formulaContent = formulaContent;
            return this;
        }
        public Builder formulaContent(@Nullable LabVirtualMachineCreationParameterArgs formulaContent) {
            this.formulaContent = Codegen.ofNullable(formulaContent);
            return this;
        }
        public Builder labName(Output<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }
        public Builder labName(String labName) {
            this.labName = Output.of(Objects.requireNonNull(labName));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder osType(@Nullable Output<String> osType) {
            this.osType = osType;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = Codegen.ofNullable(osType);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vm(@Nullable Output<FormulaPropertiesFromVmArgs> vm) {
            this.vm = vm;
            return this;
        }
        public Builder vm(@Nullable FormulaPropertiesFromVmArgs vm) {
            this.vm = Codegen.ofNullable(vm);
            return this;
        }        public FormulaArgs build() {
            return new FormulaArgs(description, formulaContent, labName, location, name, osType, resourceGroupName, tags, vm);
        }
    }
}
