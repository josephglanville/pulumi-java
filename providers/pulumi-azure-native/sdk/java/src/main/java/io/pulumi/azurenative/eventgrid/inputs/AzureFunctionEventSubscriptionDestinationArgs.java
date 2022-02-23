// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the azure function destination for an event subscription.
 * 
 */
public final class AzureFunctionEventSubscriptionDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFunctionEventSubscriptionDestinationArgs Empty = new AzureFunctionEventSubscriptionDestinationArgs();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'AzureFunction'.
     * 
     */
    @InputImport(name="endpointType", required=true)
      private final Input<String> endpointType;

    public Input<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * Maximum number of events per batch.
     * 
     */
    @InputImport(name="maxEventsPerBatch")
      private final @Nullable Input<Integer> maxEventsPerBatch;

    public Input<Integer> getMaxEventsPerBatch() {
        return this.maxEventsPerBatch == null ? Input.empty() : this.maxEventsPerBatch;
    }

    /**
     * Preferred batch size in Kilobytes.
     * 
     */
    @InputImport(name="preferredBatchSizeInKilobytes")
      private final @Nullable Input<Integer> preferredBatchSizeInKilobytes;

    public Input<Integer> getPreferredBatchSizeInKilobytes() {
        return this.preferredBatchSizeInKilobytes == null ? Input.empty() : this.preferredBatchSizeInKilobytes;
    }

    /**
     * The Azure Resource Id that represents the endpoint of the Azure Function destination of an event subscription.
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public AzureFunctionEventSubscriptionDestinationArgs(
        Input<String> endpointType,
        @Nullable Input<Integer> maxEventsPerBatch,
        @Nullable Input<Integer> preferredBatchSizeInKilobytes,
        @Nullable Input<String> resourceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.maxEventsPerBatch = maxEventsPerBatch == null ? Input.ofNullable(1) : maxEventsPerBatch;
        this.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes == null ? Input.ofNullable(64) : preferredBatchSizeInKilobytes;
        this.resourceId = resourceId;
    }

    private AzureFunctionEventSubscriptionDestinationArgs() {
        this.endpointType = Input.empty();
        this.maxEventsPerBatch = Input.empty();
        this.preferredBatchSizeInKilobytes = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionEventSubscriptionDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endpointType;
        private @Nullable Input<Integer> maxEventsPerBatch;
        private @Nullable Input<Integer> preferredBatchSizeInKilobytes;
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionEventSubscriptionDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.maxEventsPerBatch = defaults.maxEventsPerBatch;
    	      this.preferredBatchSizeInKilobytes = defaults.preferredBatchSizeInKilobytes;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setEndpointType(Input<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Input.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder setMaxEventsPerBatch(@Nullable Input<Integer> maxEventsPerBatch) {
            this.maxEventsPerBatch = maxEventsPerBatch;
            return this;
        }

        public Builder setMaxEventsPerBatch(@Nullable Integer maxEventsPerBatch) {
            this.maxEventsPerBatch = Input.ofNullable(maxEventsPerBatch);
            return this;
        }

        public Builder setPreferredBatchSizeInKilobytes(@Nullable Input<Integer> preferredBatchSizeInKilobytes) {
            this.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes;
            return this;
        }

        public Builder setPreferredBatchSizeInKilobytes(@Nullable Integer preferredBatchSizeInKilobytes) {
            this.preferredBatchSizeInKilobytes = Input.ofNullable(preferredBatchSizeInKilobytes);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }
        public AzureFunctionEventSubscriptionDestinationArgs build() {
            return new AzureFunctionEventSubscriptionDestinationArgs(endpointType, maxEventsPerBatch, preferredBatchSizeInKilobytes, resourceId);
        }
    }
}
