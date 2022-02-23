// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigtable.inputs.TableIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableIamMemberArgs Empty = new TableIamMemberArgs();

    @InputImport(name="condition")
      private final @Nullable Input<TableIamMemberConditionArgs> condition;

    public Input<TableIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The name or relative resource id of the instance that owns the table.
     * 
     */
    @InputImport(name="instance", required=true)
      private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
    }

    @InputImport(name="member", required=true)
      private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    /**
     * The project in which the table belongs. If it
     * is not provided, this provider will use the provider default.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    /**
     * The name or relative resource id of the table to manage IAM policies for.
     * 
     */
    @InputImport(name="table", required=true)
      private final Input<String> table;

    public Input<String> getTable() {
        return this.table;
    }

    public TableIamMemberArgs(
        @Nullable Input<TableIamMemberConditionArgs> condition,
        Input<String> instance,
        Input<String> member,
        @Nullable Input<String> project,
        Input<String> role,
        Input<String> table) {
        this.condition = condition;
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.table = Objects.requireNonNull(table, "expected parameter 'table' to be non-null");
    }

    private TableIamMemberArgs() {
        this.condition = Input.empty();
        this.instance = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
        this.table = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TableIamMemberConditionArgs> condition;
        private Input<String> instance;
        private Input<String> member;
        private @Nullable Input<String> project;
        private Input<String> role;
        private Input<String> table;

        public Builder() {
    	      // Empty
        }

        public Builder(TableIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.instance = defaults.instance;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.table = defaults.table;
        }

        public Builder setCondition(@Nullable Input<TableIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable TableIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setInstance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
            return this;
        }

        public Builder setMember(Input<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder setMember(String member) {
            this.member = Input.of(Objects.requireNonNull(member));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public Builder setTable(Input<String> table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public Builder setTable(String table) {
            this.table = Input.of(Objects.requireNonNull(table));
            return this;
        }
        public TableIamMemberArgs build() {
            return new TableIamMemberArgs(condition, instance, member, project, role, table);
        }
    }
}
