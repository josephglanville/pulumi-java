// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Core.InstanceConsoleConnectionArgs;
import com.pulumi.oci.Core.inputs.InstanceConsoleConnectionState;
import com.pulumi.oci.Utilities;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Instance Console Connection resource in Oracle Cloud Infrastructure Core service.
 * 
 * Creates a new console connection to the specified instance.
 * After the console connection has been created and is available,
 * you connect to the console using SSH.
 * 
 * For more information about instance console connections, see [Troubleshooting Instances Using Instance Console Connections](https://docs.cloud.oracle.com/iaas/Content/Compute/References/serialconsole.htm).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * InstanceConsoleConnections can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Core/instanceConsoleConnection:InstanceConsoleConnection test_instance_console_connection &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Core/instanceConsoleConnection:InstanceConsoleConnection")
public class InstanceConsoleConnection extends com.pulumi.resources.CustomResource {
    /**
     * The OCID of the compartment to contain the console connection.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return The OCID of the compartment to contain the console connection.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * The SSH connection string for the console connection.
     * 
     */
    @Export(name="connectionString", type=String.class, parameters={})
    private Output<String> connectionString;

    /**
     * @return The SSH connection string for the console connection.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * The SSH public key&#39;s fingerprint for client authentication to the console connection.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return The SSH public key&#39;s fingerprint for client authentication to the console connection.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * The OCID of the instance to create the console connection to.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The OCID of the instance to create the console connection to.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The SSH public key used to authenticate the console connection.
     * 
     */
    @Export(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    /**
     * @return The SSH public key used to authenticate the console connection.
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }
    /**
     * The SSH public key&#39;s fingerprint for the console connection service host.
     * 
     */
    @Export(name="serviceHostKeyFingerprint", type=String.class, parameters={})
    private Output<String> serviceHostKeyFingerprint;

    /**
     * @return The SSH public key&#39;s fingerprint for the console connection service host.
     * 
     */
    public Output<String> serviceHostKeyFingerprint() {
        return this.serviceHostKeyFingerprint;
    }
    /**
     * The current state of the console connection.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the console connection.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The SSH connection string for the SSH tunnel used to connect to the console connection over VNC.
     * 
     */
    @Export(name="vncConnectionString", type=String.class, parameters={})
    private Output<String> vncConnectionString;

    /**
     * @return The SSH connection string for the SSH tunnel used to connect to the console connection over VNC.
     * 
     */
    public Output<String> vncConnectionString() {
        return this.vncConnectionString;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceConsoleConnection(String name) {
        this(name, InstanceConsoleConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceConsoleConnection(String name, InstanceConsoleConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceConsoleConnection(String name, InstanceConsoleConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/instanceConsoleConnection:InstanceConsoleConnection", name, args == null ? InstanceConsoleConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceConsoleConnection(String name, Output<String> id, @Nullable InstanceConsoleConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/instanceConsoleConnection:InstanceConsoleConnection", name, state, makeResourceOptions(options, id));
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
    public static InstanceConsoleConnection get(String name, Output<String> id, @Nullable InstanceConsoleConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceConsoleConnection(name, id, state, options);
    }
}
