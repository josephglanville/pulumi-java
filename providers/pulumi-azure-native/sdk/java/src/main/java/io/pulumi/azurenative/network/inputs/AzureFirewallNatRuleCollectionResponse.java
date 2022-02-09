// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AzureFirewallNatRCActionResponse;
import io.pulumi.azurenative.network.inputs.AzureFirewallNatRuleResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureFirewallNatRuleCollectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFirewallNatRuleCollectionResponse Empty = new AzureFirewallNatRuleCollectionResponse();

    @InputImport(name="action")
    private final @Nullable AzureFirewallNatRCActionResponse action;

    public Optional<AzureFirewallNatRCActionResponse> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="priority")
    private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="rules")
    private final @Nullable List<AzureFirewallNatRuleResponse> rules;

    public List<AzureFirewallNatRuleResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public AzureFirewallNatRuleCollectionResponse(
        @Nullable AzureFirewallNatRCActionResponse action,
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable Integer priority,
        String provisioningState,
        @Nullable List<AzureFirewallNatRuleResponse> rules) {
        this.action = action;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.rules = rules;
    }

    private AzureFirewallNatRuleCollectionResponse() {
        this.action = null;
        this.etag = null;
        this.id = null;
        this.name = null;
        this.priority = null;
        this.provisioningState = null;
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallNatRuleCollectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureFirewallNatRCActionResponse action;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String provisioningState;
        private @Nullable List<AzureFirewallNatRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallNatRuleCollectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.rules = defaults.rules;
        }

        public Builder setAction(@Nullable AzureFirewallNatRCActionResponse action) {
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

        public Builder setRules(@Nullable List<AzureFirewallNatRuleResponse> rules) {
            this.rules = rules;
            return this;
        }

        public AzureFirewallNatRuleCollectionResponse build() {
            return new AzureFirewallNatRuleCollectionResponse(action, etag, id, name, priority, provisioningState, rules);
        }
    }
}
