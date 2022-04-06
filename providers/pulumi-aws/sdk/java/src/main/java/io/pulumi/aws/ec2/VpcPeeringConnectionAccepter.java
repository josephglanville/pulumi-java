// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs;
import io.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterState;
import io.pulumi.aws.ec2.outputs.VpcPeeringConnectionAccepterAccepter;
import io.pulumi.aws.ec2.outputs.VpcPeeringConnectionAccepterRequester;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage the accepter's side of a VPC Peering Connection.
 * 
 * When a cross-account (requester's AWS account differs from the accepter's AWS account) or an inter-region
 * VPC Peering Connection is created, a VPC Peering Connection resource is automatically created in the
 * accepter's account.
 * The requester can use the `aws.ec2.VpcPeeringConnection` resource to manage its side of the connection
 * and the accepter can use the `aws.ec2.VpcPeeringConnectionAccepter` resource to "adopt" its side of the
 * connection into management.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * VPC Peering Connection Accepters can be imported by using the Peering Connection ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcPeeringConnectionAccepter:VpcPeeringConnectionAccepter example pcx-12345678
 * ```
 * 
 *  Certain resource arguments, like `auto_accept`, do not have an EC2 API method for reading the information after peering connection creation. If the argument is set in the provider configuration on an imported resource, this provder will always show a difference. To workaround this behavior, either omit the argument from the configuration or use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) to hide the difference, e.g. terraform resource "aws_vpc_peering_connection_accepter" "example" {
 * 
 * # ... other configuration ...
 * 
 * # There is no AWS EC2 API for reading auto_accept
 * 
 *  lifecycle {
 * 
 *  ignore_changes = [auto_accept]
 * 
 *  } }
 * 
 */
@ResourceType(type="aws:ec2/vpcPeeringConnectionAccepter:VpcPeeringConnectionAccepter")
public class VpcPeeringConnectionAccepter extends io.pulumi.resources.CustomResource {
    /**
     * The status of the VPC Peering Connection request.
     * 
     */
    @Export(name="acceptStatus", type=String.class, parameters={})
    private Output<String> acceptStatus;

    /**
     * @return The status of the VPC Peering Connection request.
     * 
     */
    public Output<String> getAcceptStatus() {
        return this.acceptStatus;
    }
    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
     * 
     */
    @Export(name="accepter", type=VpcPeeringConnectionAccepterAccepter.class, parameters={})
    private Output<VpcPeeringConnectionAccepterAccepter> accepter;

    /**
     * @return A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
     * 
     */
    public Output<VpcPeeringConnectionAccepterAccepter> getAccepter() {
        return this.accepter;
    }
    /**
     * Whether or not to accept the peering request. Defaults to `false`.
     * 
     */
    @Export(name="autoAccept", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoAccept;

    /**
     * @return Whether or not to accept the peering request. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoAccept() {
        return this.autoAccept;
    }
    /**
     * The AWS account ID of the owner of the requester VPC.
     * 
     */
    @Export(name="peerOwnerId", type=String.class, parameters={})
    private Output<String> peerOwnerId;

    /**
     * @return The AWS account ID of the owner of the requester VPC.
     * 
     */
    public Output<String> getPeerOwnerId() {
        return this.peerOwnerId;
    }
    /**
     * The region of the accepter VPC.
     * 
     */
    @Export(name="peerRegion", type=String.class, parameters={})
    private Output<String> peerRegion;

    /**
     * @return The region of the accepter VPC.
     * 
     */
    public Output<String> getPeerRegion() {
        return this.peerRegion;
    }
    /**
     * The ID of the requester VPC.
     * 
     */
    @Export(name="peerVpcId", type=String.class, parameters={})
    private Output<String> peerVpcId;

    /**
     * @return The ID of the requester VPC.
     * 
     */
    public Output<String> getPeerVpcId() {
        return this.peerVpcId;
    }
    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
     * 
     */
    @Export(name="requester", type=VpcPeeringConnectionAccepterRequester.class, parameters={})
    private Output<VpcPeeringConnectionAccepterRequester> requester;

    /**
     * @return A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
     * 
     */
    public Output<VpcPeeringConnectionAccepterRequester> getRequester() {
        return this.requester;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The ID of the accepter VPC.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the accepter VPC.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }
    /**
     * The VPC Peering Connection ID to manage.
     * 
     */
    @Export(name="vpcPeeringConnectionId", type=String.class, parameters={})
    private Output<String> vpcPeeringConnectionId;

    /**
     * @return The VPC Peering Connection ID to manage.
     * 
     */
    public Output<String> getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcPeeringConnectionAccepter(String name) {
        this(name, VpcPeeringConnectionAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcPeeringConnectionAccepter(String name, VpcPeeringConnectionAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcPeeringConnectionAccepter(String name, VpcPeeringConnectionAccepterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcPeeringConnectionAccepter:VpcPeeringConnectionAccepter", name, args == null ? VpcPeeringConnectionAccepterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VpcPeeringConnectionAccepter(String name, Output<String> id, @Nullable VpcPeeringConnectionAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcPeeringConnectionAccepter:VpcPeeringConnectionAccepter", name, state, makeResourceOptions(options, id));
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
    public static VpcPeeringConnectionAccepter get(String name, Output<String> id, @Nullable VpcPeeringConnectionAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcPeeringConnectionAccepter(name, id, state, options);
    }
}