// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.WorkspaceSqlAadAdminArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:synapse:WorkspaceSqlAadAdmin")
public class WorkspaceSqlAadAdmin extends io.pulumi.resources.CustomResource {
    @OutputExport(name="administratorType", type=String.class, parameters={})
    private Output</* @Nullable */ String> administratorType;

    public Output</* @Nullable */ String> getAdministratorType() {
        return this.administratorType;
    }
    @OutputExport(name="login", type=String.class, parameters={})
    private Output</* @Nullable */ String> login;

    public Output</* @Nullable */ String> getLogin() {
        return this.login;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="sid", type=String.class, parameters={})
    private Output</* @Nullable */ String> sid;

    public Output</* @Nullable */ String> getSid() {
        return this.sid;
    }
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WorkspaceSqlAadAdmin(String name, WorkspaceSqlAadAdminArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:WorkspaceSqlAadAdmin", name, args == null ? WorkspaceSqlAadAdminArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WorkspaceSqlAadAdmin(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:WorkspaceSqlAadAdmin", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:synapse/v20190601preview:WorkspaceSqlAadAdmin").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20201201:WorkspaceSqlAadAdmin").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210301:WorkspaceSqlAadAdmin").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210401preview:WorkspaceSqlAadAdmin").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210501:WorkspaceSqlAadAdmin").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601:WorkspaceSqlAadAdmin").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601preview:WorkspaceSqlAadAdmin").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WorkspaceSqlAadAdmin get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkspaceSqlAadAdmin(name, id, options);
    }
}
