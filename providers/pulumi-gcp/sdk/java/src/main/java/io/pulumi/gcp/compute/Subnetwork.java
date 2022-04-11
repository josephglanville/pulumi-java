// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.SubnetworkArgs;
import io.pulumi.gcp.compute.inputs.SubnetworkState;
import io.pulumi.gcp.compute.outputs.SubnetworkLogConfig;
import io.pulumi.gcp.compute.outputs.SubnetworkSecondaryIpRange;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A VPC network is a virtual version of the traditional physical networks
 * that exist within and between physical data centers. A VPC network
 * provides connectivity for your Compute Engine virtual machine (VM)
 * instances, Container Engine containers, App Engine Flex services, and
 * other network-related resources.
 * 
 * Each GCP project contains one or more VPC networks. Each VPC network is a
 * global entity spanning all GCP regions. This global VPC network allows VM
 * instances and other resources to communicate with each other via internal,
 * private IP addresses.
 * 
 * Each VPC network is subdivided into subnets, and each subnet is contained
 * within a single region. You can have more than one subnet in a region for
 * a given VPC network. Each subnet has a contiguous private RFC1918 IP
 * space. You create instances, containers, and the like in these subnets.
 * When you create an instance, you must create it in a subnet, and the
 * instance draws its internal IP address from that subnet.
 * 
 * Virtual machine (VM) instances in a VPC network can communicate with
 * instances in all other subnets of the same VPC network, regardless of
 * region, using their RFC1918 private IP addresses. You can isolate portions
 * of the network, even entire subnets, using firewall rules.
 * 
 * To get more information about Subnetwork, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/subnetworks)
 * * How-to Guides
 *     * [Private Google Access](https://cloud.google.com/vpc/docs/configure-private-google-access)
 *     * [Cloud Networking](https://cloud.google.com/vpc/docs/using-vpc)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Subnetwork can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/subnetwork:Subnetwork default projects/{{project}}/regions/{{region}}/subnetworks/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/subnetwork:Subnetwork default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/subnetwork:Subnetwork default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/subnetwork:Subnetwork default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/subnetwork:Subnetwork")
public class Subnetwork extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource. This field can be set only at resource
     * creation time.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property when
     * you create the resource. This field can be set only at resource
     * creation time.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The range of external IPv6 addresses that are owned by this subnetwork.
     * 
     */
    @Export(name="externalIpv6Prefix", type=String.class, parameters={})
    private Output<String> externalIpv6Prefix;

    /**
     * @return The range of external IPv6 addresses that are owned by this subnetwork.
     * 
     */
    public Output<String> getExternalIpv6Prefix() {
        return this.externalIpv6Prefix;
    }
    /**
     * Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     * @Deprecated
     * This field is not useful for users, and has been removed as an output.
     * 
     */
    @Deprecated /* This field is not useful for users, and has been removed as an output. */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
     */
    @Export(name="gatewayAddress", type=String.class, parameters={})
    private Output<String> gatewayAddress;

    /**
     * @return The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
     */
    public Output<String> getGatewayAddress() {
        return this.gatewayAddress;
    }
    /**
     * The range of IP addresses belonging to this subnetwork secondary
     * range. Provide this property when you create the subnetwork.
     * Ranges must be unique and non-overlapping with all primary and
     * secondary IP ranges within a network. Only IPv4 is supported.
     * 
     */
    @Export(name="ipCidrRange", type=String.class, parameters={})
    private Output<String> ipCidrRange;

    /**
     * @return The range of IP addresses belonging to this subnetwork secondary
     * range. Provide this property when you create the subnetwork.
     * Ranges must be unique and non-overlapping with all primary and
     * secondary IP ranges within a network. Only IPv4 is supported.
     * 
     */
    public Output<String> getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation
     * or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet
     * cannot enable direct path.
     * Possible values are `EXTERNAL`.
     * 
     */
    @Export(name="ipv6AccessType", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipv6AccessType;

    /**
     * @return The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation
     * or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet
     * cannot enable direct path.
     * Possible values are `EXTERNAL`.
     * 
     */
    public Output</* @Nullable */ String> getIpv6AccessType() {
        return this.ipv6AccessType;
    }
    /**
     * The range of internal IPv6 addresses that are owned by this subnetwork.
     * 
     */
    @Export(name="ipv6CidrRange", type=String.class, parameters={})
    private Output<String> ipv6CidrRange;

    /**
     * @return The range of internal IPv6 addresses that are owned by this subnetwork.
     * 
     */
    public Output<String> getIpv6CidrRange() {
        return this.ipv6CidrRange;
    }
    /**
     * Denotes the logging options for the subnetwork flow logs. If logging is enabled
     * logs will be exported to Stackdriver. This field cannot be set if the `purpose` of this
     * subnetwork is `INTERNAL_HTTPS_LOAD_BALANCER`
     * Structure is documented below.
     * 
     */
    @Export(name="logConfig", type=SubnetworkLogConfig.class, parameters={})
    private Output</* @Nullable */ SubnetworkLogConfig> logConfig;

    /**
     * @return Denotes the logging options for the subnetwork flow logs. If logging is enabled
     * logs will be exported to Stackdriver. This field cannot be set if the `purpose` of this
     * subnetwork is `INTERNAL_HTTPS_LOAD_BALANCER`
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ SubnetworkLogConfig> getLogConfig() {
        return this.logConfig;
    }
    /**
     * The name of the resource, provided by the client when initially
     * creating the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially
     * creating the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
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
     * The network this subnet belongs to.
     * Only networks that are in the distributed mode can have subnetworks.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The network this subnet belongs to.
     * Only networks that are in the distributed mode can have subnetworks.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * When enabled, VMs in this subnetwork without external IP addresses can
     * access Google APIs and services by using Private Google Access.
     * 
     */
    @Export(name="privateIpGoogleAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> privateIpGoogleAccess;

    /**
     * @return When enabled, VMs in this subnetwork without external IP addresses can
     * access Google APIs and services by using Private Google Access.
     * 
     */
    public Output</* @Nullable */ Boolean> getPrivateIpGoogleAccess() {
        return this.privateIpGoogleAccess;
    }
    /**
     * The private IPv6 google access type for the VMs in this subnet.
     * 
     */
    @Export(name="privateIpv6GoogleAccess", type=String.class, parameters={})
    private Output<String> privateIpv6GoogleAccess;

    /**
     * @return The private IPv6 google access type for the VMs in this subnet.
     * 
     */
    public Output<String> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
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
     * The purpose of the resource. A subnetwork with purpose set to
     * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
     * reserved for Internal HTTP(S) Load Balancing.
     * If set to INTERNAL_HTTPS_LOAD_BALANCER you must also set the `role` field.
     * 
     */
    @Export(name="purpose", type=String.class, parameters={})
    private Output<String> purpose;

    /**
     * @return The purpose of the resource. A subnetwork with purpose set to
     * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
     * reserved for Internal HTTP(S) Load Balancing.
     * If set to INTERNAL_HTTPS_LOAD_BALANCER you must also set the `role` field.
     * 
     */
    public Output<String> getPurpose() {
        return this.purpose;
    }
    /**
     * The GCP region for this subnetwork.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The GCP region for this subnetwork.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The role of subnetwork. Currently, this field is only used when
     * purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE
     * or BACKUP. An ACTIVE subnetwork is one that is currently being used
     * for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that
     * is ready to be promoted to ACTIVE or is currently draining.
     * Possible values are `ACTIVE` and `BACKUP`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output</* @Nullable */ String> role;

    /**
     * @return The role of subnetwork. Currently, this field is only used when
     * purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE
     * or BACKUP. An ACTIVE subnetwork is one that is currently being used
     * for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that
     * is ready to be promoted to ACTIVE or is currently draining.
     * Possible values are `ACTIVE` and `BACKUP`.
     * 
     */
    public Output</* @Nullable */ String> getRole() {
        return this.role;
    }
    /**
     * An array of configurations for secondary IP ranges for VM instances
     * contained in this subnetwork. The primary IP of such VM must belong
     * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
     * to either primary or secondary ranges.
     * Structure is documented below.
     * 
     */
    @Export(name="secondaryIpRanges", type=List.class, parameters={SubnetworkSecondaryIpRange.class})
    private Output<List<SubnetworkSecondaryIpRange>> secondaryIpRanges;

    /**
     * @return An array of configurations for secondary IP ranges for VM instances
     * contained in this subnetwork. The primary IP of such VM must belong
     * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
     * to either primary or secondary ranges.
     * Structure is documented below.
     * 
     */
    public Output<List<SubnetworkSecondaryIpRange>> getSecondaryIpRanges() {
        return this.secondaryIpRanges;
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
    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not.
     * If not specified IPV4_ONLY will be used.
     * Possible values are `IPV4_ONLY` and `IPV4_IPV6`.
     * 
     */
    @Export(name="stackType", type=String.class, parameters={})
    private Output<String> stackType;

    /**
     * @return The stack type for this subnet to identify whether the IPv6 feature is enabled or not.
     * If not specified IPV4_ONLY will be used.
     * Possible values are `IPV4_ONLY` and `IPV4_IPV6`.
     * 
     */
    public Output<String> getStackType() {
        return this.stackType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subnetwork(String name) {
        this(name, SubnetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subnetwork(String name, SubnetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subnetwork(String name, SubnetworkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/subnetwork:Subnetwork", name, args == null ? SubnetworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Subnetwork(String name, Output<String> id, @Nullable SubnetworkState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/subnetwork:Subnetwork", name, state, makeResourceOptions(options, id));
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
    public static Subnetwork get(String name, Output<String> id, @Nullable SubnetworkState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Subnetwork(name, id, state, options);
    }
}
