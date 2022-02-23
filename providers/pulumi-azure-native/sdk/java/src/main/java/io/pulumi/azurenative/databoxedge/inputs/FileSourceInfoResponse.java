// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * File source details.
 * 
 */
public final class FileSourceInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final FileSourceInfoResponse Empty = new FileSourceInfoResponse();

    /**
     * File share ID.
     * 
     */
    @InputImport(name="shareId", required=true)
      private final String shareId;

    public String getShareId() {
        return this.shareId;
    }

    public FileSourceInfoResponse(String shareId) {
        this.shareId = Objects.requireNonNull(shareId, "expected parameter 'shareId' to be non-null");
    }

    private FileSourceInfoResponse() {
        this.shareId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String shareId;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSourceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareId = defaults.shareId;
        }

        public Builder setShareId(String shareId) {
            this.shareId = Objects.requireNonNull(shareId);
            return this;
        }
        public FileSourceInfoResponse build() {
            return new FileSourceInfoResponse(shareId);
        }
    }
}
