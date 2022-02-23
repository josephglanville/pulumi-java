// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ResourcePolicyGroupPlacementPolicyArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyArgs Empty = new ResourcePolicyArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Resource policy for instances used for placement configuration.
     * Structure is documented below.
     * 
     */
    @InputImport(name="groupPlacementPolicy")
      private final @Nullable Input<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy;

    public Input<ResourcePolicyGroupPlacementPolicyArgs> getGroupPlacementPolicy() {
        return this.groupPlacementPolicy == null ? Input.empty() : this.groupPlacementPolicy;
    }

    /**
     * Resource policy for scheduling instance operations.
     * Structure is documented below.
     * 
     */
    @InputImport(name="instanceSchedulePolicy")
      private final @Nullable Input<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy;

    public Input<ResourcePolicyInstanceSchedulePolicyArgs> getInstanceSchedulePolicy() {
        return this.instanceSchedulePolicy == null ? Input.empty() : this.instanceSchedulePolicy;
    }

    /**
     * The name of the resource, provided by the client when initially creating
     * the resource. The resource name must be 1-63 characters long, and comply
     * with RFC1035. Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z`? which means the
     * first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character,
     * which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Region where resource policy resides.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Policy for creating snapshots of persistent disks.
     * Structure is documented below.
     * 
     */
    @InputImport(name="snapshotSchedulePolicy")
      private final @Nullable Input<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy;

    public Input<ResourcePolicySnapshotSchedulePolicyArgs> getSnapshotSchedulePolicy() {
        return this.snapshotSchedulePolicy == null ? Input.empty() : this.snapshotSchedulePolicy;
    }

    public ResourcePolicyArgs(
        @Nullable Input<String> description,
        @Nullable Input<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy,
        @Nullable Input<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy) {
        this.description = description;
        this.groupPlacementPolicy = groupPlacementPolicy;
        this.instanceSchedulePolicy = instanceSchedulePolicy;
        this.name = name;
        this.project = project;
        this.region = region;
        this.snapshotSchedulePolicy = snapshotSchedulePolicy;
    }

    private ResourcePolicyArgs() {
        this.description = Input.empty();
        this.groupPlacementPolicy = Input.empty();
        this.instanceSchedulePolicy = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.snapshotSchedulePolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy;
        private @Nullable Input<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.groupPlacementPolicy = defaults.groupPlacementPolicy;
    	      this.instanceSchedulePolicy = defaults.instanceSchedulePolicy;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.snapshotSchedulePolicy = defaults.snapshotSchedulePolicy;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGroupPlacementPolicy(@Nullable Input<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy) {
            this.groupPlacementPolicy = groupPlacementPolicy;
            return this;
        }

        public Builder setGroupPlacementPolicy(@Nullable ResourcePolicyGroupPlacementPolicyArgs groupPlacementPolicy) {
            this.groupPlacementPolicy = Input.ofNullable(groupPlacementPolicy);
            return this;
        }

        public Builder setInstanceSchedulePolicy(@Nullable Input<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy) {
            this.instanceSchedulePolicy = instanceSchedulePolicy;
            return this;
        }

        public Builder setInstanceSchedulePolicy(@Nullable ResourcePolicyInstanceSchedulePolicyArgs instanceSchedulePolicy) {
            this.instanceSchedulePolicy = Input.ofNullable(instanceSchedulePolicy);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setSnapshotSchedulePolicy(@Nullable Input<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy) {
            this.snapshotSchedulePolicy = snapshotSchedulePolicy;
            return this;
        }

        public Builder setSnapshotSchedulePolicy(@Nullable ResourcePolicySnapshotSchedulePolicyArgs snapshotSchedulePolicy) {
            this.snapshotSchedulePolicy = Input.ofNullable(snapshotSchedulePolicy);
            return this;
        }
        public ResourcePolicyArgs build() {
            return new ResourcePolicyArgs(description, groupPlacementPolicy, instanceSchedulePolicy, name, project, region, snapshotSchedulePolicy);
        }
    }
}
