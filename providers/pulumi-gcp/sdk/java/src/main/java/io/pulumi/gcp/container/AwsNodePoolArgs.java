// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.container.inputs.AwsNodePoolAutoscalingArgs;
import io.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs;
import io.pulumi.gcp.container.inputs.AwsNodePoolMaxPodsConstraintArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AwsNodePoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolArgs Empty = new AwsNodePoolArgs();

    /**
     * Optional. Annotations on the node pool. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Key can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<Map<String,String>> annotations;

    public Output<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * Required. Autoscaler configuration for this node pool.
     * 
     */
    @Import(name="autoscaling", required=true)
      private final Output<AwsNodePoolAutoscalingArgs> autoscaling;

    public Output<AwsNodePoolAutoscalingArgs> getAutoscaling() {
        return this.autoscaling;
    }

    /**
     * The awsCluster for the resource
     * 
     */
    @Import(name="cluster", required=true)
      private final Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster;
    }

    /**
     * Required. The configuration of the node pool.
     * 
     */
    @Import(name="config", required=true)
      private final Output<AwsNodePoolConfigArgs> config;

    public Output<AwsNodePoolConfigArgs> getConfig() {
        return this.config;
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }

    /**
     * Required. The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    @Import(name="maxPodsConstraint", required=true)
      private final Output<AwsNodePoolMaxPodsConstraintArgs> maxPodsConstraint;

    public Output<AwsNodePoolMaxPodsConstraintArgs> getMaxPodsConstraint() {
        return this.maxPodsConstraint;
    }

    /**
     * The name of this resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Required. The subnet where the node pool node run.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     * Required. The Kubernetes version to run on this node pool (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling GetAwsServerConfig.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    public AwsNodePoolArgs(
        @Nullable Output<Map<String,String>> annotations,
        Output<AwsNodePoolAutoscalingArgs> autoscaling,
        Output<String> cluster,
        Output<AwsNodePoolConfigArgs> config,
        Output<String> location,
        Output<AwsNodePoolMaxPodsConstraintArgs> maxPodsConstraint,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> subnetId,
        Output<String> version) {
        this.annotations = annotations;
        this.autoscaling = Objects.requireNonNull(autoscaling, "expected parameter 'autoscaling' to be non-null");
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.maxPodsConstraint = Objects.requireNonNull(maxPodsConstraint, "expected parameter 'maxPodsConstraint' to be non-null");
        this.name = name;
        this.project = project;
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private AwsNodePoolArgs() {
        this.annotations = Output.empty();
        this.autoscaling = Output.empty();
        this.cluster = Output.empty();
        this.config = Output.empty();
        this.location = Output.empty();
        this.maxPodsConstraint = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.subnetId = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> annotations;
        private Output<AwsNodePoolAutoscalingArgs> autoscaling;
        private Output<String> cluster;
        private Output<AwsNodePoolConfigArgs> config;
        private Output<String> location;
        private Output<AwsNodePoolMaxPodsConstraintArgs> maxPodsConstraint;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> subnetId;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.autoscaling = defaults.autoscaling;
    	      this.cluster = defaults.cluster;
    	      this.config = defaults.config;
    	      this.location = defaults.location;
    	      this.maxPodsConstraint = defaults.maxPodsConstraint;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.subnetId = defaults.subnetId;
    	      this.version = defaults.version;
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }
        public Builder autoscaling(Output<AwsNodePoolAutoscalingArgs> autoscaling) {
            this.autoscaling = Objects.requireNonNull(autoscaling);
            return this;
        }
        public Builder autoscaling(AwsNodePoolAutoscalingArgs autoscaling) {
            this.autoscaling = Output.of(Objects.requireNonNull(autoscaling));
            return this;
        }
        public Builder cluster(Output<String> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder cluster(String cluster) {
            this.cluster = Output.of(Objects.requireNonNull(cluster));
            return this;
        }
        public Builder config(Output<AwsNodePoolConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder config(AwsNodePoolConfigArgs config) {
            this.config = Output.of(Objects.requireNonNull(config));
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }
        public Builder maxPodsConstraint(Output<AwsNodePoolMaxPodsConstraintArgs> maxPodsConstraint) {
            this.maxPodsConstraint = Objects.requireNonNull(maxPodsConstraint);
            return this;
        }
        public Builder maxPodsConstraint(AwsNodePoolMaxPodsConstraintArgs maxPodsConstraint) {
            this.maxPodsConstraint = Output.of(Objects.requireNonNull(maxPodsConstraint));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public AwsNodePoolArgs build() {
            return new AwsNodePoolArgs(annotations, autoscaling, cluster, config, location, maxPodsConstraint, name, project, subnetId, version);
        }
    }
}
