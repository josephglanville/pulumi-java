// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ApiPolicyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:apimanagement:ApiPolicy")
public class ApiPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="format", type=String.class, parameters={})
    private Output</* @Nullable */ String> format;

    public Output</* @Nullable */ String> getFormat() {
        return this.format;
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
    @OutputExport(name="value", type=String.class, parameters={})
    private Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public ApiPolicy(String name, ApiPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiPolicy", name, args == null ? ApiPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:ApiPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:ApiPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:ApiPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:ApiPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ApiPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:ApiPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ApiPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ApiPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ApiPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ApiPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ApiPolicy").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ApiPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiPolicy(name, id, options);
    }
}
