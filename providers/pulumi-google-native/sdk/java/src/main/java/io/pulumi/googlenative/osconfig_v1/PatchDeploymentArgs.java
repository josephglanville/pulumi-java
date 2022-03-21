// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1.inputs.OneTimeScheduleArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.PatchConfigArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.PatchInstanceFilterArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.PatchRolloutArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.RecurringScheduleArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentArgs Empty = new PatchDeploymentArgs();

    /**
     * Optional. Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Optional. Duration of the patch. After the duration ends, the patch times out.
     * 
     */
    @Import(name="duration")
      private final @Nullable Output<String> duration;

    public Output<String> getDuration() {
        return this.duration == null ? Output.empty() : this.duration;
    }

    /**
     * VM instances to patch.
     * 
     */
    @Import(name="instanceFilter", required=true)
      private final Output<PatchInstanceFilterArgs> instanceFilter;

    public Output<PatchInstanceFilterArgs> getInstanceFilter() {
        return this.instanceFilter;
    }

    /**
     * Unique name for the patch deployment resource in a project. The patch deployment name is in the form: `projects/{project_id}/patchDeployments/{patch_deployment_id}`. This field is ignored when you create a new patch deployment.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Schedule a one-time execution.
     * 
     */
    @Import(name="oneTimeSchedule", required=true)
      private final Output<OneTimeScheduleArgs> oneTimeSchedule;

    public Output<OneTimeScheduleArgs> getOneTimeSchedule() {
        return this.oneTimeSchedule;
    }

    /**
     * Optional. Patch configuration that is applied.
     * 
     */
    @Import(name="patchConfig")
      private final @Nullable Output<PatchConfigArgs> patchConfig;

    public Output<PatchConfigArgs> getPatchConfig() {
        return this.patchConfig == null ? Output.empty() : this.patchConfig;
    }

    @Import(name="patchDeploymentId", required=true)
      private final Output<String> patchDeploymentId;

    public Output<String> getPatchDeploymentId() {
        return this.patchDeploymentId;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Schedule recurring executions.
     * 
     */
    @Import(name="recurringSchedule", required=true)
      private final Output<RecurringScheduleArgs> recurringSchedule;

    public Output<RecurringScheduleArgs> getRecurringSchedule() {
        return this.recurringSchedule;
    }

    /**
     * Optional. Rollout strategy of the patch job.
     * 
     */
    @Import(name="rollout")
      private final @Nullable Output<PatchRolloutArgs> rollout;

    public Output<PatchRolloutArgs> getRollout() {
        return this.rollout == null ? Output.empty() : this.rollout;
    }

    public PatchDeploymentArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> duration,
        Output<PatchInstanceFilterArgs> instanceFilter,
        @Nullable Output<String> name,
        Output<OneTimeScheduleArgs> oneTimeSchedule,
        @Nullable Output<PatchConfigArgs> patchConfig,
        Output<String> patchDeploymentId,
        @Nullable Output<String> project,
        Output<RecurringScheduleArgs> recurringSchedule,
        @Nullable Output<PatchRolloutArgs> rollout) {
        this.description = description;
        this.duration = duration;
        this.instanceFilter = Objects.requireNonNull(instanceFilter, "expected parameter 'instanceFilter' to be non-null");
        this.name = name;
        this.oneTimeSchedule = Objects.requireNonNull(oneTimeSchedule, "expected parameter 'oneTimeSchedule' to be non-null");
        this.patchConfig = patchConfig;
        this.patchDeploymentId = Objects.requireNonNull(patchDeploymentId, "expected parameter 'patchDeploymentId' to be non-null");
        this.project = project;
        this.recurringSchedule = Objects.requireNonNull(recurringSchedule, "expected parameter 'recurringSchedule' to be non-null");
        this.rollout = rollout;
    }

    private PatchDeploymentArgs() {
        this.description = Output.empty();
        this.duration = Output.empty();
        this.instanceFilter = Output.empty();
        this.name = Output.empty();
        this.oneTimeSchedule = Output.empty();
        this.patchConfig = Output.empty();
        this.patchDeploymentId = Output.empty();
        this.project = Output.empty();
        this.recurringSchedule = Output.empty();
        this.rollout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> duration;
        private Output<PatchInstanceFilterArgs> instanceFilter;
        private @Nullable Output<String> name;
        private Output<OneTimeScheduleArgs> oneTimeSchedule;
        private @Nullable Output<PatchConfigArgs> patchConfig;
        private Output<String> patchDeploymentId;
        private @Nullable Output<String> project;
        private Output<RecurringScheduleArgs> recurringSchedule;
        private @Nullable Output<PatchRolloutArgs> rollout;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.duration = defaults.duration;
    	      this.instanceFilter = defaults.instanceFilter;
    	      this.name = defaults.name;
    	      this.oneTimeSchedule = defaults.oneTimeSchedule;
    	      this.patchConfig = defaults.patchConfig;
    	      this.patchDeploymentId = defaults.patchDeploymentId;
    	      this.project = defaults.project;
    	      this.recurringSchedule = defaults.recurringSchedule;
    	      this.rollout = defaults.rollout;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder duration(@Nullable Output<String> duration) {
            this.duration = duration;
            return this;
        }
        public Builder duration(@Nullable String duration) {
            this.duration = Output.ofNullable(duration);
            return this;
        }
        public Builder instanceFilter(Output<PatchInstanceFilterArgs> instanceFilter) {
            this.instanceFilter = Objects.requireNonNull(instanceFilter);
            return this;
        }
        public Builder instanceFilter(PatchInstanceFilterArgs instanceFilter) {
            this.instanceFilter = Output.of(Objects.requireNonNull(instanceFilter));
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
        public Builder oneTimeSchedule(Output<OneTimeScheduleArgs> oneTimeSchedule) {
            this.oneTimeSchedule = Objects.requireNonNull(oneTimeSchedule);
            return this;
        }
        public Builder oneTimeSchedule(OneTimeScheduleArgs oneTimeSchedule) {
            this.oneTimeSchedule = Output.of(Objects.requireNonNull(oneTimeSchedule));
            return this;
        }
        public Builder patchConfig(@Nullable Output<PatchConfigArgs> patchConfig) {
            this.patchConfig = patchConfig;
            return this;
        }
        public Builder patchConfig(@Nullable PatchConfigArgs patchConfig) {
            this.patchConfig = Output.ofNullable(patchConfig);
            return this;
        }
        public Builder patchDeploymentId(Output<String> patchDeploymentId) {
            this.patchDeploymentId = Objects.requireNonNull(patchDeploymentId);
            return this;
        }
        public Builder patchDeploymentId(String patchDeploymentId) {
            this.patchDeploymentId = Output.of(Objects.requireNonNull(patchDeploymentId));
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
        public Builder recurringSchedule(Output<RecurringScheduleArgs> recurringSchedule) {
            this.recurringSchedule = Objects.requireNonNull(recurringSchedule);
            return this;
        }
        public Builder recurringSchedule(RecurringScheduleArgs recurringSchedule) {
            this.recurringSchedule = Output.of(Objects.requireNonNull(recurringSchedule));
            return this;
        }
        public Builder rollout(@Nullable Output<PatchRolloutArgs> rollout) {
            this.rollout = rollout;
            return this;
        }
        public Builder rollout(@Nullable PatchRolloutArgs rollout) {
            this.rollout = Output.ofNullable(rollout);
            return this;
        }        public PatchDeploymentArgs build() {
            return new PatchDeploymentArgs(description, duration, instanceFilter, name, oneTimeSchedule, patchConfig, patchDeploymentId, project, recurringSchedule, rollout);
        }
    }
}
