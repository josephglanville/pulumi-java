// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.datafactory.inputs.PrivateLinkConnectionApprovalRequestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    @InputImport(name="factoryName", required=true)
    private final Input<String> factoryName;

    public Input<String> getFactoryName() {
        return this.factoryName;
    }

    @InputImport(name="privateEndpointConnectionName")
    private final @Nullable Input<String> privateEndpointConnectionName;

    public Input<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Input.empty() : this.privateEndpointConnectionName;
    }

    @InputImport(name="properties")
    private final @Nullable Input<PrivateLinkConnectionApprovalRequestArgs> properties;

    public Input<PrivateLinkConnectionApprovalRequestArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public PrivateEndpointConnectionArgs(
        Input<String> factoryName,
        @Nullable Input<String> privateEndpointConnectionName,
        @Nullable Input<PrivateLinkConnectionApprovalRequestArgs> properties,
        Input<String> resourceGroupName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.factoryName = Input.empty();
        this.privateEndpointConnectionName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> factoryName;
        private @Nullable Input<String> privateEndpointConnectionName;
        private @Nullable Input<PrivateLinkConnectionApprovalRequestArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFactoryName(Input<String> factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }

        public Builder setFactoryName(String factoryName) {
            this.factoryName = Input.of(Objects.requireNonNull(factoryName));
            return this;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable Input<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Input.ofNullable(privateEndpointConnectionName);
            return this;
        }

        public Builder setProperties(@Nullable Input<PrivateLinkConnectionApprovalRequestArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable PrivateLinkConnectionApprovalRequestArgs properties) {
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

        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(factoryName, privateEndpointConnectionName, properties, resourceGroupName);
        }
    }
}
