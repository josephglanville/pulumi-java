// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleArgs Empty = new FirewallPolicyRuleArgs();

    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502.
     * 
     */
    @InputImport(name="action", required=true)
      private final Input<String> action;

    public Input<String> getAction() {
        return this.action;
    }

    /**
     * An optional description for this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The direction in which this rule applies. Possible values: INGRESS, EGRESS
     * 
     */
    @InputImport(name="direction", required=true)
      private final Input<String> direction;

    public Input<String> getDirection() {
        return this.direction;
    }

    /**
     * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
     * 
     */
    @InputImport(name="enableLogging")
      private final @Nullable Input<Boolean> enableLogging;

    public Input<Boolean> getEnableLogging() {
        return this.enableLogging == null ? Input.empty() : this.enableLogging;
    }

    /**
     * The firewall policy of the resource.
     * 
     */
    @InputImport(name="firewallPolicy", required=true)
      private final Input<String> firewallPolicy;

    public Input<String> getFirewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced. Structure is documented below.
     * 
     */
    @InputImport(name="match", required=true)
      private final Input<FirewallPolicyRuleMatchArgs> match;

    public Input<FirewallPolicyRuleMatchArgs> getMatch() {
        return this.match;
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
     */
    @InputImport(name="priority", required=true)
      private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
     * 
     */
    @InputImport(name="targetResources")
      private final @Nullable Input<List<String>> targetResources;

    public Input<List<String>> getTargetResources() {
        return this.targetResources == null ? Input.empty() : this.targetResources;
    }

    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    @InputImport(name="targetServiceAccounts")
      private final @Nullable Input<List<String>> targetServiceAccounts;

    public Input<List<String>> getTargetServiceAccounts() {
        return this.targetServiceAccounts == null ? Input.empty() : this.targetServiceAccounts;
    }

    public FirewallPolicyRuleArgs(
        Input<String> action,
        @Nullable Input<String> description,
        Input<String> direction,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<Boolean> enableLogging,
        Input<String> firewallPolicy,
        Input<FirewallPolicyRuleMatchArgs> match,
        Input<Integer> priority,
        @Nullable Input<List<String>> targetResources,
        @Nullable Input<List<String>> targetServiceAccounts) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.description = description;
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.disabled = disabled;
        this.enableLogging = enableLogging;
        this.firewallPolicy = Objects.requireNonNull(firewallPolicy, "expected parameter 'firewallPolicy' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.targetResources = targetResources;
        this.targetServiceAccounts = targetServiceAccounts;
    }

    private FirewallPolicyRuleArgs() {
        this.action = Input.empty();
        this.description = Input.empty();
        this.direction = Input.empty();
        this.disabled = Input.empty();
        this.enableLogging = Input.empty();
        this.firewallPolicy = Input.empty();
        this.match = Input.empty();
        this.priority = Input.empty();
        this.targetResources = Input.empty();
        this.targetServiceAccounts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> action;
        private @Nullable Input<String> description;
        private Input<String> direction;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<Boolean> enableLogging;
        private Input<String> firewallPolicy;
        private Input<FirewallPolicyRuleMatchArgs> match;
        private Input<Integer> priority;
        private @Nullable Input<List<String>> targetResources;
        private @Nullable Input<List<String>> targetServiceAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.direction = defaults.direction;
    	      this.disabled = defaults.disabled;
    	      this.enableLogging = defaults.enableLogging;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.match = defaults.match;
    	      this.priority = defaults.priority;
    	      this.targetResources = defaults.targetResources;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
        }

        public Builder setAction(Input<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(String action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDirection(Input<String> direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Input.of(Objects.requireNonNull(direction));
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setEnableLogging(@Nullable Input<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }

        public Builder setEnableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Input.ofNullable(enableLogging);
            return this;
        }

        public Builder setFirewallPolicy(Input<String> firewallPolicy) {
            this.firewallPolicy = Objects.requireNonNull(firewallPolicy);
            return this;
        }

        public Builder setFirewallPolicy(String firewallPolicy) {
            this.firewallPolicy = Input.of(Objects.requireNonNull(firewallPolicy));
            return this;
        }

        public Builder setMatch(Input<FirewallPolicyRuleMatchArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setMatch(FirewallPolicyRuleMatchArgs match) {
            this.match = Input.of(Objects.requireNonNull(match));
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setTargetResources(@Nullable Input<List<String>> targetResources) {
            this.targetResources = targetResources;
            return this;
        }

        public Builder setTargetResources(@Nullable List<String> targetResources) {
            this.targetResources = Input.ofNullable(targetResources);
            return this;
        }

        public Builder setTargetServiceAccounts(@Nullable Input<List<String>> targetServiceAccounts) {
            this.targetServiceAccounts = targetServiceAccounts;
            return this;
        }

        public Builder setTargetServiceAccounts(@Nullable List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Input.ofNullable(targetServiceAccounts);
            return this;
        }
        public FirewallPolicyRuleArgs build() {
            return new FirewallPolicyRuleArgs(action, description, direction, disabled, enableLogging, firewallPolicy, match, priority, targetResources, targetServiceAccounts);
        }
    }
}
