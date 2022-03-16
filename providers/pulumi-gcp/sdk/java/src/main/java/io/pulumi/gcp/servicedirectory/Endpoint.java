// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.servicedirectory.EndpointArgs;
import io.pulumi.gcp.servicedirectory.inputs.EndpointState;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An individual endpoint that provides a service.
 * 
 * To get more information about Endpoint, see:
 * 
 * * [API documentation](https://cloud.google.com/service-directory/docs/reference/rest/v1beta1/projects.locations.namespaces.services.endpoints)
 * * How-to Guides
 *     * [Configuring an endpoint](https://cloud.google.com/service-directory/docs/configuring-service-directory#configuring_an_endpoint)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Endpoint can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/endpoint:Endpoint default projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}/endpoints/{{endpoint_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/endpoint:Endpoint default {{project}}/{{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/endpoint:Endpoint default {{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:servicedirectory/endpoint:Endpoint")
public class Endpoint extends io.pulumi.resources.CustomResource {
    /**
     * IPv4 or IPv6 address of the endpoint.
     * 
     */
    @Export(name="address", type=String.class, parameters={})
    private Output</* @Nullable */ String> address;

    /**
     * @return IPv4 or IPv6 address of the endpoint.
     * 
     */
    public Output</* @Nullable */ String> getAddress() {
        return this.address;
    }
    /**
     * The Resource ID must be 1-63 characters long, including digits,
     * lowercase letters or the hyphen character.
     * 
     */
    @Export(name="endpointId", type=String.class, parameters={})
    private Output<String> endpointId;

    /**
     * @return The Resource ID must be 1-63 characters long, including digits,
     * lowercase letters or the hyphen character.
     * 
     */
    public Output<String> getEndpointId() {
        return this.endpointId;
    }
    /**
     * Metadata for the endpoint. This data can be consumed
     * by service clients. The entire metadata dictionary may contain
     * up to 512 characters, spread across all key-value pairs.
     * Metadata that goes beyond any these limits will be rejected.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return Metadata for the endpoint. This data can be consumed
     * by service clients. The entire metadata dictionary may contain
     * up to 512 characters, spread across all key-value pairs.
     * Metadata that goes beyond any these limits will be rejected.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * The resource name for the endpoint in the format 'projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*{@literal /}endpoints/*'.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the endpoint in the format 'projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*{@literal /}endpoints/*'.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The URL to the network, such as projects/PROJECT_NUMBER/locations/global/networks/NETWORK_NAME.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output</* @Nullable */ String> network;

    /**
     * @return The URL to the network, such as projects/PROJECT_NUMBER/locations/global/networks/NETWORK_NAME.
     * 
     */
    public Output</* @Nullable */ String> getNetwork() {
        return this.network;
    }
    /**
     * Port that the endpoint is running on, must be in the
     * range of [0, 65535]. If unspecified, the default is 0.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port that the endpoint is running on, must be in the
     * range of [0, 65535]. If unspecified, the default is 0.
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * The resource name of the service that this endpoint provides.
     * 
     */
    @Export(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return The resource name of the service that this endpoint provides.
     * 
     */
    public Output<String> getService() {
        return this.service;
    }

    public interface BuilderApplicator {
        public void apply(EndpointArgs.Builder a);
    }
    private static io.pulumi.gcp.servicedirectory.EndpointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.servicedirectory.EndpointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Endpoint(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/endpoint:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable EndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/endpoint:Endpoint", name, state, makeResourceOptions(options, id));
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
    public static Endpoint get(String name, Output<String> id, @Nullable EndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, state, options);
    }
}
