// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotcentral;

import io.pulumi.azurenative.iotcentral.inputs.AppSkuInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    /**
     * The display name of the application.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group that contains the IoT Central application.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The ARM resource name of the IoT Central application.
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * A valid instance SKU.
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<AppSkuInfoArgs> sku;

    public Input<AppSkuInfoArgs> getSku() {
        return this.sku;
    }

    /**
     * The subdomain of the application.
     * 
     */
    @InputImport(name="subdomain")
      private final @Nullable Input<String> subdomain;

    public Input<String> getSubdomain() {
        return this.subdomain == null ? Input.empty() : this.subdomain;
    }

    /**
     * The resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The ID of the application template, which is a blueprint that defines the characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and allows the application to be defined from scratch.
     * 
     */
    @InputImport(name="template")
      private final @Nullable Input<String> template;

    public Input<String> getTemplate() {
        return this.template == null ? Input.empty() : this.template;
    }

    public AppArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        Input<AppSkuInfoArgs> sku,
        @Nullable Input<String> subdomain,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> template) {
        this.displayName = displayName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.subdomain = subdomain;
        this.tags = tags;
        this.template = template;
    }

    private AppArgs() {
        this.displayName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.sku = Input.empty();
        this.subdomain = Input.empty();
        this.tags = Input.empty();
        this.template = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private Input<AppSkuInfoArgs> sku;
        private @Nullable Input<String> subdomain;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> template;

        public Builder() {
    	      // Empty
        }

        public Builder(AppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.sku = defaults.sku;
    	      this.subdomain = defaults.subdomain;
    	      this.tags = defaults.tags;
    	      this.template = defaults.template;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setSku(Input<AppSkuInfoArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(AppSkuInfoArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setSubdomain(@Nullable Input<String> subdomain) {
            this.subdomain = subdomain;
            return this;
        }

        public Builder setSubdomain(@Nullable String subdomain) {
            this.subdomain = Input.ofNullable(subdomain);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTemplate(@Nullable Input<String> template) {
            this.template = template;
            return this;
        }

        public Builder setTemplate(@Nullable String template) {
            this.template = Input.ofNullable(template);
            return this;
        }
        public AppArgs build() {
            return new AppArgs(displayName, location, resourceGroupName, resourceName, sku, subdomain, tags, template);
        }
    }
}
