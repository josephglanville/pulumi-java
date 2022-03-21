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
public final class HdfsLocationResponse {
    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileName;
    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object folderPath;
    /**
     * Type of dataset storage location.
     * Expected value is 'HdfsLocation'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private HdfsLocationResponse(
        @CustomType.Parameter("fileName") @Nullable Object fileName,
        @CustomType.Parameter("folderPath") @Nullable Object folderPath,
        @CustomType.Parameter("type") String type) {
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = type;
    }

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getFileName() {
        return Optional.ofNullable(this.fileName);
    }
    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
    */
    public Optional<Object> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    /**
     * Type of dataset storage location.
     * Expected value is 'HdfsLocation'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HdfsLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fileName;
        private @Nullable Object folderPath;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HdfsLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
        }

        public Builder fileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public HdfsLocationResponse build() {
            return new HdfsLocationResponse(fileName, folderPath, type);
        }
    }
}
