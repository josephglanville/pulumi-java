// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.VaultArgs;
import io.pulumi.azurenative.recoveryservices.outputs.IdentityDataResponse;
import io.pulumi.azurenative.recoveryservices.outputs.SkuResponse;
import io.pulumi.azurenative.recoveryservices.outputs.SystemDataResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VaultPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:recoveryservices:Vault")
public class Vault extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="identity", type=IdentityDataResponse.class, parameters={})
    private Output</* @Nullable */ IdentityDataResponse> identity;

    public Output</* @Nullable */ IdentityDataResponse> getIdentity() {
        return this.identity;
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
    @OutputExport(name="properties", type=VaultPropertiesResponse.class, parameters={})
    private Output<VaultPropertiesResponse> properties;

    public Output<VaultPropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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

    public Vault(String name, VaultArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:Vault", name, args == null ? VaultArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Vault(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:Vault", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20160601:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20200202:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20201001:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210101:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210210:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210301:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210401:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210601:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210701:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210801:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20211101preview:Vault").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Vault get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Vault(name, id, options);
    }
}
