// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.enterpriseknowledgegraph;

import io.pulumi.azurenative.enterpriseknowledgegraph.inputs.EnterpriseKnowledgeGraphPropertiesArgs;
import io.pulumi.azurenative.enterpriseknowledgegraph.inputs.SkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterpriseKnowledgeGraphArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKnowledgeGraphArgs Empty = new EnterpriseKnowledgeGraphArgs();

    /**
     * Specifies the location of the resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The set of properties specific to EnterpriseKnowledgeGraph resource
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Output<EnterpriseKnowledgeGraphPropertiesArgs> properties;

    public Output<EnterpriseKnowledgeGraphPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the EnterpriseKnowledgeGraph resource group in the user subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the EnterpriseKnowledgeGraph resource.
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Output.empty() : this.resourceName;
    }

    /**
     * Gets or sets the SKU of the resource.
     * 
     */
    @InputImport(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public EnterpriseKnowledgeGraphArgs(
        @Nullable Output<String> location,
        @Nullable Output<EnterpriseKnowledgeGraphPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.sku = sku;
        this.tags = tags;
    }

    private EnterpriseKnowledgeGraphArgs() {
        this.location = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKnowledgeGraphArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<EnterpriseKnowledgeGraphPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKnowledgeGraphArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder properties(@Nullable Output<EnterpriseKnowledgeGraphPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable EnterpriseKnowledgeGraphPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
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

        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Output.ofNullable(resourceName);
            return this;
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public EnterpriseKnowledgeGraphArgs build() {
            return new EnterpriseKnowledgeGraphArgs(location, properties, resourceGroupName, resourceName, sku, tags);
        }
    }
}
