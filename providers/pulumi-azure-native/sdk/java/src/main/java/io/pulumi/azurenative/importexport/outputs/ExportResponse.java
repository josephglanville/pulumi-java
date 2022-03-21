// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExportResponse {
    /**
     * The relative URI to the block blob that contains the list of blob paths or blob path prefixes as defined above, beginning with the container name. If the blob is in root container, the URI must begin with $root.
     * 
     */
    private final @Nullable String blobListBlobPath;
    /**
     * A collection of blob-path strings.
     * 
     */
    private final @Nullable List<String> blobPath;
    /**
     * A collection of blob-prefix strings.
     * 
     */
    private final @Nullable List<String> blobPathPrefix;

    @CustomType.Constructor
    private ExportResponse(
        @CustomType.Parameter("blobListBlobPath") @Nullable String blobListBlobPath,
        @CustomType.Parameter("blobPath") @Nullable List<String> blobPath,
        @CustomType.Parameter("blobPathPrefix") @Nullable List<String> blobPathPrefix) {
        this.blobListBlobPath = blobListBlobPath;
        this.blobPath = blobPath;
        this.blobPathPrefix = blobPathPrefix;
    }

    /**
     * The relative URI to the block blob that contains the list of blob paths or blob path prefixes as defined above, beginning with the container name. If the blob is in root container, the URI must begin with $root.
     * 
    */
    public Optional<String> getBlobListBlobPath() {
        return Optional.ofNullable(this.blobListBlobPath);
    }
    /**
     * A collection of blob-path strings.
     * 
    */
    public List<String> getBlobPath() {
        return this.blobPath == null ? List.of() : this.blobPath;
    }
    /**
     * A collection of blob-prefix strings.
     * 
    */
    public List<String> getBlobPathPrefix() {
        return this.blobPathPrefix == null ? List.of() : this.blobPathPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobListBlobPath;
        private @Nullable List<String> blobPath;
        private @Nullable List<String> blobPathPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobListBlobPath = defaults.blobListBlobPath;
    	      this.blobPath = defaults.blobPath;
    	      this.blobPathPrefix = defaults.blobPathPrefix;
        }

        public Builder blobListBlobPath(@Nullable String blobListBlobPath) {
            this.blobListBlobPath = blobListBlobPath;
            return this;
        }
        public Builder blobPath(@Nullable List<String> blobPath) {
            this.blobPath = blobPath;
            return this;
        }
        public Builder blobPath(String... blobPath) {
            return blobPath(List.of(blobPath));
        }
        public Builder blobPathPrefix(@Nullable List<String> blobPathPrefix) {
            this.blobPathPrefix = blobPathPrefix;
            return this;
        }
        public Builder blobPathPrefix(String... blobPathPrefix) {
            return blobPathPrefix(List.of(blobPathPrefix));
        }        public ExportResponse build() {
            return new ExportResponse(blobListBlobPath, blobPath, blobPathPrefix);
        }
    }
}
