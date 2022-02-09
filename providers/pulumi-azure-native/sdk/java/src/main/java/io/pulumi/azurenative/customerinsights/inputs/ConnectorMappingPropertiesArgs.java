// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingAvailabilityArgs;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingCompleteOperationArgs;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingErrorManagementArgs;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingFormatArgs;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingStructureArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorMappingPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorMappingPropertiesArgs Empty = new ConnectorMappingPropertiesArgs();

    @InputImport(name="availability", required=true)
    private final Input<ConnectorMappingAvailabilityArgs> availability;

    public Input<ConnectorMappingAvailabilityArgs> getAvailability() {
        return this.availability;
    }

    @InputImport(name="completeOperation", required=true)
    private final Input<ConnectorMappingCompleteOperationArgs> completeOperation;

    public Input<ConnectorMappingCompleteOperationArgs> getCompleteOperation() {
        return this.completeOperation;
    }

    @InputImport(name="errorManagement", required=true)
    private final Input<ConnectorMappingErrorManagementArgs> errorManagement;

    public Input<ConnectorMappingErrorManagementArgs> getErrorManagement() {
        return this.errorManagement;
    }

    @InputImport(name="fileFilter")
    private final @Nullable Input<String> fileFilter;

    public Input<String> getFileFilter() {
        return this.fileFilter == null ? Input.empty() : this.fileFilter;
    }

    @InputImport(name="folderPath")
    private final @Nullable Input<String> folderPath;

    public Input<String> getFolderPath() {
        return this.folderPath == null ? Input.empty() : this.folderPath;
    }

    @InputImport(name="format", required=true)
    private final Input<ConnectorMappingFormatArgs> format;

    public Input<ConnectorMappingFormatArgs> getFormat() {
        return this.format;
    }

    @InputImport(name="hasHeader")
    private final @Nullable Input<Boolean> hasHeader;

    public Input<Boolean> getHasHeader() {
        return this.hasHeader == null ? Input.empty() : this.hasHeader;
    }

    @InputImport(name="structure", required=true)
    private final Input<List<ConnectorMappingStructureArgs>> structure;

    public Input<List<ConnectorMappingStructureArgs>> getStructure() {
        return this.structure;
    }

    public ConnectorMappingPropertiesArgs(
        Input<ConnectorMappingAvailabilityArgs> availability,
        Input<ConnectorMappingCompleteOperationArgs> completeOperation,
        Input<ConnectorMappingErrorManagementArgs> errorManagement,
        @Nullable Input<String> fileFilter,
        @Nullable Input<String> folderPath,
        Input<ConnectorMappingFormatArgs> format,
        @Nullable Input<Boolean> hasHeader,
        Input<List<ConnectorMappingStructureArgs>> structure) {
        this.availability = Objects.requireNonNull(availability, "expected parameter 'availability' to be non-null");
        this.completeOperation = Objects.requireNonNull(completeOperation, "expected parameter 'completeOperation' to be non-null");
        this.errorManagement = Objects.requireNonNull(errorManagement, "expected parameter 'errorManagement' to be non-null");
        this.fileFilter = fileFilter;
        this.folderPath = folderPath;
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.hasHeader = hasHeader;
        this.structure = Objects.requireNonNull(structure, "expected parameter 'structure' to be non-null");
    }

    private ConnectorMappingPropertiesArgs() {
        this.availability = Input.empty();
        this.completeOperation = Input.empty();
        this.errorManagement = Input.empty();
        this.fileFilter = Input.empty();
        this.folderPath = Input.empty();
        this.format = Input.empty();
        this.hasHeader = Input.empty();
        this.structure = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ConnectorMappingAvailabilityArgs> availability;
        private Input<ConnectorMappingCompleteOperationArgs> completeOperation;
        private Input<ConnectorMappingErrorManagementArgs> errorManagement;
        private @Nullable Input<String> fileFilter;
        private @Nullable Input<String> folderPath;
        private Input<ConnectorMappingFormatArgs> format;
        private @Nullable Input<Boolean> hasHeader;
        private Input<List<ConnectorMappingStructureArgs>> structure;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingPropertiesArgs defaults) {
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

        public Builder setAvailability(Input<ConnectorMappingAvailabilityArgs> availability) {
            this.availability = Objects.requireNonNull(availability);
            return this;
        }

        public Builder setAvailability(ConnectorMappingAvailabilityArgs availability) {
            this.availability = Input.of(Objects.requireNonNull(availability));
            return this;
        }

        public Builder setCompleteOperation(Input<ConnectorMappingCompleteOperationArgs> completeOperation) {
            this.completeOperation = Objects.requireNonNull(completeOperation);
            return this;
        }

        public Builder setCompleteOperation(ConnectorMappingCompleteOperationArgs completeOperation) {
            this.completeOperation = Input.of(Objects.requireNonNull(completeOperation));
            return this;
        }

        public Builder setErrorManagement(Input<ConnectorMappingErrorManagementArgs> errorManagement) {
            this.errorManagement = Objects.requireNonNull(errorManagement);
            return this;
        }

        public Builder setErrorManagement(ConnectorMappingErrorManagementArgs errorManagement) {
            this.errorManagement = Input.of(Objects.requireNonNull(errorManagement));
            return this;
        }

        public Builder setFileFilter(@Nullable Input<String> fileFilter) {
            this.fileFilter = fileFilter;
            return this;
        }

        public Builder setFileFilter(@Nullable String fileFilter) {
            this.fileFilter = Input.ofNullable(fileFilter);
            return this;
        }

        public Builder setFolderPath(@Nullable Input<String> folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setFolderPath(@Nullable String folderPath) {
            this.folderPath = Input.ofNullable(folderPath);
            return this;
        }

        public Builder setFormat(Input<ConnectorMappingFormatArgs> format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setFormat(ConnectorMappingFormatArgs format) {
            this.format = Input.of(Objects.requireNonNull(format));
            return this;
        }

        public Builder setHasHeader(@Nullable Input<Boolean> hasHeader) {
            this.hasHeader = hasHeader;
            return this;
        }

        public Builder setHasHeader(@Nullable Boolean hasHeader) {
            this.hasHeader = Input.ofNullable(hasHeader);
            return this;
        }

        public Builder setStructure(Input<List<ConnectorMappingStructureArgs>> structure) {
            this.structure = Objects.requireNonNull(structure);
            return this;
        }

        public Builder setStructure(List<ConnectorMappingStructureArgs> structure) {
            this.structure = Input.of(Objects.requireNonNull(structure));
            return this;
        }

        public ConnectorMappingPropertiesArgs build() {
            return new ConnectorMappingPropertiesArgs(availability, completeOperation, errorManagement, fileFilter, folderPath, format, hasHeader, structure);
        }
    }
}
