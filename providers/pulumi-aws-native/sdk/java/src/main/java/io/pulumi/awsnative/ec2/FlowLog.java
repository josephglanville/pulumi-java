// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.FlowLogArgs;
import io.pulumi.awsnative.ec2.enums.FlowLogLogDestinationType;
import io.pulumi.awsnative.ec2.enums.FlowLogResourceType;
import io.pulumi.awsnative.ec2.enums.FlowLogTrafficType;
import io.pulumi.awsnative.ec2.outputs.DestinationOptionsProperties;
import io.pulumi.awsnative.ec2.outputs.FlowLogTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Specifies a VPC flow log, which enables you to capture IP traffic for a specific network interface, subnet, or VPC.
 * 
 */
@ResourceType(type="aws-native:ec2:FlowLog")
public class FlowLog extends io.pulumi.resources.CustomResource {
    /**
     * The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your account. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
     * 
     */
    @Export(name="deliverLogsPermissionArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliverLogsPermissionArn;

    /**
     * @return The ARN for the IAM role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your account. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
     * 
     */
    public Output</* @Nullable */ String> getDeliverLogsPermissionArn() {
        return this.deliverLogsPermissionArn;
    }
    @Export(name="destinationOptions", type=DestinationOptionsProperties.class, parameters={})
    private Output</* @Nullable */ DestinationOptionsProperties> destinationOptions;

    public Output</* @Nullable */ DestinationOptionsProperties> getDestinationOptions() {
        return this.destinationOptions;
    }
    /**
     * Specifies the destination to which the flow log data is to be published. Flow log data can be published to a CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value specified for LogDestinationType.
     * 
     */
    @Export(name="logDestination", type=String.class, parameters={})
    private Output</* @Nullable */ String> logDestination;

    /**
     * @return Specifies the destination to which the flow log data is to be published. Flow log data can be published to a CloudWatch Logs log group or an Amazon S3 bucket. The value specified for this parameter depends on the value specified for LogDestinationType.
     * 
     */
    public Output</* @Nullable */ String> getLogDestination() {
        return this.logDestination;
    }
    /**
     * Specifies the type of destination to which the flow log data is to be published. Flow log data can be published to CloudWatch Logs or Amazon S3.
     * 
     */
    @Export(name="logDestinationType", type=FlowLogLogDestinationType.class, parameters={})
    private Output</* @Nullable */ FlowLogLogDestinationType> logDestinationType;

    /**
     * @return Specifies the type of destination to which the flow log data is to be published. Flow log data can be published to CloudWatch Logs or Amazon S3.
     * 
     */
    public Output</* @Nullable */ FlowLogLogDestinationType> getLogDestinationType() {
        return this.logDestinationType;
    }
    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     * 
     */
    @Export(name="logFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> logFormat;

    /**
     * @return The fields to include in the flow log record, in the order in which they should appear.
     * 
     */
    public Output</* @Nullable */ String> getLogFormat() {
        return this.logFormat;
    }
    /**
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
     * 
     */
    @Export(name="logGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> logGroupName;

    /**
     * @return The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs. If you specify LogDestinationType as s3, do not specify DeliverLogsPermissionArn or LogGroupName.
     * 
     */
    public Output</* @Nullable */ String> getLogGroupName() {
        return this.logGroupName;
    }
    /**
     * The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record. You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).
     * 
     */
    @Export(name="maxAggregationInterval", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxAggregationInterval;

    /**
     * @return The maximum interval of time during which a flow of packets is captured and aggregated into a flow log record. You can specify 60 seconds (1 minute) or 600 seconds (10 minutes).
     * 
     */
    public Output</* @Nullable */ Integer> getMaxAggregationInterval() {
        return this.maxAggregationInterval;
    }
    /**
     * The ID of the subnet, network interface, or VPC for which you want to create a flow log.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of the subnet, network interface, or VPC for which you want to create a flow log.
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * The type of resource for which to create the flow log. For example, if you specified a VPC ID for the ResourceId property, specify VPC for this property.
     * 
     */
    @Export(name="resourceType", type=FlowLogResourceType.class, parameters={})
    private Output<FlowLogResourceType> resourceType;

    /**
     * @return The type of resource for which to create the flow log. For example, if you specified a VPC ID for the ResourceId property, specify VPC for this property.
     * 
     */
    public Output<FlowLogResourceType> getPropResourceType() {
        return this.resourceType;
    }
    /**
     * The tags to apply to the flow logs.
     * 
     */
    @Export(name="tags", type=List.class, parameters={FlowLogTag.class})
    private Output</* @Nullable */ List<FlowLogTag>> tags;

    /**
     * @return The tags to apply to the flow logs.
     * 
     */
    public Output</* @Nullable */ List<FlowLogTag>> getTags() {
        return this.tags;
    }
    /**
     * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * 
     */
    @Export(name="trafficType", type=FlowLogTrafficType.class, parameters={})
    private Output<FlowLogTrafficType> trafficType;

    /**
     * @return The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic.
     * 
     */
    public Output<FlowLogTrafficType> getTrafficType() {
        return this.trafficType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlowLog(String name) {
        this(name, FlowLogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlowLog(String name, FlowLogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlowLog(String name, FlowLogArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:FlowLog", name, args == null ? FlowLogArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlowLog(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:FlowLog", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FlowLog get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FlowLog(name, id, options);
    }
}
