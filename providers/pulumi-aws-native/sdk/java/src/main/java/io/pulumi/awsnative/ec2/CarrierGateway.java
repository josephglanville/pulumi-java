// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.CarrierGatewayArgs;
import io.pulumi.awsnative.ec2.outputs.CarrierGatewayTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 */
@ResourceType(type="aws-native:ec2:CarrierGateway")
public class CarrierGateway extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the carrier gateway.
     * 
     */
    @OutputExport(name="carrierGatewayId", type=String.class, parameters={})
    private Output<String> carrierGatewayId;

    /**
     * @return The ID of the carrier gateway.
     * 
     */
    public Output<String> getCarrierGatewayId() {
        return this.carrierGatewayId;
    }
    /**
     * The ID of the owner.
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The ID of the owner.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * The state of the carrier gateway.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the carrier gateway.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The tags for the carrier gateway.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={CarrierGatewayTag.class})
    private Output</* @Nullable */ List<CarrierGatewayTag>> tags;

    /**
     * @return The tags for the carrier gateway.
     * 
     */
    public Output</* @Nullable */ List<CarrierGatewayTag>> getTags() {
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
    public CarrierGateway(String name) {
        this(name, CarrierGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CarrierGateway(String name, CarrierGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CarrierGateway(String name, CarrierGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:CarrierGateway", name, args == null ? CarrierGatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CarrierGateway(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:CarrierGateway", name, null, makeResourceOptions(options, id));
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
    public static CarrierGateway get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CarrierGateway(name, id, options);
    }
}
