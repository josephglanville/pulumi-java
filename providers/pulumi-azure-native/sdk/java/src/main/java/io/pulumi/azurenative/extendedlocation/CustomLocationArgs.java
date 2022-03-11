// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.extendedlocation;

import io.pulumi.azurenative.extendedlocation.enums.HostType;
import io.pulumi.azurenative.extendedlocation.inputs.CustomLocationPropertiesAuthenticationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomLocationArgs Empty = new CustomLocationArgs();

    /**
     * This is optional input that contains the authentication that should be used to generate the namespace.
     * 
     */
    @InputImport(name="authentication")
      private final @Nullable Output<CustomLocationPropertiesAuthenticationArgs> authentication;

    public Output<CustomLocationPropertiesAuthenticationArgs> getAuthentication() {
        return this.authentication == null ? Output.empty() : this.authentication;
    }

    /**
     * Contains the reference to the add-on that contains charts to deploy CRDs and operators.
     * 
     */
    @InputImport(name="clusterExtensionIds")
      private final @Nullable Output<List<String>> clusterExtensionIds;

    public Output<List<String>> getClusterExtensionIds() {
        return this.clusterExtensionIds == null ? Output.empty() : this.clusterExtensionIds;
    }

    /**
     * Display name for the Custom Locations location.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Connected Cluster or AKS Cluster. The Custom Locations RP will perform a checkAccess API for listAdminCredentials permissions.
     * 
     */
    @InputImport(name="hostResourceId")
      private final @Nullable Output<String> hostResourceId;

    public Output<String> getHostResourceId() {
        return this.hostResourceId == null ? Output.empty() : this.hostResourceId;
    }

    /**
     * Type of host the Custom Locations is referencing (Kubernetes, etc...).
     * 
     */
    @InputImport(name="hostType")
      private final @Nullable Output<Either<String,HostType>> hostType;

    public Output<Either<String,HostType>> getHostType() {
        return this.hostType == null ? Output.empty() : this.hostType;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Kubernetes namespace that will be created on the specified cluster.
     * 
     */
    @InputImport(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Output.empty() : this.namespace;
    }

    /**
     * Provisioning State for the Custom Location.
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState == null ? Output.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Custom Locations name.
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Output.empty() : this.resourceName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public CustomLocationArgs(
        @Nullable Output<CustomLocationPropertiesAuthenticationArgs> authentication,
        @Nullable Output<List<String>> clusterExtensionIds,
        @Nullable Output<String> displayName,
        @Nullable Output<String> hostResourceId,
        @Nullable Output<Either<String,HostType>> hostType,
        @Nullable Output<String> location,
        @Nullable Output<String> namespace,
        @Nullable Output<String> provisioningState,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<Map<String,String>> tags) {
        this.authentication = authentication;
        this.clusterExtensionIds = clusterExtensionIds;
        this.displayName = displayName;
        this.hostResourceId = hostResourceId;
        this.hostType = hostType;
        this.location = location;
        this.namespace = namespace;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.tags = tags;
    }

    private CustomLocationArgs() {
        this.authentication = Output.empty();
        this.clusterExtensionIds = Output.empty();
        this.displayName = Output.empty();
        this.hostResourceId = Output.empty();
        this.hostType = Output.empty();
        this.location = Output.empty();
        this.namespace = Output.empty();
        this.provisioningState = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CustomLocationPropertiesAuthenticationArgs> authentication;
        private @Nullable Output<List<String>> clusterExtensionIds;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> hostResourceId;
        private @Nullable Output<Either<String,HostType>> hostType;
        private @Nullable Output<String> location;
        private @Nullable Output<String> namespace;
        private @Nullable Output<String> provisioningState;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.clusterExtensionIds = defaults.clusterExtensionIds;
    	      this.displayName = defaults.displayName;
    	      this.hostResourceId = defaults.hostResourceId;
    	      this.hostType = defaults.hostType;
    	      this.location = defaults.location;
    	      this.namespace = defaults.namespace;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.tags = defaults.tags;
        }

        public Builder authentication(@Nullable Output<CustomLocationPropertiesAuthenticationArgs> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder authentication(@Nullable CustomLocationPropertiesAuthenticationArgs authentication) {
            this.authentication = Output.ofNullable(authentication);
            return this;
        }

        public Builder clusterExtensionIds(@Nullable Output<List<String>> clusterExtensionIds) {
            this.clusterExtensionIds = clusterExtensionIds;
            return this;
        }

        public Builder clusterExtensionIds(@Nullable List<String> clusterExtensionIds) {
            this.clusterExtensionIds = Output.ofNullable(clusterExtensionIds);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder hostResourceId(@Nullable Output<String> hostResourceId) {
            this.hostResourceId = hostResourceId;
            return this;
        }

        public Builder hostResourceId(@Nullable String hostResourceId) {
            this.hostResourceId = Output.ofNullable(hostResourceId);
            return this;
        }

        public Builder hostType(@Nullable Output<Either<String,HostType>> hostType) {
            this.hostType = hostType;
            return this;
        }

        public Builder hostType(@Nullable Either<String,HostType> hostType) {
            this.hostType = Output.ofNullable(hostType);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = Output.ofNullable(namespace);
            return this;
        }

        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = Output.ofNullable(provisioningState);
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public CustomLocationArgs build() {
            return new CustomLocationArgs(authentication, clusterExtensionIds, displayName, hostResourceId, hostType, location, namespace, provisioningState, resourceGroupName, resourceName, tags);
        }
    }
}
