// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.DimensionArgs;
import io.pulumi.awsnative.iot.enums.DimensionType;
import io.pulumi.awsnative.iot.outputs.DimensionTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A dimension can be used to limit the scope of a metric used in a security profile for AWS IoT Device Defender.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iot:Dimension")
public class Dimension extends io.pulumi.resources.CustomResource {
    /**
     * The ARN (Amazon resource name) of the created dimension.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN (Amazon resource name) of the created dimension.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A unique identifier for the dimension.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return A unique identifier for the dimension.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Specifies the value or list of values for the dimension.
     * 
     */
    @OutputExport(name="stringValues", type=List.class, parameters={String.class})
    private Output<List<String>> stringValues;

    /**
     * @return Specifies the value or list of values for the dimension.
     * 
     */
    public Output<List<String>> getStringValues() {
        return this.stringValues;
    }
    /**
     * Metadata that can be used to manage the dimension.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={DimensionTag.class})
    private Output</* @Nullable */ List<DimensionTag>> tags;

    /**
     * @return Metadata that can be used to manage the dimension.
     * 
     */
    public Output</* @Nullable */ List<DimensionTag>> getTags() {
        return this.tags;
    }
    /**
     * Specifies the type of the dimension.
     * 
     */
    @OutputExport(name="type", type=DimensionType.class, parameters={})
    private Output<DimensionType> type;

    /**
     * @return Specifies the type of the dimension.
     * 
     */
    public Output<DimensionType> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dimension(String name) {
        this(name, DimensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dimension(String name, DimensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dimension(String name, DimensionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:Dimension", name, args == null ? DimensionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Dimension(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:Dimension", name, null, makeResourceOptions(options, id));
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
    public static Dimension get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Dimension(name, id, options);
    }
}
