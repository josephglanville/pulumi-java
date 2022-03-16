// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.EdgeModuleArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The representation of an edge module.
 * API Version: 2021-05-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:videoanalyzer:EdgeModule edgeModule1 /subscriptions/591e76c3-3e97-44db-879c-3e2b12961b62/resourceGroups/testrg/providers/Microsoft.Media/videoAnalyzers/testaccount2/edgeModules/edgeModule1 
 * ```
 * 
 */
@ResourceType(type="azure-native:videoanalyzer:EdgeModule")
public class EdgeModule extends io.pulumi.resources.CustomResource {
    /**
     * Internal ID generated for the instance of the Video Analyzer edge module.
     * 
     */
    @Export(name="edgeModuleId", type=String.class, parameters={})
    private Output<String> edgeModuleId;

    /**
     * @return Internal ID generated for the instance of the Video Analyzer edge module.
     * 
     */
    public Output<String> getEdgeModuleId() {
        return this.edgeModuleId;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(EdgeModuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.videoanalyzer.EdgeModuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.videoanalyzer.EdgeModuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EdgeModule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EdgeModule(String name) {
        this(name, EdgeModuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EdgeModule(String name, EdgeModuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EdgeModule(String name, EdgeModuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:EdgeModule", name, args == null ? EdgeModuleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private EdgeModule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:EdgeModule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:videoanalyzer/v20210501preview:EdgeModule").build()),
                Output.of(Alias.builder().type("azure-native:videoanalyzer/v20211101preview:EdgeModule").build())
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
    public static EdgeModule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EdgeModule(name, id, options);
    }
}
