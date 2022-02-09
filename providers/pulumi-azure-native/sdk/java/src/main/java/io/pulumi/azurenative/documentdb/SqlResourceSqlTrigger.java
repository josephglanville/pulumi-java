// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.SqlResourceSqlTriggerArgs;
import io.pulumi.azurenative.documentdb.outputs.SqlTriggerGetPropertiesResponseResource;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:documentdb:SqlResourceSqlTrigger")
public class SqlResourceSqlTrigger extends io.pulumi.resources.CustomResource {
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="resource", type=SqlTriggerGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ SqlTriggerGetPropertiesResponseResource> resource;

    public Output</* @Nullable */ SqlTriggerGetPropertiesResponseResource> getResource() {
        return this.resource;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SqlResourceSqlTrigger(String name, SqlResourceSqlTriggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:SqlResourceSqlTrigger", name, args == null ? SqlResourceSqlTriggerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SqlResourceSqlTrigger(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:SqlResourceSqlTrigger", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:documentdb/v20190801:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20191212:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200301:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200401:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200601preview:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200901:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210115:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210301preview:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210315:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210401preview:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210415:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210515:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210615:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210701preview:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015:SqlResourceSqlTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:SqlResourceSqlTrigger").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SqlResourceSqlTrigger get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlResourceSqlTrigger(name, id, options);
    }
}
