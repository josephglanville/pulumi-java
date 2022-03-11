// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sqs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueuePolicyState extends io.pulumi.resources.ResourceArgs {

    public static final QueuePolicyState Empty = new QueuePolicyState();

    /**
     * The JSON policy for the SQS queue.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * The URL of the SQS Queue to which to attach the policy
     * 
     */
    @InputImport(name="queueUrl")
      private final @Nullable Output<String> queueUrl;

    public Output<String> getQueueUrl() {
        return this.queueUrl == null ? Output.empty() : this.queueUrl;
    }

    public QueuePolicyState(
        @Nullable Output<String> policy,
        @Nullable Output<String> queueUrl) {
        this.policy = policy;
        this.queueUrl = queueUrl;
    }

    private QueuePolicyState() {
        this.policy = Output.empty();
        this.queueUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueuePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> policy;
        private @Nullable Output<String> queueUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(QueuePolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.queueUrl = defaults.queueUrl;
        }

        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder queueUrl(@Nullable Output<String> queueUrl) {
            this.queueUrl = queueUrl;
            return this;
        }

        public Builder queueUrl(@Nullable String queueUrl) {
            this.queueUrl = Output.ofNullable(queueUrl);
            return this;
        }
        public QueuePolicyState build() {
            return new QueuePolicyState(policy, queueUrl);
        }
    }
}
