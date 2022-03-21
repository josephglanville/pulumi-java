// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBucketArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBucketArgs Empty = new GetBucketArgs();

    /**
     * The name for the bucket.
     * 
     */
    @Import(name="bucketName", required=true)
      private final String bucketName;

    public String getBucketName() {
        return this.bucketName;
    }

    public GetBucketArgs(String bucketName) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
    }

    private GetBucketArgs() {
        this.bucketName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }        public GetBucketArgs build() {
            return new GetBucketArgs(bucketName);
        }
    }
}
