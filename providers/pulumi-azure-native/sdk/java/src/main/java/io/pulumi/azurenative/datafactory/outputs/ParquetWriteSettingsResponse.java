// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ParquetWriteSettingsResponse {
    /**
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileNamePrefix;
    /**
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxRowsPerFile;
    /**
     * The write setting type.
     * Expected value is 'ParquetWriteSettings'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ParquetWriteSettingsResponse(
        @CustomType.Parameter("fileNamePrefix") @Nullable Object fileNamePrefix,
        @CustomType.Parameter("maxRowsPerFile") @Nullable Object maxRowsPerFile,
        @CustomType.Parameter("type") String type) {
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.type = type;
    }

    /**
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getFileNamePrefix() {
        return Optional.ofNullable(this.fileNamePrefix);
    }
    /**
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxRowsPerFile() {
        return Optional.ofNullable(this.maxRowsPerFile);
    }
    /**
     * The write setting type.
     * Expected value is 'ParquetWriteSettings'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParquetWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fileNamePrefix;
        private @Nullable Object maxRowsPerFile;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParquetWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.type = defaults.type;
        }

        public Builder fileNamePrefix(@Nullable Object fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }
        public Builder maxRowsPerFile(@Nullable Object maxRowsPerFile) {
            this.maxRowsPerFile = maxRowsPerFile;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ParquetWriteSettingsResponse build() {
            return new ParquetWriteSettingsResponse(fileNamePrefix, maxRowsPerFile, type);
        }
    }
}
