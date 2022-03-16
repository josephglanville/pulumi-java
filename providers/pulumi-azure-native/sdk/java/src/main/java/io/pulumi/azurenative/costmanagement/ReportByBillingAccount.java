// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.ReportByBillingAccountArgs;
import io.pulumi.azurenative.costmanagement.outputs.ReportDefinitionResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportDeliveryInfoResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportScheduleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A report resource.
 * API Version: 2018-08-01-preview.
 * 
 */
@ResourceType(type="azure-native:costmanagement:ReportByBillingAccount")
public class ReportByBillingAccount extends io.pulumi.resources.CustomResource {
    /**
     * Has definition for the report.
     * 
     */
    @Export(name="definition", type=ReportDefinitionResponse.class, parameters={})
    private Output<ReportDefinitionResponse> definition;

    /**
     * @return Has definition for the report.
     * 
     */
    public Output<ReportDefinitionResponse> getDefinition() {
        return this.definition;
    }
    /**
     * Has delivery information for the report.
     * 
     */
    @Export(name="deliveryInfo", type=ReportDeliveryInfoResponse.class, parameters={})
    private Output<ReportDeliveryInfoResponse> deliveryInfo;

    /**
     * @return Has delivery information for the report.
     * 
     */
    public Output<ReportDeliveryInfoResponse> getDeliveryInfo() {
        return this.deliveryInfo;
    }
    /**
     * The format of the report being delivered.
     * 
     */
    @Export(name="format", type=String.class, parameters={})
    private Output</* @Nullable */ String> format;

    /**
     * @return The format of the report being delivered.
     * 
     */
    public Output</* @Nullable */ String> getFormat() {
        return this.format;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Has schedule information for the report.
     * 
     */
    @Export(name="schedule", type=ReportScheduleResponse.class, parameters={})
    private Output</* @Nullable */ ReportScheduleResponse> schedule;

    /**
     * @return Has schedule information for the report.
     * 
     */
    public Output</* @Nullable */ ReportScheduleResponse> getSchedule() {
        return this.schedule;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ReportByBillingAccountArgs.Builder a);
    }
    private static io.pulumi.azurenative.costmanagement.ReportByBillingAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.costmanagement.ReportByBillingAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ReportByBillingAccount(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReportByBillingAccount(String name) {
        this(name, ReportByBillingAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReportByBillingAccount(String name, ReportByBillingAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReportByBillingAccount(String name, ReportByBillingAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:ReportByBillingAccount", name, args == null ? ReportByBillingAccountArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ReportByBillingAccount(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:ReportByBillingAccount", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:costmanagement/v20180801preview:ReportByBillingAccount").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ReportByBillingAccount get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReportByBillingAccount(name, id, options);
    }
}
