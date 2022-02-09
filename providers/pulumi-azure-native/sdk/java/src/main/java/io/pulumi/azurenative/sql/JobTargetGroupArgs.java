// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.inputs.JobTargetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobTargetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTargetGroupArgs Empty = new JobTargetGroupArgs();

    @InputImport(name="jobAgentName", required=true)
    private final Input<String> jobAgentName;

    public Input<String> getJobAgentName() {
        return this.jobAgentName;
    }

    @InputImport(name="members", required=true)
    private final Input<List<JobTargetArgs>> members;

    public Input<List<JobTargetArgs>> getMembers() {
        return this.members;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serverName", required=true)
    private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    @InputImport(name="targetGroupName")
    private final @Nullable Input<String> targetGroupName;

    public Input<String> getTargetGroupName() {
        return this.targetGroupName == null ? Input.empty() : this.targetGroupName;
    }

    public JobTargetGroupArgs(
        Input<String> jobAgentName,
        Input<List<JobTargetArgs>> members,
        Input<String> resourceGroupName,
        Input<String> serverName,
        @Nullable Input<String> targetGroupName) {
        this.jobAgentName = Objects.requireNonNull(jobAgentName, "expected parameter 'jobAgentName' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.targetGroupName = targetGroupName;
    }

    private JobTargetGroupArgs() {
        this.jobAgentName = Input.empty();
        this.members = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
        this.targetGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> jobAgentName;
        private Input<List<JobTargetArgs>> members;
        private Input<String> resourceGroupName;
        private Input<String> serverName;
        private @Nullable Input<String> targetGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTargetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobAgentName = defaults.jobAgentName;
    	      this.members = defaults.members;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.targetGroupName = defaults.targetGroupName;
        }

        public Builder setJobAgentName(Input<String> jobAgentName) {
            this.jobAgentName = Objects.requireNonNull(jobAgentName);
            return this;
        }

        public Builder setJobAgentName(String jobAgentName) {
            this.jobAgentName = Input.of(Objects.requireNonNull(jobAgentName));
            return this;
        }

        public Builder setMembers(Input<List<JobTargetArgs>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<JobTargetArgs> members) {
            this.members = Input.of(Objects.requireNonNull(members));
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

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setTargetGroupName(@Nullable Input<String> targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }

        public Builder setTargetGroupName(@Nullable String targetGroupName) {
            this.targetGroupName = Input.ofNullable(targetGroupName);
            return this;
        }

        public JobTargetGroupArgs build() {
            return new JobTargetGroupArgs(jobAgentName, members, resourceGroupName, serverName, targetGroupName);
        }
    }
}
