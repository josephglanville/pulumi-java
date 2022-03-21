// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyInventoryFilterArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Resource groups provide a mechanism to group OS policy resources. Resource groups enable OS policy authors to create a single OS policy to be applied to VMs running different operating Systems. When the OS policy is applied to a target VM, the appropriate resource group within the OS policy is selected based on the `OSFilter` specified within the resource group.
 * 
 */
public final class OSPolicyResourceGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceGroupArgs Empty = new OSPolicyResourceGroupArgs();

    /**
     * List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
     */
    @Import(name="inventoryFilters")
      private final @Nullable Output<List<OSPolicyInventoryFilterArgs>> inventoryFilters;

    public Output<List<OSPolicyInventoryFilterArgs>> getInventoryFilters() {
        return this.inventoryFilters == null ? Output.empty() : this.inventoryFilters;
    }

    /**
     * List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
     */
    @Import(name="resources", required=true)
      private final Output<List<OSPolicyResourceArgs>> resources;

    public Output<List<OSPolicyResourceArgs>> getResources() {
        return this.resources;
    }

    public OSPolicyResourceGroupArgs(
        @Nullable Output<List<OSPolicyInventoryFilterArgs>> inventoryFilters,
        Output<List<OSPolicyResourceArgs>> resources) {
        this.inventoryFilters = inventoryFilters;
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
    }

    private OSPolicyResourceGroupArgs() {
        this.inventoryFilters = Output.empty();
        this.resources = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OSPolicyInventoryFilterArgs>> inventoryFilters;
        private Output<List<OSPolicyResourceArgs>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inventoryFilters = defaults.inventoryFilters;
    	      this.resources = defaults.resources;
        }

        public Builder inventoryFilters(@Nullable Output<List<OSPolicyInventoryFilterArgs>> inventoryFilters) {
            this.inventoryFilters = inventoryFilters;
            return this;
        }
        public Builder inventoryFilters(@Nullable List<OSPolicyInventoryFilterArgs> inventoryFilters) {
            this.inventoryFilters = Output.ofNullable(inventoryFilters);
            return this;
        }
        public Builder inventoryFilters(OSPolicyInventoryFilterArgs... inventoryFilters) {
            return inventoryFilters(List.of(inventoryFilters));
        }
        public Builder resources(Output<List<OSPolicyResourceArgs>> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(List<OSPolicyResourceArgs> resources) {
            this.resources = Output.of(Objects.requireNonNull(resources));
            return this;
        }
        public Builder resources(OSPolicyResourceArgs... resources) {
            return resources(List.of(resources));
        }        public OSPolicyResourceGroupArgs build() {
            return new OSPolicyResourceGroupArgs(inventoryFilters, resources);
        }
    }
}
