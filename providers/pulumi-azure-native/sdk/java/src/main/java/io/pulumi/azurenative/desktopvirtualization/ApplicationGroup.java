// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.desktopvirtualization.ApplicationGroupArgs;
import io.pulumi.azurenative.desktopvirtualization.outputs.MigrationRequestPropertiesResponse;
import io.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponseIdentity;
import io.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponsePlan;
import io.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponseSku;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:desktopvirtualization:ApplicationGroup")
public class ApplicationGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="applicationGroupType", type=String.class, parameters={})
    private Output<String> applicationGroupType;

    public Output<String> getApplicationGroupType() {
        return this.applicationGroupType;
    }
    @OutputExport(name="cloudPcResource", type=Boolean.class, parameters={})
    private Output<Boolean> cloudPcResource;

    public Output<Boolean> getCloudPcResource() {
        return this.cloudPcResource;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    public Output</* @Nullable */ String> getFriendlyName() {
        return this.friendlyName;
    }
    @OutputExport(name="hostPoolArmPath", type=String.class, parameters={})
    private Output<String> hostPoolArmPath;

    public Output<String> getHostPoolArmPath() {
        return this.hostPoolArmPath;
    }
    @OutputExport(name="identity", type=ResourceModelWithAllowedPropertySetResponseIdentity.class, parameters={})
    private Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseIdentity> identity;

    public Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseIdentity> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="managedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedBy;

    public Output</* @Nullable */ String> getManagedBy() {
        return this.managedBy;
    }
    @OutputExport(name="migrationRequest", type=MigrationRequestPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ MigrationRequestPropertiesResponse> migrationRequest;

    public Output</* @Nullable */ MigrationRequestPropertiesResponse> getMigrationRequest() {
        return this.migrationRequest;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="objectId", type=String.class, parameters={})
    private Output<String> objectId;

    public Output<String> getObjectId() {
        return this.objectId;
    }
    @OutputExport(name="plan", type=ResourceModelWithAllowedPropertySetResponsePlan.class, parameters={})
    private Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponsePlan> plan;

    public Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponsePlan> getPlan() {
        return this.plan;
    }
    @OutputExport(name="sku", type=ResourceModelWithAllowedPropertySetResponseSku.class, parameters={})
    private Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseSku> sku;

    public Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseSku> getSku() {
        return this.sku;
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
    @OutputExport(name="workspaceArmPath", type=String.class, parameters={})
    private Output<String> workspaceArmPath;

    public Output<String> getWorkspaceArmPath() {
        return this.workspaceArmPath;
    }

    public ApplicationGroup(String name, ApplicationGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:ApplicationGroup", name, args == null ? ApplicationGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApplicationGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:ApplicationGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20190123preview:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20190924preview:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20191210preview:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20200921preview:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201019preview:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201102preview:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201110preview:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210114preview:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210201preview:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210309preview:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210401preview:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210712:ApplicationGroup").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210903preview:ApplicationGroup").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ApplicationGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationGroup(name, id, options);
    }
}
