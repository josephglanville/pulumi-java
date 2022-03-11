// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadIdentityPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadIdentityPoolArgs Empty = new WorkloadIdentityPoolArgs();

    /**
     * A description of the pool. Cannot exceed 256 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Whether the pool is disabled. You cannot use a disabled pool to exchange tokens, or use
     * existing tokens to access resources. If the pool is re-enabled, existing tokens grant
     * access again.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Output.empty() : this.disabled;
    }

    /**
     * A display name for the pool. Cannot exceed 32 characters.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The ID to use for the pool, which becomes the final component of the resource name. This
     * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     */
    @InputImport(name="workloadIdentityPoolId", required=true)
      private final Output<String> workloadIdentityPoolId;

    public Output<String> getWorkloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    public WorkloadIdentityPoolArgs(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<String> displayName,
        @Nullable Output<String> project,
        Output<String> workloadIdentityPoolId) {
        this.description = description;
        this.disabled = disabled;
        this.displayName = displayName;
        this.project = project;
        this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId, "expected parameter 'workloadIdentityPoolId' to be non-null");
    }

    private WorkloadIdentityPoolArgs() {
        this.description = Output.empty();
        this.disabled = Output.empty();
        this.displayName = Output.empty();
        this.project = Output.empty();
        this.workloadIdentityPoolId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadIdentityPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> project;
        private Output<String> workloadIdentityPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadIdentityPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.project = defaults.project;
    	      this.workloadIdentityPoolId = defaults.workloadIdentityPoolId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Output.ofNullable(disabled);
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

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder workloadIdentityPoolId(Output<String> workloadIdentityPoolId) {
            this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId);
            return this;
        }

        public Builder workloadIdentityPoolId(String workloadIdentityPoolId) {
            this.workloadIdentityPoolId = Output.of(Objects.requireNonNull(workloadIdentityPoolId));
            return this;
        }
        public WorkloadIdentityPoolArgs build() {
            return new WorkloadIdentityPoolArgs(description, disabled, displayName, project, workloadIdentityPoolId);
        }
    }
}
