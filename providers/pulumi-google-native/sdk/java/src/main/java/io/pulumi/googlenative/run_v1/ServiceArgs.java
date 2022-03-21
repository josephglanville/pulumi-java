// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1.inputs.ObjectMetaArgs;
import io.pulumi.googlenative.run_v1.inputs.ServiceSpecArgs;
import io.pulumi.googlenative.run_v1.inputs.ServiceStatusArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * The API version for this call such as "serving.knative.dev/v1".
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    @Import(name="dryRun")
      private final @Nullable Output<String> dryRun;

    public Output<String> getDryRun() {
        return this.dryRun == null ? Output.empty() : this.dryRun;
    }

    /**
     * The kind of resource, in this case "Service".
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Metadata associated with this Service, including name, namespace, labels, and annotations. Cloud Run (fully managed) uses the following annotation keys to configure features on a Service: * `run.googleapis.com/ingress` sets the ingress settings for the Service. See [the ingress settings documentation](/run/docs/securing/ingress) for details on configuring ingress settings. * `run.googleapis.com/ingress-status` is output-only and contains the currently active ingress settings for the Service. `run.googleapis.com/ingress-status` may differ from `run.googleapis.com/ingress` while the system is processing a change to `run.googleapis.com/ingress` or if the system failed to process a change to `run.googleapis.com/ingress`. When the system has processed all changes successfully `run.googleapis.com/ingress-status` and `run.googleapis.com/ingress` are equal.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Spec holds the desired state of the Service (from the client).
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<ServiceSpecArgs> spec;

    public Output<ServiceSpecArgs> getSpec() {
        return this.spec == null ? Output.empty() : this.spec;
    }

    /**
     * Status communicates the observed state of the Service (from the controller).
     * 
     */
    @Import(name="status")
      private final @Nullable Output<ServiceStatusArgs> status;

    public Output<ServiceStatusArgs> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public ServiceArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> dryRun,
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<String> project,
        @Nullable Output<ServiceSpecArgs> spec,
        @Nullable Output<ServiceStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.dryRun = dryRun;
        this.kind = kind;
        this.location = location;
        this.metadata = metadata;
        this.project = project;
        this.spec = spec;
        this.status = status;
    }

    private ServiceArgs() {
        this.apiVersion = Output.empty();
        this.dryRun = Output.empty();
        this.kind = Output.empty();
        this.location = Output.empty();
        this.metadata = Output.empty();
        this.project = Output.empty();
        this.spec = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> dryRun;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<String> project;
        private @Nullable Output<ServiceSpecArgs> spec;
        private @Nullable Output<ServiceStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.dryRun = defaults.dryRun;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.project = defaults.project;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }
        public Builder dryRun(@Nullable Output<String> dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Builder dryRun(@Nullable String dryRun) {
            this.dryRun = Output.ofNullable(dryRun);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
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
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder spec(@Nullable Output<ServiceSpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable ServiceSpecArgs spec) {
            this.spec = Output.ofNullable(spec);
            return this;
        }
        public Builder status(@Nullable Output<ServiceStatusArgs> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable ServiceStatusArgs status) {
            this.status = Output.ofNullable(status);
            return this;
        }        public ServiceArgs build() {
            return new ServiceArgs(apiVersion, dryRun, kind, location, metadata, project, spec, status);
        }
    }
}
