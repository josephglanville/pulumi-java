// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3.BucketMetricArgs;
import io.pulumi.aws.s3.inputs.BucketMetricState;
import io.pulumi.aws.s3.outputs.BucketMetricFilter;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a S3 bucket [metrics configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html) resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * S3 bucket metric configurations can be imported using `bucket:metric`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketMetric:BucketMetric my-bucket-entire-bucket my-bucket:EntireBucket
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketMetric:BucketMetric")
public class BucketMetric extends io.pulumi.resources.CustomResource {
    /**
     * The name of the bucket to put metric configuration.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket to put metric configuration.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * 
     */
    @Export(name="filter", type=BucketMetricFilter.class, parameters={})
    private Output</* @Nullable */ BucketMetricFilter> filter;

    /**
     * @return [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * 
     */
    public Output</* @Nullable */ BucketMetricFilter> getFilter() {
        return this.filter;
    }
    /**
     * Unique identifier of the metrics configuration for the bucket.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique identifier of the metrics configuration for the bucket.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketMetric(String name) {
        this(name, BucketMetricArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketMetric(String name, BucketMetricArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketMetric(String name, BucketMetricArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketMetric:BucketMetric", name, args == null ? BucketMetricArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private BucketMetric(String name, Output<String> id, @Nullable BucketMetricState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketMetric:BucketMetric", name, state, makeResourceOptions(options, id));
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
    public static BucketMetric get(String name, Output<String> id, @Nullable BucketMetricState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketMetric(name, id, state, options);
    }
}