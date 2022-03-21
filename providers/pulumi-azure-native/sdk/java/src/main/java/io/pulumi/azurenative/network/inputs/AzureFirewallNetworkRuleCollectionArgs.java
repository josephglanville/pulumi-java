// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AzureFirewallNetworkRuleArgs;
import io.pulumi.azurenative.network.inputs.AzureFirewallRCActionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network rule collection resource.
 * 
 */
public final class AzureFirewallNetworkRuleCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFirewallNetworkRuleCollectionArgs Empty = new AzureFirewallNetworkRuleCollectionArgs();

    /**
     * The action type of a rule collection.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<AzureFirewallRCActionArgs> action;

    public Output<AzureFirewallRCActionArgs> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Priority of the network rule collection resource.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * Collection of rules used by a network rule collection.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<AzureFirewallNetworkRuleArgs>> rules;

    public Output<List<AzureFirewallNetworkRuleArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    public AzureFirewallNetworkRuleCollectionArgs(
        @Nullable Output<AzureFirewallRCActionArgs> action,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<Integer> priority,
        @Nullable Output<List<AzureFirewallNetworkRuleArgs>> rules) {
        this.action = action;
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.rules = rules;
    }

    private AzureFirewallNetworkRuleCollectionArgs() {
        this.action = Output.empty();
        this.id = Output.empty();
        this.name = Output.empty();
        this.priority = Output.empty();
        this.rules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallNetworkRuleCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AzureFirewallRCActionArgs> action;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<List<AzureFirewallNetworkRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallNetworkRuleCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.rules = defaults.rules;
        }

        public Builder action(@Nullable Output<AzureFirewallRCActionArgs> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable AzureFirewallRCActionArgs action) {
            this.action = Output.ofNullable(action);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
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
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }
        public Builder rules(@Nullable Output<List<AzureFirewallNetworkRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<AzureFirewallNetworkRuleArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public Builder rules(AzureFirewallNetworkRuleArgs... rules) {
            return rules(List.of(rules));
        }        public AzureFirewallNetworkRuleCollectionArgs build() {
            return new AzureFirewallNetworkRuleCollectionArgs(action, id, name, priority, rules);
        }
    }
}
