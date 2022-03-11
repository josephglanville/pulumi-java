// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache.inputs;

import io.pulumi.awsnative.elasticache.inputs.GlobalReplicationGroupReshardingConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalReplicationGroupRegionalConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalReplicationGroupRegionalConfigurationArgs Empty = new GlobalReplicationGroupRegionalConfigurationArgs();

    /**
     * The replication group id of the Global Datastore member.
     * 
     */
    @InputImport(name="replicationGroupId")
      private final @Nullable Output<String> replicationGroupId;

    public Output<String> getReplicationGroupId() {
        return this.replicationGroupId == null ? Output.empty() : this.replicationGroupId;
    }

    /**
     * The AWS region of the Global Datastore member.
     * 
     */
    @InputImport(name="replicationGroupRegion")
      private final @Nullable Output<String> replicationGroupRegion;

    public Output<String> getReplicationGroupRegion() {
        return this.replicationGroupRegion == null ? Output.empty() : this.replicationGroupRegion;
    }

    /**
     * A list of PreferredAvailabilityZones objects that specifies the configuration of a node group in the resharded cluster.
     * 
     */
    @InputImport(name="reshardingConfigurations")
      private final @Nullable Output<List<GlobalReplicationGroupReshardingConfigurationArgs>> reshardingConfigurations;

    public Output<List<GlobalReplicationGroupReshardingConfigurationArgs>> getReshardingConfigurations() {
        return this.reshardingConfigurations == null ? Output.empty() : this.reshardingConfigurations;
    }

    public GlobalReplicationGroupRegionalConfigurationArgs(
        @Nullable Output<String> replicationGroupId,
        @Nullable Output<String> replicationGroupRegion,
        @Nullable Output<List<GlobalReplicationGroupReshardingConfigurationArgs>> reshardingConfigurations) {
        this.replicationGroupId = replicationGroupId;
        this.replicationGroupRegion = replicationGroupRegion;
        this.reshardingConfigurations = reshardingConfigurations;
    }

    private GlobalReplicationGroupRegionalConfigurationArgs() {
        this.replicationGroupId = Output.empty();
        this.replicationGroupRegion = Output.empty();
        this.reshardingConfigurations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalReplicationGroupRegionalConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> replicationGroupId;
        private @Nullable Output<String> replicationGroupRegion;
        private @Nullable Output<List<GlobalReplicationGroupReshardingConfigurationArgs>> reshardingConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalReplicationGroupRegionalConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicationGroupId = defaults.replicationGroupId;
    	      this.replicationGroupRegion = defaults.replicationGroupRegion;
    	      this.reshardingConfigurations = defaults.reshardingConfigurations;
        }

        public Builder replicationGroupId(@Nullable Output<String> replicationGroupId) {
            this.replicationGroupId = replicationGroupId;
            return this;
        }

        public Builder replicationGroupId(@Nullable String replicationGroupId) {
            this.replicationGroupId = Output.ofNullable(replicationGroupId);
            return this;
        }

        public Builder replicationGroupRegion(@Nullable Output<String> replicationGroupRegion) {
            this.replicationGroupRegion = replicationGroupRegion;
            return this;
        }

        public Builder replicationGroupRegion(@Nullable String replicationGroupRegion) {
            this.replicationGroupRegion = Output.ofNullable(replicationGroupRegion);
            return this;
        }

        public Builder reshardingConfigurations(@Nullable Output<List<GlobalReplicationGroupReshardingConfigurationArgs>> reshardingConfigurations) {
            this.reshardingConfigurations = reshardingConfigurations;
            return this;
        }

        public Builder reshardingConfigurations(@Nullable List<GlobalReplicationGroupReshardingConfigurationArgs> reshardingConfigurations) {
            this.reshardingConfigurations = Output.ofNullable(reshardingConfigurations);
            return this;
        }
        public GlobalReplicationGroupRegionalConfigurationArgs build() {
            return new GlobalReplicationGroupRegionalConfigurationArgs(replicationGroupId, replicationGroupRegion, reshardingConfigurations);
        }
    }
}
