// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager;

import io.pulumi.azurenative.deploymentmanager.enums.DeploymentMode;
import io.pulumi.azurenative.deploymentmanager.inputs.ServiceUnitArtifactsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceUnitArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceUnitArgs Empty = new ServiceUnitArgs();

    @InputImport(name="artifacts")
    private final @Nullable Input<ServiceUnitArtifactsArgs> artifacts;

    public Input<ServiceUnitArtifactsArgs> getArtifacts() {
        return this.artifacts == null ? Input.empty() : this.artifacts;
    }

    @InputImport(name="deploymentMode", required=true)
    private final Input<DeploymentMode> deploymentMode;

    public Input<DeploymentMode> getDeploymentMode() {
        return this.deploymentMode;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
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

    @InputImport(name="serviceTopologyName", required=true)
    private final Input<String> serviceTopologyName;

    public Input<String> getServiceTopologyName() {
        return this.serviceTopologyName;
    }

    @InputImport(name="serviceUnitName")
    private final @Nullable Input<String> serviceUnitName;

    public Input<String> getServiceUnitName() {
        return this.serviceUnitName == null ? Input.empty() : this.serviceUnitName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="targetResourceGroup", required=true)
    private final Input<String> targetResourceGroup;

    public Input<String> getTargetResourceGroup() {
        return this.targetResourceGroup;
    }

    public ServiceUnitArgs(
        @Nullable Input<ServiceUnitArtifactsArgs> artifacts,
        Input<DeploymentMode> deploymentMode,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        Input<String> serviceTopologyName,
        @Nullable Input<String> serviceUnitName,
        @Nullable Input<Map<String,String>> tags,
        Input<String> targetResourceGroup) {
        this.artifacts = artifacts;
        this.deploymentMode = Objects.requireNonNull(deploymentMode, "expected parameter 'deploymentMode' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.serviceTopologyName = Objects.requireNonNull(serviceTopologyName, "expected parameter 'serviceTopologyName' to be non-null");
        this.serviceUnitName = serviceUnitName;
        this.tags = tags;
        this.targetResourceGroup = Objects.requireNonNull(targetResourceGroup, "expected parameter 'targetResourceGroup' to be non-null");
    }

    private ServiceUnitArgs() {
        this.artifacts = Input.empty();
        this.deploymentMode = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.serviceTopologyName = Input.empty();
        this.serviceUnitName = Input.empty();
        this.tags = Input.empty();
        this.targetResourceGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceUnitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceUnitArtifactsArgs> artifacts;
        private Input<DeploymentMode> deploymentMode;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private Input<String> serviceTopologyName;
        private @Nullable Input<String> serviceUnitName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> targetResourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceUnitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.deploymentMode = defaults.deploymentMode;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceTopologyName = defaults.serviceTopologyName;
    	      this.serviceUnitName = defaults.serviceUnitName;
    	      this.tags = defaults.tags;
    	      this.targetResourceGroup = defaults.targetResourceGroup;
        }

        public Builder setArtifacts(@Nullable Input<ServiceUnitArtifactsArgs> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder setArtifacts(@Nullable ServiceUnitArtifactsArgs artifacts) {
            this.artifacts = Input.ofNullable(artifacts);
            return this;
        }

        public Builder setDeploymentMode(Input<DeploymentMode> deploymentMode) {
            this.deploymentMode = Objects.requireNonNull(deploymentMode);
            return this;
        }

        public Builder setDeploymentMode(DeploymentMode deploymentMode) {
            this.deploymentMode = Input.of(Objects.requireNonNull(deploymentMode));
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

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setServiceTopologyName(Input<String> serviceTopologyName) {
            this.serviceTopologyName = Objects.requireNonNull(serviceTopologyName);
            return this;
        }

        public Builder setServiceTopologyName(String serviceTopologyName) {
            this.serviceTopologyName = Input.of(Objects.requireNonNull(serviceTopologyName));
            return this;
        }

        public Builder setServiceUnitName(@Nullable Input<String> serviceUnitName) {
            this.serviceUnitName = serviceUnitName;
            return this;
        }

        public Builder setServiceUnitName(@Nullable String serviceUnitName) {
            this.serviceUnitName = Input.ofNullable(serviceUnitName);
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

        public Builder setTargetResourceGroup(Input<String> targetResourceGroup) {
            this.targetResourceGroup = Objects.requireNonNull(targetResourceGroup);
            return this;
        }

        public Builder setTargetResourceGroup(String targetResourceGroup) {
            this.targetResourceGroup = Input.of(Objects.requireNonNull(targetResourceGroup));
            return this;
        }

        public ServiceUnitArgs build() {
            return new ServiceUnitArgs(artifacts, deploymentMode, location, resourceGroupName, serviceName, serviceTopologyName, serviceUnitName, tags, targetResourceGroup);
        }
    }
}
