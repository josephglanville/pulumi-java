// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListWebAppSitePushSettingsSlotArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListWebAppSitePushSettingsSlotArgs Empty = new ListWebAppSitePushSettingsSlotArgs();

    /**
     * Name of web app.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of web app slot. If not specified then will default to production slot.
     * 
     */
    @Import(name="slot", required=true)
      private final String slot;

    public String getSlot() {
        return this.slot;
    }

    public ListWebAppSitePushSettingsSlotArgs(
        String name,
        String resourceGroupName,
        String slot) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private ListWebAppSitePushSettingsSlotArgs() {
        this.name = null;
        this.resourceGroupName = null;
        this.slot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppSitePushSettingsSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String resourceGroupName;
        private String slot;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppSitePushSettingsSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder slot(String slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }        public ListWebAppSitePushSettingsSlotArgs build() {
            return new ListWebAppSitePushSettingsSlotArgs(name, resourceGroupName, slot);
        }
    }
}
