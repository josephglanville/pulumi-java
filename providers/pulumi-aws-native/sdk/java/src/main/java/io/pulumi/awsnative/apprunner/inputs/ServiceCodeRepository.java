// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.inputs.ServiceCodeConfiguration;
import io.pulumi.awsnative.apprunner.inputs.ServiceSourceCodeVersion;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceCodeRepository extends io.pulumi.resources.InvokeArgs {

    public static final ServiceCodeRepository Empty = new ServiceCodeRepository();

    @InputImport(name="codeConfiguration")
    private final @Nullable ServiceCodeConfiguration codeConfiguration;

    public Optional<ServiceCodeConfiguration> getCodeConfiguration() {
        return this.codeConfiguration == null ? Optional.empty() : Optional.ofNullable(this.codeConfiguration);
    }

    @InputImport(name="repositoryUrl", required=true)
    private final String repositoryUrl;

    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }

    @InputImport(name="sourceCodeVersion", required=true)
    private final ServiceSourceCodeVersion sourceCodeVersion;

    public ServiceSourceCodeVersion getSourceCodeVersion() {
        return this.sourceCodeVersion;
    }

    public ServiceCodeRepository(
        @Nullable ServiceCodeConfiguration codeConfiguration,
        String repositoryUrl,
        ServiceSourceCodeVersion sourceCodeVersion) {
        this.codeConfiguration = codeConfiguration;
        this.repositoryUrl = Objects.requireNonNull(repositoryUrl, "expected parameter 'repositoryUrl' to be non-null");
        this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion, "expected parameter 'sourceCodeVersion' to be non-null");
    }

    private ServiceCodeRepository() {
        this.codeConfiguration = null;
        this.repositoryUrl = null;
        this.sourceCodeVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCodeRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceCodeConfiguration codeConfiguration;
        private String repositoryUrl;
        private ServiceSourceCodeVersion sourceCodeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCodeRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sourceCodeVersion = defaults.sourceCodeVersion;
        }

        public Builder setCodeConfiguration(@Nullable ServiceCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }

        public Builder setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }

        public Builder setSourceCodeVersion(ServiceSourceCodeVersion sourceCodeVersion) {
            this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion);
            return this;
        }

        public ServiceCodeRepository build() {
            return new ServiceCodeRepository(codeConfiguration, repositoryUrl, sourceCodeVersion);
        }
    }
}