// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformysql.ServerAdministratorArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:dbformysql:ServerAdministrator")
public class ServerAdministrator extends io.pulumi.resources.CustomResource {
    @OutputExport(name="administratorType", type=String.class, parameters={})
    private Output<String> administratorType;

    public Output<String> getAdministratorType() {
        return this.administratorType;
    }
    @OutputExport(name="login", type=String.class, parameters={})
    private Output<String> login;

    public Output<String> getLogin() {
        return this.login;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="sid", type=String.class, parameters={})
    private Output<String> sid;

    public Output<String> getSid() {
        return this.sid;
    }
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ServerAdministrator(String name, ServerAdministratorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:ServerAdministrator", name, args == null ? ServerAdministratorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServerAdministrator(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:ServerAdministrator", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:dbformysql/v20171201:ServerAdministrator").build()),
                Input.of(Alias.builder().setType("azure-native:dbformysql/v20171201preview:ServerAdministrator").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ServerAdministrator get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerAdministrator(name, id, options);
    }
}
