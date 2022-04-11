// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataproc.inputs.JobIAMMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobIAMMemberState extends io.pulumi.resources.ResourceArgs {

    public static final JobIAMMemberState Empty = new JobIAMMemberState();

    @Import(name="condition")
      private final @Nullable Output<JobIAMMemberConditionGetArgs> condition;

    public Output<JobIAMMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the jobs's IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="jobId")
      private final @Nullable Output<String> jobId;

    public Output<String> getJobId() {
        return this.jobId == null ? Codegen.empty() : this.jobId;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> getMember() {
        return this.member == null ? Codegen.empty() : this.member;
    }

    /**
     * The project in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The region in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.dataproc.JobIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public JobIAMMemberState(
        @Nullable Output<JobIAMMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> jobId,
        @Nullable Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.jobId = jobId;
        this.member = member;
        this.project = project;
        this.region = region;
        this.role = role;
    }

    private JobIAMMemberState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.jobId = Codegen.empty();
        this.member = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobIAMMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobIAMMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> jobId;
        private @Nullable Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(JobIAMMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.jobId = defaults.jobId;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<JobIAMMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable JobIAMMemberConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder jobId(@Nullable Output<String> jobId) {
            this.jobId = jobId;
            return this;
        }
        public Builder jobId(@Nullable String jobId) {
            this.jobId = Codegen.ofNullable(jobId);
            return this;
        }
        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }
        public Builder member(@Nullable String member) {
            this.member = Codegen.ofNullable(member);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public JobIAMMemberState build() {
            return new JobIAMMemberState(condition, etag, jobId, member, project, region, role);
        }
    }
}
