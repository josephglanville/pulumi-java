// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.autoscaling.ScheduleArgs;
import io.pulumi.aws.autoscaling.inputs.ScheduleState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AutoScaling Schedule resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AutoScaling ScheduledAction can be imported using the `auto-scaling-group-name` and `scheduled-action-name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:autoscaling/schedule:Schedule resource-name auto-scaling-group-name/scheduled-action-name
 * ```
 * 
 */
@ResourceType(type="aws:autoscaling/schedule:Schedule")
public class Schedule extends io.pulumi.resources.CustomResource {
    /**
     * The ARN assigned by AWS to the autoscaling schedule.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN assigned by AWS to the autoscaling schedule.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * 
     */
    @Export(name="autoscalingGroupName", type=String.class, parameters={})
    private Output<String> autoscalingGroupName;

    /**
     * @return The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * 
     */
    public Output<String> getAutoscalingGroupName() {
        return this.autoscalingGroupName;
    }
    /**
     * The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don't want to change the desired capacity at the scheduled time.
     * 
     */
    @Export(name="desiredCapacity", type=Integer.class, parameters={})
    private Output<Integer> desiredCapacity;

    /**
     * @return The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don't want to change the desired capacity at the scheduled time.
     * 
     */
    public Output<Integer> getDesiredCapacity() {
        return this.desiredCapacity;
    }
    /**
     * The time for this action to end, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
     * If you try to schedule your action in the past, Auto Scaling returns an error message.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The time for this action to end, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
     * If you try to schedule your action in the past, Auto Scaling returns an error message.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * The maximum size for the Auto Scaling group. Default 0.
     * Set to -1 if you don't want to change the maximum size at the scheduled time.
     * 
     */
    @Export(name="maxSize", type=Integer.class, parameters={})
    private Output<Integer> maxSize;

    /**
     * @return The maximum size for the Auto Scaling group. Default 0.
     * Set to -1 if you don't want to change the maximum size at the scheduled time.
     * 
     */
    public Output<Integer> getMaxSize() {
        return this.maxSize;
    }
    /**
     * The minimum size for the Auto Scaling group. Default 0.
     * Set to -1 if you don't want to change the minimum size at the scheduled time.
     * 
     */
    @Export(name="minSize", type=Integer.class, parameters={})
    private Output<Integer> minSize;

    /**
     * @return The minimum size for the Auto Scaling group. Default 0.
     * Set to -1 if you don't want to change the minimum size at the scheduled time.
     * 
     */
    public Output<Integer> getMinSize() {
        return this.minSize;
    }
    /**
     * The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
     * 
     */
    @Export(name="recurrence", type=String.class, parameters={})
    private Output<String> recurrence;

    /**
     * @return The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
     * 
     */
    public Output<String> getRecurrence() {
        return this.recurrence;
    }
    /**
     * The name of this scaling action.
     * 
     */
    @Export(name="scheduledActionName", type=String.class, parameters={})
    private Output<String> scheduledActionName;

    /**
     * @return The name of this scaling action.
     * 
     */
    public Output<String> getScheduledActionName() {
        return this.scheduledActionName;
    }
    /**
     * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
     * If you try to schedule your action in the past, Auto Scaling returns an error message.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
     * If you try to schedule your action in the past, Auto Scaling returns an error message.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * The timezone for the cron expression. Valid values are the canonical names of the IANA time zones (such as Etc/GMT+9 or Pacific/Tahiti).
     * 
     */
    @Export(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return The timezone for the cron expression. Valid values are the canonical names of the IANA time zones (such as Etc/GMT+9 or Pacific/Tahiti).
     * 
     */
    public Output<String> getTimeZone() {
        return this.timeZone;
    }

    public interface BuilderApplicator {
        public void apply(ScheduleArgs.Builder a);
    }
    private static io.pulumi.aws.autoscaling.ScheduleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.autoscaling.ScheduleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Schedule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schedule(String name) {
        this(name, ScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schedule(String name, ScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schedule(String name, ScheduleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/schedule:Schedule", name, args == null ? ScheduleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Schedule(String name, Output<String> id, @Nullable ScheduleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/schedule:Schedule", name, state, makeResourceOptions(options, id));
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
    public static Schedule get(String name, Output<String> id, @Nullable ScheduleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Schedule(name, id, state, options);
    }
}
