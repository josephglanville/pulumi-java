// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot;

import io.pulumi.aws.iot.inputs.TopicRuleCloudwatchAlarmArgs;
import io.pulumi.aws.iot.inputs.TopicRuleCloudwatchMetricArgs;
import io.pulumi.aws.iot.inputs.TopicRuleDynamodbArgs;
import io.pulumi.aws.iot.inputs.TopicRuleDynamodbv2Args;
import io.pulumi.aws.iot.inputs.TopicRuleElasticsearchArgs;
import io.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs;
import io.pulumi.aws.iot.inputs.TopicRuleFirehoseArgs;
import io.pulumi.aws.iot.inputs.TopicRuleIotAnalyticArgs;
import io.pulumi.aws.iot.inputs.TopicRuleIotEventArgs;
import io.pulumi.aws.iot.inputs.TopicRuleKinesisArgs;
import io.pulumi.aws.iot.inputs.TopicRuleLambdaArgs;
import io.pulumi.aws.iot.inputs.TopicRuleRepublishArgs;
import io.pulumi.aws.iot.inputs.TopicRuleS3Args;
import io.pulumi.aws.iot.inputs.TopicRuleSnsArgs;
import io.pulumi.aws.iot.inputs.TopicRuleSqsArgs;
import io.pulumi.aws.iot.inputs.TopicRuleStepFunctionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleArgs Empty = new TopicRuleArgs();

    @Import(name="cloudwatchAlarm")
      private final @Nullable Output<TopicRuleCloudwatchAlarmArgs> cloudwatchAlarm;

    public Output<TopicRuleCloudwatchAlarmArgs> getCloudwatchAlarm() {
        return this.cloudwatchAlarm == null ? Output.empty() : this.cloudwatchAlarm;
    }

    @Import(name="cloudwatchMetric")
      private final @Nullable Output<TopicRuleCloudwatchMetricArgs> cloudwatchMetric;

    public Output<TopicRuleCloudwatchMetricArgs> getCloudwatchMetric() {
        return this.cloudwatchMetric == null ? Output.empty() : this.cloudwatchMetric;
    }

    /**
     * The description of the rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="dynamodb")
      private final @Nullable Output<TopicRuleDynamodbArgs> dynamodb;

    public Output<TopicRuleDynamodbArgs> getDynamodb() {
        return this.dynamodb == null ? Output.empty() : this.dynamodb;
    }

    @Import(name="dynamodbv2s")
      private final @Nullable Output<List<TopicRuleDynamodbv2Args>> dynamodbv2s;

    public Output<List<TopicRuleDynamodbv2Args>> getDynamodbv2s() {
        return this.dynamodbv2s == null ? Output.empty() : this.dynamodbv2s;
    }

    @Import(name="elasticsearch")
      private final @Nullable Output<TopicRuleElasticsearchArgs> elasticsearch;

    public Output<TopicRuleElasticsearchArgs> getElasticsearch() {
        return this.elasticsearch == null ? Output.empty() : this.elasticsearch;
    }

    /**
     * Specifies whether the rule is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * Configuration block with error action to be associated with the rule. See the documentation for `cloudwatch_alarm`, `cloudwatch_metric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `iot_analytics`, `iot_events`, `kinesis`, `lambda`, `republish`, `s3`, `step_functions`, `sns`, `sqs` configuration blocks for further configuration details.
     * 
     */
    @Import(name="errorAction")
      private final @Nullable Output<TopicRuleErrorActionArgs> errorAction;

    public Output<TopicRuleErrorActionArgs> getErrorAction() {
        return this.errorAction == null ? Output.empty() : this.errorAction;
    }

    @Import(name="firehose")
      private final @Nullable Output<TopicRuleFirehoseArgs> firehose;

    public Output<TopicRuleFirehoseArgs> getFirehose() {
        return this.firehose == null ? Output.empty() : this.firehose;
    }

    @Import(name="iotAnalytics")
      private final @Nullable Output<List<TopicRuleIotAnalyticArgs>> iotAnalytics;

    public Output<List<TopicRuleIotAnalyticArgs>> getIotAnalytics() {
        return this.iotAnalytics == null ? Output.empty() : this.iotAnalytics;
    }

    @Import(name="iotEvents")
      private final @Nullable Output<List<TopicRuleIotEventArgs>> iotEvents;

    public Output<List<TopicRuleIotEventArgs>> getIotEvents() {
        return this.iotEvents == null ? Output.empty() : this.iotEvents;
    }

    @Import(name="kinesis")
      private final @Nullable Output<TopicRuleKinesisArgs> kinesis;

    public Output<TopicRuleKinesisArgs> getKinesis() {
        return this.kinesis == null ? Output.empty() : this.kinesis;
    }

    @Import(name="lambda")
      private final @Nullable Output<TopicRuleLambdaArgs> lambda;

    public Output<TopicRuleLambdaArgs> getLambda() {
        return this.lambda == null ? Output.empty() : this.lambda;
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="republish")
      private final @Nullable Output<TopicRuleRepublishArgs> republish;

    public Output<TopicRuleRepublishArgs> getRepublish() {
        return this.republish == null ? Output.empty() : this.republish;
    }

    @Import(name="s3")
      private final @Nullable Output<TopicRuleS3Args> s3;

    public Output<TopicRuleS3Args> getS3() {
        return this.s3 == null ? Output.empty() : this.s3;
    }

    @Import(name="sns")
      private final @Nullable Output<TopicRuleSnsArgs> sns;

    public Output<TopicRuleSnsArgs> getSns() {
        return this.sns == null ? Output.empty() : this.sns;
    }

    /**
     * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
     * 
     */
    @Import(name="sql", required=true)
      private final Output<String> sql;

    public Output<String> getSql() {
        return this.sql;
    }

    /**
     * The version of the SQL rules engine to use when evaluating the rule.
     * 
     */
    @Import(name="sqlVersion", required=true)
      private final Output<String> sqlVersion;

    public Output<String> getSqlVersion() {
        return this.sqlVersion;
    }

    @Import(name="sqs")
      private final @Nullable Output<TopicRuleSqsArgs> sqs;

    public Output<TopicRuleSqsArgs> getSqs() {
        return this.sqs == null ? Output.empty() : this.sqs;
    }

    @Import(name="stepFunctions")
      private final @Nullable Output<List<TopicRuleStepFunctionArgs>> stepFunctions;

    public Output<List<TopicRuleStepFunctionArgs>> getStepFunctions() {
        return this.stepFunctions == null ? Output.empty() : this.stepFunctions;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public TopicRuleArgs(
        @Nullable Output<TopicRuleCloudwatchAlarmArgs> cloudwatchAlarm,
        @Nullable Output<TopicRuleCloudwatchMetricArgs> cloudwatchMetric,
        @Nullable Output<String> description,
        @Nullable Output<TopicRuleDynamodbArgs> dynamodb,
        @Nullable Output<List<TopicRuleDynamodbv2Args>> dynamodbv2s,
        @Nullable Output<TopicRuleElasticsearchArgs> elasticsearch,
        Output<Boolean> enabled,
        @Nullable Output<TopicRuleErrorActionArgs> errorAction,
        @Nullable Output<TopicRuleFirehoseArgs> firehose,
        @Nullable Output<List<TopicRuleIotAnalyticArgs>> iotAnalytics,
        @Nullable Output<List<TopicRuleIotEventArgs>> iotEvents,
        @Nullable Output<TopicRuleKinesisArgs> kinesis,
        @Nullable Output<TopicRuleLambdaArgs> lambda,
        @Nullable Output<String> name,
        @Nullable Output<TopicRuleRepublishArgs> republish,
        @Nullable Output<TopicRuleS3Args> s3,
        @Nullable Output<TopicRuleSnsArgs> sns,
        Output<String> sql,
        Output<String> sqlVersion,
        @Nullable Output<TopicRuleSqsArgs> sqs,
        @Nullable Output<List<TopicRuleStepFunctionArgs>> stepFunctions,
        @Nullable Output<Map<String,String>> tags) {
        this.cloudwatchAlarm = cloudwatchAlarm;
        this.cloudwatchMetric = cloudwatchMetric;
        this.description = description;
        this.dynamodb = dynamodb;
        this.dynamodbv2s = dynamodbv2s;
        this.elasticsearch = elasticsearch;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.errorAction = errorAction;
        this.firehose = firehose;
        this.iotAnalytics = iotAnalytics;
        this.iotEvents = iotEvents;
        this.kinesis = kinesis;
        this.lambda = lambda;
        this.name = name;
        this.republish = republish;
        this.s3 = s3;
        this.sns = sns;
        this.sql = Objects.requireNonNull(sql, "expected parameter 'sql' to be non-null");
        this.sqlVersion = Objects.requireNonNull(sqlVersion, "expected parameter 'sqlVersion' to be non-null");
        this.sqs = sqs;
        this.stepFunctions = stepFunctions;
        this.tags = tags;
    }

    private TopicRuleArgs() {
        this.cloudwatchAlarm = Output.empty();
        this.cloudwatchMetric = Output.empty();
        this.description = Output.empty();
        this.dynamodb = Output.empty();
        this.dynamodbv2s = Output.empty();
        this.elasticsearch = Output.empty();
        this.enabled = Output.empty();
        this.errorAction = Output.empty();
        this.firehose = Output.empty();
        this.iotAnalytics = Output.empty();
        this.iotEvents = Output.empty();
        this.kinesis = Output.empty();
        this.lambda = Output.empty();
        this.name = Output.empty();
        this.republish = Output.empty();
        this.s3 = Output.empty();
        this.sns = Output.empty();
        this.sql = Output.empty();
        this.sqlVersion = Output.empty();
        this.sqs = Output.empty();
        this.stepFunctions = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TopicRuleCloudwatchAlarmArgs> cloudwatchAlarm;
        private @Nullable Output<TopicRuleCloudwatchMetricArgs> cloudwatchMetric;
        private @Nullable Output<String> description;
        private @Nullable Output<TopicRuleDynamodbArgs> dynamodb;
        private @Nullable Output<List<TopicRuleDynamodbv2Args>> dynamodbv2s;
        private @Nullable Output<TopicRuleElasticsearchArgs> elasticsearch;
        private Output<Boolean> enabled;
        private @Nullable Output<TopicRuleErrorActionArgs> errorAction;
        private @Nullable Output<TopicRuleFirehoseArgs> firehose;
        private @Nullable Output<List<TopicRuleIotAnalyticArgs>> iotAnalytics;
        private @Nullable Output<List<TopicRuleIotEventArgs>> iotEvents;
        private @Nullable Output<TopicRuleKinesisArgs> kinesis;
        private @Nullable Output<TopicRuleLambdaArgs> lambda;
        private @Nullable Output<String> name;
        private @Nullable Output<TopicRuleRepublishArgs> republish;
        private @Nullable Output<TopicRuleS3Args> s3;
        private @Nullable Output<TopicRuleSnsArgs> sns;
        private Output<String> sql;
        private Output<String> sqlVersion;
        private @Nullable Output<TopicRuleSqsArgs> sqs;
        private @Nullable Output<List<TopicRuleStepFunctionArgs>> stepFunctions;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchAlarm = defaults.cloudwatchAlarm;
    	      this.cloudwatchMetric = defaults.cloudwatchMetric;
    	      this.description = defaults.description;
    	      this.dynamodb = defaults.dynamodb;
    	      this.dynamodbv2s = defaults.dynamodbv2s;
    	      this.elasticsearch = defaults.elasticsearch;
    	      this.enabled = defaults.enabled;
    	      this.errorAction = defaults.errorAction;
    	      this.firehose = defaults.firehose;
    	      this.iotAnalytics = defaults.iotAnalytics;
    	      this.iotEvents = defaults.iotEvents;
    	      this.kinesis = defaults.kinesis;
    	      this.lambda = defaults.lambda;
    	      this.name = defaults.name;
    	      this.republish = defaults.republish;
    	      this.s3 = defaults.s3;
    	      this.sns = defaults.sns;
    	      this.sql = defaults.sql;
    	      this.sqlVersion = defaults.sqlVersion;
    	      this.sqs = defaults.sqs;
    	      this.stepFunctions = defaults.stepFunctions;
    	      this.tags = defaults.tags;
        }

        public Builder cloudwatchAlarm(@Nullable Output<TopicRuleCloudwatchAlarmArgs> cloudwatchAlarm) {
            this.cloudwatchAlarm = cloudwatchAlarm;
            return this;
        }
        public Builder cloudwatchAlarm(@Nullable TopicRuleCloudwatchAlarmArgs cloudwatchAlarm) {
            this.cloudwatchAlarm = Output.ofNullable(cloudwatchAlarm);
            return this;
        }
        public Builder cloudwatchMetric(@Nullable Output<TopicRuleCloudwatchMetricArgs> cloudwatchMetric) {
            this.cloudwatchMetric = cloudwatchMetric;
            return this;
        }
        public Builder cloudwatchMetric(@Nullable TopicRuleCloudwatchMetricArgs cloudwatchMetric) {
            this.cloudwatchMetric = Output.ofNullable(cloudwatchMetric);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder dynamodb(@Nullable Output<TopicRuleDynamodbArgs> dynamodb) {
            this.dynamodb = dynamodb;
            return this;
        }
        public Builder dynamodb(@Nullable TopicRuleDynamodbArgs dynamodb) {
            this.dynamodb = Output.ofNullable(dynamodb);
            return this;
        }
        public Builder dynamodbv2s(@Nullable Output<List<TopicRuleDynamodbv2Args>> dynamodbv2s) {
            this.dynamodbv2s = dynamodbv2s;
            return this;
        }
        public Builder dynamodbv2s(@Nullable List<TopicRuleDynamodbv2Args> dynamodbv2s) {
            this.dynamodbv2s = Output.ofNullable(dynamodbv2s);
            return this;
        }
        public Builder dynamodbv2s(TopicRuleDynamodbv2Args... dynamodbv2s) {
            return dynamodbv2s(List.of(dynamodbv2s));
        }
        public Builder elasticsearch(@Nullable Output<TopicRuleElasticsearchArgs> elasticsearch) {
            this.elasticsearch = elasticsearch;
            return this;
        }
        public Builder elasticsearch(@Nullable TopicRuleElasticsearchArgs elasticsearch) {
            this.elasticsearch = Output.ofNullable(elasticsearch);
            return this;
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder errorAction(@Nullable Output<TopicRuleErrorActionArgs> errorAction) {
            this.errorAction = errorAction;
            return this;
        }
        public Builder errorAction(@Nullable TopicRuleErrorActionArgs errorAction) {
            this.errorAction = Output.ofNullable(errorAction);
            return this;
        }
        public Builder firehose(@Nullable Output<TopicRuleFirehoseArgs> firehose) {
            this.firehose = firehose;
            return this;
        }
        public Builder firehose(@Nullable TopicRuleFirehoseArgs firehose) {
            this.firehose = Output.ofNullable(firehose);
            return this;
        }
        public Builder iotAnalytics(@Nullable Output<List<TopicRuleIotAnalyticArgs>> iotAnalytics) {
            this.iotAnalytics = iotAnalytics;
            return this;
        }
        public Builder iotAnalytics(@Nullable List<TopicRuleIotAnalyticArgs> iotAnalytics) {
            this.iotAnalytics = Output.ofNullable(iotAnalytics);
            return this;
        }
        public Builder iotAnalytics(TopicRuleIotAnalyticArgs... iotAnalytics) {
            return iotAnalytics(List.of(iotAnalytics));
        }
        public Builder iotEvents(@Nullable Output<List<TopicRuleIotEventArgs>> iotEvents) {
            this.iotEvents = iotEvents;
            return this;
        }
        public Builder iotEvents(@Nullable List<TopicRuleIotEventArgs> iotEvents) {
            this.iotEvents = Output.ofNullable(iotEvents);
            return this;
        }
        public Builder iotEvents(TopicRuleIotEventArgs... iotEvents) {
            return iotEvents(List.of(iotEvents));
        }
        public Builder kinesis(@Nullable Output<TopicRuleKinesisArgs> kinesis) {
            this.kinesis = kinesis;
            return this;
        }
        public Builder kinesis(@Nullable TopicRuleKinesisArgs kinesis) {
            this.kinesis = Output.ofNullable(kinesis);
            return this;
        }
        public Builder lambda(@Nullable Output<TopicRuleLambdaArgs> lambda) {
            this.lambda = lambda;
            return this;
        }
        public Builder lambda(@Nullable TopicRuleLambdaArgs lambda) {
            this.lambda = Output.ofNullable(lambda);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder republish(@Nullable Output<TopicRuleRepublishArgs> republish) {
            this.republish = republish;
            return this;
        }
        public Builder republish(@Nullable TopicRuleRepublishArgs republish) {
            this.republish = Output.ofNullable(republish);
            return this;
        }
        public Builder s3(@Nullable Output<TopicRuleS3Args> s3) {
            this.s3 = s3;
            return this;
        }
        public Builder s3(@Nullable TopicRuleS3Args s3) {
            this.s3 = Output.ofNullable(s3);
            return this;
        }
        public Builder sns(@Nullable Output<TopicRuleSnsArgs> sns) {
            this.sns = sns;
            return this;
        }
        public Builder sns(@Nullable TopicRuleSnsArgs sns) {
            this.sns = Output.ofNullable(sns);
            return this;
        }
        public Builder sql(Output<String> sql) {
            this.sql = Objects.requireNonNull(sql);
            return this;
        }
        public Builder sql(String sql) {
            this.sql = Output.of(Objects.requireNonNull(sql));
            return this;
        }
        public Builder sqlVersion(Output<String> sqlVersion) {
            this.sqlVersion = Objects.requireNonNull(sqlVersion);
            return this;
        }
        public Builder sqlVersion(String sqlVersion) {
            this.sqlVersion = Output.of(Objects.requireNonNull(sqlVersion));
            return this;
        }
        public Builder sqs(@Nullable Output<TopicRuleSqsArgs> sqs) {
            this.sqs = sqs;
            return this;
        }
        public Builder sqs(@Nullable TopicRuleSqsArgs sqs) {
            this.sqs = Output.ofNullable(sqs);
            return this;
        }
        public Builder stepFunctions(@Nullable Output<List<TopicRuleStepFunctionArgs>> stepFunctions) {
            this.stepFunctions = stepFunctions;
            return this;
        }
        public Builder stepFunctions(@Nullable List<TopicRuleStepFunctionArgs> stepFunctions) {
            this.stepFunctions = Output.ofNullable(stepFunctions);
            return this;
        }
        public Builder stepFunctions(TopicRuleStepFunctionArgs... stepFunctions) {
            return stepFunctions(List.of(stepFunctions));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public TopicRuleArgs build() {
            return new TopicRuleArgs(cloudwatchAlarm, cloudwatchMetric, description, dynamodb, dynamodbv2s, elasticsearch, enabled, errorAction, firehose, iotAnalytics, iotEvents, kinesis, lambda, name, republish, s3, sns, sql, sqlVersion, sqs, stepFunctions, tags);
        }
    }
}