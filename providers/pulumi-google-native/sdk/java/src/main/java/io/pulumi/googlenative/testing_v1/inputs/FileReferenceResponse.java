// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A reference to a file, used for user inputs.
 * 
 */
public final class FileReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final FileReferenceResponse Empty = new FileReferenceResponse();

    /**
     * A path to a file in Google Cloud Storage. Example: gs://build-app-1414623860166/app%40debug-unaligned.apk These paths are expected to be url encoded (percent encoding)
     * 
     */
    @Import(name="gcsPath", required=true)
      private final String gcsPath;

    public String getGcsPath() {
        return this.gcsPath;
    }

    public FileReferenceResponse(String gcsPath) {
        this.gcsPath = Objects.requireNonNull(gcsPath, "expected parameter 'gcsPath' to be non-null");
    }

    private FileReferenceResponse() {
        this.gcsPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcsPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsPath = defaults.gcsPath;
        }

        public Builder gcsPath(String gcsPath) {
            this.gcsPath = Objects.requireNonNull(gcsPath);
            return this;
        }        public FileReferenceResponse build() {
            return new FileReferenceResponse(gcsPath);
        }
    }
}
