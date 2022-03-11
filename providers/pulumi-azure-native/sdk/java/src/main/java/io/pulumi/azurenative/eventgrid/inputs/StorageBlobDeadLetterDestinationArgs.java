// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the storage blob based dead letter destination.
 * 
 */
public final class StorageBlobDeadLetterDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageBlobDeadLetterDestinationArgs Empty = new StorageBlobDeadLetterDestinationArgs();

    /**
     * The name of the Storage blob container that is the destination of the deadletter events
     * 
     */
    @InputImport(name="blobContainerName")
      private final @Nullable Output<String> blobContainerName;

    public Output<String> getBlobContainerName() {
        return this.blobContainerName == null ? Output.empty() : this.blobContainerName;
    }

    /**
     * Type of the endpoint for the dead letter destination
     * Expected value is 'StorageBlob'.
     * 
     */
    @InputImport(name="endpointType", required=true)
      private final Output<String> endpointType;

    public Output<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * The Azure Resource ID of the storage account that is the destination of the deadletter events
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    public StorageBlobDeadLetterDestinationArgs(
        @Nullable Output<String> blobContainerName,
        Output<String> endpointType,
        @Nullable Output<String> resourceId) {
        this.blobContainerName = blobContainerName;
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.resourceId = resourceId;
    }

    private StorageBlobDeadLetterDestinationArgs() {
        this.blobContainerName = Output.empty();
        this.endpointType = Output.empty();
        this.resourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageBlobDeadLetterDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> blobContainerName;
        private Output<String> endpointType;
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageBlobDeadLetterDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobContainerName = defaults.blobContainerName;
    	      this.endpointType = defaults.endpointType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder blobContainerName(@Nullable Output<String> blobContainerName) {
            this.blobContainerName = blobContainerName;
            return this;
        }

        public Builder blobContainerName(@Nullable String blobContainerName) {
            this.blobContainerName = Output.ofNullable(blobContainerName);
            return this;
        }

        public Builder endpointType(Output<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder endpointType(String endpointType) {
            this.endpointType = Output.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }
        public StorageBlobDeadLetterDestinationArgs build() {
            return new StorageBlobDeadLetterDestinationArgs(blobContainerName, endpointType, resourceId);
        }
    }
}
