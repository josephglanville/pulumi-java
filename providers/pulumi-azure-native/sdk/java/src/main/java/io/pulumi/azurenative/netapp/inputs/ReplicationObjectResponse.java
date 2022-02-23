// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Replication properties
 * 
 */
public final class ReplicationObjectResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReplicationObjectResponse Empty = new ReplicationObjectResponse();

    /**
     * Indicates whether the local volume is the source or destination for the Volume Replication
     * 
     */
    @InputImport(name="endpointType")
      private final @Nullable String endpointType;

    public Optional<String> getEndpointType() {
        return this.endpointType == null ? Optional.empty() : Optional.ofNullable(this.endpointType);
    }

    /**
     * The remote region for the other end of the Volume Replication.
     * 
     */
    @InputImport(name="remoteVolumeRegion")
      private final @Nullable String remoteVolumeRegion;

    public Optional<String> getRemoteVolumeRegion() {
        return this.remoteVolumeRegion == null ? Optional.empty() : Optional.ofNullable(this.remoteVolumeRegion);
    }

    /**
     * The resource ID of the remote volume.
     * 
     */
    @InputImport(name="remoteVolumeResourceId", required=true)
      private final String remoteVolumeResourceId;

    public String getRemoteVolumeResourceId() {
        return this.remoteVolumeResourceId;
    }

    /**
     * Id
     * 
     */
    @InputImport(name="replicationId")
      private final @Nullable String replicationId;

    public Optional<String> getReplicationId() {
        return this.replicationId == null ? Optional.empty() : Optional.ofNullable(this.replicationId);
    }

    /**
     * Schedule
     * 
     */
    @InputImport(name="replicationSchedule", required=true)
      private final String replicationSchedule;

    public String getReplicationSchedule() {
        return this.replicationSchedule;
    }

    public ReplicationObjectResponse(
        @Nullable String endpointType,
        @Nullable String remoteVolumeRegion,
        String remoteVolumeResourceId,
        @Nullable String replicationId,
        String replicationSchedule) {
        this.endpointType = endpointType;
        this.remoteVolumeRegion = remoteVolumeRegion;
        this.remoteVolumeResourceId = Objects.requireNonNull(remoteVolumeResourceId, "expected parameter 'remoteVolumeResourceId' to be non-null");
        this.replicationId = replicationId;
        this.replicationSchedule = Objects.requireNonNull(replicationSchedule, "expected parameter 'replicationSchedule' to be non-null");
    }

    private ReplicationObjectResponse() {
        this.endpointType = null;
        this.remoteVolumeRegion = null;
        this.remoteVolumeResourceId = null;
        this.replicationId = null;
        this.replicationSchedule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationObjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpointType;
        private @Nullable String remoteVolumeRegion;
        private String remoteVolumeResourceId;
        private @Nullable String replicationId;
        private String replicationSchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationObjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.remoteVolumeRegion = defaults.remoteVolumeRegion;
    	      this.remoteVolumeResourceId = defaults.remoteVolumeResourceId;
    	      this.replicationId = defaults.replicationId;
    	      this.replicationSchedule = defaults.replicationSchedule;
        }

        public Builder setEndpointType(@Nullable String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        public Builder setRemoteVolumeRegion(@Nullable String remoteVolumeRegion) {
            this.remoteVolumeRegion = remoteVolumeRegion;
            return this;
        }

        public Builder setRemoteVolumeResourceId(String remoteVolumeResourceId) {
            this.remoteVolumeResourceId = Objects.requireNonNull(remoteVolumeResourceId);
            return this;
        }

        public Builder setReplicationId(@Nullable String replicationId) {
            this.replicationId = replicationId;
            return this;
        }

        public Builder setReplicationSchedule(String replicationSchedule) {
            this.replicationSchedule = Objects.requireNonNull(replicationSchedule);
            return this;
        }
        public ReplicationObjectResponse build() {
            return new ReplicationObjectResponse(endpointType, remoteVolumeRegion, remoteVolumeResourceId, replicationId, replicationSchedule);
        }
    }
}
