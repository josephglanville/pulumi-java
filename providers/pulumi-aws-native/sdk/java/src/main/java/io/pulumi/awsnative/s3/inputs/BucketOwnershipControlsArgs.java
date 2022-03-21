// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketOwnershipControlsRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class BucketOwnershipControlsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketOwnershipControlsArgs Empty = new BucketOwnershipControlsArgs();

    @Import(name="rules", required=true)
      private final Output<List<BucketOwnershipControlsRuleArgs>> rules;

    public Output<List<BucketOwnershipControlsRuleArgs>> getRules() {
        return this.rules;
    }

    public BucketOwnershipControlsArgs(Output<List<BucketOwnershipControlsRuleArgs>> rules) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private BucketOwnershipControlsArgs() {
        this.rules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketOwnershipControlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<BucketOwnershipControlsRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketOwnershipControlsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(Output<List<BucketOwnershipControlsRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(List<BucketOwnershipControlsRuleArgs> rules) {
            this.rules = Output.of(Objects.requireNonNull(rules));
            return this;
        }
        public Builder rules(BucketOwnershipControlsRuleArgs... rules) {
            return rules(List.of(rules));
        }        public BucketOwnershipControlsArgs build() {
            return new BucketOwnershipControlsArgs(rules);
        }
    }
}
