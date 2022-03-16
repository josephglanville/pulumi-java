// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.TemplateSpecVersionArgs;
import io.pulumi.azurenative.resources.outputs.LinkedTemplateArtifactResponse;
import io.pulumi.azurenative.resources.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Template Spec Version object.
 * API Version: 2021-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:resources:TemplateSpecVersion v1.0 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/templateSpecRG/providers/Microsoft.Resources/templateSpecs/simpleTemplateSpec/versions/v1.0 
 * ```
 * 
 */
@ResourceType(type="azure-native:resources:TemplateSpecVersion")
public class TemplateSpecVersion extends io.pulumi.resources.CustomResource {
    /**
     * Template Spec version description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Template Spec version description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * An array of linked template artifacts.
     * 
     */
    @Export(name="linkedTemplates", type=List.class, parameters={LinkedTemplateArtifactResponse.class})
    private Output</* @Nullable */ List<LinkedTemplateArtifactResponse>> linkedTemplates;

    /**
     * @return An array of linked template artifacts.
     * 
     */
    public Output</* @Nullable */ List<LinkedTemplateArtifactResponse>> getLinkedTemplates() {
        return this.linkedTemplates;
    }
    /**
     * The location of the Template Spec Version. It must match the location of the parent Template Spec.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the Template Spec Version. It must match the location of the parent Template Spec.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The main Azure Resource Manager template content.
     * 
     */
    @Export(name="mainTemplate", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> mainTemplate;

    /**
     * @return The main Azure Resource Manager template content.
     * 
     */
    public Output</* @Nullable */ Object> getMainTemplate() {
        return this.mainTemplate;
    }
    /**
     * The version metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
     * 
     */
    @Export(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The version metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
     * 
     */
    public Output</* @Nullable */ Object> getMetadata() {
        return this.metadata;
    }
    /**
     * Name of this resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Type of this resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The Azure Resource Manager template UI definition content.
     * 
     */
    @Export(name="uiFormDefinition", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> uiFormDefinition;

    /**
     * @return The Azure Resource Manager template UI definition content.
     * 
     */
    public Output</* @Nullable */ Object> getUiFormDefinition() {
        return this.uiFormDefinition;
    }

    public interface BuilderApplicator {
        public void apply(TemplateSpecVersionArgs.Builder a);
    }
    private static io.pulumi.azurenative.resources.TemplateSpecVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.resources.TemplateSpecVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TemplateSpecVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TemplateSpecVersion(String name) {
        this(name, TemplateSpecVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TemplateSpecVersion(String name, TemplateSpecVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TemplateSpecVersion(String name, TemplateSpecVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:TemplateSpecVersion", name, args == null ? TemplateSpecVersionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TemplateSpecVersion(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:TemplateSpecVersion", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:resources/v20190601preview:TemplateSpecVersion").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210301preview:TemplateSpecVersion").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210501:TemplateSpecVersion").build())
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
    public static TemplateSpecVersion get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TemplateSpecVersion(name, id, options);
    }
}
