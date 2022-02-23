// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerTriggerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerArgs Empty = new PreventionJobTriggerArgs();

    /**
     * A description of the job trigger.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * User set display name of the job trigger.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Controls what and how to inspect for findings.
     * Structure is documented below.
     * 
     */
    @InputImport(name="inspectJob")
      private final @Nullable Input<PreventionJobTriggerInspectJobArgs> inspectJob;

    public Input<PreventionJobTriggerInspectJobArgs> getInspectJob() {
        return this.inspectJob == null ? Input.empty() : this.inspectJob;
    }

    /**
     * The parent of the trigger, either in the format `projects/{{project}}`
     * or `projects/{{project}}/locations/{{location}}`
     * 
     */
    @InputImport(name="parent", required=true)
      private final Input<String> parent;

    public Input<String> getParent() {
        return this.parent;
    }

    /**
     * Whether the trigger is currently active.
     * Default value is `HEALTHY`.
     * Possible values are `PAUSED`, `HEALTHY`, and `CANCELLED`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * What event needs to occur for a new job to be started.
     * Structure is documented below.
     * 
     */
    @InputImport(name="triggers", required=true)
      private final Input<List<PreventionJobTriggerTriggerArgs>> triggers;

    public Input<List<PreventionJobTriggerTriggerArgs>> getTriggers() {
        return this.triggers;
    }

    public PreventionJobTriggerArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<PreventionJobTriggerInspectJobArgs> inspectJob,
        Input<String> parent,
        @Nullable Input<String> status,
        Input<List<PreventionJobTriggerTriggerArgs>> triggers) {
        this.description = description;
        this.displayName = displayName;
        this.inspectJob = inspectJob;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.status = status;
        this.triggers = Objects.requireNonNull(triggers, "expected parameter 'triggers' to be non-null");
    }

    private PreventionJobTriggerArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.inspectJob = Input.empty();
        this.parent = Input.empty();
        this.status = Input.empty();
        this.triggers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<PreventionJobTriggerInspectJobArgs> inspectJob;
        private Input<String> parent;
        private @Nullable Input<String> status;
        private Input<List<PreventionJobTriggerTriggerArgs>> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.inspectJob = defaults.inspectJob;
    	      this.parent = defaults.parent;
    	      this.status = defaults.status;
    	      this.triggers = defaults.triggers;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setInspectJob(@Nullable Input<PreventionJobTriggerInspectJobArgs> inspectJob) {
            this.inspectJob = inspectJob;
            return this;
        }

        public Builder setInspectJob(@Nullable PreventionJobTriggerInspectJobArgs inspectJob) {
            this.inspectJob = Input.ofNullable(inspectJob);
            return this;
        }

        public Builder setParent(Input<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Input.of(Objects.requireNonNull(parent));
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTriggers(Input<List<PreventionJobTriggerTriggerArgs>> triggers) {
            this.triggers = Objects.requireNonNull(triggers);
            return this;
        }

        public Builder setTriggers(List<PreventionJobTriggerTriggerArgs> triggers) {
            this.triggers = Input.of(Objects.requireNonNull(triggers));
            return this;
        }
        public PreventionJobTriggerArgs build() {
            return new PreventionJobTriggerArgs(description, displayName, inspectJob, parent, status, triggers);
        }
    }
}
