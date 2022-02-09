// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.ApiPortalPropertiesArgs;
import io.pulumi.azurenative.appplatform.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiPortalArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiPortalArgs Empty = new ApiPortalArgs();

    @InputImport(name="apiPortalName")
    private final @Nullable Input<String> apiPortalName;

    public Input<String> getApiPortalName() {
        return this.apiPortalName == null ? Input.empty() : this.apiPortalName;
    }

    @InputImport(name="properties")
    private final @Nullable Input<ApiPortalPropertiesArgs> properties;

    public Input<ApiPortalPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    @InputImport(name="sku")
    private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    public ApiPortalArgs(
        @Nullable Input<String> apiPortalName,
        @Nullable Input<ApiPortalPropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        @Nullable Input<SkuArgs> sku) {
        this.apiPortalName = apiPortalName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.sku = sku;
    }

    private ApiPortalArgs() {
        this.apiPortalName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.sku = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiPortalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiPortalName;
        private @Nullable Input<ApiPortalPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private @Nullable Input<SkuArgs> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiPortalArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiPortalName = defaults.apiPortalName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.sku = defaults.sku;
        }

        public Builder setApiPortalName(@Nullable Input<String> apiPortalName) {
            this.apiPortalName = apiPortalName;
            return this;
        }

        public Builder setApiPortalName(@Nullable String apiPortalName) {
            this.apiPortalName = Input.ofNullable(apiPortalName);
            return this;
        }

        public Builder setProperties(@Nullable Input<ApiPortalPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable ApiPortalPropertiesArgs properties) {
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

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public ApiPortalArgs build() {
            return new ApiPortalArgs(apiPortalName, properties, resourceGroupName, serviceName, sku);
        }
    }
}
