// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FrontDoorManagedRuleGroupOverrideResponse;
import io.pulumi.azurenative.network.inputs.ManagedRuleExclusionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrontDoorManagedRuleSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final FrontDoorManagedRuleSetResponse Empty = new FrontDoorManagedRuleSetResponse();

    @InputImport(name="exclusions")
    private final @Nullable List<ManagedRuleExclusionResponse> exclusions;

    public List<ManagedRuleExclusionResponse> getExclusions() {
        return this.exclusions == null ? List.of() : this.exclusions;
    }

    @InputImport(name="ruleGroupOverrides")
    private final @Nullable List<FrontDoorManagedRuleGroupOverrideResponse> ruleGroupOverrides;

    public List<FrontDoorManagedRuleGroupOverrideResponse> getRuleGroupOverrides() {
        return this.ruleGroupOverrides == null ? List.of() : this.ruleGroupOverrides;
    }

    @InputImport(name="ruleSetAction")
    private final @Nullable String ruleSetAction;

    public Optional<String> getRuleSetAction() {
        return this.ruleSetAction == null ? Optional.empty() : Optional.ofNullable(this.ruleSetAction);
    }

    @InputImport(name="ruleSetType", required=true)
    private final String ruleSetType;

    public String getRuleSetType() {
        return this.ruleSetType;
    }

    @InputImport(name="ruleSetVersion", required=true)
    private final String ruleSetVersion;

    public String getRuleSetVersion() {
        return this.ruleSetVersion;
    }

    public FrontDoorManagedRuleSetResponse(
        @Nullable List<ManagedRuleExclusionResponse> exclusions,
        @Nullable List<FrontDoorManagedRuleGroupOverrideResponse> ruleGroupOverrides,
        @Nullable String ruleSetAction,
        String ruleSetType,
        String ruleSetVersion) {
        this.exclusions = exclusions;
        this.ruleGroupOverrides = ruleGroupOverrides;
        this.ruleSetAction = ruleSetAction;
        this.ruleSetType = Objects.requireNonNull(ruleSetType, "expected parameter 'ruleSetType' to be non-null");
        this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion, "expected parameter 'ruleSetVersion' to be non-null");
    }

    private FrontDoorManagedRuleSetResponse() {
        this.exclusions = List.of();
        this.ruleGroupOverrides = List.of();
        this.ruleSetAction = null;
        this.ruleSetType = null;
        this.ruleSetVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontDoorManagedRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ManagedRuleExclusionResponse> exclusions;
        private @Nullable List<FrontDoorManagedRuleGroupOverrideResponse> ruleGroupOverrides;
        private @Nullable String ruleSetAction;
        private String ruleSetType;
        private String ruleSetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontDoorManagedRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusions = defaults.exclusions;
    	      this.ruleGroupOverrides = defaults.ruleGroupOverrides;
    	      this.ruleSetAction = defaults.ruleSetAction;
    	      this.ruleSetType = defaults.ruleSetType;
    	      this.ruleSetVersion = defaults.ruleSetVersion;
        }

        public Builder setExclusions(@Nullable List<ManagedRuleExclusionResponse> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        public Builder setRuleGroupOverrides(@Nullable List<FrontDoorManagedRuleGroupOverrideResponse> ruleGroupOverrides) {
            this.ruleGroupOverrides = ruleGroupOverrides;
            return this;
        }

        public Builder setRuleSetAction(@Nullable String ruleSetAction) {
            this.ruleSetAction = ruleSetAction;
            return this;
        }

        public Builder setRuleSetType(String ruleSetType) {
            this.ruleSetType = Objects.requireNonNull(ruleSetType);
            return this;
        }

        public Builder setRuleSetVersion(String ruleSetVersion) {
            this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion);
            return this;
        }

        public FrontDoorManagedRuleSetResponse build() {
            return new FrontDoorManagedRuleSetResponse(exclusions, ruleGroupOverrides, ruleSetAction, ruleSetType, ruleSetVersion);
        }
    }
}
