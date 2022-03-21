// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.assuredworkloads.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadResourceSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadResourceSettingArgs Empty = new WorkloadResourceSettingArgs();

    /**
     * Resource identifier. For a project this represents project_number. If the project is already taken, the workload creation will fail.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    /**
     * Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT) Possible values: RESOURCE_TYPE_UNSPECIFIED, CONSUMER_PROJECT, ENCRYPTION_KEYS_PROJECT, KEYRING, CONSUMER_FOLDER
     * 
     */
    @Import(name="resourceType")
      private final @Nullable Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType == null ? Output.empty() : this.resourceType;
    }

    public WorkloadResourceSettingArgs(
        @Nullable Output<String> resourceId,
        @Nullable Output<String> resourceType) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
    }

    private WorkloadResourceSettingArgs() {
        this.resourceId = Output.empty();
        this.resourceType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadResourceSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceId;
        private @Nullable Output<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadResourceSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }
        public Builder resourceType(@Nullable Output<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Output.ofNullable(resourceType);
            return this;
        }        public WorkloadResourceSettingArgs build() {
            return new WorkloadResourceSettingArgs(resourceId, resourceType);
        }
    }
}
