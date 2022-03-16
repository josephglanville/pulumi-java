// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
import io.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupState;
import io.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupAppEngine;
import io.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupCloudFunction;
import io.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupCloudRun;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A regional NEG that can support Serverless Products.
 * 
 * To get more information about RegionNetworkEndpointGroup, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/regionNetworkEndpointGroups)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/load-balancing/docs/negs/serverless-neg-concepts)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RegionNetworkEndpointGroup can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default projects/{{project}}/regions/{{region}}/networkEndpointGroups/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup")
public class RegionNetworkEndpointGroup extends io.pulumi.resources.CustomResource {
    /**
     * Only valid when networkEndpointType is "SERVERLESS".
     * Only one of cloud_run, app_engine or cloud_function may be set.
     * Structure is documented below.
     * 
     */
    @Export(name="appEngine", type=RegionNetworkEndpointGroupAppEngine.class, parameters={})
    private Output</* @Nullable */ RegionNetworkEndpointGroupAppEngine> appEngine;

    /**
     * @return Only valid when networkEndpointType is "SERVERLESS".
     * Only one of cloud_run, app_engine or cloud_function may be set.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionNetworkEndpointGroupAppEngine> getAppEngine() {
        return this.appEngine;
    }
    /**
     * Only valid when networkEndpointType is "SERVERLESS".
     * Only one of cloud_run, app_engine or cloud_function may be set.
     * Structure is documented below.
     * 
     */
    @Export(name="cloudFunction", type=RegionNetworkEndpointGroupCloudFunction.class, parameters={})
    private Output</* @Nullable */ RegionNetworkEndpointGroupCloudFunction> cloudFunction;

    /**
     * @return Only valid when networkEndpointType is "SERVERLESS".
     * Only one of cloud_run, app_engine or cloud_function may be set.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionNetworkEndpointGroupCloudFunction> getCloudFunction() {
        return this.cloudFunction;
    }
    /**
     * Only valid when networkEndpointType is "SERVERLESS".
     * Only one of cloud_run, app_engine or cloud_function may be set.
     * Structure is documented below.
     * 
     */
    @Export(name="cloudRun", type=RegionNetworkEndpointGroupCloudRun.class, parameters={})
    private Output</* @Nullable */ RegionNetworkEndpointGroupCloudRun> cloudRun;

    /**
     * @return Only valid when networkEndpointType is "SERVERLESS".
     * Only one of cloud_run, app_engine or cloud_function may be set.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionNetworkEndpointGroupCloudRun> getCloudRun() {
        return this.cloudRun;
    }
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Type of network endpoints in this network endpoint group. Defaults to SERVERLESS
     * Default value is `SERVERLESS`.
     * Possible values are `SERVERLESS`.
     * 
     */
    @Export(name="networkEndpointType", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkEndpointType;

    /**
     * @return Type of network endpoints in this network endpoint group. Defaults to SERVERLESS
     * Default value is `SERVERLESS`.
     * Possible values are `SERVERLESS`.
     * 
     */
    public Output</* @Nullable */ String> getNetworkEndpointType() {
        return this.networkEndpointType;
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
     * A reference to the region where the Serverless NEGs Reside.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return A reference to the region where the Serverless NEGs Reside.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }

    public interface BuilderApplicator {
        public void apply(RegionNetworkEndpointGroupArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RegionNetworkEndpointGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionNetworkEndpointGroup(String name) {
        this(name, RegionNetworkEndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionNetworkEndpointGroup(String name, RegionNetworkEndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionNetworkEndpointGroup(String name, RegionNetworkEndpointGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup", name, args == null ? RegionNetworkEndpointGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RegionNetworkEndpointGroup(String name, Output<String> id, @Nullable RegionNetworkEndpointGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup", name, state, makeResourceOptions(options, id));
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
    public static RegionNetworkEndpointGroup get(String name, Output<String> id, @Nullable RegionNetworkEndpointGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionNetworkEndpointGroup(name, id, state, options);
    }
}
