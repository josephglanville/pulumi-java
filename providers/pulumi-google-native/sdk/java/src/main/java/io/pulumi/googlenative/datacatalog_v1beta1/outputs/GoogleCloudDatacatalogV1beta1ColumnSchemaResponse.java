// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1beta1ColumnSchemaResponse {
    private final String column;
    private final String description;
    private final String mode;
    private final List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> subcolumns;
    private final String type;

    @OutputCustomType.Constructor({"column","description","mode","subcolumns","type"})
    private GoogleCloudDatacatalogV1beta1ColumnSchemaResponse(
        String column,
        String description,
        String mode,
        List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> subcolumns,
        String type) {
        this.column = Objects.requireNonNull(column);
        this.description = Objects.requireNonNull(description);
        this.mode = Objects.requireNonNull(mode);
        this.subcolumns = Objects.requireNonNull(subcolumns);
        this.type = Objects.requireNonNull(type);
    }

    public String getColumn() {
        return this.column;
    }
    public String getDescription() {
        return this.description;
    }
    public String getMode() {
        return this.mode;
    }
    public List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> getSubcolumns() {
        return this.subcolumns;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1ColumnSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String column;
        private String description;
        private String mode;
        private List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> subcolumns;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1ColumnSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.description = defaults.description;
    	      this.mode = defaults.mode;
    	      this.subcolumns = defaults.subcolumns;
    	      this.type = defaults.type;
        }

        public Builder setColumn(String column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setSubcolumns(List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> subcolumns) {
            this.subcolumns = Objects.requireNonNull(subcolumns);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GoogleCloudDatacatalogV1beta1ColumnSchemaResponse build() {
            return new GoogleCloudDatacatalogV1beta1ColumnSchemaResponse(column, description, mode, subcolumns, type);
        }
    }
}