// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metadata for a File connector used by the job.
 * 
 */
public final class FileIODetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileIODetailsArgs Empty = new FileIODetailsArgs();

    /**
     * File Pattern used to access files by the connector.
     * 
     */
    @Import(name="filePattern")
      private final @Nullable Output<String> filePattern;

    public Output<String> getFilePattern() {
        return this.filePattern == null ? Codegen.empty() : this.filePattern;
    }

    public FileIODetailsArgs(@Nullable Output<String> filePattern) {
        this.filePattern = filePattern;
    }

    private FileIODetailsArgs() {
        this.filePattern = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileIODetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> filePattern;

        public Builder() {
    	      // Empty
        }

        public Builder(FileIODetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePattern = defaults.filePattern;
        }

        public Builder filePattern(@Nullable Output<String> filePattern) {
            this.filePattern = filePattern;
            return this;
        }
        public Builder filePattern(@Nullable String filePattern) {
            this.filePattern = Codegen.ofNullable(filePattern);
            return this;
        }        public FileIODetailsArgs build() {
            return new FileIODetailsArgs(filePattern);
        }
    }
}
