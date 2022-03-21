// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationState Empty = new ReplicationConfigurationState();

    /**
     * The account ID of the destination registry to replicate to.
     * 
     */
    @Import(name="registryId")
      private final @Nullable Output<String> registryId;

    public Output<String> getRegistryId() {
        return this.registryId == null ? Output.empty() : this.registryId;
    }

    /**
     * Replication configuration for a registry. See Replication Configuration.
     * 
     */
    @Import(name="replicationConfiguration")
      private final @Nullable Output<ReplicationConfigurationReplicationConfigurationGetArgs> replicationConfiguration;

    public Output<ReplicationConfigurationReplicationConfigurationGetArgs> getReplicationConfiguration() {
        return this.replicationConfiguration == null ? Output.empty() : this.replicationConfiguration;
    }

    public ReplicationConfigurationState(
        @Nullable Output<String> registryId,
        @Nullable Output<ReplicationConfigurationReplicationConfigurationGetArgs> replicationConfiguration) {
        this.registryId = registryId;
        this.replicationConfiguration = replicationConfiguration;
    }

    private ReplicationConfigurationState() {
        this.registryId = Output.empty();
        this.replicationConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> registryId;
        private @Nullable Output<ReplicationConfigurationReplicationConfigurationGetArgs> replicationConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryId = defaults.registryId;
    	      this.replicationConfiguration = defaults.replicationConfiguration;
        }

        public Builder registryId(@Nullable Output<String> registryId) {
            this.registryId = registryId;
            return this;
        }
        public Builder registryId(@Nullable String registryId) {
            this.registryId = Output.ofNullable(registryId);
            return this;
        }
        public Builder replicationConfiguration(@Nullable Output<ReplicationConfigurationReplicationConfigurationGetArgs> replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }
        public Builder replicationConfiguration(@Nullable ReplicationConfigurationReplicationConfigurationGetArgs replicationConfiguration) {
            this.replicationConfiguration = Output.ofNullable(replicationConfiguration);
            return this;
        }        public ReplicationConfigurationState build() {
            return new ReplicationConfigurationState(registryId, replicationConfiguration);
        }
    }
}
