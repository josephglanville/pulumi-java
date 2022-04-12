// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamArgs;
import io.pulumi.aws.kinesis.inputs.GetStreamArgs;
import io.pulumi.aws.kinesis.inputs.GetStreamConsumerArgs;
import io.pulumi.aws.kinesis.outputs.GetFirehoseDeliveryStreamResult;
import io.pulumi.aws.kinesis.outputs.GetStreamConsumerResult;
import io.pulumi.aws.kinesis.outputs.GetStreamResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KinesisFunctions {
    /**
     * Use this data source to get information about a Kinesis Firehose Delivery Stream for use in other resources.
     * 
     * For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetFirehoseDeliveryStreamResult> getFirehoseDeliveryStream(GetFirehoseDeliveryStreamArgs args) {
        return getFirehoseDeliveryStream(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetFirehoseDeliveryStreamResult> getFirehoseDeliveryStream(GetFirehoseDeliveryStreamArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kinesis/getFirehoseDeliveryStream:getFirehoseDeliveryStream", TypeShape.of(GetFirehoseDeliveryStreamResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Kinesis Stream for use in other
     * resources.
     * 
     * For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStreamResult> getStream(GetStreamArgs args) {
        return getStream(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStreamResult> getStream(GetStreamArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kinesis/getStream:getStream", TypeShape.of(GetStreamResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a Kinesis Stream Consumer.
     * 
     * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStreamConsumerResult> getStreamConsumer(GetStreamConsumerArgs args) {
        return getStreamConsumer(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetStreamConsumerResult> getStreamConsumer(GetStreamConsumerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kinesis/getStreamConsumer:getStreamConsumer", TypeShape.of(GetStreamConsumerResult.class), args, Utilities.withVersion(options));
    }
}
