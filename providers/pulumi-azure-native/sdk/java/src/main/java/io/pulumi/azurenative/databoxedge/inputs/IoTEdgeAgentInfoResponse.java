// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.ImageRepositoryCredentialResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IoTEdgeAgentInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final IoTEdgeAgentInfoResponse Empty = new IoTEdgeAgentInfoResponse();

    @InputImport(name="imageName", required=true)
    private final String imageName;

    public String getImageName() {
        return this.imageName;
    }

    @InputImport(name="imageRepository")
    private final @Nullable ImageRepositoryCredentialResponse imageRepository;

    public Optional<ImageRepositoryCredentialResponse> getImageRepository() {
        return this.imageRepository == null ? Optional.empty() : Optional.ofNullable(this.imageRepository);
    }

    @InputImport(name="tag", required=true)
    private final String tag;

    public String getTag() {
        return this.tag;
    }

    public IoTEdgeAgentInfoResponse(
        String imageName,
        @Nullable ImageRepositoryCredentialResponse imageRepository,
        String tag) {
        this.imageName = Objects.requireNonNull(imageName, "expected parameter 'imageName' to be non-null");
        this.imageRepository = imageRepository;
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
    }

    private IoTEdgeAgentInfoResponse() {
        this.imageName = null;
        this.imageRepository = null;
        this.tag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTEdgeAgentInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageName;
        private @Nullable ImageRepositoryCredentialResponse imageRepository;
        private String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTEdgeAgentInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageName = defaults.imageName;
    	      this.imageRepository = defaults.imageRepository;
    	      this.tag = defaults.tag;
        }

        public Builder setImageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }

        public Builder setImageRepository(@Nullable ImageRepositoryCredentialResponse imageRepository) {
            this.imageRepository = imageRepository;
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public IoTEdgeAgentInfoResponse build() {
            return new IoTEdgeAgentInfoResponse(imageName, imageRepository, tag);
        }
    }
}
