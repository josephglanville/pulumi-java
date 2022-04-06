// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleSnsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleSnsGetArgs Empty = new TopicRuleSnsGetArgs();

    /**
     * The message format of the message to publish. Accepted values are "JSON" and "RAW".
     * 
     */
    @Import(name="messageFormat")
      private final @Nullable Output<String> messageFormat;

    public Output<String> getMessageFormat() {
        return this.messageFormat == null ? Output.empty() : this.messageFormat;
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
     * The ARN of the SNS topic.
     * 
     */
    @Import(name="targetArn", required=true)
      private final Output<String> targetArn;

    public Output<String> getTargetArn() {
        return this.targetArn;
    }

    public TopicRuleSnsGetArgs(
        @Nullable Output<String> messageFormat,
        Output<String> roleArn,
        Output<String> targetArn) {
        this.messageFormat = messageFormat;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private TopicRuleSnsGetArgs() {
        this.messageFormat = Output.empty();
        this.roleArn = Output.empty();
        this.targetArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSnsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> messageFormat;
        private Output<String> roleArn;
        private Output<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSnsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder messageFormat(@Nullable Output<String> messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }
        public Builder messageFormat(@Nullable String messageFormat) {
            this.messageFormat = Output.ofNullable(messageFormat);
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
        public Builder targetArn(Output<String> targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }
        public Builder targetArn(String targetArn) {
            this.targetArn = Output.of(Objects.requireNonNull(targetArn));
            return this;
        }        public TopicRuleSnsGetArgs build() {
            return new TopicRuleSnsGetArgs(messageFormat, roleArn, targetArn);
        }
    }
}