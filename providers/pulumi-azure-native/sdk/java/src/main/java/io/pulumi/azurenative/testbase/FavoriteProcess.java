// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.testbase.FavoriteProcessArgs;
import io.pulumi.azurenative.testbase.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:testbase:FavoriteProcess")
public class FavoriteProcess extends io.pulumi.resources.CustomResource {
    @OutputExport(name="actualProcessName", type=String.class, parameters={})
    private Output<String> actualProcessName;

    public Output<String> getActualProcessName() {
        return this.actualProcessName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public FavoriteProcess(String name, FavoriteProcessArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:FavoriteProcess", name, args == null ? FavoriteProcessArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FavoriteProcess(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:FavoriteProcess", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:testbase/v20201216preview:FavoriteProcess").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static FavoriteProcess get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FavoriteProcess(name, id, options);
    }
}
