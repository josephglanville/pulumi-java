// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub;

import io.pulumi.awsnative.resiliencehub.enums.ResiliencyPolicyDataLocationConstraint;
import io.pulumi.awsnative.resiliencehub.enums.ResiliencyPolicyTier;
import io.pulumi.awsnative.resiliencehub.inputs.ResiliencyPolicyPolicyMapArgs;
import io.pulumi.awsnative.resiliencehub.inputs.ResiliencyPolicyTagMapArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResiliencyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResiliencyPolicyArgs Empty = new ResiliencyPolicyArgs();

    /**
     * Data Location Constraint of the Policy.
     * 
     */
    @Import(name="dataLocationConstraint")
      private final @Nullable Output<ResiliencyPolicyDataLocationConstraint> dataLocationConstraint;

    public Output<ResiliencyPolicyDataLocationConstraint> getDataLocationConstraint() {
        return this.dataLocationConstraint == null ? Codegen.empty() : this.dataLocationConstraint;
    }

    @Import(name="policy", required=true)
      private final Output<ResiliencyPolicyPolicyMapArgs> policy;

    public Output<ResiliencyPolicyPolicyMapArgs> getPolicy() {
        return this.policy;
    }

    /**
     * Description of Resiliency Policy.
     * 
     */
    @Import(name="policyDescription")
      private final @Nullable Output<String> policyDescription;

    public Output<String> getPolicyDescription() {
        return this.policyDescription == null ? Codegen.empty() : this.policyDescription;
    }

    /**
     * Name of Resiliency Policy.
     * 
     */
    @Import(name="policyName", required=true)
      private final Output<String> policyName;

    public Output<String> getPolicyName() {
        return this.policyName;
    }

    @Import(name="tags")
      private final @Nullable Output<ResiliencyPolicyTagMapArgs> tags;

    public Output<ResiliencyPolicyTagMapArgs> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Resiliency Policy Tier.
     * 
     */
    @Import(name="tier", required=true)
      private final Output<ResiliencyPolicyTier> tier;

    public Output<ResiliencyPolicyTier> getTier() {
        return this.tier;
    }

    public ResiliencyPolicyArgs(
        @Nullable Output<ResiliencyPolicyDataLocationConstraint> dataLocationConstraint,
        Output<ResiliencyPolicyPolicyMapArgs> policy,
        @Nullable Output<String> policyDescription,
        Output<String> policyName,
        @Nullable Output<ResiliencyPolicyTagMapArgs> tags,
        Output<ResiliencyPolicyTier> tier) {
        this.dataLocationConstraint = dataLocationConstraint;
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.policyDescription = policyDescription;
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
        this.tags = tags;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private ResiliencyPolicyArgs() {
        this.dataLocationConstraint = Codegen.empty();
        this.policy = Codegen.empty();
        this.policyDescription = Codegen.empty();
        this.policyName = Codegen.empty();
        this.tags = Codegen.empty();
        this.tier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResiliencyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResiliencyPolicyDataLocationConstraint> dataLocationConstraint;
        private Output<ResiliencyPolicyPolicyMapArgs> policy;
        private @Nullable Output<String> policyDescription;
        private Output<String> policyName;
        private @Nullable Output<ResiliencyPolicyTagMapArgs> tags;
        private Output<ResiliencyPolicyTier> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ResiliencyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataLocationConstraint = defaults.dataLocationConstraint;
    	      this.policy = defaults.policy;
    	      this.policyDescription = defaults.policyDescription;
    	      this.policyName = defaults.policyName;
    	      this.tags = defaults.tags;
    	      this.tier = defaults.tier;
        }

        public Builder dataLocationConstraint(@Nullable Output<ResiliencyPolicyDataLocationConstraint> dataLocationConstraint) {
            this.dataLocationConstraint = dataLocationConstraint;
            return this;
        }
        public Builder dataLocationConstraint(@Nullable ResiliencyPolicyDataLocationConstraint dataLocationConstraint) {
            this.dataLocationConstraint = Codegen.ofNullable(dataLocationConstraint);
            return this;
        }
        public Builder policy(Output<ResiliencyPolicyPolicyMapArgs> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder policy(ResiliencyPolicyPolicyMapArgs policy) {
            this.policy = Output.of(Objects.requireNonNull(policy));
            return this;
        }
        public Builder policyDescription(@Nullable Output<String> policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public Builder policyDescription(@Nullable String policyDescription) {
            this.policyDescription = Codegen.ofNullable(policyDescription);
            return this;
        }
        public Builder policyName(Output<String> policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        public Builder policyName(String policyName) {
            this.policyName = Output.of(Objects.requireNonNull(policyName));
            return this;
        }
        public Builder tags(@Nullable Output<ResiliencyPolicyTagMapArgs> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable ResiliencyPolicyTagMapArgs tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tier(Output<ResiliencyPolicyTier> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder tier(ResiliencyPolicyTier tier) {
            this.tier = Output.of(Objects.requireNonNull(tier));
            return this;
        }        public ResiliencyPolicyArgs build() {
            return new ResiliencyPolicyArgs(dataLocationConstraint, policy, policyDescription, policyName, tags, tier);
        }
    }
}
