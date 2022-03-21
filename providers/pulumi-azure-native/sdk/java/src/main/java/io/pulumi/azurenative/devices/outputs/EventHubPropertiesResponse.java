// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventHubPropertiesResponse {
    /**
     * The Event Hub-compatible endpoint.
     * 
     */
    private final String endpoint;
    /**
     * The number of partitions for receiving device-to-cloud messages in the Event Hub-compatible endpoint. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     * 
     */
    private final @Nullable Integer partitionCount;
    /**
     * The partition ids in the Event Hub-compatible endpoint.
     * 
     */
    private final List<String> partitionIds;
    /**
     * The Event Hub-compatible name.
     * 
     */
    private final String path;
    /**
     * The retention time for device-to-cloud messages in days. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages
     * 
     */
    private final @Nullable Double retentionTimeInDays;

    @CustomType.Constructor
    private EventHubPropertiesResponse(
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("partitionCount") @Nullable Integer partitionCount,
        @CustomType.Parameter("partitionIds") List<String> partitionIds,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("retentionTimeInDays") @Nullable Double retentionTimeInDays) {
        this.endpoint = endpoint;
        this.partitionCount = partitionCount;
        this.partitionIds = partitionIds;
        this.path = path;
        this.retentionTimeInDays = retentionTimeInDays;
    }

    /**
     * The Event Hub-compatible endpoint.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The number of partitions for receiving device-to-cloud messages in the Event Hub-compatible endpoint. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     * 
    */
    public Optional<Integer> getPartitionCount() {
        return Optional.ofNullable(this.partitionCount);
    }
    /**
     * The partition ids in the Event Hub-compatible endpoint.
     * 
    */
    public List<String> getPartitionIds() {
        return this.partitionIds;
    }
    /**
     * The Event Hub-compatible name.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * The retention time for device-to-cloud messages in days. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages
     * 
    */
    public Optional<Double> getRetentionTimeInDays() {
        return Optional.ofNullable(this.retentionTimeInDays);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private @Nullable Integer partitionCount;
        private List<String> partitionIds;
        private String path;
        private @Nullable Double retentionTimeInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.partitionCount = defaults.partitionCount;
    	      this.partitionIds = defaults.partitionIds;
    	      this.path = defaults.path;
    	      this.retentionTimeInDays = defaults.retentionTimeInDays;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder partitionCount(@Nullable Integer partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public Builder partitionIds(List<String> partitionIds) {
            this.partitionIds = Objects.requireNonNull(partitionIds);
            return this;
        }
        public Builder partitionIds(String... partitionIds) {
            return partitionIds(List.of(partitionIds));
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder retentionTimeInDays(@Nullable Double retentionTimeInDays) {
            this.retentionTimeInDays = retentionTimeInDays;
            return this;
        }        public EventHubPropertiesResponse build() {
            return new EventHubPropertiesResponse(endpoint, partitionCount, partitionIds, path, retentionTimeInDays);
        }
    }
}
