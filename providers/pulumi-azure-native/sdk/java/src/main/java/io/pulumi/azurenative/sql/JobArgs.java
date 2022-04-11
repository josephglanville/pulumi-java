// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.inputs.JobScheduleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * User-defined description of the job.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the job agent.
     * 
     */
    @Import(name="jobAgentName", required=true)
      private final Output<String> jobAgentName;

    public Output<String> getJobAgentName() {
        return this.jobAgentName;
    }

    /**
     * The name of the job to get.
     * 
     */
    @Import(name="jobName")
      private final @Nullable Output<String> jobName;

    public Output<String> getJobName() {
        return this.jobName == null ? Codegen.empty() : this.jobName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Schedule properties of the job.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<JobScheduleArgs> schedule;

    public Output<JobScheduleArgs> getSchedule() {
        return this.schedule == null ? Codegen.empty() : this.schedule;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    public JobArgs(
        @Nullable Output<String> description,
        Output<String> jobAgentName,
        @Nullable Output<String> jobName,
        Output<String> resourceGroupName,
        @Nullable Output<JobScheduleArgs> schedule,
        Output<String> serverName) {
        this.description = description == null ? Codegen.ofNullable("") : description;
        this.jobAgentName = Objects.requireNonNull(jobAgentName, "expected parameter 'jobAgentName' to be non-null");
        this.jobName = jobName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schedule = schedule;
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private JobArgs() {
        this.description = Codegen.empty();
        this.jobAgentName = Codegen.empty();
        this.jobName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.schedule = Codegen.empty();
        this.serverName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> jobAgentName;
        private @Nullable Output<String> jobName;
        private Output<String> resourceGroupName;
        private @Nullable Output<JobScheduleArgs> schedule;
        private Output<String> serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.jobAgentName = defaults.jobAgentName;
    	      this.jobName = defaults.jobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schedule = defaults.schedule;
    	      this.serverName = defaults.serverName;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder jobAgentName(Output<String> jobAgentName) {
            this.jobAgentName = Objects.requireNonNull(jobAgentName);
            return this;
        }
        public Builder jobAgentName(String jobAgentName) {
            this.jobAgentName = Output.of(Objects.requireNonNull(jobAgentName));
            return this;
        }
        public Builder jobName(@Nullable Output<String> jobName) {
            this.jobName = jobName;
            return this;
        }
        public Builder jobName(@Nullable String jobName) {
            this.jobName = Codegen.ofNullable(jobName);
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
        public Builder schedule(@Nullable Output<JobScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder schedule(@Nullable JobScheduleArgs schedule) {
            this.schedule = Codegen.ofNullable(schedule);
            return this;
        }
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }        public JobArgs build() {
            return new JobArgs(description, jobAgentName, jobName, resourceGroupName, schedule, serverName);
        }
    }
}
