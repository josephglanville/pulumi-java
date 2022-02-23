// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1alpha1.CutoverJobArgs;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.ComputeEngineTargetDetailsResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.StatusResponse;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Initiates a Cutover of a specific migrating VM. The returned LRO is completed when the cutover job resource is created and the job is initiated.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1alpha1:CutoverJob")
public class CutoverJob extends io.pulumi.resources.CustomResource {
    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    @OutputExport(name="computeEngineTargetDetails", type=ComputeEngineTargetDetailsResponse.class, parameters={})
    private Output<ComputeEngineTargetDetailsResponse> computeEngineTargetDetails;

    /**
     * @return Details of the target VM in Compute Engine.
     * 
     */
    public Output<ComputeEngineTargetDetailsResponse> getComputeEngineTargetDetails() {
        return this.computeEngineTargetDetails;
    }
    /**
     * The time the cutover job was created (as an API call, not when it was actually created in the target).
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the cutover job was created (as an API call, not when it was actually created in the target).
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Provides details for the errors that led to the Cutover Job's state.
     * 
     */
    @OutputExport(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return Provides details for the errors that led to the Cutover Job's state.
     * 
     */
    public Output<StatusResponse> getError() {
        return this.error;
    }
    /**
     * The name of the cutover job.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the cutover job.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current progress in percentage of the cutover job.
     * 
     */
    @OutputExport(name="progress", type=Integer.class, parameters={})
    private Output<Integer> progress;

    /**
     * @return The current progress in percentage of the cutover job.
     * 
     */
    public Output<Integer> getProgress() {
        return this.progress;
    }
    /**
     * The current progress in percentage of the cutover job.
     * 
     */
    @OutputExport(name="progressPercent", type=Integer.class, parameters={})
    private Output<Integer> progressPercent;

    /**
     * @return The current progress in percentage of the cutover job.
     * 
     */
    public Output<Integer> getProgressPercent() {
        return this.progressPercent;
    }
    /**
     * State of the cutover job.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the cutover job.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * A message providing possible extra details about the current state.
     * 
     */
    @OutputExport(name="stateMessage", type=String.class, parameters={})
    private Output<String> stateMessage;

    /**
     * @return A message providing possible extra details about the current state.
     * 
     */
    public Output<String> getStateMessage() {
        return this.stateMessage;
    }
    /**
     * The time the state was last updated.
     * 
     */
    @OutputExport(name="stateTime", type=String.class, parameters={})
    private Output<String> stateTime;

    /**
     * @return The time the state was last updated.
     * 
     */
    public Output<String> getStateTime() {
        return this.stateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CutoverJob(String name) {
        this(name, CutoverJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CutoverJob(String name, CutoverJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CutoverJob(String name, CutoverJobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:CutoverJob", name, args == null ? CutoverJobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CutoverJob(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:CutoverJob", name, null, makeResourceOptions(options, id));
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
    public static CutoverJob get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CutoverJob(name, id, options);
    }
}
