// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.groundstation.DataflowEndpointGroupArgs;
import io.pulumi.awsnative.groundstation.outputs.DataflowEndpointGroupEndpointDetails;
import io.pulumi.awsnative.groundstation.outputs.DataflowEndpointGroupTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * AWS Ground Station DataflowEndpointGroup schema for CloudFormation
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:groundstation:DataflowEndpointGroup")
public class DataflowEndpointGroup extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="endpointDetails", type=List.class, parameters={DataflowEndpointGroupEndpointDetails.class})
    private Output<List<DataflowEndpointGroupEndpointDetails>> endpointDetails;

    public Output<List<DataflowEndpointGroupEndpointDetails>> getEndpointDetails() {
        return this.endpointDetails;
    }
    @Export(name="tags", type=List.class, parameters={DataflowEndpointGroupTag.class})
    private Output</* @Nullable */ List<DataflowEndpointGroupTag>> tags;

    public Output</* @Nullable */ List<DataflowEndpointGroupTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataflowEndpointGroup(String name) {
        this(name, DataflowEndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataflowEndpointGroup(String name, DataflowEndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataflowEndpointGroup(String name, DataflowEndpointGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:groundstation:DataflowEndpointGroup", name, args == null ? DataflowEndpointGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataflowEndpointGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:groundstation:DataflowEndpointGroup", name, null, makeResourceOptions(options, id));
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
    public static DataflowEndpointGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataflowEndpointGroup(name, id, options);
    }
}
