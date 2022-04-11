// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.CostAllocationRuleArgs;
import io.pulumi.azurenative.costmanagement.outputs.CostAllocationRulePropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The cost allocation rule model definition
 * API Version: 2020-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:costmanagement:CostAllocationRule testRule providers/Microsoft.Billing/billingAccounts/100/providers/Microsoft.CostManagement/costAllocationRules/testRule 
 * ```
 * 
 */
@ResourceType(type="azure-native:costmanagement:CostAllocationRule")
public class CostAllocationRule extends io.pulumi.resources.CustomResource {
    /**
     * Name of the rule. This is a read only value.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the rule. This is a read only value.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Cost allocation rule properties
     * 
     */
    @Export(name="properties", type=CostAllocationRulePropertiesResponse.class, parameters={})
    private Output<CostAllocationRulePropertiesResponse> properties;

    /**
     * @return Cost allocation rule properties
     * 
     */
    public Output<CostAllocationRulePropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Resource type of the rule. This is a read only value of Microsoft.CostManagement/CostAllocationRule.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type of the rule. This is a read only value of Microsoft.CostManagement/CostAllocationRule.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CostAllocationRule(String name) {
        this(name, CostAllocationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CostAllocationRule(String name, CostAllocationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CostAllocationRule(String name, CostAllocationRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:CostAllocationRule", name, args == null ? CostAllocationRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CostAllocationRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:CostAllocationRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:costmanagement/v20200301preview:CostAllocationRule").build())
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
    public static CostAllocationRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CostAllocationRule(name, id, options);
    }
}
