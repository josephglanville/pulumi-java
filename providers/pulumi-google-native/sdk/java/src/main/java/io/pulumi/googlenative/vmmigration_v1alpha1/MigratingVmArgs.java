// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.ComputeEngineTargetDefaultsArgs;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.SchedulePolicyArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MigratingVmArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigratingVmArgs Empty = new MigratingVmArgs();

    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    @Import(name="computeEngineTargetDefaults")
      private final @Nullable Output<ComputeEngineTargetDefaultsArgs> computeEngineTargetDefaults;

    public Output<ComputeEngineTargetDefaultsArgs> getComputeEngineTargetDefaults() {
        return this.computeEngineTargetDefaults == null ? Output.empty() : this.computeEngineTargetDefaults;
    }

    /**
     * The description attached to the migrating VM by the user.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The display name attached to the MigratingVm by the user.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The labels of the migrating VM.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="migratingVmId", required=true)
      private final Output<String> migratingVmId;

    public Output<String> getMigratingVmId() {
        return this.migratingVmId;
    }

    /**
     * The replication schedule policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<SchedulePolicyArgs> policy;

    public Output<SchedulePolicyArgs> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    @Import(name="sourceId", required=true)
      private final Output<String> sourceId;

    public Output<String> getSourceId() {
        return this.sourceId;
    }

    /**
     * The unique ID of the VM in the source. The VM's name in vSphere can be changed, so this is not the VM's name but rather its moRef id. This id is of the form vm-.
     * 
     */
    @Import(name="sourceVmId")
      private final @Nullable Output<String> sourceVmId;

    public Output<String> getSourceVmId() {
        return this.sourceVmId == null ? Output.empty() : this.sourceVmId;
    }

    public MigratingVmArgs(
        @Nullable Output<ComputeEngineTargetDefaultsArgs> computeEngineTargetDefaults,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        Output<String> migratingVmId,
        @Nullable Output<SchedulePolicyArgs> policy,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        Output<String> sourceId,
        @Nullable Output<String> sourceVmId) {
        this.computeEngineTargetDefaults = computeEngineTargetDefaults;
        this.description = description;
        this.displayName = displayName;
        this.labels = labels;
        this.location = location;
        this.migratingVmId = Objects.requireNonNull(migratingVmId, "expected parameter 'migratingVmId' to be non-null");
        this.policy = policy;
        this.project = project;
        this.requestId = requestId;
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
        this.sourceVmId = sourceVmId;
    }

    private MigratingVmArgs() {
        this.computeEngineTargetDefaults = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.migratingVmId = Output.empty();
        this.policy = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
        this.sourceId = Output.empty();
        this.sourceVmId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigratingVmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ComputeEngineTargetDefaultsArgs> computeEngineTargetDefaults;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private Output<String> migratingVmId;
        private @Nullable Output<SchedulePolicyArgs> policy;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private Output<String> sourceId;
        private @Nullable Output<String> sourceVmId;

        public Builder() {
    	      // Empty
        }

        public Builder(MigratingVmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEngineTargetDefaults = defaults.computeEngineTargetDefaults;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.migratingVmId = defaults.migratingVmId;
    	      this.policy = defaults.policy;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.sourceId = defaults.sourceId;
    	      this.sourceVmId = defaults.sourceVmId;
        }

        public Builder computeEngineTargetDefaults(@Nullable Output<ComputeEngineTargetDefaultsArgs> computeEngineTargetDefaults) {
            this.computeEngineTargetDefaults = computeEngineTargetDefaults;
            return this;
        }
        public Builder computeEngineTargetDefaults(@Nullable ComputeEngineTargetDefaultsArgs computeEngineTargetDefaults) {
            this.computeEngineTargetDefaults = Output.ofNullable(computeEngineTargetDefaults);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder migratingVmId(Output<String> migratingVmId) {
            this.migratingVmId = Objects.requireNonNull(migratingVmId);
            return this;
        }
        public Builder migratingVmId(String migratingVmId) {
            this.migratingVmId = Output.of(Objects.requireNonNull(migratingVmId));
            return this;
        }
        public Builder policy(@Nullable Output<SchedulePolicyArgs> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable SchedulePolicyArgs policy) {
            this.policy = Output.ofNullable(policy);
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
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }
        public Builder sourceId(Output<String> sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        public Builder sourceId(String sourceId) {
            this.sourceId = Output.of(Objects.requireNonNull(sourceId));
            return this;
        }
        public Builder sourceVmId(@Nullable Output<String> sourceVmId) {
            this.sourceVmId = sourceVmId;
            return this;
        }
        public Builder sourceVmId(@Nullable String sourceVmId) {
            this.sourceVmId = Output.ofNullable(sourceVmId);
            return this;
        }        public MigratingVmArgs build() {
            return new MigratingVmArgs(computeEngineTargetDefaults, description, displayName, labels, location, migratingVmId, policy, project, requestId, sourceId, sourceVmId);
        }
    }
}
