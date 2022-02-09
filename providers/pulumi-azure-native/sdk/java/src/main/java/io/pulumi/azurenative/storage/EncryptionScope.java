// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.EncryptionScopeArgs;
import io.pulumi.azurenative.storage.outputs.EncryptionScopeKeyVaultPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:storage:EncryptionScope")
public class EncryptionScope extends io.pulumi.resources.CustomResource {
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="keyVaultProperties", type=EncryptionScopeKeyVaultPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionScopeKeyVaultPropertiesResponse> keyVaultProperties;

    public Output</* @Nullable */ EncryptionScopeKeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="requireInfrastructureEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requireInfrastructureEncryption;

    public Output</* @Nullable */ Boolean> getRequireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption;
    }
    @OutputExport(name="source", type=String.class, parameters={})
    private Output</* @Nullable */ String> source;

    public Output</* @Nullable */ String> getSource() {
        return this.source;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    public Output</* @Nullable */ String> getState() {
        return this.state;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public EncryptionScope(String name, EncryptionScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:EncryptionScope", name, args == null ? EncryptionScopeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EncryptionScope(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:EncryptionScope", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storage/v20190601:EncryptionScope").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20200801preview:EncryptionScope").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210101:EncryptionScope").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210201:EncryptionScope").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210401:EncryptionScope").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210601:EncryptionScope").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210801:EncryptionScope").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static EncryptionScope get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EncryptionScope(name, id, options);
    }
}
