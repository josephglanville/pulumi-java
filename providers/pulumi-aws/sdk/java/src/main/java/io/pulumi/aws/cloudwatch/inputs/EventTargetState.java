// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetGetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetState extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetState Empty = new EventTargetState();

    /**
     * - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="batchTarget")
      private final @Nullable Output<EventTargetBatchTargetGetArgs> batchTarget;

    public Output<EventTargetBatchTargetGetArgs> getBatchTarget() {
        return this.batchTarget == null ? Output.empty() : this.batchTarget;
    }

    /**
     * Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="deadLetterConfig")
      private final @Nullable Output<EventTargetDeadLetterConfigGetArgs> deadLetterConfig;

    public Output<EventTargetDeadLetterConfigGetArgs> getDeadLetterConfig() {
        return this.deadLetterConfig == null ? Output.empty() : this.deadLetterConfig;
    }

    /**
     * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="ecsTarget")
      private final @Nullable Output<EventTargetEcsTargetGetArgs> ecsTarget;

    public Output<EventTargetEcsTargetGetArgs> getEcsTarget() {
        return this.ecsTarget == null ? Output.empty() : this.ecsTarget;
    }

    /**
     * The event bus to associate with the rule. If you omit this, the `default` event bus is used.
     * 
     */
    @Import(name="eventBusName")
      private final @Nullable Output<String> eventBusName;

    public Output<String> getEventBusName() {
        return this.eventBusName == null ? Output.empty() : this.eventBusName;
    }

    /**
     * Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
     * 
     */
    @Import(name="httpTarget")
      private final @Nullable Output<EventTargetHttpTargetGetArgs> httpTarget;

    public Output<EventTargetHttpTargetGetArgs> getHttpTarget() {
        return this.httpTarget == null ? Output.empty() : this.httpTarget;
    }

    /**
     * Valid JSON text passed to the target. Conflicts with `input_path` and `input_transformer`.
     * 
     */
    @Import(name="input")
      private final @Nullable Output<String> input;

    public Output<String> getInput() {
        return this.input == null ? Output.empty() : this.input;
    }

    /**
     * The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `input_transformer`.
     * 
     */
    @Import(name="inputPath")
      private final @Nullable Output<String> inputPath;

    public Output<String> getInputPath() {
        return this.inputPath == null ? Output.empty() : this.inputPath;
    }

    /**
     * Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `input_path`.
     * 
     */
    @Import(name="inputTransformer")
      private final @Nullable Output<EventTargetInputTransformerGetArgs> inputTransformer;

    public Output<EventTargetInputTransformerGetArgs> getInputTransformer() {
        return this.inputTransformer == null ? Output.empty() : this.inputTransformer;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="kinesisTarget")
      private final @Nullable Output<EventTargetKinesisTargetGetArgs> kinesisTarget;

    public Output<EventTargetKinesisTargetGetArgs> getKinesisTarget() {
        return this.kinesisTarget == null ? Output.empty() : this.kinesisTarget;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="redshiftTarget")
      private final @Nullable Output<EventTargetRedshiftTargetGetArgs> redshiftTarget;

    public Output<EventTargetRedshiftTargetGetArgs> getRedshiftTarget() {
        return this.redshiftTarget == null ? Output.empty() : this.redshiftTarget;
    }

    /**
     * Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<EventTargetRetryPolicyGetArgs> retryPolicy;

    public Output<EventTargetRetryPolicyGetArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecs_target` is used or target in `arn` is EC2 instance, Kinesis data stream, Step Functions state machine, or Event Bus in different account or region.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    /**
     * The name of the rule you want to add targets to.
     * 
     */
    @Import(name="rule")
      private final @Nullable Output<String> rule;

    public Output<String> getRule() {
        return this.rule == null ? Output.empty() : this.rule;
    }

    /**
     * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
     * 
     */
    @Import(name="runCommandTargets")
      private final @Nullable Output<List<EventTargetRunCommandTargetGetArgs>> runCommandTargets;

    public Output<List<EventTargetRunCommandTargetGetArgs>> getRunCommandTargets() {
        return this.runCommandTargets == null ? Output.empty() : this.runCommandTargets;
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="sqsTarget")
      private final @Nullable Output<EventTargetSqsTargetGetArgs> sqsTarget;

    public Output<EventTargetSqsTargetGetArgs> getSqsTarget() {
        return this.sqsTarget == null ? Output.empty() : this.sqsTarget;
    }

    /**
     * The unique target assignment ID.  If missing, will generate a random, unique id.
     * 
     */
    @Import(name="targetId")
      private final @Nullable Output<String> targetId;

    public Output<String> getTargetId() {
        return this.targetId == null ? Output.empty() : this.targetId;
    }

    public EventTargetState(
        @Nullable Output<String> arn,
        @Nullable Output<EventTargetBatchTargetGetArgs> batchTarget,
        @Nullable Output<EventTargetDeadLetterConfigGetArgs> deadLetterConfig,
        @Nullable Output<EventTargetEcsTargetGetArgs> ecsTarget,
        @Nullable Output<String> eventBusName,
        @Nullable Output<EventTargetHttpTargetGetArgs> httpTarget,
        @Nullable Output<String> input,
        @Nullable Output<String> inputPath,
        @Nullable Output<EventTargetInputTransformerGetArgs> inputTransformer,
        @Nullable Output<EventTargetKinesisTargetGetArgs> kinesisTarget,
        @Nullable Output<EventTargetRedshiftTargetGetArgs> redshiftTarget,
        @Nullable Output<EventTargetRetryPolicyGetArgs> retryPolicy,
        @Nullable Output<String> roleArn,
        @Nullable Output<String> rule,
        @Nullable Output<List<EventTargetRunCommandTargetGetArgs>> runCommandTargets,
        @Nullable Output<EventTargetSqsTargetGetArgs> sqsTarget,
        @Nullable Output<String> targetId) {
        this.arn = arn;
        this.batchTarget = batchTarget;
        this.deadLetterConfig = deadLetterConfig;
        this.ecsTarget = ecsTarget;
        this.eventBusName = eventBusName;
        this.httpTarget = httpTarget;
        this.input = input;
        this.inputPath = inputPath;
        this.inputTransformer = inputTransformer;
        this.kinesisTarget = kinesisTarget;
        this.redshiftTarget = redshiftTarget;
        this.retryPolicy = retryPolicy;
        this.roleArn = roleArn;
        this.rule = rule;
        this.runCommandTargets = runCommandTargets;
        this.sqsTarget = sqsTarget;
        this.targetId = targetId;
    }

    private EventTargetState() {
        this.arn = Output.empty();
        this.batchTarget = Output.empty();
        this.deadLetterConfig = Output.empty();
        this.ecsTarget = Output.empty();
        this.eventBusName = Output.empty();
        this.httpTarget = Output.empty();
        this.input = Output.empty();
        this.inputPath = Output.empty();
        this.inputTransformer = Output.empty();
        this.kinesisTarget = Output.empty();
        this.redshiftTarget = Output.empty();
        this.retryPolicy = Output.empty();
        this.roleArn = Output.empty();
        this.rule = Output.empty();
        this.runCommandTargets = Output.empty();
        this.sqsTarget = Output.empty();
        this.targetId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<EventTargetBatchTargetGetArgs> batchTarget;
        private @Nullable Output<EventTargetDeadLetterConfigGetArgs> deadLetterConfig;
        private @Nullable Output<EventTargetEcsTargetGetArgs> ecsTarget;
        private @Nullable Output<String> eventBusName;
        private @Nullable Output<EventTargetHttpTargetGetArgs> httpTarget;
        private @Nullable Output<String> input;
        private @Nullable Output<String> inputPath;
        private @Nullable Output<EventTargetInputTransformerGetArgs> inputTransformer;
        private @Nullable Output<EventTargetKinesisTargetGetArgs> kinesisTarget;
        private @Nullable Output<EventTargetRedshiftTargetGetArgs> redshiftTarget;
        private @Nullable Output<EventTargetRetryPolicyGetArgs> retryPolicy;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> rule;
        private @Nullable Output<List<EventTargetRunCommandTargetGetArgs>> runCommandTargets;
        private @Nullable Output<EventTargetSqsTargetGetArgs> sqsTarget;
        private @Nullable Output<String> targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.batchTarget = defaults.batchTarget;
    	      this.deadLetterConfig = defaults.deadLetterConfig;
    	      this.ecsTarget = defaults.ecsTarget;
    	      this.eventBusName = defaults.eventBusName;
    	      this.httpTarget = defaults.httpTarget;
    	      this.input = defaults.input;
    	      this.inputPath = defaults.inputPath;
    	      this.inputTransformer = defaults.inputTransformer;
    	      this.kinesisTarget = defaults.kinesisTarget;
    	      this.redshiftTarget = defaults.redshiftTarget;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.roleArn = defaults.roleArn;
    	      this.rule = defaults.rule;
    	      this.runCommandTargets = defaults.runCommandTargets;
    	      this.sqsTarget = defaults.sqsTarget;
    	      this.targetId = defaults.targetId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder batchTarget(@Nullable Output<EventTargetBatchTargetGetArgs> batchTarget) {
            this.batchTarget = batchTarget;
            return this;
        }
        public Builder batchTarget(@Nullable EventTargetBatchTargetGetArgs batchTarget) {
            this.batchTarget = Output.ofNullable(batchTarget);
            return this;
        }
        public Builder deadLetterConfig(@Nullable Output<EventTargetDeadLetterConfigGetArgs> deadLetterConfig) {
            this.deadLetterConfig = deadLetterConfig;
            return this;
        }
        public Builder deadLetterConfig(@Nullable EventTargetDeadLetterConfigGetArgs deadLetterConfig) {
            this.deadLetterConfig = Output.ofNullable(deadLetterConfig);
            return this;
        }
        public Builder ecsTarget(@Nullable Output<EventTargetEcsTargetGetArgs> ecsTarget) {
            this.ecsTarget = ecsTarget;
            return this;
        }
        public Builder ecsTarget(@Nullable EventTargetEcsTargetGetArgs ecsTarget) {
            this.ecsTarget = Output.ofNullable(ecsTarget);
            return this;
        }
        public Builder eventBusName(@Nullable Output<String> eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public Builder eventBusName(@Nullable String eventBusName) {
            this.eventBusName = Output.ofNullable(eventBusName);
            return this;
        }
        public Builder httpTarget(@Nullable Output<EventTargetHttpTargetGetArgs> httpTarget) {
            this.httpTarget = httpTarget;
            return this;
        }
        public Builder httpTarget(@Nullable EventTargetHttpTargetGetArgs httpTarget) {
            this.httpTarget = Output.ofNullable(httpTarget);
            return this;
        }
        public Builder input(@Nullable Output<String> input) {
            this.input = input;
            return this;
        }
        public Builder input(@Nullable String input) {
            this.input = Output.ofNullable(input);
            return this;
        }
        public Builder inputPath(@Nullable Output<String> inputPath) {
            this.inputPath = inputPath;
            return this;
        }
        public Builder inputPath(@Nullable String inputPath) {
            this.inputPath = Output.ofNullable(inputPath);
            return this;
        }
        public Builder inputTransformer(@Nullable Output<EventTargetInputTransformerGetArgs> inputTransformer) {
            this.inputTransformer = inputTransformer;
            return this;
        }
        public Builder inputTransformer(@Nullable EventTargetInputTransformerGetArgs inputTransformer) {
            this.inputTransformer = Output.ofNullable(inputTransformer);
            return this;
        }
        public Builder kinesisTarget(@Nullable Output<EventTargetKinesisTargetGetArgs> kinesisTarget) {
            this.kinesisTarget = kinesisTarget;
            return this;
        }
        public Builder kinesisTarget(@Nullable EventTargetKinesisTargetGetArgs kinesisTarget) {
            this.kinesisTarget = Output.ofNullable(kinesisTarget);
            return this;
        }
        public Builder redshiftTarget(@Nullable Output<EventTargetRedshiftTargetGetArgs> redshiftTarget) {
            this.redshiftTarget = redshiftTarget;
            return this;
        }
        public Builder redshiftTarget(@Nullable EventTargetRedshiftTargetGetArgs redshiftTarget) {
            this.redshiftTarget = Output.ofNullable(redshiftTarget);
            return this;
        }
        public Builder retryPolicy(@Nullable Output<EventTargetRetryPolicyGetArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable EventTargetRetryPolicyGetArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }
        public Builder rule(@Nullable Output<String> rule) {
            this.rule = rule;
            return this;
        }
        public Builder rule(@Nullable String rule) {
            this.rule = Output.ofNullable(rule);
            return this;
        }
        public Builder runCommandTargets(@Nullable Output<List<EventTargetRunCommandTargetGetArgs>> runCommandTargets) {
            this.runCommandTargets = runCommandTargets;
            return this;
        }
        public Builder runCommandTargets(@Nullable List<EventTargetRunCommandTargetGetArgs> runCommandTargets) {
            this.runCommandTargets = Output.ofNullable(runCommandTargets);
            return this;
        }
        public Builder runCommandTargets(EventTargetRunCommandTargetGetArgs... runCommandTargets) {
            return runCommandTargets(List.of(runCommandTargets));
        }
        public Builder sqsTarget(@Nullable Output<EventTargetSqsTargetGetArgs> sqsTarget) {
            this.sqsTarget = sqsTarget;
            return this;
        }
        public Builder sqsTarget(@Nullable EventTargetSqsTargetGetArgs sqsTarget) {
            this.sqsTarget = Output.ofNullable(sqsTarget);
            return this;
        }
        public Builder targetId(@Nullable Output<String> targetId) {
            this.targetId = targetId;
            return this;
        }
        public Builder targetId(@Nullable String targetId) {
            this.targetId = Output.ofNullable(targetId);
            return this;
        }        public EventTargetState build() {
            return new EventTargetState(arn, batchTarget, deadLetterConfig, ecsTarget, eventBusName, httpTarget, input, inputPath, inputTransformer, kinesisTarget, redshiftTarget, retryPolicy, roleArn, rule, runCommandTargets, sqsTarget, targetId);
        }
    }
}
