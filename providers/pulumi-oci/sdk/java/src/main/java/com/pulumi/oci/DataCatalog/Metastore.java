// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.DataCatalog.MetastoreArgs;
import com.pulumi.oci.DataCatalog.inputs.MetastoreState;
import com.pulumi.oci.Utilities;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Metastore resource in Oracle Cloud Infrastructure Data Catalog service.
 * 
 * Creates a new metastore.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Metastores can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:DataCatalog/metastore:Metastore test_metastore &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:DataCatalog/metastore:Metastore")
public class Metastore extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) OCID of the compartment which holds the metastore.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) OCID of the compartment which holds the metastore.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * Location under which external tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     * 
     */
    @Export(name="defaultExternalTableLocation", type=String.class, parameters={})
    private Output<String> defaultExternalTableLocation;

    /**
     * @return Location under which external tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     * 
     */
    public Output<String> defaultExternalTableLocation() {
        return this.defaultExternalTableLocation;
    }
    /**
     * Location under which managed tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     * 
     */
    @Export(name="defaultManagedTableLocation", type=String.class, parameters={})
    private Output<String> defaultManagedTableLocation;

    /**
     * @return Location under which managed tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     * 
     */
    public Output<String> defaultManagedTableLocation() {
        return this.defaultManagedTableLocation;
    }
    /**
     * (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) Mutable name of the metastore.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) Mutable name of the metastore.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
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
     * The current state of the metastore.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the metastore.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Time at which the metastore was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return Time at which the metastore was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * Time at which the metastore was last modified. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return Time at which the metastore was last modified. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Metastore(String name) {
        this(name, MetastoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Metastore(String name, MetastoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Metastore(String name, MetastoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataCatalog/metastore:Metastore", name, args == null ? MetastoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Metastore(String name, Output<String> id, @Nullable MetastoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataCatalog/metastore:Metastore", name, state, makeResourceOptions(options, id));
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
    public static Metastore get(String name, Output<String> id, @Nullable MetastoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Metastore(name, id, state, options);
    }
}
