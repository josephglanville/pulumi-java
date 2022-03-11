// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.OriginArgs;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * CDN origin is the source of the content being delivered via CDN. When the edge nodes represented by an endpoint do not have the requested content cached, they attempt to fetch it from one or more of the configured origins.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cdn:Origin www-someDomain-net /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/origins/www-someDomain-net 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:Origin")
public class Origin extends io.pulumi.resources.CustomResource {
    /**
     * Origin is enabled for load balancing or not
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Origin is enabled for load balancing or not
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     * 
     */
    @OutputExport(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     * 
     */
    public Output<String> getHostName() {
        return this.hostName;
    }
    /**
     * The value of the HTTP port. Must be between 1 and 65535.
     * 
     */
    @OutputExport(name="httpPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> httpPort;

    /**
     * @return The value of the HTTP port. Must be between 1 and 65535.
     * 
     */
    public Output</* @Nullable */ Integer> getHttpPort() {
        return this.httpPort;
    }
    /**
     * The value of the HTTPS port. Must be between 1 and 65535.
     * 
     */
    @OutputExport(name="httpsPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> httpsPort;

    /**
     * @return The value of the HTTPS port. Must be between 1 and 65535.
     * 
     */
    public Output</* @Nullable */ Integer> getHttpsPort() {
        return this.httpsPort;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
     * 
     */
    @OutputExport(name="originHostHeader", type=String.class, parameters={})
    private Output</* @Nullable */ String> originHostHeader;

    /**
     * @return The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
     * 
     */
    public Output</* @Nullable */ String> getOriginHostHeader() {
        return this.originHostHeader;
    }
    /**
     * Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
     * 
     */
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
     * 
     */
    public Output</* @Nullable */ Integer> getPriority() {
        return this.priority;
    }
    /**
     * The approval status for the connection to the Private Link
     * 
     */
    @OutputExport(name="privateEndpointStatus", type=String.class, parameters={})
    private Output<String> privateEndpointStatus;

    /**
     * @return The approval status for the connection to the Private Link
     * 
     */
    public Output<String> getPrivateEndpointStatus() {
        return this.privateEndpointStatus;
    }
    /**
     * The Alias of the Private Link resource. Populating this optional field indicates that this origin is 'Private'
     * 
     */
    @OutputExport(name="privateLinkAlias", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateLinkAlias;

    /**
     * @return The Alias of the Private Link resource. Populating this optional field indicates that this origin is 'Private'
     * 
     */
    public Output</* @Nullable */ String> getPrivateLinkAlias() {
        return this.privateLinkAlias;
    }
    /**
     * A custom message to be included in the approval request to connect to the Private Link.
     * 
     */
    @OutputExport(name="privateLinkApprovalMessage", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateLinkApprovalMessage;

    /**
     * @return A custom message to be included in the approval request to connect to the Private Link.
     * 
     */
    public Output</* @Nullable */ String> getPrivateLinkApprovalMessage() {
        return this.privateLinkApprovalMessage;
    }
    /**
     * The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
     * 
     */
    @OutputExport(name="privateLinkLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateLinkLocation;

    /**
     * @return The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
     * 
     */
    public Output</* @Nullable */ String> getPrivateLinkLocation() {
        return this.privateLinkLocation;
    }
    /**
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
     */
    @OutputExport(name="privateLinkResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateLinkResourceId;

    /**
     * @return The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
     */
    public Output</* @Nullable */ String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId;
    }
    /**
     * Provisioning status of the origin.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status of the origin.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource status of the origin.
     * 
     */
    @OutputExport(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return Resource status of the origin.
     * 
     */
    public Output<String> getResourceState() {
        return this.resourceState;
    }
    /**
     * Read only system data
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
     * 
     */
    @OutputExport(name="weight", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> weight;

    /**
     * @return Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
     * 
     */
    public Output</* @Nullable */ Integer> getWeight() {
        return this.weight;
    }

    public interface BuilderApplicator {
        public void apply(OriginArgs.Builder a);
    }
    private static io.pulumi.azurenative.cdn.OriginArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.cdn.OriginArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Origin(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Origin(String name) {
        this(name, OriginArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Origin(String name, OriginArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Origin(String name, OriginArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Origin", name, args == null ? OriginArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Origin(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Origin", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:cdn/v20150601:Origin").build()),
                Output.of(Alias.builder().setType("azure-native:cdn/v20160402:Origin").build()),
                Output.of(Alias.builder().setType("azure-native:cdn/v20191231:Origin").build()),
                Output.of(Alias.builder().setType("azure-native:cdn/v20200331:Origin").build()),
                Output.of(Alias.builder().setType("azure-native:cdn/v20200415:Origin").build()),
                Output.of(Alias.builder().setType("azure-native:cdn/v20200901:Origin").build()),
                Output.of(Alias.builder().setType("azure-native:cdn/v20210601:Origin").build())
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
    public static Origin get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Origin(name, id, options);
    }
}
