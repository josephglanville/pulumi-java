// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrcWriteSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final OrcWriteSettingsResponse Empty = new OrcWriteSettingsResponse();

    @InputImport(name="fileNamePrefix")
    private final @Nullable Object fileNamePrefix;

    public Optional<Object> getFileNamePrefix() {
        return this.fileNamePrefix == null ? Optional.empty() : Optional.ofNullable(this.fileNamePrefix);
    }

    @InputImport(name="maxRowsPerFile")
    private final @Nullable Object maxRowsPerFile;

    public Optional<Object> getMaxRowsPerFile() {
        return this.maxRowsPerFile == null ? Optional.empty() : Optional.ofNullable(this.maxRowsPerFile);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public OrcWriteSettingsResponse(
        @Nullable Object fileNamePrefix,
        @Nullable Object maxRowsPerFile,
        String type) {
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OrcWriteSettingsResponse() {
        this.fileNamePrefix = null;
        this.maxRowsPerFile = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrcWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fileNamePrefix;
        private @Nullable Object maxRowsPerFile;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrcWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.type = defaults.type;
        }

        public Builder setFileNamePrefix(@Nullable Object fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }

        public Builder setMaxRowsPerFile(@Nullable Object maxRowsPerFile) {
            this.maxRowsPerFile = maxRowsPerFile;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public OrcWriteSettingsResponse build() {
            return new OrcWriteSettingsResponse(fileNamePrefix, maxRowsPerFile, type);
        }
    }
}
