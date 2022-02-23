// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.HDInsightResponseProperties;
import io.pulumi.azurenative.machinelearningservices.inputs.MachineLearningServiceErrorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A HDInsight compute.
 * 
 */
public final class HDInsightResponse extends io.pulumi.resources.InvokeArgs {

    public static final HDInsightResponse Empty = new HDInsightResponse();

    /**
     * Location for the underlying compute
     * 
     */
    @InputImport(name="computeLocation")
      private final @Nullable String computeLocation;

    public Optional<String> getComputeLocation() {
        return this.computeLocation == null ? Optional.empty() : Optional.ofNullable(this.computeLocation);
    }

    /**
     * The type of compute
     * Expected value is 'HDInsight'.
     * 
     */
    @InputImport(name="computeType", required=true)
      private final String computeType;

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * The description of the Machine Learning compute.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Indicating whether the compute was provisioned by user and brought from outside if true, or machine learning service provisioned it if false.
     * 
     */
    @InputImport(name="isAttachedCompute", required=true)
      private final Boolean isAttachedCompute;

    public Boolean getIsAttachedCompute() {
        return this.isAttachedCompute;
    }

    @InputImport(name="properties")
      private final @Nullable HDInsightResponseProperties properties;

    public Optional<HDInsightResponseProperties> getProperties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    /**
     * Errors during provisioning
     * 
     */
    @InputImport(name="provisioningErrors", required=true)
      private final List<MachineLearningServiceErrorResponse> provisioningErrors;

    public List<MachineLearningServiceErrorResponse> getProvisioningErrors() {
        return this.provisioningErrors;
    }

    /**
     * The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * ARM resource id of the underlying compute
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public HDInsightResponse(
        @Nullable String computeLocation,
        String computeType,
        @Nullable String description,
        Boolean isAttachedCompute,
        @Nullable HDInsightResponseProperties properties,
        List<MachineLearningServiceErrorResponse> provisioningErrors,
        String provisioningState,
        @Nullable String resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.description = description;
        this.isAttachedCompute = Objects.requireNonNull(isAttachedCompute, "expected parameter 'isAttachedCompute' to be non-null");
        this.properties = properties;
        this.provisioningErrors = Objects.requireNonNull(provisioningErrors, "expected parameter 'provisioningErrors' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.resourceId = resourceId;
    }

    private HDInsightResponse() {
        this.computeLocation = null;
        this.computeType = null;
        this.description = null;
        this.isAttachedCompute = null;
        this.properties = null;
        this.provisioningErrors = List.of();
        this.provisioningState = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeLocation;
        private String computeType;
        private @Nullable String description;
        private Boolean isAttachedCompute;
        private @Nullable HDInsightResponseProperties properties;
        private List<MachineLearningServiceErrorResponse> provisioningErrors;
        private String provisioningState;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightResponse defaults) {
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

        public Builder setProperties(@Nullable HDInsightResponseProperties properties) {
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
        public HDInsightResponse build() {
            return new HDInsightResponse(computeLocation, computeType, description, isAttachedCompute, properties, provisioningErrors, provisioningState, resourceId);
        }
    }
}
