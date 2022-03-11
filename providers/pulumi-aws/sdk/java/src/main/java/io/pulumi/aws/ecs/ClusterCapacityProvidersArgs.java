// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.ecs.inputs.ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterCapacityProvidersArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCapacityProvidersArgs Empty = new ClusterCapacityProvidersArgs();

    /**
     * Set of names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
     * 
     */
    @InputImport(name="capacityProviders")
      private final @Nullable Output<List<String>> capacityProviders;

    public Output<List<String>> getCapacityProviders() {
        return this.capacityProviders == null ? Output.empty() : this.capacityProviders;
    }

    /**
     * Name of the ECS cluster to manage capacity providers for.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * Set of capacity provider strategies to use by default for the cluster. Detailed below.
     * 
     */
    @InputImport(name="defaultCapacityProviderStrategies")
      private final @Nullable Output<List<ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs>> defaultCapacityProviderStrategies;

    public Output<List<ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs>> getDefaultCapacityProviderStrategies() {
        return this.defaultCapacityProviderStrategies == null ? Output.empty() : this.defaultCapacityProviderStrategies;
    }

    public ClusterCapacityProvidersArgs(
        @Nullable Output<List<String>> capacityProviders,
        Output<String> clusterName,
        @Nullable Output<List<ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs>> defaultCapacityProviderStrategies) {
        this.capacityProviders = capacityProviders;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.defaultCapacityProviderStrategies = defaultCapacityProviderStrategies;
    }

    private ClusterCapacityProvidersArgs() {
        this.capacityProviders = Output.empty();
        this.clusterName = Output.empty();
        this.defaultCapacityProviderStrategies = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCapacityProvidersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> capacityProviders;
        private Output<String> clusterName;
        private @Nullable Output<List<ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs>> defaultCapacityProviderStrategies;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCapacityProvidersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityProviders = defaults.capacityProviders;
    	      this.clusterName = defaults.clusterName;
    	      this.defaultCapacityProviderStrategies = defaults.defaultCapacityProviderStrategies;
        }

        public Builder capacityProviders(@Nullable Output<List<String>> capacityProviders) {
            this.capacityProviders = capacityProviders;
            return this;
        }

        public Builder capacityProviders(@Nullable List<String> capacityProviders) {
            this.capacityProviders = Output.ofNullable(capacityProviders);
            return this;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder defaultCapacityProviderStrategies(@Nullable Output<List<ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs>> defaultCapacityProviderStrategies) {
            this.defaultCapacityProviderStrategies = defaultCapacityProviderStrategies;
            return this;
        }

        public Builder defaultCapacityProviderStrategies(@Nullable List<ClusterCapacityProvidersDefaultCapacityProviderStrategyArgs> defaultCapacityProviderStrategies) {
            this.defaultCapacityProviderStrategies = Output.ofNullable(defaultCapacityProviderStrategies);
            return this;
        }
        public ClusterCapacityProvidersArgs build() {
            return new ClusterCapacityProvidersArgs(capacityProviders, clusterName, defaultCapacityProviderStrategies);
        }
    }
}
