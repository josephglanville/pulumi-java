// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.inputs;

import io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationReplicationDestinationArgs;
import io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationRepositoryFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An array of objects representing the details of a replication destination.
 * 
 */
public final class ReplicationConfigurationReplicationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationReplicationRuleArgs Empty = new ReplicationConfigurationReplicationRuleArgs();

    /**
     * An array of objects representing the details of a replication destination.
     * 
     */
    @InputImport(name="destinations", required=true)
      private final Input<List<ReplicationConfigurationReplicationDestinationArgs>> destinations;

    public Input<List<ReplicationConfigurationReplicationDestinationArgs>> getDestinations() {
        return this.destinations;
    }

    /**
     * An array of objects representing the details of a repository filter.
     * 
     */
    @InputImport(name="repositoryFilters")
      private final @Nullable Input<List<ReplicationConfigurationRepositoryFilterArgs>> repositoryFilters;

    public Input<List<ReplicationConfigurationRepositoryFilterArgs>> getRepositoryFilters() {
        return this.repositoryFilters == null ? Input.empty() : this.repositoryFilters;
    }

    public ReplicationConfigurationReplicationRuleArgs(
        Input<List<ReplicationConfigurationReplicationDestinationArgs>> destinations,
        @Nullable Input<List<ReplicationConfigurationRepositoryFilterArgs>> repositoryFilters) {
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.repositoryFilters = repositoryFilters;
    }

    private ReplicationConfigurationReplicationRuleArgs() {
        this.destinations = Input.empty();
        this.repositoryFilters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ReplicationConfigurationReplicationDestinationArgs>> destinations;
        private @Nullable Input<List<ReplicationConfigurationRepositoryFilterArgs>> repositoryFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.repositoryFilters = defaults.repositoryFilters;
        }

        public Builder setDestinations(Input<List<ReplicationConfigurationReplicationDestinationArgs>> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setDestinations(List<ReplicationConfigurationReplicationDestinationArgs> destinations) {
            this.destinations = Input.of(Objects.requireNonNull(destinations));
            return this;
        }

        public Builder setRepositoryFilters(@Nullable Input<List<ReplicationConfigurationRepositoryFilterArgs>> repositoryFilters) {
            this.repositoryFilters = repositoryFilters;
            return this;
        }

        public Builder setRepositoryFilters(@Nullable List<ReplicationConfigurationRepositoryFilterArgs> repositoryFilters) {
            this.repositoryFilters = Input.ofNullable(repositoryFilters);
            return this;
        }
        public ReplicationConfigurationReplicationRuleArgs build() {
            return new ReplicationConfigurationReplicationRuleArgs(destinations, repositoryFilters);
        }
    }
}
