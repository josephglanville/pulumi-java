// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.SqlDBTableDataSetArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:datashare:SqlDBTableDataSet")
public class SqlDBTableDataSet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    public Output<String> getDataSetId() {
        return this.dataSetId;
    }
    @OutputExport(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="schemaName", type=String.class, parameters={})
    private Output<String> schemaName;

    public Output<String> getSchemaName() {
        return this.schemaName;
    }
    @OutputExport(name="sqlServerResourceId", type=String.class, parameters={})
    private Output<String> sqlServerResourceId;

    public Output<String> getSqlServerResourceId() {
        return this.sqlServerResourceId;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SqlDBTableDataSet(String name, SqlDBTableDataSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:SqlDBTableDataSet", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private SqlDBTableDataSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:SqlDBTableDataSet", name, null, makeResourceOptions(options, id));
    }

    private static SqlDBTableDataSetArgs makeArgs(SqlDBTableDataSetArgs args) {
        var builder = args == null ? SqlDBTableDataSetArgs.builder() : SqlDBTableDataSetArgs.builder(args);
        return builder
            .setKind("SqlDBTable")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datashare/v20181101preview:SqlDBTableDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20191101:SqlDBTableDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20200901:SqlDBTableDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20201001preview:SqlDBTableDataSet").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20210801:SqlDBTableDataSet").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SqlDBTableDataSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlDBTableDataSet(name, id, options);
    }
}
