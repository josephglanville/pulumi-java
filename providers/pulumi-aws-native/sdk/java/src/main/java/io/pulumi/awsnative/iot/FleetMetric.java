// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.FleetMetricArgs;
import io.pulumi.awsnative.iot.outputs.FleetMetricAggregationType;
import io.pulumi.awsnative.iot.outputs.FleetMetricTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An aggregated metric of certain devices in your fleet
 * 
 */
@ResourceType(type="aws-native:iot:FleetMetric")
public class FleetMetric extends io.pulumi.resources.CustomResource {
    /**
     * The aggregation field to perform aggregation and metric emission
     * 
     */
    @OutputExport(name="aggregationField", type=String.class, parameters={})
    private Output</* @Nullable */ String> aggregationField;

    /**
     * @return The aggregation field to perform aggregation and metric emission
     * 
     */
    public Output</* @Nullable */ String> getAggregationField() {
        return this.aggregationField;
    }
    @OutputExport(name="aggregationType", type=FleetMetricAggregationType.class, parameters={})
    private Output</* @Nullable */ FleetMetricAggregationType> aggregationType;

    public Output</* @Nullable */ FleetMetricAggregationType> getAggregationType() {
        return this.aggregationType;
    }
    /**
     * The creation date of a fleet metric
     * 
     */
    @OutputExport(name="creationDate", type=Double.class, parameters={})
    private Output<Double> creationDate;

    /**
     * @return The creation date of a fleet metric
     * 
     */
    public Output<Double> getCreationDate() {
        return this.creationDate;
    }
    /**
     * The description of a fleet metric
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of a fleet metric
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The index name of a fleet metric
     * 
     */
    @OutputExport(name="indexName", type=String.class, parameters={})
    private Output</* @Nullable */ String> indexName;

    /**
     * @return The index name of a fleet metric
     * 
     */
    public Output</* @Nullable */ String> getIndexName() {
        return this.indexName;
    }
    /**
     * The last modified date of a fleet metric
     * 
     */
    @OutputExport(name="lastModifiedDate", type=Double.class, parameters={})
    private Output<Double> lastModifiedDate;

    /**
     * @return The last modified date of a fleet metric
     * 
     */
    public Output<Double> getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * The Amazon Resource Number (ARN) of a fleet metric metric
     * 
     */
    @OutputExport(name="metricArn", type=String.class, parameters={})
    private Output<String> metricArn;

    /**
     * @return The Amazon Resource Number (ARN) of a fleet metric metric
     * 
     */
    public Output<String> getMetricArn() {
        return this.metricArn;
    }
    /**
     * The name of the fleet metric
     * 
     */
    @OutputExport(name="metricName", type=String.class, parameters={})
    private Output<String> metricName;

    /**
     * @return The name of the fleet metric
     * 
     */
    public Output<String> getMetricName() {
        return this.metricName;
    }
    /**
     * The period of metric emission in seconds
     * 
     */
    @OutputExport(name="period", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> period;

    /**
     * @return The period of metric emission in seconds
     * 
     */
    public Output</* @Nullable */ Integer> getPeriod() {
        return this.period;
    }
    /**
     * The Fleet Indexing query used by a fleet metric
     * 
     */
    @OutputExport(name="queryString", type=String.class, parameters={})
    private Output</* @Nullable */ String> queryString;

    /**
     * @return The Fleet Indexing query used by a fleet metric
     * 
     */
    public Output</* @Nullable */ String> getQueryString() {
        return this.queryString;
    }
    /**
     * The version of a Fleet Indexing query used by a fleet metric
     * 
     */
    @OutputExport(name="queryVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> queryVersion;

    /**
     * @return The version of a Fleet Indexing query used by a fleet metric
     * 
     */
    public Output</* @Nullable */ String> getQueryVersion() {
        return this.queryVersion;
    }
    /**
     * An array of key-value pairs to apply to this resource
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={FleetMetricTag.class})
    private Output</* @Nullable */ List<FleetMetricTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource
     * 
     */
    public Output</* @Nullable */ List<FleetMetricTag>> getTags() {
        return this.tags;
    }
    /**
     * The unit of data points emitted by a fleet metric
     * 
     */
    @OutputExport(name="unit", type=String.class, parameters={})
    private Output</* @Nullable */ String> unit;

    /**
     * @return The unit of data points emitted by a fleet metric
     * 
     */
    public Output</* @Nullable */ String> getUnit() {
        return this.unit;
    }
    /**
     * The version of a fleet metric
     * 
     */
    @OutputExport(name="version", type=Double.class, parameters={})
    private Output<Double> version;

    /**
     * @return The version of a fleet metric
     * 
     */
    public Output<Double> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FleetMetric(String name) {
        this(name, FleetMetricArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FleetMetric(String name, FleetMetricArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FleetMetric(String name, FleetMetricArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:FleetMetric", name, args == null ? FleetMetricArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FleetMetric(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:FleetMetric", name, null, makeResourceOptions(options, id));
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
    public static FleetMetric get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FleetMetric(name, id, options);
    }
}
