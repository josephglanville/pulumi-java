// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final FunctionIamMemberState Empty = new FunctionIamMemberState();

    @InputImport(name="cloudFunction")
      private final @Nullable Input<String> cloudFunction;

    public Input<String> getCloudFunction() {
        return this.cloudFunction == null ? Input.empty() : this.cloudFunction;
    }

    @InputImport(name="condition")
      private final @Nullable Input<FunctionIamMemberConditionGetArgs> condition;

    public Input<FunctionIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="member")
      private final @Nullable Input<String> member;

    public Input<String> getMember() {
        return this.member == null ? Input.empty() : this.member;
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

    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public FunctionIamMemberState(
        @Nullable Input<String> cloudFunction,
        @Nullable Input<FunctionIamMemberConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> member,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> role) {
        this.cloudFunction = cloudFunction;
        this.condition = condition;
        this.etag = etag;
        this.member = member;
        this.project = project;
        this.region = region;
        this.role = role;
    }

    private FunctionIamMemberState() {
        this.cloudFunction = Input.empty();
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudFunction;
        private @Nullable Input<FunctionIamMemberConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> member;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
        }

        public Builder setCloudFunction(@Nullable Input<String> cloudFunction) {
            this.cloudFunction = cloudFunction;
            return this;
        }

        public Builder setCloudFunction(@Nullable String cloudFunction) {
            this.cloudFunction = Input.ofNullable(cloudFunction);
            return this;
        }

        public Builder setCondition(@Nullable Input<FunctionIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable FunctionIamMemberConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setMember(@Nullable Input<String> member) {
            this.member = member;
            return this;
        }

        public Builder setMember(@Nullable String member) {
            this.member = Input.ofNullable(member);
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

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }
        public FunctionIamMemberState build() {
            return new FunctionIamMemberState(cloudFunction, condition, etag, member, project, region, role);
        }
    }
}
