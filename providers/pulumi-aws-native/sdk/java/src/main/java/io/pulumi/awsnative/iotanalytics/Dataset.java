// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotanalytics.DatasetArgs;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetAction;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetContentDeliveryRule;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetLateDataRule;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetRetentionPeriod;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetTag;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetTrigger;
import io.pulumi.awsnative.iotanalytics.outputs.DatasetVersioningConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IoTAnalytics::Dataset
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iotanalytics:Dataset")
public class Dataset extends io.pulumi.resources.CustomResource {
    @OutputExport(name="actions", type=List.class, parameters={DatasetAction.class})
    private Output<List<DatasetAction>> actions;

    public Output<List<DatasetAction>> getActions() {
        return this.actions;
    }
    @OutputExport(name="contentDeliveryRules", type=List.class, parameters={DatasetContentDeliveryRule.class})
    private Output</* @Nullable */ List<DatasetContentDeliveryRule>> contentDeliveryRules;

    public Output</* @Nullable */ List<DatasetContentDeliveryRule>> getContentDeliveryRules() {
        return this.contentDeliveryRules;
    }
    @OutputExport(name="datasetName", type=String.class, parameters={})
    private Output</* @Nullable */ String> datasetName;

    public Output</* @Nullable */ String> getDatasetName() {
        return this.datasetName;
    }
    @OutputExport(name="lateDataRules", type=List.class, parameters={DatasetLateDataRule.class})
    private Output</* @Nullable */ List<DatasetLateDataRule>> lateDataRules;

    public Output</* @Nullable */ List<DatasetLateDataRule>> getLateDataRules() {
        return this.lateDataRules;
    }
    @OutputExport(name="retentionPeriod", type=DatasetRetentionPeriod.class, parameters={})
    private Output</* @Nullable */ DatasetRetentionPeriod> retentionPeriod;

    public Output</* @Nullable */ DatasetRetentionPeriod> getRetentionPeriod() {
        return this.retentionPeriod;
    }
    @OutputExport(name="tags", type=List.class, parameters={DatasetTag.class})
    private Output</* @Nullable */ List<DatasetTag>> tags;

    public Output</* @Nullable */ List<DatasetTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="triggers", type=List.class, parameters={DatasetTrigger.class})
    private Output</* @Nullable */ List<DatasetTrigger>> triggers;

    public Output</* @Nullable */ List<DatasetTrigger>> getTriggers() {
        return this.triggers;
    }
    @OutputExport(name="versioningConfiguration", type=DatasetVersioningConfiguration.class, parameters={})
    private Output</* @Nullable */ DatasetVersioningConfiguration> versioningConfiguration;

    public Output</* @Nullable */ DatasetVersioningConfiguration> getVersioningConfiguration() {
        return this.versioningConfiguration;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dataset(String name) {
        this(name, DatasetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dataset(String name, DatasetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dataset(String name, DatasetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotanalytics:Dataset", name, args == null ? DatasetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Dataset(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotanalytics:Dataset", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Dataset get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Dataset(name, id, options);
    }
}
