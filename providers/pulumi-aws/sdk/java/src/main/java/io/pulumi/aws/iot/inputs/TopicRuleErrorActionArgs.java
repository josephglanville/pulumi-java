// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.aws.iot.inputs.TopicRuleErrorActionCloudwatchAlarmArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionCloudwatchMetricArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbv2Args;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionElasticsearchArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionFirehoseArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionIotAnalyticsArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionIotEventsArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionKinesisArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionLambdaArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionRepublishArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionS3Args;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionSnsArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionSqsArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionStepFunctionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionArgs Empty = new TopicRuleErrorActionArgs();

    @Import(name="cloudwatchAlarm")
      private final @Nullable Output<TopicRuleErrorActionCloudwatchAlarmArgs> cloudwatchAlarm;

    public Output<TopicRuleErrorActionCloudwatchAlarmArgs> getCloudwatchAlarm() {
        return this.cloudwatchAlarm == null ? Codegen.empty() : this.cloudwatchAlarm;
    }

    @Import(name="cloudwatchMetric")
      private final @Nullable Output<TopicRuleErrorActionCloudwatchMetricArgs> cloudwatchMetric;

    public Output<TopicRuleErrorActionCloudwatchMetricArgs> getCloudwatchMetric() {
        return this.cloudwatchMetric == null ? Codegen.empty() : this.cloudwatchMetric;
    }

    @Import(name="dynamodb")
      private final @Nullable Output<TopicRuleErrorActionDynamodbArgs> dynamodb;

    public Output<TopicRuleErrorActionDynamodbArgs> getDynamodb() {
        return this.dynamodb == null ? Codegen.empty() : this.dynamodb;
    }

    @Import(name="dynamodbv2")
      private final @Nullable Output<TopicRuleErrorActionDynamodbv2Args> dynamodbv2;

    public Output<TopicRuleErrorActionDynamodbv2Args> getDynamodbv2() {
        return this.dynamodbv2 == null ? Codegen.empty() : this.dynamodbv2;
    }

    @Import(name="elasticsearch")
      private final @Nullable Output<TopicRuleErrorActionElasticsearchArgs> elasticsearch;

    public Output<TopicRuleErrorActionElasticsearchArgs> getElasticsearch() {
        return this.elasticsearch == null ? Codegen.empty() : this.elasticsearch;
    }

    @Import(name="firehose")
      private final @Nullable Output<TopicRuleErrorActionFirehoseArgs> firehose;

    public Output<TopicRuleErrorActionFirehoseArgs> getFirehose() {
        return this.firehose == null ? Codegen.empty() : this.firehose;
    }

    @Import(name="iotAnalytics")
      private final @Nullable Output<TopicRuleErrorActionIotAnalyticsArgs> iotAnalytics;

    public Output<TopicRuleErrorActionIotAnalyticsArgs> getIotAnalytics() {
        return this.iotAnalytics == null ? Codegen.empty() : this.iotAnalytics;
    }

    @Import(name="iotEvents")
      private final @Nullable Output<TopicRuleErrorActionIotEventsArgs> iotEvents;

    public Output<TopicRuleErrorActionIotEventsArgs> getIotEvents() {
        return this.iotEvents == null ? Codegen.empty() : this.iotEvents;
    }

    @Import(name="kinesis")
      private final @Nullable Output<TopicRuleErrorActionKinesisArgs> kinesis;

    public Output<TopicRuleErrorActionKinesisArgs> getKinesis() {
        return this.kinesis == null ? Codegen.empty() : this.kinesis;
    }

    @Import(name="lambda")
      private final @Nullable Output<TopicRuleErrorActionLambdaArgs> lambda;

    public Output<TopicRuleErrorActionLambdaArgs> getLambda() {
        return this.lambda == null ? Codegen.empty() : this.lambda;
    }

    @Import(name="republish")
      private final @Nullable Output<TopicRuleErrorActionRepublishArgs> republish;

    public Output<TopicRuleErrorActionRepublishArgs> getRepublish() {
        return this.republish == null ? Codegen.empty() : this.republish;
    }

    @Import(name="s3")
      private final @Nullable Output<TopicRuleErrorActionS3Args> s3;

    public Output<TopicRuleErrorActionS3Args> getS3() {
        return this.s3 == null ? Codegen.empty() : this.s3;
    }

    @Import(name="sns")
      private final @Nullable Output<TopicRuleErrorActionSnsArgs> sns;

    public Output<TopicRuleErrorActionSnsArgs> getSns() {
        return this.sns == null ? Codegen.empty() : this.sns;
    }

    @Import(name="sqs")
      private final @Nullable Output<TopicRuleErrorActionSqsArgs> sqs;

    public Output<TopicRuleErrorActionSqsArgs> getSqs() {
        return this.sqs == null ? Codegen.empty() : this.sqs;
    }

    @Import(name="stepFunctions")
      private final @Nullable Output<TopicRuleErrorActionStepFunctionsArgs> stepFunctions;

    public Output<TopicRuleErrorActionStepFunctionsArgs> getStepFunctions() {
        return this.stepFunctions == null ? Codegen.empty() : this.stepFunctions;
    }

    public TopicRuleErrorActionArgs(
        @Nullable Output<TopicRuleErrorActionCloudwatchAlarmArgs> cloudwatchAlarm,
        @Nullable Output<TopicRuleErrorActionCloudwatchMetricArgs> cloudwatchMetric,
        @Nullable Output<TopicRuleErrorActionDynamodbArgs> dynamodb,
        @Nullable Output<TopicRuleErrorActionDynamodbv2Args> dynamodbv2,
        @Nullable Output<TopicRuleErrorActionElasticsearchArgs> elasticsearch,
        @Nullable Output<TopicRuleErrorActionFirehoseArgs> firehose,
        @Nullable Output<TopicRuleErrorActionIotAnalyticsArgs> iotAnalytics,
        @Nullable Output<TopicRuleErrorActionIotEventsArgs> iotEvents,
        @Nullable Output<TopicRuleErrorActionKinesisArgs> kinesis,
        @Nullable Output<TopicRuleErrorActionLambdaArgs> lambda,
        @Nullable Output<TopicRuleErrorActionRepublishArgs> republish,
        @Nullable Output<TopicRuleErrorActionS3Args> s3,
        @Nullable Output<TopicRuleErrorActionSnsArgs> sns,
        @Nullable Output<TopicRuleErrorActionSqsArgs> sqs,
        @Nullable Output<TopicRuleErrorActionStepFunctionsArgs> stepFunctions) {
        this.cloudwatchAlarm = cloudwatchAlarm;
        this.cloudwatchMetric = cloudwatchMetric;
        this.dynamodb = dynamodb;
        this.dynamodbv2 = dynamodbv2;
        this.elasticsearch = elasticsearch;
        this.firehose = firehose;
        this.iotAnalytics = iotAnalytics;
        this.iotEvents = iotEvents;
        this.kinesis = kinesis;
        this.lambda = lambda;
        this.republish = republish;
        this.s3 = s3;
        this.sns = sns;
        this.sqs = sqs;
        this.stepFunctions = stepFunctions;
    }

    private TopicRuleErrorActionArgs() {
        this.cloudwatchAlarm = Codegen.empty();
        this.cloudwatchMetric = Codegen.empty();
        this.dynamodb = Codegen.empty();
        this.dynamodbv2 = Codegen.empty();
        this.elasticsearch = Codegen.empty();
        this.firehose = Codegen.empty();
        this.iotAnalytics = Codegen.empty();
        this.iotEvents = Codegen.empty();
        this.kinesis = Codegen.empty();
        this.lambda = Codegen.empty();
        this.republish = Codegen.empty();
        this.s3 = Codegen.empty();
        this.sns = Codegen.empty();
        this.sqs = Codegen.empty();
        this.stepFunctions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TopicRuleErrorActionCloudwatchAlarmArgs> cloudwatchAlarm;
        private @Nullable Output<TopicRuleErrorActionCloudwatchMetricArgs> cloudwatchMetric;
        private @Nullable Output<TopicRuleErrorActionDynamodbArgs> dynamodb;
        private @Nullable Output<TopicRuleErrorActionDynamodbv2Args> dynamodbv2;
        private @Nullable Output<TopicRuleErrorActionElasticsearchArgs> elasticsearch;
        private @Nullable Output<TopicRuleErrorActionFirehoseArgs> firehose;
        private @Nullable Output<TopicRuleErrorActionIotAnalyticsArgs> iotAnalytics;
        private @Nullable Output<TopicRuleErrorActionIotEventsArgs> iotEvents;
        private @Nullable Output<TopicRuleErrorActionKinesisArgs> kinesis;
        private @Nullable Output<TopicRuleErrorActionLambdaArgs> lambda;
        private @Nullable Output<TopicRuleErrorActionRepublishArgs> republish;
        private @Nullable Output<TopicRuleErrorActionS3Args> s3;
        private @Nullable Output<TopicRuleErrorActionSnsArgs> sns;
        private @Nullable Output<TopicRuleErrorActionSqsArgs> sqs;
        private @Nullable Output<TopicRuleErrorActionStepFunctionsArgs> stepFunctions;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchAlarm = defaults.cloudwatchAlarm;
    	      this.cloudwatchMetric = defaults.cloudwatchMetric;
    	      this.dynamodb = defaults.dynamodb;
    	      this.dynamodbv2 = defaults.dynamodbv2;
    	      this.elasticsearch = defaults.elasticsearch;
    	      this.firehose = defaults.firehose;
    	      this.iotAnalytics = defaults.iotAnalytics;
    	      this.iotEvents = defaults.iotEvents;
    	      this.kinesis = defaults.kinesis;
    	      this.lambda = defaults.lambda;
    	      this.republish = defaults.republish;
    	      this.s3 = defaults.s3;
    	      this.sns = defaults.sns;
    	      this.sqs = defaults.sqs;
    	      this.stepFunctions = defaults.stepFunctions;
        }

        public Builder cloudwatchAlarm(@Nullable Output<TopicRuleErrorActionCloudwatchAlarmArgs> cloudwatchAlarm) {
            this.cloudwatchAlarm = cloudwatchAlarm;
            return this;
        }
        public Builder cloudwatchAlarm(@Nullable TopicRuleErrorActionCloudwatchAlarmArgs cloudwatchAlarm) {
            this.cloudwatchAlarm = Codegen.ofNullable(cloudwatchAlarm);
            return this;
        }
        public Builder cloudwatchMetric(@Nullable Output<TopicRuleErrorActionCloudwatchMetricArgs> cloudwatchMetric) {
            this.cloudwatchMetric = cloudwatchMetric;
            return this;
        }
        public Builder cloudwatchMetric(@Nullable TopicRuleErrorActionCloudwatchMetricArgs cloudwatchMetric) {
            this.cloudwatchMetric = Codegen.ofNullable(cloudwatchMetric);
            return this;
        }
        public Builder dynamodb(@Nullable Output<TopicRuleErrorActionDynamodbArgs> dynamodb) {
            this.dynamodb = dynamodb;
            return this;
        }
        public Builder dynamodb(@Nullable TopicRuleErrorActionDynamodbArgs dynamodb) {
            this.dynamodb = Codegen.ofNullable(dynamodb);
            return this;
        }
        public Builder dynamodbv2(@Nullable Output<TopicRuleErrorActionDynamodbv2Args> dynamodbv2) {
            this.dynamodbv2 = dynamodbv2;
            return this;
        }
        public Builder dynamodbv2(@Nullable TopicRuleErrorActionDynamodbv2Args dynamodbv2) {
            this.dynamodbv2 = Codegen.ofNullable(dynamodbv2);
            return this;
        }
        public Builder elasticsearch(@Nullable Output<TopicRuleErrorActionElasticsearchArgs> elasticsearch) {
            this.elasticsearch = elasticsearch;
            return this;
        }
        public Builder elasticsearch(@Nullable TopicRuleErrorActionElasticsearchArgs elasticsearch) {
            this.elasticsearch = Codegen.ofNullable(elasticsearch);
            return this;
        }
        public Builder firehose(@Nullable Output<TopicRuleErrorActionFirehoseArgs> firehose) {
            this.firehose = firehose;
            return this;
        }
        public Builder firehose(@Nullable TopicRuleErrorActionFirehoseArgs firehose) {
            this.firehose = Codegen.ofNullable(firehose);
            return this;
        }
        public Builder iotAnalytics(@Nullable Output<TopicRuleErrorActionIotAnalyticsArgs> iotAnalytics) {
            this.iotAnalytics = iotAnalytics;
            return this;
        }
        public Builder iotAnalytics(@Nullable TopicRuleErrorActionIotAnalyticsArgs iotAnalytics) {
            this.iotAnalytics = Codegen.ofNullable(iotAnalytics);
            return this;
        }
        public Builder iotEvents(@Nullable Output<TopicRuleErrorActionIotEventsArgs> iotEvents) {
            this.iotEvents = iotEvents;
            return this;
        }
        public Builder iotEvents(@Nullable TopicRuleErrorActionIotEventsArgs iotEvents) {
            this.iotEvents = Codegen.ofNullable(iotEvents);
            return this;
        }
        public Builder kinesis(@Nullable Output<TopicRuleErrorActionKinesisArgs> kinesis) {
            this.kinesis = kinesis;
            return this;
        }
        public Builder kinesis(@Nullable TopicRuleErrorActionKinesisArgs kinesis) {
            this.kinesis = Codegen.ofNullable(kinesis);
            return this;
        }
        public Builder lambda(@Nullable Output<TopicRuleErrorActionLambdaArgs> lambda) {
            this.lambda = lambda;
            return this;
        }
        public Builder lambda(@Nullable TopicRuleErrorActionLambdaArgs lambda) {
            this.lambda = Codegen.ofNullable(lambda);
            return this;
        }
        public Builder republish(@Nullable Output<TopicRuleErrorActionRepublishArgs> republish) {
            this.republish = republish;
            return this;
        }
        public Builder republish(@Nullable TopicRuleErrorActionRepublishArgs republish) {
            this.republish = Codegen.ofNullable(republish);
            return this;
        }
        public Builder s3(@Nullable Output<TopicRuleErrorActionS3Args> s3) {
            this.s3 = s3;
            return this;
        }
        public Builder s3(@Nullable TopicRuleErrorActionS3Args s3) {
            this.s3 = Codegen.ofNullable(s3);
            return this;
        }
        public Builder sns(@Nullable Output<TopicRuleErrorActionSnsArgs> sns) {
            this.sns = sns;
            return this;
        }
        public Builder sns(@Nullable TopicRuleErrorActionSnsArgs sns) {
            this.sns = Codegen.ofNullable(sns);
            return this;
        }
        public Builder sqs(@Nullable Output<TopicRuleErrorActionSqsArgs> sqs) {
            this.sqs = sqs;
            return this;
        }
        public Builder sqs(@Nullable TopicRuleErrorActionSqsArgs sqs) {
            this.sqs = Codegen.ofNullable(sqs);
            return this;
        }
        public Builder stepFunctions(@Nullable Output<TopicRuleErrorActionStepFunctionsArgs> stepFunctions) {
            this.stepFunctions = stepFunctions;
            return this;
        }
        public Builder stepFunctions(@Nullable TopicRuleErrorActionStepFunctionsArgs stepFunctions) {
            this.stepFunctions = Codegen.ofNullable(stepFunctions);
            return this;
        }        public TopicRuleErrorActionArgs build() {
            return new TopicRuleErrorActionArgs(cloudwatchAlarm, cloudwatchMetric, dynamodb, dynamodbv2, elasticsearch, firehose, iotAnalytics, iotEvents, kinesis, lambda, republish, s3, sns, sqs, stepFunctions);
        }
    }
}
