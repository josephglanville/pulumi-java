// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearning.CommitmentPlanArgs;
import io.pulumi.azurenative.machinelearning.outputs.CommitmentPlanPropertiesResponse;
import io.pulumi.azurenative.machinelearning.outputs.ResourceSkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An Azure ML commitment plan resource.
 * API Version: 2016-05-01-preview.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:machinelearning:CommitmentPlan myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.MachineLearning/commitmentPlans/{commitmentPlanName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearning:CommitmentPlan")
public class CommitmentPlan extends io.pulumi.resources.CustomResource {
    /**
     * An entity tag used to enforce optimistic concurrency.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return An entity tag used to enforce optimistic concurrency.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The commitment plan properties.
     * 
     */
    @OutputExport(name="properties", type=CommitmentPlanPropertiesResponse.class, parameters={})
    private Output<CommitmentPlanPropertiesResponse> properties;

    /**
     * @return The commitment plan properties.
     * 
     */
    public Output<CommitmentPlanPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The commitment plan SKU.
     * 
     */
    @OutputExport(name="sku", type=ResourceSkuResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSkuResponse> sku;

    /**
     * @return The commitment plan SKU.
     * 
     */
    public Output</* @Nullable */ ResourceSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * User-defined tags for the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return User-defined tags for the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CommitmentPlan(String name) {
        this(name, CommitmentPlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CommitmentPlan(String name, CommitmentPlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CommitmentPlan(String name, CommitmentPlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearning:CommitmentPlan", name, args == null ? CommitmentPlanArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CommitmentPlan(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearning:CommitmentPlan", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:machinelearning/v20160501preview:CommitmentPlan").build())
            ))
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
    public static CommitmentPlan get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CommitmentPlan(name, id, options);
    }
}
