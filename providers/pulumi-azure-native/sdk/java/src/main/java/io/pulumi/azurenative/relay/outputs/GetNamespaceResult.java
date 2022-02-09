// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay.outputs;

import io.pulumi.azurenative.relay.outputs.SkuResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNamespaceResult {
    private final String createdAt;
    private final String id;
    private final String location;
    private final String metricId;
    private final String name;
    private final String provisioningState;
    private final String serviceBusEndpoint;
    private final @Nullable SkuResponse sku;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final String updatedAt;

    @OutputCustomType.Constructor({"createdAt","id","location","metricId","name","provisioningState","serviceBusEndpoint","sku","tags","type","updatedAt"})
    private GetNamespaceResult(
        String createdAt,
        String id,
        String location,
        String metricId,
        String name,
        String provisioningState,
        String serviceBusEndpoint,
        @Nullable SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        String updatedAt) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.metricId = Objects.requireNonNull(metricId);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.serviceBusEndpoint = Objects.requireNonNull(serviceBusEndpoint);
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.updatedAt = Objects.requireNonNull(updatedAt);
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public String getMetricId() {
        return this.metricId;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getServiceBusEndpoint() {
        return this.serviceBusEndpoint;
    }
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private String location;
        private String metricId;
        private String name;
        private String provisioningState;
        private String serviceBusEndpoint;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.metricId = defaults.metricId;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serviceBusEndpoint = defaults.serviceBusEndpoint;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMetricId(String metricId) {
            this.metricId = Objects.requireNonNull(metricId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setServiceBusEndpoint(String serviceBusEndpoint) {
            this.serviceBusEndpoint = Objects.requireNonNull(serviceBusEndpoint);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }

        public GetNamespaceResult build() {
            return new GetNamespaceResult(createdAt, id, location, metricId, name, provisioningState, serviceBusEndpoint, sku, tags, type, updatedAt);
        }
    }
}
