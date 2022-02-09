// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.outputs;

import io.pulumi.azurenative.storagesync.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStorageSyncServiceResult {
    private final String id;
    private final @Nullable String incomingTrafficPolicy;
    private final String lastOperationName;
    private final String lastWorkflowId;
    private final String location;
    private final String name;
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    private final String provisioningState;
    private final Integer storageSyncServiceStatus;
    private final String storageSyncServiceUid;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"id","incomingTrafficPolicy","lastOperationName","lastWorkflowId","location","name","privateEndpointConnections","provisioningState","storageSyncServiceStatus","storageSyncServiceUid","tags","type"})
    private GetStorageSyncServiceResult(
        String id,
        @Nullable String incomingTrafficPolicy,
        String lastOperationName,
        String lastWorkflowId,
        String location,
        String name,
        List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        Integer storageSyncServiceStatus,
        String storageSyncServiceUid,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.incomingTrafficPolicy = incomingTrafficPolicy;
        this.lastOperationName = Objects.requireNonNull(lastOperationName);
        this.lastWorkflowId = Objects.requireNonNull(lastWorkflowId);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.storageSyncServiceStatus = Objects.requireNonNull(storageSyncServiceStatus);
        this.storageSyncServiceUid = Objects.requireNonNull(storageSyncServiceUid);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public Optional<String> getIncomingTrafficPolicy() {
        return Optional.ofNullable(this.incomingTrafficPolicy);
    }
    public String getLastOperationName() {
        return this.lastOperationName;
    }
    public String getLastWorkflowId() {
        return this.lastWorkflowId;
    }
    public String getLocation() {
        return this.location;
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
    public Integer getStorageSyncServiceStatus() {
        return this.storageSyncServiceStatus;
    }
    public String getStorageSyncServiceUid() {
        return this.storageSyncServiceUid;
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

    public static Builder builder(GetStorageSyncServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String incomingTrafficPolicy;
        private String lastOperationName;
        private String lastWorkflowId;
        private String location;
        private String name;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private Integer storageSyncServiceStatus;
        private String storageSyncServiceUid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageSyncServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.incomingTrafficPolicy = defaults.incomingTrafficPolicy;
    	      this.lastOperationName = defaults.lastOperationName;
    	      this.lastWorkflowId = defaults.lastWorkflowId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.storageSyncServiceStatus = defaults.storageSyncServiceStatus;
    	      this.storageSyncServiceUid = defaults.storageSyncServiceUid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIncomingTrafficPolicy(@Nullable String incomingTrafficPolicy) {
            this.incomingTrafficPolicy = incomingTrafficPolicy;
            return this;
        }

        public Builder setLastOperationName(String lastOperationName) {
            this.lastOperationName = Objects.requireNonNull(lastOperationName);
            return this;
        }

        public Builder setLastWorkflowId(String lastWorkflowId) {
            this.lastWorkflowId = Objects.requireNonNull(lastWorkflowId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
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

        public Builder setStorageSyncServiceStatus(Integer storageSyncServiceStatus) {
            this.storageSyncServiceStatus = Objects.requireNonNull(storageSyncServiceStatus);
            return this;
        }

        public Builder setStorageSyncServiceUid(String storageSyncServiceUid) {
            this.storageSyncServiceUid = Objects.requireNonNull(storageSyncServiceUid);
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

        public GetStorageSyncServiceResult build() {
            return new GetStorageSyncServiceResult(id, incomingTrafficPolicy, lastOperationName, lastWorkflowId, location, name, privateEndpointConnections, provisioningState, storageSyncServiceStatus, storageSyncServiceUid, tags, type);
        }
    }
}
