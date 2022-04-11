// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connector mapping property structure.
 * 
 */
public final class ConnectorMappingStructureArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorMappingStructureArgs Empty = new ConnectorMappingStructureArgs();

    /**
     * The column name of the import file.
     * 
     */
    @Import(name="columnName", required=true)
      private final Output<String> columnName;

    public Output<String> getColumnName() {
        return this.columnName;
    }

    /**
     * Custom format specifier for input parsing.
     * 
     */
    @Import(name="customFormatSpecifier")
      private final @Nullable Output<String> customFormatSpecifier;

    public Output<String> getCustomFormatSpecifier() {
        return this.customFormatSpecifier == null ? Codegen.empty() : this.customFormatSpecifier;
    }

    /**
     * Indicates if the column is encrypted.
     * 
     */
    @Import(name="isEncrypted")
      private final @Nullable Output<Boolean> isEncrypted;

    public Output<Boolean> getIsEncrypted() {
        return this.isEncrypted == null ? Codegen.empty() : this.isEncrypted;
    }

    /**
     * The property name of the mapping entity.
     * 
     */
    @Import(name="propertyName", required=true)
      private final Output<String> propertyName;

    public Output<String> getPropertyName() {
        return this.propertyName;
    }

    public ConnectorMappingStructureArgs(
        Output<String> columnName,
        @Nullable Output<String> customFormatSpecifier,
        @Nullable Output<Boolean> isEncrypted,
        Output<String> propertyName) {
        this.columnName = Objects.requireNonNull(columnName, "expected parameter 'columnName' to be non-null");
        this.customFormatSpecifier = customFormatSpecifier;
        this.isEncrypted = isEncrypted;
        this.propertyName = Objects.requireNonNull(propertyName, "expected parameter 'propertyName' to be non-null");
    }

    private ConnectorMappingStructureArgs() {
        this.columnName = Codegen.empty();
        this.customFormatSpecifier = Codegen.empty();
        this.isEncrypted = Codegen.empty();
        this.propertyName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingStructureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> columnName;
        private @Nullable Output<String> customFormatSpecifier;
        private @Nullable Output<Boolean> isEncrypted;
        private Output<String> propertyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingStructureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.customFormatSpecifier = defaults.customFormatSpecifier;
    	      this.isEncrypted = defaults.isEncrypted;
    	      this.propertyName = defaults.propertyName;
        }

        public Builder columnName(Output<String> columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }
        public Builder columnName(String columnName) {
            this.columnName = Output.of(Objects.requireNonNull(columnName));
            return this;
        }
        public Builder customFormatSpecifier(@Nullable Output<String> customFormatSpecifier) {
            this.customFormatSpecifier = customFormatSpecifier;
            return this;
        }
        public Builder customFormatSpecifier(@Nullable String customFormatSpecifier) {
            this.customFormatSpecifier = Codegen.ofNullable(customFormatSpecifier);
            return this;
        }
        public Builder isEncrypted(@Nullable Output<Boolean> isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }
        public Builder isEncrypted(@Nullable Boolean isEncrypted) {
            this.isEncrypted = Codegen.ofNullable(isEncrypted);
            return this;
        }
        public Builder propertyName(Output<String> propertyName) {
            this.propertyName = Objects.requireNonNull(propertyName);
            return this;
        }
        public Builder propertyName(String propertyName) {
            this.propertyName = Output.of(Objects.requireNonNull(propertyName));
            return this;
        }        public ConnectorMappingStructureArgs build() {
            return new ConnectorMappingStructureArgs(columnName, customFormatSpecifier, isEncrypted, propertyName);
        }
    }
}
