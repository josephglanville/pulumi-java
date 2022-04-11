// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.kendra.DataSourceArgs;
import io.pulumi.awsnative.kendra.enums.DataSourceType;
import io.pulumi.awsnative.kendra.outputs.DataSourceConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Kendra DataSource
 * 
 */
@ResourceType(type="aws-native:kendra:DataSource")
public class DataSource extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="dataSourceConfiguration", type=DataSourceConfiguration.class, parameters={})
    private Output</* @Nullable */ DataSourceConfiguration> dataSourceConfiguration;

    public Output</* @Nullable */ DataSourceConfiguration> getDataSourceConfiguration() {
        return this.dataSourceConfiguration;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @Export(name="indexId", type=String.class, parameters={})
    private Output<String> indexId;

    public Output<String> getIndexId() {
        return this.indexId;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @Export(name="roleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleArn;

    public Output</* @Nullable */ String> getRoleArn() {
        return this.roleArn;
    }
    @Export(name="schedule", type=String.class, parameters={})
    private Output</* @Nullable */ String> schedule;

    public Output</* @Nullable */ String> getSchedule() {
        return this.schedule;
    }
    /**
     * Tags for labeling the data source
     * 
     */
    @Export(name="tags", type=List.class, parameters={DataSourceTag.class})
    private Output</* @Nullable */ List<DataSourceTag>> tags;

    /**
     * @return Tags for labeling the data source
     * 
     */
    public Output</* @Nullable */ List<DataSourceTag>> getTags() {
        return this.tags;
    }
    @Export(name="type", type=DataSourceType.class, parameters={})
    private Output<DataSourceType> type;

    public Output<DataSourceType> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataSource(String name) {
        this(name, DataSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataSource(String name, DataSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataSource(String name, DataSourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kendra:DataSource", name, args == null ? DataSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataSource(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kendra:DataSource", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DataSource get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataSource(name, id, options);
    }
}
