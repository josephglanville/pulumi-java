// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.appengine.ApplicationUrlDispatchRulesArgs;
import io.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRulesState;
import io.pulumi.gcp.appengine.outputs.ApplicationUrlDispatchRulesDispatchRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Rules to match an HTTP request and dispatch that request to a service.
 * 
 * To get more information about ApplicationUrlDispatchRules, see:
 * 
 * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps#UrlDispatchRule)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ApplicationUrlDispatchRules can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:appengine/applicationUrlDispatchRules:ApplicationUrlDispatchRules default {{project}}
 * ```
 * 
 */
@ResourceType(type="gcp:appengine/applicationUrlDispatchRules:ApplicationUrlDispatchRules")
public class ApplicationUrlDispatchRules extends io.pulumi.resources.CustomResource {
    /**
     * Rules to match an HTTP request and dispatch that request to a service.
     * Structure is documented below.
     * 
     */
    @Export(name="dispatchRules", type=List.class, parameters={ApplicationUrlDispatchRulesDispatchRule.class})
    private Output<List<ApplicationUrlDispatchRulesDispatchRule>> dispatchRules;

    /**
     * @return Rules to match an HTTP request and dispatch that request to a service.
     * Structure is documented below.
     * 
     */
    public Output<List<ApplicationUrlDispatchRulesDispatchRule>> getDispatchRules() {
        return this.dispatchRules;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationUrlDispatchRules(String name) {
        this(name, ApplicationUrlDispatchRulesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationUrlDispatchRules(String name, ApplicationUrlDispatchRulesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationUrlDispatchRules(String name, ApplicationUrlDispatchRulesArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/applicationUrlDispatchRules:ApplicationUrlDispatchRules", name, args == null ? ApplicationUrlDispatchRulesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplicationUrlDispatchRules(String name, Output<String> id, @Nullable ApplicationUrlDispatchRulesState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/applicationUrlDispatchRules:ApplicationUrlDispatchRules", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApplicationUrlDispatchRules get(String name, Output<String> id, @Nullable ApplicationUrlDispatchRulesState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationUrlDispatchRules(name, id, state, options);
    }
}
