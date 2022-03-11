// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotevents.InputArgs;
import io.pulumi.awsnative.iotevents.outputs.InputDefinition;
import io.pulumi.awsnative.iotevents.outputs.InputTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::IoTEvents::Input resource creates an input. To monitor your devices and processes, they must have a way to get telemetry data into AWS IoT Events. This is done by sending messages as *inputs* to AWS IoT Events. For more information, see [How to Use AWS IoT Events](https://docs.aws.amazon.com/iotevents/latest/developerguide/how-to-use-iotevents.html) in the *AWS IoT Events Developer Guide*.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iotevents:Input")
public class Input extends io.pulumi.resources.CustomResource {
    @OutputExport(name="inputDefinition", type=InputDefinition.class, parameters={})
    private Output<InputDefinition> inputDefinition;

    public Output<InputDefinition> getInputDefinition() {
        return this.inputDefinition;
    }
    /**
     * A brief description of the input.
     * 
     */
    @OutputExport(name="inputDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> inputDescription;

    /**
     * @return A brief description of the input.
     * 
     */
    public Output</* @Nullable */ String> getInputDescription() {
        return this.inputDescription;
    }
    /**
     * The name of the input.
     * 
     */
    @OutputExport(name="inputName", type=String.class, parameters={})
    private Output</* @Nullable */ String> inputName;

    /**
     * @return The name of the input.
     * 
     */
    public Output</* @Nullable */ String> getInputName() {
        return this.inputName;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={InputTag.class})
    private Output</* @Nullable */ List<InputTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    public Output</* @Nullable */ List<InputTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(InputArgs.Builder a);
    }
    private static io.pulumi.awsnative.iotevents.InputArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.iotevents.InputArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Input(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Input(String name) {
        this(name, InputArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Input(String name, InputArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Input(String name, InputArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotevents:Input", name, args == null ? InputArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Input(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotevents:Input", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Input get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Input(name, id, options);
    }
}
