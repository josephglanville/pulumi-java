// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobTransferSpecGcsDataSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecGcsDataSinkArgs Empty = new TransferJobTransferSpecGcsDataSinkArgs();

    /**
     * S3 Bucket name.
     * 
     */
    @InputImport(name="bucketName", required=true)
      private final Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName;
    }

    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public TransferJobTransferSpecGcsDataSinkArgs(
        Input<String> bucketName,
        @Nullable Input<String> path) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.path = path;
    }

    private TransferJobTransferSpecGcsDataSinkArgs() {
        this.bucketName = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecGcsDataSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketName;
        private @Nullable Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecGcsDataSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.path = defaults.path;
        }

        public Builder setBucketName(Input<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Input.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }
        public TransferJobTransferSpecGcsDataSinkArgs build() {
            return new TransferJobTransferSpecGcsDataSinkArgs(bucketName, path);
        }
    }
}
