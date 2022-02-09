// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.CassandraResourceCassandraKeyspaceArgs;
import io.pulumi.azurenative.documentdb.outputs.CassandraKeyspaceGetPropertiesResponseOptions;
import io.pulumi.azurenative.documentdb.outputs.CassandraKeyspaceGetPropertiesResponseResource;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:documentdb:CassandraResourceCassandraKeyspace")
public class CassandraResourceCassandraKeyspace extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="options", type=CassandraKeyspaceGetPropertiesResponseOptions.class, parameters={})
    private Output</* @Nullable */ CassandraKeyspaceGetPropertiesResponseOptions> options;

    public Output</* @Nullable */ CassandraKeyspaceGetPropertiesResponseOptions> getOptions() {
        return this.options;
    }
    @OutputExport(name="resource", type=CassandraKeyspaceGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ CassandraKeyspaceGetPropertiesResponseResource> resource;

    public Output</* @Nullable */ CassandraKeyspaceGetPropertiesResponseResource> getResource() {
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

    public CassandraResourceCassandraKeyspace(String name, CassandraResourceCassandraKeyspaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraResourceCassandraKeyspace", name, args == null ? CassandraResourceCassandraKeyspaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CassandraResourceCassandraKeyspace(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraResourceCassandraKeyspace", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:documentdb/v20150401:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20150408:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20151106:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20160319:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20160331:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20190801:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20191212:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200301:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200401:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200601preview:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200901:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210115:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210301preview:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210315:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210401preview:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210415:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210515:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210615:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210701preview:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015:CassandraResourceCassandraKeyspace").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:CassandraResourceCassandraKeyspace").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CassandraResourceCassandraKeyspace get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CassandraResourceCassandraKeyspace(name, id, options);
    }
}
