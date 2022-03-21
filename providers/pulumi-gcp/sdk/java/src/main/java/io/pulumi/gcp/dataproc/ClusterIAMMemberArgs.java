// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataproc.inputs.ClusterIAMMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterIAMMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterIAMMemberArgs Empty = new ClusterIAMMemberArgs();

    /**
     * The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    @Import(name="cluster", required=true)
      private final Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster;
    }

    @Import(name="condition")
      private final @Nullable Output<ClusterIAMMemberConditionArgs> condition;

    public Output<ClusterIAMMemberConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }

    /**
     * The project in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The region in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.dataproc.ClusterIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public ClusterIAMMemberArgs(
        Output<String> cluster,
        @Nullable Output<ClusterIAMMemberConditionArgs> condition,
        Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        Output<String> role) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private ClusterIAMMemberArgs() {
        this.cluster = Output.empty();
        this.condition = Output.empty();
        this.member = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIAMMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cluster;
        private @Nullable Output<ClusterIAMMemberConditionArgs> condition;
        private Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIAMMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
        }

        public Builder cluster(Output<String> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder cluster(String cluster) {
            this.cluster = Output.of(Objects.requireNonNull(cluster));
            return this;
        }
        public Builder condition(@Nullable Output<ClusterIAMMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable ClusterIAMMemberConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder member(Output<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }
        public Builder member(String member) {
            this.member = Output.of(Objects.requireNonNull(member));
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
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public ClusterIAMMemberArgs build() {
            return new ClusterIAMMemberArgs(cluster, condition, member, project, region, role);
        }
    }
}
