// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.ml_v1.TrialArgs;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1_Trial_ParameterResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__MeasurementResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Adds a user provided trial to a study.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:ml/v1:Trial")
public class Trial extends io.pulumi.resources.CustomResource {
    /**
     * The identifier of the client that originally requested this trial.
     * 
     */
    @OutputExport(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return The identifier of the client that originally requested this trial.
     * 
     */
    public Output<String> getClientId() {
        return this.clientId;
    }
    /**
     * Time at which the trial's status changed to COMPLETED.
     * 
     */
    @OutputExport(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return Time at which the trial's status changed to COMPLETED.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * The final measurement containing the objective value.
     * 
     */
    @OutputExport(name="finalMeasurement", type=GoogleCloudMlV1__MeasurementResponse.class, parameters={})
    private Output<GoogleCloudMlV1__MeasurementResponse> finalMeasurement;

    /**
     * @return The final measurement containing the objective value.
     * 
     */
    public Output<GoogleCloudMlV1__MeasurementResponse> getFinalMeasurement() {
        return this.finalMeasurement;
    }
    /**
     * A human readable string describing why the trial is infeasible. This should only be set if trial_infeasible is true.
     * 
     */
    @OutputExport(name="infeasibleReason", type=String.class, parameters={})
    private Output<String> infeasibleReason;

    /**
     * @return A human readable string describing why the trial is infeasible. This should only be set if trial_infeasible is true.
     * 
     */
    public Output<String> getInfeasibleReason() {
        return this.infeasibleReason;
    }
    /**
     * A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations.
     * 
     */
    @OutputExport(name="measurements", type=List.class, parameters={GoogleCloudMlV1__MeasurementResponse.class})
    private Output<List<GoogleCloudMlV1__MeasurementResponse>> measurements;

    /**
     * @return A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations.
     * 
     */
    public Output<List<GoogleCloudMlV1__MeasurementResponse>> getMeasurements() {
        return this.measurements;
    }
    /**
     * Name of the trial assigned by the service.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the trial assigned by the service.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parameters of the trial.
     * 
     */
    @OutputExport(name="parameters", type=List.class, parameters={GoogleCloudMlV1_Trial_ParameterResponse.class})
    private Output<List<GoogleCloudMlV1_Trial_ParameterResponse>> parameters;

    /**
     * @return The parameters of the trial.
     * 
     */
    public Output<List<GoogleCloudMlV1_Trial_ParameterResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * Time at which the trial was started.
     * 
     */
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return Time at which the trial was started.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * The detailed state of a trial.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The detailed state of a trial.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * If true, the parameters in this trial are not attempted again.
     * 
     */
    @OutputExport(name="trialInfeasible", type=Boolean.class, parameters={})
    private Output<Boolean> trialInfeasible;

    /**
     * @return If true, the parameters in this trial are not attempted again.
     * 
     */
    public Output<Boolean> getTrialInfeasible() {
        return this.trialInfeasible;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Trial(String name) {
        this(name, TrialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Trial(String name, TrialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Trial(String name, TrialArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Trial", name, args == null ? TrialArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Trial(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Trial", name, null, makeResourceOptions(options, id));
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
    public static Trial get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Trial(name, id, options);
    }
}
