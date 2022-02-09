// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ManagedRuleSetResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedRuleSetListResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedRuleSetListResponse Empty = new ManagedRuleSetListResponse();

    @InputImport(name="managedRuleSets")
    private final @Nullable List<ManagedRuleSetResponse> managedRuleSets;

    public List<ManagedRuleSetResponse> getManagedRuleSets() {
        return this.managedRuleSets == null ? List.of() : this.managedRuleSets;
    }

    public ManagedRuleSetListResponse(@Nullable List<ManagedRuleSetResponse> managedRuleSets) {
        this.managedRuleSets = managedRuleSets;
    }

    private ManagedRuleSetListResponse() {
        this.managedRuleSets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleSetListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ManagedRuleSetResponse> managedRuleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleSetListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedRuleSets = defaults.managedRuleSets;
        }

        public Builder setManagedRuleSets(@Nullable List<ManagedRuleSetResponse> managedRuleSets) {
            this.managedRuleSets = managedRuleSets;
            return this;
        }

        public ManagedRuleSetListResponse build() {
            return new ManagedRuleSetListResponse(managedRuleSets);
        }
    }
}
