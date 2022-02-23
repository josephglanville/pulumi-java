// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppArgs;
import io.pulumi.azurenative.web.outputs.HostNameSslStateResponse;
import io.pulumi.azurenative.web.outputs.HostingEnvironmentProfileResponse;
import io.pulumi.azurenative.web.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.web.outputs.SiteConfigResponse;
import io.pulumi.azurenative.web.outputs.SlotSwapStatusResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A web app, a mobile app backend, or an API app.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebApp myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebApp")
public class WebApp extends io.pulumi.resources.CustomResource {
    /**
     * Management information availability state for the app.
     * 
     */
    @OutputExport(name="availabilityState", type=String.class, parameters={})
    private Output<String> availabilityState;

    /**
     * @return Management information availability state for the app.
     * 
     */
    public Output<String> getAvailabilityState() {
        return this.availabilityState;
    }
    /**
     * <code>true</code> to enable client affinity; <code>false</code> to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is <code>true</code>.
     * 
     */
    @OutputExport(name="clientAffinityEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> clientAffinityEnabled;

    /**
     * @return <code>true</code> to enable client affinity; <code>false</code> to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is <code>true</code>.
     * 
     */
    public Output</* @Nullable */ Boolean> getClientAffinityEnabled() {
        return this.clientAffinityEnabled;
    }
    /**
     * <code>true</code> to enable client certificate authentication (TLS mutual authentication); otherwise, <code>false</code>. Default is <code>false</code>.
     * 
     */
    @OutputExport(name="clientCertEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> clientCertEnabled;

    /**
     * @return <code>true</code> to enable client certificate authentication (TLS mutual authentication); otherwise, <code>false</code>. Default is <code>false</code>.
     * 
     */
    public Output</* @Nullable */ Boolean> getClientCertEnabled() {
        return this.clientCertEnabled;
    }
    /**
     * client certificate authentication comma-separated exclusion paths
     * 
     */
    @OutputExport(name="clientCertExclusionPaths", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientCertExclusionPaths;

    /**
     * @return client certificate authentication comma-separated exclusion paths
     * 
     */
    public Output</* @Nullable */ String> getClientCertExclusionPaths() {
        return this.clientCertExclusionPaths;
    }
    /**
     * This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     */
    @OutputExport(name="clientCertMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientCertMode;

    /**
     * @return This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     */
    public Output</* @Nullable */ String> getClientCertMode() {
        return this.clientCertMode;
    }
    /**
     * Size of the function container.
     * 
     */
    @OutputExport(name="containerSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> containerSize;

    /**
     * @return Size of the function container.
     * 
     */
    public Output</* @Nullable */ Integer> getContainerSize() {
        return this.containerSize;
    }
    /**
     * Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
     * 
     */
    @OutputExport(name="customDomainVerificationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> customDomainVerificationId;

    /**
     * @return Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
     * 
     */
    public Output</* @Nullable */ String> getCustomDomainVerificationId() {
        return this.customDomainVerificationId;
    }
    /**
     * Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     * 
     */
    @OutputExport(name="dailyMemoryTimeQuota", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dailyMemoryTimeQuota;

    /**
     * @return Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     * 
     */
    public Output</* @Nullable */ Integer> getDailyMemoryTimeQuota() {
        return this.dailyMemoryTimeQuota;
    }
    /**
     * Default hostname of the app. Read-only.
     * 
     */
    @OutputExport(name="defaultHostName", type=String.class, parameters={})
    private Output<String> defaultHostName;

    /**
     * @return Default hostname of the app. Read-only.
     * 
     */
    public Output<String> getDefaultHostName() {
        return this.defaultHostName;
    }
    /**
     * <code>true</code> if the app is enabled; otherwise, <code>false</code>. Setting this value to false disables the app (takes the app offline).
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return <code>true</code> if the app is enabled; otherwise, <code>false</code>. Setting this value to false disables the app (takes the app offline).
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * Enabled hostnames for the app.Hostnames need to be assigned (see HostNames) AND enabled. Otherwise,
     * the app is not served on those hostnames.
     * 
     */
    @OutputExport(name="enabledHostNames", type=List.class, parameters={String.class})
    private Output<List<String>> enabledHostNames;

    /**
     * @return Enabled hostnames for the app.Hostnames need to be assigned (see HostNames) AND enabled. Otherwise,
     * the app is not served on those hostnames.
     * 
     */
    public Output<List<String>> getEnabledHostNames() {
        return this.enabledHostNames;
    }
    /**
     * Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     * 
     */
    @OutputExport(name="hostNameSslStates", type=List.class, parameters={HostNameSslStateResponse.class})
    private Output</* @Nullable */ List<HostNameSslStateResponse>> hostNameSslStates;

    /**
     * @return Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     * 
     */
    public Output</* @Nullable */ List<HostNameSslStateResponse>> getHostNameSslStates() {
        return this.hostNameSslStates;
    }
    /**
     * Hostnames associated with the app.
     * 
     */
    @OutputExport(name="hostNames", type=List.class, parameters={String.class})
    private Output<List<String>> hostNames;

    /**
     * @return Hostnames associated with the app.
     * 
     */
    public Output<List<String>> getHostNames() {
        return this.hostNames;
    }
    /**
     * <code>true</code> to disable the public hostnames of the app; otherwise, <code>false</code>.
     *  If <code>true</code>, the app is only accessible via API management process.
     * 
     */
    @OutputExport(name="hostNamesDisabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hostNamesDisabled;

    /**
     * @return <code>true</code> to disable the public hostnames of the app; otherwise, <code>false</code>.
     *  If <code>true</code>, the app is only accessible via API management process.
     * 
     */
    public Output</* @Nullable */ Boolean> getHostNamesDisabled() {
        return this.hostNamesDisabled;
    }
    /**
     * App Service Environment to use for the app.
     * 
     */
    @OutputExport(name="hostingEnvironmentProfile", type=HostingEnvironmentProfileResponse.class, parameters={})
    private Output</* @Nullable */ HostingEnvironmentProfileResponse> hostingEnvironmentProfile;

    /**
     * @return App Service Environment to use for the app.
     * 
     */
    public Output</* @Nullable */ HostingEnvironmentProfileResponse> getHostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }
    /**
     * HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests
     * 
     */
    @OutputExport(name="httpsOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> httpsOnly;

    /**
     * @return HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests
     * 
     */
    public Output</* @Nullable */ Boolean> getHttpsOnly() {
        return this.httpsOnly;
    }
    /**
     * Hyper-V sandbox.
     * 
     */
    @OutputExport(name="hyperV", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hyperV;

    /**
     * @return Hyper-V sandbox.
     * 
     */
    public Output</* @Nullable */ Boolean> getHyperV() {
        return this.hyperV;
    }
    /**
     * Managed service identity.
     * 
     */
    @OutputExport(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Managed service identity.
     * 
     */
    public Output</* @Nullable */ ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Specifies an operation id if this site has a pending operation.
     * 
     */
    @OutputExport(name="inProgressOperationId", type=String.class, parameters={})
    private Output<String> inProgressOperationId;

    /**
     * @return Specifies an operation id if this site has a pending operation.
     * 
     */
    public Output<String> getInProgressOperationId() {
        return this.inProgressOperationId;
    }
    /**
     * <code>true</code> if the app is a default container; otherwise, <code>false</code>.
     * 
     */
    @OutputExport(name="isDefaultContainer", type=Boolean.class, parameters={})
    private Output<Boolean> isDefaultContainer;

    /**
     * @return <code>true</code> if the app is a default container; otherwise, <code>false</code>.
     * 
     */
    public Output<Boolean> getIsDefaultContainer() {
        return this.isDefaultContainer;
    }
    /**
     * Obsolete: Hyper-V sandbox.
     * 
     */
    @OutputExport(name="isXenon", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isXenon;

    /**
     * @return Obsolete: Hyper-V sandbox.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsXenon() {
        return this.isXenon;
    }
    /**
     * Identity to use for Key Vault Reference authentication.
     * 
     */
    @OutputExport(name="keyVaultReferenceIdentity", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyVaultReferenceIdentity;

    /**
     * @return Identity to use for Key Vault Reference authentication.
     * 
     */
    public Output</* @Nullable */ String> getKeyVaultReferenceIdentity() {
        return this.keyVaultReferenceIdentity;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Last time the app was modified, in UTC. Read-only.
     * 
     */
    @OutputExport(name="lastModifiedTimeUtc", type=String.class, parameters={})
    private Output<String> lastModifiedTimeUtc;

    /**
     * @return Last time the app was modified, in UTC. Read-only.
     * 
     */
    public Output<String> getLastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    /**
     * Resource Location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Maximum number of workers.
     * This only applies to Functions container.
     * 
     */
    @OutputExport(name="maxNumberOfWorkers", type=Integer.class, parameters={})
    private Output<Integer> maxNumberOfWorkers;

    /**
     * @return Maximum number of workers.
     * This only applies to Functions container.
     * 
     */
    public Output<Integer> getMaxNumberOfWorkers() {
        return this.maxNumberOfWorkers;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from tenants that site can be hosted with current settings. Read-only.
     * 
     */
    @OutputExport(name="outboundIpAddresses", type=String.class, parameters={})
    private Output<String> outboundIpAddresses;

    /**
     * @return List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from tenants that site can be hosted with current settings. Read-only.
     * 
     */
    public Output<String> getOutboundIpAddresses() {
        return this.outboundIpAddresses;
    }
    /**
     * List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from all tenants except dataComponent. Read-only.
     * 
     */
    @OutputExport(name="possibleOutboundIpAddresses", type=String.class, parameters={})
    private Output<String> possibleOutboundIpAddresses;

    /**
     * @return List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from all tenants except dataComponent. Read-only.
     * 
     */
    public Output<String> getPossibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }
    /**
     * Site redundancy mode
     * 
     */
    @OutputExport(name="redundancyMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> redundancyMode;

    /**
     * @return Site redundancy mode
     * 
     */
    public Output</* @Nullable */ String> getRedundancyMode() {
        return this.redundancyMode;
    }
    /**
     * Name of the repository site.
     * 
     */
    @OutputExport(name="repositorySiteName", type=String.class, parameters={})
    private Output<String> repositorySiteName;

    /**
     * @return Name of the repository site.
     * 
     */
    public Output<String> getRepositorySiteName() {
        return this.repositorySiteName;
    }
    /**
     * <code>true</code> if reserved; otherwise, <code>false</code>.
     * 
     */
    @OutputExport(name="reserved", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> reserved;

    /**
     * @return <code>true</code> if reserved; otherwise, <code>false</code>.
     * 
     */
    public Output</* @Nullable */ Boolean> getReserved() {
        return this.reserved;
    }
    /**
     * Name of the resource group the app belongs to. Read-only.
     * 
     */
    @OutputExport(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return Name of the resource group the app belongs to. Read-only.
     * 
     */
    public Output<String> getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * <code>true</code> to stop SCM (KUDU) site when the app is stopped; otherwise, <code>false</code>. The default is <code>false</code>.
     * 
     */
    @OutputExport(name="scmSiteAlsoStopped", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> scmSiteAlsoStopped;

    /**
     * @return <code>true</code> to stop SCM (KUDU) site when the app is stopped; otherwise, <code>false</code>. The default is <code>false</code>.
     * 
     */
    public Output</* @Nullable */ Boolean> getScmSiteAlsoStopped() {
        return this.scmSiteAlsoStopped;
    }
    /**
     * Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     * 
     */
    @OutputExport(name="serverFarmId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverFarmId;

    /**
     * @return Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     * 
     */
    public Output</* @Nullable */ String> getServerFarmId() {
        return this.serverFarmId;
    }
    /**
     * Configuration of the app.
     * 
     */
    @OutputExport(name="siteConfig", type=SiteConfigResponse.class, parameters={})
    private Output</* @Nullable */ SiteConfigResponse> siteConfig;

    /**
     * @return Configuration of the app.
     * 
     */
    public Output</* @Nullable */ SiteConfigResponse> getSiteConfig() {
        return this.siteConfig;
    }
    /**
     * Status of the last deployment slot swap operation.
     * 
     */
    @OutputExport(name="slotSwapStatus", type=SlotSwapStatusResponse.class, parameters={})
    private Output<SlotSwapStatusResponse> slotSwapStatus;

    /**
     * @return Status of the last deployment slot swap operation.
     * 
     */
    public Output<SlotSwapStatusResponse> getSlotSwapStatus() {
        return this.slotSwapStatus;
    }
    /**
     * Current state of the app.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current state of the app.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Checks if Customer provided storage account is required
     * 
     */
    @OutputExport(name="storageAccountRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> storageAccountRequired;

    /**
     * @return Checks if Customer provided storage account is required
     * 
     */
    public Output</* @Nullable */ Boolean> getStorageAccountRequired() {
        return this.storageAccountRequired;
    }
    /**
     * App suspended till in case memory-time quota is exceeded.
     * 
     */
    @OutputExport(name="suspendedTill", type=String.class, parameters={})
    private Output<String> suspendedTill;

    /**
     * @return App suspended till in case memory-time quota is exceeded.
     * 
     */
    public Output<String> getSuspendedTill() {
        return this.suspendedTill;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Specifies which deployment slot this app will swap into. Read-only.
     * 
     */
    @OutputExport(name="targetSwapSlot", type=String.class, parameters={})
    private Output<String> targetSwapSlot;

    /**
     * @return Specifies which deployment slot this app will swap into. Read-only.
     * 
     */
    public Output<String> getTargetSwapSlot() {
        return this.targetSwapSlot;
    }
    /**
     * Azure Traffic Manager hostnames associated with the app. Read-only.
     * 
     */
    @OutputExport(name="trafficManagerHostNames", type=List.class, parameters={String.class})
    private Output<List<String>> trafficManagerHostNames;

    /**
     * @return Azure Traffic Manager hostnames associated with the app. Read-only.
     * 
     */
    public Output<List<String>> getTrafficManagerHostNames() {
        return this.trafficManagerHostNames;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * State indicating whether the app has exceeded its quota usage. Read-only.
     * 
     */
    @OutputExport(name="usageState", type=String.class, parameters={})
    private Output<String> usageState;

    /**
     * @return State indicating whether the app has exceeded its quota usage. Read-only.
     * 
     */
    public Output<String> getUsageState() {
        return this.usageState;
    }
    /**
     * Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
     * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
     * 
     */
    @OutputExport(name="virtualNetworkSubnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> virtualNetworkSubnetId;

    /**
     * @return Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
     * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
     * 
     */
    public Output</* @Nullable */ String> getVirtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebApp(String name) {
        this(name, WebAppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebApp(String name, WebAppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebApp(String name, WebAppArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebApp", name, args == null ? WebAppArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebApp(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebApp", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebApp").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebApp").build())
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
    public static WebApp get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebApp(name, id, options);
    }
}
