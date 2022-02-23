// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork;

import io.pulumi.azurenative.managednetwork.inputs.ManagedNetworkPeeringPolicyPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedNetworkPeeringPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedNetworkPeeringPolicyArgs Empty = new ManagedNetworkPeeringPolicyArgs();

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the Managed Network.
     * 
     */
    @InputImport(name="managedNetworkName", required=true)
      private final Input<String> managedNetworkName;

    public Input<String> getManagedNetworkName() {
        return this.managedNetworkName;
    }

    /**
     * The name of the Managed Network Peering Policy.
     * 
     */
    @InputImport(name="managedNetworkPeeringPolicyName")
      private final @Nullable Input<String> managedNetworkPeeringPolicyName;

    public Input<String> getManagedNetworkPeeringPolicyName() {
        return this.managedNetworkPeeringPolicyName == null ? Input.empty() : this.managedNetworkPeeringPolicyName;
    }

    /**
     * Gets or sets the properties of a Managed Network Policy
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<ManagedNetworkPeeringPolicyPropertiesArgs> properties;

    public Input<ManagedNetworkPeeringPolicyPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ManagedNetworkPeeringPolicyArgs(
        @Nullable Input<String> location,
        Input<String> managedNetworkName,
        @Nullable Input<String> managedNetworkPeeringPolicyName,
        @Nullable Input<ManagedNetworkPeeringPolicyPropertiesArgs> properties,
        Input<String> resourceGroupName) {
        this.location = location;
        this.managedNetworkName = Objects.requireNonNull(managedNetworkName, "expected parameter 'managedNetworkName' to be non-null");
        this.managedNetworkPeeringPolicyName = managedNetworkPeeringPolicyName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ManagedNetworkPeeringPolicyArgs() {
        this.location = Input.empty();
        this.managedNetworkName = Input.empty();
        this.managedNetworkPeeringPolicyName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNetworkPeeringPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<String> managedNetworkName;
        private @Nullable Input<String> managedNetworkPeeringPolicyName;
        private @Nullable Input<ManagedNetworkPeeringPolicyPropertiesArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNetworkPeeringPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.managedNetworkName = defaults.managedNetworkName;
    	      this.managedNetworkPeeringPolicyName = defaults.managedNetworkPeeringPolicyName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagedNetworkName(Input<String> managedNetworkName) {
            this.managedNetworkName = Objects.requireNonNull(managedNetworkName);
            return this;
        }

        public Builder setManagedNetworkName(String managedNetworkName) {
            this.managedNetworkName = Input.of(Objects.requireNonNull(managedNetworkName));
            return this;
        }

        public Builder setManagedNetworkPeeringPolicyName(@Nullable Input<String> managedNetworkPeeringPolicyName) {
            this.managedNetworkPeeringPolicyName = managedNetworkPeeringPolicyName;
            return this;
        }

        public Builder setManagedNetworkPeeringPolicyName(@Nullable String managedNetworkPeeringPolicyName) {
            this.managedNetworkPeeringPolicyName = Input.ofNullable(managedNetworkPeeringPolicyName);
            return this;
        }

        public Builder setProperties(@Nullable Input<ManagedNetworkPeeringPolicyPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable ManagedNetworkPeeringPolicyPropertiesArgs properties) {
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
        public ManagedNetworkPeeringPolicyArgs build() {
            return new ManagedNetworkPeeringPolicyArgs(location, managedNetworkName, managedNetworkPeeringPolicyName, properties, resourceGroupName);
        }
    }
}
