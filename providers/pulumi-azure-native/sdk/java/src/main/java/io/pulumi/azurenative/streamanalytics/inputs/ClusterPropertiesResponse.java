// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The properties associated with a Stream Analytics cluster.
 * 
 */
public final class ClusterPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterPropertiesResponse Empty = new ClusterPropertiesResponse();

    /**
     * Represents the number of streaming units currently being used on the cluster.
     * 
     */
    @InputImport(name="capacityAllocated", required=true)
      private final Integer capacityAllocated;

    public Integer getCapacityAllocated() {
        return this.capacityAllocated;
    }

    /**
     * Represents the sum of the SUs of all streaming jobs associated with the cluster. If all of the jobs were running, this would be the capacity allocated.
     * 
     */
    @InputImport(name="capacityAssigned", required=true)
      private final Integer capacityAssigned;

    public Integer getCapacityAssigned() {
        return this.capacityAssigned;
    }

    /**
     * Unique identifier for the cluster.
     * 
     */
    @InputImport(name="clusterId", required=true)
      private final String clusterId;

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * The date this cluster was created.
     * 
     */
    @InputImport(name="createdDate", required=true)
      private final String createdDate;

    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * The status of the cluster provisioning. The three terminal states are: Succeeded, Failed and Canceled
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public ClusterPropertiesResponse(
        Integer capacityAllocated,
        Integer capacityAssigned,
        String clusterId,
        String createdDate,
        String provisioningState) {
        this.capacityAllocated = Objects.requireNonNull(capacityAllocated, "expected parameter 'capacityAllocated' to be non-null");
        this.capacityAssigned = Objects.requireNonNull(capacityAssigned, "expected parameter 'capacityAssigned' to be non-null");
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.createdDate = Objects.requireNonNull(createdDate, "expected parameter 'createdDate' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private ClusterPropertiesResponse() {
        this.capacityAllocated = null;
        this.capacityAssigned = null;
        this.clusterId = null;
        this.createdDate = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer capacityAllocated;
        private Integer capacityAssigned;
        private String clusterId;
        private String createdDate;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityAllocated = defaults.capacityAllocated;
    	      this.capacityAssigned = defaults.capacityAssigned;
    	      this.clusterId = defaults.clusterId;
    	      this.createdDate = defaults.createdDate;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setCapacityAllocated(Integer capacityAllocated) {
            this.capacityAllocated = Objects.requireNonNull(capacityAllocated);
            return this;
        }

        public Builder setCapacityAssigned(Integer capacityAssigned) {
            this.capacityAssigned = Objects.requireNonNull(capacityAssigned);
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public ClusterPropertiesResponse build() {
            return new ClusterPropertiesResponse(capacityAllocated, capacityAssigned, clusterId, createdDate, provisioningState);
        }
    }
}
