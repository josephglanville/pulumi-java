// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetadataImportArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMetadataImportArgs Empty = new GetMetadataImportArgs();

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="metadataImportId", required=true)
    private final String metadataImportId;

    public String getMetadataImportId() {
        return this.metadataImportId;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="serviceId", required=true)
    private final String serviceId;

    public String getServiceId() {
        return this.serviceId;
    }

    public GetMetadataImportArgs(
        String location,
        String metadataImportId,
        @Nullable String project,
        String serviceId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.metadataImportId = Objects.requireNonNull(metadataImportId, "expected parameter 'metadataImportId' to be non-null");
        this.project = project;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private GetMetadataImportArgs() {
        this.location = null;
        this.metadataImportId = null;
        this.project = null;
        this.serviceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String metadataImportId;
        private @Nullable String project;
        private String serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetadataImportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.metadataImportId = defaults.metadataImportId;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMetadataImportId(String metadataImportId) {
            this.metadataImportId = Objects.requireNonNull(metadataImportId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public GetMetadataImportArgs build() {
            return new GetMetadataImportArgs(location, metadataImportId, project, serviceId);
        }
    }
}