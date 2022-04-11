// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.appengine.EngineSplitTrafficArgs;
import io.pulumi.gcp.appengine.inputs.EngineSplitTrafficState;
import io.pulumi.gcp.appengine.outputs.EngineSplitTrafficSplit;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Traffic routing configuration for versions within a single service. Traffic splits define how traffic directed to the service is assigned to versions.
 * 
 * To get more information about ServiceSplitTraffic, see:
 * 
 * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ServiceSplitTraffic can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:appengine/engineSplitTraffic:EngineSplitTraffic default apps/{{project}}/services/{{service}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:appengine/engineSplitTraffic:EngineSplitTraffic default {{project}}/{{service}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:appengine/engineSplitTraffic:EngineSplitTraffic default {{service}}
 * ```
 * 
 */
@ResourceType(type="gcp:appengine/engineSplitTraffic:EngineSplitTraffic")
public class EngineSplitTraffic extends io.pulumi.resources.CustomResource {
    /**
     * If set to true traffic will be migrated to this version.
     * 
     */
    @Export(name="migrateTraffic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> migrateTraffic;

    /**
     * @return If set to true traffic will be migrated to this version.
     * 
     */
    public Output</* @Nullable */ Boolean> getMigrateTraffic() {
        return this.migrateTraffic;
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
     * The name of the service these settings apply to.
     * 
     */
    @Export(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return The name of the service these settings apply to.
     * 
     */
    public Output<String> getService() {
        return this.service;
    }
    /**
     * Mapping that defines fractional HTTP traffic diversion to different versions within the service.
     * Structure is documented below.
     * 
     */
    @Export(name="split", type=EngineSplitTrafficSplit.class, parameters={})
    private Output<EngineSplitTrafficSplit> split;

    /**
     * @return Mapping that defines fractional HTTP traffic diversion to different versions within the service.
     * Structure is documented below.
     * 
     */
    public Output<EngineSplitTrafficSplit> getSplit() {
        return this.split;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EngineSplitTraffic(String name) {
        this(name, EngineSplitTrafficArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EngineSplitTraffic(String name, EngineSplitTrafficArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EngineSplitTraffic(String name, EngineSplitTrafficArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/engineSplitTraffic:EngineSplitTraffic", name, args == null ? EngineSplitTrafficArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EngineSplitTraffic(String name, Output<String> id, @Nullable EngineSplitTrafficState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/engineSplitTraffic:EngineSplitTraffic", name, state, makeResourceOptions(options, id));
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
    public static EngineSplitTraffic get(String name, Output<String> id, @Nullable EngineSplitTrafficState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EngineSplitTraffic(name, id, state, options);
    }
}
