// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.healthcare.Hl7StoreArgs;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreState;
import io.pulumi.gcp.healthcare.outputs.Hl7StoreNotificationConfig;
import io.pulumi.gcp.healthcare.outputs.Hl7StoreNotificationConfigs;
import io.pulumi.gcp.healthcare.outputs.Hl7StoreParserConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Hl7V2Store is a datastore inside a Healthcare dataset that conforms to the FHIR (https://www.hl7.org/hl7V2/STU3/)
 * standard for Healthcare information exchange
 * 
 * To get more information about Hl7V2Store, see:
 * 
 * * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets.hl7V2Stores)
 * * How-to Guides
 *     * [Creating a HL7v2 Store](https://cloud.google.com/healthcare/docs/how-tos/hl7v2)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Hl7V2Store can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/hl7Store:Hl7Store default {{dataset}}/hl7V2Stores/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/hl7Store:Hl7Store default {{dataset}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:healthcare/hl7Store:Hl7Store")
public class Hl7Store extends io.pulumi.resources.CustomResource {
    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    @Export(name="dataset", type=String.class, parameters={})
    private Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    public Output<String> getDataset() {
        return this.dataset;
    }
    /**
     * User-supplied key-value pairs used to organize HL7v2 stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize HL7v2 stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name for the Hl7V2Store.
     * ** Changing this property may recreate the Hl7v2 store (removing all data) **
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the Hl7V2Store.
     * ** Changing this property may recreate the Hl7v2 store (removing all data) **
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * - 
     * (Optional, Deprecated)
     * A nested object resource
     * Structure is documented below.
     * 
     * @Deprecated
     * This field has been replaced by notificationConfigs
     * 
     */
    @Deprecated /* This field has been replaced by notificationConfigs */
    @Export(name="notificationConfig", type=Hl7StoreNotificationConfig.class, parameters={})
    private Output</* @Nullable */ Hl7StoreNotificationConfig> notificationConfig;

    /**
     * @return -
     * (Optional, Deprecated)
     * A nested object resource
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ Hl7StoreNotificationConfig> getNotificationConfig() {
        return this.notificationConfig;
    }
    /**
     * A list of notification configs. Each configuration uses a filter to determine whether to publish a
     * message (both Ingest & Create) on the corresponding notification destination. Only the message name
     * is sent as part of the notification. Supplied by the client.
     * Structure is documented below.
     * 
     */
    @Export(name="notificationConfigs", type=List.class, parameters={Hl7StoreNotificationConfigs.class})
    private Output</* @Nullable */ List<Hl7StoreNotificationConfigs>> notificationConfigs;

    /**
     * @return A list of notification configs. Each configuration uses a filter to determine whether to publish a
     * message (both Ingest & Create) on the corresponding notification destination. Only the message name
     * is sent as part of the notification. Supplied by the client.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<Hl7StoreNotificationConfigs>> getNotificationConfigs() {
        return this.notificationConfigs;
    }
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Export(name="parserConfig", type=Hl7StoreParserConfig.class, parameters={})
    private Output<Hl7StoreParserConfig> parserConfig;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Output<Hl7StoreParserConfig> getParserConfig() {
        return this.parserConfig;
    }
    /**
     * The fully qualified name of this dataset
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The fully qualified name of this dataset
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Hl7Store(String name) {
        this(name, Hl7StoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Hl7Store(String name, Hl7StoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Hl7Store(String name, Hl7StoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/hl7Store:Hl7Store", name, args == null ? Hl7StoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Hl7Store(String name, Output<String> id, @Nullable Hl7StoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/hl7Store:Hl7Store", name, state, makeResourceOptions(options, id));
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
    public static Hl7Store get(String name, Output<String> id, @Nullable Hl7StoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Hl7Store(name, id, state, options);
    }
}
