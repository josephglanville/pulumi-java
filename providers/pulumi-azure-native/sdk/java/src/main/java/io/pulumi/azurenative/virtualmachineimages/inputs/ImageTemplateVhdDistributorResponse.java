// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageTemplateVhdDistributorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageTemplateVhdDistributorResponse Empty = new ImageTemplateVhdDistributorResponse();

    @InputImport(name="artifactTags")
    private final @Nullable Map<String,String> artifactTags;

    public Map<String,String> getArtifactTags() {
        return this.artifactTags == null ? Map.of() : this.artifactTags;
    }

    @InputImport(name="runOutputName", required=true)
    private final String runOutputName;

    public String getRunOutputName() {
        return this.runOutputName;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ImageTemplateVhdDistributorResponse(
        @Nullable Map<String,String> artifactTags,
        String runOutputName,
        String type) {
        this.artifactTags = artifactTags;
        this.runOutputName = Objects.requireNonNull(runOutputName, "expected parameter 'runOutputName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ImageTemplateVhdDistributorResponse() {
        this.artifactTags = Map.of();
        this.runOutputName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateVhdDistributorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> artifactTags;
        private String runOutputName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateVhdDistributorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactTags = defaults.artifactTags;
    	      this.runOutputName = defaults.runOutputName;
    	      this.type = defaults.type;
        }

        public Builder setArtifactTags(@Nullable Map<String,String> artifactTags) {
            this.artifactTags = artifactTags;
            return this;
        }

        public Builder setRunOutputName(String runOutputName) {
            this.runOutputName = Objects.requireNonNull(runOutputName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ImageTemplateVhdDistributorResponse build() {
            return new ImageTemplateVhdDistributorResponse(artifactTags, runOutputName, type);
        }
    }
}
