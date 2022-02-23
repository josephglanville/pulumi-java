// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.RouteArgs;
import io.pulumi.azurenative.cdn.outputs.CompressionSettingsResponse;
import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Friendly Routes name mapping to the any Routes or secret related information.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cdn:Route route1 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/afdendpoints/endpoint1/routes/route1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:Route")
public class Route extends io.pulumi.resources.CustomResource {
    /**
     * compression settings.
     * 
     */
    @OutputExport(name="compressionSettings", type=CompressionSettingsResponse.class, parameters={})
    private Output</* @Nullable */ CompressionSettingsResponse> compressionSettings;

    /**
     * @return compression settings.
     * 
     */
    public Output</* @Nullable */ CompressionSettingsResponse> getCompressionSettings() {
        return this.compressionSettings;
    }
    /**
     * Domains referenced by this endpoint.
     * 
     */
    @OutputExport(name="customDomains", type=List.class, parameters={ResourceReferenceResponse.class})
    private Output</* @Nullable */ List<ResourceReferenceResponse>> customDomains;

    /**
     * @return Domains referenced by this endpoint.
     * 
     */
    public Output</* @Nullable */ List<ResourceReferenceResponse>> getCustomDomains() {
        return this.customDomains;
    }
    @OutputExport(name="deploymentStatus", type=String.class, parameters={})
    private Output<String> deploymentStatus;

    public Output<String> getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'
     * 
     */
    @OutputExport(name="enabledState", type=String.class, parameters={})
    private Output</* @Nullable */ String> enabledState;

    /**
     * @return Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'
     * 
     */
    public Output</* @Nullable */ String> getEnabledState() {
        return this.enabledState;
    }
    /**
     * Protocol this rule will use when forwarding traffic to backends.
     * 
     */
    @OutputExport(name="forwardingProtocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> forwardingProtocol;

    /**
     * @return Protocol this rule will use when forwarding traffic to backends.
     * 
     */
    public Output</* @Nullable */ String> getForwardingProtocol() {
        return this.forwardingProtocol;
    }
    /**
     * Whether to automatically redirect HTTP traffic to HTTPS traffic. Note that this is a easy way to set up this rule and it will be the first rule that gets executed.
     * 
     */
    @OutputExport(name="httpsRedirect", type=String.class, parameters={})
    private Output</* @Nullable */ String> httpsRedirect;

    /**
     * @return Whether to automatically redirect HTTP traffic to HTTPS traffic. Note that this is a easy way to set up this rule and it will be the first rule that gets executed.
     * 
     */
    public Output</* @Nullable */ String> getHttpsRedirect() {
        return this.httpsRedirect;
    }
    /**
     * whether this route will be linked to the default endpoint domain.
     * 
     */
    @OutputExport(name="linkToDefaultDomain", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkToDefaultDomain;

    /**
     * @return whether this route will be linked to the default endpoint domain.
     * 
     */
    public Output</* @Nullable */ String> getLinkToDefaultDomain() {
        return this.linkToDefaultDomain;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A reference to the origin group.
     * 
     */
    @OutputExport(name="originGroup", type=ResourceReferenceResponse.class, parameters={})
    private Output<ResourceReferenceResponse> originGroup;

    /**
     * @return A reference to the origin group.
     * 
     */
    public Output<ResourceReferenceResponse> getOriginGroup() {
        return this.originGroup;
    }
    /**
     * A directory path on the origin that AzureFrontDoor can use to retrieve content from, e.g. contoso.cloudapp.net/originpath.
     * 
     */
    @OutputExport(name="originPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> originPath;

    /**
     * @return A directory path on the origin that AzureFrontDoor can use to retrieve content from, e.g. contoso.cloudapp.net/originpath.
     * 
     */
    public Output</* @Nullable */ String> getOriginPath() {
        return this.originPath;
    }
    /**
     * The route patterns of the rule.
     * 
     */
    @OutputExport(name="patternsToMatch", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> patternsToMatch;

    /**
     * @return The route patterns of the rule.
     * 
     */
    public Output</* @Nullable */ List<String>> getPatternsToMatch() {
        return this.patternsToMatch;
    }
    /**
     * Provisioning status
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Defines how CDN caches requests that include query strings. You can ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being cached, or cache every request with a unique URL.
     * 
     */
    @OutputExport(name="queryStringCachingBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> queryStringCachingBehavior;

    /**
     * @return Defines how CDN caches requests that include query strings. You can ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being cached, or cache every request with a unique URL.
     * 
     */
    public Output</* @Nullable */ String> getQueryStringCachingBehavior() {
        return this.queryStringCachingBehavior;
    }
    /**
     * rule sets referenced by this endpoint.
     * 
     */
    @OutputExport(name="ruleSets", type=List.class, parameters={ResourceReferenceResponse.class})
    private Output</* @Nullable */ List<ResourceReferenceResponse>> ruleSets;

    /**
     * @return rule sets referenced by this endpoint.
     * 
     */
    public Output</* @Nullable */ List<ResourceReferenceResponse>> getRuleSets() {
        return this.ruleSets;
    }
    /**
     * List of supported protocols for this route.
     * 
     */
    @OutputExport(name="supportedProtocols", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> supportedProtocols;

    /**
     * @return List of supported protocols for this route.
     * 
     */
    public Output</* @Nullable */ List<String>> getSupportedProtocols() {
        return this.supportedProtocols;
    }
    /**
     * Read only system data
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, RouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Route(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Route", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cdn/v20200901:Route").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20210601:Route").build())
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
    public static Route get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, options);
    }
}
