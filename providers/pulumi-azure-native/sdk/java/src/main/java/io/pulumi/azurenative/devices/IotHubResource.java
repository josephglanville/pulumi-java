// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.IotHubResourceArgs;
import io.pulumi.azurenative.devices.outputs.IotHubPropertiesResponse;
import io.pulumi.azurenative.devices.outputs.IotHubSkuInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:devices:IotHubResource")
public class IotHubResource extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
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
    @OutputExport(name="properties", type=IotHubPropertiesResponse.class, parameters={})
    private Output<IotHubPropertiesResponse> properties;

    public Output<IotHubPropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="sku", type=IotHubSkuInfoResponse.class, parameters={})
    private Output<IotHubSkuInfoResponse> sku;

    public Output<IotHubSkuInfoResponse> getSku() {
        return this.sku;
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

    public IotHubResource(String name, IotHubResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devices:IotHubResource", name, args == null ? IotHubResourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IotHubResource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devices:IotHubResource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:devices/v20160203:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20170119:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20170701:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20180122:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20180401:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20181201preview:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20190322:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20190322preview:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20190701preview:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20191104:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200301:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200401:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200615:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200710preview:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200801:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200831:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200831preview:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210201preview:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210303preview:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210331:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210701:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210701preview:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210702:IotHubResource").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210702preview:IotHubResource").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static IotHubResource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IotHubResource(name, id, options);
    }
}
