// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDicomStoreArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDicomStoreArgs Empty = new GetDicomStoreArgs();

    @InputImport(name="datasetId", required=true)
    private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    @InputImport(name="dicomStoreId", required=true)
    private final String dicomStoreId;

    public String getDicomStoreId() {
        return this.dicomStoreId;
    }

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetDicomStoreArgs(
        String datasetId,
        String dicomStoreId,
        String location,
        @Nullable String project) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.dicomStoreId = Objects.requireNonNull(dicomStoreId, "expected parameter 'dicomStoreId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetDicomStoreArgs() {
        this.datasetId = null;
        this.dicomStoreId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDicomStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String dicomStoreId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDicomStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.dicomStoreId = defaults.dicomStoreId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDicomStoreId(String dicomStoreId) {
            this.dicomStoreId = Objects.requireNonNull(dicomStoreId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetDicomStoreArgs build() {
            return new GetDicomStoreArgs(datasetId, dicomStoreId, location, project);
        }
    }
}