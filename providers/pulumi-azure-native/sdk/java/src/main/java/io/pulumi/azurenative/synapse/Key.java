// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.KeyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:synapse:Key")
public class Key extends io.pulumi.resources.CustomResource {
    @OutputExport(name="isActiveCMK", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isActiveCMK;

    public Output</* @Nullable */ Boolean> getIsActiveCMK() {
        return this.isActiveCMK;
    }
    @OutputExport(name="keyVaultUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyVaultUrl;

    public Output</* @Nullable */ String> getKeyVaultUrl() {
        return this.keyVaultUrl;
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

    public Key(String name, KeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Key(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:Key", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:synapse/v20190601preview:Key").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20201201:Key").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210301:Key").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210401preview:Key").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210501:Key").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601:Key").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601preview:Key").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Key get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, options);
    }
}
