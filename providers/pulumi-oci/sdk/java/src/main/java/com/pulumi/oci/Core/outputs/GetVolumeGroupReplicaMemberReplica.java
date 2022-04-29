// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVolumeGroupReplicaMemberReplica {
    /**
     * @return The volume replica ID.
     * 
     */
    private final String volumeReplicaId;

    @CustomType.Constructor
    private GetVolumeGroupReplicaMemberReplica(@CustomType.Parameter("volumeReplicaId") String volumeReplicaId) {
        this.volumeReplicaId = volumeReplicaId;
    }

    /**
     * @return The volume replica ID.
     * 
     */
    public String volumeReplicaId() {
        return this.volumeReplicaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeGroupReplicaMemberReplica defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String volumeReplicaId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeGroupReplicaMemberReplica defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.volumeReplicaId = defaults.volumeReplicaId;
        }

        public Builder volumeReplicaId(String volumeReplicaId) {
            this.volumeReplicaId = Objects.requireNonNull(volumeReplicaId);
            return this;
        }        public GetVolumeGroupReplicaMemberReplica build() {
            return new GetVolumeGroupReplicaMemberReplica(volumeReplicaId);
        }
    }
}
