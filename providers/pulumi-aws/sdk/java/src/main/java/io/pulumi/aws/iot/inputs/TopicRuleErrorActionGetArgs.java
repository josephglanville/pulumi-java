// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.aws.iot.inputs.TopicRuleErrorActionCloudwatchAlarmGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionCloudwatchMetricGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbv2GetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionElasticsearchGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionFirehoseGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionIotAnalyticsGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionIotEventsGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionKinesisGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionLambdaGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionRepublishGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionS3GetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionSnsGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionSqsGetArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionStepFunctionsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionGetArgs Empty = new TopicRuleErrorActionGetArgs();

    @InputImport(name="cloudwatchAlarm")
      private final @Nullable Output<TopicRuleErrorActionCloudwatchAlarmGetArgs> cloudwatchAlarm;

    public Output<TopicRuleErrorActionCloudwatchAlarmGetArgs> getCloudwatchAlarm() {
        return this.cloudwatchAlarm == null ? Output.empty() : this.cloudwatchAlarm;
    }

    @InputImport(name="cloudwatchMetric")
      private final @Nullable Output<TopicRuleErrorActionCloudwatchMetricGetArgs> cloudwatchMetric;

    public Output<TopicRuleErrorActionCloudwatchMetricGetArgs> getCloudwatchMetric() {
        return this.cloudwatchMetric == null ? Output.empty() : this.cloudwatchMetric;
    }

    @InputImport(name="dynamodb")
      private final @Nullable Output<TopicRuleErrorActionDynamodbGetArgs> dynamodb;

    public Output<TopicRuleErrorActionDynamodbGetArgs> getDynamodb() {
        return this.dynamodb == null ? Output.empty() : this.dynamodb;
    }

    @InputImport(name="dynamodbv2")
      private final @Nullable Output<TopicRuleErrorActionDynamodbv2GetArgs> dynamodbv2;

    public Output<TopicRuleErrorActionDynamodbv2GetArgs> getDynamodbv2() {
        return this.dynamodbv2 == null ? Output.empty() : this.dynamodbv2;
    }

    @InputImport(name="elasticsearch")
      private final @Nullable Output<TopicRuleErrorActionElasticsearchGetArgs> elasticsearch;

    public Output<TopicRuleErrorActionElasticsearchGetArgs> getElasticsearch() {
        return this.elasticsearch == null ? Output.empty() : this.elasticsearch;
    }

    @InputImport(name="firehose")
      private final @Nullable Output<TopicRuleErrorActionFirehoseGetArgs> firehose;

    public Output<TopicRuleErrorActionFirehoseGetArgs> getFirehose() {
        return this.firehose == null ? Output.empty() : this.firehose;
    }

    @InputImport(name="iotAnalytics")
      private final @Nullable Output<TopicRuleErrorActionIotAnalyticsGetArgs> iotAnalytics;

    public Output<TopicRuleErrorActionIotAnalyticsGetArgs> getIotAnalytics() {
        return this.iotAnalytics == null ? Output.empty() : this.iotAnalytics;
    }

    @InputImport(name="iotEvents")
      private final @Nullable Output<TopicRuleErrorActionIotEventsGetArgs> iotEvents;

    public Output<TopicRuleErrorActionIotEventsGetArgs> getIotEvents() {
        return this.iotEvents == null ? Output.empty() : this.iotEvents;
    }

    @InputImport(name="kinesis")
      private final @Nullable Output<TopicRuleErrorActionKinesisGetArgs> kinesis;

    public Output<TopicRuleErrorActionKinesisGetArgs> getKinesis() {
        return this.kinesis == null ? Output.empty() : this.kinesis;
    }

    @InputImport(name="lambda")
      private final @Nullable Output<TopicRuleErrorActionLambdaGetArgs> lambda;

    public Output<TopicRuleErrorActionLambdaGetArgs> getLambda() {
        return this.lambda == null ? Output.empty() : this.lambda;
    }

    @InputImport(name="republish")
      private final @Nullable Output<TopicRuleErrorActionRepublishGetArgs> republish;

    public Output<TopicRuleErrorActionRepublishGetArgs> getRepublish() {
        return this.republish == null ? Output.empty() : this.republish;
    }

    @InputImport(name="s3")
      private final @Nullable Output<TopicRuleErrorActionS3GetArgs> s3;

    public Output<TopicRuleErrorActionS3GetArgs> getS3() {
        return this.s3 == null ? Output.empty() : this.s3;
    }

    @InputImport(name="sns")
      private final @Nullable Output<TopicRuleErrorActionSnsGetArgs> sns;

    public Output<TopicRuleErrorActionSnsGetArgs> getSns() {
        return this.sns == null ? Output.empty() : this.sns;
    }

    @InputImport(name="sqs")
      private final @Nullable Output<TopicRuleErrorActionSqsGetArgs> sqs;

    public Output<TopicRuleErrorActionSqsGetArgs> getSqs() {
        return this.sqs == null ? Output.empty() : this.sqs;
    }

    @InputImport(name="stepFunctions")
      private final @Nullable Output<TopicRuleErrorActionStepFunctionsGetArgs> stepFunctions;

    public Output<TopicRuleErrorActionStepFunctionsGetArgs> getStepFunctions() {
        return this.stepFunctions == null ? Output.empty() : this.stepFunctions;
    }

    public TopicRuleErrorActionGetArgs(
        @Nullable Output<TopicRuleErrorActionCloudwatchAlarmGetArgs> cloudwatchAlarm,
        @Nullable Output<TopicRuleErrorActionCloudwatchMetricGetArgs> cloudwatchMetric,
        @Nullable Output<TopicRuleErrorActionDynamodbGetArgs> dynamodb,
        @Nullable Output<TopicRuleErrorActionDynamodbv2GetArgs> dynamodbv2,
        @Nullable Output<TopicRuleErrorActionElasticsearchGetArgs> elasticsearch,
        @Nullable Output<TopicRuleErrorActionFirehoseGetArgs> firehose,
        @Nullable Output<TopicRuleErrorActionIotAnalyticsGetArgs> iotAnalytics,
        @Nullable Output<TopicRuleErrorActionIotEventsGetArgs> iotEvents,
        @Nullable Output<TopicRuleErrorActionKinesisGetArgs> kinesis,
        @Nullable Output<TopicRuleErrorActionLambdaGetArgs> lambda,
        @Nullable Output<TopicRuleErrorActionRepublishGetArgs> republish,
        @Nullable Output<TopicRuleErrorActionS3GetArgs> s3,
        @Nullable Output<TopicRuleErrorActionSnsGetArgs> sns,
        @Nullable Output<TopicRuleErrorActionSqsGetArgs> sqs,
        @Nullable Output<TopicRuleErrorActionStepFunctionsGetArgs> stepFunctions) {
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

    private TopicRuleErrorActionGetArgs() {
        this.cloudwatchAlarm = Output.empty();
        this.cloudwatchMetric = Output.empty();
        this.dynamodb = Output.empty();
        this.dynamodbv2 = Output.empty();
        this.elasticsearch = Output.empty();
        this.firehose = Output.empty();
        this.iotAnalytics = Output.empty();
        this.iotEvents = Output.empty();
        this.kinesis = Output.empty();
        this.lambda = Output.empty();
        this.republish = Output.empty();
        this.s3 = Output.empty();
        this.sns = Output.empty();
        this.sqs = Output.empty();
        this.stepFunctions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TopicRuleErrorActionCloudwatchAlarmGetArgs> cloudwatchAlarm;
        private @Nullable Output<TopicRuleErrorActionCloudwatchMetricGetArgs> cloudwatchMetric;
        private @Nullable Output<TopicRuleErrorActionDynamodbGetArgs> dynamodb;
        private @Nullable Output<TopicRuleErrorActionDynamodbv2GetArgs> dynamodbv2;
        private @Nullable Output<TopicRuleErrorActionElasticsearchGetArgs> elasticsearch;
        private @Nullable Output<TopicRuleErrorActionFirehoseGetArgs> firehose;
        private @Nullable Output<TopicRuleErrorActionIotAnalyticsGetArgs> iotAnalytics;
        private @Nullable Output<TopicRuleErrorActionIotEventsGetArgs> iotEvents;
        private @Nullable Output<TopicRuleErrorActionKinesisGetArgs> kinesis;
        private @Nullable Output<TopicRuleErrorActionLambdaGetArgs> lambda;
        private @Nullable Output<TopicRuleErrorActionRepublishGetArgs> republish;
        private @Nullable Output<TopicRuleErrorActionS3GetArgs> s3;
        private @Nullable Output<TopicRuleErrorActionSnsGetArgs> sns;
        private @Nullable Output<TopicRuleErrorActionSqsGetArgs> sqs;
        private @Nullable Output<TopicRuleErrorActionStepFunctionsGetArgs> stepFunctions;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionGetArgs defaults) {
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

        public Builder cloudwatchAlarm(@Nullable Output<TopicRuleErrorActionCloudwatchAlarmGetArgs> cloudwatchAlarm) {
            this.cloudwatchAlarm = cloudwatchAlarm;
            return this;
        }

        public Builder cloudwatchAlarm(@Nullable TopicRuleErrorActionCloudwatchAlarmGetArgs cloudwatchAlarm) {
            this.cloudwatchAlarm = Output.ofNullable(cloudwatchAlarm);
            return this;
        }

        public Builder cloudwatchMetric(@Nullable Output<TopicRuleErrorActionCloudwatchMetricGetArgs> cloudwatchMetric) {
            this.cloudwatchMetric = cloudwatchMetric;
            return this;
        }

        public Builder cloudwatchMetric(@Nullable TopicRuleErrorActionCloudwatchMetricGetArgs cloudwatchMetric) {
            this.cloudwatchMetric = Output.ofNullable(cloudwatchMetric);
            return this;
        }

        public Builder dynamodb(@Nullable Output<TopicRuleErrorActionDynamodbGetArgs> dynamodb) {
            this.dynamodb = dynamodb;
            return this;
        }

        public Builder dynamodb(@Nullable TopicRuleErrorActionDynamodbGetArgs dynamodb) {
            this.dynamodb = Output.ofNullable(dynamodb);
            return this;
        }

        public Builder dynamodbv2(@Nullable Output<TopicRuleErrorActionDynamodbv2GetArgs> dynamodbv2) {
            this.dynamodbv2 = dynamodbv2;
            return this;
        }

        public Builder dynamodbv2(@Nullable TopicRuleErrorActionDynamodbv2GetArgs dynamodbv2) {
            this.dynamodbv2 = Output.ofNullable(dynamodbv2);
            return this;
        }

        public Builder elasticsearch(@Nullable Output<TopicRuleErrorActionElasticsearchGetArgs> elasticsearch) {
            this.elasticsearch = elasticsearch;
            return this;
        }

        public Builder elasticsearch(@Nullable TopicRuleErrorActionElasticsearchGetArgs elasticsearch) {
            this.elasticsearch = Output.ofNullable(elasticsearch);
            return this;
        }

        public Builder firehose(@Nullable Output<TopicRuleErrorActionFirehoseGetArgs> firehose) {
            this.firehose = firehose;
            return this;
        }

        public Builder firehose(@Nullable TopicRuleErrorActionFirehoseGetArgs firehose) {
            this.firehose = Output.ofNullable(firehose);
            return this;
        }

        public Builder iotAnalytics(@Nullable Output<TopicRuleErrorActionIotAnalyticsGetArgs> iotAnalytics) {
            this.iotAnalytics = iotAnalytics;
            return this;
        }

        public Builder iotAnalytics(@Nullable TopicRuleErrorActionIotAnalyticsGetArgs iotAnalytics) {
            this.iotAnalytics = Output.ofNullable(iotAnalytics);
            return this;
        }

        public Builder iotEvents(@Nullable Output<TopicRuleErrorActionIotEventsGetArgs> iotEvents) {
            this.iotEvents = iotEvents;
            return this;
        }

        public Builder iotEvents(@Nullable TopicRuleErrorActionIotEventsGetArgs iotEvents) {
            this.iotEvents = Output.ofNullable(iotEvents);
            return this;
        }

        public Builder kinesis(@Nullable Output<TopicRuleErrorActionKinesisGetArgs> kinesis) {
            this.kinesis = kinesis;
            return this;
        }

        public Builder kinesis(@Nullable TopicRuleErrorActionKinesisGetArgs kinesis) {
            this.kinesis = Output.ofNullable(kinesis);
            return this;
        }

        public Builder lambda(@Nullable Output<TopicRuleErrorActionLambdaGetArgs> lambda) {
            this.lambda = lambda;
            return this;
        }

        public Builder lambda(@Nullable TopicRuleErrorActionLambdaGetArgs lambda) {
            this.lambda = Output.ofNullable(lambda);
            return this;
        }

        public Builder republish(@Nullable Output<TopicRuleErrorActionRepublishGetArgs> republish) {
            this.republish = republish;
            return this;
        }

        public Builder republish(@Nullable TopicRuleErrorActionRepublishGetArgs republish) {
            this.republish = Output.ofNullable(republish);
            return this;
        }

        public Builder s3(@Nullable Output<TopicRuleErrorActionS3GetArgs> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder s3(@Nullable TopicRuleErrorActionS3GetArgs s3) {
            this.s3 = Output.ofNullable(s3);
            return this;
        }

        public Builder sns(@Nullable Output<TopicRuleErrorActionSnsGetArgs> sns) {
            this.sns = sns;
            return this;
        }

        public Builder sns(@Nullable TopicRuleErrorActionSnsGetArgs sns) {
            this.sns = Output.ofNullable(sns);
            return this;
        }

        public Builder sqs(@Nullable Output<TopicRuleErrorActionSqsGetArgs> sqs) {
            this.sqs = sqs;
            return this;
        }

        public Builder sqs(@Nullable TopicRuleErrorActionSqsGetArgs sqs) {
            this.sqs = Output.ofNullable(sqs);
            return this;
        }

        public Builder stepFunctions(@Nullable Output<TopicRuleErrorActionStepFunctionsGetArgs> stepFunctions) {
            this.stepFunctions = stepFunctions;
            return this;
        }

        public Builder stepFunctions(@Nullable TopicRuleErrorActionStepFunctionsGetArgs stepFunctions) {
            this.stepFunctions = Output.ofNullable(stepFunctions);
            return this;
        }
        public TopicRuleErrorActionGetArgs build() {
            return new TopicRuleErrorActionGetArgs(cloudwatchAlarm, cloudwatchMetric, dynamodb, dynamodbv2, elasticsearch, firehose, iotAnalytics, iotEvents, kinesis, lambda, republish, s3, sns, sqs, stepFunctions);
        }
    }
}
