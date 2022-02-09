// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.DataTransferRegionalServiceResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataTransferServiceResourcePropertiesResponse {
    private final String creationTime;
    private final @Nullable Integer instanceCount;
    private final @Nullable String instanceSize;
    private final List<DataTransferRegionalServiceResourceResponse> locations;
    private final String serviceType;
    private final String status;

    @OutputCustomType.Constructor({"creationTime","instanceCount","instanceSize","locations","serviceType","status"})
    private DataTransferServiceResourcePropertiesResponse(
        String creationTime,
        @Nullable Integer instanceCount,
        @Nullable String instanceSize,
        List<DataTransferRegionalServiceResourceResponse> locations,
        String serviceType,
        String status) {
        this.creationTime = Objects.requireNonNull(creationTime);
        this.instanceCount = instanceCount;
        this.instanceSize = instanceSize;
        this.locations = Objects.requireNonNull(locations);
        this.serviceType = Objects.requireNonNull(serviceType);
        this.status = Objects.requireNonNull(status);
    }

    public String getCreationTime() {
        return this.creationTime;
    }
    public Optional<Integer> getInstanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    public Optional<String> getInstanceSize() {
        return Optional.ofNullable(this.instanceSize);
    }
    public List<DataTransferRegionalServiceResourceResponse> getLocations() {
        return this.locations;
    }
    public String getServiceType() {
        return this.serviceType;
    }
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferServiceResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private @Nullable Integer instanceCount;
        private @Nullable String instanceSize;
        private List<DataTransferRegionalServiceResourceResponse> locations;
        private String serviceType;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferServiceResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceSize = defaults.instanceSize;
    	      this.locations = defaults.locations;
    	      this.serviceType = defaults.serviceType;
    	      this.status = defaults.status;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setInstanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        public Builder setInstanceSize(@Nullable String instanceSize) {
            this.instanceSize = instanceSize;
            return this;
        }

        public Builder setLocations(List<DataTransferRegionalServiceResourceResponse> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder setServiceType(String serviceType) {
            this.serviceType = Objects.requireNonNull(serviceType);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public DataTransferServiceResourcePropertiesResponse build() {
            return new DataTransferServiceResourcePropertiesResponse(creationTime, instanceCount, instanceSize, locations, serviceType, status);
        }
    }
}
