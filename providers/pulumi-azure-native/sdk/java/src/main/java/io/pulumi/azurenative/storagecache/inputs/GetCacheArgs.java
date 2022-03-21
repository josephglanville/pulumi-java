// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCacheArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCacheArgs Empty = new GetCacheArgs();

    /**
     * Name of Cache. Length of name must not be greater than 80 and chars must be from the [-0-9a-zA-Z_] char class.
     * 
     */
    @Import(name="cacheName", required=true)
      private final String cacheName;

    public String getCacheName() {
        return this.cacheName;
    }

    /**
     * Target resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetCacheArgs(
        String cacheName,
        String resourceGroupName) {
        this.cacheName = Objects.requireNonNull(cacheName, "expected parameter 'cacheName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetCacheArgs() {
        this.cacheName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cacheName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCacheArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheName = defaults.cacheName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder cacheName(String cacheName) {
            this.cacheName = Objects.requireNonNull(cacheName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetCacheArgs build() {
            return new GetCacheArgs(cacheName, resourceGroupName);
        }
    }
}
