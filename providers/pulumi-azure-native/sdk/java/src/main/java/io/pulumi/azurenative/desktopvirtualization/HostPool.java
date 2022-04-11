// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.desktopvirtualization.HostPoolArgs;
import io.pulumi.azurenative.desktopvirtualization.outputs.MigrationRequestPropertiesResponse;
import io.pulumi.azurenative.desktopvirtualization.outputs.RegistrationInfoResponse;
import io.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponseIdentity;
import io.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponsePlan;
import io.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponseSku;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents a HostPool definition.
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:desktopvirtualization:HostPool hostPool1 /subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroup1/providers/Microsoft.DesktopVirtualization/hostPools/hostPool1 
 * ```
 * 
 */
@ResourceType(type="azure-native:desktopvirtualization:HostPool")
public class HostPool extends io.pulumi.resources.CustomResource {
    /**
     * List of applicationGroup links.
     * 
     */
    @Export(name="applicationGroupReferences", type=List.class, parameters={String.class})
    private Output<List<String>> applicationGroupReferences;

    /**
     * @return List of applicationGroup links.
     * 
     */
    public Output<List<String>> getApplicationGroupReferences() {
        return this.applicationGroupReferences;
    }
    /**
     * Is cloud pc resource.
     * 
     */
    @Export(name="cloudPcResource", type=Boolean.class, parameters={})
    private Output<Boolean> cloudPcResource;

    /**
     * @return Is cloud pc resource.
     * 
     */
    public Output<Boolean> getCloudPcResource() {
        return this.cloudPcResource;
    }
    /**
     * Custom rdp property of HostPool.
     * 
     */
    @Export(name="customRdpProperty", type=String.class, parameters={})
    private Output</* @Nullable */ String> customRdpProperty;

    /**
     * @return Custom rdp property of HostPool.
     * 
     */
    public Output</* @Nullable */ String> getCustomRdpProperty() {
        return this.customRdpProperty;
    }
    /**
     * Description of HostPool.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of HostPool.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Friendly name of HostPool.
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return Friendly name of HostPool.
     * 
     */
    public Output</* @Nullable */ String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * HostPool type for desktop.
     * 
     */
    @Export(name="hostPoolType", type=String.class, parameters={})
    private Output<String> hostPoolType;

    /**
     * @return HostPool type for desktop.
     * 
     */
    public Output<String> getHostPoolType() {
        return this.hostPoolType;
    }
    @Export(name="identity", type=ResourceModelWithAllowedPropertySetResponseIdentity.class, parameters={})
    private Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseIdentity> identity;

    public Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseIdentity> getIdentity() {
        return this.identity;
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * The type of the load balancer.
     * 
     */
    @Export(name="loadBalancerType", type=String.class, parameters={})
    private Output<String> loadBalancerType;

    /**
     * @return The type of the load balancer.
     * 
     */
    public Output<String> getLoadBalancerType() {
        return this.loadBalancerType;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    @Export(name="managedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedBy;

    /**
     * @return The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    public Output</* @Nullable */ String> getManagedBy() {
        return this.managedBy;
    }
    /**
     * The max session limit of HostPool.
     * 
     */
    @Export(name="maxSessionLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxSessionLimit;

    /**
     * @return The max session limit of HostPool.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxSessionLimit() {
        return this.maxSessionLimit;
    }
    /**
     * The registration info of HostPool.
     * 
     */
    @Export(name="migrationRequest", type=MigrationRequestPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ MigrationRequestPropertiesResponse> migrationRequest;

    /**
     * @return The registration info of HostPool.
     * 
     */
    public Output</* @Nullable */ MigrationRequestPropertiesResponse> getMigrationRequest() {
        return this.migrationRequest;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * ObjectId of HostPool. (internal use)
     * 
     */
    @Export(name="objectId", type=String.class, parameters={})
    private Output<String> objectId;

    /**
     * @return ObjectId of HostPool. (internal use)
     * 
     */
    public Output<String> getObjectId() {
        return this.objectId;
    }
    /**
     * PersonalDesktopAssignment type for HostPool.
     * 
     */
    @Export(name="personalDesktopAssignmentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> personalDesktopAssignmentType;

    /**
     * @return PersonalDesktopAssignment type for HostPool.
     * 
     */
    public Output</* @Nullable */ String> getPersonalDesktopAssignmentType() {
        return this.personalDesktopAssignmentType;
    }
    @Export(name="plan", type=ResourceModelWithAllowedPropertySetResponsePlan.class, parameters={})
    private Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponsePlan> plan;

    public Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponsePlan> getPlan() {
        return this.plan;
    }
    /**
     * The type of preferred application group type, default to Desktop Application Group
     * 
     */
    @Export(name="preferredAppGroupType", type=String.class, parameters={})
    private Output<String> preferredAppGroupType;

    /**
     * @return The type of preferred application group type, default to Desktop Application Group
     * 
     */
    public Output<String> getPreferredAppGroupType() {
        return this.preferredAppGroupType;
    }
    /**
     * The registration info of HostPool.
     * 
     */
    @Export(name="registrationInfo", type=RegistrationInfoResponse.class, parameters={})
    private Output</* @Nullable */ RegistrationInfoResponse> registrationInfo;

    /**
     * @return The registration info of HostPool.
     * 
     */
    public Output</* @Nullable */ RegistrationInfoResponse> getRegistrationInfo() {
        return this.registrationInfo;
    }
    /**
     * The ring number of HostPool.
     * 
     */
    @Export(name="ring", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ring;

    /**
     * @return The ring number of HostPool.
     * 
     */
    public Output</* @Nullable */ Integer> getRing() {
        return this.ring;
    }
    @Export(name="sku", type=ResourceModelWithAllowedPropertySetResponseSku.class, parameters={})
    private Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseSku> sku;

    public Output</* @Nullable */ ResourceModelWithAllowedPropertySetResponseSku> getSku() {
        return this.sku;
    }
    /**
     * ClientId for the registered Relying Party used to issue WVD SSO certificates.
     * 
     */
    @Export(name="ssoClientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ssoClientId;

    /**
     * @return ClientId for the registered Relying Party used to issue WVD SSO certificates.
     * 
     */
    public Output</* @Nullable */ String> getSsoClientId() {
        return this.ssoClientId;
    }
    /**
     * Path to Azure KeyVault storing the secret used for communication to ADFS.
     * 
     */
    @Export(name="ssoClientSecretKeyVaultPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> ssoClientSecretKeyVaultPath;

    /**
     * @return Path to Azure KeyVault storing the secret used for communication to ADFS.
     * 
     */
    public Output</* @Nullable */ String> getSsoClientSecretKeyVaultPath() {
        return this.ssoClientSecretKeyVaultPath;
    }
    /**
     * The type of single sign on Secret Type.
     * 
     */
    @Export(name="ssoSecretType", type=String.class, parameters={})
    private Output</* @Nullable */ String> ssoSecretType;

    /**
     * @return The type of single sign on Secret Type.
     * 
     */
    public Output</* @Nullable */ String> getSsoSecretType() {
        return this.ssoSecretType;
    }
    /**
     * URL to customer ADFS server for signing WVD SSO certificates.
     * 
     */
    @Export(name="ssoadfsAuthority", type=String.class, parameters={})
    private Output</* @Nullable */ String> ssoadfsAuthority;

    /**
     * @return URL to customer ADFS server for signing WVD SSO certificates.
     * 
     */
    public Output</* @Nullable */ String> getSsoadfsAuthority() {
        return this.ssoadfsAuthority;
    }
    /**
     * The flag to turn on/off StartVMOnConnect feature.
     * 
     */
    @Export(name="startVMOnConnect", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> startVMOnConnect;

    /**
     * @return The flag to turn on/off StartVMOnConnect feature.
     * 
     */
    public Output</* @Nullable */ Boolean> getStartVMOnConnect() {
        return this.startVMOnConnect;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Is validation environment.
     * 
     */
    @Export(name="validationEnvironment", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> validationEnvironment;

    /**
     * @return Is validation environment.
     * 
     */
    public Output</* @Nullable */ Boolean> getValidationEnvironment() {
        return this.validationEnvironment;
    }
    /**
     * VM template for sessionhosts configuration within hostpool.
     * 
     */
    @Export(name="vmTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmTemplate;

    /**
     * @return VM template for sessionhosts configuration within hostpool.
     * 
     */
    public Output</* @Nullable */ String> getVmTemplate() {
        return this.vmTemplate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostPool(String name) {
        this(name, HostPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostPool(String name, HostPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostPool(String name, HostPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:HostPool", name, args == null ? HostPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HostPool(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:HostPool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20190123preview:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20190924preview:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20191210preview:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20200921preview:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20201019preview:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20201102preview:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20201110preview:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210114preview:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210201preview:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210309preview:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210401preview:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210712:HostPool").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210903preview:HostPool").build())
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
    public static HostPool get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HostPool(name, id, options);
    }
}
