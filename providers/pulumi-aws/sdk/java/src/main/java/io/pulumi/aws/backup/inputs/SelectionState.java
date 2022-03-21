// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.aws.backup.inputs.SelectionConditionGetArgs;
import io.pulumi.aws.backup.inputs.SelectionSelectionTagGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SelectionState extends io.pulumi.resources.ResourceArgs {

    public static final SelectionState Empty = new SelectionState();

    /**
     * A list of conditions that you define to assign resources to your backup plans using tags.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<SelectionConditionGetArgs>> conditions;

    public Output<List<SelectionConditionGetArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    /**
     * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
     * 
     */
    @Import(name="iamRoleArn")
      private final @Nullable Output<String> iamRoleArn;

    public Output<String> getIamRoleArn() {
        return this.iamRoleArn == null ? Output.empty() : this.iamRoleArn;
    }

    /**
     * The display name of a resource selection document.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to exclude from a backup plan.
     * 
     */
    @Import(name="notResources")
      private final @Nullable Output<List<String>> notResources;

    public Output<List<String>> getNotResources() {
        return this.notResources == null ? Output.empty() : this.notResources;
    }

    /**
     * The backup plan ID to be associated with the selection of resources.
     * 
     */
    @Import(name="planId")
      private final @Nullable Output<String> planId;

    public Output<String> getPlanId() {
        return this.planId == null ? Output.empty() : this.planId;
    }

    /**
     * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    /**
     * Tag-based conditions used to specify a set of resources to assign to a backup plan.
     * 
     */
    @Import(name="selectionTags")
      private final @Nullable Output<List<SelectionSelectionTagGetArgs>> selectionTags;

    public Output<List<SelectionSelectionTagGetArgs>> getSelectionTags() {
        return this.selectionTags == null ? Output.empty() : this.selectionTags;
    }

    public SelectionState(
        @Nullable Output<List<SelectionConditionGetArgs>> conditions,
        @Nullable Output<String> iamRoleArn,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> notResources,
        @Nullable Output<String> planId,
        @Nullable Output<List<String>> resources,
        @Nullable Output<List<SelectionSelectionTagGetArgs>> selectionTags) {
        this.conditions = conditions;
        this.iamRoleArn = iamRoleArn;
        this.name = name;
        this.notResources = notResources;
        this.planId = planId;
        this.resources = resources;
        this.selectionTags = selectionTags;
    }

    private SelectionState() {
        this.conditions = Output.empty();
        this.iamRoleArn = Output.empty();
        this.name = Output.empty();
        this.notResources = Output.empty();
        this.planId = Output.empty();
        this.resources = Output.empty();
        this.selectionTags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SelectionConditionGetArgs>> conditions;
        private @Nullable Output<String> iamRoleArn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> notResources;
        private @Nullable Output<String> planId;
        private @Nullable Output<List<String>> resources;
        private @Nullable Output<List<SelectionSelectionTagGetArgs>> selectionTags;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.name = defaults.name;
    	      this.notResources = defaults.notResources;
    	      this.planId = defaults.planId;
    	      this.resources = defaults.resources;
    	      this.selectionTags = defaults.selectionTags;
        }

        public Builder conditions(@Nullable Output<List<SelectionConditionGetArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<SelectionConditionGetArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }
        public Builder conditions(SelectionConditionGetArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder iamRoleArn(@Nullable Output<String> iamRoleArn) {
            this.iamRoleArn = iamRoleArn;
            return this;
        }
        public Builder iamRoleArn(@Nullable String iamRoleArn) {
            this.iamRoleArn = Output.ofNullable(iamRoleArn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder notResources(@Nullable Output<List<String>> notResources) {
            this.notResources = notResources;
            return this;
        }
        public Builder notResources(@Nullable List<String> notResources) {
            this.notResources = Output.ofNullable(notResources);
            return this;
        }
        public Builder notResources(String... notResources) {
            return notResources(List.of(notResources));
        }
        public Builder planId(@Nullable Output<String> planId) {
            this.planId = planId;
            return this;
        }
        public Builder planId(@Nullable String planId) {
            this.planId = Output.ofNullable(planId);
            return this;
        }
        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = Output.ofNullable(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public Builder selectionTags(@Nullable Output<List<SelectionSelectionTagGetArgs>> selectionTags) {
            this.selectionTags = selectionTags;
            return this;
        }
        public Builder selectionTags(@Nullable List<SelectionSelectionTagGetArgs> selectionTags) {
            this.selectionTags = Output.ofNullable(selectionTags);
            return this;
        }
        public Builder selectionTags(SelectionSelectionTagGetArgs... selectionTags) {
            return selectionTags(List.of(selectionTags));
        }        public SelectionState build() {
            return new SelectionState(conditions, iamRoleArn, name, notResources, planId, resources, selectionTags);
        }
    }
}
