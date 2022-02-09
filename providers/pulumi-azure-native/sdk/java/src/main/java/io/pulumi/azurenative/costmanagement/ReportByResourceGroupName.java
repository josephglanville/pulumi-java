// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.ReportByResourceGroupNameArgs;
import io.pulumi.azurenative.costmanagement.outputs.ReportDefinitionResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportDeliveryInfoResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportScheduleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:costmanagement:ReportByResourceGroupName")
public class ReportByResourceGroupName extends io.pulumi.resources.CustomResource {
    @OutputExport(name="definition", type=ReportDefinitionResponse.class, parameters={})
    private Output<ReportDefinitionResponse> definition;

    public Output<ReportDefinitionResponse> getDefinition() {
        return this.definition;
    }
    @OutputExport(name="deliveryInfo", type=ReportDeliveryInfoResponse.class, parameters={})
    private Output<ReportDeliveryInfoResponse> deliveryInfo;

    public Output<ReportDeliveryInfoResponse> getDeliveryInfo() {
        return this.deliveryInfo;
    }
    @OutputExport(name="format", type=String.class, parameters={})
    private Output</* @Nullable */ String> format;

    public Output</* @Nullable */ String> getFormat() {
        return this.format;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="schedule", type=ReportScheduleResponse.class, parameters={})
    private Output</* @Nullable */ ReportScheduleResponse> schedule;

    public Output</* @Nullable */ ReportScheduleResponse> getSchedule() {
        return this.schedule;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ReportByResourceGroupName(String name, ReportByResourceGroupNameArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:ReportByResourceGroupName", name, args == null ? ReportByResourceGroupNameArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ReportByResourceGroupName(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:ReportByResourceGroupName", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:costmanagement/v20180801preview:ReportByResourceGroupName").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ReportByResourceGroupName get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReportByResourceGroupName(name, id, options);
    }
}
