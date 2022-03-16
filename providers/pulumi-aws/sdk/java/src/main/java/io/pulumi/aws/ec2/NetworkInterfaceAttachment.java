// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.NetworkInterfaceAttachmentArgs;
import io.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Attach an Elastic network interface (ENI) resource with EC2 instance.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:ec2/networkInterfaceAttachment:NetworkInterfaceAttachment")
public class NetworkInterfaceAttachment extends io.pulumi.resources.CustomResource {
    /**
     * The ENI Attachment ID.
     * 
     */
    @Export(name="attachmentId", type=String.class, parameters={})
    private Output<String> attachmentId;

    /**
     * @return The ENI Attachment ID.
     * 
     */
    public Output<String> getAttachmentId() {
        return this.attachmentId;
    }
    /**
     * Network interface index (int).
     * 
     */
    @Export(name="deviceIndex", type=Integer.class, parameters={})
    private Output<Integer> deviceIndex;

    /**
     * @return Network interface index (int).
     * 
     */
    public Output<Integer> getDeviceIndex() {
        return this.deviceIndex;
    }
    /**
     * Instance ID to attach.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return Instance ID to attach.
     * 
     */
    public Output<String> getInstanceId() {
        return this.instanceId;
    }
    /**
     * ENI ID to attach.
     * 
     */
    @Export(name="networkInterfaceId", type=String.class, parameters={})
    private Output<String> networkInterfaceId;

    /**
     * @return ENI ID to attach.
     * 
     */
    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The status of the Network Interface Attachment.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the Network Interface Attachment.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(NetworkInterfaceAttachmentArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.NetworkInterfaceAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.NetworkInterfaceAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NetworkInterfaceAttachment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkInterfaceAttachment(String name) {
        this(name, NetworkInterfaceAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInterfaceAttachment(String name, NetworkInterfaceAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInterfaceAttachment(String name, NetworkInterfaceAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkInterfaceAttachment:NetworkInterfaceAttachment", name, args == null ? NetworkInterfaceAttachmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private NetworkInterfaceAttachment(String name, Output<String> id, @Nullable NetworkInterfaceAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkInterfaceAttachment:NetworkInterfaceAttachment", name, state, makeResourceOptions(options, id));
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
    public static NetworkInterfaceAttachment get(String name, Output<String> id, @Nullable NetworkInterfaceAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInterfaceAttachment(name, id, state, options);
    }
}
