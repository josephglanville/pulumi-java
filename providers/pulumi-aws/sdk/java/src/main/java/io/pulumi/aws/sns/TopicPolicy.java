// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sns;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sns.TopicPolicyArgs;
import io.pulumi.aws.sns.inputs.TopicPolicyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SNS topic policy resource
 * 
 * > **NOTE:** If a Principal is specified as just an AWS account ID rather than an ARN, AWS silently converts it to the ARN for the root user, causing future deployments to differ. To avoid this problem, just specify the full ARN, e.g. `arn:aws:iam::123456789012:root`
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SNS Topic Policy can be imported using the topic ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sns/topicPolicy:TopicPolicy user_updates arn:aws:sns:us-west-2:0123456789012:my-topic
 * ```
 * 
 */
@ResourceType(type="aws:sns/topicPolicy:TopicPolicy")
public class TopicPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the SNS topic
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the SNS topic
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The AWS Account ID of the SNS topic owner
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return The AWS Account ID of the SNS topic owner
     * 
     */
    public Output<String> getOwner() {
        return this.owner;
    }
    /**
     * The fully-formed AWS policy as JSON.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return The fully-formed AWS policy as JSON.
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }

    public interface BuilderApplicator {
        public void apply(TopicPolicyArgs.Builder a);
    }
    private static io.pulumi.aws.sns.TopicPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.sns.TopicPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TopicPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TopicPolicy(String name) {
        this(name, TopicPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TopicPolicy(String name, TopicPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TopicPolicy(String name, TopicPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/topicPolicy:TopicPolicy", name, args == null ? TopicPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TopicPolicy(String name, Output<String> id, @Nullable TopicPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/topicPolicy:TopicPolicy", name, state, makeResourceOptions(options, id));
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
    public static TopicPolicy get(String name, Output<String> id, @Nullable TopicPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TopicPolicy(name, id, state, options);
    }
}
