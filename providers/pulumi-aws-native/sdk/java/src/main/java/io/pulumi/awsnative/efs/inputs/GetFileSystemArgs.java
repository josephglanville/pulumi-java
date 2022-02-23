// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFileSystemArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFileSystemArgs Empty = new GetFileSystemArgs();

    @InputImport(name="fileSystemId", required=true)
      private final String fileSystemId;

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public GetFileSystemArgs(String fileSystemId) {
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
    }

    private GetFileSystemArgs() {
        this.fileSystemId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fileSystemId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFileSystemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemId = defaults.fileSystemId;
        }

        public Builder setFileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }
        public GetFileSystemArgs build() {
            return new GetFileSystemArgs(fileSystemId);
        }
    }
}
