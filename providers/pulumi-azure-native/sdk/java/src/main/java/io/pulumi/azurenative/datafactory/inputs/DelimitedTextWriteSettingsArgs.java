// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DelimitedTextWriteSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DelimitedTextWriteSettingsArgs Empty = new DelimitedTextWriteSettingsArgs();

    @InputImport(name="fileExtension", required=true)
    private final Input<Object> fileExtension;

    public Input<Object> getFileExtension() {
        return this.fileExtension;
    }

    @InputImport(name="fileNamePrefix")
    private final @Nullable Input<Object> fileNamePrefix;

    public Input<Object> getFileNamePrefix() {
        return this.fileNamePrefix == null ? Input.empty() : this.fileNamePrefix;
    }

    @InputImport(name="maxRowsPerFile")
    private final @Nullable Input<Object> maxRowsPerFile;

    public Input<Object> getMaxRowsPerFile() {
        return this.maxRowsPerFile == null ? Input.empty() : this.maxRowsPerFile;
    }

    @InputImport(name="quoteAllText")
    private final @Nullable Input<Object> quoteAllText;

    public Input<Object> getQuoteAllText() {
        return this.quoteAllText == null ? Input.empty() : this.quoteAllText;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public DelimitedTextWriteSettingsArgs(
        Input<Object> fileExtension,
        @Nullable Input<Object> fileNamePrefix,
        @Nullable Input<Object> maxRowsPerFile,
        @Nullable Input<Object> quoteAllText,
        Input<String> type) {
        this.fileExtension = Objects.requireNonNull(fileExtension, "expected parameter 'fileExtension' to be non-null");
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.quoteAllText = quoteAllText;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DelimitedTextWriteSettingsArgs() {
        this.fileExtension = Input.empty();
        this.fileNamePrefix = Input.empty();
        this.maxRowsPerFile = Input.empty();
        this.quoteAllText = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelimitedTextWriteSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Object> fileExtension;
        private @Nullable Input<Object> fileNamePrefix;
        private @Nullable Input<Object> maxRowsPerFile;
        private @Nullable Input<Object> quoteAllText;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DelimitedTextWriteSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileExtension = defaults.fileExtension;
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.quoteAllText = defaults.quoteAllText;
    	      this.type = defaults.type;
        }

        public Builder setFileExtension(Input<Object> fileExtension) {
            this.fileExtension = Objects.requireNonNull(fileExtension);
            return this;
        }

        public Builder setFileExtension(Object fileExtension) {
            this.fileExtension = Input.of(Objects.requireNonNull(fileExtension));
            return this;
        }

        public Builder setFileNamePrefix(@Nullable Input<Object> fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }

        public Builder setFileNamePrefix(@Nullable Object fileNamePrefix) {
            this.fileNamePrefix = Input.ofNullable(fileNamePrefix);
            return this;
        }

        public Builder setMaxRowsPerFile(@Nullable Input<Object> maxRowsPerFile) {
            this.maxRowsPerFile = maxRowsPerFile;
            return this;
        }

        public Builder setMaxRowsPerFile(@Nullable Object maxRowsPerFile) {
            this.maxRowsPerFile = Input.ofNullable(maxRowsPerFile);
            return this;
        }

        public Builder setQuoteAllText(@Nullable Input<Object> quoteAllText) {
            this.quoteAllText = quoteAllText;
            return this;
        }

        public Builder setQuoteAllText(@Nullable Object quoteAllText) {
            this.quoteAllText = Input.ofNullable(quoteAllText);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public DelimitedTextWriteSettingsArgs build() {
            return new DelimitedTextWriteSettingsArgs(fileExtension, fileNamePrefix, maxRowsPerFile, quoteAllText, type);
        }
    }
}
