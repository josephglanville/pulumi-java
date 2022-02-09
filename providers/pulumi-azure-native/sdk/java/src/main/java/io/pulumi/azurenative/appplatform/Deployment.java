// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.DeploymentArgs;
import io.pulumi.azurenative.appplatform.outputs.DeploymentResourcePropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:appplatform:Deployment")
public class Deployment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=DeploymentResourcePropertiesResponse.class, parameters={})
    private Output<DeploymentResourcePropertiesResponse> properties;

    public Output<DeploymentResourcePropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Deployment(String name, DeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Deployment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:Deployment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:appplatform/v20190501preview:Deployment").build()),
                Input.of(Alias.builder().setType("azure-native:appplatform/v20200701:Deployment").build()),
                Input.of(Alias.builder().setType("azure-native:appplatform/v20201101preview:Deployment").build()),
                Input.of(Alias.builder().setType("azure-native:appplatform/v20210601preview:Deployment").build()),
                Input.of(Alias.builder().setType("azure-native:appplatform/v20210901preview:Deployment").build()),
                Input.of(Alias.builder().setType("azure-native:appplatform/v20220101preview:Deployment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Deployment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, options);
    }
}
