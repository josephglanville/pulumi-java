// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.enums.GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyLinuxIsolation;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * FeaturePolicy defines features allowed to be used on RBE instances, as well as instance-wide behavior changes that take effect without opt-in or opt-out at usage time.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs();

    /**
     * Which container image sources are allowed. Currently only RBE-supported registry (gcr.io) is allowed. One can allow all repositories under a project or one specific repository only. E.g. container_image_sources { policy: RESTRICTED allowed_values: [ "gcr.io/project-foo", "gcr.io/project-bar/repo-baz", ] } will allow any repositories under "gcr.io/project-foo" plus the repository "gcr.io/project-bar/repo-baz". Default (UNSPECIFIED) is equivalent to any source is allowed.
     * 
     */
    @Import(name="containerImageSources")
      private final @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> containerImageSources;

    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> getContainerImageSources() {
        return this.containerImageSources == null ? Output.empty() : this.containerImageSources;
    }

    /**
     * Whether dockerAddCapabilities can be used or what capabilities are allowed.
     * 
     */
    @Import(name="dockerAddCapabilities")
      private final @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerAddCapabilities;

    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> getDockerAddCapabilities() {
        return this.dockerAddCapabilities == null ? Output.empty() : this.dockerAddCapabilities;
    }

    /**
     * Whether dockerChrootPath can be used.
     * 
     */
    @Import(name="dockerChrootPath")
      private final @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerChrootPath;

    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> getDockerChrootPath() {
        return this.dockerChrootPath == null ? Output.empty() : this.dockerChrootPath;
    }

    /**
     * Whether dockerNetwork can be used or what network modes are allowed. E.g. one may allow `off` value only via `allowed_values`.
     * 
     */
    @Import(name="dockerNetwork")
      private final @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerNetwork;

    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> getDockerNetwork() {
        return this.dockerNetwork == null ? Output.empty() : this.dockerNetwork;
    }

    /**
     * Whether dockerPrivileged can be used.
     * 
     */
    @Import(name="dockerPrivileged")
      private final @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerPrivileged;

    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> getDockerPrivileged() {
        return this.dockerPrivileged == null ? Output.empty() : this.dockerPrivileged;
    }

    /**
     * Whether dockerRunAsRoot can be used.
     * 
     */
    @Import(name="dockerRunAsRoot")
      private final @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerRunAsRoot;

    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> getDockerRunAsRoot() {
        return this.dockerRunAsRoot == null ? Output.empty() : this.dockerRunAsRoot;
    }

    /**
     * Whether dockerRuntime is allowed to be set or what runtimes are allowed. Note linux_isolation takes precedence, and if set, docker_runtime values may be rejected if they are incompatible with the selected isolation.
     * 
     */
    @Import(name="dockerRuntime")
      private final @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerRuntime;

    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> getDockerRuntime() {
        return this.dockerRuntime == null ? Output.empty() : this.dockerRuntime;
    }

    /**
     * Whether dockerSiblingContainers can be used.
     * 
     */
    @Import(name="dockerSiblingContainers")
      private final @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerSiblingContainers;

    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> getDockerSiblingContainers() {
        return this.dockerSiblingContainers == null ? Output.empty() : this.dockerSiblingContainers;
    }

    /**
     * linux_isolation allows overriding the docker runtime used for containers started on Linux.
     * 
     */
    @Import(name="linuxIsolation")
      private final @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyLinuxIsolation> linuxIsolation;

    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyLinuxIsolation> getLinuxIsolation() {
        return this.linuxIsolation == null ? Output.empty() : this.linuxIsolation;
    }

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs(
        @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> containerImageSources,
        @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerAddCapabilities,
        @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerChrootPath,
        @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerNetwork,
        @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerPrivileged,
        @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerRunAsRoot,
        @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerRuntime,
        @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerSiblingContainers,
        @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyLinuxIsolation> linuxIsolation) {
        this.containerImageSources = containerImageSources;
        this.dockerAddCapabilities = dockerAddCapabilities;
        this.dockerChrootPath = dockerChrootPath;
        this.dockerNetwork = dockerNetwork;
        this.dockerPrivileged = dockerPrivileged;
        this.dockerRunAsRoot = dockerRunAsRoot;
        this.dockerRuntime = dockerRuntime;
        this.dockerSiblingContainers = dockerSiblingContainers;
        this.linuxIsolation = linuxIsolation;
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs() {
        this.containerImageSources = Output.empty();
        this.dockerAddCapabilities = Output.empty();
        this.dockerChrootPath = Output.empty();
        this.dockerNetwork = Output.empty();
        this.dockerPrivileged = Output.empty();
        this.dockerRunAsRoot = Output.empty();
        this.dockerRuntime = Output.empty();
        this.dockerSiblingContainers = Output.empty();
        this.linuxIsolation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> containerImageSources;
        private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerAddCapabilities;
        private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerChrootPath;
        private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerNetwork;
        private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerPrivileged;
        private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerRunAsRoot;
        private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerRuntime;
        private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerSiblingContainers;
        private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyLinuxIsolation> linuxIsolation;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerImageSources = defaults.containerImageSources;
    	      this.dockerAddCapabilities = defaults.dockerAddCapabilities;
    	      this.dockerChrootPath = defaults.dockerChrootPath;
    	      this.dockerNetwork = defaults.dockerNetwork;
    	      this.dockerPrivileged = defaults.dockerPrivileged;
    	      this.dockerRunAsRoot = defaults.dockerRunAsRoot;
    	      this.dockerRuntime = defaults.dockerRuntime;
    	      this.dockerSiblingContainers = defaults.dockerSiblingContainers;
    	      this.linuxIsolation = defaults.linuxIsolation;
        }

        public Builder containerImageSources(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> containerImageSources) {
            this.containerImageSources = containerImageSources;
            return this;
        }
        public Builder containerImageSources(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs containerImageSources) {
            this.containerImageSources = Output.ofNullable(containerImageSources);
            return this;
        }
        public Builder dockerAddCapabilities(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerAddCapabilities) {
            this.dockerAddCapabilities = dockerAddCapabilities;
            return this;
        }
        public Builder dockerAddCapabilities(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs dockerAddCapabilities) {
            this.dockerAddCapabilities = Output.ofNullable(dockerAddCapabilities);
            return this;
        }
        public Builder dockerChrootPath(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerChrootPath) {
            this.dockerChrootPath = dockerChrootPath;
            return this;
        }
        public Builder dockerChrootPath(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs dockerChrootPath) {
            this.dockerChrootPath = Output.ofNullable(dockerChrootPath);
            return this;
        }
        public Builder dockerNetwork(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerNetwork) {
            this.dockerNetwork = dockerNetwork;
            return this;
        }
        public Builder dockerNetwork(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs dockerNetwork) {
            this.dockerNetwork = Output.ofNullable(dockerNetwork);
            return this;
        }
        public Builder dockerPrivileged(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerPrivileged) {
            this.dockerPrivileged = dockerPrivileged;
            return this;
        }
        public Builder dockerPrivileged(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs dockerPrivileged) {
            this.dockerPrivileged = Output.ofNullable(dockerPrivileged);
            return this;
        }
        public Builder dockerRunAsRoot(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerRunAsRoot) {
            this.dockerRunAsRoot = dockerRunAsRoot;
            return this;
        }
        public Builder dockerRunAsRoot(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs dockerRunAsRoot) {
            this.dockerRunAsRoot = Output.ofNullable(dockerRunAsRoot);
            return this;
        }
        public Builder dockerRuntime(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerRuntime) {
            this.dockerRuntime = dockerRuntime;
            return this;
        }
        public Builder dockerRuntime(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs dockerRuntime) {
            this.dockerRuntime = Output.ofNullable(dockerRuntime);
            return this;
        }
        public Builder dockerSiblingContainers(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs> dockerSiblingContainers) {
            this.dockerSiblingContainers = dockerSiblingContainers;
            return this;
        }
        public Builder dockerSiblingContainers(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs dockerSiblingContainers) {
            this.dockerSiblingContainers = Output.ofNullable(dockerSiblingContainers);
            return this;
        }
        public Builder linuxIsolation(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyLinuxIsolation> linuxIsolation) {
            this.linuxIsolation = linuxIsolation;
            return this;
        }
        public Builder linuxIsolation(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyLinuxIsolation linuxIsolation) {
            this.linuxIsolation = Output.ofNullable(linuxIsolation);
            return this;
        }        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs(containerImageSources, dockerAddCapabilities, dockerChrootPath, dockerNetwork, dockerPrivileged, dockerRunAsRoot, dockerRuntime, dockerSiblingContainers, linuxIsolation);
        }
    }
}
