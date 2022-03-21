// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRulePutItemInput;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleDynamoDBv2Action extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleDynamoDBv2Action Empty = new TopicRuleDynamoDBv2Action();

    @Import(name="putItem")
      private final @Nullable TopicRulePutItemInput putItem;

    public Optional<TopicRulePutItemInput> getPutItem() {
        return this.putItem == null ? Optional.empty() : Optional.ofNullable(this.putItem);
    }

    @Import(name="roleArn")
      private final @Nullable String roleArn;

    public Optional<String> getRoleArn() {
        return this.roleArn == null ? Optional.empty() : Optional.ofNullable(this.roleArn);
    }

    public TopicRuleDynamoDBv2Action(
        @Nullable TopicRulePutItemInput putItem,
        @Nullable String roleArn) {
        this.putItem = putItem;
        this.roleArn = roleArn;
    }

    private TopicRuleDynamoDBv2Action() {
        this.putItem = null;
        this.roleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamoDBv2Action defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TopicRulePutItemInput putItem;
        private @Nullable String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDynamoDBv2Action defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.putItem = defaults.putItem;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder putItem(@Nullable TopicRulePutItemInput putItem) {
            this.putItem = putItem;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }        public TopicRuleDynamoDBv2Action build() {
            return new TopicRuleDynamoDBv2Action(putItem, roleArn);
        }
    }
}
