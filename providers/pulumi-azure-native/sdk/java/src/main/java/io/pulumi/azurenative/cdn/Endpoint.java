// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.EndpointArgs;
import io.pulumi.azurenative.cdn.outputs.DeepCreatedOriginGroupResponse;
import io.pulumi.azurenative.cdn.outputs.DeepCreatedOriginResponse;
import io.pulumi.azurenative.cdn.outputs.EndpointPropertiesUpdateParametersResponseDeliveryPolicy;
import io.pulumi.azurenative.cdn.outputs.EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink;
import io.pulumi.azurenative.cdn.outputs.GeoFilterResponse;
import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.azurenative.cdn.outputs.UrlSigningKeyResponse;
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

@ResourceType(type="azure-native:cdn:Endpoint")
public class Endpoint extends io.pulumi.resources.CustomResource {
    @OutputExport(name="contentTypesToCompress", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> contentTypesToCompress;

    public Output</* @Nullable */ List<String>> getContentTypesToCompress() {
        return this.contentTypesToCompress;
    }
    @OutputExport(name="defaultOriginGroup", type=ResourceReferenceResponse.class, parameters={})
    private Output</* @Nullable */ ResourceReferenceResponse> defaultOriginGroup;

    public Output</* @Nullable */ ResourceReferenceResponse> getDefaultOriginGroup() {
        return this.defaultOriginGroup;
    }
    @OutputExport(name="deliveryPolicy", type=EndpointPropertiesUpdateParametersResponseDeliveryPolicy.class, parameters={})
    private Output</* @Nullable */ EndpointPropertiesUpdateParametersResponseDeliveryPolicy> deliveryPolicy;

    public Output</* @Nullable */ EndpointPropertiesUpdateParametersResponseDeliveryPolicy> getDeliveryPolicy() {
        return this.deliveryPolicy;
    }
    @OutputExport(name="geoFilters", type=List.class, parameters={GeoFilterResponse.class})
    private Output</* @Nullable */ List<GeoFilterResponse>> geoFilters;

    public Output</* @Nullable */ List<GeoFilterResponse>> getGeoFilters() {
        return this.geoFilters;
    }
    @OutputExport(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    public Output<String> getHostName() {
        return this.hostName;
    }
    @OutputExport(name="isCompressionEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isCompressionEnabled;

    public Output</* @Nullable */ Boolean> getIsCompressionEnabled() {
        return this.isCompressionEnabled;
    }
    @OutputExport(name="isHttpAllowed", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isHttpAllowed;

    public Output</* @Nullable */ Boolean> getIsHttpAllowed() {
        return this.isHttpAllowed;
    }
    @OutputExport(name="isHttpsAllowed", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isHttpsAllowed;

    public Output</* @Nullable */ Boolean> getIsHttpsAllowed() {
        return this.isHttpsAllowed;
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
    @OutputExport(name="optimizationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> optimizationType;

    public Output</* @Nullable */ String> getOptimizationType() {
        return this.optimizationType;
    }
    @OutputExport(name="originGroups", type=List.class, parameters={DeepCreatedOriginGroupResponse.class})
    private Output</* @Nullable */ List<DeepCreatedOriginGroupResponse>> originGroups;

    public Output</* @Nullable */ List<DeepCreatedOriginGroupResponse>> getOriginGroups() {
        return this.originGroups;
    }
    @OutputExport(name="originHostHeader", type=String.class, parameters={})
    private Output</* @Nullable */ String> originHostHeader;

    public Output</* @Nullable */ String> getOriginHostHeader() {
        return this.originHostHeader;
    }
    @OutputExport(name="originPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> originPath;

    public Output</* @Nullable */ String> getOriginPath() {
        return this.originPath;
    }
    @OutputExport(name="origins", type=List.class, parameters={DeepCreatedOriginResponse.class})
    private Output<List<DeepCreatedOriginResponse>> origins;

    public Output<List<DeepCreatedOriginResponse>> getOrigins() {
        return this.origins;
    }
    @OutputExport(name="probePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> probePath;

    public Output</* @Nullable */ String> getProbePath() {
        return this.probePath;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="queryStringCachingBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> queryStringCachingBehavior;

    public Output</* @Nullable */ String> getQueryStringCachingBehavior() {
        return this.queryStringCachingBehavior;
    }
    @OutputExport(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    public Output<String> getResourceState() {
        return this.resourceState;
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
    @OutputExport(name="urlSigningKeys", type=List.class, parameters={UrlSigningKeyResponse.class})
    private Output</* @Nullable */ List<UrlSigningKeyResponse>> urlSigningKeys;

    public Output</* @Nullable */ List<UrlSigningKeyResponse>> getUrlSigningKeys() {
        return this.urlSigningKeys;
    }
    @OutputExport(name="webApplicationFirewallPolicyLink", type=EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink.class, parameters={})
    private Output</* @Nullable */ EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink> webApplicationFirewallPolicyLink;

    public Output</* @Nullable */ EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink> getWebApplicationFirewallPolicyLink() {
        return this.webApplicationFirewallPolicyLink;
    }

    public Endpoint(String name, EndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Endpoint(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Endpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cdn/v20150601:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20160402:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20161002:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20170402:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20171012:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20190415:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20190615:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20190615preview:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20191231:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200331:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200415:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200901:Endpoint").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20210601:Endpoint").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Endpoint get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, options);
    }
}
