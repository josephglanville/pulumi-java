// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateLinkScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkScopeArgs Empty = new PrivateLinkScopeArgs();

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Monitor PrivateLinkScope resource.
     * 
     */
    @Import(name="scopeName")
      private final @Nullable Output<String> scopeName;

    public Output<String> getScopeName() {
        return this.scopeName == null ? Output.empty() : this.scopeName;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public PrivateLinkScopeArgs(
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> scopeName,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scopeName = scopeName;
        this.tags = tags;
    }

    private PrivateLinkScopeArgs() {
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.scopeName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> scopeName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scopeName = defaults.scopeName;
    	      this.tags = defaults.tags;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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
        public Builder scopeName(@Nullable Output<String> scopeName) {
            this.scopeName = scopeName;
            return this;
        }
        public Builder scopeName(@Nullable String scopeName) {
            this.scopeName = Output.ofNullable(scopeName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public PrivateLinkScopeArgs build() {
            return new PrivateLinkScopeArgs(location, resourceGroupName, scopeName, tags);
        }
    }
}
