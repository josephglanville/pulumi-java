// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.securityhub.FindingAggregatorArgs;
import io.pulumi.aws.securityhub.inputs.FindingAggregatorState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Security Hub finding aggregator. Security Hub needs to be enabled in a region in order for the aggregator to pull through findings.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing Security Hub finding aggregator can be imported using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:securityhub/findingAggregator:FindingAggregator example arn:aws:securityhub:eu-west-1:123456789098:finding-aggregator/abcd1234-abcd-1234-1234-abcdef123456
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/findingAggregator:FindingAggregator")
public class FindingAggregator extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether to aggregate findings from all of the available Regions or from a specified list. The options are `ALL_REGIONS`, `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`. When `ALL_REGIONS` or `ALL_REGIONS_EXCEPT_SPECIFIED` are used, Security Hub will automatically aggregate findings from new Regions as Security Hub supports them and you opt into them.
     * 
     */
    @Export(name="linkingMode", type=String.class, parameters={})
    private Output<String> linkingMode;

    /**
     * @return Indicates whether to aggregate findings from all of the available Regions or from a specified list. The options are `ALL_REGIONS`, `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`. When `ALL_REGIONS` or `ALL_REGIONS_EXCEPT_SPECIFIED` are used, Security Hub will automatically aggregate findings from new Regions as Security Hub supports them and you opt into them.
     * 
     */
    public Output<String> getLinkingMode() {
        return this.linkingMode;
    }
    /**
     * List of regions to include or exclude (required if `linking_mode` is set to `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`)
     * 
     */
    @Export(name="specifiedRegions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> specifiedRegions;

    /**
     * @return List of regions to include or exclude (required if `linking_mode` is set to `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`)
     * 
     */
    public Output</* @Nullable */ List<String>> getSpecifiedRegions() {
        return this.specifiedRegions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FindingAggregator(String name) {
        this(name, FindingAggregatorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FindingAggregator(String name, FindingAggregatorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FindingAggregator(String name, FindingAggregatorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/findingAggregator:FindingAggregator", name, args == null ? FindingAggregatorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FindingAggregator(String name, Output<String> id, @Nullable FindingAggregatorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/findingAggregator:FindingAggregator", name, state, makeResourceOptions(options, id));
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
    public static FindingAggregator get(String name, Output<String> id, @Nullable FindingAggregatorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FindingAggregator(name, id, state, options);
    }
}
