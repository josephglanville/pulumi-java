// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.SqlResourceSqlRoleAssignmentArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:documentdb:SqlResourceSqlRoleAssignment")
public class SqlResourceSqlRoleAssignment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="principalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalId;

    public Output</* @Nullable */ String> getPrincipalId() {
        return this.principalId;
    }
    @OutputExport(name="roleDefinitionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleDefinitionId;

    public Output</* @Nullable */ String> getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    @OutputExport(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    public Output</* @Nullable */ String> getScope() {
        return this.scope;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SqlResourceSqlRoleAssignment(String name, SqlResourceSqlRoleAssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:SqlResourceSqlRoleAssignment", name, args == null ? SqlResourceSqlRoleAssignmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SqlResourceSqlRoleAssignment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:SqlResourceSqlRoleAssignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200601preview:SqlResourceSqlRoleAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210301preview:SqlResourceSqlRoleAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210401preview:SqlResourceSqlRoleAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210415:SqlResourceSqlRoleAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210515:SqlResourceSqlRoleAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210615:SqlResourceSqlRoleAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210701preview:SqlResourceSqlRoleAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015:SqlResourceSqlRoleAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:SqlResourceSqlRoleAssignment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SqlResourceSqlRoleAssignment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlResourceSqlRoleAssignment(name, id, options);
    }
}
