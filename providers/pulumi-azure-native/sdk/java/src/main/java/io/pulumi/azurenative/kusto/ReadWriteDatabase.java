// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.ReadWriteDatabaseArgs;
import io.pulumi.azurenative.kusto.outputs.DatabaseStatisticsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:kusto:ReadWriteDatabase")
public class ReadWriteDatabase extends io.pulumi.resources.CustomResource {
    @OutputExport(name="hotCachePeriod", type=String.class, parameters={})
    private Output</* @Nullable */ String> hotCachePeriod;

    public Output</* @Nullable */ String> getHotCachePeriod() {
        return this.hotCachePeriod;
    }
    @OutputExport(name="isFollowed", type=Boolean.class, parameters={})
    private Output<Boolean> isFollowed;

    public Output<Boolean> getIsFollowed() {
        return this.isFollowed;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
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
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="softDeletePeriod", type=String.class, parameters={})
    private Output</* @Nullable */ String> softDeletePeriod;

    public Output</* @Nullable */ String> getSoftDeletePeriod() {
        return this.softDeletePeriod;
    }
    @OutputExport(name="statistics", type=DatabaseStatisticsResponse.class, parameters={})
    private Output<DatabaseStatisticsResponse> statistics;

    public Output<DatabaseStatisticsResponse> getStatistics() {
        return this.statistics;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ReadWriteDatabase(String name, ReadWriteDatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:ReadWriteDatabase", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ReadWriteDatabase(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:ReadWriteDatabase", name, null, makeResourceOptions(options, id));
    }

    private static ReadWriteDatabaseArgs makeArgs(ReadWriteDatabaseArgs args) {
        var builder = args == null ? ReadWriteDatabaseArgs.builder() : ReadWriteDatabaseArgs.builder(args);
        return builder
            .setKind("ReadWrite")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:kusto/v20170907privatepreview:ReadWriteDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20180907preview:ReadWriteDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190121:ReadWriteDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190515:ReadWriteDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190907:ReadWriteDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20191109:ReadWriteDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200215:ReadWriteDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200614:ReadWriteDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200918:ReadWriteDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210101:ReadWriteDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210827:ReadWriteDatabase").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ReadWriteDatabase get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReadWriteDatabase(name, id, options);
    }
}
