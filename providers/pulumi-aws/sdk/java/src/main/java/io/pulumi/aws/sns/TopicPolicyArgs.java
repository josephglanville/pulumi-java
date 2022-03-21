// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sns;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TopicPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicPolicyArgs Empty = new TopicPolicyArgs();

    /**
     * The ARN of the SNS topic
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    /**
     * The fully-formed AWS policy as JSON.
     * 
     */
    @Import(name="policy", required=true)
      private final Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }

    public TopicPolicyArgs(
        Output<String> arn,
        Output<String> policy) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private TopicPolicyArgs() {
        this.arn = Output.empty();
        this.policy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.policy = defaults.policy;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }
        public Builder policy(Output<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Output.of(Objects.requireNonNull(policy));
            return this;
        }        public TopicPolicyArgs build() {
            return new TopicPolicyArgs(arn, policy);
        }
    }
}
