// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.bigquery.inputs.IamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final IamBindingArgs Empty = new IamBindingArgs();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<IamBindingConditionArgs> condition;

    public Output<IamBindingConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.bigquery.IamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    @Import(name="tableId", required=true)
      private final Output<String> tableId;

    public Output<String> getTableId() {
        return this.tableId;
    }

    public IamBindingArgs(
        @Nullable Output<IamBindingConditionArgs> condition,
        Output<String> datasetId,
        Output<List<String>> members,
        @Nullable Output<String> project,
        Output<String> role,
        Output<String> tableId) {
        this.condition = condition;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private IamBindingArgs() {
        this.condition = Output.empty();
        this.datasetId = Output.empty();
        this.members = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
        this.tableId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IamBindingConditionArgs> condition;
        private Output<String> datasetId;
        private Output<List<String>> members;
        private @Nullable Output<String> project;
        private Output<String> role;
        private Output<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(IamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.datasetId = defaults.datasetId;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.tableId = defaults.tableId;
        }

        public Builder condition(@Nullable Output<IamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable IamBindingConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder members(Output<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder tableId(Output<String> tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public Builder tableId(String tableId) {
            this.tableId = Output.of(Objects.requireNonNull(tableId));
            return this;
        }        public IamBindingArgs build() {
            return new IamBindingArgs(condition, datasetId, members, project, role, tableId);
        }
    }
}
