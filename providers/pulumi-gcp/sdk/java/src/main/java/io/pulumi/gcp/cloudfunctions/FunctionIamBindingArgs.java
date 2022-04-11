// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionIamBindingArgs Empty = new FunctionIamBindingArgs();

    @Import(name="cloudFunction", required=true)
      private final Output<String> cloudFunction;

    public Output<String> getCloudFunction() {
        return this.cloudFunction;
    }

    @Import(name="condition")
      private final @Nullable Output<FunctionIamBindingConditionArgs> condition;

    public Output<FunctionIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public FunctionIamBindingArgs(
        Output<String> cloudFunction,
        @Nullable Output<FunctionIamBindingConditionArgs> condition,
        Output<List<String>> members,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        Output<String> role) {
        this.cloudFunction = Objects.requireNonNull(cloudFunction, "expected parameter 'cloudFunction' to be non-null");
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private FunctionIamBindingArgs() {
        this.cloudFunction = Codegen.empty();
        this.condition = Codegen.empty();
        this.members = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cloudFunction;
        private @Nullable Output<FunctionIamBindingConditionArgs> condition;
        private Output<List<String>> members;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private Output<String> role;

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

        public Builder cloudFunction(Output<String> cloudFunction) {
            this.cloudFunction = Objects.requireNonNull(cloudFunction);
            return this;
        }
        public Builder cloudFunction(String cloudFunction) {
            this.cloudFunction = Output.of(Objects.requireNonNull(cloudFunction));
            return this;
        }
        public Builder condition(@Nullable Output<FunctionIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable FunctionIamBindingConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
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
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public FunctionIamBindingArgs build() {
            return new FunctionIamBindingArgs(cloudFunction, condition, members, project, region, role);
        }
    }
}
