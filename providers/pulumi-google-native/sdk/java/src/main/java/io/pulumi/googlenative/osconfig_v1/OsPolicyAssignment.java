// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.osconfig_v1.OsPolicyAssignmentArgs;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyAssignmentInstanceFilterResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyAssignmentRolloutResponse;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create an OS policy assignment. This method also creates the first revision of the OS policy assignment. This method returns a long running operation (LRO) that contains the rollout details. The rollout can be cancelled by cancelling the LRO. For more information, see [Method: projects.locations.osPolicyAssignments.operations.cancel](https://cloud.google.com/compute/docs/osconfig/rest/v1/projects.locations.osPolicyAssignments.operations/cancel).
 * 
 */
@ResourceType(type="google-native:osconfig/v1:OsPolicyAssignment")
public class OsPolicyAssignment extends io.pulumi.resources.CustomResource {
    /**
     * Indicates that this revision has been successfully rolled out in this zone and new VMs will be assigned OS policies from this revision. For a given OS policy assignment, there is only one revision with a value of `true` for this field.
     * 
     */
    @Export(name="baseline", type=Boolean.class, parameters={})
    private Output<Boolean> baseline;

    /**
     * @return Indicates that this revision has been successfully rolled out in this zone and new VMs will be assigned OS policies from this revision. For a given OS policy assignment, there is only one revision with a value of `true` for this field.
     * 
     */
    public Output<Boolean> getBaseline() {
        return this.baseline;
    }
    /**
     * Indicates that this revision deletes the OS policy assignment.
     * 
     */
    @Export(name="deleted", type=Boolean.class, parameters={})
    private Output<Boolean> deleted;

    /**
     * @return Indicates that this revision deletes the OS policy assignment.
     * 
     */
    public Output<Boolean> getDeleted() {
        return this.deleted;
    }
    /**
     * OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The etag for this OS policy assignment. If this is provided on update, it must match the server's etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The etag for this OS policy assignment. If this is provided on update, it must match the server's etag.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Filter to select VMs.
     * 
     */
    @Export(name="instanceFilter", type=OSPolicyAssignmentInstanceFilterResponse.class, parameters={})
    private Output<OSPolicyAssignmentInstanceFilterResponse> instanceFilter;

    /**
     * @return Filter to select VMs.
     * 
     */
    public Output<OSPolicyAssignmentInstanceFilterResponse> getInstanceFilter() {
        return this.instanceFilter;
    }
    /**
     * Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of OS policies to be applied to the VMs.
     * 
     */
    @Export(name="osPolicies", type=List.class, parameters={OSPolicyResponse.class})
    private Output<List<OSPolicyResponse>> osPolicies;

    /**
     * @return List of OS policies to be applied to the VMs.
     * 
     */
    public Output<List<OSPolicyResponse>> getOsPolicies() {
        return this.osPolicies;
    }
    /**
     * Indicates that reconciliation is in progress for the revision. This value is `true` when the `rollout_state` is one of: * IN_PROGRESS * CANCELLING
     * 
     */
    @Export(name="reconciling", type=Boolean.class, parameters={})
    private Output<Boolean> reconciling;

    /**
     * @return Indicates that reconciliation is in progress for the revision. This value is `true` when the `rollout_state` is one of: * IN_PROGRESS * CANCELLING
     * 
     */
    public Output<Boolean> getReconciling() {
        return this.reconciling;
    }
    /**
     * The timestamp that the revision was created.
     * 
     */
    @Export(name="revisionCreateTime", type=String.class, parameters={})
    private Output<String> revisionCreateTime;

    /**
     * @return The timestamp that the revision was created.
     * 
     */
    public Output<String> getRevisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * The assignment revision ID A new revision is committed whenever a rollout is triggered for a OS policy assignment
     * 
     */
    @Export(name="revisionId", type=String.class, parameters={})
    private Output<String> revisionId;

    /**
     * @return The assignment revision ID A new revision is committed whenever a rollout is triggered for a OS policy assignment
     * 
     */
    public Output<String> getRevisionId() {
        return this.revisionId;
    }
    /**
     * Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
     * 
     */
    @Export(name="rollout", type=OSPolicyAssignmentRolloutResponse.class, parameters={})
    private Output<OSPolicyAssignmentRolloutResponse> rollout;

    /**
     * @return Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
     * 
     */
    public Output<OSPolicyAssignmentRolloutResponse> getRollout() {
        return this.rollout;
    }
    /**
     * OS policy assignment rollout state
     * 
     */
    @Export(name="rolloutState", type=String.class, parameters={})
    private Output<String> rolloutState;

    /**
     * @return OS policy assignment rollout state
     * 
     */
    public Output<String> getRolloutState() {
        return this.rolloutState;
    }
    /**
     * Server generated unique id for the OS policy assignment resource.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Server generated unique id for the OS policy assignment resource.
     * 
     */
    public Output<String> getUid() {
        return this.uid;
    }

    public interface BuilderApplicator {
        public void apply(OsPolicyAssignmentArgs.Builder a);
    }
    private static io.pulumi.googlenative.osconfig_v1.OsPolicyAssignmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.osconfig_v1.OsPolicyAssignmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public OsPolicyAssignment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OsPolicyAssignment(String name) {
        this(name, OsPolicyAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OsPolicyAssignment(String name, OsPolicyAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OsPolicyAssignment(String name, OsPolicyAssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:osconfig/v1:OsPolicyAssignment", name, args == null ? OsPolicyAssignmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private OsPolicyAssignment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:osconfig/v1:OsPolicyAssignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static OsPolicyAssignment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OsPolicyAssignment(name, id, options);
    }
}
