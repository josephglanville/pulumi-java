// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dataloss.PreventionDeidentifyTemplateArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateState;
import io.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfig;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows creation of templates to de-identify content.
 * 
 * To get more information about DeidentifyTemplate, see:
 * 
 * * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.deidentifyTemplates)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dlp/docs/concepts-templates)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DeidentifyTemplate can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate default {{parent}}/deidentifyTemplates/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate")
public class PreventionDeidentifyTemplate extends io.pulumi.resources.CustomResource {
    /**
     * Configuration of the deidentify template
     * Structure is documented below.
     * 
     */
    @OutputExport(name="deidentifyConfig", type=PreventionDeidentifyTemplateDeidentifyConfig.class, parameters={})
    private Output<PreventionDeidentifyTemplateDeidentifyConfig> deidentifyConfig;

    /**
     * @return Configuration of the deidentify template
     * Structure is documented below.
     * 
     */
    public Output<PreventionDeidentifyTemplateDeidentifyConfig> getDeidentifyConfig() {
        return this.deidentifyConfig;
    }
    /**
     * A description of the template.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the template.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * User set display name of the template.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User set display name of the template.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Name of the information type. Either a name of your choosing when creating a CustomInfoType, or one of the names listed at [https://cloud.google.com/dlp/docs/infotypes-reference](https://cloud.google.com/dlp/docs/infotypes-reference) when specifying a built-in type. When sending Cloud DLP results to Data Catalog, infoType names should conform to the pattern `[A-Za-z0-9$-_]{1,64}`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the information type. Either a name of your choosing when creating a CustomInfoType, or one of the names listed at [https://cloud.google.com/dlp/docs/infotypes-reference](https://cloud.google.com/dlp/docs/infotypes-reference) when specifying a built-in type. When sending Cloud DLP results to Data Catalog, infoType names should conform to the pattern `[A-Za-z0-9$-_]{1,64}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parent of the template in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The parent of the template in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }

    public interface BuilderApplicator {
        public void apply(PreventionDeidentifyTemplateArgs.Builder a);
    }
    private static io.pulumi.gcp.dataloss.PreventionDeidentifyTemplateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.dataloss.PreventionDeidentifyTemplateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PreventionDeidentifyTemplate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PreventionDeidentifyTemplate(String name) {
        this(name, PreventionDeidentifyTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PreventionDeidentifyTemplate(String name, PreventionDeidentifyTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PreventionDeidentifyTemplate(String name, PreventionDeidentifyTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate", name, args == null ? PreventionDeidentifyTemplateArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PreventionDeidentifyTemplate(String name, Output<String> id, @Nullable PreventionDeidentifyTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PreventionDeidentifyTemplate get(String name, Output<String> id, @Nullable PreventionDeidentifyTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PreventionDeidentifyTemplate(name, id, state, options);
    }
}
