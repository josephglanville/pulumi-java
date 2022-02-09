// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.migrate.ImportCollectorArgs;
import io.pulumi.azurenative.migrate.outputs.ImportCollectorPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:migrate:ImportCollector")
public class ImportCollector extends io.pulumi.resources.CustomResource {
    @OutputExport(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=ImportCollectorPropertiesResponse.class, parameters={})
    private Output<ImportCollectorPropertiesResponse> properties;

    public Output<ImportCollectorPropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ImportCollector(String name, ImportCollectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:ImportCollector", name, args == null ? ImportCollectorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ImportCollector(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:ImportCollector", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:migrate/v20191001:ImportCollector").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ImportCollector get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ImportCollector(name, id, options);
    }
}
