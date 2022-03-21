// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.RunbookAssociationPropertyArgs;
import io.pulumi.azurenative.automation.inputs.ScheduleAssociationPropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobScheduleArgs Empty = new JobScheduleArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
      private final Output<String> automationAccountName;

    public Output<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The job schedule name.
     * 
     */
    @Import(name="jobScheduleId")
      private final @Nullable Output<String> jobScheduleId;

    public Output<String> getJobScheduleId() {
        return this.jobScheduleId == null ? Output.empty() : this.jobScheduleId;
    }

    /**
     * Gets or sets a list of job properties.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,String>> parameters;

    public Output<Map<String,String>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the hybrid worker group that the scheduled job should run on.
     * 
     */
    @Import(name="runOn")
      private final @Nullable Output<String> runOn;

    public Output<String> getRunOn() {
        return this.runOn == null ? Output.empty() : this.runOn;
    }

    /**
     * Gets or sets the runbook.
     * 
     */
    @Import(name="runbook", required=true)
      private final Output<RunbookAssociationPropertyArgs> runbook;

    public Output<RunbookAssociationPropertyArgs> getRunbook() {
        return this.runbook;
    }

    /**
     * Gets or sets the schedule.
     * 
     */
    @Import(name="schedule", required=true)
      private final Output<ScheduleAssociationPropertyArgs> schedule;

    public Output<ScheduleAssociationPropertyArgs> getSchedule() {
        return this.schedule;
    }

    public JobScheduleArgs(
        Output<String> automationAccountName,
        @Nullable Output<String> jobScheduleId,
        @Nullable Output<Map<String,String>> parameters,
        Output<String> resourceGroupName,
        @Nullable Output<String> runOn,
        Output<RunbookAssociationPropertyArgs> runbook,
        Output<ScheduleAssociationPropertyArgs> schedule) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.jobScheduleId = jobScheduleId;
        this.parameters = parameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runOn = runOn;
        this.runbook = Objects.requireNonNull(runbook, "expected parameter 'runbook' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
    }

    private JobScheduleArgs() {
        this.automationAccountName = Output.empty();
        this.jobScheduleId = Output.empty();
        this.parameters = Output.empty();
        this.resourceGroupName = Output.empty();
        this.runOn = Output.empty();
        this.runbook = Output.empty();
        this.schedule = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> automationAccountName;
        private @Nullable Output<String> jobScheduleId;
        private @Nullable Output<Map<String,String>> parameters;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> runOn;
        private Output<RunbookAssociationPropertyArgs> runbook;
        private Output<ScheduleAssociationPropertyArgs> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(JobScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.jobScheduleId = defaults.jobScheduleId;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.runOn = defaults.runOn;
    	      this.runbook = defaults.runbook;
    	      this.schedule = defaults.schedule;
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }
        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Output.of(Objects.requireNonNull(automationAccountName));
            return this;
        }
        public Builder jobScheduleId(@Nullable Output<String> jobScheduleId) {
            this.jobScheduleId = jobScheduleId;
            return this;
        }
        public Builder jobScheduleId(@Nullable String jobScheduleId) {
            this.jobScheduleId = Output.ofNullable(jobScheduleId);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder runOn(@Nullable Output<String> runOn) {
            this.runOn = runOn;
            return this;
        }
        public Builder runOn(@Nullable String runOn) {
            this.runOn = Output.ofNullable(runOn);
            return this;
        }
        public Builder runbook(Output<RunbookAssociationPropertyArgs> runbook) {
            this.runbook = Objects.requireNonNull(runbook);
            return this;
        }
        public Builder runbook(RunbookAssociationPropertyArgs runbook) {
            this.runbook = Output.of(Objects.requireNonNull(runbook));
            return this;
        }
        public Builder schedule(Output<ScheduleAssociationPropertyArgs> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder schedule(ScheduleAssociationPropertyArgs schedule) {
            this.schedule = Output.of(Objects.requireNonNull(schedule));
            return this;
        }        public JobScheduleArgs build() {
            return new JobScheduleArgs(automationAccountName, jobScheduleId, parameters, resourceGroupName, runOn, runbook, schedule);
        }
    }
}
