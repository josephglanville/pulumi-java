// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppVnetConnectionArgs;
import io.pulumi.azurenative.web.outputs.VnetRouteResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:web:WebAppVnetConnection")
public class WebAppVnetConnection extends io.pulumi.resources.CustomResource {
    @OutputExport(name="certBlob", type=String.class, parameters={})
    private Output</* @Nullable */ String> certBlob;

    public Output</* @Nullable */ String> getCertBlob() {
        return this.certBlob;
    }
    @OutputExport(name="certThumbprint", type=String.class, parameters={})
    private Output<String> certThumbprint;

    public Output<String> getCertThumbprint() {
        return this.certThumbprint;
    }
    @OutputExport(name="dnsServers", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsServers;

    public Output</* @Nullable */ String> getDnsServers() {
        return this.dnsServers;
    }
    @OutputExport(name="isSwift", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isSwift;

    public Output</* @Nullable */ Boolean> getIsSwift() {
        return this.isSwift;
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
    @OutputExport(name="resyncRequired", type=Boolean.class, parameters={})
    private Output<Boolean> resyncRequired;

    public Output<Boolean> getResyncRequired() {
        return this.resyncRequired;
    }
    @OutputExport(name="routes", type=List.class, parameters={VnetRouteResponse.class})
    private Output<List<VnetRouteResponse>> routes;

    public Output<List<VnetRouteResponse>> getRoutes() {
        return this.routes;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="vnetResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vnetResourceId;

    public Output</* @Nullable */ String> getVnetResourceId() {
        return this.vnetResourceId;
    }

    public WebAppVnetConnection(String name, WebAppVnetConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppVnetConnection", name, args == null ? WebAppVnetConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppVnetConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppVnetConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppVnetConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppVnetConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WebAppVnetConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppVnetConnection(name, id, options);
    }
}
