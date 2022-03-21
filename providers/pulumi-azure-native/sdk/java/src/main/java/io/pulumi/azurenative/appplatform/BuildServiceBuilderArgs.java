// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.BuilderPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BuildServiceBuilderArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildServiceBuilderArgs Empty = new BuildServiceBuilderArgs();

    /**
     * The name of the build service resource.
     * 
     */
    @Import(name="buildServiceName", required=true)
      private final Output<String> buildServiceName;

    public Output<String> getBuildServiceName() {
        return this.buildServiceName;
    }

    /**
     * The name of the builder resource.
     * 
     */
    @Import(name="builderName")
      private final @Nullable Output<String> builderName;

    public Output<String> getBuilderName() {
        return this.builderName == null ? Output.empty() : this.builderName;
    }

    /**
     * Property of the Builder resource.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<BuilderPropertiesArgs> properties;

    public Output<BuilderPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    public BuildServiceBuilderArgs(
        Output<String> buildServiceName,
        @Nullable Output<String> builderName,
        @Nullable Output<BuilderPropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> serviceName) {
        this.buildServiceName = Objects.requireNonNull(buildServiceName, "expected parameter 'buildServiceName' to be non-null");
        this.builderName = builderName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private BuildServiceBuilderArgs() {
        this.buildServiceName = Output.empty();
        this.builderName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serviceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildServiceBuilderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> buildServiceName;
        private @Nullable Output<String> builderName;
        private @Nullable Output<BuilderPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildServiceBuilderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildServiceName = defaults.buildServiceName;
    	      this.builderName = defaults.builderName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder buildServiceName(Output<String> buildServiceName) {
            this.buildServiceName = Objects.requireNonNull(buildServiceName);
            return this;
        }
        public Builder buildServiceName(String buildServiceName) {
            this.buildServiceName = Output.of(Objects.requireNonNull(buildServiceName));
            return this;
        }
        public Builder builderName(@Nullable Output<String> builderName) {
            this.builderName = builderName;
            return this;
        }
        public Builder builderName(@Nullable String builderName) {
            this.builderName = Output.ofNullable(builderName);
            return this;
        }
        public Builder properties(@Nullable Output<BuilderPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable BuilderPropertiesArgs properties) {
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
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }        public BuildServiceBuilderArgs build() {
            return new BuildServiceBuilderArgs(buildServiceName, builderName, properties, resourceGroupName, serviceName);
        }
    }
}
