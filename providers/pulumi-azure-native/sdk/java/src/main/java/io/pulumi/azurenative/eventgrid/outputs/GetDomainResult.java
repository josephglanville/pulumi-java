// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.InboundIpRuleResponse;
import io.pulumi.azurenative.eventgrid.outputs.JsonInputSchemaMappingResponse;
import io.pulumi.azurenative.eventgrid.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDomainResult {
    private final String endpoint;
    private final String id;
    private final @Nullable List<InboundIpRuleResponse> inboundIpRules;
    private final @Nullable String inputSchema;
    private final @Nullable JsonInputSchemaMappingResponse inputSchemaMapping;
    private final String location;
    private final String metricResourceId;
    private final String name;
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    private final String provisioningState;
    private final @Nullable String publicNetworkAccess;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"endpoint","id","inboundIpRules","inputSchema","inputSchemaMapping","location","metricResourceId","name","privateEndpointConnections","provisioningState","publicNetworkAccess","systemData","tags","type"})
    private GetDomainResult(
        String endpoint,
        String id,
        @Nullable List<InboundIpRuleResponse> inboundIpRules,
        @Nullable String inputSchema,
        @Nullable JsonInputSchemaMappingResponse inputSchemaMapping,
        String location,
        String metricResourceId,
        String name,
        List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable String publicNetworkAccess,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.endpoint = Objects.requireNonNull(endpoint);
        this.id = Objects.requireNonNull(id);
        this.inboundIpRules = inboundIpRules;
        this.inputSchema = inputSchema;
        this.inputSchemaMapping = inputSchemaMapping;
        this.location = Objects.requireNonNull(location);
        this.metricResourceId = Objects.requireNonNull(metricResourceId);
        this.name = Objects.requireNonNull(name);
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicNetworkAccess = publicNetworkAccess;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public String getEndpoint() {
        return this.endpoint;
    }
    public String getId() {
        return this.id;
    }
    public List<InboundIpRuleResponse> getInboundIpRules() {
        return this.inboundIpRules == null ? List.of() : this.inboundIpRules;
    }
    public Optional<String> getInputSchema() {
        return Optional.ofNullable(this.inputSchema);
    }
    public Optional<JsonInputSchemaMappingResponse> getInputSchemaMapping() {
        return Optional.ofNullable(this.inputSchemaMapping);
    }
    public String getLocation() {
        return this.location;
    }
    public String getMetricResourceId() {
        return this.metricResourceId;
    }
    public String getName() {
        return this.name;
    }
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String id;
        private @Nullable List<InboundIpRuleResponse> inboundIpRules;
        private @Nullable String inputSchema;
        private @Nullable JsonInputSchemaMappingResponse inputSchemaMapping;
        private String location;
        private String metricResourceId;
        private String name;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.inboundIpRules = defaults.inboundIpRules;
    	      this.inputSchema = defaults.inputSchema;
    	      this.inputSchemaMapping = defaults.inputSchemaMapping;
    	      this.location = defaults.location;
    	      this.metricResourceId = defaults.metricResourceId;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInboundIpRules(@Nullable List<InboundIpRuleResponse> inboundIpRules) {
            this.inboundIpRules = inboundIpRules;
            return this;
        }

        public Builder setInputSchema(@Nullable String inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }

        public Builder setInputSchemaMapping(@Nullable JsonInputSchemaMappingResponse inputSchemaMapping) {
            this.inputSchemaMapping = inputSchemaMapping;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMetricResourceId(String metricResourceId) {
            this.metricResourceId = Objects.requireNonNull(metricResourceId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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

        public GetDomainResult build() {
            return new GetDomainResult(endpoint, id, inboundIpRules, inputSchema, inputSchemaMapping, location, metricResourceId, name, privateEndpointConnections, provisioningState, publicNetworkAccess, systemData, tags, type);
        }
    }
}
