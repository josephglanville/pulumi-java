// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationImageRepositoryImageConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceSourceConfigurationImageRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceSourceConfigurationImageRepositoryArgs Empty = new ServiceSourceConfigurationImageRepositoryArgs();

    /**
     * Configuration for running the identified image. See Image Configuration below for more details.
     * 
     */
    @Import(name="imageConfiguration")
      private final @Nullable Output<ServiceSourceConfigurationImageRepositoryImageConfigurationArgs> imageConfiguration;

    public Output<ServiceSourceConfigurationImageRepositoryImageConfigurationArgs> getImageConfiguration() {
        return this.imageConfiguration == null ? Codegen.empty() : this.imageConfiguration;
    }

    /**
     * The identifier of an image. For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the
     * image name format, see Pulling an image in the Amazon ECR User Guide.
     * 
     */
    @Import(name="imageIdentifier", required=true)
      private final Output<String> imageIdentifier;

    public Output<String> getImageIdentifier() {
        return this.imageIdentifier;
    }

    /**
     * The type of the image repository. This reflects the repository provider and whether the repository is private or public. Valid values: `ECR` , `ECR_PUBLIC`.
     * 
     */
    @Import(name="imageRepositoryType", required=true)
      private final Output<String> imageRepositoryType;

    public Output<String> getImageRepositoryType() {
        return this.imageRepositoryType;
    }

    public ServiceSourceConfigurationImageRepositoryArgs(
        @Nullable Output<ServiceSourceConfigurationImageRepositoryImageConfigurationArgs> imageConfiguration,
        Output<String> imageIdentifier,
        Output<String> imageRepositoryType) {
        this.imageConfiguration = imageConfiguration;
        this.imageIdentifier = Objects.requireNonNull(imageIdentifier, "expected parameter 'imageIdentifier' to be non-null");
        this.imageRepositoryType = Objects.requireNonNull(imageRepositoryType, "expected parameter 'imageRepositoryType' to be non-null");
    }

    private ServiceSourceConfigurationImageRepositoryArgs() {
        this.imageConfiguration = Codegen.empty();
        this.imageIdentifier = Codegen.empty();
        this.imageRepositoryType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationImageRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceSourceConfigurationImageRepositoryImageConfigurationArgs> imageConfiguration;
        private Output<String> imageIdentifier;
        private Output<String> imageRepositoryType;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationImageRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageConfiguration = defaults.imageConfiguration;
    	      this.imageIdentifier = defaults.imageIdentifier;
    	      this.imageRepositoryType = defaults.imageRepositoryType;
        }

        public Builder imageConfiguration(@Nullable Output<ServiceSourceConfigurationImageRepositoryImageConfigurationArgs> imageConfiguration) {
            this.imageConfiguration = imageConfiguration;
            return this;
        }
        public Builder imageConfiguration(@Nullable ServiceSourceConfigurationImageRepositoryImageConfigurationArgs imageConfiguration) {
            this.imageConfiguration = Codegen.ofNullable(imageConfiguration);
            return this;
        }
        public Builder imageIdentifier(Output<String> imageIdentifier) {
            this.imageIdentifier = Objects.requireNonNull(imageIdentifier);
            return this;
        }
        public Builder imageIdentifier(String imageIdentifier) {
            this.imageIdentifier = Output.of(Objects.requireNonNull(imageIdentifier));
            return this;
        }
        public Builder imageRepositoryType(Output<String> imageRepositoryType) {
            this.imageRepositoryType = Objects.requireNonNull(imageRepositoryType);
            return this;
        }
        public Builder imageRepositoryType(String imageRepositoryType) {
            this.imageRepositoryType = Output.of(Objects.requireNonNull(imageRepositoryType));
            return this;
        }        public ServiceSourceConfigurationImageRepositoryArgs build() {
            return new ServiceSourceConfigurationImageRepositoryArgs(imageConfiguration, imageIdentifier, imageRepositoryType);
        }
    }
}
