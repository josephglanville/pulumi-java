// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Core.VirtualNetworkArgs;
import com.pulumi.oci.Core.inputs.VirtualNetworkState;
import com.pulumi.oci.Core.outputs.VirtualNetworkByoipv6cidrDetail;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="oci:Core/virtualNetwork:VirtualNetwork")
public class VirtualNetwork extends com.pulumi.resources.CustomResource {
    @Export(name="byoipv6cidrBlocks", type=List.class, parameters={String.class})
    private Output<List<String>> byoipv6cidrBlocks;

    public Output<List<String>> byoipv6cidrBlocks() {
        return this.byoipv6cidrBlocks;
    }
    @Export(name="byoipv6cidrDetails", type=List.class, parameters={VirtualNetworkByoipv6cidrDetail.class})
    private Output<List<VirtualNetworkByoipv6cidrDetail>> byoipv6cidrDetails;

    public Output<List<VirtualNetworkByoipv6cidrDetail>> byoipv6cidrDetails() {
        return this.byoipv6cidrDetails;
    }
    @Export(name="cidrBlock", type=String.class, parameters={})
    private Output<String> cidrBlock;

    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }
    @Export(name="cidrBlocks", type=List.class, parameters={String.class})
    private Output<List<String>> cidrBlocks;

    public Output<List<String>> cidrBlocks() {
        return this.cidrBlocks;
    }
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    @Export(name="defaultDhcpOptionsId", type=String.class, parameters={})
    private Output<String> defaultDhcpOptionsId;

    public Output<String> defaultDhcpOptionsId() {
        return this.defaultDhcpOptionsId;
    }
    @Export(name="defaultRouteTableId", type=String.class, parameters={})
    private Output<String> defaultRouteTableId;

    public Output<String> defaultRouteTableId() {
        return this.defaultRouteTableId;
    }
    @Export(name="defaultSecurityListId", type=String.class, parameters={})
    private Output<String> defaultSecurityListId;

    public Output<String> defaultSecurityListId() {
        return this.defaultSecurityListId;
    }
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }
    @Export(name="dnsLabel", type=String.class, parameters={})
    private Output<String> dnsLabel;

    public Output<String> dnsLabel() {
        return this.dnsLabel;
    }
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    @Export(name="ipv6cidrBlocks", type=List.class, parameters={String.class})
    private Output<List<String>> ipv6cidrBlocks;

    public Output<List<String>> ipv6cidrBlocks() {
        return this.ipv6cidrBlocks;
    }
    @Export(name="ipv6privateCidrBlocks", type=List.class, parameters={String.class})
    private Output<List<String>> ipv6privateCidrBlocks;

    public Output<List<String>> ipv6privateCidrBlocks() {
        return this.ipv6privateCidrBlocks;
    }
    @Export(name="isIpv6enabled", type=Boolean.class, parameters={})
    private Output<Boolean> isIpv6enabled;

    public Output<Boolean> isIpv6enabled() {
        return this.isIpv6enabled;
    }
    @Export(name="isOracleGuaAllocationEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isOracleGuaAllocationEnabled;

    public Output<Boolean> isOracleGuaAllocationEnabled() {
        return this.isOracleGuaAllocationEnabled;
    }
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> state() {
        return this.state;
    }
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    @Export(name="vcnDomainName", type=String.class, parameters={})
    private Output<String> vcnDomainName;

    public Output<String> vcnDomainName() {
        return this.vcnDomainName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetwork(String name) {
        this(name, VirtualNetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetwork(String name, VirtualNetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetwork(String name, VirtualNetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/virtualNetwork:VirtualNetwork", name, args == null ? VirtualNetworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualNetwork(String name, Output<String> id, @Nullable VirtualNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/virtualNetwork:VirtualNetwork", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static VirtualNetwork get(String name, Output<String> id, @Nullable VirtualNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetwork(name, id, state, options);
    }
}
