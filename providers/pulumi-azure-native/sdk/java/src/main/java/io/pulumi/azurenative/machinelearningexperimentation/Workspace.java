// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningexperimentation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningexperimentation.WorkspaceArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:machinelearningexperimentation:Workspace")
public class Workspace extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId;
    }
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName;
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
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
    @OutputExport(name="workspaceId", type=String.class, parameters={})
    private Output<String> workspaceId;

    public Output<String> getWorkspaceId() {
        return this.workspaceId;
    }

    public Workspace(String name, WorkspaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningexperimentation:Workspace", name, args == null ? WorkspaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Workspace(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningexperimentation:Workspace", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:machinelearningexperimentation/v20170501preview:Workspace").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Workspace get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workspace(name, id, options);
    }
}
