// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.inputs.ServiceCodeConfigurationArgs;
import io.pulumi.awsnative.apprunner.inputs.ServiceSourceCodeVersionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Source Code Repository
 * 
 */
public final class ServiceCodeRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCodeRepositoryArgs Empty = new ServiceCodeRepositoryArgs();

    @Import(name="codeConfiguration")
      private final @Nullable Output<ServiceCodeConfigurationArgs> codeConfiguration;

    public Output<ServiceCodeConfigurationArgs> getCodeConfiguration() {
        return this.codeConfiguration == null ? Output.empty() : this.codeConfiguration;
    }

    /**
     * Repository Url
     * 
     */
    @Import(name="repositoryUrl", required=true)
      private final Output<String> repositoryUrl;

    public Output<String> getRepositoryUrl() {
        return this.repositoryUrl;
    }

    @Import(name="sourceCodeVersion", required=true)
      private final Output<ServiceSourceCodeVersionArgs> sourceCodeVersion;

    public Output<ServiceSourceCodeVersionArgs> getSourceCodeVersion() {
        return this.sourceCodeVersion;
    }

    public ServiceCodeRepositoryArgs(
        @Nullable Output<ServiceCodeConfigurationArgs> codeConfiguration,
        Output<String> repositoryUrl,
        Output<ServiceSourceCodeVersionArgs> sourceCodeVersion) {
        this.codeConfiguration = codeConfiguration;
        this.repositoryUrl = Objects.requireNonNull(repositoryUrl, "expected parameter 'repositoryUrl' to be non-null");
        this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion, "expected parameter 'sourceCodeVersion' to be non-null");
    }

    private ServiceCodeRepositoryArgs() {
        this.codeConfiguration = Output.empty();
        this.repositoryUrl = Output.empty();
        this.sourceCodeVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCodeRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceCodeConfigurationArgs> codeConfiguration;
        private Output<String> repositoryUrl;
        private Output<ServiceSourceCodeVersionArgs> sourceCodeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCodeRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sourceCodeVersion = defaults.sourceCodeVersion;
        }

        public Builder codeConfiguration(@Nullable Output<ServiceCodeConfigurationArgs> codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public Builder codeConfiguration(@Nullable ServiceCodeConfigurationArgs codeConfiguration) {
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
        public Builder sourceCodeVersion(Output<ServiceSourceCodeVersionArgs> sourceCodeVersion) {
            this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion);
            return this;
        }
        public Builder sourceCodeVersion(ServiceSourceCodeVersionArgs sourceCodeVersion) {
            this.sourceCodeVersion = Output.of(Objects.requireNonNull(sourceCodeVersion));
            return this;
        }        public ServiceCodeRepositoryArgs build() {
            return new ServiceCodeRepositoryArgs(codeConfiguration, repositoryUrl, sourceCodeVersion);
        }
    }
}
