// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.connect.InstanceArgs;
import io.pulumi.aws.connect.inputs.InstanceState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect instance resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * !> **WARN:** There are limits to the number of Connect Instances that can be created in a specific AWS account, and those limits span the life of the account, not just active Instances. Minimize the number of times you create/delete an instance.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Connect instances can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:connect/instance:Instance example f1288a1f-6193-445a-b47e-af739b2
 * ```
 * 
 */
@ResourceType(type="aws:connect/instance:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the instance.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the instance.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Specifies whether auto resolve best voices is enabled. Defaults to `true`.
     * 
     */
    @Export(name="autoResolveBestVoicesEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoResolveBestVoicesEnabled;

    /**
     * @return Specifies whether auto resolve best voices is enabled. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoResolveBestVoicesEnabled() {
        return this.autoResolveBestVoicesEnabled;
    }
    /**
     * Specifies whether contact flow logs are enabled. Defaults to `false`.
     * 
     */
    @Export(name="contactFlowLogsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> contactFlowLogsEnabled;

    /**
     * @return Specifies whether contact flow logs are enabled. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getContactFlowLogsEnabled() {
        return this.contactFlowLogsEnabled;
    }
    /**
     * Specifies whether contact lens is enabled. Defaults to `true`.
     * 
     */
    @Export(name="contactLensEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> contactLensEnabled;

    /**
     * @return Specifies whether contact lens is enabled. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getContactLensEnabled() {
        return this.contactLensEnabled;
    }
    /**
     * Specifies when the instance was created.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return Specifies when the instance was created.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
     * 
     */
    @Export(name="directoryId", type=String.class, parameters={})
    private Output</* @Nullable */ String> directoryId;

    /**
     * @return The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
     * 
     */
    public Output</* @Nullable */ String> getDirectoryId() {
        return this.directoryId;
    }
    /**
     * Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
     * 
     */
    @Export(name="earlyMediaEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> earlyMediaEnabled;

    /**
     * @return Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEarlyMediaEnabled() {
        return this.earlyMediaEnabled;
    }
    /**
     * Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
     * 
     */
    @Export(name="identityManagementType", type=String.class, parameters={})
    private Output<String> identityManagementType;

    /**
     * @return Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
     * 
     */
    public Output<String> getIdentityManagementType() {
        return this.identityManagementType;
    }
    /**
     * Specifies whether inbound calls are enabled.
     * 
     */
    @Export(name="inboundCallsEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> inboundCallsEnabled;

    /**
     * @return Specifies whether inbound calls are enabled.
     * 
     */
    public Output<Boolean> getInboundCallsEnabled() {
        return this.inboundCallsEnabled;
    }
    /**
     * Specifies the name of the instance. Required if `directory_id` not specified.
     * 
     */
    @Export(name="instanceAlias", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceAlias;

    /**
     * @return Specifies the name of the instance. Required if `directory_id` not specified.
     * 
     */
    public Output</* @Nullable */ String> getInstanceAlias() {
        return this.instanceAlias;
    }
    /**
     * Specifies whether outbound calls are enabled.
     * <!-- * `use_custom_tts_voices` - (Optional) Specifies Whether use custom tts voices is enabled. Defaults to `false` -->
     * 
     */
    @Export(name="outboundCallsEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> outboundCallsEnabled;

    /**
     * @return Specifies whether outbound calls are enabled.
     * <!-- * `use_custom_tts_voices` - (Optional) Specifies Whether use custom tts voices is enabled. Defaults to `false` -->
     * 
     */
    public Output<Boolean> getOutboundCallsEnabled() {
        return this.outboundCallsEnabled;
    }
    /**
     * The service role of the instance.
     * 
     */
    @Export(name="serviceRole", type=String.class, parameters={})
    private Output<String> serviceRole;

    /**
     * @return The service role of the instance.
     * 
     */
    public Output<String> getServiceRole() {
        return this.serviceRole;
    }
    /**
     * The state of the instance.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The state of the instance.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
