// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClustersClusterMetadata {
    /**
     * @return The user who created the cluster.
     * 
     */
    private final String createdByUserId;
    /**
     * @return The OCID of the work request which created the cluster.
     * 
     */
    private final String createdByWorkRequestId;
    /**
     * @return The user who deleted the cluster.
     * 
     */
    private final String deletedByUserId;
    /**
     * @return The OCID of the work request which deleted the cluster.
     * 
     */
    private final String deletedByWorkRequestId;
    /**
     * @return The time the cluster was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return The time the cluster was deleted.
     * 
     */
    private final String timeDeleted;
    /**
     * @return The time the cluster was updated.
     * 
     */
    private final String timeUpdated;
    /**
     * @return The user who updated the cluster.
     * 
     */
    private final String updatedByUserId;
    /**
     * @return The OCID of the work request which updated the cluster.
     * 
     */
    private final String updatedByWorkRequestId;

    @CustomType.Constructor
    private GetClustersClusterMetadata(
        @CustomType.Parameter("createdByUserId") String createdByUserId,
        @CustomType.Parameter("createdByWorkRequestId") String createdByWorkRequestId,
        @CustomType.Parameter("deletedByUserId") String deletedByUserId,
        @CustomType.Parameter("deletedByWorkRequestId") String deletedByWorkRequestId,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeDeleted") String timeDeleted,
        @CustomType.Parameter("timeUpdated") String timeUpdated,
        @CustomType.Parameter("updatedByUserId") String updatedByUserId,
        @CustomType.Parameter("updatedByWorkRequestId") String updatedByWorkRequestId) {
        this.createdByUserId = createdByUserId;
        this.createdByWorkRequestId = createdByWorkRequestId;
        this.deletedByUserId = deletedByUserId;
        this.deletedByWorkRequestId = deletedByWorkRequestId;
        this.timeCreated = timeCreated;
        this.timeDeleted = timeDeleted;
        this.timeUpdated = timeUpdated;
        this.updatedByUserId = updatedByUserId;
        this.updatedByWorkRequestId = updatedByWorkRequestId;
    }

    /**
     * @return The user who created the cluster.
     * 
     */
    public String createdByUserId() {
        return this.createdByUserId;
    }
    /**
     * @return The OCID of the work request which created the cluster.
     * 
     */
    public String createdByWorkRequestId() {
        return this.createdByWorkRequestId;
    }
    /**
     * @return The user who deleted the cluster.
     * 
     */
    public String deletedByUserId() {
        return this.deletedByUserId;
    }
    /**
     * @return The OCID of the work request which deleted the cluster.
     * 
     */
    public String deletedByWorkRequestId() {
        return this.deletedByWorkRequestId;
    }
    /**
     * @return The time the cluster was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time the cluster was deleted.
     * 
     */
    public String timeDeleted() {
        return this.timeDeleted;
    }
    /**
     * @return The time the cluster was updated.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * @return The user who updated the cluster.
     * 
     */
    public String updatedByUserId() {
        return this.updatedByUserId;
    }
    /**
     * @return The OCID of the work request which updated the cluster.
     * 
     */
    public String updatedByWorkRequestId() {
        return this.updatedByWorkRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersClusterMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdByUserId;
        private String createdByWorkRequestId;
        private String deletedByUserId;
        private String deletedByWorkRequestId;
        private String timeCreated;
        private String timeDeleted;
        private String timeUpdated;
        private String updatedByUserId;
        private String updatedByWorkRequestId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClustersClusterMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdByUserId = defaults.createdByUserId;
    	      this.createdByWorkRequestId = defaults.createdByWorkRequestId;
    	      this.deletedByUserId = defaults.deletedByUserId;
    	      this.deletedByWorkRequestId = defaults.deletedByWorkRequestId;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeDeleted = defaults.timeDeleted;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.updatedByUserId = defaults.updatedByUserId;
    	      this.updatedByWorkRequestId = defaults.updatedByWorkRequestId;
        }

        public Builder createdByUserId(String createdByUserId) {
            this.createdByUserId = Objects.requireNonNull(createdByUserId);
            return this;
        }
        public Builder createdByWorkRequestId(String createdByWorkRequestId) {
            this.createdByWorkRequestId = Objects.requireNonNull(createdByWorkRequestId);
            return this;
        }
        public Builder deletedByUserId(String deletedByUserId) {
            this.deletedByUserId = Objects.requireNonNull(deletedByUserId);
            return this;
        }
        public Builder deletedByWorkRequestId(String deletedByWorkRequestId) {
            this.deletedByWorkRequestId = Objects.requireNonNull(deletedByWorkRequestId);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeDeleted(String timeDeleted) {
            this.timeDeleted = Objects.requireNonNull(timeDeleted);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }
        public Builder updatedByUserId(String updatedByUserId) {
            this.updatedByUserId = Objects.requireNonNull(updatedByUserId);
            return this;
        }
        public Builder updatedByWorkRequestId(String updatedByWorkRequestId) {
            this.updatedByWorkRequestId = Objects.requireNonNull(updatedByWorkRequestId);
            return this;
        }        public GetClustersClusterMetadata build() {
            return new GetClustersClusterMetadata(createdByUserId, createdByWorkRequestId, deletedByUserId, deletedByWorkRequestId, timeCreated, timeDeleted, timeUpdated, updatedByUserId, updatedByWorkRequestId);
        }
    }
}
