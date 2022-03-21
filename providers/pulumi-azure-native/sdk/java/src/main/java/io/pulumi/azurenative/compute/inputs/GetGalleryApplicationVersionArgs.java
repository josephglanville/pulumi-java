// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGalleryApplicationVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGalleryApplicationVersionArgs Empty = new GetGalleryApplicationVersionArgs();

    /**
     * The expand expression to apply on the operation.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the gallery Application Definition in which the Application Version resides.
     * 
     */
    @Import(name="galleryApplicationName", required=true)
      private final String galleryApplicationName;

    public String getGalleryApplicationName() {
        return this.galleryApplicationName;
    }

    /**
     * The name of the gallery Application Version to be retrieved.
     * 
     */
    @Import(name="galleryApplicationVersionName", required=true)
      private final String galleryApplicationVersionName;

    public String getGalleryApplicationVersionName() {
        return this.galleryApplicationVersionName;
    }

    /**
     * The name of the Shared Application Gallery in which the Application Definition resides.
     * 
     */
    @Import(name="galleryName", required=true)
      private final String galleryName;

    public String getGalleryName() {
        return this.galleryName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetGalleryApplicationVersionArgs(
        @Nullable String expand,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        String galleryName,
        String resourceGroupName) {
        this.expand = expand;
        this.galleryApplicationName = Objects.requireNonNull(galleryApplicationName, "expected parameter 'galleryApplicationName' to be non-null");
        this.galleryApplicationVersionName = Objects.requireNonNull(galleryApplicationVersionName, "expected parameter 'galleryApplicationVersionName' to be non-null");
        this.galleryName = Objects.requireNonNull(galleryName, "expected parameter 'galleryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetGalleryApplicationVersionArgs() {
        this.expand = null;
        this.galleryApplicationName = null;
        this.galleryApplicationVersionName = null;
        this.galleryName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGalleryApplicationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String galleryApplicationName;
        private String galleryApplicationVersionName;
        private String galleryName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGalleryApplicationVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.galleryApplicationName = defaults.galleryApplicationName;
    	      this.galleryApplicationVersionName = defaults.galleryApplicationVersionName;
    	      this.galleryName = defaults.galleryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder galleryApplicationName(String galleryApplicationName) {
            this.galleryApplicationName = Objects.requireNonNull(galleryApplicationName);
            return this;
        }
        public Builder galleryApplicationVersionName(String galleryApplicationVersionName) {
            this.galleryApplicationVersionName = Objects.requireNonNull(galleryApplicationVersionName);
            return this;
        }
        public Builder galleryName(String galleryName) {
            this.galleryName = Objects.requireNonNull(galleryName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetGalleryApplicationVersionArgs build() {
            return new GetGalleryApplicationVersionArgs(expand, galleryApplicationName, galleryApplicationVersionName, galleryName, resourceGroupName);
        }
    }
}
