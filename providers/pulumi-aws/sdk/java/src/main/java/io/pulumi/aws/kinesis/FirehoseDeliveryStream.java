// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamState;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamElasticsearchConfiguration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3Configuration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamHttpEndpointConfiguration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamKinesisSourceConfiguration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamRedshiftConfiguration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamS3Configuration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamServerSideEncryption;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamSplunkConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Kinesis Firehose Delivery Stream resource. Amazon Kinesis Firehose is a fully managed, elastic service to easily deliver real-time data streams to destinations such as Amazon S3 and Amazon Redshift.
 * 
 * For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Kinesis Firehose Delivery streams can be imported using the stream ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kinesis/firehoseDeliveryStream:FirehoseDeliveryStream foo arn:aws:firehose:us-east-1:XXX:deliverystream/example
 * ```
 * 
 *  NoteImport does not work for stream destination `s3`. Consider using `extended_s3` since `s3` destination is deprecated.
 * 
 */
@ResourceType(type="aws:kinesis/firehoseDeliveryStream:FirehoseDeliveryStream")
public class FirehoseDeliveryStream extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the Stream
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the Stream
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extended_s3` instead), `extended_s3`, `redshift`, `elasticsearch`, `splunk`, and `http_endpoint`.
     * 
     */
    @OutputExport(name="destination", type=String.class, parameters={})
    private Output<String> destination;

    /**
     * @return This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extended_s3` instead), `extended_s3`, `redshift`, `elasticsearch`, `splunk`, and `http_endpoint`.
     * 
     */
    public Output<String> getDestination() {
        return this.destination;
    }
    @OutputExport(name="destinationId", type=String.class, parameters={})
    private Output<String> destinationId;

    public Output<String> getDestinationId() {
        return this.destinationId;
    }
    /**
     * Configuration options if elasticsearch is the destination. More details are given below.
     * 
     */
    @OutputExport(name="elasticsearchConfiguration", type=FirehoseDeliveryStreamElasticsearchConfiguration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamElasticsearchConfiguration> elasticsearchConfiguration;

    /**
     * @return Configuration options if elasticsearch is the destination. More details are given below.
     * 
     */
    public Output</* @Nullable */ FirehoseDeliveryStreamElasticsearchConfiguration> getElasticsearchConfiguration() {
        return this.elasticsearchConfiguration;
    }
    /**
     * Enhanced configuration options for the s3 destination. More details are given below.
     * 
     */
    @OutputExport(name="extendedS3Configuration", type=FirehoseDeliveryStreamExtendedS3Configuration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamExtendedS3Configuration> extendedS3Configuration;

    /**
     * @return Enhanced configuration options for the s3 destination. More details are given below.
     * 
     */
    public Output</* @Nullable */ FirehoseDeliveryStreamExtendedS3Configuration> getExtendedS3Configuration() {
        return this.extendedS3Configuration;
    }
    /**
     * Configuration options if http_endpoint is the destination. requires the user to also specify a `s3_configuration` block.  More details are given below.
     * 
     */
    @OutputExport(name="httpEndpointConfiguration", type=FirehoseDeliveryStreamHttpEndpointConfiguration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamHttpEndpointConfiguration> httpEndpointConfiguration;

    /**
     * @return Configuration options if http_endpoint is the destination. requires the user to also specify a `s3_configuration` block.  More details are given below.
     * 
     */
    public Output</* @Nullable */ FirehoseDeliveryStreamHttpEndpointConfiguration> getHttpEndpointConfiguration() {
        return this.httpEndpointConfiguration;
    }
    /**
     * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
     * 
     */
    @OutputExport(name="kinesisSourceConfiguration", type=FirehoseDeliveryStreamKinesisSourceConfiguration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamKinesisSourceConfiguration> kinesisSourceConfiguration;

    /**
     * @return Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
     * 
     */
    public Output</* @Nullable */ FirehoseDeliveryStreamKinesisSourceConfiguration> getKinesisSourceConfiguration() {
        return this.kinesisSourceConfiguration;
    }
    /**
     * A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configuration options if redshift is the destination.
     * Using `redshift_configuration` requires the user to also specify a
     * `s3_configuration` block. More details are given below.
     * 
     */
    @OutputExport(name="redshiftConfiguration", type=FirehoseDeliveryStreamRedshiftConfiguration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamRedshiftConfiguration> redshiftConfiguration;

    /**
     * @return Configuration options if redshift is the destination.
     * Using `redshift_configuration` requires the user to also specify a
     * `s3_configuration` block. More details are given below.
     * 
     */
    public Output</* @Nullable */ FirehoseDeliveryStreamRedshiftConfiguration> getRedshiftConfiguration() {
        return this.redshiftConfiguration;
    }
    /**
     * Required for non-S3 destinations. For S3 destination, use `extended_s3_configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
     * is redshift). More details are given below.
     * 
     */
    @OutputExport(name="s3Configuration", type=FirehoseDeliveryStreamS3Configuration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamS3Configuration> s3Configuration;

    /**
     * @return Required for non-S3 destinations. For S3 destination, use `extended_s3_configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
     * is redshift). More details are given below.
     * 
     */
    public Output</* @Nullable */ FirehoseDeliveryStreamS3Configuration> getS3Configuration() {
        return this.s3Configuration;
    }
    /**
     * Encrypt at rest options.
     * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
     * 
     */
    @OutputExport(name="serverSideEncryption", type=FirehoseDeliveryStreamServerSideEncryption.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamServerSideEncryption> serverSideEncryption;

    /**
     * @return Encrypt at rest options.
     * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
     * 
     */
    public Output</* @Nullable */ FirehoseDeliveryStreamServerSideEncryption> getServerSideEncryption() {
        return this.serverSideEncryption;
    }
    /**
     * Configuration options if splunk is the destination. More details are given below.
     * 
     */
    @OutputExport(name="splunkConfiguration", type=FirehoseDeliveryStreamSplunkConfiguration.class, parameters={})
    private Output</* @Nullable */ FirehoseDeliveryStreamSplunkConfiguration> splunkConfiguration;

    /**
     * @return Configuration options if splunk is the destination. More details are given below.
     * 
     */
    public Output</* @Nullable */ FirehoseDeliveryStreamSplunkConfiguration> getSplunkConfiguration() {
        return this.splunkConfiguration;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Specifies the table version for the output data schema. Defaults to `LATEST`.
     * 
     */
    @OutputExport(name="versionId", type=String.class, parameters={})
    private Output<String> versionId;

    /**
     * @return Specifies the table version for the output data schema. Defaults to `LATEST`.
     * 
     */
    public Output<String> getVersionId() {
        return this.versionId;
    }

    public interface BuilderApplicator {
        public void apply(FirehoseDeliveryStreamArgs.Builder a);
    }
    private static io.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.kinesis.FirehoseDeliveryStreamArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FirehoseDeliveryStream(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirehoseDeliveryStream(String name) {
        this(name, FirehoseDeliveryStreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirehoseDeliveryStream(String name, FirehoseDeliveryStreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirehoseDeliveryStream(String name, FirehoseDeliveryStreamArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/firehoseDeliveryStream:FirehoseDeliveryStream", name, args == null ? FirehoseDeliveryStreamArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private FirehoseDeliveryStream(String name, Output<String> id, @Nullable FirehoseDeliveryStreamState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/firehoseDeliveryStream:FirehoseDeliveryStream", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FirehoseDeliveryStream get(String name, Output<String> id, @Nullable FirehoseDeliveryStreamState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirehoseDeliveryStream(name, id, state, options);
    }
}
