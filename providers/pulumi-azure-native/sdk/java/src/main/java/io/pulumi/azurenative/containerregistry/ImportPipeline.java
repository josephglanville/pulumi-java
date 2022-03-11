// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.ImportPipelineArgs;
import io.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.ImportPipelineSourcePropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.PipelineTriggerPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An object that represents an import pipeline for a container registry.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerregistry:ImportPipeline myImportPipeline /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/importPipelines/myImportPipeline 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerregistry:ImportPipeline")
public class ImportPipeline extends io.pulumi.resources.CustomResource {
    /**
     * The identity of the import pipeline.
     * 
     */
    @OutputExport(name="identity", type=IdentityPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ IdentityPropertiesResponse> identity;

    /**
     * @return The identity of the import pipeline.
     * 
     */
    public Output</* @Nullable */ IdentityPropertiesResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The location of the import pipeline.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the import pipeline.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The list of all options configured for the pipeline.
     * 
     */
    @OutputExport(name="options", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> options;

    /**
     * @return The list of all options configured for the pipeline.
     * 
     */
    public Output</* @Nullable */ List<String>> getOptions() {
        return this.options;
    }
    /**
     * The provisioning state of the pipeline at the time the operation was called.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the pipeline at the time the operation was called.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The source properties of the import pipeline.
     * 
     */
    @OutputExport(name="source", type=ImportPipelineSourcePropertiesResponse.class, parameters={})
    private Output<ImportPipelineSourcePropertiesResponse> source;

    /**
     * @return The source properties of the import pipeline.
     * 
     */
    public Output<ImportPipelineSourcePropertiesResponse> getSource() {
        return this.source;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The properties that describe the trigger of the import pipeline.
     * 
     */
    @OutputExport(name="trigger", type=PipelineTriggerPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ PipelineTriggerPropertiesResponse> trigger;

    /**
     * @return The properties that describe the trigger of the import pipeline.
     * 
     */
    public Output</* @Nullable */ PipelineTriggerPropertiesResponse> getTrigger() {
        return this.trigger;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ImportPipelineArgs.Builder a);
    }
    private static io.pulumi.azurenative.containerregistry.ImportPipelineArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.containerregistry.ImportPipelineArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ImportPipeline(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImportPipeline(String name) {
        this(name, ImportPipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImportPipeline(String name, ImportPipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImportPipeline(String name, ImportPipelineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:ImportPipeline", name, args == null ? ImportPipelineArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ImportPipeline(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:ImportPipeline", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:containerregistry/v20191201preview:ImportPipeline").build()),
                Output.of(Alias.builder().setType("azure-native:containerregistry/v20201101preview:ImportPipeline").build()),
                Output.of(Alias.builder().setType("azure-native:containerregistry/v20210601preview:ImportPipeline").build()),
                Output.of(Alias.builder().setType("azure-native:containerregistry/v20210801preview:ImportPipeline").build()),
                Output.of(Alias.builder().setType("azure-native:containerregistry/v20211201preview:ImportPipeline").build())
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
    public static ImportPipeline get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ImportPipeline(name, id, options);
    }
}
