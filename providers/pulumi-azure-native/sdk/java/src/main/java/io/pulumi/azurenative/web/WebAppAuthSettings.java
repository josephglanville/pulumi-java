// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppAuthSettingsArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:web:WebAppAuthSettings")
public class WebAppAuthSettings extends io.pulumi.resources.CustomResource {
    @OutputExport(name="aadClaimsAuthorization", type=String.class, parameters={})
    private Output</* @Nullable */ String> aadClaimsAuthorization;

    public Output</* @Nullable */ String> getAadClaimsAuthorization() {
        return this.aadClaimsAuthorization;
    }
    @OutputExport(name="additionalLoginParams", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> additionalLoginParams;

    public Output</* @Nullable */ List<String>> getAdditionalLoginParams() {
        return this.additionalLoginParams;
    }
    @OutputExport(name="allowedAudiences", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedAudiences;

    public Output</* @Nullable */ List<String>> getAllowedAudiences() {
        return this.allowedAudiences;
    }
    @OutputExport(name="allowedExternalRedirectUrls", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedExternalRedirectUrls;

    public Output</* @Nullable */ List<String>> getAllowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls;
    }
    @OutputExport(name="authFilePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> authFilePath;

    public Output</* @Nullable */ String> getAuthFilePath() {
        return this.authFilePath;
    }
    @OutputExport(name="clientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientId;

    public Output</* @Nullable */ String> getClientId() {
        return this.clientId;
    }
    @OutputExport(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    public Output</* @Nullable */ String> getClientSecret() {
        return this.clientSecret;
    }
    @OutputExport(name="clientSecretCertificateThumbprint", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecretCertificateThumbprint;

    public Output</* @Nullable */ String> getClientSecretCertificateThumbprint() {
        return this.clientSecretCertificateThumbprint;
    }
    @OutputExport(name="clientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecretSettingName;

    public Output</* @Nullable */ String> getClientSecretSettingName() {
        return this.clientSecretSettingName;
    }
    @OutputExport(name="configVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> configVersion;

    public Output</* @Nullable */ String> getConfigVersion() {
        return this.configVersion;
    }
    @OutputExport(name="defaultProvider", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultProvider;

    public Output</* @Nullable */ String> getDefaultProvider() {
        return this.defaultProvider;
    }
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    @OutputExport(name="facebookAppId", type=String.class, parameters={})
    private Output</* @Nullable */ String> facebookAppId;

    public Output</* @Nullable */ String> getFacebookAppId() {
        return this.facebookAppId;
    }
    @OutputExport(name="facebookAppSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> facebookAppSecret;

    public Output</* @Nullable */ String> getFacebookAppSecret() {
        return this.facebookAppSecret;
    }
    @OutputExport(name="facebookAppSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> facebookAppSecretSettingName;

    public Output</* @Nullable */ String> getFacebookAppSecretSettingName() {
        return this.facebookAppSecretSettingName;
    }
    @OutputExport(name="facebookOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> facebookOAuthScopes;

    public Output</* @Nullable */ List<String>> getFacebookOAuthScopes() {
        return this.facebookOAuthScopes;
    }
    @OutputExport(name="gitHubClientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> gitHubClientId;

    public Output</* @Nullable */ String> getGitHubClientId() {
        return this.gitHubClientId;
    }
    @OutputExport(name="gitHubClientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> gitHubClientSecret;

    public Output</* @Nullable */ String> getGitHubClientSecret() {
        return this.gitHubClientSecret;
    }
    @OutputExport(name="gitHubClientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> gitHubClientSecretSettingName;

    public Output</* @Nullable */ String> getGitHubClientSecretSettingName() {
        return this.gitHubClientSecretSettingName;
    }
    @OutputExport(name="gitHubOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> gitHubOAuthScopes;

    public Output</* @Nullable */ List<String>> getGitHubOAuthScopes() {
        return this.gitHubOAuthScopes;
    }
    @OutputExport(name="googleClientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> googleClientId;

    public Output</* @Nullable */ String> getGoogleClientId() {
        return this.googleClientId;
    }
    @OutputExport(name="googleClientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> googleClientSecret;

    public Output</* @Nullable */ String> getGoogleClientSecret() {
        return this.googleClientSecret;
    }
    @OutputExport(name="googleClientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> googleClientSecretSettingName;

    public Output</* @Nullable */ String> getGoogleClientSecretSettingName() {
        return this.googleClientSecretSettingName;
    }
    @OutputExport(name="googleOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> googleOAuthScopes;

    public Output</* @Nullable */ List<String>> getGoogleOAuthScopes() {
        return this.googleOAuthScopes;
    }
    @OutputExport(name="isAuthFromFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> isAuthFromFile;

    public Output</* @Nullable */ String> getIsAuthFromFile() {
        return this.isAuthFromFile;
    }
    @OutputExport(name="issuer", type=String.class, parameters={})
    private Output</* @Nullable */ String> issuer;

    public Output</* @Nullable */ String> getIssuer() {
        return this.issuer;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="microsoftAccountClientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAccountClientId;

    public Output</* @Nullable */ String> getMicrosoftAccountClientId() {
        return this.microsoftAccountClientId;
    }
    @OutputExport(name="microsoftAccountClientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAccountClientSecret;

    public Output</* @Nullable */ String> getMicrosoftAccountClientSecret() {
        return this.microsoftAccountClientSecret;
    }
    @OutputExport(name="microsoftAccountClientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAccountClientSecretSettingName;

    public Output</* @Nullable */ String> getMicrosoftAccountClientSecretSettingName() {
        return this.microsoftAccountClientSecretSettingName;
    }
    @OutputExport(name="microsoftAccountOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> microsoftAccountOAuthScopes;

    public Output</* @Nullable */ List<String>> getMicrosoftAccountOAuthScopes() {
        return this.microsoftAccountOAuthScopes;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="runtimeVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeVersion;

    public Output</* @Nullable */ String> getRuntimeVersion() {
        return this.runtimeVersion;
    }
    @OutputExport(name="tokenRefreshExtensionHours", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> tokenRefreshExtensionHours;

    public Output</* @Nullable */ Double> getTokenRefreshExtensionHours() {
        return this.tokenRefreshExtensionHours;
    }
    @OutputExport(name="tokenStoreEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tokenStoreEnabled;

    public Output</* @Nullable */ Boolean> getTokenStoreEnabled() {
        return this.tokenStoreEnabled;
    }
    @OutputExport(name="twitterConsumerKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> twitterConsumerKey;

    public Output</* @Nullable */ String> getTwitterConsumerKey() {
        return this.twitterConsumerKey;
    }
    @OutputExport(name="twitterConsumerSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> twitterConsumerSecret;

    public Output</* @Nullable */ String> getTwitterConsumerSecret() {
        return this.twitterConsumerSecret;
    }
    @OutputExport(name="twitterConsumerSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> twitterConsumerSecretSettingName;

    public Output</* @Nullable */ String> getTwitterConsumerSecretSettingName() {
        return this.twitterConsumerSecretSettingName;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="unauthenticatedClientAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> unauthenticatedClientAction;

    public Output</* @Nullable */ String> getUnauthenticatedClientAction() {
        return this.unauthenticatedClientAction;
    }
    @OutputExport(name="validateIssuer", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> validateIssuer;

    public Output</* @Nullable */ Boolean> getValidateIssuer() {
        return this.validateIssuer;
    }

    public WebAppAuthSettings(String name, WebAppAuthSettingsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppAuthSettings", name, args == null ? WebAppAuthSettingsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppAuthSettings(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppAuthSettings", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppAuthSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppAuthSettings").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WebAppAuthSettings get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppAuthSettings(name, id, options);
    }
}
