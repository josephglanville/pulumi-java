// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.NatGatewayArgs;
import io.pulumi.azurenative.network.outputs.NatGatewaySkuResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Nat Gateway resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:NatGateway test-natGateway /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/natGateways/test-natGateway 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:NatGateway")
public class NatGateway extends io.pulumi.resources.CustomResource {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The idle timeout of the nat gateway.
     * 
     */
    @OutputExport(name="idleTimeoutInMinutes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> idleTimeoutInMinutes;

    /**
     * @return The idle timeout of the nat gateway.
     * 
     */
    public Output</* @Nullable */ Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the NAT gateway resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the NAT gateway resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * An array of public ip addresses associated with the nat gateway resource.
     * 
     */
    @OutputExport(name="publicIpAddresses", type=List.class, parameters={SubResourceResponse.class})
    private Output</* @Nullable */ List<SubResourceResponse>> publicIpAddresses;

    /**
     * @return An array of public ip addresses associated with the nat gateway resource.
     * 
     */
    public Output</* @Nullable */ List<SubResourceResponse>> getPublicIpAddresses() {
        return this.publicIpAddresses;
    }
    /**
     * An array of public ip prefixes associated with the nat gateway resource.
     * 
     */
    @OutputExport(name="publicIpPrefixes", type=List.class, parameters={SubResourceResponse.class})
    private Output</* @Nullable */ List<SubResourceResponse>> publicIpPrefixes;

    /**
     * @return An array of public ip prefixes associated with the nat gateway resource.
     * 
     */
    public Output</* @Nullable */ List<SubResourceResponse>> getPublicIpPrefixes() {
        return this.publicIpPrefixes;
    }
    /**
     * The resource GUID property of the NAT gateway resource.
     * 
     */
    @OutputExport(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the NAT gateway resource.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The nat gateway SKU.
     * 
     */
    @OutputExport(name="sku", type=NatGatewaySkuResponse.class, parameters={})
    private Output</* @Nullable */ NatGatewaySkuResponse> sku;

    /**
     * @return The nat gateway SKU.
     * 
     */
    public Output</* @Nullable */ NatGatewaySkuResponse> getSku() {
        return this.sku;
    }
    /**
     * An array of references to the subnets using this nat gateway resource.
     * 
     */
    @OutputExport(name="subnets", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> subnets;

    /**
     * @return An array of references to the subnets using this nat gateway resource.
     * 
     */
    public Output<List<SubResourceResponse>> getSubnets() {
        return this.subnets;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
     */
    @OutputExport(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
     */
    public Output</* @Nullable */ List<String>> getZones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NatGateway(String name) {
        this(name, NatGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NatGateway(String name, NatGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NatGateway(String name, NatGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NatGateway", name, args == null ? NatGatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NatGateway(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NatGateway", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20190201:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:NatGateway").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:NatGateway").build())
            ))
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
    public static NatGateway get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NatGateway(name, id, options);
    }
}
