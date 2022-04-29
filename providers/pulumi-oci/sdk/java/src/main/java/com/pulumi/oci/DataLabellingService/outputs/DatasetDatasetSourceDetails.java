// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataLabellingService.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetDatasetSourceDetails {
    /**
     * @return The object storage bucket that contains the dataset data source
     * 
     */
    private final String bucket;
    /**
     * @return Namespace of the bucket that contains the dataset data source
     * 
     */
    private final String namespace;
    /**
     * @return A common path prefix shared by the objects that make up the dataset. Records will not be generated for objects whose name match exactly with prefix.
     * 
     */
    private final @Nullable String prefix;
    /**
     * @return Source type.  OBJECT_STORAGE allows the customer to describe where the dataset is in object storage.
     * 
     */
    private final String sourceType;

    @CustomType.Constructor
    private DatasetDatasetSourceDetails(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("sourceType") String sourceType) {
        this.bucket = bucket;
        this.namespace = namespace;
        this.prefix = prefix;
        this.sourceType = sourceType;
    }

    /**
     * @return The object storage bucket that contains the dataset data source
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Namespace of the bucket that contains the dataset data source
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return A common path prefix shared by the objects that make up the dataset. Records will not be generated for objects whose name match exactly with prefix.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return Source type.  OBJECT_STORAGE allows the customer to describe where the dataset is in object storage.
     * 
     */
    public String sourceType() {
        return this.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetDatasetSourceDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String namespace;
        private @Nullable String prefix;
        private String sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetDatasetSourceDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.namespace = defaults.namespace;
    	      this.prefix = defaults.prefix;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }        public DatasetDatasetSourceDetails build() {
            return new DatasetDatasetSourceDetails(bucket, namespace, prefix, sourceType);
        }
    }
}
