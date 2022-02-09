// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.CassandraResourceCassandraViewArgs;
import io.pulumi.azurenative.documentdb.outputs.CassandraViewGetPropertiesResponseOptions;
import io.pulumi.azurenative.documentdb.outputs.CassandraViewGetPropertiesResponseResource;
import io.pulumi.azurenative.documentdb.outputs.ManagedServiceIdentityResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:documentdb:CassandraResourceCassandraView")
public class CassandraResourceCassandraView extends io.pulumi.resources.CustomResource {
    @OutputExport(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    public Output</* @Nullable */ ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
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
    @OutputExport(name="options", type=CassandraViewGetPropertiesResponseOptions.class, parameters={})
    private Output</* @Nullable */ CassandraViewGetPropertiesResponseOptions> options;

    public Output</* @Nullable */ CassandraViewGetPropertiesResponseOptions> getOptions() {
        return this.options;
    }
    @OutputExport(name="resource", type=CassandraViewGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ CassandraViewGetPropertiesResponseResource> resource;

    public Output</* @Nullable */ CassandraViewGetPropertiesResponseResource> getResource() {
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

    public CassandraResourceCassandraView(String name, CassandraResourceCassandraViewArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraResourceCassandraView", name, args == null ? CassandraResourceCassandraViewArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CassandraResourceCassandraView(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraResourceCassandraView", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210701preview:CassandraResourceCassandraView").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:CassandraResourceCassandraView").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CassandraResourceCassandraView get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CassandraResourceCassandraView(name, id, options);
    }
}
