// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.StaticSiteArgs;
import io.pulumi.azurenative.web.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.web.outputs.ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse;
import io.pulumi.azurenative.web.outputs.SkuDescriptionResponse;
import io.pulumi.azurenative.web.outputs.StaticSiteBuildPropertiesResponse;
import io.pulumi.azurenative.web.outputs.StaticSiteTemplateOptionsResponse;
import io.pulumi.azurenative.web.outputs.StaticSiteUserProvidedFunctionAppResponse;
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

@ResourceType(type="azure-native:web:StaticSite")
public class StaticSite extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allowConfigFileUpdates", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowConfigFileUpdates;

    public Output</* @Nullable */ Boolean> getAllowConfigFileUpdates() {
        return this.allowConfigFileUpdates;
    }
    @OutputExport(name="branch", type=String.class, parameters={})
    private Output</* @Nullable */ String> branch;

    public Output</* @Nullable */ String> getBranch() {
        return this.branch;
    }
    @OutputExport(name="buildProperties", type=StaticSiteBuildPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ StaticSiteBuildPropertiesResponse> buildProperties;

    public Output</* @Nullable */ StaticSiteBuildPropertiesResponse> getBuildProperties() {
        return this.buildProperties;
    }
    @OutputExport(name="contentDistributionEndpoint", type=String.class, parameters={})
    private Output<String> contentDistributionEndpoint;

    public Output<String> getContentDistributionEndpoint() {
        return this.contentDistributionEndpoint;
    }
    @OutputExport(name="customDomains", type=List.class, parameters={String.class})
    private Output<List<String>> customDomains;

    public Output<List<String>> getCustomDomains() {
        return this.customDomains;
    }
    @OutputExport(name="defaultHostname", type=String.class, parameters={})
    private Output<String> defaultHostname;

    public Output<String> getDefaultHostname() {
        return this.defaultHostname;
    }
    @OutputExport(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    public Output</* @Nullable */ ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="keyVaultReferenceIdentity", type=String.class, parameters={})
    private Output<String> keyVaultReferenceIdentity;

    public Output<String> getKeyVaultReferenceIdentity() {
        return this.keyVaultReferenceIdentity;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
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
    @OutputExport(name="privateEndpointConnections", type=List.class, parameters={ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse.class})
    private Output<List<ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse>> privateEndpointConnections;

    public Output<List<ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    @OutputExport(name="provider", type=String.class, parameters={})
    private Output<String> provider;

    public Output<String> getProvider() {
        return this.provider;
    }
    @OutputExport(name="repositoryToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> repositoryToken;

    public Output</* @Nullable */ String> getRepositoryToken() {
        return this.repositoryToken;
    }
    @OutputExport(name="repositoryUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> repositoryUrl;

    public Output</* @Nullable */ String> getRepositoryUrl() {
        return this.repositoryUrl;
    }
    @OutputExport(name="sku", type=SkuDescriptionResponse.class, parameters={})
    private Output</* @Nullable */ SkuDescriptionResponse> sku;

    public Output</* @Nullable */ SkuDescriptionResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="stagingEnvironmentPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> stagingEnvironmentPolicy;

    public Output</* @Nullable */ String> getStagingEnvironmentPolicy() {
        return this.stagingEnvironmentPolicy;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="templateProperties", type=StaticSiteTemplateOptionsResponse.class, parameters={})
    private Output</* @Nullable */ StaticSiteTemplateOptionsResponse> templateProperties;

    public Output</* @Nullable */ StaticSiteTemplateOptionsResponse> getTemplateProperties() {
        return this.templateProperties;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="userProvidedFunctionApps", type=List.class, parameters={StaticSiteUserProvidedFunctionAppResponse.class})
    private Output<List<StaticSiteUserProvidedFunctionAppResponse>> userProvidedFunctionApps;

    public Output<List<StaticSiteUserProvidedFunctionAppResponse>> getUserProvidedFunctionApps() {
        return this.userProvidedFunctionApps;
    }

    public StaticSite(String name, StaticSiteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSite", name, args == null ? StaticSiteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StaticSite(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSite", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20190801:StaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:StaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:StaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:StaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:StaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:StaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:StaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:StaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:StaticSite").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static StaticSite get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StaticSite(name, id, options);
    }
}
