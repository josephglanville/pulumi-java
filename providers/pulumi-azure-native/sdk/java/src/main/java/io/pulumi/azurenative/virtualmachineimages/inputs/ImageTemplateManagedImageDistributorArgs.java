// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageTemplateManagedImageDistributorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageTemplateManagedImageDistributorArgs Empty = new ImageTemplateManagedImageDistributorArgs();

    @InputImport(name="artifactTags")
    private final @Nullable Input<Map<String,String>> artifactTags;

    public Input<Map<String,String>> getArtifactTags() {
        return this.artifactTags == null ? Input.empty() : this.artifactTags;
    }

    @InputImport(name="imageId", required=true)
    private final Input<String> imageId;

    public Input<String> getImageId() {
        return this.imageId;
    }

    @InputImport(name="location", required=true)
    private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    @InputImport(name="runOutputName", required=true)
    private final Input<String> runOutputName;

    public Input<String> getRunOutputName() {
        return this.runOutputName;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ImageTemplateManagedImageDistributorArgs(
        @Nullable Input<Map<String,String>> artifactTags,
        Input<String> imageId,
        Input<String> location,
        Input<String> runOutputName,
        Input<String> type) {
        this.artifactTags = artifactTags;
        this.imageId = Objects.requireNonNull(imageId, "expected parameter 'imageId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.runOutputName = Objects.requireNonNull(runOutputName, "expected parameter 'runOutputName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ImageTemplateManagedImageDistributorArgs() {
        this.artifactTags = Input.empty();
        this.imageId = Input.empty();
        this.location = Input.empty();
        this.runOutputName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateManagedImageDistributorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> artifactTags;
        private Input<String> imageId;
        private Input<String> location;
        private Input<String> runOutputName;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateManagedImageDistributorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactTags = defaults.artifactTags;
    	      this.imageId = defaults.imageId;
    	      this.location = defaults.location;
    	      this.runOutputName = defaults.runOutputName;
    	      this.type = defaults.type;
        }

        public Builder setArtifactTags(@Nullable Input<Map<String,String>> artifactTags) {
            this.artifactTags = artifactTags;
            return this;
        }

        public Builder setArtifactTags(@Nullable Map<String,String> artifactTags) {
            this.artifactTags = Input.ofNullable(artifactTags);
            return this;
        }

        public Builder setImageId(Input<String> imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }

        public Builder setImageId(String imageId) {
            this.imageId = Input.of(Objects.requireNonNull(imageId));
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setRunOutputName(Input<String> runOutputName) {
            this.runOutputName = Objects.requireNonNull(runOutputName);
            return this;
        }

        public Builder setRunOutputName(String runOutputName) {
            this.runOutputName = Input.of(Objects.requireNonNull(runOutputName));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ImageTemplateManagedImageDistributorArgs build() {
            return new ImageTemplateManagedImageDistributorArgs(artifactTags, imageId, location, runOutputName, type);
        }
    }
}