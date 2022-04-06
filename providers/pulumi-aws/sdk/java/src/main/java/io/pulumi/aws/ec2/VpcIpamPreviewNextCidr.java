// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcIpamPreviewNextCidrArgs;
import io.pulumi.aws.ec2.inputs.VpcIpamPreviewNextCidrState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Previews a CIDR from an IPAM address pool. Only works for private IPv4.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:ec2/vpcIpamPreviewNextCidr:VpcIpamPreviewNextCidr")
public class VpcIpamPreviewNextCidr extends io.pulumi.resources.CustomResource {
    /**
     * The previewed CIDR from the pool.
     * 
     */
    @Export(name="cidr", type=String.class, parameters={})
    private Output<String> cidr;

    /**
     * @return The previewed CIDR from the pool.
     * 
     */
    public Output<String> getCidr() {
        return this.cidr;
    }
    /**
     * Exclude a particular CIDR range from being returned by the pool.
     * 
     */
    @Export(name="disallowedCidrs", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> disallowedCidrs;

    /**
     * @return Exclude a particular CIDR range from being returned by the pool.
     * 
     */
    public Output</* @Nullable */ List<String>> getDisallowedCidrs() {
        return this.disallowedCidrs;
    }
    /**
     * The ID of the pool to which you want to assign a CIDR.
     * 
     */
    @Export(name="ipamPoolId", type=String.class, parameters={})
    private Output<String> ipamPoolId;

    /**
     * @return The ID of the pool to which you want to assign a CIDR.
     * 
     */
    public Output<String> getIpamPoolId() {
        return this.ipamPoolId;
    }
    /**
     * The netmask length of the CIDR you would like to preview from the IPAM pool.
     * 
     */
    @Export(name="netmaskLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> netmaskLength;

    /**
     * @return The netmask length of the CIDR you would like to preview from the IPAM pool.
     * 
     */
    public Output</* @Nullable */ Integer> getNetmaskLength() {
        return this.netmaskLength;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcIpamPreviewNextCidr(String name) {
        this(name, VpcIpamPreviewNextCidrArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcIpamPreviewNextCidr(String name, VpcIpamPreviewNextCidrArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpamPreviewNextCidr(String name, VpcIpamPreviewNextCidrArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamPreviewNextCidr:VpcIpamPreviewNextCidr", name, args == null ? VpcIpamPreviewNextCidrArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VpcIpamPreviewNextCidr(String name, Output<String> id, @Nullable VpcIpamPreviewNextCidrState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamPreviewNextCidr:VpcIpamPreviewNextCidr", name, state, makeResourceOptions(options, id));
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
    public static VpcIpamPreviewNextCidr get(String name, Output<String> id, @Nullable VpcIpamPreviewNextCidrState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpamPreviewNextCidr(name, id, state, options);
    }
}