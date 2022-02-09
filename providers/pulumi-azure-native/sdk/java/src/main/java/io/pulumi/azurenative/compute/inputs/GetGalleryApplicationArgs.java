// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGalleryApplicationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGalleryApplicationArgs Empty = new GetGalleryApplicationArgs();

    @InputImport(name="galleryApplicationName", required=true)
    private final String galleryApplicationName;

    public String getGalleryApplicationName() {
        return this.galleryApplicationName;
    }

    @InputImport(name="galleryName", required=true)
    private final String galleryName;

    public String getGalleryName() {
        return this.galleryName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetGalleryApplicationArgs(
        String galleryApplicationName,
        String galleryName,
        String resourceGroupName) {
        this.galleryApplicationName = Objects.requireNonNull(galleryApplicationName, "expected parameter 'galleryApplicationName' to be non-null");
        this.galleryName = Objects.requireNonNull(galleryName, "expected parameter 'galleryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetGalleryApplicationArgs() {
        this.galleryApplicationName = null;
        this.galleryName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGalleryApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String galleryApplicationName;
        private String galleryName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGalleryApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.galleryApplicationName = defaults.galleryApplicationName;
    	      this.galleryName = defaults.galleryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setGalleryApplicationName(String galleryApplicationName) {
            this.galleryApplicationName = Objects.requireNonNull(galleryApplicationName);
            return this;
        }

        public Builder setGalleryName(String galleryName) {
            this.galleryName = Objects.requireNonNull(galleryName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetGalleryApplicationArgs build() {
            return new GetGalleryApplicationArgs(galleryApplicationName, galleryName, resourceGroupName);
        }
    }
}
