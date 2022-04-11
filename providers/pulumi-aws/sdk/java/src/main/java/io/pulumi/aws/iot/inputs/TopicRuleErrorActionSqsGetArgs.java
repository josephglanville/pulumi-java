// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleErrorActionSqsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionSqsGetArgs Empty = new TopicRuleErrorActionSqsGetArgs();

    /**
     * The URL of the Amazon SQS queue.
     * 
     */
    @Import(name="queueUrl", required=true)
      private final Output<String> queueUrl;

    public Output<String> getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Specifies whether to use Base64 encoding.
     * 
     */
    @Import(name="useBase64", required=true)
      private final Output<Boolean> useBase64;

    public Output<Boolean> getUseBase64() {
        return this.useBase64;
    }

    public TopicRuleErrorActionSqsGetArgs(
        Output<String> queueUrl,
        Output<String> roleArn,
        Output<Boolean> useBase64) {
        this.queueUrl = Objects.requireNonNull(queueUrl, "expected parameter 'queueUrl' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.useBase64 = Objects.requireNonNull(useBase64, "expected parameter 'useBase64' to be non-null");
    }

    private TopicRuleErrorActionSqsGetArgs() {
        this.queueUrl = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.useBase64 = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionSqsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> queueUrl;
        private Output<String> roleArn;
        private Output<Boolean> useBase64;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionSqsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queueUrl = defaults.queueUrl;
    	      this.roleArn = defaults.roleArn;
    	      this.useBase64 = defaults.useBase64;
        }

        public Builder queueUrl(Output<String> queueUrl) {
            this.queueUrl = Objects.requireNonNull(queueUrl);
            return this;
        }
        public Builder queueUrl(String queueUrl) {
            this.queueUrl = Output.of(Objects.requireNonNull(queueUrl));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder useBase64(Output<Boolean> useBase64) {
            this.useBase64 = Objects.requireNonNull(useBase64);
            return this;
        }
        public Builder useBase64(Boolean useBase64) {
            this.useBase64 = Output.of(Objects.requireNonNull(useBase64));
            return this;
        }        public TopicRuleErrorActionSqsGetArgs build() {
            return new TopicRuleErrorActionSqsGetArgs(queueUrl, roleArn, useBase64);
        }
    }
}
