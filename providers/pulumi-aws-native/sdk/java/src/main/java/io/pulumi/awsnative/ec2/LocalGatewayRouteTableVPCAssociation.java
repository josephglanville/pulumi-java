// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.LocalGatewayRouteTableVPCAssociationArgs;
import io.pulumi.awsnative.ec2.outputs.LocalGatewayRouteTableVPCAssociationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Describes an association between a local gateway route table and a VPC.
 * 
 */
@ResourceType(type="aws-native:ec2:LocalGatewayRouteTableVPCAssociation")
public class LocalGatewayRouteTableVPCAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the local gateway.
     * 
     */
    @OutputExport(name="localGatewayId", type=String.class, parameters={})
    private Output<String> localGatewayId;

    /**
     * @return The ID of the local gateway.
     * 
     */
    public Output<String> getLocalGatewayId() {
        return this.localGatewayId;
    }
    /**
     * The ID of the local gateway route table.
     * 
     */
    @OutputExport(name="localGatewayRouteTableId", type=String.class, parameters={})
    private Output<String> localGatewayRouteTableId;

    /**
     * @return The ID of the local gateway route table.
     * 
     */
    public Output<String> getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }
    /**
     * The ID of the association.
     * 
     */
    @OutputExport(name="localGatewayRouteTableVpcAssociationId", type=String.class, parameters={})
    private Output<String> localGatewayRouteTableVpcAssociationId;

    /**
     * @return The ID of the association.
     * 
     */
    public Output<String> getLocalGatewayRouteTableVpcAssociationId() {
        return this.localGatewayRouteTableVpcAssociationId;
    }
    /**
     * The state of the association.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the association.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The tags for the association.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={LocalGatewayRouteTableVPCAssociationTag.class})
    private Output</* @Nullable */ List<LocalGatewayRouteTableVPCAssociationTag>> tags;

    /**
     * @return The tags for the association.
     * 
     */
    public Output</* @Nullable */ List<LocalGatewayRouteTableVPCAssociationTag>> getTags() {
        return this.tags;
    }
    /**
     * The ID of the VPC.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocalGatewayRouteTableVPCAssociation(String name) {
        this(name, LocalGatewayRouteTableVPCAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocalGatewayRouteTableVPCAssociation(String name, LocalGatewayRouteTableVPCAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocalGatewayRouteTableVPCAssociation(String name, LocalGatewayRouteTableVPCAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:LocalGatewayRouteTableVPCAssociation", name, args == null ? LocalGatewayRouteTableVPCAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LocalGatewayRouteTableVPCAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:LocalGatewayRouteTableVPCAssociation", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LocalGatewayRouteTableVPCAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocalGatewayRouteTableVPCAssociation(name, id, options);
    }
}
