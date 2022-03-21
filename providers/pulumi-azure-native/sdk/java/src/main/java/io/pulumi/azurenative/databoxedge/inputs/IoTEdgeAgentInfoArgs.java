// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.ImageRepositoryCredentialArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IoT edge agent details is optional, this will be used for download system Agent module while bootstrapping IoT Role if specified.
 * 
 */
public final class IoTEdgeAgentInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final IoTEdgeAgentInfoArgs Empty = new IoTEdgeAgentInfoArgs();

    /**
     * Name of the IoT edge agent image.
     * 
     */
    @Import(name="imageName", required=true)
      private final Output<String> imageName;

    public Output<String> getImageName() {
        return this.imageName;
    }

    /**
     * Image repository details.
     * 
     */
    @Import(name="imageRepository")
      private final @Nullable Output<ImageRepositoryCredentialArgs> imageRepository;

    public Output<ImageRepositoryCredentialArgs> getImageRepository() {
        return this.imageRepository == null ? Output.empty() : this.imageRepository;
    }

    /**
     * Image Tag.
     * 
     */
    @Import(name="tag", required=true)
      private final Output<String> tag;

    public Output<String> getTag() {
        return this.tag;
    }

    public IoTEdgeAgentInfoArgs(
        Output<String> imageName,
        @Nullable Output<ImageRepositoryCredentialArgs> imageRepository,
        Output<String> tag) {
        this.imageName = Objects.requireNonNull(imageName, "expected parameter 'imageName' to be non-null");
        this.imageRepository = imageRepository;
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
    }

    private IoTEdgeAgentInfoArgs() {
        this.imageName = Output.empty();
        this.imageRepository = Output.empty();
        this.tag = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTEdgeAgentInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> imageName;
        private @Nullable Output<ImageRepositoryCredentialArgs> imageRepository;
        private Output<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTEdgeAgentInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageName = defaults.imageName;
    	      this.imageRepository = defaults.imageRepository;
    	      this.tag = defaults.tag;
        }

        public Builder imageName(Output<String> imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        public Builder imageName(String imageName) {
            this.imageName = Output.of(Objects.requireNonNull(imageName));
            return this;
        }
        public Builder imageRepository(@Nullable Output<ImageRepositoryCredentialArgs> imageRepository) {
            this.imageRepository = imageRepository;
            return this;
        }
        public Builder imageRepository(@Nullable ImageRepositoryCredentialArgs imageRepository) {
            this.imageRepository = Output.ofNullable(imageRepository);
            return this;
        }
        public Builder tag(Output<String> tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public Builder tag(String tag) {
            this.tag = Output.of(Objects.requireNonNull(tag));
            return this;
        }        public IoTEdgeAgentInfoArgs build() {
            return new IoTEdgeAgentInfoArgs(imageName, imageRepository, tag);
        }
    }
}
