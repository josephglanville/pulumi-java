// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.StaticSiteUserProvidedFunctionAppForStaticSiteArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:web:StaticSiteUserProvidedFunctionAppForStaticSite")
public class StaticSiteUserProvidedFunctionAppForStaticSite extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    public Output<String> getCreatedOn() {
        return this.createdOn;
    }
    @OutputExport(name="functionAppRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> functionAppRegion;

    public Output</* @Nullable */ String> getFunctionAppRegion() {
        return this.functionAppRegion;
    }
    @OutputExport(name="functionAppResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> functionAppResourceId;

    public Output</* @Nullable */ String> getFunctionAppResourceId() {
        return this.functionAppResourceId;
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
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public StaticSiteUserProvidedFunctionAppForStaticSite(String name, StaticSiteUserProvidedFunctionAppForStaticSiteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSiteUserProvidedFunctionAppForStaticSite", name, args == null ? StaticSiteUserProvidedFunctionAppForStaticSiteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StaticSiteUserProvidedFunctionAppForStaticSite(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSiteUserProvidedFunctionAppForStaticSite", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20201201:StaticSiteUserProvidedFunctionAppForStaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:StaticSiteUserProvidedFunctionAppForStaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:StaticSiteUserProvidedFunctionAppForStaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:StaticSiteUserProvidedFunctionAppForStaticSite").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:StaticSiteUserProvidedFunctionAppForStaticSite").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static StaticSiteUserProvidedFunctionAppForStaticSite get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StaticSiteUserProvidedFunctionAppForStaticSite(name, id, options);
    }
}
