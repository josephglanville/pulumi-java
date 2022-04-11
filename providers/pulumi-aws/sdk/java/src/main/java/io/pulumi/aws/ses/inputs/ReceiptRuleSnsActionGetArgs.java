// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReceiptRuleSnsActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleSnsActionGetArgs Empty = new ReceiptRuleSnsActionGetArgs();

    /**
     * The encoding to use for the email within the Amazon SNS notification. Default value is `UTF-8`.
     * 
     */
    @Import(name="encoding")
      private final @Nullable Output<String> encoding;

    public Output<String> getEncoding() {
        return this.encoding == null ? Codegen.empty() : this.encoding;
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
    @Import(name="topicArn", required=true)
      private final Output<String> topicArn;

    public Output<String> getTopicArn() {
        return this.topicArn;
    }

    public ReceiptRuleSnsActionGetArgs(
        @Nullable Output<String> encoding,
        Output<Integer> position,
        Output<String> topicArn) {
        this.encoding = encoding;
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
        this.topicArn = Objects.requireNonNull(topicArn, "expected parameter 'topicArn' to be non-null");
    }

    private ReceiptRuleSnsActionGetArgs() {
        this.encoding = Codegen.empty();
        this.position = Codegen.empty();
        this.topicArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleSnsActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> encoding;
        private Output<Integer> position;
        private Output<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleSnsActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.position = defaults.position;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder encoding(@Nullable Output<String> encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder encoding(@Nullable String encoding) {
            this.encoding = Codegen.ofNullable(encoding);
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
        public Builder topicArn(Output<String> topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }
        public Builder topicArn(String topicArn) {
            this.topicArn = Output.of(Objects.requireNonNull(topicArn));
            return this;
        }        public ReceiptRuleSnsActionGetArgs build() {
            return new ReceiptRuleSnsActionGetArgs(encoding, position, topicArn);
        }
    }
}
