// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.VPCDHCPOptionsAssociationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Associates a set of DHCP options with a VPC, or associates no DHCP options with the VPC.
 * 
 */
@ResourceType(type="aws-native:ec2:VPCDHCPOptionsAssociation")
public class VPCDHCPOptionsAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the DHCP options set, or default to associate no DHCP options with the VPC.
     * 
     */
    @Export(name="dhcpOptionsId", type=String.class, parameters={})
    private Output<String> dhcpOptionsId;

    /**
     * @return The ID of the DHCP options set, or default to associate no DHCP options with the VPC.
     * 
     */
    public Output<String> getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }
    /**
     * The ID of the VPC.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(VPCDHCPOptionsAssociationArgs.Builder a);
    }
    private static io.pulumi.awsnative.ec2.VPCDHCPOptionsAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ec2.VPCDHCPOptionsAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VPCDHCPOptionsAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VPCDHCPOptionsAssociation(String name) {
        this(name, VPCDHCPOptionsAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VPCDHCPOptionsAssociation(String name, VPCDHCPOptionsAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VPCDHCPOptionsAssociation(String name, VPCDHCPOptionsAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:VPCDHCPOptionsAssociation", name, args == null ? VPCDHCPOptionsAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VPCDHCPOptionsAssociation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:VPCDHCPOptionsAssociation", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VPCDHCPOptionsAssociation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VPCDHCPOptionsAssociation(name, id, options);
    }
}
