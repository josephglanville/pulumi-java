// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.evidently.ExperimentArgs;
import io.pulumi.awsnative.evidently.outputs.ExperimentMetricGoalObject;
import io.pulumi.awsnative.evidently.outputs.ExperimentOnlineAbConfigObject;
import io.pulumi.awsnative.evidently.outputs.ExperimentTag;
import io.pulumi.awsnative.evidently.outputs.ExperimentTreatmentObject;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Evidently::Experiment.
 * 
 */
@ResourceType(type="aws-native:evidently:Experiment")
public class Experiment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="metricGoals", type=List.class, parameters={ExperimentMetricGoalObject.class})
    private Output<List<ExperimentMetricGoalObject>> metricGoals;

    public Output<List<ExperimentMetricGoalObject>> getMetricGoals() {
        return this.metricGoals;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="onlineAbConfig", type=ExperimentOnlineAbConfigObject.class, parameters={})
    private Output<ExperimentOnlineAbConfigObject> onlineAbConfig;

    public Output<ExperimentOnlineAbConfigObject> getOnlineAbConfig() {
        return this.onlineAbConfig;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="randomizationSalt", type=String.class, parameters={})
    private Output</* @Nullable */ String> randomizationSalt;

    public Output</* @Nullable */ String> getRandomizationSalt() {
        return this.randomizationSalt;
    }
    @OutputExport(name="samplingRate", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> samplingRate;

    public Output</* @Nullable */ Integer> getSamplingRate() {
        return this.samplingRate;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={ExperimentTag.class})
    private Output</* @Nullable */ List<ExperimentTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<ExperimentTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="treatments", type=List.class, parameters={ExperimentTreatmentObject.class})
    private Output<List<ExperimentTreatmentObject>> treatments;

    public Output<List<ExperimentTreatmentObject>> getTreatments() {
        return this.treatments;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Experiment(String name) {
        this(name, ExperimentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Experiment(String name, ExperimentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Experiment(String name, ExperimentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Experiment", name, args == null ? ExperimentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Experiment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Experiment", name, null, makeResourceOptions(options, id));
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
    public static Experiment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Experiment(name, id, options);
    }
}
