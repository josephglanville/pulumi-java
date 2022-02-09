// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AzureFirewallNetworkRuleResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallRCActionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFirewallNetworkRuleCollectionResponse {
    private final @Nullable AzureFirewallRCActionResponse action;
    private final String etag;
    private final @Nullable String id;
    private final @Nullable String name;
    private final @Nullable Integer priority;
    private final String provisioningState;
    private final @Nullable List<AzureFirewallNetworkRuleResponse> rules;

    @OutputCustomType.Constructor({"action","etag","id","name","priority","provisioningState","rules"})
    private AzureFirewallNetworkRuleCollectionResponse(
        @Nullable AzureFirewallRCActionResponse action,
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable Integer priority,
        String provisioningState,
        @Nullable List<AzureFirewallNetworkRuleResponse> rules) {
        this.action = action;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.rules = rules;
    }

    public Optional<AzureFirewallRCActionResponse> getAction() {
        return Optional.ofNullable(this.action);
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public List<AzureFirewallNetworkRuleResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallNetworkRuleCollectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureFirewallRCActionResponse action;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String provisioningState;
        private @Nullable List<AzureFirewallNetworkRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallNetworkRuleCollectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.rules = defaults.rules;
        }

        public Builder setAction(@Nullable AzureFirewallRCActionResponse action) {
            this.action = action;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRules(@Nullable List<AzureFirewallNetworkRuleResponse> rules) {
            this.rules = rules;
            return this;
        }

        public AzureFirewallNetworkRuleCollectionResponse build() {
            return new AzureFirewallNetworkRuleCollectionResponse(action, etag, id, name, priority, provisioningState, rules);
        }
    }
}
