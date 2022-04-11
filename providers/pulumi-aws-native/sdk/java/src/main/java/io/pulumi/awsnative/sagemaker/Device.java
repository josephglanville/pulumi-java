// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.DeviceArgs;
import io.pulumi.awsnative.sagemaker.outputs.DeviceTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::SageMaker::Device
 * 
 */
@ResourceType(type="aws-native:sagemaker:Device")
public class Device extends io.pulumi.resources.CustomResource {
    /**
     * The Edge Device you want to register against a device fleet
     * 
     */
    @Export(name="device", type=io.pulumi.awsnative.sagemaker.outputs.Device.class, parameters={})
    private Output</* @Nullable */ io.pulumi.awsnative.sagemaker.outputs.Device> device;

    /**
     * @return The Edge Device you want to register against a device fleet
     * 
     */
    public Output</* @Nullable */ io.pulumi.awsnative.sagemaker.outputs.Device> getDevice() {
        return this.device;
    }
    /**
     * The name of the edge device fleet
     * 
     */
    @Export(name="deviceFleetName", type=String.class, parameters={})
    private Output<String> deviceFleetName;

    /**
     * @return The name of the edge device fleet
     * 
     */
    public Output<String> getDeviceFleetName() {
        return this.deviceFleetName;
    }
    /**
     * Associate tags with the resource
     * 
     */
    @Export(name="tags", type=List.class, parameters={DeviceTag.class})
    private Output</* @Nullable */ List<DeviceTag>> tags;

    /**
     * @return Associate tags with the resource
     * 
     */
    public Output</* @Nullable */ List<DeviceTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Device(String name) {
        this(name, DeviceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Device(String name, DeviceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Device(String name, DeviceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:Device", name, args == null ? DeviceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Device(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:Device", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Device get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Device(name, id, options);
    }
}
