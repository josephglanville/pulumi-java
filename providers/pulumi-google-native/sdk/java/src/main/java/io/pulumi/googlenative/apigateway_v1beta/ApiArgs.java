// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiArgs Empty = new ApiArgs();

    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * Optional. Display name.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Optional. Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-infrastructure/docs/glossary#managed). If not specified, a new Service will automatically be created in the same project as this API.
     * 
     */
    @Import(name="managedService")
      private final @Nullable Output<String> managedService;

    public Output<String> getManagedService() {
        return this.managedService == null ? Output.empty() : this.managedService;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public ApiArgs(
        Output<String> apiId,
        @Nullable Output<String> displayName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> managedService,
        @Nullable Output<String> project) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.displayName = displayName;
        this.labels = labels;
        this.location = location;
        this.managedService = managedService;
        this.project = project;
    }

    private ApiArgs() {
        this.apiId = Output.empty();
        this.displayName = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.managedService = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> managedService;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.managedService = defaults.managedService;
    	      this.project = defaults.project;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }
        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder managedService(@Nullable Output<String> managedService) {
            this.managedService = managedService;
            return this;
        }
        public Builder managedService(@Nullable String managedService) {
            this.managedService = Output.ofNullable(managedService);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public ApiArgs build() {
            return new ApiArgs(apiId, displayName, labels, location, managedService, project);
        }
    }
}
