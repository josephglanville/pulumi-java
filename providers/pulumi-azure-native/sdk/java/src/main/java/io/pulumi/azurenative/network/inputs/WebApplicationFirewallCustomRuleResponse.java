// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.MatchConditionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines contents of a web application rule.
 * 
 */
public final class WebApplicationFirewallCustomRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebApplicationFirewallCustomRuleResponse Empty = new WebApplicationFirewallCustomRuleResponse();

    /**
     * Type of Actions.
     * 
     */
    @InputImport(name="action", required=true)
      private final String action;

    public String getAction() {
        return this.action;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * List of match conditions.
     * 
     */
    @InputImport(name="matchConditions", required=true)
      private final List<MatchConditionResponse> matchConditions;

    public List<MatchConditionResponse> getMatchConditions() {
        return this.matchConditions;
    }

    /**
     * The name of the resource that is unique within a policy. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Priority of the rule. Rules with a lower value will be evaluated before rules with a higher value.
     * 
     */
    @InputImport(name="priority", required=true)
      private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * The rule type.
     * 
     */
    @InputImport(name="ruleType", required=true)
      private final String ruleType;

    public String getRuleType() {
        return this.ruleType;
    }

    public WebApplicationFirewallCustomRuleResponse(
        String action,
        String etag,
        List<MatchConditionResponse> matchConditions,
        @Nullable String name,
        Integer priority,
        String ruleType) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.matchConditions = Objects.requireNonNull(matchConditions, "expected parameter 'matchConditions' to be non-null");
        this.name = name;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
    }

    private WebApplicationFirewallCustomRuleResponse() {
        this.action = null;
        this.etag = null;
        this.matchConditions = List.of();
        this.name = null;
        this.priority = null;
        this.ruleType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationFirewallCustomRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String etag;
        private List<MatchConditionResponse> matchConditions;
        private @Nullable String name;
        private Integer priority;
        private String ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(WebApplicationFirewallCustomRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.etag = defaults.etag;
    	      this.matchConditions = defaults.matchConditions;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setMatchConditions(List<MatchConditionResponse> matchConditions) {
            this.matchConditions = Objects.requireNonNull(matchConditions);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public WebApplicationFirewallCustomRuleResponse build() {
            return new WebApplicationFirewallCustomRuleResponse(action, etag, matchConditions, name, priority, ruleType);
        }
    }
}
