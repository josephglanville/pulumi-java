// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.metastore_v1alpha.outputs.MetadataExportResponse;
import io.pulumi.googlenative.metastore_v1alpha.outputs.RestoreResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MetadataManagementActivityResponse {
    /**
     * The latest metadata exports of the metastore service.
     * 
     */
    private final List<MetadataExportResponse> metadataExports;
    /**
     * The latest restores of the metastore service.
     * 
     */
    private final List<RestoreResponse> restores;

    @CustomType.Constructor
    private MetadataManagementActivityResponse(
        @CustomType.Parameter("metadataExports") List<MetadataExportResponse> metadataExports,
        @CustomType.Parameter("restores") List<RestoreResponse> restores) {
        this.metadataExports = metadataExports;
        this.restores = restores;
    }

    /**
     * The latest metadata exports of the metastore service.
     * 
    */
    public List<MetadataExportResponse> getMetadataExports() {
        return this.metadataExports;
    }
    /**
     * The latest restores of the metastore service.
     * 
    */
    public List<RestoreResponse> getRestores() {
        return this.restores;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataManagementActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MetadataExportResponse> metadataExports;
        private List<RestoreResponse> restores;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataManagementActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataExports = defaults.metadataExports;
    	      this.restores = defaults.restores;
        }

        public Builder metadataExports(List<MetadataExportResponse> metadataExports) {
            this.metadataExports = Objects.requireNonNull(metadataExports);
            return this;
        }
        public Builder metadataExports(MetadataExportResponse... metadataExports) {
            return metadataExports(List.of(metadataExports));
        }
        public Builder restores(List<RestoreResponse> restores) {
            this.restores = Objects.requireNonNull(restores);
            return this;
        }
        public Builder restores(RestoreResponse... restores) {
            return restores(List.of(restores));
        }        public MetadataManagementActivityResponse build() {
            return new MetadataManagementActivityResponse(metadataExports, restores);
        }
    }
}
