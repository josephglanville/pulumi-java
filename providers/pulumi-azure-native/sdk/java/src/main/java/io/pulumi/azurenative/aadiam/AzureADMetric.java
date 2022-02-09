// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.aadiam.AzureADMetricArgs;
import io.pulumi.azurenative.aadiam.outputs.AzureADMetricsPropertiesFormatResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:aadiam:azureADMetric")
public class AzureADMetric extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="properties", type=AzureADMetricsPropertiesFormatResponse.class, parameters={})
    private Output<AzureADMetricsPropertiesFormatResponse> properties;

    public Output<AzureADMetricsPropertiesFormatResponse> getProperties() {
        return this.properties;
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

    public AzureADMetric(String name, AzureADMetricArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aadiam:azureADMetric", name, args == null ? AzureADMetricArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AzureADMetric(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aadiam:azureADMetric", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:aadiam/v20200701preview:azureADMetric").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static AzureADMetric get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AzureADMetric(name, id, options);
    }
}
