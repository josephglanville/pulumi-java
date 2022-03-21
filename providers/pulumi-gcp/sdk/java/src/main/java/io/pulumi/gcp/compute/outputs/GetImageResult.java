// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageResult {
    /**
     * The size of the image tar.gz archive stored in Google Cloud Storage in bytes.
     * 
     */
    private final Integer archiveSizeBytes;
    /**
     * The creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this image.
     * 
     */
    private final String description;
    /**
     * The size of the image when restored onto a persistent disk in gigabytes.
     * 
     */
    private final Integer diskSizeGb;
    /**
     * The family name of the image.
     * 
     */
    private final String family;
    private final @Nullable String filter;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * encoded SHA-256 hash of the [customer-supplied encryption key](https://cloud.google.com/compute/docs/disks/customer-supplied-encryption)
     * that protects this image.
     * 
     */
    private final String imageEncryptionKeySha256;
    /**
     * The unique identifier for the image.
     * 
     */
    private final String imageId;
    /**
     * A fingerprint for the labels being applied to this image.
     * 
     */
    private final String labelFingerprint;
    /**
     * A map of labels applied to this image.
     * 
     */
    private final Map<String,String> labels;
    /**
     * A list of applicable license URI.
     * 
     */
    private final List<String> licenses;
    /**
     * The name of the image.
     * 
     */
    private final String name;
    private final String project;
    /**
     * The URI of the image.
     * 
     */
    private final String selfLink;
    /**
     * The URL of the source disk used to create this image.
     * 
     */
    private final String sourceDisk;
    /**
     * The [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * encoded SHA-256 hash of the [customer-supplied encryption key](https://cloud.google.com/compute/docs/disks/customer-supplied-encryption)
     * that protects this image.
     * 
     */
    private final String sourceDiskEncryptionKeySha256;
    /**
     * The ID value of the disk used to create this image.
     * 
     */
    private final String sourceDiskId;
    /**
     * The ID value of the image used to create this image.
     * 
     */
    private final String sourceImageId;
    /**
     * The status of the image. Possible values are **FAILED**, **PENDING**, or **READY**.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetImageResult(
        @CustomType.Parameter("archiveSizeBytes") Integer archiveSizeBytes,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("diskSizeGb") Integer diskSizeGb,
        @CustomType.Parameter("family") String family,
        @CustomType.Parameter("filter") @Nullable String filter,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageEncryptionKeySha256") String imageEncryptionKeySha256,
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("labelFingerprint") String labelFingerprint,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("licenses") List<String> licenses,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("sourceDisk") String sourceDisk,
        @CustomType.Parameter("sourceDiskEncryptionKeySha256") String sourceDiskEncryptionKeySha256,
        @CustomType.Parameter("sourceDiskId") String sourceDiskId,
        @CustomType.Parameter("sourceImageId") String sourceImageId,
        @CustomType.Parameter("status") String status) {
        this.archiveSizeBytes = archiveSizeBytes;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.diskSizeGb = diskSizeGb;
        this.family = family;
        this.filter = filter;
        this.id = id;
        this.imageEncryptionKeySha256 = imageEncryptionKeySha256;
        this.imageId = imageId;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.licenses = licenses;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.sourceDisk = sourceDisk;
        this.sourceDiskEncryptionKeySha256 = sourceDiskEncryptionKeySha256;
        this.sourceDiskId = sourceDiskId;
        this.sourceImageId = sourceImageId;
        this.status = status;
    }

    /**
     * The size of the image tar.gz archive stored in Google Cloud Storage in bytes.
     * 
    */
    public Integer getArchiveSizeBytes() {
        return this.archiveSizeBytes;
    }
    /**
     * The creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this image.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The size of the image when restored onto a persistent disk in gigabytes.
     * 
    */
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * The family name of the image.
     * 
    */
    public String getFamily() {
        return this.family;
    }
    public Optional<String> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * encoded SHA-256 hash of the [customer-supplied encryption key](https://cloud.google.com/compute/docs/disks/customer-supplied-encryption)
     * that protects this image.
     * 
    */
    public String getImageEncryptionKeySha256() {
        return this.imageEncryptionKeySha256;
    }
    /**
     * The unique identifier for the image.
     * 
    */
    public String getImageId() {
        return this.imageId;
    }
    /**
     * A fingerprint for the labels being applied to this image.
     * 
    */
    public String getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * A map of labels applied to this image.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * A list of applicable license URI.
     * 
    */
    public List<String> getLicenses() {
        return this.licenses;
    }
    /**
     * The name of the image.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getProject() {
        return this.project;
    }
    /**
     * The URI of the image.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The URL of the source disk used to create this image.
     * 
    */
    public String getSourceDisk() {
        return this.sourceDisk;
    }
    /**
     * The [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * encoded SHA-256 hash of the [customer-supplied encryption key](https://cloud.google.com/compute/docs/disks/customer-supplied-encryption)
     * that protects this image.
     * 
    */
    public String getSourceDiskEncryptionKeySha256() {
        return this.sourceDiskEncryptionKeySha256;
    }
    /**
     * The ID value of the disk used to create this image.
     * 
    */
    public String getSourceDiskId() {
        return this.sourceDiskId;
    }
    /**
     * The ID value of the image used to create this image.
     * 
    */
    public String getSourceImageId() {
        return this.sourceImageId;
    }
    /**
     * The status of the image. Possible values are **FAILED**, **PENDING**, or **READY**.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer archiveSizeBytes;
        private String creationTimestamp;
        private String description;
        private Integer diskSizeGb;
        private String family;
        private @Nullable String filter;
        private String id;
        private String imageEncryptionKeySha256;
        private String imageId;
        private String labelFingerprint;
        private Map<String,String> labels;
        private List<String> licenses;
        private String name;
        private String project;
        private String selfLink;
        private String sourceDisk;
        private String sourceDiskEncryptionKeySha256;
        private String sourceDiskId;
        private String sourceImageId;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveSizeBytes = defaults.archiveSizeBytes;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.family = defaults.family;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.imageEncryptionKeySha256 = defaults.imageEncryptionKeySha256;
    	      this.imageId = defaults.imageId;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.licenses = defaults.licenses;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskEncryptionKeySha256 = defaults.sourceDiskEncryptionKeySha256;
    	      this.sourceDiskId = defaults.sourceDiskId;
    	      this.sourceImageId = defaults.sourceImageId;
    	      this.status = defaults.status;
        }

        public Builder archiveSizeBytes(Integer archiveSizeBytes) {
            this.archiveSizeBytes = Objects.requireNonNull(archiveSizeBytes);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder family(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageEncryptionKeySha256(String imageEncryptionKeySha256) {
            this.imageEncryptionKeySha256 = Objects.requireNonNull(imageEncryptionKeySha256);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder labelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder licenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder sourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }
        public Builder sourceDiskEncryptionKeySha256(String sourceDiskEncryptionKeySha256) {
            this.sourceDiskEncryptionKeySha256 = Objects.requireNonNull(sourceDiskEncryptionKeySha256);
            return this;
        }
        public Builder sourceDiskId(String sourceDiskId) {
            this.sourceDiskId = Objects.requireNonNull(sourceDiskId);
            return this;
        }
        public Builder sourceImageId(String sourceImageId) {
            this.sourceImageId = Objects.requireNonNull(sourceImageId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetImageResult build() {
            return new GetImageResult(archiveSizeBytes, creationTimestamp, description, diskSizeGb, family, filter, id, imageEncryptionKeySha256, imageId, labelFingerprint, labels, licenses, name, project, selfLink, sourceDisk, sourceDiskEncryptionKeySha256, sourceDiskId, sourceImageId, status);
        }
    }
}
