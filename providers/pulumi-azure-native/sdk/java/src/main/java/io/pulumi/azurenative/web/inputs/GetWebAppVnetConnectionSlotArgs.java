// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppVnetConnectionSlotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppVnetConnectionSlotArgs Empty = new GetWebAppVnetConnectionSlotArgs();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="slot", required=true)
    private final String slot;

    public String getSlot() {
        return this.slot;
    }

    @InputImport(name="vnetName", required=true)
    private final String vnetName;

    public String getVnetName() {
        return this.vnetName;
    }

    public GetWebAppVnetConnectionSlotArgs(
        String name,
        String resourceGroupName,
        String slot,
        String vnetName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.vnetName = Objects.requireNonNull(vnetName, "expected parameter 'vnetName' to be non-null");
    }

    private GetWebAppVnetConnectionSlotArgs() {
        this.name = null;
        this.resourceGroupName = null;
        this.slot = null;
        this.vnetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppVnetConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String resourceGroupName;
        private String slot;
        private String vnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppVnetConnectionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
    	      this.vnetName = defaults.vnetName;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder setVnetName(String vnetName) {
            this.vnetName = Objects.requireNonNull(vnetName);
            return this;
        }

        public GetWebAppVnetConnectionSlotArgs build() {
            return new GetWebAppVnetConnectionSlotArgs(name, resourceGroupName, slot, vnetName);
        }
    }
}
