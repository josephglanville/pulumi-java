// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.healthcareapis.WorkspaceArgs;
import io.pulumi.azurenative.healthcareapis.outputs.SystemDataResponse;
import io.pulumi.azurenative.healthcareapis.outputs.WorkspaceResponseProperties;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:healthcareapis:Workspace")
public class Workspace extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
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
    @OutputExport(name="properties", type=WorkspaceResponseProperties.class, parameters={})
    private Output<WorkspaceResponseProperties> properties;

    public Output<WorkspaceResponseProperties> getProperties() {
        return this.properties;
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

    public Workspace(String name, WorkspaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:Workspace", name, args == null ? WorkspaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Workspace(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:Workspace", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:healthcareapis/v20210601preview:Workspace").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Workspace get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workspace(name, id, options);
    }
}
