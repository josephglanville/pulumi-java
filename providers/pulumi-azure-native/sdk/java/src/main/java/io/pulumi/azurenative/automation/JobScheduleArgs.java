// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.RunbookAssociationPropertyArgs;
import io.pulumi.azurenative.automation.inputs.ScheduleAssociationPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobScheduleArgs Empty = new JobScheduleArgs();

    @InputImport(name="automationAccountName", required=true)
    private final Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    @InputImport(name="jobScheduleId")
    private final @Nullable Input<String> jobScheduleId;

    public Input<String> getJobScheduleId() {
        return this.jobScheduleId == null ? Input.empty() : this.jobScheduleId;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,String>> parameters;

    public Input<Map<String,String>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="runOn")
    private final @Nullable Input<String> runOn;

    public Input<String> getRunOn() {
        return this.runOn == null ? Input.empty() : this.runOn;
    }

    @InputImport(name="runbook", required=true)
    private final Input<RunbookAssociationPropertyArgs> runbook;

    public Input<RunbookAssociationPropertyArgs> getRunbook() {
        return this.runbook;
    }

    @InputImport(name="schedule", required=true)
    private final Input<ScheduleAssociationPropertyArgs> schedule;

    public Input<ScheduleAssociationPropertyArgs> getSchedule() {
        return this.schedule;
    }

    public JobScheduleArgs(
        Input<String> automationAccountName,
        @Nullable Input<String> jobScheduleId,
        @Nullable Input<Map<String,String>> parameters,
        Input<String> resourceGroupName,
        @Nullable Input<String> runOn,
        Input<RunbookAssociationPropertyArgs> runbook,
        Input<ScheduleAssociationPropertyArgs> schedule) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.jobScheduleId = jobScheduleId;
        this.parameters = parameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runOn = runOn;
        this.runbook = Objects.requireNonNull(runbook, "expected parameter 'runbook' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
    }

    private JobScheduleArgs() {
        this.automationAccountName = Input.empty();
        this.jobScheduleId = Input.empty();
        this.parameters = Input.empty();
        this.resourceGroupName = Input.empty();
        this.runOn = Input.empty();
        this.runbook = Input.empty();
        this.schedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private @Nullable Input<String> jobScheduleId;
        private @Nullable Input<Map<String,String>> parameters;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> runOn;
        private Input<RunbookAssociationPropertyArgs> runbook;
        private Input<ScheduleAssociationPropertyArgs> schedule;

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

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder setJobScheduleId(@Nullable Input<String> jobScheduleId) {
            this.jobScheduleId = jobScheduleId;
            return this;
        }

        public Builder setJobScheduleId(@Nullable String jobScheduleId) {
            this.jobScheduleId = Input.ofNullable(jobScheduleId);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRunOn(@Nullable Input<String> runOn) {
            this.runOn = runOn;
            return this;
        }

        public Builder setRunOn(@Nullable String runOn) {
            this.runOn = Input.ofNullable(runOn);
            return this;
        }

        public Builder setRunbook(Input<RunbookAssociationPropertyArgs> runbook) {
            this.runbook = Objects.requireNonNull(runbook);
            return this;
        }

        public Builder setRunbook(RunbookAssociationPropertyArgs runbook) {
            this.runbook = Input.of(Objects.requireNonNull(runbook));
            return this;
        }

        public Builder setSchedule(Input<ScheduleAssociationPropertyArgs> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(ScheduleAssociationPropertyArgs schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }

        public JobScheduleArgs build() {
            return new JobScheduleArgs(automationAccountName, jobScheduleId, parameters, resourceGroupName, runOn, runbook, schedule);
        }
    }
}
