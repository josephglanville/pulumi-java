// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReplicationConfigurationReplicationConfigurationRuleDestination {
    /**
     * A Region to replicate to.
     * 
     */
    private final String region;
    /**
     * The account ID of the destination registry to replicate to.
     * 
     */
    private final String registryId;

    @OutputCustomType.Constructor
    private ReplicationConfigurationReplicationConfigurationRuleDestination(
        @OutputCustomType.Parameter("region") String region,
        @OutputCustomType.Parameter("registryId") String registryId) {
        this.region = region;
        this.registryId = registryId;
    }

    /**
     * A Region to replicate to.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * The account ID of the destination registry to replicate to.
     * 
    */
    public String getRegistryId() {
        return this.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationConfigurationRuleDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String region;
        private String registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationConfigurationRuleDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.registryId = defaults.registryId;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegistryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }
        public ReplicationConfigurationReplicationConfigurationRuleDestination build() {
            return new ReplicationConfigurationReplicationConfigurationRuleDestination(region, registryId);
        }
    }
}
