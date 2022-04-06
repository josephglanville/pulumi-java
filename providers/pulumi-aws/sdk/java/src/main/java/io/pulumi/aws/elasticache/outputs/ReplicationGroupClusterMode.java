// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReplicationGroupClusterMode {
    /**
     * Number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications. Required unless `global_replication_group_id` is set.
     * 
     */
    private final @Nullable Integer numNodeGroups;
    /**
     * Number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will trigger an online resizing operation before other settings modifications.
     * 
     */
    private final Integer replicasPerNodeGroup;

    @CustomType.Constructor
    private ReplicationGroupClusterMode(
        @CustomType.Parameter("numNodeGroups") @Nullable Integer numNodeGroups,
        @CustomType.Parameter("replicasPerNodeGroup") Integer replicasPerNodeGroup) {
        this.numNodeGroups = numNodeGroups;
        this.replicasPerNodeGroup = replicasPerNodeGroup;
    }

    /**
     * Number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications. Required unless `global_replication_group_id` is set.
     * 
    */
    public Optional<Integer> getNumNodeGroups() {
        return Optional.ofNullable(this.numNodeGroups);
    }
    /**
     * Number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will trigger an online resizing operation before other settings modifications.
     * 
    */
    public Integer getReplicasPerNodeGroup() {
        return this.replicasPerNodeGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationGroupClusterMode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer numNodeGroups;
        private Integer replicasPerNodeGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationGroupClusterMode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numNodeGroups = defaults.numNodeGroups;
    	      this.replicasPerNodeGroup = defaults.replicasPerNodeGroup;
        }

        public Builder numNodeGroups(@Nullable Integer numNodeGroups) {
            this.numNodeGroups = numNodeGroups;
            return this;
        }
        public Builder replicasPerNodeGroup(Integer replicasPerNodeGroup) {
            this.replicasPerNodeGroup = Objects.requireNonNull(replicasPerNodeGroup);
            return this;
        }        public ReplicationGroupClusterMode build() {
            return new ReplicationGroupClusterMode(numNodeGroups, replicasPerNodeGroup);
        }
    }
}