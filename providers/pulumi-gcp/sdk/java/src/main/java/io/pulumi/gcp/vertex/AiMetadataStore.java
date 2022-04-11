// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.vertex.AiMetadataStoreArgs;
import io.pulumi.gcp.vertex.outputs.AiMetadataStoreEncryptionSpec;
import io.pulumi.gcp.vertex.outputs.AiMetadataStoreState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * MetadataStore can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default projects/{{project}}/locations/{{region}}/metadataStores/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:vertex/aiMetadataStore:AiMetadataStore")
public class AiMetadataStore extends io.pulumi.resources.CustomResource {
    /**
     * The timestamp of when the MetadataStore was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp of when the MetadataStore was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Description of the MetadataStore.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the MetadataStore.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
     * Structure is documented below.
     * 
     */
    @Export(name="encryptionSpec", type=AiMetadataStoreEncryptionSpec.class, parameters={})
    private Output</* @Nullable */ AiMetadataStoreEncryptionSpec> encryptionSpec;

    /**
     * @return Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AiMetadataStoreEncryptionSpec> getEncryptionSpec() {
        return this.encryptionSpec;
    }
    /**
     * The name of the MetadataStore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the MetadataStore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The region of the Metadata Store. eg us-central1
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region of the Metadata Store. eg us-central1
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * State information of the MetadataStore.
     * 
     */
    @Export(name="states", type=List.class, parameters={AiMetadataStoreState.class})
    private Output<List<AiMetadataStoreState>> states;

    /**
     * @return State information of the MetadataStore.
     * 
     */
    public Output<List<AiMetadataStoreState>> getStates() {
        return this.states;
    }
    /**
     * The timestamp of when the MetadataStore was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up
     * to nine fractional digits.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp of when the MetadataStore was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up
     * to nine fractional digits.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AiMetadataStore(String name) {
        this(name, AiMetadataStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AiMetadataStore(String name, @Nullable AiMetadataStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AiMetadataStore(String name, @Nullable AiMetadataStoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiMetadataStore:AiMetadataStore", name, args == null ? AiMetadataStoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AiMetadataStore(String name, Output<String> id, @Nullable io.pulumi.gcp.vertex.inputs.AiMetadataStoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiMetadataStore:AiMetadataStore", name, state, makeResourceOptions(options, id));
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
    public static AiMetadataStore get(String name, Output<String> id, @Nullable io.pulumi.gcp.vertex.inputs.AiMetadataStoreState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AiMetadataStore(name, id, state, options);
    }
}
