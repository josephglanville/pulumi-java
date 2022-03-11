// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.NetworkInterfaceSecurityGroupAttachmentArgs;
import io.pulumi.aws.ec2.inputs.NetworkInterfaceSecurityGroupAttachmentState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource attaches a security group to an Elastic Network Interface (ENI).
 * It can be used to attach a security group to any existing ENI, be it a
 * secondary ENI or one attached as the primary interface on an instance.
 * 
 * > **NOTE on instances, interfaces, and security groups:** This provider currently
 * provides the capability to assign security groups via the `aws.ec2.Instance`
 * and the `aws.ec2.NetworkInterface` resources. Using this resource in
 * conjunction with security groups provided in-line in those resources will cause
 * conflicts, and will lead to spurious diffs and undefined behavior - please use
 * one or the other.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:ec2/networkInterfaceSecurityGroupAttachment:NetworkInterfaceSecurityGroupAttachment")
public class NetworkInterfaceSecurityGroupAttachment extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the network interface to attach to.
     * 
     */
    @OutputExport(name="networkInterfaceId", type=String.class, parameters={})
    private Output<String> networkInterfaceId;

    /**
     * @return The ID of the network interface to attach to.
     * 
     */
    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The ID of the security group.
     * 
     */
    @OutputExport(name="securityGroupId", type=String.class, parameters={})
    private Output<String> securityGroupId;

    /**
     * @return The ID of the security group.
     * 
     */
    public Output<String> getSecurityGroupId() {
        return this.securityGroupId;
    }

    public interface BuilderApplicator {
        public void apply(NetworkInterfaceSecurityGroupAttachmentArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.NetworkInterfaceSecurityGroupAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.NetworkInterfaceSecurityGroupAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NetworkInterfaceSecurityGroupAttachment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkInterfaceSecurityGroupAttachment(String name) {
        this(name, NetworkInterfaceSecurityGroupAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInterfaceSecurityGroupAttachment(String name, NetworkInterfaceSecurityGroupAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInterfaceSecurityGroupAttachment(String name, NetworkInterfaceSecurityGroupAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkInterfaceSecurityGroupAttachment:NetworkInterfaceSecurityGroupAttachment", name, args == null ? NetworkInterfaceSecurityGroupAttachmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private NetworkInterfaceSecurityGroupAttachment(String name, Output<String> id, @Nullable NetworkInterfaceSecurityGroupAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkInterfaceSecurityGroupAttachment:NetworkInterfaceSecurityGroupAttachment", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NetworkInterfaceSecurityGroupAttachment get(String name, Output<String> id, @Nullable NetworkInterfaceSecurityGroupAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInterfaceSecurityGroupAttachment(name, id, state, options);
    }
}
