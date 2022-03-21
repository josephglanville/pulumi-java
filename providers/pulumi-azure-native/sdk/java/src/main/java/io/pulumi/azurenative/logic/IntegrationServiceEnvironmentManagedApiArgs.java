// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs;
import io.pulumi.azurenative.logic.inputs.ResourceReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationServiceEnvironmentManagedApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceEnvironmentManagedApiArgs Empty = new IntegrationServiceEnvironmentManagedApiArgs();

    /**
     * The api name.
     * 
     */
    @Import(name="apiName")
      private final @Nullable Output<String> apiName;

    public Output<String> getApiName() {
        return this.apiName == null ? Output.empty() : this.apiName;
    }

    /**
     * The integration service environment managed api deployment parameters.
     * 
     */
    @Import(name="deploymentParameters")
      private final @Nullable Output<IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs> deploymentParameters;

    public Output<IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs> getDeploymentParameters() {
        return this.deploymentParameters == null ? Output.empty() : this.deploymentParameters;
    }

    /**
     * The integration service environment reference.
     * 
     */
    @Import(name="integrationServiceEnvironment")
      private final @Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment;

    public Output<ResourceReferenceArgs> getIntegrationServiceEnvironment() {
        return this.integrationServiceEnvironment == null ? Output.empty() : this.integrationServiceEnvironment;
    }

    /**
     * The integration service environment name.
     * 
     */
    @Import(name="integrationServiceEnvironmentName", required=true)
      private final Output<String> integrationServiceEnvironmentName;

    public Output<String> getIntegrationServiceEnvironmentName() {
        return this.integrationServiceEnvironmentName;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroup", required=true)
      private final Output<String> resourceGroup;

    public Output<String> getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public IntegrationServiceEnvironmentManagedApiArgs(
        @Nullable Output<String> apiName,
        @Nullable Output<IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs> deploymentParameters,
        @Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment,
        Output<String> integrationServiceEnvironmentName,
        @Nullable Output<String> location,
        Output<String> resourceGroup,
        @Nullable Output<Map<String,String>> tags) {
        this.apiName = apiName;
        this.deploymentParameters = deploymentParameters;
        this.integrationServiceEnvironment = integrationServiceEnvironment;
        this.integrationServiceEnvironmentName = Objects.requireNonNull(integrationServiceEnvironmentName, "expected parameter 'integrationServiceEnvironmentName' to be non-null");
        this.location = location;
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
        this.tags = tags;
    }

    private IntegrationServiceEnvironmentManagedApiArgs() {
        this.apiName = Output.empty();
        this.deploymentParameters = Output.empty();
        this.integrationServiceEnvironment = Output.empty();
        this.integrationServiceEnvironmentName = Output.empty();
        this.location = Output.empty();
        this.resourceGroup = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmentManagedApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiName;
        private @Nullable Output<IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs> deploymentParameters;
        private @Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment;
        private Output<String> integrationServiceEnvironmentName;
        private @Nullable Output<String> location;
        private Output<String> resourceGroup;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmentManagedApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiName = defaults.apiName;
    	      this.deploymentParameters = defaults.deploymentParameters;
    	      this.integrationServiceEnvironment = defaults.integrationServiceEnvironment;
    	      this.integrationServiceEnvironmentName = defaults.integrationServiceEnvironmentName;
    	      this.location = defaults.location;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.tags = defaults.tags;
        }

        public Builder apiName(@Nullable Output<String> apiName) {
            this.apiName = apiName;
            return this;
        }
        public Builder apiName(@Nullable String apiName) {
            this.apiName = Output.ofNullable(apiName);
            return this;
        }
        public Builder deploymentParameters(@Nullable Output<IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs> deploymentParameters) {
            this.deploymentParameters = deploymentParameters;
            return this;
        }
        public Builder deploymentParameters(@Nullable IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs deploymentParameters) {
            this.deploymentParameters = Output.ofNullable(deploymentParameters);
            return this;
        }
        public Builder integrationServiceEnvironment(@Nullable Output<ResourceReferenceArgs> integrationServiceEnvironment) {
            this.integrationServiceEnvironment = integrationServiceEnvironment;
            return this;
        }
        public Builder integrationServiceEnvironment(@Nullable ResourceReferenceArgs integrationServiceEnvironment) {
            this.integrationServiceEnvironment = Output.ofNullable(integrationServiceEnvironment);
            return this;
        }
        public Builder integrationServiceEnvironmentName(Output<String> integrationServiceEnvironmentName) {
            this.integrationServiceEnvironmentName = Objects.requireNonNull(integrationServiceEnvironmentName);
            return this;
        }
        public Builder integrationServiceEnvironmentName(String integrationServiceEnvironmentName) {
            this.integrationServiceEnvironmentName = Output.of(Objects.requireNonNull(integrationServiceEnvironmentName));
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
        public Builder resourceGroup(Output<String> resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Output.of(Objects.requireNonNull(resourceGroup));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public IntegrationServiceEnvironmentManagedApiArgs build() {
            return new IntegrationServiceEnvironmentManagedApiArgs(apiName, deploymentParameters, integrationServiceEnvironment, integrationServiceEnvironmentName, location, resourceGroup, tags);
        }
    }
}
