// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ImageRawDiskResponse {
    /**
     * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
     * 
     */
    private final String containerType;
    /**
     * The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    private final String source;

    @CustomType.Constructor
    private ImageRawDiskResponse(
        @CustomType.Parameter("containerType") String containerType,
        @CustomType.Parameter("source") String source) {
        this.containerType = containerType;
        this.source = source;
    }

    /**
     * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
     * 
    */
    public String getContainerType() {
        return this.containerType;
    }
    /**
     * The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
    */
    public String getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRawDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerType;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRawDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerType = defaults.containerType;
    	      this.source = defaults.source;
        }

        public Builder containerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }        public ImageRawDiskResponse build() {
            return new ImageRawDiskResponse(containerType, source);
        }
    }
}
