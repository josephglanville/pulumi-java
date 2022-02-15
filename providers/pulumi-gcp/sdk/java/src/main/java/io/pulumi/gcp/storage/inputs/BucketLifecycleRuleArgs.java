// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.storage.inputs.BucketLifecycleRuleActionArgs;
import io.pulumi.gcp.storage.inputs.BucketLifecycleRuleConditionArgs;
import java.util.Objects;


public final class BucketLifecycleRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleArgs Empty = new BucketLifecycleRuleArgs();

    @InputImport(name="action", required=true)
    private final Input<BucketLifecycleRuleActionArgs> action;

    public Input<BucketLifecycleRuleActionArgs> getAction() {
        return this.action;
    }

    @InputImport(name="condition", required=true)
    private final Input<BucketLifecycleRuleConditionArgs> condition;

    public Input<BucketLifecycleRuleConditionArgs> getCondition() {
        return this.condition;
    }

    public BucketLifecycleRuleArgs(
        Input<BucketLifecycleRuleActionArgs> action,
        Input<BucketLifecycleRuleConditionArgs> condition) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
    }

    private BucketLifecycleRuleArgs() {
        this.action = Input.empty();
        this.condition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BucketLifecycleRuleActionArgs> action;
        private Input<BucketLifecycleRuleConditionArgs> condition;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.condition = defaults.condition;
        }

        public Builder setAction(Input<BucketLifecycleRuleActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(BucketLifecycleRuleActionArgs action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setCondition(Input<BucketLifecycleRuleConditionArgs> condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setCondition(BucketLifecycleRuleConditionArgs condition) {
            this.condition = Input.of(Objects.requireNonNull(condition));
            return this;
        }

        public BucketLifecycleRuleArgs build() {
            return new BucketLifecycleRuleArgs(action, condition);
        }
    }
}