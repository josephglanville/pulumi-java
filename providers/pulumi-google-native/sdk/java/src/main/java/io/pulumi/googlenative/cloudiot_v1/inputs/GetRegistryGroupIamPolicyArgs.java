// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryGroupIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegistryGroupIamPolicyArgs Empty = new GetRegistryGroupIamPolicyArgs();

    @Import(name="groupId", required=true)
      private final String groupId;

    public String getGroupId() {
        return this.groupId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="registryId", required=true)
      private final String registryId;

    public String getRegistryId() {
        return this.registryId;
    }

    public GetRegistryGroupIamPolicyArgs(
        String groupId,
        String location,
        @Nullable String project,
        String registryId) {
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.registryId = Objects.requireNonNull(registryId, "expected parameter 'registryId' to be non-null");
    }

    private GetRegistryGroupIamPolicyArgs() {
        this.groupId = null;
        this.location = null;
        this.project = null;
        this.registryId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryGroupIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupId;
        private String location;
        private @Nullable String project;
        private String registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryGroupIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.registryId = defaults.registryId;
        }

        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder registryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }        public GetRegistryGroupIamPolicyArgs build() {
            return new GetRegistryGroupIamPolicyArgs(groupId, location, project, registryId);
        }
    }
}
