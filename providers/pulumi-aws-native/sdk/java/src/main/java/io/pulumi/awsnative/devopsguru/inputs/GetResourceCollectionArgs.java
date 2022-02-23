// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru.inputs;

import io.pulumi.awsnative.devopsguru.enums.ResourceCollectionType;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class GetResourceCollectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResourceCollectionArgs Empty = new GetResourceCollectionArgs();

    /**
     * The type of ResourceCollection
     * 
     */
    @InputImport(name="resourceCollectionType", required=true)
      private final ResourceCollectionType resourceCollectionType;

    public ResourceCollectionType getResourceCollectionType() {
        return this.resourceCollectionType;
    }

    public GetResourceCollectionArgs(ResourceCollectionType resourceCollectionType) {
        this.resourceCollectionType = Objects.requireNonNull(resourceCollectionType, "expected parameter 'resourceCollectionType' to be non-null");
    }

    private GetResourceCollectionArgs() {
        this.resourceCollectionType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceCollectionType resourceCollectionType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceCollectionType = defaults.resourceCollectionType;
        }

        public Builder setResourceCollectionType(ResourceCollectionType resourceCollectionType) {
            this.resourceCollectionType = Objects.requireNonNull(resourceCollectionType);
            return this;
        }
        public GetResourceCollectionArgs build() {
            return new GetResourceCollectionArgs(resourceCollectionType);
        }
    }
}
