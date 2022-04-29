// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Nosql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Nosql.TableArgs;
import com.pulumi.oci.Nosql.inputs.TableState;
import com.pulumi.oci.Nosql.outputs.TableSchema;
import com.pulumi.oci.Nosql.outputs.TableTableLimits;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Table resource in Oracle Cloud Infrastructure NoSQL Database service.
 * 
 * Create a new table.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Tables can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Nosql/table:Table test_table &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Nosql/table:Table")
public class Table extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) Compartment Identifier.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment Identifier.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) Complete CREATE TABLE DDL statement. When update ddl_statement, it should be ALTER TABLE DDL statement.
     * 
     */
    @Export(name="ddlStatement", type=String.class, parameters={})
    private Output<String> ddlStatement;

    /**
     * @return (Updatable) Complete CREATE TABLE DDL statement. When update ddl_statement, it should be ALTER TABLE DDL statement.
     * 
     */
    public Output<String> ddlStatement() {
        return this.ddlStatement;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace.  Example: `{&#34;foo-namespace&#34;: {&#34;bar-key&#34;: &#34;value&#34;}}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace.  Example: `{&#34;foo-namespace&#34;: {&#34;bar-key&#34;: &#34;value&#34;}}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
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
     * True if table can be reclaimed after an idle period.
     * 
     */
    @Export(name="isAutoReclaimable", type=Boolean.class, parameters={})
    private Output<Boolean> isAutoReclaimable;

    /**
     * @return True if table can be reclaimed after an idle period.
     * 
     */
    public Output<Boolean> isAutoReclaimable() {
        return this.isAutoReclaimable;
    }
    /**
     * A message describing the current state in more detail.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return A message describing the current state in more detail.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * Table name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Table name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The table schema information as a JSON object.
     * 
     */
    @Export(name="schemas", type=List.class, parameters={TableSchema.class})
    private Output<List<TableSchema>> schemas;

    /**
     * @return The table schema information as a JSON object.
     * 
     */
    public Output<List<TableSchema>> schemas() {
        return this.schemas;
    }
    /**
     * The state of a table.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of a table.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Read-only system tag. These predefined keys are scoped to namespaces.  At present the only supported namespace is `&#34;orcl-cloud&#34;`; and the only key in that namespace is `&#34;free-tier-retained&#34;`. Example: `{&#34;orcl-cloud&#34;&#34;: {&#34;free-tier-retained&#34;: &#34;true&#34;}}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return Read-only system tag. These predefined keys are scoped to namespaces.  At present the only supported namespace is `&#34;orcl-cloud&#34;`; and the only key in that namespace is `&#34;free-tier-retained&#34;`. Example: `{&#34;orcl-cloud&#34;&#34;: {&#34;free-tier-retained&#34;: &#34;true&#34;}}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * (Updatable) Throughput and storage limits configuration of a table.
     * 
     */
    @Export(name="tableLimits", type=TableTableLimits.class, parameters={})
    private Output<TableTableLimits> tableLimits;

    /**
     * @return (Updatable) Throughput and storage limits configuration of a table.
     * 
     */
    public Output<TableTableLimits> tableLimits() {
        return this.tableLimits;
    }
    /**
     * The time the the table was created. An RFC3339 formatted datetime string.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The time the the table was created. An RFC3339 formatted datetime string.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * If lifecycleState is INACTIVE, indicates when this table will be automatically removed. An RFC3339 formatted datetime string.
     * 
     */
    @Export(name="timeOfExpiration", type=String.class, parameters={})
    private Output<String> timeOfExpiration;

    /**
     * @return If lifecycleState is INACTIVE, indicates when this table will be automatically removed. An RFC3339 formatted datetime string.
     * 
     */
    public Output<String> timeOfExpiration() {
        return this.timeOfExpiration;
    }
    /**
     * The time the the table&#39;s metadata was last updated. An RFC3339 formatted datetime string.
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The time the the table&#39;s metadata was last updated. An RFC3339 formatted datetime string.
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Nosql/table:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Table(String name, Output<String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Nosql/table:Table", name, state, makeResourceOptions(options, id));
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
    public static Table get(String name, Output<String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, state, options);
    }
}
