// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.enums.RuleAction;
import io.pulumi.googlenative.compute_beta.inputs.ConditionArgs;
import io.pulumi.googlenative.compute_beta.inputs.LogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class RuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<RuleAction> action;

    public Output<RuleAction> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<ConditionArgs>> conditions;

    public Output<List<ConditionArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="ins")
      private final @Nullable Output<List<String>> ins;

    public Output<List<String>> getIns() {
        return this.ins == null ? Output.empty() : this.ins;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="logConfigs")
      private final @Nullable Output<List<LogConfigArgs>> logConfigs;

    public Output<List<LogConfigArgs>> getLogConfigs() {
        return this.logConfigs == null ? Output.empty() : this.logConfigs;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="notIns")
      private final @Nullable Output<List<String>> notIns;

    public Output<List<String>> getNotIns() {
        return this.notIns == null ? Output.empty() : this.notIns;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<List<String>> permissions;

    public Output<List<String>> getPermissions() {
        return this.permissions == null ? Output.empty() : this.permissions;
    }

    public RuleArgs(
        @Nullable Output<RuleAction> action,
        @Nullable Output<List<ConditionArgs>> conditions,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> ins,
        @Nullable Output<List<LogConfigArgs>> logConfigs,
        @Nullable Output<List<String>> notIns,
        @Nullable Output<List<String>> permissions) {
        this.action = action;
        this.conditions = conditions;
        this.description = description;
        this.ins = ins;
        this.logConfigs = logConfigs;
        this.notIns = notIns;
        this.permissions = permissions;
    }

    private RuleArgs() {
        this.action = Output.empty();
        this.conditions = Output.empty();
        this.description = Output.empty();
        this.ins = Output.empty();
        this.logConfigs = Output.empty();
        this.notIns = Output.empty();
        this.permissions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleAction> action;
        private @Nullable Output<List<ConditionArgs>> conditions;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> ins;
        private @Nullable Output<List<LogConfigArgs>> logConfigs;
        private @Nullable Output<List<String>> notIns;
        private @Nullable Output<List<String>> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.conditions = defaults.conditions;
    	      this.description = defaults.description;
    	      this.ins = defaults.ins;
    	      this.logConfigs = defaults.logConfigs;
    	      this.notIns = defaults.notIns;
    	      this.permissions = defaults.permissions;
        }

        public Builder action(@Nullable Output<RuleAction> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable RuleAction action) {
            this.action = Output.ofNullable(action);
            return this;
        }
        public Builder conditions(@Nullable Output<List<ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<ConditionArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }
        public Builder conditions(ConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder ins(@Nullable Output<List<String>> ins) {
            this.ins = ins;
            return this;
        }
        public Builder ins(@Nullable List<String> ins) {
            this.ins = Output.ofNullable(ins);
            return this;
        }
        public Builder ins(String... ins) {
            return ins(List.of(ins));
        }
        public Builder logConfigs(@Nullable Output<List<LogConfigArgs>> logConfigs) {
            this.logConfigs = logConfigs;
            return this;
        }
        public Builder logConfigs(@Nullable List<LogConfigArgs> logConfigs) {
            this.logConfigs = Output.ofNullable(logConfigs);
            return this;
        }
        public Builder logConfigs(LogConfigArgs... logConfigs) {
            return logConfigs(List.of(logConfigs));
        }
        public Builder notIns(@Nullable Output<List<String>> notIns) {
            this.notIns = notIns;
            return this;
        }
        public Builder notIns(@Nullable List<String> notIns) {
            this.notIns = Output.ofNullable(notIns);
            return this;
        }
        public Builder notIns(String... notIns) {
            return notIns(List.of(notIns));
        }
        public Builder permissions(@Nullable Output<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = Output.ofNullable(permissions);
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }        public RuleArgs build() {
            return new RuleArgs(action, conditions, description, ins, logConfigs, notIns, permissions);
        }
    }
}
