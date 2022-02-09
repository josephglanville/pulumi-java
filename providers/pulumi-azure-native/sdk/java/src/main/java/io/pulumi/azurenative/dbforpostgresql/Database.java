// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbforpostgresql.DatabaseArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:dbforpostgresql:Database")
public class Database extends io.pulumi.resources.CustomResource {
    @OutputExport(name="charset", type=String.class, parameters={})
    private Output</* @Nullable */ String> charset;

    public Output</* @Nullable */ String> getCharset() {
        return this.charset;
    }
    @OutputExport(name="collation", type=String.class, parameters={})
    private Output</* @Nullable */ String> collation;

    public Output</* @Nullable */ String> getCollation() {
        return this.collation;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Database(String name, DatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Database(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:Database", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:dbforpostgresql/v20171201:Database").build()),
                Input.of(Alias.builder().setType("azure-native:dbforpostgresql/v20171201preview:Database").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Database get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, options);
    }
}
