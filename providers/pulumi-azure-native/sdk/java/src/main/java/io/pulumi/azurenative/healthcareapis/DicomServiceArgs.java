// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DicomServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DicomServiceArgs Empty = new DicomServiceArgs();

    @InputImport(name="dicomServiceName")
    private final @Nullable Input<String> dicomServiceName;

    public Input<String> getDicomServiceName() {
        return this.dicomServiceName == null ? Input.empty() : this.dicomServiceName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public DicomServiceArgs(
        @Nullable Input<String> dicomServiceName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        Input<String> workspaceName) {
        this.dicomServiceName = dicomServiceName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private DicomServiceArgs() {
        this.dicomServiceName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dicomServiceName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dicomServiceName = defaults.dicomServiceName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setDicomServiceName(@Nullable Input<String> dicomServiceName) {
            this.dicomServiceName = dicomServiceName;
            return this;
        }

        public Builder setDicomServiceName(@Nullable String dicomServiceName) {
            this.dicomServiceName = Input.ofNullable(dicomServiceName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public DicomServiceArgs build() {
            return new DicomServiceArgs(dicomServiceName, location, resourceGroupName, tags, workspaceName);
        }
    }
}
