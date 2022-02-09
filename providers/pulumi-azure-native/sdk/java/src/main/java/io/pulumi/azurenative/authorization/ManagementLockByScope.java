// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.ManagementLockByScopeArgs;
import io.pulumi.azurenative.authorization.outputs.ManagementLockOwnerResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:authorization:ManagementLockByScope")
public class ManagementLockByScope extends io.pulumi.resources.CustomResource {
    @OutputExport(name="level", type=String.class, parameters={})
    private Output<String> level;

    public Output<String> getLevel() {
        return this.level;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="notes", type=String.class, parameters={})
    private Output</* @Nullable */ String> notes;

    public Output</* @Nullable */ String> getNotes() {
        return this.notes;
    }
    @OutputExport(name="owners", type=List.class, parameters={ManagementLockOwnerResponse.class})
    private Output</* @Nullable */ List<ManagementLockOwnerResponse>> owners;

    public Output</* @Nullable */ List<ManagementLockOwnerResponse>> getOwners() {
        return this.owners;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ManagementLockByScope(String name, ManagementLockByScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ManagementLockByScope", name, args == null ? ManagementLockByScopeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ManagementLockByScope(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ManagementLockByScope", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:authorization/v20160901:ManagementLockByScope").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20170401:ManagementLockByScope").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20200501:ManagementLockByScope").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ManagementLockByScope get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagementLockByScope(name, id, options);
    }
}
