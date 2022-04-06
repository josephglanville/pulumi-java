// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReceiptRuleLambdaActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleLambdaActionArgs Empty = new ReceiptRuleLambdaActionArgs();

    /**
     * The ARN of the Lambda function to invoke
     * 
     */
    @Import(name="functionArn", required=true)
      private final Output<String> functionArn;

    public Output<String> getFunctionArn() {
        return this.functionArn;
    }

    /**
     * `Event` or `RequestResponse`
     * 
     */
    @Import(name="invocationType")
      private final @Nullable Output<String> invocationType;

    public Output<String> getInvocationType() {
        return this.invocationType == null ? Output.empty() : this.invocationType;
    }

    /**
     * The position of the action in the receipt rule
     * 
     */
    @Import(name="position", required=true)
      private final Output<Integer> position;

    public Output<Integer> getPosition() {
        return this.position;
    }

    /**
     * The ARN of an SNS topic to notify
     * 
     */
    @Import(name="topicArn")
      private final @Nullable Output<String> topicArn;

    public Output<String> getTopicArn() {
        return this.topicArn == null ? Output.empty() : this.topicArn;
    }

    public ReceiptRuleLambdaActionArgs(
        Output<String> functionArn,
        @Nullable Output<String> invocationType,
        Output<Integer> position,
        @Nullable Output<String> topicArn) {
        this.functionArn = Objects.requireNonNull(functionArn, "expected parameter 'functionArn' to be non-null");
        this.invocationType = invocationType;
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
        this.topicArn = topicArn;
    }

    private ReceiptRuleLambdaActionArgs() {
        this.functionArn = Output.empty();
        this.invocationType = Output.empty();
        this.position = Output.empty();
        this.topicArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleLambdaActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> functionArn;
        private @Nullable Output<String> invocationType;
        private Output<Integer> position;
        private @Nullable Output<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleLambdaActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.invocationType = defaults.invocationType;
    	      this.position = defaults.position;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder functionArn(Output<String> functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        public Builder functionArn(String functionArn) {
            this.functionArn = Output.of(Objects.requireNonNull(functionArn));
            return this;
        }
        public Builder invocationType(@Nullable Output<String> invocationType) {
            this.invocationType = invocationType;
            return this;
        }
        public Builder invocationType(@Nullable String invocationType) {
            this.invocationType = Output.ofNullable(invocationType);
            return this;
        }
        public Builder position(Output<Integer> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public Builder position(Integer position) {
            this.position = Output.of(Objects.requireNonNull(position));
            return this;
        }
        public Builder topicArn(@Nullable Output<String> topicArn) {
            this.topicArn = topicArn;
            return this;
        }
        public Builder topicArn(@Nullable String topicArn) {
            this.topicArn = Output.ofNullable(topicArn);
            return this;
        }        public ReceiptRuleLambdaActionArgs build() {
            return new ReceiptRuleLambdaActionArgs(functionArn, invocationType, position, topicArn);
        }
    }
}