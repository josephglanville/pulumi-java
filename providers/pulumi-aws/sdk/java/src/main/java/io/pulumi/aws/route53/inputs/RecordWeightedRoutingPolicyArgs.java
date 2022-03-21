// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class RecordWeightedRoutingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecordWeightedRoutingPolicyArgs Empty = new RecordWeightedRoutingPolicyArgs();

    /**
     * A numeric value indicating the relative weight of the record. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted.
     * 
     */
    @Import(name="weight", required=true)
      private final Output<Integer> weight;

    public Output<Integer> getWeight() {
        return this.weight;
    }

    public RecordWeightedRoutingPolicyArgs(Output<Integer> weight) {
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private RecordWeightedRoutingPolicyArgs() {
        this.weight = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordWeightedRoutingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordWeightedRoutingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weight = defaults.weight;
        }

        public Builder weight(Output<Integer> weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Output.of(Objects.requireNonNull(weight));
            return this;
        }        public RecordWeightedRoutingPolicyArgs build() {
            return new RecordWeightedRoutingPolicyArgs(weight);
        }
    }
}
