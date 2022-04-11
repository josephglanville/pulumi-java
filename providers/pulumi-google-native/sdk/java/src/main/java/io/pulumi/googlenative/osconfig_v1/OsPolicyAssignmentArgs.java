// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyAssignmentInstanceFilterArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyAssignmentRolloutArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentArgs Empty = new OsPolicyAssignmentArgs();

    /**
     * OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The etag for this OS policy assignment. If this is provided on update, it must match the server's etag.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * Filter to select VMs.
     * 
     */
    @Import(name="instanceFilter", required=true)
      private final Output<OSPolicyAssignmentInstanceFilterArgs> instanceFilter;

    public Output<OSPolicyAssignmentInstanceFilterArgs> getInstanceFilter() {
        return this.instanceFilter;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Resource name. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}` This field is ignored when you create an OS policy assignment.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * List of OS policies to be applied to the VMs.
     * 
     */
    @Import(name="osPolicies", required=true)
      private final Output<List<OSPolicyArgs>> osPolicies;

    public Output<List<OSPolicyArgs>> getOsPolicies() {
        return this.osPolicies;
    }

    @Import(name="osPolicyAssignmentId", required=true)
      private final Output<String> osPolicyAssignmentId;

    public Output<String> getOsPolicyAssignmentId() {
        return this.osPolicyAssignmentId;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
     * 
     */
    @Import(name="rollout", required=true)
      private final Output<OSPolicyAssignmentRolloutArgs> rollout;

    public Output<OSPolicyAssignmentRolloutArgs> getRollout() {
        return this.rollout;
    }

    public OsPolicyAssignmentArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> etag,
        Output<OSPolicyAssignmentInstanceFilterArgs> instanceFilter,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        Output<List<OSPolicyArgs>> osPolicies,
        Output<String> osPolicyAssignmentId,
        @Nullable Output<String> project,
        Output<OSPolicyAssignmentRolloutArgs> rollout) {
        this.description = description;
        this.etag = etag;
        this.instanceFilter = Objects.requireNonNull(instanceFilter, "expected parameter 'instanceFilter' to be non-null");
        this.location = location;
        this.name = name;
        this.osPolicies = Objects.requireNonNull(osPolicies, "expected parameter 'osPolicies' to be non-null");
        this.osPolicyAssignmentId = Objects.requireNonNull(osPolicyAssignmentId, "expected parameter 'osPolicyAssignmentId' to be non-null");
        this.project = project;
        this.rollout = Objects.requireNonNull(rollout, "expected parameter 'rollout' to be non-null");
    }

    private OsPolicyAssignmentArgs() {
        this.description = Codegen.empty();
        this.etag = Codegen.empty();
        this.instanceFilter = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.osPolicies = Codegen.empty();
        this.osPolicyAssignmentId = Codegen.empty();
        this.project = Codegen.empty();
        this.rollout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> etag;
        private Output<OSPolicyAssignmentInstanceFilterArgs> instanceFilter;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private Output<List<OSPolicyArgs>> osPolicies;
        private Output<String> osPolicyAssignmentId;
        private @Nullable Output<String> project;
        private Output<OSPolicyAssignmentRolloutArgs> rollout;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.instanceFilter = defaults.instanceFilter;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.osPolicies = defaults.osPolicies;
    	      this.osPolicyAssignmentId = defaults.osPolicyAssignmentId;
    	      this.project = defaults.project;
    	      this.rollout = defaults.rollout;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder instanceFilter(Output<OSPolicyAssignmentInstanceFilterArgs> instanceFilter) {
            this.instanceFilter = Objects.requireNonNull(instanceFilter);
            return this;
        }
        public Builder instanceFilter(OSPolicyAssignmentInstanceFilterArgs instanceFilter) {
            this.instanceFilter = Output.of(Objects.requireNonNull(instanceFilter));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder osPolicies(Output<List<OSPolicyArgs>> osPolicies) {
            this.osPolicies = Objects.requireNonNull(osPolicies);
            return this;
        }
        public Builder osPolicies(List<OSPolicyArgs> osPolicies) {
            this.osPolicies = Output.of(Objects.requireNonNull(osPolicies));
            return this;
        }
        public Builder osPolicies(OSPolicyArgs... osPolicies) {
            return osPolicies(List.of(osPolicies));
        }
        public Builder osPolicyAssignmentId(Output<String> osPolicyAssignmentId) {
            this.osPolicyAssignmentId = Objects.requireNonNull(osPolicyAssignmentId);
            return this;
        }
        public Builder osPolicyAssignmentId(String osPolicyAssignmentId) {
            this.osPolicyAssignmentId = Output.of(Objects.requireNonNull(osPolicyAssignmentId));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder rollout(Output<OSPolicyAssignmentRolloutArgs> rollout) {
            this.rollout = Objects.requireNonNull(rollout);
            return this;
        }
        public Builder rollout(OSPolicyAssignmentRolloutArgs rollout) {
            this.rollout = Output.of(Objects.requireNonNull(rollout));
            return this;
        }        public OsPolicyAssignmentArgs build() {
            return new OsPolicyAssignmentArgs(description, etag, instanceFilter, location, name, osPolicies, osPolicyAssignmentId, project, rollout);
        }
    }
}
