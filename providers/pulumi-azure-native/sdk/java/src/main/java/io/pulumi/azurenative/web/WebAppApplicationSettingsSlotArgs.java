// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppApplicationSettingsSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppApplicationSettingsSlotArgs Empty = new WebAppApplicationSettingsSlotArgs();

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Settings.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will update the application settings for the production slot.
     * 
     */
    @InputImport(name="slot", required=true)
      private final Input<String> slot;

    public Input<String> getSlot() {
        return this.slot;
    }

    public WebAppApplicationSettingsSlotArgs(
        @Nullable Input<String> kind,
        Input<String> name,
        @Nullable Input<Map<String,String>> properties,
        Input<String> resourceGroupName,
        Input<String> slot) {
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private WebAppApplicationSettingsSlotArgs() {
        this.kind = Input.empty();
        this.name = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.slot = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppApplicationSettingsSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private Input<String> name;
        private @Nullable Input<Map<String,String>> properties;
        private Input<String> resourceGroupName;
        private Input<String> slot;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppApplicationSettingsSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSlot(Input<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Input.of(Objects.requireNonNull(slot));
            return this;
        }
        public WebAppApplicationSettingsSlotArgs build() {
            return new WebAppApplicationSettingsSlotArgs(kind, name, properties, resourceGroupName, slot);
        }
    }
}
