// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.CustomMetricArgs;
import io.pulumi.awsnative.iot.enums.CustomMetricMetricType;
import io.pulumi.awsnative.iot.outputs.CustomMetricTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A custom metric published by your devices to Device Defender.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iot:CustomMetric")
public class CustomMetric extends io.pulumi.resources.CustomResource {
    /**
     * Field represents a friendly name in the console for the custom metric; it doesn't have to be unique. Don't use this name as the metric identifier in the device metric report. Can be updated once defined.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Field represents a friendly name in the console for the custom metric; it doesn't have to be unique. Don't use this name as the metric identifier in the device metric report. Can be updated once defined.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The Amazon Resource Number (ARN) of the custom metric.
     * 
     */
    @OutputExport(name="metricArn", type=String.class, parameters={})
    private Output<String> metricArn;

    /**
     * @return The Amazon Resource Number (ARN) of the custom metric.
     * 
     */
    public Output<String> getMetricArn() {
        return this.metricArn;
    }
    /**
     * The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn't begin with aws: . Cannot be updated once defined.
     * 
     */
    @OutputExport(name="metricName", type=String.class, parameters={})
    private Output</* @Nullable */ String> metricName;

    /**
     * @return The name of the custom metric. This will be used in the metric report submitted from the device/thing. Shouldn't begin with aws: . Cannot be updated once defined.
     * 
     */
    public Output</* @Nullable */ String> getMetricName() {
        return this.metricName;
    }
    /**
     * The type of the custom metric. Types include string-list, ip-address-list, number-list, and number.
     * 
     */
    @OutputExport(name="metricType", type=CustomMetricMetricType.class, parameters={})
    private Output<CustomMetricMetricType> metricType;

    /**
     * @return The type of the custom metric. Types include string-list, ip-address-list, number-list, and number.
     * 
     */
    public Output<CustomMetricMetricType> getMetricType() {
        return this.metricType;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={CustomMetricTag.class})
    private Output</* @Nullable */ List<CustomMetricTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<CustomMetricTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomMetric(String name) {
        this(name, CustomMetricArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomMetric(String name, CustomMetricArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomMetric(String name, CustomMetricArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:CustomMetric", name, args == null ? CustomMetricArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CustomMetric(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:CustomMetric", name, null, makeResourceOptions(options, id));
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
    public static CustomMetric get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomMetric(name, id, options);
    }
}
