// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBucketObjectContentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBucketObjectContentArgs Empty = new GetBucketObjectContentArgs();

    /**
     * The name of the containing bucket.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    /**
     * (Computed) [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object content.
     * 
     */
    @InputImport(name="content")
      private final @Nullable String content;

    public Optional<String> getContent() {
        return this.content == null ? Optional.empty() : Optional.ofNullable(this.content);
    }

    /**
     * The name of the object.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetBucketObjectContentArgs(
        String bucket,
        @Nullable String content,
        String name) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.content = content;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetBucketObjectContentArgs() {
        this.bucket = null;
        this.content = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String content;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketObjectContentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.content = defaults.content;
    	      this.name = defaults.name;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetBucketObjectContentArgs build() {
            return new GetBucketObjectContentArgs(bucket, content, name);
        }
    }
}
