// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StorageSource describes the location of the source in an archive file in Google Cloud Storage.
 * 
 */
public final class StorageSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageSourceArgs Empty = new StorageSourceArgs();

    /**
     * Google Cloud Storage bucket containing source (see [Bucket Name Requirements] (https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * 
     */
    @InputImport(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Output.empty() : this.bucket;
    }

    /**
     * Google Cloud Storage generation for the object.
     * 
     */
    @InputImport(name="generation")
      private final @Nullable Output<String> generation;

    public Output<String> getGeneration() {
        return this.generation == null ? Output.empty() : this.generation;
    }

    /**
     * Google Cloud Storage object containing source.
     * 
     */
    @InputImport(name="object")
      private final @Nullable Output<String> object;

    public Output<String> getObject() {
        return this.object == null ? Output.empty() : this.object;
    }

    public StorageSourceArgs(
        @Nullable Output<String> bucket,
        @Nullable Output<String> generation,
        @Nullable Output<String> object) {
        this.bucket = bucket;
        this.generation = generation;
        this.object = object;
    }

    private StorageSourceArgs() {
        this.bucket = Output.empty();
        this.generation = Output.empty();
        this.object = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<String> generation;
        private @Nullable Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = Output.ofNullable(bucket);
            return this;
        }

        public Builder generation(@Nullable Output<String> generation) {
            this.generation = generation;
            return this;
        }

        public Builder generation(@Nullable String generation) {
            this.generation = Output.ofNullable(generation);
            return this;
        }

        public Builder object(@Nullable Output<String> object) {
            this.object = object;
            return this;
        }

        public Builder object(@Nullable String object) {
            this.object = Output.ofNullable(object);
            return this;
        }
        public StorageSourceArgs build() {
            return new StorageSourceArgs(bucket, generation, object);
        }
    }
}
