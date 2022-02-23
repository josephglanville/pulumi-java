// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lambda.EventSourceMappingArgs;
import io.pulumi.awsnative.lambda.enums.EventSourceMappingFunctionResponseTypesItem;
import io.pulumi.awsnative.lambda.outputs.EventSourceMappingDestinationConfig;
import io.pulumi.awsnative.lambda.outputs.EventSourceMappingSelfManagedEventSource;
import io.pulumi.awsnative.lambda.outputs.EventSourceMappingSourceAccessConfiguration;
import io.pulumi.awsnative.lambda.outputs.FilterCriteriaProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Lambda::EventSourceMapping
 * 
 */
@ResourceType(type="aws-native:lambda:EventSourceMapping")
public class EventSourceMapping extends io.pulumi.resources.CustomResource {
    /**
     * The maximum number of items to retrieve in a single batch.
     * 
     */
    @OutputExport(name="batchSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> batchSize;

    /**
     * @return The maximum number of items to retrieve in a single batch.
     * 
     */
    public Output</* @Nullable */ Integer> getBatchSize() {
        return this.batchSize;
    }
    /**
     * (Streams) If the function returns an error, split the batch in two and retry.
     * 
     */
    @OutputExport(name="bisectBatchOnFunctionError", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> bisectBatchOnFunctionError;

    /**
     * @return (Streams) If the function returns an error, split the batch in two and retry.
     * 
     */
    public Output</* @Nullable */ Boolean> getBisectBatchOnFunctionError() {
        return this.bisectBatchOnFunctionError;
    }
    /**
     * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * 
     */
    @OutputExport(name="destinationConfig", type=EventSourceMappingDestinationConfig.class, parameters={})
    private Output</* @Nullable */ EventSourceMappingDestinationConfig> destinationConfig;

    /**
     * @return (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * 
     */
    public Output</* @Nullable */ EventSourceMappingDestinationConfig> getDestinationConfig() {
        return this.destinationConfig;
    }
    /**
     * Disables the event source mapping to pause polling and invocation.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Disables the event source mapping to pause polling and invocation.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * The Amazon Resource Name (ARN) of the event source.
     * 
     */
    @OutputExport(name="eventSourceArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventSourceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the event source.
     * 
     */
    public Output</* @Nullable */ String> getEventSourceArn() {
        return this.eventSourceArn;
    }
    /**
     * The filter criteria to control event filtering.
     * 
     */
    @OutputExport(name="filterCriteria", type=FilterCriteriaProperties.class, parameters={})
    private Output</* @Nullable */ FilterCriteriaProperties> filterCriteria;

    /**
     * @return The filter criteria to control event filtering.
     * 
     */
    public Output</* @Nullable */ FilterCriteriaProperties> getFilterCriteria() {
        return this.filterCriteria;
    }
    /**
     * The name of the Lambda function.
     * 
     */
    @OutputExport(name="functionName", type=String.class, parameters={})
    private Output<String> functionName;

    /**
     * @return The name of the Lambda function.
     * 
     */
    public Output<String> getFunctionName() {
        return this.functionName;
    }
    /**
     * (Streams) A list of response types supported by the function.
     * 
     */
    @OutputExport(name="functionResponseTypes", type=List.class, parameters={EventSourceMappingFunctionResponseTypesItem.class})
    private Output</* @Nullable */ List<EventSourceMappingFunctionResponseTypesItem>> functionResponseTypes;

    /**
     * @return (Streams) A list of response types supported by the function.
     * 
     */
    public Output</* @Nullable */ List<EventSourceMappingFunctionResponseTypesItem>> getFunctionResponseTypes() {
        return this.functionResponseTypes;
    }
    /**
     * (Streams) The maximum amount of time to gather records before invoking the function, in seconds.
     * 
     */
    @OutputExport(name="maximumBatchingWindowInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumBatchingWindowInSeconds;

    /**
     * @return (Streams) The maximum amount of time to gather records before invoking the function, in seconds.
     * 
     */
    public Output</* @Nullable */ Integer> getMaximumBatchingWindowInSeconds() {
        return this.maximumBatchingWindowInSeconds;
    }
    /**
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * 
     */
    @OutputExport(name="maximumRecordAgeInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumRecordAgeInSeconds;

    /**
     * @return (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * 
     */
    public Output</* @Nullable */ Integer> getMaximumRecordAgeInSeconds() {
        return this.maximumRecordAgeInSeconds;
    }
    /**
     * (Streams) The maximum number of times to retry when the function returns an error.
     * 
     */
    @OutputExport(name="maximumRetryAttempts", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumRetryAttempts;

    /**
     * @return (Streams) The maximum number of times to retry when the function returns an error.
     * 
     */
    public Output</* @Nullable */ Integer> getMaximumRetryAttempts() {
        return this.maximumRetryAttempts;
    }
    /**
     * (Streams) The number of batches to process from each shard concurrently.
     * 
     */
    @OutputExport(name="parallelizationFactor", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> parallelizationFactor;

    /**
     * @return (Streams) The number of batches to process from each shard concurrently.
     * 
     */
    public Output</* @Nullable */ Integer> getParallelizationFactor() {
        return this.parallelizationFactor;
    }
    /**
     * (ActiveMQ) A list of ActiveMQ queues.
     * 
     */
    @OutputExport(name="queues", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> queues;

    /**
     * @return (ActiveMQ) A list of ActiveMQ queues.
     * 
     */
    public Output</* @Nullable */ List<String>> getQueues() {
        return this.queues;
    }
    /**
     * Self-managed event source endpoints.
     * 
     */
    @OutputExport(name="selfManagedEventSource", type=EventSourceMappingSelfManagedEventSource.class, parameters={})
    private Output</* @Nullable */ EventSourceMappingSelfManagedEventSource> selfManagedEventSource;

    /**
     * @return Self-managed event source endpoints.
     * 
     */
    public Output</* @Nullable */ EventSourceMappingSelfManagedEventSource> getSelfManagedEventSource() {
        return this.selfManagedEventSource;
    }
    /**
     * A list of SourceAccessConfiguration.
     * 
     */
    @OutputExport(name="sourceAccessConfigurations", type=List.class, parameters={EventSourceMappingSourceAccessConfiguration.class})
    private Output</* @Nullable */ List<EventSourceMappingSourceAccessConfiguration>> sourceAccessConfigurations;

    /**
     * @return A list of SourceAccessConfiguration.
     * 
     */
    public Output</* @Nullable */ List<EventSourceMappingSourceAccessConfiguration>> getSourceAccessConfigurations() {
        return this.sourceAccessConfigurations;
    }
    /**
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
     * 
     */
    @OutputExport(name="startingPosition", type=String.class, parameters={})
    private Output</* @Nullable */ String> startingPosition;

    /**
     * @return The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
     * 
     */
    public Output</* @Nullable */ String> getStartingPosition() {
        return this.startingPosition;
    }
    /**
     * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time seconds.
     * 
     */
    @OutputExport(name="startingPositionTimestamp", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> startingPositionTimestamp;

    /**
     * @return With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time seconds.
     * 
     */
    public Output</* @Nullable */ Double> getStartingPositionTimestamp() {
        return this.startingPositionTimestamp;
    }
    /**
     * (Kafka) A list of Kafka topics.
     * 
     */
    @OutputExport(name="topics", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> topics;

    /**
     * @return (Kafka) A list of Kafka topics.
     * 
     */
    public Output</* @Nullable */ List<String>> getTopics() {
        return this.topics;
    }
    /**
     * (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
     * 
     */
    @OutputExport(name="tumblingWindowInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tumblingWindowInSeconds;

    /**
     * @return (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
     * 
     */
    public Output</* @Nullable */ Integer> getTumblingWindowInSeconds() {
        return this.tumblingWindowInSeconds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventSourceMapping(String name) {
        this(name, EventSourceMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventSourceMapping(String name, EventSourceMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventSourceMapping(String name, EventSourceMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lambda:EventSourceMapping", name, args == null ? EventSourceMappingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EventSourceMapping(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lambda:EventSourceMapping", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EventSourceMapping get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventSourceMapping(name, id, options);
    }
}
