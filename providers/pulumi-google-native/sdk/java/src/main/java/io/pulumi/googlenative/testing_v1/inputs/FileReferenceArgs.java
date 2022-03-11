// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A reference to a file, used for user inputs.
 * 
 */
public final class FileReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileReferenceArgs Empty = new FileReferenceArgs();

    /**
     * A path to a file in Google Cloud Storage. Example: gs://build-app-1414623860166/app%40debug-unaligned.apk These paths are expected to be url encoded (percent encoding)
     * 
     */
    @InputImport(name="gcsPath")
      private final @Nullable Output<String> gcsPath;

    public Output<String> getGcsPath() {
        return this.gcsPath == null ? Output.empty() : this.gcsPath;
    }

    public FileReferenceArgs(@Nullable Output<String> gcsPath) {
        this.gcsPath = gcsPath;
    }

    private FileReferenceArgs() {
        this.gcsPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> gcsPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsPath = defaults.gcsPath;
        }

        public Builder gcsPath(@Nullable Output<String> gcsPath) {
            this.gcsPath = gcsPath;
            return this;
        }

        public Builder gcsPath(@Nullable String gcsPath) {
            this.gcsPath = Output.ofNullable(gcsPath);
            return this;
        }
        public FileReferenceArgs build() {
            return new FileReferenceArgs(gcsPath);
        }
    }
}
