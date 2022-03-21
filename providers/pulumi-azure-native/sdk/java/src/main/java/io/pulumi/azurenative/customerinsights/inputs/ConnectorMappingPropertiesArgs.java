// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingAvailabilityArgs;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingCompleteOperationArgs;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingErrorManagementArgs;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingFormatArgs;
import io.pulumi.azurenative.customerinsights.inputs.ConnectorMappingStructureArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The connector mapping properties.
 * 
 */
public final class ConnectorMappingPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorMappingPropertiesArgs Empty = new ConnectorMappingPropertiesArgs();

    /**
     * The availability of mapping property.
     * 
     */
    @Import(name="availability", required=true)
      private final Output<ConnectorMappingAvailabilityArgs> availability;

    public Output<ConnectorMappingAvailabilityArgs> getAvailability() {
        return this.availability;
    }

    /**
     * The operation after import is done.
     * 
     */
    @Import(name="completeOperation", required=true)
      private final Output<ConnectorMappingCompleteOperationArgs> completeOperation;

    public Output<ConnectorMappingCompleteOperationArgs> getCompleteOperation() {
        return this.completeOperation;
    }

    /**
     * The error management setting for the mapping.
     * 
     */
    @Import(name="errorManagement", required=true)
      private final Output<ConnectorMappingErrorManagementArgs> errorManagement;

    public Output<ConnectorMappingErrorManagementArgs> getErrorManagement() {
        return this.errorManagement;
    }

    /**
     * The file filter for the mapping.
     * 
     */
    @Import(name="fileFilter")
      private final @Nullable Output<String> fileFilter;

    public Output<String> getFileFilter() {
        return this.fileFilter == null ? Output.empty() : this.fileFilter;
    }

    /**
     * The folder path for the mapping.
     * 
     */
    @Import(name="folderPath")
      private final @Nullable Output<String> folderPath;

    public Output<String> getFolderPath() {
        return this.folderPath == null ? Output.empty() : this.folderPath;
    }

    /**
     * The format of mapping property.
     * 
     */
    @Import(name="format", required=true)
      private final Output<ConnectorMappingFormatArgs> format;

    public Output<ConnectorMappingFormatArgs> getFormat() {
        return this.format;
    }

    /**
     * If the file contains a header or not.
     * 
     */
    @Import(name="hasHeader")
      private final @Nullable Output<Boolean> hasHeader;

    public Output<Boolean> getHasHeader() {
        return this.hasHeader == null ? Output.empty() : this.hasHeader;
    }

    /**
     * Ingestion mapping information at property level.
     * 
     */
    @Import(name="structure", required=true)
      private final Output<List<ConnectorMappingStructureArgs>> structure;

    public Output<List<ConnectorMappingStructureArgs>> getStructure() {
        return this.structure;
    }

    public ConnectorMappingPropertiesArgs(
        Output<ConnectorMappingAvailabilityArgs> availability,
        Output<ConnectorMappingCompleteOperationArgs> completeOperation,
        Output<ConnectorMappingErrorManagementArgs> errorManagement,
        @Nullable Output<String> fileFilter,
        @Nullable Output<String> folderPath,
        Output<ConnectorMappingFormatArgs> format,
        @Nullable Output<Boolean> hasHeader,
        Output<List<ConnectorMappingStructureArgs>> structure) {
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
        this.availability = Output.empty();
        this.completeOperation = Output.empty();
        this.errorManagement = Output.empty();
        this.fileFilter = Output.empty();
        this.folderPath = Output.empty();
        this.format = Output.empty();
        this.hasHeader = Output.empty();
        this.structure = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ConnectorMappingAvailabilityArgs> availability;
        private Output<ConnectorMappingCompleteOperationArgs> completeOperation;
        private Output<ConnectorMappingErrorManagementArgs> errorManagement;
        private @Nullable Output<String> fileFilter;
        private @Nullable Output<String> folderPath;
        private Output<ConnectorMappingFormatArgs> format;
        private @Nullable Output<Boolean> hasHeader;
        private Output<List<ConnectorMappingStructureArgs>> structure;

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

        public Builder availability(Output<ConnectorMappingAvailabilityArgs> availability) {
            this.availability = Objects.requireNonNull(availability);
            return this;
        }
        public Builder availability(ConnectorMappingAvailabilityArgs availability) {
            this.availability = Output.of(Objects.requireNonNull(availability));
            return this;
        }
        public Builder completeOperation(Output<ConnectorMappingCompleteOperationArgs> completeOperation) {
            this.completeOperation = Objects.requireNonNull(completeOperation);
            return this;
        }
        public Builder completeOperation(ConnectorMappingCompleteOperationArgs completeOperation) {
            this.completeOperation = Output.of(Objects.requireNonNull(completeOperation));
            return this;
        }
        public Builder errorManagement(Output<ConnectorMappingErrorManagementArgs> errorManagement) {
            this.errorManagement = Objects.requireNonNull(errorManagement);
            return this;
        }
        public Builder errorManagement(ConnectorMappingErrorManagementArgs errorManagement) {
            this.errorManagement = Output.of(Objects.requireNonNull(errorManagement));
            return this;
        }
        public Builder fileFilter(@Nullable Output<String> fileFilter) {
            this.fileFilter = fileFilter;
            return this;
        }
        public Builder fileFilter(@Nullable String fileFilter) {
            this.fileFilter = Output.ofNullable(fileFilter);
            return this;
        }
        public Builder folderPath(@Nullable Output<String> folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public Builder folderPath(@Nullable String folderPath) {
            this.folderPath = Output.ofNullable(folderPath);
            return this;
        }
        public Builder format(Output<ConnectorMappingFormatArgs> format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder format(ConnectorMappingFormatArgs format) {
            this.format = Output.of(Objects.requireNonNull(format));
            return this;
        }
        public Builder hasHeader(@Nullable Output<Boolean> hasHeader) {
            this.hasHeader = hasHeader;
            return this;
        }
        public Builder hasHeader(@Nullable Boolean hasHeader) {
            this.hasHeader = Output.ofNullable(hasHeader);
            return this;
        }
        public Builder structure(Output<List<ConnectorMappingStructureArgs>> structure) {
            this.structure = Objects.requireNonNull(structure);
            return this;
        }
        public Builder structure(List<ConnectorMappingStructureArgs> structure) {
            this.structure = Output.of(Objects.requireNonNull(structure));
            return this;
        }
        public Builder structure(ConnectorMappingStructureArgs... structure) {
            return structure(List.of(structure));
        }        public ConnectorMappingPropertiesArgs build() {
            return new ConnectorMappingPropertiesArgs(availability, completeOperation, errorManagement, fileFilter, folderPath, format, hasHeader, structure);
        }
    }
}
