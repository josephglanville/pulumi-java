// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ReplicationConfigurationReplicationConfigurationRuleDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationReplicationConfigurationRuleDestinationArgs Empty = new ReplicationConfigurationReplicationConfigurationRuleDestinationArgs();

    /**
     * A Region to replicate to.
     * 
     */
    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    /**
     * The account ID of the destination registry to replicate to.
     * 
     */
    @Import(name="registryId", required=true)
      private final Output<String> registryId;

    public Output<String> getRegistryId() {
        return this.registryId;
    }

    public ReplicationConfigurationReplicationConfigurationRuleDestinationArgs(
        Output<String> region,
        Output<String> registryId) {
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.registryId = Objects.requireNonNull(registryId, "expected parameter 'registryId' to be non-null");
    }

    private ReplicationConfigurationReplicationConfigurationRuleDestinationArgs() {
        this.region = Codegen.empty();
        this.registryId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationConfigurationRuleDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> region;
        private Output<String> registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationConfigurationRuleDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.registryId = defaults.registryId;
        }

        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder registryId(Output<String> registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }
        public Builder registryId(String registryId) {
            this.registryId = Output.of(Objects.requireNonNull(registryId));
            return this;
        }        public ReplicationConfigurationReplicationConfigurationRuleDestinationArgs build() {
            return new ReplicationConfigurationReplicationConfigurationRuleDestinationArgs(region, registryId);
        }
    }
}
