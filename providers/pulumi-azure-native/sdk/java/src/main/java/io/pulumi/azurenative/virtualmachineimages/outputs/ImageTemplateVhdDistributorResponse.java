// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ImageTemplateVhdDistributorResponse {
    /**
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
     */
    private final @Nullable Map<String,String> artifactTags;
    /**
     * The name to be used for the associated RunOutput.
     * 
     */
    private final String runOutputName;
    /**
     * Type of distribution.
     * Expected value is 'VHD'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ImageTemplateVhdDistributorResponse(
        @CustomType.Parameter("artifactTags") @Nullable Map<String,String> artifactTags,
        @CustomType.Parameter("runOutputName") String runOutputName,
        @CustomType.Parameter("type") String type) {
        this.artifactTags = artifactTags;
        this.runOutputName = runOutputName;
        this.type = type;
    }

    /**
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
    */
    public Map<String,String> getArtifactTags() {
        return this.artifactTags == null ? Map.of() : this.artifactTags;
    }
    /**
     * The name to be used for the associated RunOutput.
     * 
    */
    public String getRunOutputName() {
        return this.runOutputName;
    }
    /**
     * Type of distribution.
     * Expected value is 'VHD'.
     * 
    */
    public String getType() {
        return this.type;
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

        public Builder artifactTags(@Nullable Map<String,String> artifactTags) {
            this.artifactTags = artifactTags;
            return this;
        }
        public Builder runOutputName(String runOutputName) {
            this.runOutputName = Objects.requireNonNull(runOutputName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ImageTemplateVhdDistributorResponse build() {
            return new ImageTemplateVhdDistributorResponse(artifactTags, runOutputName, type);
        }
    }
}
