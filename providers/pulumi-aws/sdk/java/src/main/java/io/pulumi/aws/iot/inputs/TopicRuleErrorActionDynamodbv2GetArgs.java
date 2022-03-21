// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbv2PutItemGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionDynamodbv2GetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionDynamodbv2GetArgs Empty = new TopicRuleErrorActionDynamodbv2GetArgs();

    /**
     * Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
     * 
     */
    @Import(name="putItem")
      private final @Nullable Output<TopicRuleErrorActionDynamodbv2PutItemGetArgs> putItem;

    public Output<TopicRuleErrorActionDynamodbv2PutItemGetArgs> getPutItem() {
        return this.putItem == null ? Output.empty() : this.putItem;
    }

    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleErrorActionDynamodbv2GetArgs(
        @Nullable Output<TopicRuleErrorActionDynamodbv2PutItemGetArgs> putItem,
        Output<String> roleArn) {
        this.putItem = putItem;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleErrorActionDynamodbv2GetArgs() {
        this.putItem = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionDynamodbv2GetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TopicRuleErrorActionDynamodbv2PutItemGetArgs> putItem;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionDynamodbv2GetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.putItem = defaults.putItem;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder putItem(@Nullable Output<TopicRuleErrorActionDynamodbv2PutItemGetArgs> putItem) {
            this.putItem = putItem;
            return this;
        }
        public Builder putItem(@Nullable TopicRuleErrorActionDynamodbv2PutItemGetArgs putItem) {
            this.putItem = Output.ofNullable(putItem);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public TopicRuleErrorActionDynamodbv2GetArgs build() {
            return new TopicRuleErrorActionDynamodbv2GetArgs(putItem, roleArn);
        }
    }
}
