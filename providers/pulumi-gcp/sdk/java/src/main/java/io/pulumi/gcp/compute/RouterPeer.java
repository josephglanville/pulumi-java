// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RouterPeerArgs;
import io.pulumi.gcp.compute.inputs.RouterPeerState;
import io.pulumi.gcp.compute.outputs.RouterPeerAdvertisedIpRange;
import io.pulumi.gcp.compute.outputs.RouterPeerBfd;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * BGP information that must be configured into the routing stack to
 * establish BGP peering. This information must specify the peer ASN
 * and either the interface name, IP address, or peer IP address.
 * Please refer to RFC4273.
 * 
 * To get more information about RouterBgpPeer, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
 * * How-to Guides
 *     * [Google Cloud Router](https://cloud.google.com/router/docs/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RouterBgpPeer can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerPeer:RouterPeer default projects/{{project}}/regions/{{region}}/routers/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerPeer:RouterPeer default {{project}}/{{region}}/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerPeer:RouterPeer default {{region}}/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerPeer:RouterPeer default {{router}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/routerPeer:RouterPeer")
public class RouterPeer extends io.pulumi.resources.CustomResource {
    /**
     * User-specified flag to indicate which mode to use for advertisement.
     * Valid values of this enum field are: `DEFAULT`, `CUSTOM`
     * Default value is `DEFAULT`.
     * Possible values are `DEFAULT` and `CUSTOM`.
     * 
     */
    @Export(name="advertiseMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> advertiseMode;

    /**
     * @return User-specified flag to indicate which mode to use for advertisement.
     * Valid values of this enum field are: `DEFAULT`, `CUSTOM`
     * Default value is `DEFAULT`.
     * Possible values are `DEFAULT` and `CUSTOM`.
     * 
     */
    public Output</* @Nullable */ String> getAdvertiseMode() {
        return this.advertiseMode;
    }
    /**
     * User-specified list of prefix groups to advertise in custom
     * mode, which can take one of the following options:
     * * `ALL_SUBNETS`: Advertises all available subnets, including peer VPC subnets.
     * * `ALL_VPC_SUBNETS`: Advertises the router's own VPC subnets.
     * * `ALL_PEER_VPC_SUBNETS`: Advertises peer subnets of the router's VPC network.
     * 
     */
    @Export(name="advertisedGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> advertisedGroups;

    /**
     * @return User-specified list of prefix groups to advertise in custom
     * mode, which can take one of the following options:
     * * `ALL_SUBNETS`: Advertises all available subnets, including peer VPC subnets.
     * * `ALL_VPC_SUBNETS`: Advertises the router's own VPC subnets.
     * * `ALL_PEER_VPC_SUBNETS`: Advertises peer subnets of the router's VPC network.
     * 
     */
    public Output</* @Nullable */ List<String>> getAdvertisedGroups() {
        return this.advertisedGroups;
    }
    /**
     * User-specified list of individual IP ranges to advertise in
     * custom mode. This field can only be populated if advertiseMode
     * is `CUSTOM` and is advertised to all peers of the router. These IP
     * ranges will be advertised in addition to any specified groups.
     * Leave this field blank to advertise no custom IP ranges.
     * Structure is documented below.
     * 
     */
    @Export(name="advertisedIpRanges", type=List.class, parameters={RouterPeerAdvertisedIpRange.class})
    private Output</* @Nullable */ List<RouterPeerAdvertisedIpRange>> advertisedIpRanges;

    /**
     * @return User-specified list of individual IP ranges to advertise in
     * custom mode. This field can only be populated if advertiseMode
     * is `CUSTOM` and is advertised to all peers of the router. These IP
     * ranges will be advertised in addition to any specified groups.
     * Leave this field blank to advertise no custom IP ranges.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<RouterPeerAdvertisedIpRange>> getAdvertisedIpRanges() {
        return this.advertisedIpRanges;
    }
    /**
     * The priority of routes advertised to this BGP peer.
     * Where there is more than one matching route of maximum
     * length, the routes with the lowest priority value win.
     * 
     */
    @Export(name="advertisedRoutePriority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> advertisedRoutePriority;

    /**
     * @return The priority of routes advertised to this BGP peer.
     * Where there is more than one matching route of maximum
     * length, the routes with the lowest priority value win.
     * 
     */
    public Output</* @Nullable */ Integer> getAdvertisedRoutePriority() {
        return this.advertisedRoutePriority;
    }
    /**
     * BFD configuration for the BGP peering.
     * Structure is documented below.
     * 
     */
    @Export(name="bfd", type=RouterPeerBfd.class, parameters={})
    private Output<RouterPeerBfd> bfd;

    /**
     * @return BFD configuration for the BGP peering.
     * Structure is documented below.
     * 
     */
    public Output<RouterPeerBfd> getBfd() {
        return this.bfd;
    }
    /**
     * The status of the BGP peer connection. If set to false, any active session
     * with the peer is terminated and all associated routing information is removed.
     * If set to true, the peer connection can be established with routing information.
     * The default is true.
     * 
     */
    @Export(name="enable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enable;

    /**
     * @return The status of the BGP peer connection. If set to false, any active session
     * with the peer is terminated and all associated routing information is removed.
     * If set to true, the peer connection can be established with routing information.
     * The default is true.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnable() {
        return this.enable;
    }
    /**
     * Name of the interface the BGP peer is associated with.
     * 
     */
    @Export(name="interface", type=String.class, parameters={})
    private Output<String> interface_;

    /**
     * @return Name of the interface the BGP peer is associated with.
     * 
     */
    public Output<String> getInterface_() {
        return this.interface_;
    }
    /**
     * IP address of the interface inside Google Cloud Platform.
     * Only IPv4 is supported.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return IP address of the interface inside Google Cloud Platform.
     * Only IPv4 is supported.
     * 
     */
    public Output<String> getIpAddress() {
        return this.ipAddress;
    }
    /**
     * The resource that configures and manages this BGP peer. * 'MANAGED_BY_USER' is the default value and can be managed by
     * you or other users * 'MANAGED_BY_ATTACHMENT' is a BGP peer that is configured and managed by Cloud Interconnect,
     * specifically by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type
     * of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    @Export(name="managementType", type=String.class, parameters={})
    private Output<String> managementType;

    /**
     * @return The resource that configures and manages this BGP peer. * 'MANAGED_BY_USER' is the default value and can be managed by
     * you or other users * 'MANAGED_BY_ATTACHMENT' is a BGP peer that is configured and managed by Cloud Interconnect,
     * specifically by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type
     * of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    public Output<String> getManagementType() {
        return this.managementType;
    }
    /**
     * Name of this BGP peer. The name must be 1-63 characters long,
     * and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this BGP peer. The name must be 1-63 characters long,
     * and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Peer BGP Autonomous System Number (ASN).
     * Each BGP interface may use a different value.
     * 
     */
    @Export(name="peerAsn", type=Integer.class, parameters={})
    private Output<Integer> peerAsn;

    /**
     * @return Peer BGP Autonomous System Number (ASN).
     * Each BGP interface may use a different value.
     * 
     */
    public Output<Integer> getPeerAsn() {
        return this.peerAsn;
    }
    /**
     * IP address of the BGP interface outside Google Cloud Platform.
     * Only IPv4 is supported.
     * 
     */
    @Export(name="peerIpAddress", type=String.class, parameters={})
    private Output<String> peerIpAddress;

    /**
     * @return IP address of the BGP interface outside Google Cloud Platform.
     * Only IPv4 is supported.
     * 
     */
    public Output<String> getPeerIpAddress() {
        return this.peerIpAddress;
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
     * Region where the router and BgpPeer reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where the router and BgpPeer reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The name of the Cloud Router in which this BgpPeer will be configured.
     * 
     */
    @Export(name="router", type=String.class, parameters={})
    private Output<String> router;

    /**
     * @return The name of the Cloud Router in which this BgpPeer will be configured.
     * 
     */
    public Output<String> getRouter() {
        return this.router;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouterPeer(String name) {
        this(name, RouterPeerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouterPeer(String name, RouterPeerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouterPeer(String name, RouterPeerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerPeer:RouterPeer", name, args == null ? RouterPeerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouterPeer(String name, Output<String> id, @Nullable RouterPeerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerPeer:RouterPeer", name, state, makeResourceOptions(options, id));
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
    public static RouterPeer get(String name, Output<String> id, @Nullable RouterPeerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RouterPeer(name, id, state, options);
    }
}
