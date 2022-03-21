// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Azure Container Registry.
 * 
 */
public final class ContainerRegistryPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerRegistryPropertiesResponse Empty = new ContainerRegistryPropertiesResponse();

    /**
     * ARM resource ID of the Azure Container Registry used to store Docker images for web services in the cluster. If not provided one will be created. This cannot be changed once the cluster is created.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public ContainerRegistryPropertiesResponse(@Nullable String resourceId) {
        this.resourceId = resourceId;
    }

    private ContainerRegistryPropertiesResponse() {
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRegistryPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRegistryPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public ContainerRegistryPropertiesResponse build() {
            return new ContainerRegistryPropertiesResponse(resourceId);
        }
    }
}
