// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.ManagementLockByScopeArgs;
import io.pulumi.azurenative.authorization.outputs.ManagementLockOwnerResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The lock information.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:authorization:ManagementLockByScope testlock /subscriptions/subscriptionId/resourceGroups/resourcegroupname/providers/Microsoft.Authorization/locks/testlock 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:ManagementLockByScope")
public class ManagementLockByScope extends io.pulumi.resources.CustomResource {
    /**
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can't modify or delete it.
     * 
     */
    @OutputExport(name="level", type=String.class, parameters={})
    private Output<String> level;

    /**
     * @return The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can't modify or delete it.
     * 
     */
    public Output<String> getLevel() {
        return this.level;
    }
    /**
     * The name of the lock.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the lock.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Notes about the lock. Maximum of 512 characters.
     * 
     */
    @OutputExport(name="notes", type=String.class, parameters={})
    private Output</* @Nullable */ String> notes;

    /**
     * @return Notes about the lock. Maximum of 512 characters.
     * 
     */
    public Output</* @Nullable */ String> getNotes() {
        return this.notes;
    }
    /**
     * The owners of the lock.
     * 
     */
    @OutputExport(name="owners", type=List.class, parameters={ManagementLockOwnerResponse.class})
    private Output</* @Nullable */ List<ManagementLockOwnerResponse>> owners;

    /**
     * @return The owners of the lock.
     * 
     */
    public Output</* @Nullable */ List<ManagementLockOwnerResponse>> getOwners() {
        return this.owners;
    }
    /**
     * The resource type of the lock - Microsoft.Authorization/locks.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type of the lock - Microsoft.Authorization/locks.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ManagementLockByScopeArgs.Builder a);
    }
    private static io.pulumi.azurenative.authorization.ManagementLockByScopeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.authorization.ManagementLockByScopeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ManagementLockByScope(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagementLockByScope(String name) {
        this(name, ManagementLockByScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementLockByScope(String name, ManagementLockByScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementLockByScope(String name, ManagementLockByScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ManagementLockByScope", name, args == null ? ManagementLockByScopeArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ManagementLockByScope(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ManagementLockByScope", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:authorization/v20160901:ManagementLockByScope").build()),
                Output.of(Alias.builder().setType("azure-native:authorization/v20170401:ManagementLockByScope").build()),
                Output.of(Alias.builder().setType("azure-native:authorization/v20200501:ManagementLockByScope").build())
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
    public static ManagementLockByScope get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagementLockByScope(name, id, options);
    }
}
