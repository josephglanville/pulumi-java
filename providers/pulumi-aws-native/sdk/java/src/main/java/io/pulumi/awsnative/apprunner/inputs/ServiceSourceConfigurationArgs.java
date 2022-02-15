// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.inputs.ServiceAuthenticationConfigurationArgs;
import io.pulumi.awsnative.apprunner.inputs.ServiceCodeRepositoryArgs;
import io.pulumi.awsnative.apprunner.inputs.ServiceImageRepositoryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceSourceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceSourceConfigurationArgs Empty = new ServiceSourceConfigurationArgs();

    @InputImport(name="authenticationConfiguration")
    private final @Nullable Input<ServiceAuthenticationConfigurationArgs> authenticationConfiguration;

    public Input<ServiceAuthenticationConfigurationArgs> getAuthenticationConfiguration() {
        return this.authenticationConfiguration == null ? Input.empty() : this.authenticationConfiguration;
    }

    @InputImport(name="autoDeploymentsEnabled")
    private final @Nullable Input<Boolean> autoDeploymentsEnabled;

    public Input<Boolean> getAutoDeploymentsEnabled() {
        return this.autoDeploymentsEnabled == null ? Input.empty() : this.autoDeploymentsEnabled;
    }

    @InputImport(name="codeRepository")
    private final @Nullable Input<ServiceCodeRepositoryArgs> codeRepository;

    public Input<ServiceCodeRepositoryArgs> getCodeRepository() {
        return this.codeRepository == null ? Input.empty() : this.codeRepository;
    }

    @InputImport(name="imageRepository")
    private final @Nullable Input<ServiceImageRepositoryArgs> imageRepository;

    public Input<ServiceImageRepositoryArgs> getImageRepository() {
        return this.imageRepository == null ? Input.empty() : this.imageRepository;
    }

    public ServiceSourceConfigurationArgs(
        @Nullable Input<ServiceAuthenticationConfigurationArgs> authenticationConfiguration,
        @Nullable Input<Boolean> autoDeploymentsEnabled,
        @Nullable Input<ServiceCodeRepositoryArgs> codeRepository,
        @Nullable Input<ServiceImageRepositoryArgs> imageRepository) {
        this.authenticationConfiguration = authenticationConfiguration;
        this.autoDeploymentsEnabled = autoDeploymentsEnabled;
        this.codeRepository = codeRepository;
        this.imageRepository = imageRepository;
    }

    private ServiceSourceConfigurationArgs() {
        this.authenticationConfiguration = Input.empty();
        this.autoDeploymentsEnabled = Input.empty();
        this.codeRepository = Input.empty();
        this.imageRepository = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceAuthenticationConfigurationArgs> authenticationConfiguration;
        private @Nullable Input<Boolean> autoDeploymentsEnabled;
        private @Nullable Input<ServiceCodeRepositoryArgs> codeRepository;
        private @Nullable Input<ServiceImageRepositoryArgs> imageRepository;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.autoDeploymentsEnabled = defaults.autoDeploymentsEnabled;
    	      this.codeRepository = defaults.codeRepository;
    	      this.imageRepository = defaults.imageRepository;
        }

        public Builder setAuthenticationConfiguration(@Nullable Input<ServiceAuthenticationConfigurationArgs> authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder setAuthenticationConfiguration(@Nullable ServiceAuthenticationConfigurationArgs authenticationConfiguration) {
            this.authenticationConfiguration = Input.ofNullable(authenticationConfiguration);
            return this;
        }

        public Builder setAutoDeploymentsEnabled(@Nullable Input<Boolean> autoDeploymentsEnabled) {
            this.autoDeploymentsEnabled = autoDeploymentsEnabled;
            return this;
        }

        public Builder setAutoDeploymentsEnabled(@Nullable Boolean autoDeploymentsEnabled) {
            this.autoDeploymentsEnabled = Input.ofNullable(autoDeploymentsEnabled);
            return this;
        }

        public Builder setCodeRepository(@Nullable Input<ServiceCodeRepositoryArgs> codeRepository) {
            this.codeRepository = codeRepository;
            return this;
        }

        public Builder setCodeRepository(@Nullable ServiceCodeRepositoryArgs codeRepository) {
            this.codeRepository = Input.ofNullable(codeRepository);
            return this;
        }

        public Builder setImageRepository(@Nullable Input<ServiceImageRepositoryArgs> imageRepository) {
            this.imageRepository = imageRepository;
            return this;
        }

        public Builder setImageRepository(@Nullable ServiceImageRepositoryArgs imageRepository) {
            this.imageRepository = Input.ofNullable(imageRepository);
            return this;
        }

        public ServiceSourceConfigurationArgs build() {
            return new ServiceSourceConfigurationArgs(authenticationConfiguration, autoDeploymentsEnabled, codeRepository, imageRepository);
        }
    }
}