// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.batch.JobDefinitionArgs;
import io.pulumi.aws.batch.inputs.JobDefinitionState;
import io.pulumi.aws.batch.outputs.JobDefinitionRetryStrategy;
import io.pulumi.aws.batch.outputs.JobDefinitionTimeout;
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
 * Provides a Batch Job Definition resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Batch Job Definition can be imported using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:batch/jobDefinition:JobDefinition test arn:aws:batch:us-east-1:123456789012:job-definition/sample
 * ```
 * 
 */
@ResourceType(type="aws:batch/jobDefinition:JobDefinition")
public class JobDefinition extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name of the job definition.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name of the job definition.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
     * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
     * 
     */
    @Export(name="containerProperties", type=String.class, parameters={})
    private Output</* @Nullable */ String> containerProperties;

    /**
     * @return A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
     * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
     * 
     */
    public Output</* @Nullable */ String> getContainerProperties() {
        return this.containerProperties;
    }
    /**
     * Specifies the name of the job definition.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the job definition.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the parameter substitution placeholders to set in the job definition.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return Specifies the parameter substitution placeholders to set in the job definition.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getParameters() {
        return this.parameters;
    }
    /**
     * The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
     * 
     */
    @Export(name="platformCapabilities", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> platformCapabilities;

    /**
     * @return The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
     * 
     */
    public Output</* @Nullable */ List<String>> getPlatformCapabilities() {
        return this.platformCapabilities;
    }
    /**
     * Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
     * 
     */
    @Export(name="propagateTags", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> propagateTags;

    /**
     * @return Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getPropagateTags() {
        return this.propagateTags;
    }
    /**
     * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
     * Maximum number of `retry_strategy` is `1`.  Defined below.
     * 
     */
    @Export(name="retryStrategy", type=JobDefinitionRetryStrategy.class, parameters={})
    private Output</* @Nullable */ JobDefinitionRetryStrategy> retryStrategy;

    /**
     * @return Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
     * Maximum number of `retry_strategy` is `1`.  Defined below.
     * 
     */
    public Output</* @Nullable */ JobDefinitionRetryStrategy> getRetryStrategy() {
        return this.retryStrategy;
    }
    /**
     * The revision of the job definition.
     * 
     */
    @Export(name="revision", type=Integer.class, parameters={})
    private Output<Integer> revision;

    /**
     * @return The revision of the job definition.
     * 
     */
    public Output<Integer> getRevision() {
        return this.revision;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    /**
     * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
     * 
     */
    @Export(name="timeout", type=JobDefinitionTimeout.class, parameters={})
    private Output</* @Nullable */ JobDefinitionTimeout> timeout;

    /**
     * @return Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
     * 
     */
    public Output</* @Nullable */ JobDefinitionTimeout> getTimeout() {
        return this.timeout;
    }
    /**
     * The type of job definition.  Must be `container`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of job definition.  Must be `container`.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(JobDefinitionArgs.Builder a);
    }
    private static io.pulumi.aws.batch.JobDefinitionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.batch.JobDefinitionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public JobDefinition(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobDefinition(String name) {
        this(name, JobDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobDefinition(String name, JobDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobDefinition(String name, JobDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:batch/jobDefinition:JobDefinition", name, args == null ? JobDefinitionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private JobDefinition(String name, Output<String> id, @Nullable JobDefinitionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:batch/jobDefinition:JobDefinition", name, state, makeResourceOptions(options, id));
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
    public static JobDefinition get(String name, Output<String> id, @Nullable JobDefinitionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobDefinition(name, id, state, options);
    }
}
