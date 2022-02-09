// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.elastic.MonitorArgs;
import io.pulumi.azurenative.elastic.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.elastic.outputs.MonitorPropertiesResponse;
import io.pulumi.azurenative.elastic.outputs.ResourceSkuResponse;
import io.pulumi.azurenative.elastic.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:elastic:Monitor")
public class Monitor extends io.pulumi.resources.CustomResource {
    @OutputExport(name="identity", type=IdentityPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ IdentityPropertiesResponse> identity;

    public Output</* @Nullable */ IdentityPropertiesResponse> getIdentity() {
        return this.identity;
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
    @OutputExport(name="properties", type=MonitorPropertiesResponse.class, parameters={})
    private Output<MonitorPropertiesResponse> properties;

    public Output<MonitorPropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="sku", type=ResourceSkuResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSkuResponse> sku;

    public Output</* @Nullable */ ResourceSkuResponse> getSku() {
        return this.sku;
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

    public Monitor(String name, MonitorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:elastic:Monitor", name, args == null ? MonitorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Monitor(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:elastic:Monitor", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:elastic/v20200701:Monitor").build()),
                Input.of(Alias.builder().setType("azure-native:elastic/v20200701preview:Monitor").build()),
                Input.of(Alias.builder().setType("azure-native:elastic/v20210901preview:Monitor").build()),
                Input.of(Alias.builder().setType("azure-native:elastic/v20211001preview:Monitor").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Monitor get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Monitor(name, id, options);
    }
}
