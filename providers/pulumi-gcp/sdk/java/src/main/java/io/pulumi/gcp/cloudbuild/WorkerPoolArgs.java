// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudbuild.inputs.WorkerPoolNetworkConfigArgs;
import io.pulumi.gcp.cloudbuild.inputs.WorkerPoolWorkerConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkerPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerPoolArgs Empty = new WorkerPoolArgs();

    /**
     * User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size
     * limitations.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable Input<Map<String,String>> annotations;

    public Input<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The location for the resource
     * 
     */
    @InputImport(name="location", required=true)
      private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * User-defined name of the `WorkerPool`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Network configuration for the `WorkerPool`. Structure is documented below.
     * 
     */
    @InputImport(name="networkConfig")
      private final @Nullable Input<WorkerPoolNetworkConfigArgs> networkConfig;

    public Input<WorkerPoolNetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Configuration to be used for a creating workers in the `WorkerPool`. Structure is documented below.
     * 
     */
    @InputImport(name="workerConfig")
      private final @Nullable Input<WorkerPoolWorkerConfigArgs> workerConfig;

    public Input<WorkerPoolWorkerConfigArgs> getWorkerConfig() {
        return this.workerConfig == null ? Input.empty() : this.workerConfig;
    }

    public WorkerPoolArgs(
        @Nullable Input<Map<String,String>> annotations,
        @Nullable Input<String> displayName,
        Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<WorkerPoolNetworkConfigArgs> networkConfig,
        @Nullable Input<String> project,
        @Nullable Input<WorkerPoolWorkerConfigArgs> workerConfig) {
        this.annotations = annotations;
        this.displayName = displayName;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.networkConfig = networkConfig;
        this.project = project;
        this.workerConfig = workerConfig;
    }

    private WorkerPoolArgs() {
        this.annotations = Input.empty();
        this.displayName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.networkConfig = Input.empty();
        this.project = Input.empty();
        this.workerConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> annotations;
        private @Nullable Input<String> displayName;
        private Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<WorkerPoolNetworkConfigArgs> networkConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<WorkerPoolWorkerConfigArgs> workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkConfig = defaults.networkConfig;
    	      this.project = defaults.project;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder setAnnotations(@Nullable Input<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable Map<String,String> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
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

        public Builder setNetworkConfig(@Nullable Input<WorkerPoolNetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable WorkerPoolNetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
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

        public Builder setWorkerConfig(@Nullable Input<WorkerPoolWorkerConfigArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }

        public Builder setWorkerConfig(@Nullable WorkerPoolWorkerConfigArgs workerConfig) {
            this.workerConfig = Input.ofNullable(workerConfig);
            return this;
        }
        public WorkerPoolArgs build() {
            return new WorkerPoolArgs(annotations, displayName, location, name, networkConfig, project, workerConfig);
        }
    }
}
