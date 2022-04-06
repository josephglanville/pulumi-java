// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String imageDigest;
    /**
     * The date and time, expressed as a unix timestamp, at which the current image was pushed to the repository.
     * 
     */
    private final Integer imagePushedAt;
    /**
     * The size, in bytes, of the image in the repository.
     * 
     */
    private final Integer imageSizeInBytes;
    private final @Nullable String imageTag;
    /**
     * The list of tags associated with this image.
     * 
     */
    private final List<String> imageTags;
    private final String registryId;
    private final String repositoryName;

    @CustomType.Constructor
    private GetImageResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageDigest") String imageDigest,
        @CustomType.Parameter("imagePushedAt") Integer imagePushedAt,
        @CustomType.Parameter("imageSizeInBytes") Integer imageSizeInBytes,
        @CustomType.Parameter("imageTag") @Nullable String imageTag,
        @CustomType.Parameter("imageTags") List<String> imageTags,
        @CustomType.Parameter("registryId") String registryId,
        @CustomType.Parameter("repositoryName") String repositoryName) {
        this.id = id;
        this.imageDigest = imageDigest;
        this.imagePushedAt = imagePushedAt;
        this.imageSizeInBytes = imageSizeInBytes;
        this.imageTag = imageTag;
        this.imageTags = imageTags;
        this.registryId = registryId;
        this.repositoryName = repositoryName;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }
    /**
     * The date and time, expressed as a unix timestamp, at which the current image was pushed to the repository.
     * 
    */
    public Integer getImagePushedAt() {
        return this.imagePushedAt;
    }
    /**
     * The size, in bytes, of the image in the repository.
     * 
    */
    public Integer getImageSizeInBytes() {
        return this.imageSizeInBytes;
    }
    public Optional<String> getImageTag() {
        return Optional.ofNullable(this.imageTag);
    }
    /**
     * The list of tags associated with this image.
     * 
    */
    public List<String> getImageTags() {
        return this.imageTags;
    }
    public String getRegistryId() {
        return this.registryId;
    }
    public String getRepositoryName() {
        return this.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String imageDigest;
        private Integer imagePushedAt;
        private Integer imageSizeInBytes;
        private @Nullable String imageTag;
        private List<String> imageTags;
        private String registryId;
        private String repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.imageDigest = defaults.imageDigest;
    	      this.imagePushedAt = defaults.imagePushedAt;
    	      this.imageSizeInBytes = defaults.imageSizeInBytes;
    	      this.imageTag = defaults.imageTag;
    	      this.imageTags = defaults.imageTags;
    	      this.registryId = defaults.registryId;
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageDigest(String imageDigest) {
            this.imageDigest = Objects.requireNonNull(imageDigest);
            return this;
        }
        public Builder imagePushedAt(Integer imagePushedAt) {
            this.imagePushedAt = Objects.requireNonNull(imagePushedAt);
            return this;
        }
        public Builder imageSizeInBytes(Integer imageSizeInBytes) {
            this.imageSizeInBytes = Objects.requireNonNull(imageSizeInBytes);
            return this;
        }
        public Builder imageTag(@Nullable String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public Builder imageTags(List<String> imageTags) {
            this.imageTags = Objects.requireNonNull(imageTags);
            return this;
        }
        public Builder imageTags(String... imageTags) {
            return imageTags(List.of(imageTags));
        }
        public Builder registryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }        public GetImageResult build() {
            return new GetImageResult(id, imageDigest, imagePushedAt, imageSizeInBytes, imageTag, imageTags, registryId, repositoryName);
        }
    }
}