// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devspaces;

import io.pulumi.azurenative.devspaces.inputs.SkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControllerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ControllerArgs Empty = new ControllerArgs();

    /**
     * Region where the Azure resource is located.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Model representing SKU for Azure Dev Spaces Controller.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * Tags for the Azure resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Credentials of the target container host (base64).
     * 
     */
    @Import(name="targetContainerHostCredentialsBase64", required=true)
      private final Output<String> targetContainerHostCredentialsBase64;

    public Output<String> getTargetContainerHostCredentialsBase64() {
        return this.targetContainerHostCredentialsBase64;
    }

    /**
     * Resource ID of the target container host
     * 
     */
    @Import(name="targetContainerHostResourceId", required=true)
      private final Output<String> targetContainerHostResourceId;

    public Output<String> getTargetContainerHostResourceId() {
        return this.targetContainerHostResourceId;
    }

    public ControllerArgs(
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        Output<String> resourceGroupName,
        Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        Output<String> targetContainerHostCredentialsBase64,
        Output<String> targetContainerHostResourceId) {
        this.location = location;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
        this.targetContainerHostCredentialsBase64 = Objects.requireNonNull(targetContainerHostCredentialsBase64, "expected parameter 'targetContainerHostCredentialsBase64' to be non-null");
        this.targetContainerHostResourceId = Objects.requireNonNull(targetContainerHostResourceId, "expected parameter 'targetContainerHostResourceId' to be non-null");
    }

    private ControllerArgs() {
        this.location = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
        this.targetContainerHostCredentialsBase64 = Output.empty();
        this.targetContainerHostResourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControllerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;
        private Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> targetContainerHostCredentialsBase64;
        private Output<String> targetContainerHostResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ControllerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.targetContainerHostCredentialsBase64 = defaults.targetContainerHostCredentialsBase64;
    	      this.targetContainerHostResourceId = defaults.targetContainerHostResourceId;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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
        public Builder sku(Output<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(SkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
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
        public Builder targetContainerHostCredentialsBase64(Output<String> targetContainerHostCredentialsBase64) {
            this.targetContainerHostCredentialsBase64 = Objects.requireNonNull(targetContainerHostCredentialsBase64);
            return this;
        }
        public Builder targetContainerHostCredentialsBase64(String targetContainerHostCredentialsBase64) {
            this.targetContainerHostCredentialsBase64 = Output.of(Objects.requireNonNull(targetContainerHostCredentialsBase64));
            return this;
        }
        public Builder targetContainerHostResourceId(Output<String> targetContainerHostResourceId) {
            this.targetContainerHostResourceId = Objects.requireNonNull(targetContainerHostResourceId);
            return this;
        }
        public Builder targetContainerHostResourceId(String targetContainerHostResourceId) {
            this.targetContainerHostResourceId = Output.of(Objects.requireNonNull(targetContainerHostResourceId));
            return this;
        }        public ControllerArgs build() {
            return new ControllerArgs(location, name, resourceGroupName, sku, tags, targetContainerHostCredentialsBase64, targetContainerHostResourceId);
        }
    }
}
