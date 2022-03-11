// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.VpnTunnelArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a VpnTunnel resource in the specified project and region using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:VpnTunnel")
public class VpnTunnel extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Detailed status message for the VPN tunnel.
     * 
     */
    @OutputExport(name="detailedStatus", type=String.class, parameters={})
    private Output<String> detailedStatus;

    /**
     * @return Detailed status message for the VPN tunnel.
     * 
     */
    public Output<String> getDetailedStatus() {
        return this.detailedStatus;
    }
    /**
     * IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
     */
    @OutputExport(name="ikeVersion", type=Integer.class, parameters={})
    private Output<Integer> ikeVersion;

    /**
     * @return IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
     */
    public Output<Integer> getIkeVersion() {
        return this.ikeVersion;
    }
    /**
     * Type of resource. Always compute#vpnTunnel for VPN tunnels.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of resource. Always compute#vpnTunnel for VPN tunnels.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this VpnTunnel, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnTunnel.
     * 
     */
    @OutputExport(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for the labels being applied to this VpnTunnel, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnTunnel.
     * 
     */
    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
     */
    @OutputExport(name="localTrafficSelector", type=List.class, parameters={String.class})
    private Output<List<String>> localTrafficSelector;

    /**
     * @return Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
     */
    public Output<List<String>> getLocalTrafficSelector() {
        return this.localTrafficSelector;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
     */
    @OutputExport(name="peerExternalGateway", type=String.class, parameters={})
    private Output<String> peerExternalGateway;

    /**
     * @return URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
     */
    public Output<String> getPeerExternalGateway() {
        return this.peerExternalGateway;
    }
    /**
     * The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
     */
    @OutputExport(name="peerExternalGatewayInterface", type=Integer.class, parameters={})
    private Output<Integer> peerExternalGatewayInterface;

    /**
     * @return The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
     */
    public Output<Integer> getPeerExternalGatewayInterface() {
        return this.peerExternalGatewayInterface;
    }
    /**
     * URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
     */
    @OutputExport(name="peerGcpGateway", type=String.class, parameters={})
    private Output<String> peerGcpGateway;

    /**
     * @return URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
     */
    public Output<String> getPeerGcpGateway() {
        return this.peerGcpGateway;
    }
    /**
     * IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    @OutputExport(name="peerIp", type=String.class, parameters={})
    private Output<String> peerIp;

    /**
     * @return IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    public Output<String> getPeerIp() {
        return this.peerIp;
    }
    /**
     * URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
     */
    @OutputExport(name="remoteTrafficSelector", type=List.class, parameters={String.class})
    private Output<List<String>> remoteTrafficSelector;

    /**
     * @return Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
     */
    public Output<List<String>> getRemoteTrafficSelector() {
        return this.remoteTrafficSelector;
    }
    /**
     * URL of the router resource to be used for dynamic routing.
     * 
     */
    @OutputExport(name="router", type=String.class, parameters={})
    private Output<String> router;

    /**
     * @return URL of the router resource to be used for dynamic routing.
     * 
     */
    public Output<String> getRouter() {
        return this.router;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
     */
    @OutputExport(name="sharedSecret", type=String.class, parameters={})
    private Output<String> sharedSecret;

    /**
     * @return Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
     */
    public Output<String> getSharedSecret() {
        return this.sharedSecret;
    }
    /**
     * Hash of the shared secret.
     * 
     */
    @OutputExport(name="sharedSecretHash", type=String.class, parameters={})
    private Output<String> sharedSecretHash;

    /**
     * @return Hash of the shared secret.
     * 
     */
    public Output<String> getSharedSecretHash() {
        return this.sharedSecretHash;
    }
    /**
     * The status of the VPN tunnel, which can be one of the following: - PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used. - NO_INCOMING_PACKETS: No incoming packets from peer. - REJECTED: Tunnel configuration was rejected, can be result of being denied access. - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources. - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state. - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT. - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the VPN tunnel, which can be one of the following: - PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used. - NO_INCOMING_PACKETS: No incoming packets from peer. - REJECTED: Tunnel configuration was rejected, can be result of being denied access. - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources. - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state. - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT. - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
     */
    @OutputExport(name="targetVpnGateway", type=String.class, parameters={})
    private Output<String> targetVpnGateway;

    /**
     * @return URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
     */
    public Output<String> getTargetVpnGateway() {
        return this.targetVpnGateway;
    }
    /**
     * URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
     */
    @OutputExport(name="vpnGateway", type=String.class, parameters={})
    private Output<String> vpnGateway;

    /**
     * @return URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
     */
    public Output<String> getVpnGateway() {
        return this.vpnGateway;
    }
    /**
     * The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    @OutputExport(name="vpnGatewayInterface", type=Integer.class, parameters={})
    private Output<Integer> vpnGatewayInterface;

    /**
     * @return The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    public Output<Integer> getVpnGatewayInterface() {
        return this.vpnGatewayInterface;
    }

    public interface BuilderApplicator {
        public void apply(VpnTunnelArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_beta.VpnTunnelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_beta.VpnTunnelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VpnTunnel(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpnTunnel(String name) {
        this(name, VpnTunnelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpnTunnel(String name, VpnTunnelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpnTunnel(String name, VpnTunnelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:VpnTunnel", name, args == null ? VpnTunnelArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VpnTunnel(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:VpnTunnel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static VpnTunnel get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpnTunnel(name, id, options);
    }
}
