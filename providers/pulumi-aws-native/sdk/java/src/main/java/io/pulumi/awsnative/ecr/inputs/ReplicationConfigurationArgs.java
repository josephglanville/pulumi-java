// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.inputs;

import io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationReplicationRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * An object representing the replication configuration for a registry.
 * 
 */
public final class ReplicationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationArgs Empty = new ReplicationConfigurationArgs();

    /**
     * An array of objects representing the replication rules for a replication configuration. A replication configuration may contain a maximum of 10 rules.
     * 
     */
    @InputImport(name="rules", required=true)
      private final Output<List<ReplicationConfigurationReplicationRuleArgs>> rules;

    public Output<List<ReplicationConfigurationReplicationRuleArgs>> getRules() {
        return this.rules;
    }

    public ReplicationConfigurationArgs(Output<List<ReplicationConfigurationReplicationRuleArgs>> rules) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private ReplicationConfigurationArgs() {
        this.rules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ReplicationConfigurationReplicationRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(Output<List<ReplicationConfigurationReplicationRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder rules(List<ReplicationConfigurationReplicationRuleArgs> rules) {
            this.rules = Output.of(Objects.requireNonNull(rules));
            return this;
        }
        public ReplicationConfigurationArgs build() {
            return new ReplicationConfigurationArgs(rules);
        }
    }
}
