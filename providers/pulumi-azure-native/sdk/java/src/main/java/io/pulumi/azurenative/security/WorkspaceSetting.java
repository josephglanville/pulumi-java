// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.WorkspaceSettingArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Configures where to store the OMS agent data for workspaces under a scope
 * API Version: 2017-08-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:WorkspaceSetting default /subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/providers/Microsoft.Security/workspaceSettings/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:WorkspaceSetting")
public class WorkspaceSetting extends io.pulumi.resources.CustomResource {
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * All the VMs in this scope will send their security data to the mentioned workspace unless overridden by a setting with more specific scope
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return All the VMs in this scope will send their security data to the mentioned workspace unless overridden by a setting with more specific scope
     * 
     */
    public Output<String> getScope() {
        return this.scope;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The full Azure ID of the workspace to save the data in
     * 
     */
    @Export(name="workspaceId", type=String.class, parameters={})
    private Output<String> workspaceId;

    /**
     * @return The full Azure ID of the workspace to save the data in
     * 
     */
    public Output<String> getWorkspaceId() {
        return this.workspaceId;
    }

    public interface BuilderApplicator {
        public void apply(WorkspaceSettingArgs.Builder a);
    }
    private static io.pulumi.azurenative.security.WorkspaceSettingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.security.WorkspaceSettingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WorkspaceSetting(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkspaceSetting(String name) {
        this(name, WorkspaceSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkspaceSetting(String name, WorkspaceSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkspaceSetting(String name, WorkspaceSettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:WorkspaceSetting", name, args == null ? WorkspaceSettingArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private WorkspaceSetting(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:WorkspaceSetting", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:security/v20170801preview:WorkspaceSetting").build())
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
    public static WorkspaceSetting get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkspaceSetting(name, id, options);
    }
}
