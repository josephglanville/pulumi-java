// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleState extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleState Empty = new FirewallRuleState();

    /**
     * The action to take if this rule matches.
     * Possible values are `UNSPECIFIED_ACTION`, `ALLOW`, and `DENY`.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<String> action;

    public Output<String> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * An optional string description of this rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A positive integer that defines the order of rule evaluation.
     * Rules with the lowest priority are evaluated first.
     * A default rule at priority Int32.MaxValue matches all IPv4 and
     * IPv6 traffic when no previous rule matches. Only the action of
     * this rule can be modified by the user.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * IP address or range, defined using CIDR notation, of requests that this rule applies to.
     * 
     */
    @Import(name="sourceRange")
      private final @Nullable Output<String> sourceRange;

    public Output<String> getSourceRange() {
        return this.sourceRange == null ? Output.empty() : this.sourceRange;
    }

    public FirewallRuleState(
        @Nullable Output<String> action,
        @Nullable Output<String> description,
        @Nullable Output<Integer> priority,
        @Nullable Output<String> project,
        @Nullable Output<String> sourceRange) {
        this.action = action;
        this.description = description;
        this.priority = priority;
        this.project = project;
        this.sourceRange = sourceRange;
    }

    private FirewallRuleState() {
        this.action = Output.empty();
        this.description = Output.empty();
        this.priority = Output.empty();
        this.project = Output.empty();
        this.sourceRange = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<String> project;
        private @Nullable Output<String> sourceRange;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.sourceRange = defaults.sourceRange;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable String action) {
            this.action = Output.ofNullable(action);
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
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
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
        public Builder sourceRange(@Nullable Output<String> sourceRange) {
            this.sourceRange = sourceRange;
            return this;
        }
        public Builder sourceRange(@Nullable String sourceRange) {
            this.sourceRange = Output.ofNullable(sourceRange);
            return this;
        }        public FirewallRuleState build() {
            return new FirewallRuleState(action, description, priority, project, sourceRange);
        }
    }
}
