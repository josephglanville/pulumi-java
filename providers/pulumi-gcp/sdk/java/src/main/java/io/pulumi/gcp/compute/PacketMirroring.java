// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.PacketMirroringArgs;
import io.pulumi.gcp.compute.inputs.PacketMirroringState;
import io.pulumi.gcp.compute.outputs.PacketMirroringCollectorIlb;
import io.pulumi.gcp.compute.outputs.PacketMirroringFilter;
import io.pulumi.gcp.compute.outputs.PacketMirroringMirroredResources;
import io.pulumi.gcp.compute.outputs.PacketMirroringNetwork;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Packet Mirroring mirrors traffic to and from particular VM instances.
 * You can use the collected traffic to help you detect security threats
 * and monitor application performance.
 * 
 * To get more information about PacketMirroring, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/packetMirrorings)
 * * How-to Guides
 *     * [Using Packet Mirroring](https://cloud.google.com/vpc/docs/using-packet-mirroring#creating)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * PacketMirroring can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/packetMirroring:PacketMirroring default projects/{{project}}/regions/{{region}}/packetMirrorings/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/packetMirroring:PacketMirroring default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/packetMirroring:PacketMirroring default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/packetMirroring:PacketMirroring default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/packetMirroring:PacketMirroring")
public class PacketMirroring extends io.pulumi.resources.CustomResource {
    /**
     * The Forwarding Rule resource (of type load_balancing_scheme=INTERNAL)
     * that will be used as collector for mirrored traffic. The
     * specified forwarding rule must have is_mirroring_collector
     * set to true.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="collectorIlb", type=PacketMirroringCollectorIlb.class, parameters={})
    private Output<PacketMirroringCollectorIlb> collectorIlb;

    /**
     * @return The Forwarding Rule resource (of type load_balancing_scheme=INTERNAL)
     * that will be used as collector for mirrored traffic. The
     * specified forwarding rule must have is_mirroring_collector
     * set to true.
     * Structure is documented below.
     * 
     */
    public Output<PacketMirroringCollectorIlb> getCollectorIlb() {
        return this.collectorIlb;
    }
    /**
     * A human-readable description of the rule.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description of the rule.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A filter for mirrored traffic.  If unset, all traffic is mirrored.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="filter", type=PacketMirroringFilter.class, parameters={})
    private Output</* @Nullable */ PacketMirroringFilter> filter;

    /**
     * @return A filter for mirrored traffic.  If unset, all traffic is mirrored.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ PacketMirroringFilter> getFilter() {
        return this.filter;
    }
    /**
     * A means of specifying which resources to mirror.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="mirroredResources", type=PacketMirroringMirroredResources.class, parameters={})
    private Output<PacketMirroringMirroredResources> mirroredResources;

    /**
     * @return A means of specifying which resources to mirror.
     * Structure is documented below.
     * 
     */
    public Output<PacketMirroringMirroredResources> getMirroredResources() {
        return this.mirroredResources;
    }
    /**
     * The name of the packet mirroring rule
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the packet mirroring rule
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the mirrored VPC network. Only packets in this network
     * will be mirrored. All mirrored VMs should have a NIC in the given
     * network. All mirrored subnetworks should belong to the given network.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="network", type=PacketMirroringNetwork.class, parameters={})
    private Output<PacketMirroringNetwork> network;

    /**
     * @return Specifies the mirrored VPC network. Only packets in this network
     * will be mirrored. All mirrored VMs should have a NIC in the given
     * network. All mirrored subnetworks should belong to the given network.
     * Structure is documented below.
     * 
     */
    public Output<PacketMirroringNetwork> getNetwork() {
        return this.network;
    }
    /**
     * Since only one rule can be active at a time, priority is
     * used to break ties in the case of two rules that apply to
     * the same instances.
     * 
     */
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return Since only one rule can be active at a time, priority is
     * used to break ties in the case of two rules that apply to
     * the same instances.
     * 
     */
    public Output<Integer> getPriority() {
        return this.priority;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
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
     * The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The Region in which the created address should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PacketMirroring(String name) {
        this(name, PacketMirroringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PacketMirroring(String name, PacketMirroringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PacketMirroring(String name, PacketMirroringArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/packetMirroring:PacketMirroring", name, args == null ? PacketMirroringArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PacketMirroring(String name, Input<String> id, @Nullable PacketMirroringState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/packetMirroring:PacketMirroring", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PacketMirroring get(String name, Input<String> id, @Nullable PacketMirroringState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PacketMirroring(name, id, state, options);
    }
}
