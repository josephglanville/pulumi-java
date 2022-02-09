// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FirewallPolicyFilterRuleCollectionResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyNatRuleCollectionResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFirewallPolicyRuleCollectionGroupResult {
    private final String etag;
    private final @Nullable String id;
    private final @Nullable String name;
    private final @Nullable Integer priority;
    private final String provisioningState;
    private final @Nullable List<Either<FirewallPolicyFilterRuleCollectionResponse,FirewallPolicyNatRuleCollectionResponse>> ruleCollections;
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","priority","provisioningState","ruleCollections","type"})
    private GetFirewallPolicyRuleCollectionGroupResult(
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable Integer priority,
        String provisioningState,
        @Nullable List<Either<FirewallPolicyFilterRuleCollectionResponse,FirewallPolicyNatRuleCollectionResponse>> ruleCollections,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.ruleCollections = ruleCollections;
        this.type = Objects.requireNonNull(type);
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
    public List<Either<FirewallPolicyFilterRuleCollectionResponse,FirewallPolicyNatRuleCollectionResponse>> getRuleCollections() {
        return this.ruleCollections == null ? List.of() : this.ruleCollections;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyRuleCollectionGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String provisioningState;
        private @Nullable List<Either<FirewallPolicyFilterRuleCollectionResponse,FirewallPolicyNatRuleCollectionResponse>> ruleCollections;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyRuleCollectionGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.ruleCollections = defaults.ruleCollections;
    	      this.type = defaults.type;
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

        public Builder setRuleCollections(@Nullable List<Either<FirewallPolicyFilterRuleCollectionResponse,FirewallPolicyNatRuleCollectionResponse>> ruleCollections) {
            this.ruleCollections = ruleCollections;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetFirewallPolicyRuleCollectionGroupResult build() {
            return new GetFirewallPolicyRuleCollectionGroupResult(etag, id, name, priority, provisioningState, ruleCollections, type);
        }
    }
}
