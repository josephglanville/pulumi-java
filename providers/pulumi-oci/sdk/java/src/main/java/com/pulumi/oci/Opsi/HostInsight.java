// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Opsi.HostInsightArgs;
import com.pulumi.oci.Opsi.inputs.HostInsightState;
import com.pulumi.oci.Utilities;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Host Insight resource in Oracle Cloud Infrastructure Opsi service.
 * 
 * Create a Host Insight resource for a host in Operations Insights. The host will be enabled in Operations Insights. Host metric collection and analysis will be started.
 * 
 * ## Import
 * 
 * HostInsights can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Opsi/hostInsight:HostInsight test_host_insight &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Opsi/hostInsight:HostInsight")
public class HostInsight extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) Compartment Identifier of host
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment Identifier of host
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * OPSI Enterprise Manager Bridge OCID
     * 
     */
    @Export(name="enterpriseManagerBridgeId", type=String.class, parameters={})
    private Output<String> enterpriseManagerBridgeId;

    /**
     * @return OPSI Enterprise Manager Bridge OCID
     * 
     */
    public Output<String> enterpriseManagerBridgeId() {
        return this.enterpriseManagerBridgeId;
    }
    /**
     * Enterprise Manager Entity Display Name
     * 
     */
    @Export(name="enterpriseManagerEntityDisplayName", type=String.class, parameters={})
    private Output<String> enterpriseManagerEntityDisplayName;

    /**
     * @return Enterprise Manager Entity Display Name
     * 
     */
    public Output<String> enterpriseManagerEntityDisplayName() {
        return this.enterpriseManagerEntityDisplayName;
    }
    /**
     * Enterprise Manager Entity Unique Identifier
     * 
     */
    @Export(name="enterpriseManagerEntityIdentifier", type=String.class, parameters={})
    private Output<String> enterpriseManagerEntityIdentifier;

    /**
     * @return Enterprise Manager Entity Unique Identifier
     * 
     */
    public Output<String> enterpriseManagerEntityIdentifier() {
        return this.enterpriseManagerEntityIdentifier;
    }
    /**
     * Enterprise Manager Entity Name
     * 
     */
    @Export(name="enterpriseManagerEntityName", type=String.class, parameters={})
    private Output<String> enterpriseManagerEntityName;

    /**
     * @return Enterprise Manager Entity Name
     * 
     */
    public Output<String> enterpriseManagerEntityName() {
        return this.enterpriseManagerEntityName;
    }
    /**
     * Enterprise Manager Entity Type
     * 
     */
    @Export(name="enterpriseManagerEntityType", type=String.class, parameters={})
    private Output<String> enterpriseManagerEntityType;

    /**
     * @return Enterprise Manager Entity Type
     * 
     */
    public Output<String> enterpriseManagerEntityType() {
        return this.enterpriseManagerEntityType;
    }
    /**
     * Enterprise Manager Unique Identifier
     * 
     */
    @Export(name="enterpriseManagerIdentifier", type=String.class, parameters={})
    private Output<String> enterpriseManagerIdentifier;

    /**
     * @return Enterprise Manager Unique Identifier
     * 
     */
    public Output<String> enterpriseManagerIdentifier() {
        return this.enterpriseManagerIdentifier;
    }
    /**
     * (Updatable) Source of the host entity.
     * 
     */
    @Export(name="entitySource", type=String.class, parameters={})
    private Output<String> entitySource;

    /**
     * @return (Updatable) Source of the host entity.
     * 
     */
    public Output<String> entitySource() {
        return this.entitySource;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     * 
     */
    @Export(name="exadataInsightId", type=String.class, parameters={})
    private Output<String> exadataInsightId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     * 
     */
    public Output<String> exadataInsightId() {
        return this.exadataInsightId;
    }
    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * The user-friendly name for the host. The name does not have to be unique.
     * 
     */
    @Export(name="hostDisplayName", type=String.class, parameters={})
    private Output<String> hostDisplayName;

    /**
     * @return The user-friendly name for the host. The name does not have to be unique.
     * 
     */
    public Output<String> hostDisplayName() {
        return this.hostDisplayName;
    }
    /**
     * The host name. The host name is unique amongst the hosts managed by the same management agent.
     * 
     */
    @Export(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return The host name. The host name is unique amongst the hosts managed by the same management agent.
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }
    /**
     * Operations Insights internal representation of the host type. Possible value is EXTERNAL-HOST.
     * 
     */
    @Export(name="hostType", type=String.class, parameters={})
    private Output<String> hostType;

    /**
     * @return Operations Insights internal representation of the host type. Possible value is EXTERNAL-HOST.
     * 
     */
    public Output<String> hostType() {
        return this.hostType;
    }
    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Management Agent
     * 
     */
    @Export(name="managementAgentId", type=String.class, parameters={})
    private Output<String> managementAgentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Management Agent
     * 
     */
    public Output<String> managementAgentId() {
        return this.managementAgentId;
    }
    /**
     * Platform name.
     * 
     */
    @Export(name="platformName", type=String.class, parameters={})
    private Output<String> platformName;

    /**
     * @return Platform name.
     * 
     */
    public Output<String> platformName() {
        return this.platformName;
    }
    /**
     * Platform type. Supported platformType(s) for MACS-managed external host insight: [LINUX]. Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
     * 
     */
    @Export(name="platformType", type=String.class, parameters={})
    private Output<String> platformType;

    /**
     * @return Platform type. Supported platformType(s) for MACS-managed external host insight: [LINUX]. Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
     * 
     */
    public Output<String> platformType() {
        return this.platformType;
    }
    /**
     * Platform version.
     * 
     */
    @Export(name="platformVersion", type=String.class, parameters={})
    private Output<String> platformVersion;

    /**
     * @return Platform version.
     * 
     */
    public Output<String> platformVersion() {
        return this.platformVersion;
    }
    /**
     * Processor count.
     * 
     */
    @Export(name="processorCount", type=Integer.class, parameters={})
    private Output<Integer> processorCount;

    /**
     * @return Processor count.
     * 
     */
    public Output<Integer> processorCount() {
        return this.processorCount;
    }
    /**
     * The current state of the host.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the host.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * (Updatable) Status of the resource. Example: &#34;ENABLED&#34;, &#34;DISABLED&#34;. Resource can be either enabled or disabled by updating the value of status field to either &#34;ENABLED&#34; or &#34;DISABLED&#34;
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return (Updatable) Status of the resource. Example: &#34;ENABLED&#34;, &#34;DISABLED&#34;. Resource can be either enabled or disabled by updating the value of status field to either &#34;ENABLED&#34; or &#34;DISABLED&#34;
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * The time the the host insight was first enabled. An RFC3339 formatted datetime string
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The time the the host insight was first enabled. An RFC3339 formatted datetime string
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The time the host insight was updated. An RFC3339 formatted datetime string
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The time the host insight was updated. An RFC3339 formatted datetime string
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostInsight(String name) {
        this(name, HostInsightArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostInsight(String name, HostInsightArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostInsight(String name, HostInsightArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Opsi/hostInsight:HostInsight", name, args == null ? HostInsightArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HostInsight(String name, Output<String> id, @Nullable HostInsightState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Opsi/hostInsight:HostInsight", name, state, makeResourceOptions(options, id));
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
    public static HostInsight get(String name, Output<String> id, @Nullable HostInsightState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostInsight(name, id, state, options);
    }
}
