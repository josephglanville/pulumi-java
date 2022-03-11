// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigateway.UsagePlanArgs;
import io.pulumi.aws.apigateway.inputs.UsagePlanState;
import io.pulumi.aws.apigateway.outputs.UsagePlanApiStage;
import io.pulumi.aws.apigateway.outputs.UsagePlanQuotaSettings;
import io.pulumi.aws.apigateway.outputs.UsagePlanThrottleSettings;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an API Gateway Usage Plan.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AWS API Gateway Usage Plan can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/usagePlan:UsagePlan myusageplan <usage_plan_id>
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/usagePlan:UsagePlan")
public class UsagePlan extends io.pulumi.resources.CustomResource {
    /**
     * The associated API stages of the usage plan.
     * 
     */
    @OutputExport(name="apiStages", type=List.class, parameters={UsagePlanApiStage.class})
    private Output</* @Nullable */ List<UsagePlanApiStage>> apiStages;

    /**
     * @return The associated API stages of the usage plan.
     * 
     */
    public Output</* @Nullable */ List<UsagePlanApiStage>> getApiStages() {
        return this.apiStages;
    }
    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN)
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of a usage plan.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of a usage plan.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the usage plan.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the usage plan.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * 
     */
    @OutputExport(name="productCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> productCode;

    /**
     * @return The AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * 
     */
    public Output</* @Nullable */ String> getProductCode() {
        return this.productCode;
    }
    /**
     * The quota settings of the usage plan.
     * 
     */
    @OutputExport(name="quotaSettings", type=UsagePlanQuotaSettings.class, parameters={})
    private Output</* @Nullable */ UsagePlanQuotaSettings> quotaSettings;

    /**
     * @return The quota settings of the usage plan.
     * 
     */
    public Output</* @Nullable */ UsagePlanQuotaSettings> getQuotaSettings() {
        return this.quotaSettings;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
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
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The throttling limits of the usage plan.
     * 
     */
    @OutputExport(name="throttleSettings", type=UsagePlanThrottleSettings.class, parameters={})
    private Output</* @Nullable */ UsagePlanThrottleSettings> throttleSettings;

    /**
     * @return The throttling limits of the usage plan.
     * 
     */
    public Output</* @Nullable */ UsagePlanThrottleSettings> getThrottleSettings() {
        return this.throttleSettings;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable UsagePlanArgs.Builder a);
    }
    private static io.pulumi.aws.apigateway.UsagePlanArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.apigateway.UsagePlanArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public UsagePlan(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UsagePlan(String name) {
        this(name, UsagePlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UsagePlan(String name, @Nullable UsagePlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UsagePlan(String name, @Nullable UsagePlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/usagePlan:UsagePlan", name, args == null ? UsagePlanArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private UsagePlan(String name, Output<String> id, @Nullable UsagePlanState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/usagePlan:UsagePlan", name, state, makeResourceOptions(options, id));
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
    public static UsagePlan get(String name, Output<String> id, @Nullable UsagePlanState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UsagePlan(name, id, state, options);
    }
}
