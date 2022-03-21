// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.enums.FlowConnectorType;
import io.pulumi.awsnative.appflow.outputs.FlowIncrementalPullConfig;
import io.pulumi.awsnative.appflow.outputs.FlowSourceConnectorProperties;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowSourceFlowConfig {
    /**
     * Name of source connector profile
     * 
     */
    private final @Nullable String connectorProfileName;
    /**
     * Type of source connector
     * 
     */
    private final FlowConnectorType connectorType;
    /**
     * Configuration for scheduled incremental data pull
     * 
     */
    private final @Nullable FlowIncrementalPullConfig incrementalPullConfig;
    /**
     * Source connector details required to query a connector
     * 
     */
    private final FlowSourceConnectorProperties sourceConnectorProperties;

    @CustomType.Constructor
    private FlowSourceFlowConfig(
        @CustomType.Parameter("connectorProfileName") @Nullable String connectorProfileName,
        @CustomType.Parameter("connectorType") FlowConnectorType connectorType,
        @CustomType.Parameter("incrementalPullConfig") @Nullable FlowIncrementalPullConfig incrementalPullConfig,
        @CustomType.Parameter("sourceConnectorProperties") FlowSourceConnectorProperties sourceConnectorProperties) {
        this.connectorProfileName = connectorProfileName;
        this.connectorType = connectorType;
        this.incrementalPullConfig = incrementalPullConfig;
        this.sourceConnectorProperties = sourceConnectorProperties;
    }

    /**
     * Name of source connector profile
     * 
    */
    public Optional<String> getConnectorProfileName() {
        return Optional.ofNullable(this.connectorProfileName);
    }
    /**
     * Type of source connector
     * 
    */
    public FlowConnectorType getConnectorType() {
        return this.connectorType;
    }
    /**
     * Configuration for scheduled incremental data pull
     * 
    */
    public Optional<FlowIncrementalPullConfig> getIncrementalPullConfig() {
        return Optional.ofNullable(this.incrementalPullConfig);
    }
    /**
     * Source connector details required to query a connector
     * 
    */
    public FlowSourceConnectorProperties getSourceConnectorProperties() {
        return this.sourceConnectorProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceFlowConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectorProfileName;
        private FlowConnectorType connectorType;
        private @Nullable FlowIncrementalPullConfig incrementalPullConfig;
        private FlowSourceConnectorProperties sourceConnectorProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSourceFlowConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorProfileName = defaults.connectorProfileName;
    	      this.connectorType = defaults.connectorType;
    	      this.incrementalPullConfig = defaults.incrementalPullConfig;
    	      this.sourceConnectorProperties = defaults.sourceConnectorProperties;
        }

        public Builder connectorProfileName(@Nullable String connectorProfileName) {
            this.connectorProfileName = connectorProfileName;
            return this;
        }
        public Builder connectorType(FlowConnectorType connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }
        public Builder incrementalPullConfig(@Nullable FlowIncrementalPullConfig incrementalPullConfig) {
            this.incrementalPullConfig = incrementalPullConfig;
            return this;
        }
        public Builder sourceConnectorProperties(FlowSourceConnectorProperties sourceConnectorProperties) {
            this.sourceConnectorProperties = Objects.requireNonNull(sourceConnectorProperties);
            return this;
        }        public FlowSourceFlowConfig build() {
            return new FlowSourceFlowConfig(connectorProfileName, connectorType, incrementalPullConfig, sourceConnectorProperties);
        }
    }
}
