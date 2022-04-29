// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.DataCatalog.CatalogArgs;
import com.pulumi.oci.DataCatalog.inputs.CatalogState;
import com.pulumi.oci.Utilities;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Catalog resource in Oracle Cloud Infrastructure Data Catalog service.
 * 
 * Creates a new data catalog instance that includes a console and an API URL for managing metadata operations.
 * For more information, please see the documentation.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Catalogs can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:DataCatalog/catalog:Catalog test_catalog &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:DataCatalog/catalog:Catalog")
public class Catalog extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) The list of private reverse connection endpoints attached to the catalog
     * 
     */
    @Export(name="attachedCatalogPrivateEndpoints", type=List.class, parameters={String.class})
    private Output<List<String>> attachedCatalogPrivateEndpoints;

    /**
     * @return (Updatable) The list of private reverse connection endpoints attached to the catalog
     * 
     */
    public Output<List<String>> attachedCatalogPrivateEndpoints() {
        return this.attachedCatalogPrivateEndpoints;
    }
    /**
     * (Updatable) Compartment identifier.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment identifier.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
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
     * (Updatable) Data catalog identifier.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) Data catalog identifier.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * An message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in &#39;Failed&#39; state.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return An message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in &#39;Failed&#39; state.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * The number of data objects added to the data catalog. Please see the data catalog documentation for further information on how this is calculated.
     * 
     */
    @Export(name="numberOfObjects", type=Integer.class, parameters={})
    private Output<Integer> numberOfObjects;

    /**
     * @return The number of data objects added to the data catalog. Please see the data catalog documentation for further information on how this is calculated.
     * 
     */
    public Output<Integer> numberOfObjects() {
        return this.numberOfObjects;
    }
    /**
     * The REST front endpoint URL to the data catalog instance.
     * 
     */
    @Export(name="serviceApiUrl", type=String.class, parameters={})
    private Output<String> serviceApiUrl;

    /**
     * @return The REST front endpoint URL to the data catalog instance.
     * 
     */
    public Output<String> serviceApiUrl() {
        return this.serviceApiUrl;
    }
    /**
     * The console front endpoint URL to the data catalog instance.
     * 
     */
    @Export(name="serviceConsoleUrl", type=String.class, parameters={})
    private Output<String> serviceConsoleUrl;

    /**
     * @return The console front endpoint URL to the data catalog instance.
     * 
     */
    public Output<String> serviceConsoleUrl() {
        return this.serviceConsoleUrl;
    }
    /**
     * The current state of the data catalog resource.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the data catalog resource.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The time the data catalog was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The time the data catalog was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The time the data catalog was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The time the data catalog was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Catalog(String name) {
        this(name, CatalogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Catalog(String name, CatalogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Catalog(String name, CatalogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataCatalog/catalog:Catalog", name, args == null ? CatalogArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Catalog(String name, Output<String> id, @Nullable CatalogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataCatalog/catalog:Catalog", name, state, makeResourceOptions(options, id));
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
    public static Catalog get(String name, Output<String> id, @Nullable CatalogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Catalog(name, id, state, options);
    }
}
