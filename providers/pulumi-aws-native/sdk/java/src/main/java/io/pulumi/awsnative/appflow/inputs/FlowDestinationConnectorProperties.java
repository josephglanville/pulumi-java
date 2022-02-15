// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowEventBridgeDestinationProperties;
import io.pulumi.awsnative.appflow.inputs.FlowLookoutMetricsDestinationProperties;
import io.pulumi.awsnative.appflow.inputs.FlowRedshiftDestinationProperties;
import io.pulumi.awsnative.appflow.inputs.FlowS3DestinationProperties;
import io.pulumi.awsnative.appflow.inputs.FlowSalesforceDestinationProperties;
import io.pulumi.awsnative.appflow.inputs.FlowSnowflakeDestinationProperties;
import io.pulumi.awsnative.appflow.inputs.FlowUpsolverDestinationProperties;
import io.pulumi.awsnative.appflow.inputs.FlowZendeskDestinationProperties;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowDestinationConnectorProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowDestinationConnectorProperties Empty = new FlowDestinationConnectorProperties();

    @InputImport(name="eventBridge")
    private final @Nullable FlowEventBridgeDestinationProperties eventBridge;

    public Optional<FlowEventBridgeDestinationProperties> getEventBridge() {
        return this.eventBridge == null ? Optional.empty() : Optional.ofNullable(this.eventBridge);
    }

    @InputImport(name="lookoutMetrics")
    private final @Nullable FlowLookoutMetricsDestinationProperties lookoutMetrics;

    public Optional<FlowLookoutMetricsDestinationProperties> getLookoutMetrics() {
        return this.lookoutMetrics == null ? Optional.empty() : Optional.ofNullable(this.lookoutMetrics);
    }

    @InputImport(name="redshift")
    private final @Nullable FlowRedshiftDestinationProperties redshift;

    public Optional<FlowRedshiftDestinationProperties> getRedshift() {
        return this.redshift == null ? Optional.empty() : Optional.ofNullable(this.redshift);
    }

    @InputImport(name="s3")
    private final @Nullable FlowS3DestinationProperties s3;

    public Optional<FlowS3DestinationProperties> getS3() {
        return this.s3 == null ? Optional.empty() : Optional.ofNullable(this.s3);
    }

    @InputImport(name="salesforce")
    private final @Nullable FlowSalesforceDestinationProperties salesforce;

    public Optional<FlowSalesforceDestinationProperties> getSalesforce() {
        return this.salesforce == null ? Optional.empty() : Optional.ofNullable(this.salesforce);
    }

    @InputImport(name="snowflake")
    private final @Nullable FlowSnowflakeDestinationProperties snowflake;

    public Optional<FlowSnowflakeDestinationProperties> getSnowflake() {
        return this.snowflake == null ? Optional.empty() : Optional.ofNullable(this.snowflake);
    }

    @InputImport(name="upsolver")
    private final @Nullable FlowUpsolverDestinationProperties upsolver;

    public Optional<FlowUpsolverDestinationProperties> getUpsolver() {
        return this.upsolver == null ? Optional.empty() : Optional.ofNullable(this.upsolver);
    }

    @InputImport(name="zendesk")
    private final @Nullable FlowZendeskDestinationProperties zendesk;

    public Optional<FlowZendeskDestinationProperties> getZendesk() {
        return this.zendesk == null ? Optional.empty() : Optional.ofNullable(this.zendesk);
    }

    public FlowDestinationConnectorProperties(
        @Nullable FlowEventBridgeDestinationProperties eventBridge,
        @Nullable FlowLookoutMetricsDestinationProperties lookoutMetrics,
        @Nullable FlowRedshiftDestinationProperties redshift,
        @Nullable FlowS3DestinationProperties s3,
        @Nullable FlowSalesforceDestinationProperties salesforce,
        @Nullable FlowSnowflakeDestinationProperties snowflake,
        @Nullable FlowUpsolverDestinationProperties upsolver,
        @Nullable FlowZendeskDestinationProperties zendesk) {
        this.eventBridge = eventBridge;
        this.lookoutMetrics = lookoutMetrics;
        this.redshift = redshift;
        this.s3 = s3;
        this.salesforce = salesforce;
        this.snowflake = snowflake;
        this.upsolver = upsolver;
        this.zendesk = zendesk;
    }

    private FlowDestinationConnectorProperties() {
        this.eventBridge = null;
        this.lookoutMetrics = null;
        this.redshift = null;
        this.s3 = null;
        this.salesforce = null;
        this.snowflake = null;
        this.upsolver = null;
        this.zendesk = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationConnectorProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowEventBridgeDestinationProperties eventBridge;
        private @Nullable FlowLookoutMetricsDestinationProperties lookoutMetrics;
        private @Nullable FlowRedshiftDestinationProperties redshift;
        private @Nullable FlowS3DestinationProperties s3;
        private @Nullable FlowSalesforceDestinationProperties salesforce;
        private @Nullable FlowSnowflakeDestinationProperties snowflake;
        private @Nullable FlowUpsolverDestinationProperties upsolver;
        private @Nullable FlowZendeskDestinationProperties zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDestinationConnectorProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventBridge = defaults.eventBridge;
    	      this.lookoutMetrics = defaults.lookoutMetrics;
    	      this.redshift = defaults.redshift;
    	      this.s3 = defaults.s3;
    	      this.salesforce = defaults.salesforce;
    	      this.snowflake = defaults.snowflake;
    	      this.upsolver = defaults.upsolver;
    	      this.zendesk = defaults.zendesk;
        }

        public Builder setEventBridge(@Nullable FlowEventBridgeDestinationProperties eventBridge) {
            this.eventBridge = eventBridge;
            return this;
        }

        public Builder setLookoutMetrics(@Nullable FlowLookoutMetricsDestinationProperties lookoutMetrics) {
            this.lookoutMetrics = lookoutMetrics;
            return this;
        }

        public Builder setRedshift(@Nullable FlowRedshiftDestinationProperties redshift) {
            this.redshift = redshift;
            return this;
        }

        public Builder setS3(@Nullable FlowS3DestinationProperties s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setSalesforce(@Nullable FlowSalesforceDestinationProperties salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        public Builder setSnowflake(@Nullable FlowSnowflakeDestinationProperties snowflake) {
            this.snowflake = snowflake;
            return this;
        }

        public Builder setUpsolver(@Nullable FlowUpsolverDestinationProperties upsolver) {
            this.upsolver = upsolver;
            return this;
        }

        public Builder setZendesk(@Nullable FlowZendeskDestinationProperties zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        public FlowDestinationConnectorProperties build() {
            return new FlowDestinationConnectorProperties(eventBridge, lookoutMetrics, redshift, s3, salesforce, snowflake, upsolver, zendesk);
        }
    }
}