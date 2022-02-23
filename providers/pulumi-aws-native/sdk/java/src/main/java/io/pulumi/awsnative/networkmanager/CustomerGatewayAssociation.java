// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkmanager.CustomerGatewayAssociationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The AWS::NetworkManager::CustomerGatewayAssociation type associates a customer gateway with a device and optionally, with a link.
 * 
 */
@ResourceType(type="aws-native:networkmanager:CustomerGatewayAssociation")
public class CustomerGatewayAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the customer gateway.
     * 
     */
    @OutputExport(name="customerGatewayArn", type=String.class, parameters={})
    private Output<String> customerGatewayArn;

    /**
     * @return The Amazon Resource Name (ARN) of the customer gateway.
     * 
     */
    public Output<String> getCustomerGatewayArn() {
        return this.customerGatewayArn;
    }
    /**
     * The ID of the device
     * 
     */
    @OutputExport(name="deviceId", type=String.class, parameters={})
    private Output<String> deviceId;

    /**
     * @return The ID of the device
     * 
     */
    public Output<String> getDeviceId() {
        return this.deviceId;
    }
    /**
     * The ID of the global network.
     * 
     */
    @OutputExport(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * The ID of the link
     * 
     */
    @OutputExport(name="linkId", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkId;

    /**
     * @return The ID of the link
     * 
     */
    public Output</* @Nullable */ String> getLinkId() {
        return this.linkId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomerGatewayAssociation(String name) {
        this(name, CustomerGatewayAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomerGatewayAssociation(String name, CustomerGatewayAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomerGatewayAssociation(String name, CustomerGatewayAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:CustomerGatewayAssociation", name, args == null ? CustomerGatewayAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CustomerGatewayAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:CustomerGatewayAssociation", name, null, makeResourceOptions(options, id));
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
    public static CustomerGatewayAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomerGatewayAssociation(name, id, options);
    }
}
