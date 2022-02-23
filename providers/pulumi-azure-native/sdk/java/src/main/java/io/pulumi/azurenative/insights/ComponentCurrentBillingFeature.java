// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.ComponentCurrentBillingFeatureArgs;
import io.pulumi.azurenative.insights.outputs.ApplicationInsightsComponentDataVolumeCapResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An Application Insights component billing features
 * API Version: 2015-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:ComponentCurrentBillingFeature myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/currentbillingfeatures 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:ComponentCurrentBillingFeature")
public class ComponentCurrentBillingFeature extends io.pulumi.resources.CustomResource {
    /**
     * Current enabled pricing plan. When the component is in the Enterprise plan, this will list both 'Basic' and 'Application Insights Enterprise'.
     * 
     */
    @OutputExport(name="currentBillingFeatures", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> currentBillingFeatures;

    /**
     * @return Current enabled pricing plan. When the component is in the Enterprise plan, this will list both 'Basic' and 'Application Insights Enterprise'.
     * 
     */
    public Output</* @Nullable */ List<String>> getCurrentBillingFeatures() {
        return this.currentBillingFeatures;
    }
    /**
     * An Application Insights component daily data volume cap
     * 
     */
    @OutputExport(name="dataVolumeCap", type=ApplicationInsightsComponentDataVolumeCapResponse.class, parameters={})
    private Output</* @Nullable */ ApplicationInsightsComponentDataVolumeCapResponse> dataVolumeCap;

    /**
     * @return An Application Insights component daily data volume cap
     * 
     */
    public Output</* @Nullable */ ApplicationInsightsComponentDataVolumeCapResponse> getDataVolumeCap() {
        return this.dataVolumeCap;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ComponentCurrentBillingFeature(String name) {
        this(name, ComponentCurrentBillingFeatureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ComponentCurrentBillingFeature(String name, ComponentCurrentBillingFeatureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ComponentCurrentBillingFeature(String name, ComponentCurrentBillingFeatureArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ComponentCurrentBillingFeature", name, args == null ? ComponentCurrentBillingFeatureArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ComponentCurrentBillingFeature(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ComponentCurrentBillingFeature", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:insights/v20150501:ComponentCurrentBillingFeature").build())
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
    public static ComponentCurrentBillingFeature get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ComponentCurrentBillingFeature(name, id, options);
    }
}
