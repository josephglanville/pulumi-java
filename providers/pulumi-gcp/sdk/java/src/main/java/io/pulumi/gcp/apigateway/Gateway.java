// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.apigateway.GatewayArgs;
import io.pulumi.gcp.apigateway.inputs.GatewayState;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A consumable API that can be used by multiple Gateways.
 * 
 * To get more information about Gateway, see:
 * 
 * * [API documentation](https://cloud.google.com/api-gateway/docs/reference/rest/v1beta/projects.locations.apis)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/api-gateway/docs/quickstart)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Gateway can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/gateway:Gateway default projects/{{project}}/locations/{{region}}/gateways/{{gateway_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/gateway:Gateway default {{project}}/{{region}}/{{gateway_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/gateway:Gateway default {{region}}/{{gateway_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigateway/gateway:Gateway default {{gateway_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigateway/gateway:Gateway")
public class Gateway extends io.pulumi.resources.CustomResource {
    /**
     * Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}.
     * When changing api configs please ensure the new config is a new resource and the lifecycle rule `create_before_destroy` is set.
     * 
     */
    @Export(name="apiConfig", type=String.class, parameters={})
    private Output<String> apiConfig;

    /**
     * @return Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}.
     * When changing api configs please ensure the new config is a new resource and the lifecycle rule `create_before_destroy` is set.
     * 
     */
    public Output<String> getApiConfig() {
        return this.apiConfig;
    }
    /**
     * The default API Gateway host name of the form {gatewayId}-{hash}.{region_code}.gateway.dev.
     * 
     */
    @Export(name="defaultHostname", type=String.class, parameters={})
    private Output<String> defaultHostname;

    /**
     * @return The default API Gateway host name of the form {gatewayId}-{hash}.{region_code}.gateway.dev.
     * 
     */
    public Output<String> getDefaultHostname() {
        return this.defaultHostname;
    }
    /**
     * A user-visible name for the API.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A user-visible name for the API.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Identifier to assign to the Gateway. Must be unique within scope of the parent resource(project).
     * 
     */
    @Export(name="gatewayId", type=String.class, parameters={})
    private Output<String> gatewayId;

    /**
     * @return Identifier to assign to the Gateway. Must be unique within scope of the parent resource(project).
     * 
     */
    public Output<String> getGatewayId() {
        return this.gatewayId;
    }
    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Resource name of the Gateway. Format: projects/{project}/locations/{region}/gateways/{gateway}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the Gateway. Format: projects/{project}/locations/{region}/gateways/{gateway}
     * 
     */
    public Output<String> getName() {
        return this.name;
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
     * The region of the gateway for the API.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region of the gateway for the API.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(String name, GatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/gateway:Gateway", name, args == null ? GatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Gateway(String name, Output<String> id, @Nullable GatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/gateway:Gateway", name, state, makeResourceOptions(options, id));
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
    public static Gateway get(String name, Output<String> id, @Nullable GatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, state, options);
    }
}
