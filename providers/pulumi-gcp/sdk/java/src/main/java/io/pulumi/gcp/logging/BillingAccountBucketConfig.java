// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.logging.BillingAccountBucketConfigArgs;
import io.pulumi.gcp.logging.inputs.BillingAccountBucketConfigState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a billing account level logging bucket config. For more information see
 * [the official logging documentation](https://cloud.google.com/logging/docs/) and
 * [Storing Logs](https://cloud.google.com/logging/docs/storage).
 * 
 * > **Note:** Logging buckets are automatically created for a given folder, project, organization, billingAccount and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These buckets cannot be removed so deleting this resource will remove the bucket config from your state but will leave the logging bucket unchanged. The buckets that are currently automatically created are "_Default" and "_Required".
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource can be imported using the following format
 * 
 * ```sh
 *  $ pulumi import gcp:logging/billingAccountBucketConfig:BillingAccountBucketConfig default billingAccounts/{{billingAccount}}/locations/{{location}}/buckets/{{bucket_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:logging/billingAccountBucketConfig:BillingAccountBucketConfig")
public class BillingAccountBucketConfig extends io.pulumi.resources.CustomResource {
    /**
     * The parent resource that contains the logging bucket.
     * 
     */
    @Export(name="billingAccount", type=String.class, parameters={})
    private Output<String> billingAccount;

    /**
     * @return The parent resource that contains the logging bucket.
     * 
     */
    public Output<String> getBillingAccount() {
        return this.billingAccount;
    }
    /**
     * The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
     * 
     */
    @Export(name="bucketId", type=String.class, parameters={})
    private Output<String> bucketId;

    /**
     * @return The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
     * 
     */
    public Output<String> getBucketId() {
        return this.bucketId;
    }
    /**
     * Describes this bucket.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Describes this bucket.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The bucket's lifecycle such as active or deleted. See [LifecycleState](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.buckets#LogBucket.LifecycleState).
     * 
     */
    @Export(name="lifecycleState", type=String.class, parameters={})
    private Output<String> lifecycleState;

    /**
     * @return The bucket's lifecycle such as active or deleted. See [LifecycleState](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.buckets#LogBucket.LifecycleState).
     * 
     */
    public Output<String> getLifecycleState() {
        return this.lifecycleState;
    }
    /**
     * The location of the bucket.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the bucket.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The resource name of the bucket. For example: "projects/my-project-id/locations/my-location/buckets/my-bucket-id"
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the bucket. For example: "projects/my-project-id/locations/my-location/buckets/my-bucket-id"
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used. Bucket retention can not be increased on buckets outside of projects.
     * 
     */
    @Export(name="retentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionDays;

    /**
     * @return Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used. Bucket retention can not be increased on buckets outside of projects.
     * 
     */
    public Output</* @Nullable */ Integer> getRetentionDays() {
        return this.retentionDays;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BillingAccountBucketConfig(String name) {
        this(name, BillingAccountBucketConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BillingAccountBucketConfig(String name, BillingAccountBucketConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BillingAccountBucketConfig(String name, BillingAccountBucketConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/billingAccountBucketConfig:BillingAccountBucketConfig", name, args == null ? BillingAccountBucketConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BillingAccountBucketConfig(String name, Output<String> id, @Nullable BillingAccountBucketConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/billingAccountBucketConfig:BillingAccountBucketConfig", name, state, makeResourceOptions(options, id));
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
    public static BillingAccountBucketConfig get(String name, Output<String> id, @Nullable BillingAccountBucketConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BillingAccountBucketConfig(name, id, state, options);
    }
}
