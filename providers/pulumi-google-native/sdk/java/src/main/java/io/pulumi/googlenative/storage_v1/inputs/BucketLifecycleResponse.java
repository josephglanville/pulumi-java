// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.storage_v1.inputs.BucketLifecycleRuleItemResponse;
import java.util.List;
import java.util.Objects;


/**
 * The bucket's lifecycle configuration. See lifecycle management for more information.
 * 
 */
public final class BucketLifecycleResponse extends io.pulumi.resources.InvokeArgs {

    public static final BucketLifecycleResponse Empty = new BucketLifecycleResponse();

    /**
     * A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken.
     * 
     */
    @Import(name="rule", required=true)
      private final List<BucketLifecycleRuleItemResponse> rule;

    public List<BucketLifecycleRuleItemResponse> getRule() {
        return this.rule;
    }

    public BucketLifecycleResponse(List<BucketLifecycleRuleItemResponse> rule) {
        this.rule = Objects.requireNonNull(rule, "expected parameter 'rule' to be non-null");
    }

    private BucketLifecycleResponse() {
        this.rule = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketLifecycleRuleItemResponse> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
        }

        public Builder rule(List<BucketLifecycleRuleItemResponse> rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }
        public Builder rule(BucketLifecycleRuleItemResponse... rule) {
            return rule(List.of(rule));
        }        public BucketLifecycleResponse build() {
            return new BucketLifecycleResponse(rule);
        }
    }
}
