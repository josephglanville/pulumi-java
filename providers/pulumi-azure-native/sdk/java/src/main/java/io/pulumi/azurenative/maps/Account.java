// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.maps.AccountArgs;
import io.pulumi.azurenative.maps.outputs.MapsAccountPropertiesResponse;
import io.pulumi.azurenative.maps.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:maps:Account")
public class Account extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="properties", type=MapsAccountPropertiesResponse.class, parameters={})
    private Output<MapsAccountPropertiesResponse> properties;

    public Output<MapsAccountPropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Account(String name, AccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:maps:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Account(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:maps:Account", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:maps/v20170101preview:Account").build()),
                Input.of(Alias.builder().setType("azure-native:maps/v20180501:Account").build()),
                Input.of(Alias.builder().setType("azure-native:maps/v20200201preview:Account").build()),
                Input.of(Alias.builder().setType("azure-native:maps/v20210201:Account").build()),
                Input.of(Alias.builder().setType("azure-native:maps/v20210701preview:Account").build()),
                Input.of(Alias.builder().setType("azure-native:maps/v20211201preview:Account").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Account get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, options);
    }
}
