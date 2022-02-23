// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kubernetesconfiguration.ExtensionArgs;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.ConfigurationIdentityResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.ErrorDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.ExtensionStatusResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.ScopeResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The Extension Instance object.
 * API Version: 2020-07-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kubernetesconfiguration:Extension ClusterMonitor /subscriptions/subId1/resourceGroups/rg1/providers/Microsoft.Kubernetes/connectedClusters/clusterName1/providers/Microsoft.KubernetesConfiguration/extensions/ClusterMonitor 
 * ```
 * 
 */
@ResourceType(type="azure-native:kubernetesconfiguration:Extension")
public class Extension extends io.pulumi.resources.CustomResource {
    /**
     * Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
     */
    @OutputExport(name="autoUpgradeMinorVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoUpgradeMinorVersion;

    /**
     * @return Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }
    /**
     * Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
     */
    @OutputExport(name="configurationProtectedSettings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> configurationProtectedSettings;

    /**
     * @return Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getConfigurationProtectedSettings() {
        return this.configurationProtectedSettings;
    }
    /**
     * Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
     */
    @OutputExport(name="configurationSettings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> configurationSettings;

    /**
     * @return Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getConfigurationSettings() {
        return this.configurationSettings;
    }
    /**
     * DateLiteral (per ISO8601) noting the time the resource was created by the client (user).
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return DateLiteral (per ISO8601) noting the time the resource was created by the client (user).
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * Error information from the Agent - e.g. errors during installation.
     * 
     */
    @OutputExport(name="errorInfo", type=ErrorDefinitionResponse.class, parameters={})
    private Output<ErrorDefinitionResponse> errorInfo;

    /**
     * @return Error information from the Agent - e.g. errors during installation.
     * 
     */
    public Output<ErrorDefinitionResponse> getErrorInfo() {
        return this.errorInfo;
    }
    /**
     * Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     */
    @OutputExport(name="extensionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionType;

    /**
     * @return Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     */
    public Output</* @Nullable */ String> getExtensionType() {
        return this.extensionType;
    }
    /**
     * The identity of the configuration.
     * 
     */
    @OutputExport(name="identity", type=ConfigurationIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ConfigurationIdentityResponse> identity;

    /**
     * @return The identity of the configuration.
     * 
     */
    public Output</* @Nullable */ ConfigurationIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Status of installation of this instance of the extension.
     * 
     */
    @OutputExport(name="installState", type=String.class, parameters={})
    private Output<String> installState;

    /**
     * @return Status of installation of this instance of the extension.
     * 
     */
    public Output<String> getInstallState() {
        return this.installState;
    }
    /**
     * DateLiteral (per ISO8601) noting the time the resource was modified by the client (user).
     * 
     */
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return DateLiteral (per ISO8601) noting the time the resource was modified by the client (user).
     * 
     */
    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * DateLiteral (per ISO8601) noting the time of last status from the agent.
     * 
     */
    @OutputExport(name="lastStatusTime", type=String.class, parameters={})
    private Output<String> lastStatusTime;

    /**
     * @return DateLiteral (per ISO8601) noting the time of last status from the agent.
     * 
     */
    public Output<String> getLastStatusTime() {
        return this.lastStatusTime;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     * 
     */
    @OutputExport(name="releaseTrain", type=String.class, parameters={})
    private Output</* @Nullable */ String> releaseTrain;

    /**
     * @return ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is 'true'.
     * 
     */
    public Output</* @Nullable */ String> getReleaseTrain() {
        return this.releaseTrain;
    }
    /**
     * Scope at which the extension instance is installed.
     * 
     */
    @OutputExport(name="scope", type=ScopeResponse.class, parameters={})
    private Output</* @Nullable */ ScopeResponse> scope;

    /**
     * @return Scope at which the extension instance is installed.
     * 
     */
    public Output</* @Nullable */ ScopeResponse> getScope() {
        return this.scope;
    }
    /**
     * Status from this instance of the extension.
     * 
     */
    @OutputExport(name="statuses", type=List.class, parameters={ExtensionStatusResponse.class})
    private Output</* @Nullable */ List<ExtensionStatusResponse>> statuses;

    /**
     * @return Status from this instance of the extension.
     * 
     */
    public Output</* @Nullable */ List<ExtensionStatusResponse>> getStatuses() {
        return this.statuses;
    }
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output</* @Nullable */ SystemDataResponse> systemData;

    /**
     * @return Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    public Output</* @Nullable */ SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Version of the extension for this extension instance, if it is 'pinned' to a specific version. autoUpgradeMinorVersion must be 'false'.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Version of the extension for this extension instance, if it is 'pinned' to a specific version. autoUpgradeMinorVersion must be 'false'.
     * 
     */
    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Extension(String name) {
        this(name, ExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Extension(String name, ExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Extension(String name, ExtensionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetesconfiguration:Extension", name, args == null ? ExtensionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Extension(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetesconfiguration:Extension", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:kubernetesconfiguration/v20200701preview:Extension").build()),
                Input.of(Alias.builder().setType("azure-native:kubernetesconfiguration/v20210501preview:Extension").build()),
                Input.of(Alias.builder().setType("azure-native:kubernetesconfiguration/v20210901:Extension").build()),
                Input.of(Alias.builder().setType("azure-native:kubernetesconfiguration/v20211101preview:Extension").build()),
                Input.of(Alias.builder().setType("azure-native:kubernetesconfiguration/v20220101preview:Extension").build())
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
    public static Extension get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Extension(name, id, options);
    }
}
