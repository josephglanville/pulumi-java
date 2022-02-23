// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketOwnershipControlsRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class BucketOwnershipControlsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketOwnershipControlsArgs Empty = new BucketOwnershipControlsArgs();

    @InputImport(name="rules", required=true)
      private final Input<List<BucketOwnershipControlsRuleArgs>> rules;

    public Input<List<BucketOwnershipControlsRuleArgs>> getRules() {
        return this.rules;
    }

    public BucketOwnershipControlsArgs(Input<List<BucketOwnershipControlsRuleArgs>> rules) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private BucketOwnershipControlsArgs() {
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketOwnershipControlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<BucketOwnershipControlsRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketOwnershipControlsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(Input<List<BucketOwnershipControlsRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setRules(List<BucketOwnershipControlsRuleArgs> rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
            return this;
        }
        public BucketOwnershipControlsArgs build() {
            return new BucketOwnershipControlsArgs(rules);
        }
    }
}
