// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.dynamodb.TableItemArgs;
import io.pulumi.aws.dynamodb.inputs.TableItemState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a DynamoDB table item resource
 * 
 * > **Note:** This resource is not meant to be used for managing large amounts of data in your table, it is not designed to scale.
 *   You should perform **regular backups** of all data in the table, see [AWS docs for more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/BackupRestore.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DynamoDB table items cannot be imported.
 * 
 */
@ResourceType(type="aws:dynamodb/tableItem:TableItem")
public class TableItem extends io.pulumi.resources.CustomResource {
    /**
     * Hash key to use for lookups and identification of the item
     * 
     */
    @Export(name="hashKey", type=String.class, parameters={})
    private Output<String> hashKey;

    /**
     * @return Hash key to use for lookups and identification of the item
     * 
     */
    public Output<String> getHashKey() {
        return this.hashKey;
    }
    /**
     * JSON representation of a map of attribute name/value pairs, one for each attribute.
     * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
     * 
     */
    @Export(name="item", type=String.class, parameters={})
    private Output<String> item;

    /**
     * @return JSON representation of a map of attribute name/value pairs, one for each attribute.
     * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
     * 
     */
    public Output<String> getItem() {
        return this.item;
    }
    /**
     * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
     * 
     */
    @Export(name="rangeKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> rangeKey;

    /**
     * @return Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
     * 
     */
    public Output</* @Nullable */ String> getRangeKey() {
        return this.rangeKey;
    }
    /**
     * The name of the table to contain the item.
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    /**
     * @return The name of the table to contain the item.
     * 
     */
    public Output<String> getTableName() {
        return this.tableName;
    }

    public interface BuilderApplicator {
        public void apply(TableItemArgs.Builder a);
    }
    private static io.pulumi.aws.dynamodb.TableItemArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.dynamodb.TableItemArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TableItem(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TableItem(String name) {
        this(name, TableItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TableItem(String name, TableItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TableItem(String name, TableItemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/tableItem:TableItem", name, args == null ? TableItemArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TableItem(String name, Output<String> id, @Nullable TableItemState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/tableItem:TableItem", name, state, makeResourceOptions(options, id));
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
    public static TableItem get(String name, Output<String> id, @Nullable TableItemState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TableItem(name, id, state, options);
    }
}
