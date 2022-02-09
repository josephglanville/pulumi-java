// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.outputs;

import io.pulumi.azurenative.azurestack.outputs.DataDiskImageResponse;
import io.pulumi.azurenative.azurestack.outputs.OsDiskImageResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListProductDetailsResult {
    private final String computeRole;
    private final List<DataDiskImageResponse> dataDiskImages;
    private final String galleryPackageBlobSasUri;
    private final Boolean isSystemExtension;
    private final OsDiskImageResponse osDiskImage;
    private final String productKind;
    private final Boolean supportMultipleExtensions;
    private final String uri;
    private final String version;
    private final String vmOsType;
    private final Boolean vmScaleSetEnabled;

    @OutputCustomType.Constructor({"computeRole","dataDiskImages","galleryPackageBlobSasUri","isSystemExtension","osDiskImage","productKind","supportMultipleExtensions","uri","version","vmOsType","vmScaleSetEnabled"})
    private ListProductDetailsResult(
        String computeRole,
        List<DataDiskImageResponse> dataDiskImages,
        String galleryPackageBlobSasUri,
        Boolean isSystemExtension,
        OsDiskImageResponse osDiskImage,
        String productKind,
        Boolean supportMultipleExtensions,
        String uri,
        String version,
        String vmOsType,
        Boolean vmScaleSetEnabled) {
        this.computeRole = Objects.requireNonNull(computeRole);
        this.dataDiskImages = Objects.requireNonNull(dataDiskImages);
        this.galleryPackageBlobSasUri = Objects.requireNonNull(galleryPackageBlobSasUri);
        this.isSystemExtension = Objects.requireNonNull(isSystemExtension);
        this.osDiskImage = Objects.requireNonNull(osDiskImage);
        this.productKind = Objects.requireNonNull(productKind);
        this.supportMultipleExtensions = Objects.requireNonNull(supportMultipleExtensions);
        this.uri = Objects.requireNonNull(uri);
        this.version = Objects.requireNonNull(version);
        this.vmOsType = Objects.requireNonNull(vmOsType);
        this.vmScaleSetEnabled = Objects.requireNonNull(vmScaleSetEnabled);
    }

    public String getComputeRole() {
        return this.computeRole;
    }
    public List<DataDiskImageResponse> getDataDiskImages() {
        return this.dataDiskImages;
    }
    public String getGalleryPackageBlobSasUri() {
        return this.galleryPackageBlobSasUri;
    }
    public Boolean getIsSystemExtension() {
        return this.isSystemExtension;
    }
    public OsDiskImageResponse getOsDiskImage() {
        return this.osDiskImage;
    }
    public String getProductKind() {
        return this.productKind;
    }
    public Boolean getSupportMultipleExtensions() {
        return this.supportMultipleExtensions;
    }
    public String getUri() {
        return this.uri;
    }
    public String getVersion() {
        return this.version;
    }
    public String getVmOsType() {
        return this.vmOsType;
    }
    public Boolean getVmScaleSetEnabled() {
        return this.vmScaleSetEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListProductDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computeRole;
        private List<DataDiskImageResponse> dataDiskImages;
        private String galleryPackageBlobSasUri;
        private Boolean isSystemExtension;
        private OsDiskImageResponse osDiskImage;
        private String productKind;
        private Boolean supportMultipleExtensions;
        private String uri;
        private String version;
        private String vmOsType;
        private Boolean vmScaleSetEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ListProductDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeRole = defaults.computeRole;
    	      this.dataDiskImages = defaults.dataDiskImages;
    	      this.galleryPackageBlobSasUri = defaults.galleryPackageBlobSasUri;
    	      this.isSystemExtension = defaults.isSystemExtension;
    	      this.osDiskImage = defaults.osDiskImage;
    	      this.productKind = defaults.productKind;
    	      this.supportMultipleExtensions = defaults.supportMultipleExtensions;
    	      this.uri = defaults.uri;
    	      this.version = defaults.version;
    	      this.vmOsType = defaults.vmOsType;
    	      this.vmScaleSetEnabled = defaults.vmScaleSetEnabled;
        }

        public Builder setComputeRole(String computeRole) {
            this.computeRole = Objects.requireNonNull(computeRole);
            return this;
        }

        public Builder setDataDiskImages(List<DataDiskImageResponse> dataDiskImages) {
            this.dataDiskImages = Objects.requireNonNull(dataDiskImages);
            return this;
        }

        public Builder setGalleryPackageBlobSasUri(String galleryPackageBlobSasUri) {
            this.galleryPackageBlobSasUri = Objects.requireNonNull(galleryPackageBlobSasUri);
            return this;
        }

        public Builder setIsSystemExtension(Boolean isSystemExtension) {
            this.isSystemExtension = Objects.requireNonNull(isSystemExtension);
            return this;
        }

        public Builder setOsDiskImage(OsDiskImageResponse osDiskImage) {
            this.osDiskImage = Objects.requireNonNull(osDiskImage);
            return this;
        }

        public Builder setProductKind(String productKind) {
            this.productKind = Objects.requireNonNull(productKind);
            return this;
        }

        public Builder setSupportMultipleExtensions(Boolean supportMultipleExtensions) {
            this.supportMultipleExtensions = Objects.requireNonNull(supportMultipleExtensions);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVmOsType(String vmOsType) {
            this.vmOsType = Objects.requireNonNull(vmOsType);
            return this;
        }

        public Builder setVmScaleSetEnabled(Boolean vmScaleSetEnabled) {
            this.vmScaleSetEnabled = Objects.requireNonNull(vmScaleSetEnabled);
            return this;
        }

        public ListProductDetailsResult build() {
            return new ListProductDetailsResult(computeRole, dataDiskImages, galleryPackageBlobSasUri, isSystemExtension, osDiskImage, productKind, supportMultipleExtensions, uri, version, vmOsType, vmScaleSetEnabled);
        }
    }
}
