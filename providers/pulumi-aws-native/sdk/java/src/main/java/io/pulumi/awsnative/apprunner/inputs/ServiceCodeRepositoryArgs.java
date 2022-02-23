// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.inputs.ServiceCodeConfigurationArgs;
import io.pulumi.awsnative.apprunner.inputs.ServiceSourceCodeVersionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Source Code Repository
 * 
 */
public final class ServiceCodeRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCodeRepositoryArgs Empty = new ServiceCodeRepositoryArgs();

    @InputImport(name="codeConfiguration")
      private final @Nullable Input<ServiceCodeConfigurationArgs> codeConfiguration;

    public Input<ServiceCodeConfigurationArgs> getCodeConfiguration() {
        return this.codeConfiguration == null ? Input.empty() : this.codeConfiguration;
    }

    /**
     * Repository Url
     * 
     */
    @InputImport(name="repositoryUrl", required=true)
      private final Input<String> repositoryUrl;

    public Input<String> getRepositoryUrl() {
        return this.repositoryUrl;
    }

    @InputImport(name="sourceCodeVersion", required=true)
      private final Input<ServiceSourceCodeVersionArgs> sourceCodeVersion;

    public Input<ServiceSourceCodeVersionArgs> getSourceCodeVersion() {
        return this.sourceCodeVersion;
    }

    public ServiceCodeRepositoryArgs(
        @Nullable Input<ServiceCodeConfigurationArgs> codeConfiguration,
        Input<String> repositoryUrl,
        Input<ServiceSourceCodeVersionArgs> sourceCodeVersion) {
        this.codeConfiguration = codeConfiguration;
        this.repositoryUrl = Objects.requireNonNull(repositoryUrl, "expected parameter 'repositoryUrl' to be non-null");
        this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion, "expected parameter 'sourceCodeVersion' to be non-null");
    }

    private ServiceCodeRepositoryArgs() {
        this.codeConfiguration = Input.empty();
        this.repositoryUrl = Input.empty();
        this.sourceCodeVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCodeRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceCodeConfigurationArgs> codeConfiguration;
        private Input<String> repositoryUrl;
        private Input<ServiceSourceCodeVersionArgs> sourceCodeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCodeRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sourceCodeVersion = defaults.sourceCodeVersion;
        }

        public Builder setCodeConfiguration(@Nullable Input<ServiceCodeConfigurationArgs> codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }

        public Builder setCodeConfiguration(@Nullable ServiceCodeConfigurationArgs codeConfiguration) {
            this.codeConfiguration = Input.ofNullable(codeConfiguration);
            return this;
        }

        public Builder setRepositoryUrl(Input<String> repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }

        public Builder setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Input.of(Objects.requireNonNull(repositoryUrl));
            return this;
        }

        public Builder setSourceCodeVersion(Input<ServiceSourceCodeVersionArgs> sourceCodeVersion) {
            this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion);
            return this;
        }

        public Builder setSourceCodeVersion(ServiceSourceCodeVersionArgs sourceCodeVersion) {
            this.sourceCodeVersion = Input.of(Objects.requireNonNull(sourceCodeVersion));
            return this;
        }
        public ServiceCodeRepositoryArgs build() {
            return new ServiceCodeRepositoryArgs(codeConfiguration, repositoryUrl, sourceCodeVersion);
        }
    }
}
