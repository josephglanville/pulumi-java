// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Core.DhcpOptionsArgs;
import com.pulumi.oci.Core.inputs.DhcpOptionsState;
import com.pulumi.oci.Core.outputs.DhcpOptionsOption;
import com.pulumi.oci.Utilities;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Dhcp Options resource in Oracle Cloud Infrastructure Core service.
 * 
 * Creates a new set of DHCP options for the specified VCN. For more information, see
 * [DhcpOptions](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/DhcpOptions/).
 * 
 * For the purposes of access control, you must provide the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want the set of
 * DHCP options to reside. Notice that the set of options doesn&#39;t have to be in the same compartment as the VCN,
 * subnets, or other Networking Service components. If you&#39;re not sure which compartment to use, put the set
 * of DHCP options in the same compartment as the VCN. For more information about compartments and access control, see
 * [Overview of the IAM Service](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
 * [Resource Identifiers](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
 * 
 * You may optionally specify a *display name* for the set of DHCP options, otherwise a default is provided.
 * It does not have to be unique, and you can change it. Avoid entering confidential information.
 * 
 * For more information on configuring a VCN&#39;s default DHCP options, see [Managing Default VCN Resources](https://www.terraform.io/docs/providers/oci/guides/managing_default_resources.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DhcpOptions can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Core/dhcpOptions:DhcpOptions test_dhcp_options &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Core/dhcpOptions:DhcpOptions")
public class DhcpOptions extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the set of DHCP options.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the set of DHCP options.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
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
     * (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Updatable) The search domain name type of DHCP options
     * 
     */
    @Export(name="domainNameType", type=String.class, parameters={})
    private Output<String> domainNameType;

    /**
     * @return (Updatable) The search domain name type of DHCP options
     * 
     */
    public Output<String> domainNameType() {
        return this.domainNameType;
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
     * (Updatable) A set of DHCP options.
     * 
     */
    @Export(name="options", type=List.class, parameters={DhcpOptionsOption.class})
    private Output<List<DhcpOptionsOption>> options;

    /**
     * @return (Updatable) A set of DHCP options.
     * 
     */
    public Output<List<DhcpOptionsOption>> options() {
        return this.options;
    }
    /**
     * The current state of the set of DHCP options.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the set of DHCP options.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Date and time the set of DHCP options was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return Date and time the set of DHCP options was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN the set of DHCP options belongs to.
     * 
     */
    @Export(name="vcnId", type=String.class, parameters={})
    private Output<String> vcnId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN the set of DHCP options belongs to.
     * 
     */
    public Output<String> vcnId() {
        return this.vcnId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DhcpOptions(String name) {
        this(name, DhcpOptionsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DhcpOptions(String name, DhcpOptionsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DhcpOptions(String name, DhcpOptionsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/dhcpOptions:DhcpOptions", name, args == null ? DhcpOptionsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DhcpOptions(String name, Output<String> id, @Nullable DhcpOptionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/dhcpOptions:DhcpOptions", name, state, makeResourceOptions(options, id));
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
    public static DhcpOptions get(String name, Output<String> id, @Nullable DhcpOptionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DhcpOptions(name, id, state, options);
    }
}
