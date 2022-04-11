// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleDestinationArgs;
import io.pulumi.aws.ecr.inputs.ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationConfigurationReplicationConfigurationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationReplicationConfigurationRuleArgs Empty = new ReplicationConfigurationReplicationConfigurationRuleArgs();

    /**
     * the details of a replication destination. A maximum of 25 are allowed per `rule`. See Destination.
     * 
     */
    @Import(name="destinations", required=true)
      private final Output<List<ReplicationConfigurationReplicationConfigurationRuleDestinationArgs>> destinations;

    public Output<List<ReplicationConfigurationReplicationConfigurationRuleDestinationArgs>> getDestinations() {
        return this.destinations;
    }

    /**
     * filters for a replication rule. See Repository Filter.
     * 
     */
    @Import(name="repositoryFilters")
      private final @Nullable Output<List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs>> repositoryFilters;

    public Output<List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs>> getRepositoryFilters() {
        return this.repositoryFilters == null ? Codegen.empty() : this.repositoryFilters;
    }

    public ReplicationConfigurationReplicationConfigurationRuleArgs(
        Output<List<ReplicationConfigurationReplicationConfigurationRuleDestinationArgs>> destinations,
        @Nullable Output<List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs>> repositoryFilters) {
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.repositoryFilters = repositoryFilters;
    }

    private ReplicationConfigurationReplicationConfigurationRuleArgs() {
        this.destinations = Codegen.empty();
        this.repositoryFilters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationConfigurationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ReplicationConfigurationReplicationConfigurationRuleDestinationArgs>> destinations;
        private @Nullable Output<List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs>> repositoryFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationConfigurationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.repositoryFilters = defaults.repositoryFilters;
        }

        public Builder destinations(Output<List<ReplicationConfigurationReplicationConfigurationRuleDestinationArgs>> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }
        public Builder destinations(List<ReplicationConfigurationReplicationConfigurationRuleDestinationArgs> destinations) {
            this.destinations = Output.of(Objects.requireNonNull(destinations));
            return this;
        }
        public Builder destinations(ReplicationConfigurationReplicationConfigurationRuleDestinationArgs... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder repositoryFilters(@Nullable Output<List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs>> repositoryFilters) {
            this.repositoryFilters = repositoryFilters;
            return this;
        }
        public Builder repositoryFilters(@Nullable List<ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs> repositoryFilters) {
            this.repositoryFilters = Codegen.ofNullable(repositoryFilters);
            return this;
        }
        public Builder repositoryFilters(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs... repositoryFilters) {
            return repositoryFilters(List.of(repositoryFilters));
        }        public ReplicationConfigurationReplicationConfigurationRuleArgs build() {
            return new ReplicationConfigurationReplicationConfigurationRuleArgs(destinations, repositoryFilters);
        }
    }
}
