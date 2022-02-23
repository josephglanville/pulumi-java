// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.glue.SchemaArgs;
import io.pulumi.awsnative.glue.enums.SchemaCompatibility;
import io.pulumi.awsnative.glue.enums.SchemaDataFormat;
import io.pulumi.awsnative.glue.outputs.SchemaRegistry;
import io.pulumi.awsnative.glue.outputs.SchemaTag;
import io.pulumi.awsnative.glue.outputs.SchemaVersion;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource represents a schema of Glue Schema Registry.
 * 
 */
@ResourceType(type="aws-native:glue:Schema")
public class Schema extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name for the Schema.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name for the Schema.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="checkpointVersion", type=SchemaVersion.class, parameters={})
    private Output</* @Nullable */ SchemaVersion> checkpointVersion;

    public Output</* @Nullable */ SchemaVersion> getCheckpointVersion() {
        return this.checkpointVersion;
    }
    /**
     * Compatibility setting for the schema.
     * 
     */
    @OutputExport(name="compatibility", type=SchemaCompatibility.class, parameters={})
    private Output<SchemaCompatibility> compatibility;

    /**
     * @return Compatibility setting for the schema.
     * 
     */
    public Output<SchemaCompatibility> getCompatibility() {
        return this.compatibility;
    }
    /**
     * Data format name to use for the schema. Accepted values: 'AVRO', 'JSON', 'PROTOBUF'
     * 
     */
    @OutputExport(name="dataFormat", type=SchemaDataFormat.class, parameters={})
    private Output<SchemaDataFormat> dataFormat;

    /**
     * @return Data format name to use for the schema. Accepted values: 'AVRO', 'JSON', 'PROTOBUF'
     * 
     */
    public Output<SchemaDataFormat> getDataFormat() {
        return this.dataFormat;
    }
    /**
     * A description of the schema. If description is not provided, there will not be any default value for this.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the schema. If description is not provided, there will not be any default value for this.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Represents the version ID associated with the initial schema version.
     * 
     */
    @OutputExport(name="initialSchemaVersionId", type=String.class, parameters={})
    private Output<String> initialSchemaVersionId;

    /**
     * @return Represents the version ID associated with the initial schema version.
     * 
     */
    public Output<String> getInitialSchemaVersionId() {
        return this.initialSchemaVersionId;
    }
    /**
     * Name of the schema.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the schema.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="registry", type=SchemaRegistry.class, parameters={})
    private Output</* @Nullable */ SchemaRegistry> registry;

    public Output</* @Nullable */ SchemaRegistry> getRegistry() {
        return this.registry;
    }
    /**
     * Definition for the initial schema version in plain-text.
     * 
     */
    @OutputExport(name="schemaDefinition", type=String.class, parameters={})
    private Output<String> schemaDefinition;

    /**
     * @return Definition for the initial schema version in plain-text.
     * 
     */
    public Output<String> getSchemaDefinition() {
        return this.schemaDefinition;
    }
    /**
     * List of tags to tag the schema
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={SchemaTag.class})
    private Output</* @Nullable */ List<SchemaTag>> tags;

    /**
     * @return List of tags to tag the schema
     * 
     */
    public Output</* @Nullable */ List<SchemaTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schema(String name) {
        this(name, SchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schema(String name, SchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schema(String name, SchemaArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:glue:Schema", name, args == null ? SchemaArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Schema(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:glue:Schema", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Schema get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Schema(name, id, options);
    }
}
