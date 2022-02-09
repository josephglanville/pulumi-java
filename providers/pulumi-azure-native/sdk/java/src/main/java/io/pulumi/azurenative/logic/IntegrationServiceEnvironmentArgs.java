// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmentPropertiesArgs;
import io.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmentSkuArgs;
import io.pulumi.azurenative.logic.inputs.ManagedServiceIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationServiceEnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceEnvironmentArgs Empty = new IntegrationServiceEnvironmentArgs();

    @InputImport(name="identity")
    private final @Nullable Input<ManagedServiceIdentityArgs> identity;

    public Input<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="integrationServiceEnvironmentName")
    private final @Nullable Input<String> integrationServiceEnvironmentName;

    public Input<String> getIntegrationServiceEnvironmentName() {
        return this.integrationServiceEnvironmentName == null ? Input.empty() : this.integrationServiceEnvironmentName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="properties")
    private final @Nullable Input<IntegrationServiceEnvironmentPropertiesArgs> properties;

    public Input<IntegrationServiceEnvironmentPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroup", required=true)
    private final Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup;
    }

    @InputImport(name="sku")
    private final @Nullable Input<IntegrationServiceEnvironmentSkuArgs> sku;

    public Input<IntegrationServiceEnvironmentSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public IntegrationServiceEnvironmentArgs(
        @Nullable Input<ManagedServiceIdentityArgs> identity,
        @Nullable Input<String> integrationServiceEnvironmentName,
        @Nullable Input<String> location,
        @Nullable Input<IntegrationServiceEnvironmentPropertiesArgs> properties,
        Input<String> resourceGroup,
        @Nullable Input<IntegrationServiceEnvironmentSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.identity = identity;
        this.integrationServiceEnvironmentName = integrationServiceEnvironmentName;
        this.location = location;
        this.properties = properties;
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private IntegrationServiceEnvironmentArgs() {
        this.identity = Input.empty();
        this.integrationServiceEnvironmentName = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroup = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ManagedServiceIdentityArgs> identity;
        private @Nullable Input<String> integrationServiceEnvironmentName;
        private @Nullable Input<String> location;
        private @Nullable Input<IntegrationServiceEnvironmentPropertiesArgs> properties;
        private Input<String> resourceGroup;
        private @Nullable Input<IntegrationServiceEnvironmentSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.integrationServiceEnvironmentName = defaults.integrationServiceEnvironmentName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setIdentity(@Nullable Input<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setIntegrationServiceEnvironmentName(@Nullable Input<String> integrationServiceEnvironmentName) {
            this.integrationServiceEnvironmentName = integrationServiceEnvironmentName;
            return this;
        }

        public Builder setIntegrationServiceEnvironmentName(@Nullable String integrationServiceEnvironmentName) {
            this.integrationServiceEnvironmentName = Input.ofNullable(integrationServiceEnvironmentName);
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

        public Builder setProperties(@Nullable Input<IntegrationServiceEnvironmentPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable IntegrationServiceEnvironmentPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroup(Input<String> resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Input.of(Objects.requireNonNull(resourceGroup));
            return this;
        }

        public Builder setSku(@Nullable Input<IntegrationServiceEnvironmentSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable IntegrationServiceEnvironmentSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
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

        public IntegrationServiceEnvironmentArgs build() {
            return new IntegrationServiceEnvironmentArgs(identity, integrationServiceEnvironmentName, location, properties, resourceGroup, sku, tags);
        }
    }
}
