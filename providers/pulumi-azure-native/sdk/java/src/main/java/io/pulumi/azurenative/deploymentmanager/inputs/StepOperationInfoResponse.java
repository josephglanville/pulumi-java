// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.CloudErrorBodyResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StepOperationInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final StepOperationInfoResponse Empty = new StepOperationInfoResponse();

    @InputImport(name="correlationId", required=true)
    private final String correlationId;

    public String getCorrelationId() {
        return this.correlationId;
    }

    @InputImport(name="deploymentName", required=true)
    private final String deploymentName;

    public String getDeploymentName() {
        return this.deploymentName;
    }

    @InputImport(name="endTime", required=true)
    private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    @InputImport(name="error")
    private final @Nullable CloudErrorBodyResponse error;

    public Optional<CloudErrorBodyResponse> getError() {
        return this.error == null ? Optional.empty() : Optional.ofNullable(this.error);
    }

    @InputImport(name="lastUpdatedTime", required=true)
    private final String lastUpdatedTime;

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    public StepOperationInfoResponse(
        String correlationId,
        String deploymentName,
        String endTime,
        @Nullable CloudErrorBodyResponse error,
        String lastUpdatedTime,
        String startTime) {
        this.correlationId = Objects.requireNonNull(correlationId, "expected parameter 'correlationId' to be non-null");
        this.deploymentName = Objects.requireNonNull(deploymentName, "expected parameter 'deploymentName' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.error = error;
        this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime, "expected parameter 'lastUpdatedTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private StepOperationInfoResponse() {
        this.correlationId = null;
        this.deploymentName = null;
        this.endTime = null;
        this.error = null;
        this.lastUpdatedTime = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepOperationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String correlationId;
        private String deploymentName;
        private String endTime;
        private @Nullable CloudErrorBodyResponse error;
        private String lastUpdatedTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(StepOperationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.correlationId = defaults.correlationId;
    	      this.deploymentName = defaults.deploymentName;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setCorrelationId(String correlationId) {
            this.correlationId = Objects.requireNonNull(correlationId);
            return this;
        }

        public Builder setDeploymentName(String deploymentName) {
            this.deploymentName = Objects.requireNonNull(deploymentName);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setError(@Nullable CloudErrorBodyResponse error) {
            this.error = error;
            return this;
        }

        public Builder setLastUpdatedTime(String lastUpdatedTime) {
            this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public StepOperationInfoResponse build() {
            return new StepOperationInfoResponse(correlationId, deploymentName, endTime, error, lastUpdatedTime, startTime);
        }
    }
}
