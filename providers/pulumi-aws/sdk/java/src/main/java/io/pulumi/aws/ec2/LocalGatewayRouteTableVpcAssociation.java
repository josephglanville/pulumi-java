// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.LocalGatewayRouteTableVpcAssociationArgs;
import io.pulumi.aws.ec2.inputs.LocalGatewayRouteTableVpcAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an EC2 Local Gateway Route Table VPC Association. More information can be found in the [Outposts User Guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-local-gateways.html#vpc-associations).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_ec2_local_gateway_route_table_vpc_association` can be imported by using the Local Gateway Route Table VPC Association identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/localGatewayRouteTableVpcAssociation:LocalGatewayRouteTableVpcAssociation example lgw-vpc-assoc-1234567890abcdef
 * ```
 * 
 */
@ResourceType(type="aws:ec2/localGatewayRouteTableVpcAssociation:LocalGatewayRouteTableVpcAssociation")
public class LocalGatewayRouteTableVpcAssociation extends io.pulumi.resources.CustomResource {
    @Export(name="localGatewayId", type=String.class, parameters={})
    private Output<String> localGatewayId;

    public Output<String> getLocalGatewayId() {
        return this.localGatewayId;
    }
    /**
     * Identifier of EC2 Local Gateway Route Table.
     * 
     */
    @Export(name="localGatewayRouteTableId", type=String.class, parameters={})
    private Output<String> localGatewayRouteTableId;

    /**
     * @return Identifier of EC2 Local Gateway Route Table.
     * 
     */
    public Output<String> getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
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
     * Identifier of EC2 VPC.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return Identifier of EC2 VPC.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(LocalGatewayRouteTableVpcAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.LocalGatewayRouteTableVpcAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.LocalGatewayRouteTableVpcAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LocalGatewayRouteTableVpcAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocalGatewayRouteTableVpcAssociation(String name) {
        this(name, LocalGatewayRouteTableVpcAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocalGatewayRouteTableVpcAssociation(String name, LocalGatewayRouteTableVpcAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocalGatewayRouteTableVpcAssociation(String name, LocalGatewayRouteTableVpcAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/localGatewayRouteTableVpcAssociation:LocalGatewayRouteTableVpcAssociation", name, args == null ? LocalGatewayRouteTableVpcAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LocalGatewayRouteTableVpcAssociation(String name, Output<String> id, @Nullable LocalGatewayRouteTableVpcAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/localGatewayRouteTableVpcAssociation:LocalGatewayRouteTableVpcAssociation", name, state, makeResourceOptions(options, id));
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
    public static LocalGatewayRouteTableVpcAssociation get(String name, Output<String> id, @Nullable LocalGatewayRouteTableVpcAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocalGatewayRouteTableVpcAssociation(name, id, state, options);
    }
}
