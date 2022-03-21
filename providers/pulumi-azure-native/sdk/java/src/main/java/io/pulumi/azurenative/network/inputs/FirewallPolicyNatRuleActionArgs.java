// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FirewallPolicyNatRuleActionType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the FirewallPolicyNatRuleAction.
 * 
 */
public final class FirewallPolicyNatRuleActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyNatRuleActionArgs Empty = new FirewallPolicyNatRuleActionArgs();

    /**
     * The type of action.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,FirewallPolicyNatRuleActionType>> type;

    public Output<Either<String,FirewallPolicyNatRuleActionType>> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public FirewallPolicyNatRuleActionArgs(@Nullable Output<Either<String,FirewallPolicyNatRuleActionType>> type) {
        this.type = type;
    }

    private FirewallPolicyNatRuleActionArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyNatRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,FirewallPolicyNatRuleActionType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyNatRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<Either<String,FirewallPolicyNatRuleActionType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,FirewallPolicyNatRuleActionType> type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public FirewallPolicyNatRuleActionArgs build() {
            return new FirewallPolicyNatRuleActionArgs(type);
        }
    }
}
