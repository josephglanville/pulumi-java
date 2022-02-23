// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionIamBindingArgs Empty = new FunctionIamBindingArgs();

    @InputImport(name="cloudFunction", required=true)
      private final Input<String> cloudFunction;

    public Input<String> getCloudFunction() {
        return this.cloudFunction;
    }

    @InputImport(name="condition")
      private final @Nullable Input<FunctionIamBindingConditionArgs> condition;

    public Input<FunctionIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="members", required=true)
      private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public FunctionIamBindingArgs(
        Input<String> cloudFunction,
        @Nullable Input<FunctionIamBindingConditionArgs> condition,
        Input<List<String>> members,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> role) {
        this.cloudFunction = Objects.requireNonNull(cloudFunction, "expected parameter 'cloudFunction' to be non-null");
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private FunctionIamBindingArgs() {
        this.cloudFunction = Input.empty();
        this.condition = Input.empty();
        this.members = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cloudFunction;
        private @Nullable Input<FunctionIamBindingConditionArgs> condition;
        private Input<List<String>> members;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
        }

        public Builder setCloudFunction(Input<String> cloudFunction) {
            this.cloudFunction = Objects.requireNonNull(cloudFunction);
            return this;
        }

        public Builder setCloudFunction(String cloudFunction) {
            this.cloudFunction = Input.of(Objects.requireNonNull(cloudFunction));
            return this;
        }

        public Builder setCondition(@Nullable Input<FunctionIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable FunctionIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
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
        public FunctionIamBindingArgs build() {
            return new FunctionIamBindingArgs(cloudFunction, condition, members, project, region, role);
        }
    }
}
