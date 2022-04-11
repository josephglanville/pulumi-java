// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dataexchange;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.dataexchange.DataSetArgs;
import io.pulumi.aws.dataexchange.inputs.DataSetState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage AWS Data Exchange DataSets.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DataExchange DataSets can be imported by their arn
 * 
 * ```sh
 *  $ pulumi import aws:dataexchange/dataSet:DataSet example arn:aws:dataexchange:us-west-2:123456789012:data-sets/4fa784c7-ccb4-4dbf-ba4f-02198320daa1
 * ```
 * 
 */
@ResourceType(type="aws:dataexchange/dataSet:DataSet")
public class DataSet extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name of this data set.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name of this data set.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The type of asset that is added to a data set. Valid values are: `S3_SNAPSHOT`, `REDSHIFT_DATA_SHARE`, and `API_GATEWAY_API`.
     * 
     */
    @Export(name="assetType", type=String.class, parameters={})
    private Output<String> assetType;

    /**
     * @return The type of asset that is added to a data set. Valid values are: `S3_SNAPSHOT`, `REDSHIFT_DATA_SHARE`, and `API_GATEWAY_API`.
     * 
     */
    public Output<String> getAssetType() {
        return this.assetType;
    }
    /**
     * A description for the data set.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description for the data set.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The name of the data set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the data set.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataSet(String name) {
        this(name, DataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataSet(String name, DataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataSet(String name, DataSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dataexchange/dataSet:DataSet", name, args == null ? DataSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataSet(String name, Output<String> id, @Nullable DataSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dataexchange/dataSet:DataSet", name, state, makeResourceOptions(options, id));
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
    public static DataSet get(String name, Output<String> id, @Nullable DataSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataSet(name, id, state, options);
    }
}
