// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataFlowStagingInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataFlowStagingInfoResponse Empty = new DataFlowStagingInfoResponse();

    @InputImport(name="folderPath")
    private final @Nullable Object folderPath;

    public Optional<Object> getFolderPath() {
        return this.folderPath == null ? Optional.empty() : Optional.ofNullable(this.folderPath);
    }

    @InputImport(name="linkedService")
    private final @Nullable LinkedServiceReferenceResponse linkedService;

    public Optional<LinkedServiceReferenceResponse> getLinkedService() {
        return this.linkedService == null ? Optional.empty() : Optional.ofNullable(this.linkedService);
    }

    public DataFlowStagingInfoResponse(
        @Nullable Object folderPath,
        @Nullable LinkedServiceReferenceResponse linkedService) {
        this.folderPath = folderPath;
        this.linkedService = linkedService;
    }

    private DataFlowStagingInfoResponse() {
        this.folderPath = null;
        this.linkedService = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFlowStagingInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object folderPath;
        private @Nullable LinkedServiceReferenceResponse linkedService;

        public Builder() {
    	      // Empty
        }

        public Builder(DataFlowStagingInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderPath = defaults.folderPath;
    	      this.linkedService = defaults.linkedService;
        }

        public Builder setFolderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setLinkedService(@Nullable LinkedServiceReferenceResponse linkedService) {
            this.linkedService = linkedService;
            return this;
        }

        public DataFlowStagingInfoResponse build() {
            return new DataFlowStagingInfoResponse(folderPath, linkedService);
        }
    }
}
