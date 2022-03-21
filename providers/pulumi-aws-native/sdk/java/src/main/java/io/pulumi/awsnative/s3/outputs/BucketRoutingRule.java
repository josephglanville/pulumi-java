// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketRedirectRule;
import io.pulumi.awsnative.s3.outputs.BucketRoutingRuleCondition;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketRoutingRule {
    /**
     * Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can specify a different error code to return.
     * 
     */
    private final BucketRedirectRule redirectRule;
    private final @Nullable BucketRoutingRuleCondition routingRuleCondition;

    @CustomType.Constructor
    private BucketRoutingRule(
        @CustomType.Parameter("redirectRule") BucketRedirectRule redirectRule,
        @CustomType.Parameter("routingRuleCondition") @Nullable BucketRoutingRuleCondition routingRuleCondition) {
        this.redirectRule = redirectRule;
        this.routingRuleCondition = routingRuleCondition;
    }

    /**
     * Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can specify a different error code to return.
     * 
    */
    public BucketRedirectRule getRedirectRule() {
        return this.redirectRule;
    }
    public Optional<BucketRoutingRuleCondition> getRoutingRuleCondition() {
        return Optional.ofNullable(this.routingRuleCondition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRoutingRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketRedirectRule redirectRule;
        private @Nullable BucketRoutingRuleCondition routingRuleCondition;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRoutingRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redirectRule = defaults.redirectRule;
    	      this.routingRuleCondition = defaults.routingRuleCondition;
        }

        public Builder redirectRule(BucketRedirectRule redirectRule) {
            this.redirectRule = Objects.requireNonNull(redirectRule);
            return this;
        }
        public Builder routingRuleCondition(@Nullable BucketRoutingRuleCondition routingRuleCondition) {
            this.routingRuleCondition = routingRuleCondition;
            return this;
        }        public BucketRoutingRule build() {
            return new BucketRoutingRule(redirectRule, routingRuleCondition);
        }
    }
}
