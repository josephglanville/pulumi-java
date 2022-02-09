// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicelinker.LinkerArgs;
import io.pulumi.azurenative.servicelinker.outputs.SecretAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.ServicePrincipalCertificateAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.ServicePrincipalSecretAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.SystemAssignedIdentityAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.SystemDataResponse;
import io.pulumi.azurenative.servicelinker.outputs.UserAssignedIdentityAuthInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:servicelinker:Linker")
public class Linker extends io.pulumi.resources.CustomResource {
    @OutputExport(name="authInfo", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> authInfo;

    public Output</* @Nullable */ Object> getAuthInfo() {
        return this.authInfo;
    }
    @OutputExport(name="clientType", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientType;

    public Output</* @Nullable */ String> getClientType() {
        return this.clientType;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="targetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetId;

    public Output</* @Nullable */ String> getTargetId() {
        return this.targetId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Linker(String name, LinkerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicelinker:Linker", name, args == null ? LinkerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Linker(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicelinker:Linker", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:servicelinker/v20211101preview:Linker").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Linker get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Linker(name, id, options);
    }
}
