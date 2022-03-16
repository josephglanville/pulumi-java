// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediaconvert;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.mediaconvert.QueueArgs;
import io.pulumi.aws.mediaconvert.inputs.QueueState;
import io.pulumi.aws.mediaconvert.outputs.QueueReservationPlanSettings;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Elemental MediaConvert Queue.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Media Convert Queue can be imported via the queue name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:mediaconvert/queue:Queue test tf-test-queue
 * ```
 * 
 */
@ResourceType(type="aws:mediaconvert/queue:Queue")
public class Queue extends io.pulumi.resources.CustomResource {
    /**
     * The Arn of the queue
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Arn of the queue
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A description of the queue
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the queue
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A unique identifier describing the queue
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique identifier describing the queue
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
     * 
     */
    @Export(name="pricingPlan", type=String.class, parameters={})
    private Output</* @Nullable */ String> pricingPlan;

    /**
     * @return Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
     * 
     */
    public Output</* @Nullable */ String> getPricingPlan() {
        return this.pricingPlan;
    }
    /**
     * A detail pricing plan of the  reserved queue. See below.
     * 
     */
    @Export(name="reservationPlanSettings", type=QueueReservationPlanSettings.class, parameters={})
    private Output<QueueReservationPlanSettings> reservationPlanSettings;

    /**
     * @return A detail pricing plan of the  reserved queue. See below.
     * 
     */
    public Output<QueueReservationPlanSettings> getReservationPlanSettings() {
        return this.reservationPlanSettings;
    }
    /**
     * A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable QueueArgs.Builder a);
    }
    private static io.pulumi.aws.mediaconvert.QueueArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.mediaconvert.QueueArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Queue(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Queue(String name) {
        this(name, QueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Queue(String name, @Nullable QueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Queue(String name, @Nullable QueueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:mediaconvert/queue:Queue", name, args == null ? QueueArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Queue(String name, Output<String> id, @Nullable QueueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:mediaconvert/queue:Queue", name, state, makeResourceOptions(options, id));
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
    public static Queue get(String name, Output<String> id, @Nullable QueueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Queue(name, id, state, options);
    }
}
