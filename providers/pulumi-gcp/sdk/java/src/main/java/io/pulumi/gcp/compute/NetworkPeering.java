// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.NetworkPeeringArgs;
import io.pulumi.gcp.compute.inputs.NetworkPeeringState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a network peering within GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/vpc/vpc-peering)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/networks).
 * 
 * > Both networks must create a peering with each other for the peering
 * to be functional.
 * 
 * > Subnets IP ranges across peered VPC networks cannot overlap.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * VPC network peerings can be imported using the name and project of the primary network the peering exists in and the name of the network peering
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkPeering:NetworkPeering peering_network project-name/network-name/peering-name
 * ```
 * 
 */
@ResourceType(type="gcp:compute/networkPeering:NetworkPeering")
public class NetworkPeering extends io.pulumi.resources.CustomResource {
    /**
     * Whether to export the custom routes to the peer network. Defaults to `false`.
     * 
     */
    @Export(name="exportCustomRoutes", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> exportCustomRoutes;

    /**
     * @return Whether to export the custom routes to the peer network. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getExportCustomRoutes() {
        return this.exportCustomRoutes;
    }
    /**
     * Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not controlled by this field.
     * 
     */
    @Export(name="exportSubnetRoutesWithPublicIp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> exportSubnetRoutesWithPublicIp;

    /**
     * @return Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not controlled by this field.
     * 
     */
    public Output</* @Nullable */ Boolean> getExportSubnetRoutesWithPublicIp() {
        return this.exportSubnetRoutesWithPublicIp;
    }
    /**
     * Whether to import the custom routes from the peer network. Defaults to `false`.
     * 
     */
    @Export(name="importCustomRoutes", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> importCustomRoutes;

    /**
     * @return Whether to import the custom routes from the peer network. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getImportCustomRoutes() {
        return this.importCustomRoutes;
    }
    /**
     * Whether subnet routes with public IP range are imported. The default value is false. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always imported from peers and are not controlled by this field.
     * 
     */
    @Export(name="importSubnetRoutesWithPublicIp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> importSubnetRoutesWithPublicIp;

    /**
     * @return Whether subnet routes with public IP range are imported. The default value is false. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always imported from peers and are not controlled by this field.
     * 
     */
    public Output</* @Nullable */ Boolean> getImportSubnetRoutesWithPublicIp() {
        return this.importSubnetRoutesWithPublicIp;
    }
    /**
     * Name of the peering.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the peering.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The primary network of the peering.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The primary network of the peering.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * The peer network in the peering. The peer network
     * may belong to a different project.
     * 
     */
    @Export(name="peerNetwork", type=String.class, parameters={})
    private Output<String> peerNetwork;

    /**
     * @return The peer network in the peering. The peer network
     * may belong to a different project.
     * 
     */
    public Output<String> getPeerNetwork() {
        return this.peerNetwork;
    }
    /**
     * State for the peering, either `ACTIVE` or `INACTIVE`. The peering is
     * `ACTIVE` when there's a matching configuration in the peer network.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State for the peering, either `ACTIVE` or `INACTIVE`. The peering is
     * `ACTIVE` when there's a matching configuration in the peer network.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Details about the current state of the peering.
     * 
     */
    @Export(name="stateDetails", type=String.class, parameters={})
    private Output<String> stateDetails;

    /**
     * @return Details about the current state of the peering.
     * 
     */
    public Output<String> getStateDetails() {
        return this.stateDetails;
    }

    public interface BuilderApplicator {
        public void apply(NetworkPeeringArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.NetworkPeeringArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.NetworkPeeringArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NetworkPeering(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkPeering(String name) {
        this(name, NetworkPeeringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkPeering(String name, NetworkPeeringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkPeering(String name, NetworkPeeringArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/networkPeering:NetworkPeering", name, args == null ? NetworkPeeringArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private NetworkPeering(String name, Output<String> id, @Nullable NetworkPeeringState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/networkPeering:NetworkPeering", name, state, makeResourceOptions(options, id));
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
    public static NetworkPeering get(String name, Output<String> id, @Nullable NetworkPeeringState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkPeering(name, id, state, options);
    }
}
