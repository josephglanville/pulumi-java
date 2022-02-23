// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A property containing information about the blobs to be exported for an export job. This property is required for export jobs, but must not be specified for import jobs.
 * 
 */
public final class ExportArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportArgs Empty = new ExportArgs();

    /**
     * The relative URI to the block blob that contains the list of blob paths or blob path prefixes as defined above, beginning with the container name. If the blob is in root container, the URI must begin with $root.
     * 
     */
    @InputImport(name="blobListBlobPath")
      private final @Nullable Input<String> blobListBlobPath;

    public Input<String> getBlobListBlobPath() {
        return this.blobListBlobPath == null ? Input.empty() : this.blobListBlobPath;
    }

    /**
     * A collection of blob-path strings.
     * 
     */
    @InputImport(name="blobPath")
      private final @Nullable Input<List<String>> blobPath;

    public Input<List<String>> getBlobPath() {
        return this.blobPath == null ? Input.empty() : this.blobPath;
    }

    /**
     * A collection of blob-prefix strings.
     * 
     */
    @InputImport(name="blobPathPrefix")
      private final @Nullable Input<List<String>> blobPathPrefix;

    public Input<List<String>> getBlobPathPrefix() {
        return this.blobPathPrefix == null ? Input.empty() : this.blobPathPrefix;
    }

    public ExportArgs(
        @Nullable Input<String> blobListBlobPath,
        @Nullable Input<List<String>> blobPath,
        @Nullable Input<List<String>> blobPathPrefix) {
        this.blobListBlobPath = blobListBlobPath;
        this.blobPath = blobPath;
        this.blobPathPrefix = blobPathPrefix;
    }

    private ExportArgs() {
        this.blobListBlobPath = Input.empty();
        this.blobPath = Input.empty();
        this.blobPathPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> blobListBlobPath;
        private @Nullable Input<List<String>> blobPath;
        private @Nullable Input<List<String>> blobPathPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobListBlobPath = defaults.blobListBlobPath;
    	      this.blobPath = defaults.blobPath;
    	      this.blobPathPrefix = defaults.blobPathPrefix;
        }

        public Builder setBlobListBlobPath(@Nullable Input<String> blobListBlobPath) {
            this.blobListBlobPath = blobListBlobPath;
            return this;
        }

        public Builder setBlobListBlobPath(@Nullable String blobListBlobPath) {
            this.blobListBlobPath = Input.ofNullable(blobListBlobPath);
            return this;
        }

        public Builder setBlobPath(@Nullable Input<List<String>> blobPath) {
            this.blobPath = blobPath;
            return this;
        }

        public Builder setBlobPath(@Nullable List<String> blobPath) {
            this.blobPath = Input.ofNullable(blobPath);
            return this;
        }

        public Builder setBlobPathPrefix(@Nullable Input<List<String>> blobPathPrefix) {
            this.blobPathPrefix = blobPathPrefix;
            return this;
        }

        public Builder setBlobPathPrefix(@Nullable List<String> blobPathPrefix) {
            this.blobPathPrefix = Input.ofNullable(blobPathPrefix);
            return this;
        }
        public ExportArgs build() {
            return new ExportArgs(blobListBlobPath, blobPath, blobPathPrefix);
        }
    }
}
