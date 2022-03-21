// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness;

import io.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSetArgs Empty = new ResourceSetArgs();

    /**
     * Unique name describing the resource set.
     * 
     */
    @Import(name="resourceSetName", required=true)
      private final Output<String> resourceSetName;

    public Output<String> getResourceSetName() {
        return this.resourceSetName;
    }

    /**
     * Type of the resources in the resource set.
     * 
     */
    @Import(name="resourceSetType", required=true)
      private final Output<String> resourceSetType;

    public Output<String> getResourceSetType() {
        return this.resourceSetType;
    }

    /**
     * List of resources to add to this resource set. See below.
     * 
     */
    @Import(name="resources", required=true)
      private final Output<List<ResourceSetResourceArgs>> resources;

    public Output<List<ResourceSetResourceArgs>> getResources() {
        return this.resources;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ResourceSetArgs(
        Output<String> resourceSetName,
        Output<String> resourceSetType,
        Output<List<ResourceSetResourceArgs>> resources,
        @Nullable Output<Map<String,String>> tags) {
        this.resourceSetName = Objects.requireNonNull(resourceSetName, "expected parameter 'resourceSetName' to be non-null");
        this.resourceSetType = Objects.requireNonNull(resourceSetType, "expected parameter 'resourceSetType' to be non-null");
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
        this.tags = tags;
    }

    private ResourceSetArgs() {
        this.resourceSetName = Output.empty();
        this.resourceSetType = Output.empty();
        this.resources = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> resourceSetName;
        private Output<String> resourceSetType;
        private Output<List<ResourceSetResourceArgs>> resources;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceSetName = defaults.resourceSetName;
    	      this.resourceSetType = defaults.resourceSetType;
    	      this.resources = defaults.resources;
    	      this.tags = defaults.tags;
        }

        public Builder resourceSetName(Output<String> resourceSetName) {
            this.resourceSetName = Objects.requireNonNull(resourceSetName);
            return this;
        }
        public Builder resourceSetName(String resourceSetName) {
            this.resourceSetName = Output.of(Objects.requireNonNull(resourceSetName));
            return this;
        }
        public Builder resourceSetType(Output<String> resourceSetType) {
            this.resourceSetType = Objects.requireNonNull(resourceSetType);
            return this;
        }
        public Builder resourceSetType(String resourceSetType) {
            this.resourceSetType = Output.of(Objects.requireNonNull(resourceSetType));
            return this;
        }
        public Builder resources(Output<List<ResourceSetResourceArgs>> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(List<ResourceSetResourceArgs> resources) {
            this.resources = Output.of(Objects.requireNonNull(resources));
            return this;
        }
        public Builder resources(ResourceSetResourceArgs... resources) {
            return resources(List.of(resources));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ResourceSetArgs build() {
            return new ResourceSetArgs(resourceSetName, resourceSetType, resources, tags);
        }
    }
}
