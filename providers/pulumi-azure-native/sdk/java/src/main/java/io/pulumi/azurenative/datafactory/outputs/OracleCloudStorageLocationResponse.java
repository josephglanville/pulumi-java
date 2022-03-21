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
public final class OracleCloudStorageLocationResponse {
    /**
     * Specify the bucketName of Oracle Cloud Storage. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object bucketName;
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
     * Expected value is 'OracleCloudStorageLocation'.
     * 
     */
    private final String type;
    /**
     * Specify the version of Oracle Cloud Storage. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object version;

    @CustomType.Constructor
    private OracleCloudStorageLocationResponse(
        @CustomType.Parameter("bucketName") @Nullable Object bucketName,
        @CustomType.Parameter("fileName") @Nullable Object fileName,
        @CustomType.Parameter("folderPath") @Nullable Object folderPath,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") @Nullable Object version) {
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = type;
        this.version = version;
    }

    /**
     * Specify the bucketName of Oracle Cloud Storage. Type: string (or Expression with resultType string)
     * 
    */
    public Optional<Object> getBucketName() {
        return Optional.ofNullable(this.bucketName);
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
     * Expected value is 'OracleCloudStorageLocation'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Specify the version of Oracle Cloud Storage. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleCloudStorageLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object bucketName;
        private @Nullable Object fileName;
        private @Nullable Object folderPath;
        private String type;
        private @Nullable Object version;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleCloudStorageLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder bucketName(@Nullable Object bucketName) {
            this.bucketName = bucketName;
            return this;
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
        }
        public Builder version(@Nullable Object version) {
            this.version = version;
            return this;
        }        public OracleCloudStorageLocationResponse build() {
            return new OracleCloudStorageLocationResponse(bucketName, fileName, folderPath, type, version);
        }
    }
}
