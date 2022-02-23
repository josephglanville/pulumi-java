// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.StorageType;
import io.pulumi.azurenative.web.inputs.FrontEndConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ArcConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArcConfigurationArgs Empty = new ArcConfigurationArgs();

    @InputImport(name="artifactStorageAccessMode")
      private final @Nullable Input<String> artifactStorageAccessMode;

    public Input<String> getArtifactStorageAccessMode() {
        return this.artifactStorageAccessMode == null ? Input.empty() : this.artifactStorageAccessMode;
    }

    @InputImport(name="artifactStorageClassName")
      private final @Nullable Input<String> artifactStorageClassName;

    public Input<String> getArtifactStorageClassName() {
        return this.artifactStorageClassName == null ? Input.empty() : this.artifactStorageClassName;
    }

    @InputImport(name="artifactStorageMountPath")
      private final @Nullable Input<String> artifactStorageMountPath;

    public Input<String> getArtifactStorageMountPath() {
        return this.artifactStorageMountPath == null ? Input.empty() : this.artifactStorageMountPath;
    }

    @InputImport(name="artifactStorageNodeName")
      private final @Nullable Input<String> artifactStorageNodeName;

    public Input<String> getArtifactStorageNodeName() {
        return this.artifactStorageNodeName == null ? Input.empty() : this.artifactStorageNodeName;
    }

    @InputImport(name="artifactsStorageType")
      private final @Nullable Input<StorageType> artifactsStorageType;

    public Input<StorageType> getArtifactsStorageType() {
        return this.artifactsStorageType == null ? Input.empty() : this.artifactsStorageType;
    }

    @InputImport(name="frontEndServiceConfiguration")
      private final @Nullable Input<FrontEndConfigurationArgs> frontEndServiceConfiguration;

    public Input<FrontEndConfigurationArgs> getFrontEndServiceConfiguration() {
        return this.frontEndServiceConfiguration == null ? Input.empty() : this.frontEndServiceConfiguration;
    }

    @InputImport(name="kubeConfig")
      private final @Nullable Input<String> kubeConfig;

    public Input<String> getKubeConfig() {
        return this.kubeConfig == null ? Input.empty() : this.kubeConfig;
    }

    public ArcConfigurationArgs(
        @Nullable Input<String> artifactStorageAccessMode,
        @Nullable Input<String> artifactStorageClassName,
        @Nullable Input<String> artifactStorageMountPath,
        @Nullable Input<String> artifactStorageNodeName,
        @Nullable Input<StorageType> artifactsStorageType,
        @Nullable Input<FrontEndConfigurationArgs> frontEndServiceConfiguration,
        @Nullable Input<String> kubeConfig) {
        this.artifactStorageAccessMode = artifactStorageAccessMode;
        this.artifactStorageClassName = artifactStorageClassName;
        this.artifactStorageMountPath = artifactStorageMountPath;
        this.artifactStorageNodeName = artifactStorageNodeName;
        this.artifactsStorageType = artifactsStorageType;
        this.frontEndServiceConfiguration = frontEndServiceConfiguration;
        this.kubeConfig = kubeConfig;
    }

    private ArcConfigurationArgs() {
        this.artifactStorageAccessMode = Input.empty();
        this.artifactStorageClassName = Input.empty();
        this.artifactStorageMountPath = Input.empty();
        this.artifactStorageNodeName = Input.empty();
        this.artifactsStorageType = Input.empty();
        this.frontEndServiceConfiguration = Input.empty();
        this.kubeConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArcConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> artifactStorageAccessMode;
        private @Nullable Input<String> artifactStorageClassName;
        private @Nullable Input<String> artifactStorageMountPath;
        private @Nullable Input<String> artifactStorageNodeName;
        private @Nullable Input<StorageType> artifactsStorageType;
        private @Nullable Input<FrontEndConfigurationArgs> frontEndServiceConfiguration;
        private @Nullable Input<String> kubeConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ArcConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactStorageAccessMode = defaults.artifactStorageAccessMode;
    	      this.artifactStorageClassName = defaults.artifactStorageClassName;
    	      this.artifactStorageMountPath = defaults.artifactStorageMountPath;
    	      this.artifactStorageNodeName = defaults.artifactStorageNodeName;
    	      this.artifactsStorageType = defaults.artifactsStorageType;
    	      this.frontEndServiceConfiguration = defaults.frontEndServiceConfiguration;
    	      this.kubeConfig = defaults.kubeConfig;
        }

        public Builder setArtifactStorageAccessMode(@Nullable Input<String> artifactStorageAccessMode) {
            this.artifactStorageAccessMode = artifactStorageAccessMode;
            return this;
        }

        public Builder setArtifactStorageAccessMode(@Nullable String artifactStorageAccessMode) {
            this.artifactStorageAccessMode = Input.ofNullable(artifactStorageAccessMode);
            return this;
        }

        public Builder setArtifactStorageClassName(@Nullable Input<String> artifactStorageClassName) {
            this.artifactStorageClassName = artifactStorageClassName;
            return this;
        }

        public Builder setArtifactStorageClassName(@Nullable String artifactStorageClassName) {
            this.artifactStorageClassName = Input.ofNullable(artifactStorageClassName);
            return this;
        }

        public Builder setArtifactStorageMountPath(@Nullable Input<String> artifactStorageMountPath) {
            this.artifactStorageMountPath = artifactStorageMountPath;
            return this;
        }

        public Builder setArtifactStorageMountPath(@Nullable String artifactStorageMountPath) {
            this.artifactStorageMountPath = Input.ofNullable(artifactStorageMountPath);
            return this;
        }

        public Builder setArtifactStorageNodeName(@Nullable Input<String> artifactStorageNodeName) {
            this.artifactStorageNodeName = artifactStorageNodeName;
            return this;
        }

        public Builder setArtifactStorageNodeName(@Nullable String artifactStorageNodeName) {
            this.artifactStorageNodeName = Input.ofNullable(artifactStorageNodeName);
            return this;
        }

        public Builder setArtifactsStorageType(@Nullable Input<StorageType> artifactsStorageType) {
            this.artifactsStorageType = artifactsStorageType;
            return this;
        }

        public Builder setArtifactsStorageType(@Nullable StorageType artifactsStorageType) {
            this.artifactsStorageType = Input.ofNullable(artifactsStorageType);
            return this;
        }

        public Builder setFrontEndServiceConfiguration(@Nullable Input<FrontEndConfigurationArgs> frontEndServiceConfiguration) {
            this.frontEndServiceConfiguration = frontEndServiceConfiguration;
            return this;
        }

        public Builder setFrontEndServiceConfiguration(@Nullable FrontEndConfigurationArgs frontEndServiceConfiguration) {
            this.frontEndServiceConfiguration = Input.ofNullable(frontEndServiceConfiguration);
            return this;
        }

        public Builder setKubeConfig(@Nullable Input<String> kubeConfig) {
            this.kubeConfig = kubeConfig;
            return this;
        }

        public Builder setKubeConfig(@Nullable String kubeConfig) {
            this.kubeConfig = Input.ofNullable(kubeConfig);
            return this;
        }
        public ArcConfigurationArgs build() {
            return new ArcConfigurationArgs(artifactStorageAccessMode, artifactStorageClassName, artifactStorageMountPath, artifactStorageNodeName, artifactsStorageType, frontEndServiceConfiguration, kubeConfig);
        }
    }
}
