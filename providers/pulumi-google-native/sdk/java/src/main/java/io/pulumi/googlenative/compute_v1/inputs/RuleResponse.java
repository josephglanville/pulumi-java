// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.ConditionResponse;
import io.pulumi.googlenative.compute_v1.inputs.LogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class RuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final RuleResponse Empty = new RuleResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="action", required=true)
      private final String action;

    public String getAction() {
        return this.action;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="conditions", required=true)
      private final List<ConditionResponse> conditions;

    public List<ConditionResponse> getConditions() {
        return this.conditions;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="ins", required=true)
      private final List<String> ins;

    public List<String> getIns() {
        return this.ins;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="logConfigs", required=true)
      private final List<LogConfigResponse> logConfigs;

    public List<LogConfigResponse> getLogConfigs() {
        return this.logConfigs;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="notIns", required=true)
      private final List<String> notIns;

    public List<String> getNotIns() {
        return this.notIns;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="permissions", required=true)
      private final List<String> permissions;

    public List<String> getPermissions() {
        return this.permissions;
    }

    public RuleResponse(
        String action,
        List<ConditionResponse> conditions,
        String description,
        List<String> ins,
        List<LogConfigResponse> logConfigs,
        List<String> notIns,
        List<String> permissions) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.ins = Objects.requireNonNull(ins, "expected parameter 'ins' to be non-null");
        this.logConfigs = Objects.requireNonNull(logConfigs, "expected parameter 'logConfigs' to be non-null");
        this.notIns = Objects.requireNonNull(notIns, "expected parameter 'notIns' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
    }

    private RuleResponse() {
        this.action = null;
        this.conditions = List.of();
        this.description = null;
        this.ins = List.of();
        this.logConfigs = List.of();
        this.notIns = List.of();
        this.permissions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<ConditionResponse> conditions;
        private String description;
        private List<String> ins;
        private List<LogConfigResponse> logConfigs;
        private List<String> notIns;
        private List<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.conditions = defaults.conditions;
    	      this.description = defaults.description;
    	      this.ins = defaults.ins;
    	      this.logConfigs = defaults.logConfigs;
    	      this.notIns = defaults.notIns;
    	      this.permissions = defaults.permissions;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder conditions(List<ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(ConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder ins(List<String> ins) {
            this.ins = Objects.requireNonNull(ins);
            return this;
        }
        public Builder ins(String... ins) {
            return ins(List.of(ins));
        }
        public Builder logConfigs(List<LogConfigResponse> logConfigs) {
            this.logConfigs = Objects.requireNonNull(logConfigs);
            return this;
        }
        public Builder logConfigs(LogConfigResponse... logConfigs) {
            return logConfigs(List.of(logConfigs));
        }
        public Builder notIns(List<String> notIns) {
            this.notIns = Objects.requireNonNull(notIns);
            return this;
        }
        public Builder notIns(String... notIns) {
            return notIns(List.of(notIns));
        }
        public Builder permissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }        public RuleResponse build() {
            return new RuleResponse(action, conditions, description, ins, logConfigs, notIns, permissions);
        }
    }
}
