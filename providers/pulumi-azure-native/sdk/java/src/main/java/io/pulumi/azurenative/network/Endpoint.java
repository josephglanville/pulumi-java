// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.EndpointArgs;
import io.pulumi.azurenative.network.outputs.EndpointPropertiesResponseCustomHeaders;
import io.pulumi.azurenative.network.outputs.EndpointPropertiesResponseSubnets;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing a Traffic Manager endpoint.
 * API Version: 2018-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:Endpoint My external endpoint /subscriptions/{subscription-id}/resourceGroups/azuresdkfornetautoresttrafficmanager2191/providers/Microsoft.Network/trafficManagerProfiles/azuresdkfornetautoresttrafficmanager8224/externalEndpoints/My external endpoint 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:Endpoint")
public class Endpoint extends io.pulumi.resources.CustomResource {
    /**
     * List of custom headers.
     * 
     */
    @Export(name="customHeaders", type=List.class, parameters={EndpointPropertiesResponseCustomHeaders.class})
    private Output</* @Nullable */ List<EndpointPropertiesResponseCustomHeaders>> customHeaders;

    /**
     * @return List of custom headers.
     * 
     */
    public Output</* @Nullable */ List<EndpointPropertiesResponseCustomHeaders>> getCustomHeaders() {
        return this.customHeaders;
    }
    /**
     * Specifies the location of the external or nested endpoints when using the 'Performance' traffic routing method.
     * 
     */
    @Export(name="endpointLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> endpointLocation;

    /**
     * @return Specifies the location of the external or nested endpoints when using the 'Performance' traffic routing method.
     * 
     */
    public Output</* @Nullable */ String> getEndpointLocation() {
        return this.endpointLocation;
    }
    /**
     * The monitoring status of the endpoint.
     * 
     */
    @Export(name="endpointMonitorStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> endpointMonitorStatus;

    /**
     * @return The monitoring status of the endpoint.
     * 
     */
    public Output</* @Nullable */ String> getEndpointMonitorStatus() {
        return this.endpointMonitorStatus;
    }
    /**
     * The status of the endpoint. If the endpoint is Enabled, it is probed for endpoint health and is included in the traffic routing method.
     * 
     */
    @Export(name="endpointStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> endpointStatus;

    /**
     * @return The status of the endpoint. If the endpoint is Enabled, it is probed for endpoint health and is included in the traffic routing method.
     * 
     */
    public Output</* @Nullable */ String> getEndpointStatus() {
        return this.endpointStatus;
    }
    /**
     * The list of countries/regions mapped to this endpoint when using the 'Geographic' traffic routing method. Please consult Traffic Manager Geographic documentation for a full list of accepted values.
     * 
     */
    @Export(name="geoMapping", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> geoMapping;

    /**
     * @return The list of countries/regions mapped to this endpoint when using the 'Geographic' traffic routing method. Please consult Traffic Manager Geographic documentation for a full list of accepted values.
     * 
     */
    public Output</* @Nullable */ List<String>> getGeoMapping() {
        return this.geoMapping;
    }
    /**
     * The minimum number of endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    @Export(name="minChildEndpoints", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> minChildEndpoints;

    /**
     * @return The minimum number of endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    public Output</* @Nullable */ Double> getMinChildEndpoints() {
        return this.minChildEndpoints;
    }
    /**
     * The minimum number of IPv4 (DNS record type A) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    @Export(name="minChildEndpointsIPv4", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> minChildEndpointsIPv4;

    /**
     * @return The minimum number of IPv4 (DNS record type A) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    public Output</* @Nullable */ Double> getMinChildEndpointsIPv4() {
        return this.minChildEndpointsIPv4;
    }
    /**
     * The minimum number of IPv6 (DNS record type AAAA) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    @Export(name="minChildEndpointsIPv6", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> minChildEndpointsIPv6;

    /**
     * @return The minimum number of IPv6 (DNS record type AAAA) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    public Output</* @Nullable */ Double> getMinChildEndpointsIPv6() {
        return this.minChildEndpointsIPv6;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The priority of this endpoint when using the 'Priority' traffic routing method. Possible values are from 1 to 1000, lower values represent higher priority. This is an optional parameter.  If specified, it must be specified on all endpoints, and no two endpoints can share the same priority value.
     * 
     */
    @Export(name="priority", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> priority;

    /**
     * @return The priority of this endpoint when using the 'Priority' traffic routing method. Possible values are from 1 to 1000, lower values represent higher priority. This is an optional parameter.  If specified, it must be specified on all endpoints, and no two endpoints can share the same priority value.
     * 
     */
    public Output</* @Nullable */ Double> getPriority() {
        return this.priority;
    }
    /**
     * The list of subnets, IP addresses, and/or address ranges mapped to this endpoint when using the 'Subnet' traffic routing method. An empty list will match all ranges not covered by other endpoints.
     * 
     */
    @Export(name="subnets", type=List.class, parameters={EndpointPropertiesResponseSubnets.class})
    private Output</* @Nullable */ List<EndpointPropertiesResponseSubnets>> subnets;

    /**
     * @return The list of subnets, IP addresses, and/or address ranges mapped to this endpoint when using the 'Subnet' traffic routing method. An empty list will match all ranges not covered by other endpoints.
     * 
     */
    public Output</* @Nullable */ List<EndpointPropertiesResponseSubnets>> getSubnets() {
        return this.subnets;
    }
    /**
     * The fully-qualified DNS name or IP address of the endpoint. Traffic Manager returns this value in DNS responses to direct traffic to this endpoint.
     * 
     */
    @Export(name="target", type=String.class, parameters={})
    private Output</* @Nullable */ String> target;

    /**
     * @return The fully-qualified DNS name or IP address of the endpoint. Traffic Manager returns this value in DNS responses to direct traffic to this endpoint.
     * 
     */
    public Output</* @Nullable */ String> getTarget() {
        return this.target;
    }
    /**
     * The Azure Resource URI of the of the endpoint. Not applicable to endpoints of type 'ExternalEndpoints'.
     * 
     */
    @Export(name="targetResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceId;

    /**
     * @return The Azure Resource URI of the of the endpoint. Not applicable to endpoints of type 'ExternalEndpoints'.
     * 
     */
    public Output</* @Nullable */ String> getTargetResourceId() {
        return this.targetResourceId;
    }
    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }
    /**
     * The weight of this endpoint when using the 'Weighted' traffic routing method. Possible values are from 1 to 1000.
     * 
     */
    @Export(name="weight", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> weight;

    /**
     * @return The weight of this endpoint when using the 'Weighted' traffic routing method. Possible values are from 1 to 1000.
     * 
     */
    public Output</* @Nullable */ Double> getWeight() {
        return this.weight;
    }

    public interface BuilderApplicator {
        public void apply(EndpointArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.EndpointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.EndpointArgs.builder();
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
        super("azure-native:network:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:Endpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20151101:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170501:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180301:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:Endpoint").build())
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
    public static Endpoint get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, options);
    }
}
