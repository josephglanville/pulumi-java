// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Artifacts.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Artifacts.outputs.GetContainerImageLayer;
import com.pulumi.oci.Artifacts.outputs.GetContainerImageVersion;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetContainerImageResult {
    /**
     * @return The compartment OCID to which the container image belongs. Inferred from the container repository.
     * 
     */
    private final String compartmentId;
    /**
     * @return The OCID of the user or principal that pushed the version.
     * 
     */
    private final String createdBy;
    /**
     * @return The sha256 digest of the image layer.
     * 
     */
    private final String digest;
    /**
     * @return The repository name and the most recent version associated with the image. If there are no versions associated with the image, then last known version and digest are used instead. If the last known version is unavailable, then &#39;unknown&#39; is used instead of the version.  Example: `ubuntu:latest` or `ubuntu:latest@sha256:45b23dee08af5e43a7fea6c4cf9c25ccf269ee113168c19722f87876677c5cb2`
     * 
     */
    private final String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String imageId;
    /**
     * @return Layers of which the image is composed, ordered by the layer digest.
     * 
     */
    private final List<GetContainerImageLayer> layers;
    /**
     * @return The total size of the container image layers in bytes.
     * 
     */
    private final String layersSizeInBytes;
    /**
     * @return The size of the container image manifest in bytes.
     * 
     */
    private final Integer manifestSizeInBytes;
    /**
     * @return Total number of pulls.
     * 
     */
    private final String pullCount;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container repository.
     * 
     */
    private final String repositoryId;
    /**
     * @return The container repository name.
     * 
     */
    private final String repositoryName;
    /**
     * @return The current state of the container image.
     * 
     */
    private final String state;
    /**
     * @return The creation time of the version.
     * 
     */
    private final String timeCreated;
    /**
     * @return An RFC 3339 timestamp indicating when the image was last pulled.
     * 
     */
    private final String timeLastPulled;
    /**
     * @return The version name.
     * 
     */
    private final String version;
    /**
     * @return The versions associated with this image.
     * 
     */
    private final List<GetContainerImageVersion> versions;

    @CustomType.Constructor
    private GetContainerImageResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("createdBy") String createdBy,
        @CustomType.Parameter("digest") String digest,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("layers") List<GetContainerImageLayer> layers,
        @CustomType.Parameter("layersSizeInBytes") String layersSizeInBytes,
        @CustomType.Parameter("manifestSizeInBytes") Integer manifestSizeInBytes,
        @CustomType.Parameter("pullCount") String pullCount,
        @CustomType.Parameter("repositoryId") String repositoryId,
        @CustomType.Parameter("repositoryName") String repositoryName,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeLastPulled") String timeLastPulled,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("versions") List<GetContainerImageVersion> versions) {
        this.compartmentId = compartmentId;
        this.createdBy = createdBy;
        this.digest = digest;
        this.displayName = displayName;
        this.id = id;
        this.imageId = imageId;
        this.layers = layers;
        this.layersSizeInBytes = layersSizeInBytes;
        this.manifestSizeInBytes = manifestSizeInBytes;
        this.pullCount = pullCount;
        this.repositoryId = repositoryId;
        this.repositoryName = repositoryName;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeLastPulled = timeLastPulled;
        this.version = version;
        this.versions = versions;
    }

    /**
     * @return The compartment OCID to which the container image belongs. Inferred from the container repository.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The OCID of the user or principal that pushed the version.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return The sha256 digest of the image layer.
     * 
     */
    public String digest() {
        return this.digest;
    }
    /**
     * @return The repository name and the most recent version associated with the image. If there are no versions associated with the image, then last known version and digest are used instead. If the last known version is unavailable, then &#39;unknown&#39; is used instead of the version.  Example: `ubuntu:latest` or `ubuntu:latest@sha256:45b23dee08af5e43a7fea6c4cf9c25ccf269ee113168c19722f87876677c5cb2`
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return Layers of which the image is composed, ordered by the layer digest.
     * 
     */
    public List<GetContainerImageLayer> layers() {
        return this.layers;
    }
    /**
     * @return The total size of the container image layers in bytes.
     * 
     */
    public String layersSizeInBytes() {
        return this.layersSizeInBytes;
    }
    /**
     * @return The size of the container image manifest in bytes.
     * 
     */
    public Integer manifestSizeInBytes() {
        return this.manifestSizeInBytes;
    }
    /**
     * @return Total number of pulls.
     * 
     */
    public String pullCount() {
        return this.pullCount;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container repository.
     * 
     */
    public String repositoryId() {
        return this.repositoryId;
    }
    /**
     * @return The container repository name.
     * 
     */
    public String repositoryName() {
        return this.repositoryName;
    }
    /**
     * @return The current state of the container image.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The creation time of the version.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return An RFC 3339 timestamp indicating when the image was last pulled.
     * 
     */
    public String timeLastPulled() {
        return this.timeLastPulled;
    }
    /**
     * @return The version name.
     * 
     */
    public String version() {
        return this.version;
    }
    /**
     * @return The versions associated with this image.
     * 
     */
    public List<GetContainerImageVersion> versions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private String createdBy;
        private String digest;
        private String displayName;
        private String id;
        private String imageId;
        private List<GetContainerImageLayer> layers;
        private String layersSizeInBytes;
        private Integer manifestSizeInBytes;
        private String pullCount;
        private String repositoryId;
        private String repositoryName;
        private String state;
        private String timeCreated;
        private String timeLastPulled;
        private String version;
        private List<GetContainerImageVersion> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.createdBy = defaults.createdBy;
    	      this.digest = defaults.digest;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.layers = defaults.layers;
    	      this.layersSizeInBytes = defaults.layersSizeInBytes;
    	      this.manifestSizeInBytes = defaults.manifestSizeInBytes;
    	      this.pullCount = defaults.pullCount;
    	      this.repositoryId = defaults.repositoryId;
    	      this.repositoryName = defaults.repositoryName;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeLastPulled = defaults.timeLastPulled;
    	      this.version = defaults.version;
    	      this.versions = defaults.versions;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder digest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder layers(List<GetContainerImageLayer> layers) {
            this.layers = Objects.requireNonNull(layers);
            return this;
        }
        public Builder layers(GetContainerImageLayer... layers) {
            return layers(List.of(layers));
        }
        public Builder layersSizeInBytes(String layersSizeInBytes) {
            this.layersSizeInBytes = Objects.requireNonNull(layersSizeInBytes);
            return this;
        }
        public Builder manifestSizeInBytes(Integer manifestSizeInBytes) {
            this.manifestSizeInBytes = Objects.requireNonNull(manifestSizeInBytes);
            return this;
        }
        public Builder pullCount(String pullCount) {
            this.pullCount = Objects.requireNonNull(pullCount);
            return this;
        }
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = Objects.requireNonNull(repositoryId);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeLastPulled(String timeLastPulled) {
            this.timeLastPulled = Objects.requireNonNull(timeLastPulled);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder versions(List<GetContainerImageVersion> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public Builder versions(GetContainerImageVersion... versions) {
            return versions(List.of(versions));
        }        public GetContainerImageResult build() {
            return new GetContainerImageResult(compartmentId, createdBy, digest, displayName, id, imageId, layers, layersSizeInBytes, manifestSizeInBytes, pullCount, repositoryId, repositoryName, state, timeCreated, timeLastPulled, version, versions);
        }
    }
}
