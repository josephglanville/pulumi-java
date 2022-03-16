// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.EventTargetArgs;
import io.pulumi.aws.cloudwatch.inputs.EventTargetState;
import io.pulumi.aws.cloudwatch.outputs.EventTargetBatchTarget;
import io.pulumi.aws.cloudwatch.outputs.EventTargetDeadLetterConfig;
import io.pulumi.aws.cloudwatch.outputs.EventTargetEcsTarget;
import io.pulumi.aws.cloudwatch.outputs.EventTargetHttpTarget;
import io.pulumi.aws.cloudwatch.outputs.EventTargetInputTransformer;
import io.pulumi.aws.cloudwatch.outputs.EventTargetKinesisTarget;
import io.pulumi.aws.cloudwatch.outputs.EventTargetRedshiftTarget;
import io.pulumi.aws.cloudwatch.outputs.EventTargetRetryPolicy;
import io.pulumi.aws.cloudwatch.outputs.EventTargetRunCommandTarget;
import io.pulumi.aws.cloudwatch.outputs.EventTargetSqsTarget;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an EventBridge Target resource.
 * 
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * ## Example Usage
 * ## Example SSM Document Usage
 * 
 * ## Example RunCommand Usage
 * 
 * ## Example API Gateway target
 * 
 * ## Example Cross-Account Event Bus target
 * 
 * ## Example Input Transformer Usage - JSON Object
 * 
 * ## Example Input Transformer Usage - Simple String
 * 
 * ## Import
 * 
 * EventBridge Targets can be imported using `event_bus_name/rule-name/target-id` (if you omit `event_bus_name`, the `default` event bus will be used).
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventTarget:EventTarget test-event-target rule-name/target-id
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventTarget:EventTarget")
public class EventTarget extends io.pulumi.resources.CustomResource {
    /**
     * - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Export(name="batchTarget", type=EventTargetBatchTarget.class, parameters={})
    private Output</* @Nullable */ EventTargetBatchTarget> batchTarget;

    /**
     * @return Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Output</* @Nullable */ EventTargetBatchTarget> getBatchTarget() {
        return this.batchTarget;
    }
    /**
     * Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Export(name="deadLetterConfig", type=EventTargetDeadLetterConfig.class, parameters={})
    private Output</* @Nullable */ EventTargetDeadLetterConfig> deadLetterConfig;

    /**
     * @return Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Output</* @Nullable */ EventTargetDeadLetterConfig> getDeadLetterConfig() {
        return this.deadLetterConfig;
    }
    /**
     * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Export(name="ecsTarget", type=EventTargetEcsTarget.class, parameters={})
    private Output</* @Nullable */ EventTargetEcsTarget> ecsTarget;

