// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppSitePushSettingsArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:web:WebAppSitePushSettings")
public class WebAppSitePushSettings extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dynamicTagsJson", type=String.class, parameters={})
    private Output</* @Nullable */ String> dynamicTagsJson;

    public Output</* @Nullable */ String> getDynamicTagsJson() {
        return this.dynamicTagsJson;
    }
    @OutputExport(name="isPushEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isPushEnabled;

    public Output<Boolean> getIsPushEnabled() {
        return this.isPushEnabled;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tagWhitelistJson", type=String.class, parameters={})
    private Output</* @Nullable */ String> tagWhitelistJson;

    public Output</* @Nullable */ String> getTagWhitelistJson() {
        return this.tagWhitelistJson;
    }
    @OutputExport(name="tagsRequiringAuth", type=String.class, parameters={})
    private Output</* @Nullable */ String> tagsRequiringAuth;

    public Output</* @Nullable */ String> getTagsRequiringAuth() {
        return this.tagsRequiringAuth;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WebAppSitePushSettings(String name, WebAppSitePushSettingsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSitePushSettings", name, args == null ? WebAppSitePushSettingsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppSitePushSettings(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSitePushSettings", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppSitePushSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppSitePushSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppSitePushSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppSitePushSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppSitePushSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppSitePushSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppSitePushSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppSitePushSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppSitePushSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppSitePushSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppSitePushSettings").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppSitePushSettings").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WebAppSitePushSettings get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppSitePushSettings(name, id, options);
    }
}
