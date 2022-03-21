// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ApplicationDeltaHealthPolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the delta health policies for the cluster upgrade.
 * 
 */
public final class ClusterUpgradeDeltaHealthPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterUpgradeDeltaHealthPolicyArgs Empty = new ClusterUpgradeDeltaHealthPolicyArgs();

    /**
     * Defines the application delta health policy map used to evaluate the health of an application or one of its child entities when upgrading the cluster.
     * 
     */
    @Import(name="applicationDeltaHealthPolicies")
      private final @Nullable Output<Map<String,ApplicationDeltaHealthPolicyArgs>> applicationDeltaHealthPolicies;

    public Output<Map<String,ApplicationDeltaHealthPolicyArgs>> getApplicationDeltaHealthPolicies() {
        return this.applicationDeltaHealthPolicies == null ? Output.empty() : this.applicationDeltaHealthPolicies;
    }

    /**
     * The maximum allowed percentage of applications health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the applications at the beginning of upgrade and the state of the applications at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits. System services are not included in this.
     * 
     */
    @Import(name="maxPercentDeltaUnhealthyApplications", required=true)
      private final Output<Integer> maxPercentDeltaUnhealthyApplications;

    public Output<Integer> getMaxPercentDeltaUnhealthyApplications() {
        return this.maxPercentDeltaUnhealthyApplications;
    }

    /**
     * The maximum allowed percentage of nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the nodes at the beginning of upgrade and the state of the nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits.
     * 
     */
    @Import(name="maxPercentDeltaUnhealthyNodes", required=true)
      private final Output<Integer> maxPercentDeltaUnhealthyNodes;

    public Output<Integer> getMaxPercentDeltaUnhealthyNodes() {
        return this.maxPercentDeltaUnhealthyNodes;
    }

    /**
     * The maximum allowed percentage of upgrade domain nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the upgrade domain nodes at the beginning of upgrade and the state of the upgrade domain nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion for all completed upgrade domains to make sure the state of the upgrade domains is within tolerated limits.
     * 
     */
    @Import(name="maxPercentUpgradeDomainDeltaUnhealthyNodes", required=true)
      private final Output<Integer> maxPercentUpgradeDomainDeltaUnhealthyNodes;

    public Output<Integer> getMaxPercentUpgradeDomainDeltaUnhealthyNodes() {
        return this.maxPercentUpgradeDomainDeltaUnhealthyNodes;
    }

    public ClusterUpgradeDeltaHealthPolicyArgs(
        @Nullable Output<Map<String,ApplicationDeltaHealthPolicyArgs>> applicationDeltaHealthPolicies,
        Output<Integer> maxPercentDeltaUnhealthyApplications,
        Output<Integer> maxPercentDeltaUnhealthyNodes,
        Output<Integer> maxPercentUpgradeDomainDeltaUnhealthyNodes) {
        this.applicationDeltaHealthPolicies = applicationDeltaHealthPolicies;
        this.maxPercentDeltaUnhealthyApplications = Objects.requireNonNull(maxPercentDeltaUnhealthyApplications, "expected parameter 'maxPercentDeltaUnhealthyApplications' to be non-null");
        this.maxPercentDeltaUnhealthyNodes = Objects.requireNonNull(maxPercentDeltaUnhealthyNodes, "expected parameter 'maxPercentDeltaUnhealthyNodes' to be non-null");
        this.maxPercentUpgradeDomainDeltaUnhealthyNodes = Objects.requireNonNull(maxPercentUpgradeDomainDeltaUnhealthyNodes, "expected parameter 'maxPercentUpgradeDomainDeltaUnhealthyNodes' to be non-null");
    }

    private ClusterUpgradeDeltaHealthPolicyArgs() {
        this.applicationDeltaHealthPolicies = Output.empty();
        this.maxPercentDeltaUnhealthyApplications = Output.empty();
        this.maxPercentDeltaUnhealthyNodes = Output.empty();
        this.maxPercentUpgradeDomainDeltaUnhealthyNodes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterUpgradeDeltaHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,ApplicationDeltaHealthPolicyArgs>> applicationDeltaHealthPolicies;
        private Output<Integer> maxPercentDeltaUnhealthyApplications;
        private Output<Integer> maxPercentDeltaUnhealthyNodes;
        private Output<Integer> maxPercentUpgradeDomainDeltaUnhealthyNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterUpgradeDeltaHealthPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationDeltaHealthPolicies = defaults.applicationDeltaHealthPolicies;
    	      this.maxPercentDeltaUnhealthyApplications = defaults.maxPercentDeltaUnhealthyApplications;
    	      this.maxPercentDeltaUnhealthyNodes = defaults.maxPercentDeltaUnhealthyNodes;
    	      this.maxPercentUpgradeDomainDeltaUnhealthyNodes = defaults.maxPercentUpgradeDomainDeltaUnhealthyNodes;
        }

        public Builder applicationDeltaHealthPolicies(@Nullable Output<Map<String,ApplicationDeltaHealthPolicyArgs>> applicationDeltaHealthPolicies) {
            this.applicationDeltaHealthPolicies = applicationDeltaHealthPolicies;
            return this;
        }
        public Builder applicationDeltaHealthPolicies(@Nullable Map<String,ApplicationDeltaHealthPolicyArgs> applicationDeltaHealthPolicies) {
            this.applicationDeltaHealthPolicies = Output.ofNullable(applicationDeltaHealthPolicies);
            return this;
        }
        public Builder maxPercentDeltaUnhealthyApplications(Output<Integer> maxPercentDeltaUnhealthyApplications) {
            this.maxPercentDeltaUnhealthyApplications = Objects.requireNonNull(maxPercentDeltaUnhealthyApplications);
            return this;
        }
        public Builder maxPercentDeltaUnhealthyApplications(Integer maxPercentDeltaUnhealthyApplications) {
            this.maxPercentDeltaUnhealthyApplications = Output.of(Objects.requireNonNull(maxPercentDeltaUnhealthyApplications));
            return this;
        }
        public Builder maxPercentDeltaUnhealthyNodes(Output<Integer> maxPercentDeltaUnhealthyNodes) {
            this.maxPercentDeltaUnhealthyNodes = Objects.requireNonNull(maxPercentDeltaUnhealthyNodes);
            return this;
        }
        public Builder maxPercentDeltaUnhealthyNodes(Integer maxPercentDeltaUnhealthyNodes) {
            this.maxPercentDeltaUnhealthyNodes = Output.of(Objects.requireNonNull(maxPercentDeltaUnhealthyNodes));
            return this;
        }
        public Builder maxPercentUpgradeDomainDeltaUnhealthyNodes(Output<Integer> maxPercentUpgradeDomainDeltaUnhealthyNodes) {
            this.maxPercentUpgradeDomainDeltaUnhealthyNodes = Objects.requireNonNull(maxPercentUpgradeDomainDeltaUnhealthyNodes);
            return this;
        }
        public Builder maxPercentUpgradeDomainDeltaUnhealthyNodes(Integer maxPercentUpgradeDomainDeltaUnhealthyNodes) {
            this.maxPercentUpgradeDomainDeltaUnhealthyNodes = Output.of(Objects.requireNonNull(maxPercentUpgradeDomainDeltaUnhealthyNodes));
            return this;
        }        public ClusterUpgradeDeltaHealthPolicyArgs build() {
            return new ClusterUpgradeDeltaHealthPolicyArgs(applicationDeltaHealthPolicies, maxPercentDeltaUnhealthyApplications, maxPercentDeltaUnhealthyNodes, maxPercentUpgradeDomainDeltaUnhealthyNodes);
        }
    }
}
