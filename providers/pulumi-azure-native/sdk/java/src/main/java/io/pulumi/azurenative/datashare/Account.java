// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.AccountArgs;
import io.pulumi.azurenative.datashare.outputs.IdentityResponse;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:datashare:Account")
public class Account extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output<IdentityResponse> identity;

    public Output<IdentityResponse> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
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
    @OutputExport(name="userEmail", type=String.class, parameters={})
    private Output<String> userEmail;

    public Output<String> getUserEmail() {
        return this.userEmail;
    }
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    public Output<String> getUserName() {
        return this.userName;
    }

    public Account(String name, AccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Account(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:Account", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datashare/v20181101preview:Account").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20191101:Account").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20200901:Account").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20201001preview:Account").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20210801:Account").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Account get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, options);
    }
}
