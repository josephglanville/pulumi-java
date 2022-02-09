// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppMetadataArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:web:WebAppMetadata")
public class WebAppMetadata extends io.pulumi.resources.CustomResource {
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WebAppMetadata(String name, WebAppMetadataArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppMetadata", name, args == null ? WebAppMetadataArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppMetadata(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppMetadata", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppMetadata").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppMetadata").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WebAppMetadata get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppMetadata(name, id, options);
    }
}