    /**
     * @return Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Output</* @Nullable */ EventTargetEcsTarget> getEcsTarget() {
        return this.ecsTarget;
    }
    /**
     * The event bus to associate with the rule. If you omit this, the `default` event bus is used.
     * 
     */
    @Export(name="eventBusName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventBusName;

    /**
     * @return The event bus to associate with the rule. If you omit this, the `default` event bus is used.
     * 
     */
    public Output</* @Nullable */ String> getEventBusName() {
        return this.eventBusName;
    }
    /**
     * Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
     * 
     */
    @Export(name="httpTarget", type=EventTargetHttpTarget.class, parameters={})
    private Output</* @Nullable */ EventTargetHttpTarget> httpTarget;

    /**
     * @return Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
     * 
     */
    public Output</* @Nullable */ EventTargetHttpTarget> getHttpTarget() {
        return this.httpTarget;
    }
    /**
     * Valid JSON text passed to the target. Conflicts with `input_path` and `input_transformer`.
     * 
     */
    @Export(name="input", type=String.class, parameters={})
    private Output</* @Nullable */ String> input;

    /**
     * @return Valid JSON text passed to the target. Conflicts with `input_path` and `input_transformer`.
     * 
     */
    public Output</* @Nullable */ String> getInput() {
        return this.input;
    }
    /**
     * The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `input_transformer`.
     * 
     */
    @Export(name="inputPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> inputPath;

    /**
     * @return The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `input_transformer`.
     * 
     */
    public Output</* @Nullable */ String> getInputPath() {
        return this.inputPath;
    }
    /**
     * Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `input_path`.
     * 
     */
    @Export(name="inputTransformer", type=EventTargetInputTransformer.class, parameters={})
    private Output</* @Nullable */ EventTargetInputTransformer> inputTransformer;

    /**
     * @return Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `input_path`.
     * 
     */
    public Output</* @Nullable */ EventTargetInputTransformer> getInputTransformer() {
        return this.inputTransformer;
    }
    /**
     * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Export(name="kinesisTarget", type=EventTargetKinesisTarget.class, parameters={})
    private Output</* @Nullable */ EventTargetKinesisTarget> kinesisTarget;

    /**
     * @return Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Output</* @Nullable */ EventTargetKinesisTarget> getKinesisTarget() {
        return this.kinesisTarget;
    }
    /**
     * Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Export(name="redshiftTarget", type=EventTargetRedshiftTarget.class, parameters={})
    private Output</* @Nullable */ EventTargetRedshiftTarget> redshiftTarget;

    /**
     * @return Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Output</* @Nullable */ EventTargetRedshiftTarget> getRedshiftTarget() {
        return this.redshiftTarget;
    }
    /**
     * Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Export(name="retryPolicy", type=EventTargetRetryPolicy.class, parameters={})
    private Output</* @Nullable */ EventTargetRetryPolicy> retryPolicy;

    /**
     * @return Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Output</* @Nullable */ EventTargetRetryPolicy> getRetryPolicy() {
        return this.retryPolicy;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecs_target` is used or target in `arn` is EC2 instance, Kinesis data stream, Step Functions state machine, or Event Bus in different account or region.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecs_target` is used or target in `arn` is EC2 instance, Kinesis data stream, Step Functions state machine, or Event Bus in different account or region.
     * 
     */
    public Output</* @Nullable */ String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * The name of the rule you want to add targets to.
     * 
     */
    @Export(name="rule", type=String.class, parameters={})
    private Output<String> rule;

    /**
     * @return The name of the rule you want to add targets to.
     * 
     */
    public Output<String> getRule() {
        return this.rule;
    }
    /**
     * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
     * 
     */
    @Export(name="runCommandTargets", type=List.class, parameters={EventTargetRunCommandTarget.class})
    private Output</* @Nullable */ List<EventTargetRunCommandTarget>> runCommandTargets;

    /**
     * @return Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
     * 
     */
    public Output</* @Nullable */ List<EventTargetRunCommandTarget>> getRunCommandTargets() {
        return this.runCommandTargets;
    }
    /**
     * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Export(name="sqsTarget", type=EventTargetSqsTarget.class, parameters={})
    private Output</* @Nullable */ EventTargetSqsTarget> sqsTarget;

    /**
     * @return Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Output</* @Nullable */ EventTargetSqsTarget> getSqsTarget() {
        return this.sqsTarget;
    }
    /**
     * The unique target assignment ID.  If missing, will generate a random, unique id.
     * 
     */
    @Export(name="targetId", type=String.class, parameters={})
    private Output<String> targetId;

    /**
     * @return The unique target assignment ID.  If missing, will generate a random, unique id.
     * 
     */
    public Output<String> getTargetId() {
        return this.targetId;
    }

    public interface BuilderApplicator {
        public void apply(EventTargetArgs.Builder a);
    }
    private static io.pulumi.aws.cloudwatch.EventTargetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudwatch.EventTargetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EventTarget(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventTarget(String name) {
        this(name, EventTargetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventTarget(String name, EventTargetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventTarget(String name, EventTargetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventTarget:EventTarget", name, args == null ? EventTargetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EventTarget(String name, Output<String> id, @Nullable EventTargetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventTarget:EventTarget", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EventTarget get(String name, Output<String> id, @Nullable EventTargetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventTarget(name, id, state, options);
    }
}
