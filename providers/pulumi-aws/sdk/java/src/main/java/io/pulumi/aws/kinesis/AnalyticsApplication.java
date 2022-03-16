// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kinesis.AnalyticsApplicationArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationState;
import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationCloudwatchLoggingOptions;
import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationInputs;
import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationOutput;
import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSources;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Kinesis Analytics Application resource. Kinesis Analytics is a managed service that
 * allows processing and analyzing streaming data using standard SQL.
 * 
 * For more details, see the [Amazon Kinesis Analytics Documentation](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/what-is.html).
 * 
 * > **Note:** To manage Amazon Kinesis Data Analytics for Apache Flink applications, use the `aws.kinesisanalyticsv2.Application` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Kinesis Analytics Application can be imported by using ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kinesis/analyticsApplication:AnalyticsApplication example arn:aws:kinesisanalytics:us-west-2:1234567890:application/example
 * ```
 * 
 */
@ResourceType(type="aws:kinesis/analyticsApplication:AnalyticsApplication")
public class AnalyticsApplication extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Kinesis Analytics Appliation.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Kinesis Analytics Appliation.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The CloudWatch log stream options to monitor application errors.
     * See CloudWatch Logging Options below for more details.
     * 
     */
    @Export(name="cloudwatchLoggingOptions", type=AnalyticsApplicationCloudwatchLoggingOptions.class, parameters={})
    private Output</* @Nullable */ AnalyticsApplicationCloudwatchLoggingOptions> cloudwatchLoggingOptions;

    /**
     * @return The CloudWatch log stream options to monitor application errors.
     * See CloudWatch Logging Options below for more details.
     * 
     */
    public Output</* @Nullable */ AnalyticsApplicationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return this.cloudwatchLoggingOptions;
    }
    /**
     * SQL Code to transform input data, and generate output.
     * 
     */
    @Export(name="code", type=String.class, parameters={})
    private Output</* @Nullable */ String> code;

    /**
     * @return SQL Code to transform input data, and generate output.
     * 
     */
    public Output</* @Nullable */ String> getCode() {
        return this.code;
    }
    /**
     * The Timestamp when the application version was created.
     * 
     */
    @Export(name="createTimestamp", type=String.class, parameters={})
    private Output<String> createTimestamp;

    /**
     * @return The Timestamp when the application version was created.
     * 
     */
    public Output<String> getCreateTimestamp() {
        return this.createTimestamp;
    }
    /**
     * Description of the application.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the application.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Input configuration of the application. See Inputs below for more details.
     * 
     */
    @Export(name="inputs", type=AnalyticsApplicationInputs.class, parameters={})
    private Output</* @Nullable */ AnalyticsApplicationInputs> inputs;

    /**
     * @return Input configuration of the application. See Inputs below for more details.
     * 
     */
    public Output</* @Nullable */ AnalyticsApplicationInputs> getInputs() {
        return this.inputs;
    }
    /**
     * The Timestamp when the application was last updated.
     * 
     */
    @Export(name="lastUpdateTimestamp", type=String.class, parameters={})
    private Output<String> lastUpdateTimestamp;

    /**
     * @return The Timestamp when the application was last updated.
     * 
     */
    public Output<String> getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }
    /**
     * Name of the Kinesis Analytics Application.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Kinesis Analytics Application.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Output destination configuration of the application. See Outputs below for more details.
     * 
     */
    @Export(name="outputs", type=List.class, parameters={AnalyticsApplicationOutput.class})
    private Output</* @Nullable */ List<AnalyticsApplicationOutput>> outputs;

    /**
     * @return Output destination configuration of the application. See Outputs below for more details.
     * 
     */
    public Output</* @Nullable */ List<AnalyticsApplicationOutput>> getOutputs() {
        return this.outputs;
    }
    /**
     * An S3 Reference Data Source for the application.
     * See Reference Data Sources below for more details.
     * 
     */
    @Export(name="referenceDataSources", type=AnalyticsApplicationReferenceDataSources.class, parameters={})
    private Output</* @Nullable */ AnalyticsApplicationReferenceDataSources> referenceDataSources;

    /**
     * @return An S3 Reference Data Source for the application.
     * See Reference Data Sources below for more details.
     * 
     */
    public Output</* @Nullable */ AnalyticsApplicationReferenceDataSources> getReferenceDataSources() {
        return this.referenceDataSources;
    }
    /**
     * Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `starting_position` must be configured.
     * To modify an application's starting position, first stop the application by setting `start_application = false`, then update `starting_position` and set `start_application = true`.
     * 
     */
    @Export(name="startApplication", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> startApplication;

    /**
     * @return Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `starting_position` must be configured.
     * To modify an application's starting position, first stop the application by setting `start_application = false`, then update `starting_position` and set `start_application = true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getStartApplication() {
        return this.startApplication;
    }
    /**
     * The Status of the application.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The Status of the application.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The Version of the application.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return The Version of the application.
     * 
     */
    public Output<Integer> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable AnalyticsApplicationArgs.Builder a);
    }
    private static io.pulumi.aws.kinesis.AnalyticsApplicationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.kinesis.AnalyticsApplicationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AnalyticsApplication(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AnalyticsApplication(String name) {
        this(name, AnalyticsApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AnalyticsApplication(String name, @Nullable AnalyticsApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AnalyticsApplication(String name, @Nullable AnalyticsApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/analyticsApplication:AnalyticsApplication", name, args == null ? AnalyticsApplicationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AnalyticsApplication(String name, Output<String> id, @Nullable AnalyticsApplicationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/analyticsApplication:AnalyticsApplication", name, state, makeResourceOptions(options, id));
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
    public static AnalyticsApplication get(String name, Output<String> id, @Nullable AnalyticsApplicationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AnalyticsApplication(name, id, state, options);
    }
}
