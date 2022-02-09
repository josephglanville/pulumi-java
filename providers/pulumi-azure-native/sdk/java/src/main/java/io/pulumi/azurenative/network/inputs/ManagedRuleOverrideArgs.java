// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ManagedRuleEnabledState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedRuleOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedRuleOverrideArgs Empty = new ManagedRuleOverrideArgs();

    @InputImport(name="ruleId", required=true)
    private final Input<String> ruleId;

    public Input<String> getRuleId() {
        return this.ruleId;
    }

    @InputImport(name="state")
    private final @Nullable Input<Either<String,ManagedRuleEnabledState>> state;

    public Input<Either<String,ManagedRuleEnabledState>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public ManagedRuleOverrideArgs(
        Input<String> ruleId,
        @Nullable Input<Either<String,ManagedRuleEnabledState>> state) {
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
        this.state = state;
    }

    private ManagedRuleOverrideArgs() {
        this.ruleId = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ruleId;
        private @Nullable Input<Either<String,ManagedRuleEnabledState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleId = defaults.ruleId;
    	      this.state = defaults.state;
        }

        public Builder setRuleId(Input<String> ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }

        public Builder setRuleId(String ruleId) {
            this.ruleId = Input.of(Objects.requireNonNull(ruleId));
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,ManagedRuleEnabledState>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,ManagedRuleEnabledState> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public ManagedRuleOverrideArgs build() {
            return new ManagedRuleOverrideArgs(ruleId, state);
        }
    }
}
