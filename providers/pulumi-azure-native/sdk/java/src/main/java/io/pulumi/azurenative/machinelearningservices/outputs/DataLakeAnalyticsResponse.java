// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.DataLakeAnalyticsResponseProperties;
import io.pulumi.azurenative.machinelearningservices.outputs.MachineLearningServiceErrorResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataLakeAnalyticsResponse {
    private final @Nullable String computeLocation;
    private final String computeType;
    private final @Nullable String description;
    private final Boolean isAttachedCompute;
    private final @Nullable DataLakeAnalyticsResponseProperties properties;
    private final List<MachineLearningServiceErrorResponse> provisioningErrors;
    private final String provisioningState;
    private final @Nullable String resourceId;

    @OutputCustomType.Constructor({"computeLocation","computeType","description","isAttachedCompute","properties","provisioningErrors","provisioningState","resourceId"})
    private DataLakeAnalyticsResponse(
        @Nullable String computeLocation,
        String computeType,
        @Nullable String description,
        Boolean isAttachedCompute,
        @Nullable DataLakeAnalyticsResponseProperties properties,
        List<MachineLearningServiceErrorResponse> provisioningErrors,
        String provisioningState,
        @Nullable String resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = Objects.requireNonNull(computeType);
        this.description = description;
        this.isAttachedCompute = Objects.requireNonNull(isAttachedCompute);
        this.properties = properties;
        this.provisioningErrors = Objects.requireNonNull(provisioningErrors);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceId = resourceId;
    }

    public Optional<String> getComputeLocation() {
        return Optional.ofNullable(this.computeLocation);
    }
    public String getComputeType() {
        return this.computeType;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Boolean getIsAttachedCompute() {
        return this.isAttachedCompute;
    }
    public Optional<DataLakeAnalyticsResponseProperties> getProperties() {
        return Optional.ofNullable(this.properties);
    }
    public List<MachineLearningServiceErrorResponse> getProvisioningErrors() {
        return this.provisioningErrors;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeAnalyticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeLocation;
        private String computeType;
        private @Nullable String description;
        private Boolean isAttachedCompute;
        private @Nullable DataLakeAnalyticsResponseProperties properties;
        private List<MachineLearningServiceErrorResponse> provisioningErrors;
        private String provisioningState;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeAnalyticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeLocation = defaults.computeLocation;
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.isAttachedCompute = defaults.isAttachedCompute;
    	      this.properties = defaults.properties;
    	      this.provisioningErrors = defaults.provisioningErrors;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setComputeLocation(@Nullable String computeLocation) {
            this.computeLocation = computeLocation;
            return this;
        }

        public Builder setComputeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIsAttachedCompute(Boolean isAttachedCompute) {
            this.isAttachedCompute = Objects.requireNonNull(isAttachedCompute);
            return this;
        }

        public Builder setProperties(@Nullable DataLakeAnalyticsResponseProperties properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProvisioningErrors(List<MachineLearningServiceErrorResponse> provisioningErrors) {
            this.provisioningErrors = Objects.requireNonNull(provisioningErrors);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public DataLakeAnalyticsResponse build() {
            return new DataLakeAnalyticsResponse(computeLocation, computeType, description, isAttachedCompute, properties, provisioningErrors, provisioningState, resourceId);
        }
    }
}
