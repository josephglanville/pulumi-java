// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs;
import io.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceSourceConfigurationCodeRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceSourceConfigurationCodeRepositoryArgs Empty = new ServiceSourceConfigurationCodeRepositoryArgs();

    /**
     * Configuration for building and running the service from a source code repository. See Code Configuration below for more details.
     * 
     */
    @Import(name="codeConfiguration")
      private final @Nullable Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs> codeConfiguration;

    public Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs> getCodeConfiguration() {
        return this.codeConfiguration == null ? Output.empty() : this.codeConfiguration;
    }

    /**
     * The location of the repository that contains the source code.
     * 
     */
    @Import(name="repositoryUrl", required=true)
      private final Output<String> repositoryUrl;

    public Output<String> getRepositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * The version that should be used within the source code repository. See Source Code Version below for more details.
     * 
     */
    @Import(name="sourceCodeVersion", required=true)
      private final Output<ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs> sourceCodeVersion;

    public Output<ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs> getSourceCodeVersion() {
        return this.sourceCodeVersion;
    }

    public ServiceSourceConfigurationCodeRepositoryArgs(
        @Nullable Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs> codeConfiguration,
        Output<String> repositoryUrl,
        Output<ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs> sourceCodeVersion) {
        this.codeConfiguration = codeConfiguration;
        this.repositoryUrl = Objects.requireNonNull(repositoryUrl, "expected parameter 'repositoryUrl' to be non-null");
        this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion, "expected parameter 'sourceCodeVersion' to be non-null");
    }

    private ServiceSourceConfigurationCodeRepositoryArgs() {
        this.codeConfiguration = Output.empty();
        this.repositoryUrl = Output.empty();
        this.sourceCodeVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationCodeRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs> codeConfiguration;
        private Output<String> repositoryUrl;
        private Output<ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs> sourceCodeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationCodeRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sourceCodeVersion = defaults.sourceCodeVersion;
        }

        public Builder codeConfiguration(@Nullable Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs> codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public Builder codeConfiguration(@Nullable ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs codeConfiguration) {
            this.codeConfiguration = Output.ofNullable(codeConfiguration);
            return this;
        }
        public Builder repositoryUrl(Output<String> repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Output.of(Objects.requireNonNull(repositoryUrl));
            return this;
        }
        public Builder sourceCodeVersion(Output<ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs> sourceCodeVersion) {
            this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion);
            return this;
        }
        public Builder sourceCodeVersion(ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs sourceCodeVersion) {
            this.sourceCodeVersion = Output.of(Objects.requireNonNull(sourceCodeVersion));
            return this;
        }        public ServiceSourceConfigurationCodeRepositoryArgs build() {
            return new ServiceSourceConfigurationCodeRepositoryArgs(codeConfiguration, repositoryUrl, sourceCodeVersion);
        }
    }
}
