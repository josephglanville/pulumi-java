// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.SpotFleetArgs;
import io.pulumi.awsnative.ec2.outputs.SpotFleetRequestConfigData;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EC2::SpotFleet
 * 
 */
@ResourceType(type="aws-native:ec2:SpotFleet")
public class SpotFleet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="spotFleetRequestConfigData", type=SpotFleetRequestConfigData.class, parameters={})
    private Output<SpotFleetRequestConfigData> spotFleetRequestConfigData;

    public Output<SpotFleetRequestConfigData> getSpotFleetRequestConfigData() {
        return this.spotFleetRequestConfigData;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpotFleet(String name) {
        this(name, SpotFleetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpotFleet(String name, SpotFleetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpotFleet(String name, SpotFleetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:SpotFleet", name, args == null ? SpotFleetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SpotFleet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:SpotFleet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SpotFleet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SpotFleet(name, id, options);
    }
}
