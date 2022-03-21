// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorMappingCompleteOperationResponse {
    /**
     * The type of completion operation.
     * 
     */
    private final @Nullable String completionOperationType;
    /**
     * The destination folder where files will be moved to once the import is done.
     * 
     */
    private final @Nullable String destinationFolder;

    @CustomType.Constructor
    private ConnectorMappingCompleteOperationResponse(
        @CustomType.Parameter("completionOperationType") @Nullable String completionOperationType,
        @CustomType.Parameter("destinationFolder") @Nullable String destinationFolder) {
        this.completionOperationType = completionOperationType;
        this.destinationFolder = destinationFolder;
    }

    /**
     * The type of completion operation.
     * 
    */
    public Optional<String> getCompletionOperationType() {
        return Optional.ofNullable(this.completionOperationType);
    }
    /**
     * The destination folder where files will be moved to once the import is done.
     * 
    */
    public Optional<String> getDestinationFolder() {
        return Optional.ofNullable(this.destinationFolder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingCompleteOperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String completionOperationType;
        private @Nullable String destinationFolder;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingCompleteOperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionOperationType = defaults.completionOperationType;
    	      this.destinationFolder = defaults.destinationFolder;
        }

        public Builder completionOperationType(@Nullable String completionOperationType) {
            this.completionOperationType = completionOperationType;
            return this;
        }
        public Builder destinationFolder(@Nullable String destinationFolder) {
            this.destinationFolder = destinationFolder;
            return this;
        }        public ConnectorMappingCompleteOperationResponse build() {
            return new ConnectorMappingCompleteOperationResponse(completionOperationType, destinationFolder);
        }
    }
}
