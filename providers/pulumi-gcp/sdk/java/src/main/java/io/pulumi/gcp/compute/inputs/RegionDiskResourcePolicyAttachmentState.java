// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionDiskResourcePolicyAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final RegionDiskResourcePolicyAttachmentState Empty = new RegionDiskResourcePolicyAttachmentState();

    /**
     * The name of the regional disk in which the resource policies are attached to.
     * 
     */
    @Import(name="disk")
      private final @Nullable Output<String> disk;

    public Output<String> getDisk() {
        return this.disk == null ? Codegen.empty() : this.disk;
    }

    /**
     * The resource policy to be attached to the disk for scheduling snapshot
     * creation. Do not specify the self link.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * A reference to the region where the disk resides.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    public RegionDiskResourcePolicyAttachmentState(
        @Nullable Output<String> disk,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> region) {
        this.disk = disk;
        this.name = name;
        this.project = project;
        this.region = region;
    }

    private RegionDiskResourcePolicyAttachmentState() {
        this.disk = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionDiskResourcePolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> disk;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionDiskResourcePolicyAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder disk(@Nullable Output<String> disk) {
            this.disk = disk;
            return this;
        }
        public Builder disk(@Nullable String disk) {
            this.disk = Codegen.ofNullable(disk);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }        public RegionDiskResourcePolicyAttachmentState build() {
            return new RegionDiskResourcePolicyAttachmentState(disk, name, project, region);
        }
    }
}
