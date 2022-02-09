// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingAvailabilityResponse;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingCompleteOperationResponse;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingErrorManagementResponse;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingFormatResponse;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingStructureResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorMappingPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectorMappingPropertiesResponse Empty = new ConnectorMappingPropertiesResponse();

    @InputImport(name="availability", required=true)
    private final ConnectorMappingAvailabilityResponse availability;

    public ConnectorMappingAvailabilityResponse getAvailability() {
        return this.availability;
    }

    @InputImport(name="completeOperation", required=true)
    private final ConnectorMappingCompleteOperationResponse completeOperation;

    public ConnectorMappingCompleteOperationResponse getCompleteOperation() {
        return this.completeOperation;
    }

    @InputImport(name="errorManagement", required=true)
    private final ConnectorMappingErrorManagementResponse errorManagement;

    public ConnectorMappingErrorManagementResponse getErrorManagement() {
        return this.errorManagement;
    }

    @InputImport(name="fileFilter")
    private final @Nullable String fileFilter;

    public Optional<String> getFileFilter() {
        return this.fileFilter == null ? Optional.empty() : Optional.ofNullable(this.fileFilter);
    }

    @InputImport(name="folderPath")
    private final @Nullable String folderPath;

    public Optional<String> getFolderPath() {
        return this.folderPath == null ? Optional.empty() : Optional.ofNullable(this.folderPath);
    }

    @InputImport(name="format", required=true)
    private final ConnectorMappingFormatResponse format;

    public ConnectorMappingFormatResponse getFormat() {
        return this.format;
    }

    @InputImport(name="hasHeader")
    private final @Nullable Boolean hasHeader;

    public Optional<Boolean> getHasHeader() {
        return this.hasHeader == null ? Optional.empty() : Optional.ofNullable(this.hasHeader);
    }

    @InputImport(name="structure", required=true)
    private final List<ConnectorMappingStructureResponse> structure;

    public List<ConnectorMappingStructureResponse> getStructure() {
        return this.structure;
    }

    public ConnectorMappingPropertiesResponse(
        ConnectorMappingAvailabilityResponse availability,
        ConnectorMappingCompleteOperationResponse completeOperation,
        ConnectorMappingErrorManagementResponse errorManagement,
        @Nullable String fileFilter,
        @Nullable String folderPath,
        ConnectorMappingFormatResponse format,
        @Nullable Boolean hasHeader,
        List<ConnectorMappingStructureResponse> structure) {
        this.availability = Objects.requireNonNull(availability, "expected parameter 'availability' to be non-null");
        this.completeOperation = Objects.requireNonNull(completeOperation, "expected parameter 'completeOperation' to be non-null");
        this.errorManagement = Objects.requireNonNull(errorManagement, "expected parameter 'errorManagement' to be non-null");
        this.fileFilter = fileFilter;
        this.folderPath = folderPath;
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.hasHeader = hasHeader;
        this.structure = Objects.requireNonNull(structure, "expected parameter 'structure' to be non-null");
    }

    private ConnectorMappingPropertiesResponse() {
        this.availability = null;
        this.completeOperation = null;
        this.errorManagement = null;
        this.fileFilter = null;
        this.folderPath = null;
        this.format = null;
        this.hasHeader = null;
        this.structure = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorMappingAvailabilityResponse availability;
        private ConnectorMappingCompleteOperationResponse completeOperation;
        private ConnectorMappingErrorManagementResponse errorManagement;
        private @Nullable String fileFilter;
        private @Nullable String folderPath;
        private ConnectorMappingFormatResponse format;
        private @Nullable Boolean hasHeader;
        private List<ConnectorMappingStructureResponse> structure;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.completeOperation = defaults.completeOperation;
    	      this.errorManagement = defaults.errorManagement;
    	      this.fileFilter = defaults.fileFilter;
    	      this.folderPath = defaults.folderPath;
    	      this.format = defaults.format;
    	      this.hasHeader = defaults.hasHeader;
    	      this.structure = defaults.structure;
        }

        public Builder setAvailability(ConnectorMappingAvailabilityResponse availability) {
            this.availability = Objects.requireNonNull(availability);
            return this;
        }

        public Builder setCompleteOperation(ConnectorMappingCompleteOperationResponse completeOperation) {
            this.completeOperation = Objects.requireNonNull(completeOperation);
            return this;
        }

        public Builder setErrorManagement(ConnectorMappingErrorManagementResponse errorManagement) {
            this.errorManagement = Objects.requireNonNull(errorManagement);
            return this;
        }

        public Builder setFileFilter(@Nullable String fileFilter) {
            this.fileFilter = fileFilter;
            return this;
        }

        public Builder setFolderPath(@Nullable String folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setFormat(ConnectorMappingFormatResponse format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setHasHeader(@Nullable Boolean hasHeader) {
            this.hasHeader = hasHeader;
            return this;
        }

        public Builder setStructure(List<ConnectorMappingStructureResponse> structure) {
            this.structure = Objects.requireNonNull(structure);
            return this;
        }

        public ConnectorMappingPropertiesResponse build() {
            return new ConnectorMappingPropertiesResponse(availability, completeOperation, errorManagement, fileFilter, folderPath, format, hasHeader, structure);
        }
    }
}
