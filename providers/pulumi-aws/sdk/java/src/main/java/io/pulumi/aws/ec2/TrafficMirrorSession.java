// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.TrafficMirrorSessionArgs;
import io.pulumi.aws.ec2.inputs.TrafficMirrorSessionState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Traffic mirror session.\
 * Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Traffic mirror sessions can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/trafficMirrorSession:TrafficMirrorSession session tms-0d8aa3ca35897b82e
 * ```
 * 
 */
@ResourceType(type="aws:ec2/trafficMirrorSession:TrafficMirrorSession")
public class TrafficMirrorSession extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the traffic mirror session.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the traffic mirror session.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A description of the traffic mirror session.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the traffic mirror session.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
     * 
     */
    @Export(name="networkInterfaceId", type=String.class, parameters={})
    private Output<String> networkInterfaceId;

    /**
     * @return ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
     * 
     */
    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The AWS account ID of the session owner.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The AWS account ID of the session owner.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
     * 
     */
    @Export(name="packetLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> packetLength;

    /**
     * @return The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
     * 
     */
    public Output</* @Nullable */ Integer> getPacketLength() {
        return this.packetLength;
    }
    /**
     * - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
     * 
     */
    @Export(name="sessionNumber", type=Integer.class, parameters={})
    private Output<Integer> sessionNumber;

    /**
     * @return - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
     * 
     */
    public Output<Integer> getSessionNumber() {
        return this.sessionNumber;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * ID of the traffic mirror filter to be used
     * 
     */
    @Export(name="trafficMirrorFilterId", type=String.class, parameters={})
    private Output<String> trafficMirrorFilterId;

    /**
     * @return ID of the traffic mirror filter to be used
     * 
     */
    public Output<String> getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }
    /**
     * ID of the traffic mirror target to be used
     * 
     */
    @Export(name="trafficMirrorTargetId", type=String.class, parameters={})
    private Output<String> trafficMirrorTargetId;

    /**
     * @return ID of the traffic mirror target to be used
     * 
     */
    public Output<String> getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }
    /**
     * - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
     * 
     */
    @Export(name="virtualNetworkId", type=Integer.class, parameters={})
    private Output<Integer> virtualNetworkId;

    /**
     * @return - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
     * 
     */
    public Output<Integer> getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrafficMirrorSession(String name) {
        this(name, TrafficMirrorSessionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficMirrorSession(String name, TrafficMirrorSessionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficMirrorSession(String name, TrafficMirrorSessionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/trafficMirrorSession:TrafficMirrorSession", name, args == null ? TrafficMirrorSessionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrafficMirrorSession(String name, Output<String> id, @Nullable TrafficMirrorSessionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/trafficMirrorSession:TrafficMirrorSession", name, state, makeResourceOptions(options, id));
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
    public static TrafficMirrorSession get(String name, Output<String> id, @Nullable TrafficMirrorSessionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TrafficMirrorSession(name, id, state, options);
    }
}
