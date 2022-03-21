// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionFirehoseGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionFirehoseGetArgs Empty = new TopicRuleErrorActionFirehoseGetArgs();

    /**
     * The delivery stream name.
     * 
     */
    @Import(name="deliveryStreamName", required=true)
      private final Output<String> deliveryStreamName;

    public Output<String> getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * The IAM role ARN that grants access to the Amazon Kinesis Firehose stream.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * A character separator that is used to separate records written to the Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * 
     */
    @Import(name="separator")
      private final @Nullable Output<String> separator;

    public Output<String> getSeparator() {
        return this.separator == null ? Output.empty() : this.separator;
    }

    public TopicRuleErrorActionFirehoseGetArgs(
        Output<String> deliveryStreamName,
        Output<String> roleArn,
        @Nullable Output<String> separator) {
        this.deliveryStreamName = Objects.requireNonNull(deliveryStreamName, "expected parameter 'deliveryStreamName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.separator = separator;
    }

    private TopicRuleErrorActionFirehoseGetArgs() {
        this.deliveryStreamName = Output.empty();
        this.roleArn = Output.empty();
        this.separator = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionFirehoseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> deliveryStreamName;
        private Output<String> roleArn;
        private @Nullable Output<String> separator;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionFirehoseGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryStreamName = defaults.deliveryStreamName;
    	      this.roleArn = defaults.roleArn;
    	      this.separator = defaults.separator;
        }

        public Builder deliveryStreamName(Output<String> deliveryStreamName) {
            this.deliveryStreamName = Objects.requireNonNull(deliveryStreamName);
            return this;
        }
        public Builder deliveryStreamName(String deliveryStreamName) {
            this.deliveryStreamName = Output.of(Objects.requireNonNull(deliveryStreamName));
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
        public Builder separator(@Nullable Output<String> separator) {
            this.separator = separator;
            return this;
        }
        public Builder separator(@Nullable String separator) {
            this.separator = Output.ofNullable(separator);
            return this;
        }        public TopicRuleErrorActionFirehoseGetArgs build() {
            return new TopicRuleErrorActionFirehoseGetArgs(deliveryStreamName, roleArn, separator);
        }
    }
}
