// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.outputs;

import io.pulumi.azurenative.timeseriesinsights.outputs.EnvironmentStatusResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.SkuResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.TimeSeriesIdPropertyResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGen1EnvironmentResult {
    /**
     * The time the resource was created.
     * 
     */
    private final String creationTime;
    /**
     * The fully qualified domain name used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    private final String dataAccessFqdn;
    /**
     * An id used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    private final String dataAccessId;
    /**
     * ISO8601 timespan specifying the minimum number of days the environment's events will be available for query.
     * 
     */
    private final String dataRetentionTime;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The kind of the environment.
     * Expected value is 'Gen1'.
     * 
     */
    private final String kind;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The list of event properties which will be used to partition data in the environment. Currently, only a single partition key property is supported.
     * 
     */
    private final @Nullable List<TimeSeriesIdPropertyResponse> partitionKeyProperties;
    /**
     * Provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    private final SkuResponse sku;
    /**
     * An object that represents the status of the environment, and its internal state in the Time Series Insights service.
     * 
     */
    private final EnvironmentStatusResponse status;
    /**
     * The behavior the Time Series Insights service should take when the environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted from the environment. The default behavior is PurgeOldData.
     * 
     */
    private final @Nullable String storageLimitExceededBehavior;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetGen1EnvironmentResult(
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("dataAccessFqdn") String dataAccessFqdn,
        @CustomType.Parameter("dataAccessId") String dataAccessId,
        @CustomType.Parameter("dataRetentionTime") String dataRetentionTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("partitionKeyProperties") @Nullable List<TimeSeriesIdPropertyResponse> partitionKeyProperties,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sku") SkuResponse sku,
        @CustomType.Parameter("status") EnvironmentStatusResponse status,
        @CustomType.Parameter("storageLimitExceededBehavior") @Nullable String storageLimitExceededBehavior,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.creationTime = creationTime;
        this.dataAccessFqdn = dataAccessFqdn;
        this.dataAccessId = dataAccessId;
        this.dataRetentionTime = dataRetentionTime;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.partitionKeyProperties = partitionKeyProperties;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.status = status;
        this.storageLimitExceededBehavior = storageLimitExceededBehavior;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The time the resource was created.
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * The fully qualified domain name used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
    */
    public String getDataAccessFqdn() {
        return this.dataAccessFqdn;
    }
    /**
     * An id used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
    */
    public String getDataAccessId() {
        return this.dataAccessId;
    }
    /**
     * ISO8601 timespan specifying the minimum number of days the environment's events will be available for query.
     * 
    */
    public String getDataRetentionTime() {
        return this.dataRetentionTime;
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The kind of the environment.
     * Expected value is 'Gen1'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The list of event properties which will be used to partition data in the environment. Currently, only a single partition key property is supported.
     * 
    */
    public List<TimeSeriesIdPropertyResponse> getPartitionKeyProperties() {
        return this.partitionKeyProperties == null ? List.of() : this.partitionKeyProperties;
    }
    /**
     * Provisioning state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * An object that represents the status of the environment, and its internal state in the Time Series Insights service.
     * 
    */
    public EnvironmentStatusResponse getStatus() {
        return this.status;
    }
    /**
     * The behavior the Time Series Insights service should take when the environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted from the environment. The default behavior is PurgeOldData.
     * 
    */
    public Optional<String> getStorageLimitExceededBehavior() {
        return Optional.ofNullable(this.storageLimitExceededBehavior);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGen1EnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private String dataAccessFqdn;
        private String dataAccessId;
        private String dataRetentionTime;
        private String id;
        private String kind;
        private String location;
        private String name;
        private @Nullable List<TimeSeriesIdPropertyResponse> partitionKeyProperties;
        private String provisioningState;
        private SkuResponse sku;
        private EnvironmentStatusResponse status;
        private @Nullable String storageLimitExceededBehavior;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGen1EnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.dataAccessFqdn = defaults.dataAccessFqdn;
    	      this.dataAccessId = defaults.dataAccessId;
    	      this.dataRetentionTime = defaults.dataRetentionTime;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.partitionKeyProperties = defaults.partitionKeyProperties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.status = defaults.status;
    	      this.storageLimitExceededBehavior = defaults.storageLimitExceededBehavior;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder dataAccessFqdn(String dataAccessFqdn) {
            this.dataAccessFqdn = Objects.requireNonNull(dataAccessFqdn);
            return this;
        }
        public Builder dataAccessId(String dataAccessId) {
            this.dataAccessId = Objects.requireNonNull(dataAccessId);
            return this;
        }
        public Builder dataRetentionTime(String dataRetentionTime) {
            this.dataRetentionTime = Objects.requireNonNull(dataRetentionTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder partitionKeyProperties(@Nullable List<TimeSeriesIdPropertyResponse> partitionKeyProperties) {
            this.partitionKeyProperties = partitionKeyProperties;
            return this;
        }
        public Builder partitionKeyProperties(TimeSeriesIdPropertyResponse... partitionKeyProperties) {
            return partitionKeyProperties(List.of(partitionKeyProperties));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder sku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder status(EnvironmentStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder storageLimitExceededBehavior(@Nullable String storageLimitExceededBehavior) {
            this.storageLimitExceededBehavior = storageLimitExceededBehavior;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetGen1EnvironmentResult build() {
            return new GetGen1EnvironmentResult(creationTime, dataAccessFqdn, dataAccessId, dataRetentionTime, id, kind, location, name, partitionKeyProperties, provisioningState, sku, status, storageLimitExceededBehavior, tags, type);
        }
    }
}
