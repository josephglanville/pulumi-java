// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbidedicated;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.powerbidedicated.AutoScaleVCoreArgs;
import io.pulumi.azurenative.powerbidedicated.outputs.AutoScaleVCoreSkuResponse;
import io.pulumi.azurenative.powerbidedicated.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents an instance of an auto scale v-core resource.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:powerbidedicated:AutoScaleVCore testvcore /subscriptions/613192d7-503f-477a-9cfe-4efc3ee2bd60/resourceGroups/TestRG/providers/Microsoft.PowerBIDedicated/autoScaleVCores/testvcore 
 * ```
 * 
 */
@ResourceType(type="azure-native:powerbidedicated:AutoScaleVCore")
public class AutoScaleVCore extends io.pulumi.resources.CustomResource {
    /**
     * The maximum capacity of an auto scale v-core resource.
     * 
     */
    @OutputExport(name="capacityLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> capacityLimit;

    /**
     * @return The maximum capacity of an auto scale v-core resource.
     * 
     */
    public Output</* @Nullable */ Integer> getCapacityLimit() {
        return this.capacityLimit;
    }
    /**
     * The object ID of the capacity resource associated with the auto scale v-core resource.
     * 
     */
    @OutputExport(name="capacityObjectId", type=String.class, parameters={})
    private Output</* @Nullable */ String> capacityObjectId;

    /**
     * @return The object ID of the capacity resource associated with the auto scale v-core resource.
     * 
     */
    public Output</* @Nullable */ String> getCapacityObjectId() {
        return this.capacityObjectId;
    }
    /**
     * Location of the PowerBI Dedicated resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the PowerBI Dedicated resource.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the PowerBI Dedicated resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the PowerBI Dedicated resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current deployment state of an auto scale v-core resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment state of an auto scale v-core resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU of the auto scale v-core resource.
     * 
     */
    @OutputExport(name="sku", type=AutoScaleVCoreSkuResponse.class, parameters={})
    private Output<AutoScaleVCoreSkuResponse> sku;

    /**
     * @return The SKU of the auto scale v-core resource.
     * 
     */
    public Output<AutoScaleVCoreSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output</* @Nullable */ SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output</* @Nullable */ SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of additional resource provisioning properties.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the PowerBI Dedicated resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the PowerBI Dedicated resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(AutoScaleVCoreArgs.Builder a);
    }
    private static io.pulumi.azurenative.powerbidedicated.AutoScaleVCoreArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.powerbidedicated.AutoScaleVCoreArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AutoScaleVCore(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoScaleVCore(String name) {
        this(name, AutoScaleVCoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoScaleVCore(String name, AutoScaleVCoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoScaleVCore(String name, AutoScaleVCoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:powerbidedicated:AutoScaleVCore", name, args == null ? AutoScaleVCoreArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AutoScaleVCore(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:powerbidedicated:AutoScaleVCore", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:powerbidedicated/v20210101:AutoScaleVCore").build())
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
    public static AutoScaleVCore get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AutoScaleVCore(name, id, options);
    }
}
