// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.aws.iot.inputs.TopicRuleDynamodbv2PutItemArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleDynamodbv2Args extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleDynamodbv2Args Empty = new TopicRuleDynamodbv2Args();

    /**
     * Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
     * 
     */
    @InputImport(name="putItem")
      private final @Nullable Output<TopicRuleDynamodbv2PutItemArgs> putItem;

    public Output<TopicRuleDynamodbv2PutItemArgs> getPutItem() {
        return this.putItem == null ? Output.empty() : this.putItem;
    }

    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleDynamodbv2Args(
        @Nullable Output<TopicRuleDynamodbv2PutItemArgs> putItem,
        Output<String> roleArn) {
        this.putItem = putItem;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleDynamodbv2Args() {
        this.putItem = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamodbv2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TopicRuleDynamodbv2PutItemArgs> putItem;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDynamodbv2Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.putItem = defaults.putItem;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder putItem(@Nullable Output<TopicRuleDynamodbv2PutItemArgs> putItem) {
            this.putItem = putItem;
            return this;
        }

        public Builder putItem(@Nullable TopicRuleDynamodbv2PutItemArgs putItem) {
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
        }
        public TopicRuleDynamodbv2Args build() {
            return new TopicRuleDynamodbv2Args(putItem, roleArn);
        }
    }
}
