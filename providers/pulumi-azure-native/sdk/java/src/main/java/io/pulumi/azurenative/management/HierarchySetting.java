// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.management.HierarchySettingArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Settings defined at the Management Group scope.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:management:HierarchySetting root /providers/Microsoft.Management/managementGroups/root/settings/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:management:HierarchySetting")
public class HierarchySetting extends io.pulumi.resources.CustomResource {
    /**
     * Settings that sets the default Management Group under which new subscriptions get added in this tenant. For example, /providers/Microsoft.Management/managementGroups/defaultGroup
     * 
     */
    @OutputExport(name="defaultManagementGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultManagementGroup;

    /**
     * @return Settings that sets the default Management Group under which new subscriptions get added in this tenant. For example, /providers/Microsoft.Management/managementGroups/defaultGroup
     * 
     */
    public Output</* @Nullable */ String> getDefaultManagementGroup() {
        return this.defaultManagementGroup;
    }
    /**
     * The name of the object. In this case, default.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the object. In this case, default.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Indicates whether RBAC access is required upon group creation under the root Management Group. If set to true, user will require Microsoft.Management/managementGroups/write action on the root Management Group scope in order to create new Groups directly under the root. This will prevent new users from creating new Management Groups, unless they are given access.
     * 
     */
    @OutputExport(name="requireAuthorizationForGroupCreation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requireAuthorizationForGroupCreation;

    /**
     * @return Indicates whether RBAC access is required upon group creation under the root Management Group. If set to true, user will require Microsoft.Management/managementGroups/write action on the root Management Group scope in order to create new Groups directly under the root. This will prevent new users from creating new Management Groups, unless they are given access.
     * 
     */
    public Output</* @Nullable */ Boolean> getRequireAuthorizationForGroupCreation() {
        return this.requireAuthorizationForGroupCreation;
    }
    /**
     * The AAD Tenant ID associated with the hierarchy settings. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return The AAD Tenant ID associated with the hierarchy settings. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of the resource.  For example, Microsoft.Management/managementGroups/settings.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.  For example, Microsoft.Management/managementGroups/settings.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HierarchySetting(String name) {
        this(name, HierarchySettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HierarchySetting(String name, HierarchySettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HierarchySetting(String name, HierarchySettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:management:HierarchySetting", name, args == null ? HierarchySettingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private HierarchySetting(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:management:HierarchySetting", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:management/v20200201:HierarchySetting").build()),
                Input.of(Alias.builder().setType("azure-native:management/v20200501:HierarchySetting").build()),
                Input.of(Alias.builder().setType("azure-native:management/v20201001:HierarchySetting").build()),
                Input.of(Alias.builder().setType("azure-native:management/v20210401:HierarchySetting").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HierarchySetting get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HierarchySetting(name, id, options);
    }
}
