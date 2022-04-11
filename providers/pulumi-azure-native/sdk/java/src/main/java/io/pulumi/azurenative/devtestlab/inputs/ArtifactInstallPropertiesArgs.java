// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.ArtifactParameterPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of an artifact.
 * 
 */
public final class ArtifactInstallPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArtifactInstallPropertiesArgs Empty = new ArtifactInstallPropertiesArgs();

    /**
     * The artifact's identifier.
     * 
     */
    @Import(name="artifactId")
      private final @Nullable Output<String> artifactId;

    public Output<String> getArtifactId() {
        return this.artifactId == null ? Codegen.empty() : this.artifactId;
    }

    /**
     * The artifact's title.
     * 
     */
    @Import(name="artifactTitle")
      private final @Nullable Output<String> artifactTitle;

    public Output<String> getArtifactTitle() {
        return this.artifactTitle == null ? Codegen.empty() : this.artifactTitle;
    }

    /**
     * The status message from the deployment.
     * 
     */
    @Import(name="deploymentStatusMessage")
      private final @Nullable Output<String> deploymentStatusMessage;

    public Output<String> getDeploymentStatusMessage() {
        return this.deploymentStatusMessage == null ? Codegen.empty() : this.deploymentStatusMessage;
    }

    /**
     * The time that the artifact starts to install on the virtual machine.
     * 
     */
    @Import(name="installTime")
      private final @Nullable Output<String> installTime;

    public Output<String> getInstallTime() {
        return this.installTime == null ? Codegen.empty() : this.installTime;
    }

    /**
     * The parameters of the artifact.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<ArtifactParameterPropertiesArgs>> parameters;

    public Output<List<ArtifactParameterPropertiesArgs>> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The status of the artifact.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * The status message from the virtual machine extension.
     * 
     */
    @Import(name="vmExtensionStatusMessage")
      private final @Nullable Output<String> vmExtensionStatusMessage;

    public Output<String> getVmExtensionStatusMessage() {
        return this.vmExtensionStatusMessage == null ? Codegen.empty() : this.vmExtensionStatusMessage;
    }

    public ArtifactInstallPropertiesArgs(
        @Nullable Output<String> artifactId,
        @Nullable Output<String> artifactTitle,
        @Nullable Output<String> deploymentStatusMessage,
        @Nullable Output<String> installTime,
        @Nullable Output<List<ArtifactParameterPropertiesArgs>> parameters,
        @Nullable Output<String> status,
        @Nullable Output<String> vmExtensionStatusMessage) {
        this.artifactId = artifactId;
        this.artifactTitle = artifactTitle;
        this.deploymentStatusMessage = deploymentStatusMessage;
        this.installTime = installTime;
        this.parameters = parameters;
        this.status = status;
        this.vmExtensionStatusMessage = vmExtensionStatusMessage;
    }

    private ArtifactInstallPropertiesArgs() {
        this.artifactId = Codegen.empty();
        this.artifactTitle = Codegen.empty();
        this.deploymentStatusMessage = Codegen.empty();
        this.installTime = Codegen.empty();
        this.parameters = Codegen.empty();
        this.status = Codegen.empty();
        this.vmExtensionStatusMessage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactInstallPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> artifactId;
        private @Nullable Output<String> artifactTitle;
        private @Nullable Output<String> deploymentStatusMessage;
        private @Nullable Output<String> installTime;
        private @Nullable Output<List<ArtifactParameterPropertiesArgs>> parameters;
        private @Nullable Output<String> status;
        private @Nullable Output<String> vmExtensionStatusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactInstallPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
    	      this.artifactTitle = defaults.artifactTitle;
    	      this.deploymentStatusMessage = defaults.deploymentStatusMessage;
    	      this.installTime = defaults.installTime;
    	      this.parameters = defaults.parameters;
    	      this.status = defaults.status;
    	      this.vmExtensionStatusMessage = defaults.vmExtensionStatusMessage;
        }

        public Builder artifactId(@Nullable Output<String> artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public Builder artifactId(@Nullable String artifactId) {
            this.artifactId = Codegen.ofNullable(artifactId);
            return this;
        }
        public Builder artifactTitle(@Nullable Output<String> artifactTitle) {
            this.artifactTitle = artifactTitle;
            return this;
        }
        public Builder artifactTitle(@Nullable String artifactTitle) {
            this.artifactTitle = Codegen.ofNullable(artifactTitle);
            return this;
        }
        public Builder deploymentStatusMessage(@Nullable Output<String> deploymentStatusMessage) {
            this.deploymentStatusMessage = deploymentStatusMessage;
            return this;
        }
        public Builder deploymentStatusMessage(@Nullable String deploymentStatusMessage) {
            this.deploymentStatusMessage = Codegen.ofNullable(deploymentStatusMessage);
            return this;
        }
        public Builder installTime(@Nullable Output<String> installTime) {
            this.installTime = installTime;
            return this;
        }
        public Builder installTime(@Nullable String installTime) {
            this.installTime = Codegen.ofNullable(installTime);
            return this;
        }
        public Builder parameters(@Nullable Output<List<ArtifactParameterPropertiesArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<ArtifactParameterPropertiesArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder parameters(ArtifactParameterPropertiesArgs... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder vmExtensionStatusMessage(@Nullable Output<String> vmExtensionStatusMessage) {
            this.vmExtensionStatusMessage = vmExtensionStatusMessage;
            return this;
        }
        public Builder vmExtensionStatusMessage(@Nullable String vmExtensionStatusMessage) {
            this.vmExtensionStatusMessage = Codegen.ofNullable(vmExtensionStatusMessage);
            return this;
        }        public ArtifactInstallPropertiesArgs build() {
            return new ArtifactInstallPropertiesArgs(artifactId, artifactTitle, deploymentStatusMessage, installTime, parameters, status, vmExtensionStatusMessage);
        }
    }
}
