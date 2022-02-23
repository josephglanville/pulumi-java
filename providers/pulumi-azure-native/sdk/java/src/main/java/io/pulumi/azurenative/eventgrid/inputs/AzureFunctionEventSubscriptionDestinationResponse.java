// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the azure function destination for an event subscription.
 * 
 */
public final class AzureFunctionEventSubscriptionDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFunctionEventSubscriptionDestinationResponse Empty = new AzureFunctionEventSubscriptionDestinationResponse();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'AzureFunction'.
     * 
     */
    @InputImport(name="endpointType", required=true)
      private final String endpointType;

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * Maximum number of events per batch.
     * 
     */
    @InputImport(name="maxEventsPerBatch")
      private final @Nullable Integer maxEventsPerBatch;

    public Optional<Integer> getMaxEventsPerBatch() {
        return this.maxEventsPerBatch == null ? Optional.empty() : Optional.ofNullable(this.maxEventsPerBatch);
    }

    /**
     * Preferred batch size in Kilobytes.
     * 
     */
    @InputImport(name="preferredBatchSizeInKilobytes")
      private final @Nullable Integer preferredBatchSizeInKilobytes;

    public Optional<Integer> getPreferredBatchSizeInKilobytes() {
        return this.preferredBatchSizeInKilobytes == null ? Optional.empty() : Optional.ofNullable(this.preferredBatchSizeInKilobytes);
    }

    /**
     * The Azure Resource Id that represents the endpoint of the Azure Function destination of an event subscription.
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public AzureFunctionEventSubscriptionDestinationResponse(
        String endpointType,
        @Nullable Integer maxEventsPerBatch,
        @Nullable Integer preferredBatchSizeInKilobytes,
        @Nullable String resourceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.maxEventsPerBatch = maxEventsPerBatch == null ? 1 : maxEventsPerBatch;
        this.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes == null ? 64 : preferredBatchSizeInKilobytes;
        this.resourceId = resourceId;
    }

    private AzureFunctionEventSubscriptionDestinationResponse() {
        this.endpointType = null;
        this.maxEventsPerBatch = null;
        this.preferredBatchSizeInKilobytes = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionEventSubscriptionDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private @Nullable Integer maxEventsPerBatch;
        private @Nullable Integer preferredBatchSizeInKilobytes;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionEventSubscriptionDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.maxEventsPerBatch = defaults.maxEventsPerBatch;
    	      this.preferredBatchSizeInKilobytes = defaults.preferredBatchSizeInKilobytes;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setMaxEventsPerBatch(@Nullable Integer maxEventsPerBatch) {
            this.maxEventsPerBatch = maxEventsPerBatch;
            return this;
        }

        public Builder setPreferredBatchSizeInKilobytes(@Nullable Integer preferredBatchSizeInKilobytes) {
            this.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public AzureFunctionEventSubscriptionDestinationResponse build() {
            return new AzureFunctionEventSubscriptionDestinationResponse(endpointType, maxEventsPerBatch, preferredBatchSizeInKilobytes, resourceId);
        }
    }
}
