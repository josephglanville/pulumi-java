// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.LinkedServiceArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.LinkedServicePropsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Linked service.
 * API Version: 2020-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:machinelearningservices:LinkedService link-1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1/providers/Microsoft.MachineLearningServices/workspaces/workspace-1/linkedServices/link-1 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearningservices:LinkedService")
public class LinkedService extends io.pulumi.resources.CustomResource {
    /**
     * Identity for the resource.
     * 
     */
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * location of the linked service.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return location of the linked service.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Friendly name of the linked service.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Friendly name of the linked service.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * LinkedService specific properties.
     * 
     */
    @OutputExport(name="properties", type=LinkedServicePropsResponse.class, parameters={})
    private Output<LinkedServicePropsResponse> properties;

    /**
     * @return LinkedService specific properties.
     * 
     */
    public Output<LinkedServicePropsResponse> getProperties() {
        return this.properties;
    }
    /**
     * Resource type of linked service.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type of linked service.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(LinkedServiceArgs.Builder a);
    }
    private static io.pulumi.azurenative.machinelearningservices.LinkedServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.machinelearningservices.LinkedServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LinkedService(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedService(String name) {
        this(name, LinkedServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedService(String name, LinkedServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedService(String name, LinkedServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:LinkedService", name, args == null ? LinkedServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LinkedService(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:LinkedService", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:machinelearningservices/v20200901preview:LinkedService").build())
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
    public static LinkedService get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LinkedService(name, id, options);
    }
}
