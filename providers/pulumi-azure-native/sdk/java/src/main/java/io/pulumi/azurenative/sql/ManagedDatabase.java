// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ManagedDatabaseArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:sql:ManagedDatabase")
public class ManagedDatabase extends io.pulumi.resources.CustomResource {
    @OutputExport(name="catalogCollation", type=String.class, parameters={})
    private Output</* @Nullable */ String> catalogCollation;

    public Output</* @Nullable */ String> getCatalogCollation() {
        return this.catalogCollation;
    }
    @OutputExport(name="collation", type=String.class, parameters={})
    private Output</* @Nullable */ String> collation;

    public Output</* @Nullable */ String> getCollation() {
        return this.collation;
    }
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    @OutputExport(name="defaultSecondaryLocation", type=String.class, parameters={})
    private Output<String> defaultSecondaryLocation;

    public Output<String> getDefaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }
    @OutputExport(name="earliestRestorePoint", type=String.class, parameters={})
    private Output<String> earliestRestorePoint;

    public Output<String> getEarliestRestorePoint() {
        return this.earliestRestorePoint;
    }
    @OutputExport(name="failoverGroupId", type=String.class, parameters={})
    private Output<String> failoverGroupId;

    public Output<String> getFailoverGroupId() {
        return this.failoverGroupId;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
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

    public ManagedDatabase(String name, ManagedDatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedDatabase", name, args == null ? ManagedDatabaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ManagedDatabase(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedDatabase", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20170301preview:ManagedDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20180601preview:ManagedDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20190601preview:ManagedDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:ManagedDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:ManagedDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:ManagedDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:ManagedDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:ManagedDatabase").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:ManagedDatabase").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ManagedDatabase get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedDatabase(name, id, options);
    }
}
