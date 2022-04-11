// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appmesh.GatewayRouteArgs;
import io.pulumi.aws.appmesh.inputs.GatewayRouteState;
import io.pulumi.aws.appmesh.outputs.GatewayRouteSpec;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS App Mesh gateway route resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * App Mesh gateway routes can be imported using `mesh_name` and `virtual_gateway_name` together with the gateway route's `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appmesh/gatewayRoute:GatewayRoute example mesh/gw1/example-gateway-route
 * ```
 * 
 *  [1]/docs/providers/aws/index.html
 * 
 */
@ResourceType(type="aws:appmesh/gatewayRoute:GatewayRoute")
public class GatewayRoute extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the gateway route.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the gateway route.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The creation date of the gateway route.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the gateway route.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The last update date of the gateway route.
     * 
     */
    @Export(name="lastUpdatedDate", type=String.class, parameters={})
    private Output<String> lastUpdatedDate;

    /**
     * @return The last update date of the gateway route.
     * 
     */
    public Output<String> getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="meshName", type=String.class, parameters={})
    private Output<String> meshName;

    /**
     * @return The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> getMeshName() {
        return this.meshName;
    }
    /**
     * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @Export(name="meshOwner", type=String.class, parameters={})
    private Output<String> meshOwner;

    /**
     * @return The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    public Output<String> getMeshOwner() {
        return this.meshOwner;
    }
    /**
     * The name to use for the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name to use for the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource owner's AWS account ID.
     * 
     */
    @Export(name="resourceOwner", type=String.class, parameters={})
    private Output<String> resourceOwner;

    /**
     * @return The resource owner's AWS account ID.
     * 
     */
    public Output<String> getResourceOwner() {
        return this.resourceOwner;
    }
    /**
     * The gateway route specification to apply.
     * 
     */
    @Export(name="spec", type=GatewayRouteSpec.class, parameters={})
    private Output<GatewayRouteSpec> spec;

    /**
     * @return The gateway route specification to apply.
     * 
     */
    public Output<GatewayRouteSpec> getSpec() {
        return this.spec;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The name of the virtual gateway to associate the gateway route with. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="virtualGatewayName", type=String.class, parameters={})
    private Output<String> virtualGatewayName;

    /**
     * @return The name of the virtual gateway to associate the gateway route with. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> getVirtualGatewayName() {
        return this.virtualGatewayName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GatewayRoute(String name) {
        this(name, GatewayRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GatewayRoute(String name, GatewayRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GatewayRoute(String name, GatewayRouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/gatewayRoute:GatewayRoute", name, args == null ? GatewayRouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GatewayRoute(String name, Output<String> id, @Nullable GatewayRouteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/gatewayRoute:GatewayRoute", name, state, makeResourceOptions(options, id));
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
    public static GatewayRoute get(String name, Output<String> id, @Nullable GatewayRouteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GatewayRoute(name, id, state, options);
    }
}
