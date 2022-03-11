// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowAmplitudeSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowDatadogSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowDynatraceSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowGoogleAnalyticsSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowInforNexusSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowMarketoSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowS3SourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSAPODataSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSalesforceSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowServiceNowSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSingularSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSlackSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowTrendmicroSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowVeevaSourcePropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowZendeskSourcePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Source connector details required to query a connector
 * 
 */
public final class FlowSourceConnectorPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSourceConnectorPropertiesArgs Empty = new FlowSourceConnectorPropertiesArgs();

    @InputImport(name="amplitude")
      private final @Nullable Output<FlowAmplitudeSourcePropertiesArgs> amplitude;

    public Output<FlowAmplitudeSourcePropertiesArgs> getAmplitude() {
        return this.amplitude == null ? Output.empty() : this.amplitude;
    }

    @InputImport(name="datadog")
      private final @Nullable Output<FlowDatadogSourcePropertiesArgs> datadog;

    public Output<FlowDatadogSourcePropertiesArgs> getDatadog() {
        return this.datadog == null ? Output.empty() : this.datadog;
    }

    @InputImport(name="dynatrace")
      private final @Nullable Output<FlowDynatraceSourcePropertiesArgs> dynatrace;

    public Output<FlowDynatraceSourcePropertiesArgs> getDynatrace() {
        return this.dynatrace == null ? Output.empty() : this.dynatrace;
    }

    @InputImport(name="googleAnalytics")
      private final @Nullable Output<FlowGoogleAnalyticsSourcePropertiesArgs> googleAnalytics;

    public Output<FlowGoogleAnalyticsSourcePropertiesArgs> getGoogleAnalytics() {
        return this.googleAnalytics == null ? Output.empty() : this.googleAnalytics;
    }

    @InputImport(name="inforNexus")
      private final @Nullable Output<FlowInforNexusSourcePropertiesArgs> inforNexus;

    public Output<FlowInforNexusSourcePropertiesArgs> getInforNexus() {
        return this.inforNexus == null ? Output.empty() : this.inforNexus;
    }

    @InputImport(name="marketo")
      private final @Nullable Output<FlowMarketoSourcePropertiesArgs> marketo;

    public Output<FlowMarketoSourcePropertiesArgs> getMarketo() {
        return this.marketo == null ? Output.empty() : this.marketo;
    }

    @InputImport(name="s3")
      private final @Nullable Output<FlowS3SourcePropertiesArgs> s3;

    public Output<FlowS3SourcePropertiesArgs> getS3() {
        return this.s3 == null ? Output.empty() : this.s3;
    }

    @InputImport(name="sAPOData")
      private final @Nullable Output<FlowSAPODataSourcePropertiesArgs> sAPOData;

    public Output<FlowSAPODataSourcePropertiesArgs> getSAPOData() {
        return this.sAPOData == null ? Output.empty() : this.sAPOData;
    }

    @InputImport(name="salesforce")
      private final @Nullable Output<FlowSalesforceSourcePropertiesArgs> salesforce;

    public Output<FlowSalesforceSourcePropertiesArgs> getSalesforce() {
        return this.salesforce == null ? Output.empty() : this.salesforce;
    }

    @InputImport(name="serviceNow")
      private final @Nullable Output<FlowServiceNowSourcePropertiesArgs> serviceNow;

    public Output<FlowServiceNowSourcePropertiesArgs> getServiceNow() {
        return this.serviceNow == null ? Output.empty() : this.serviceNow;
    }

    @InputImport(name="singular")
      private final @Nullable Output<FlowSingularSourcePropertiesArgs> singular;

    public Output<FlowSingularSourcePropertiesArgs> getSingular() {
        return this.singular == null ? Output.empty() : this.singular;
    }

    @InputImport(name="slack")
      private final @Nullable Output<FlowSlackSourcePropertiesArgs> slack;

    public Output<FlowSlackSourcePropertiesArgs> getSlack() {
        return this.slack == null ? Output.empty() : this.slack;
    }

    @InputImport(name="trendmicro")
      private final @Nullable Output<FlowTrendmicroSourcePropertiesArgs> trendmicro;

    public Output<FlowTrendmicroSourcePropertiesArgs> getTrendmicro() {
        return this.trendmicro == null ? Output.empty() : this.trendmicro;
    }

    @InputImport(name="veeva")
      private final @Nullable Output<FlowVeevaSourcePropertiesArgs> veeva;

    public Output<FlowVeevaSourcePropertiesArgs> getVeeva() {
        return this.veeva == null ? Output.empty() : this.veeva;
    }

    @InputImport(name="zendesk")
      private final @Nullable Output<FlowZendeskSourcePropertiesArgs> zendesk;

    public Output<FlowZendeskSourcePropertiesArgs> getZendesk() {
        return this.zendesk == null ? Output.empty() : this.zendesk;
    }

    public FlowSourceConnectorPropertiesArgs(
        @Nullable Output<FlowAmplitudeSourcePropertiesArgs> amplitude,
        @Nullable Output<FlowDatadogSourcePropertiesArgs> datadog,
        @Nullable Output<FlowDynatraceSourcePropertiesArgs> dynatrace,
        @Nullable Output<FlowGoogleAnalyticsSourcePropertiesArgs> googleAnalytics,
        @Nullable Output<FlowInforNexusSourcePropertiesArgs> inforNexus,
        @Nullable Output<FlowMarketoSourcePropertiesArgs> marketo,
        @Nullable Output<FlowS3SourcePropertiesArgs> s3,
        @Nullable Output<FlowSAPODataSourcePropertiesArgs> sAPOData,
        @Nullable Output<FlowSalesforceSourcePropertiesArgs> salesforce,
        @Nullable Output<FlowServiceNowSourcePropertiesArgs> serviceNow,
        @Nullable Output<FlowSingularSourcePropertiesArgs> singular,
        @Nullable Output<FlowSlackSourcePropertiesArgs> slack,
        @Nullable Output<FlowTrendmicroSourcePropertiesArgs> trendmicro,
        @Nullable Output<FlowVeevaSourcePropertiesArgs> veeva,
        @Nullable Output<FlowZendeskSourcePropertiesArgs> zendesk) {
        this.amplitude = amplitude;
        this.datadog = datadog;
        this.dynatrace = dynatrace;
        this.googleAnalytics = googleAnalytics;
        this.inforNexus = inforNexus;
        this.marketo = marketo;
        this.s3 = s3;
        this.sAPOData = sAPOData;
        this.salesforce = salesforce;
        this.serviceNow = serviceNow;
        this.singular = singular;
        this.slack = slack;
        this.trendmicro = trendmicro;
        this.veeva = veeva;
        this.zendesk = zendesk;
    }

    private FlowSourceConnectorPropertiesArgs() {
        this.amplitude = Output.empty();
        this.datadog = Output.empty();
        this.dynatrace = Output.empty();
        this.googleAnalytics = Output.empty();
        this.inforNexus = Output.empty();
        this.marketo = Output.empty();
        this.s3 = Output.empty();
        this.sAPOData = Output.empty();
        this.salesforce = Output.empty();
        this.serviceNow = Output.empty();
        this.singular = Output.empty();
        this.slack = Output.empty();
        this.trendmicro = Output.empty();
        this.veeva = Output.empty();
        this.zendesk = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceConnectorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowAmplitudeSourcePropertiesArgs> amplitude;
        private @Nullable Output<FlowDatadogSourcePropertiesArgs> datadog;
        private @Nullable Output<FlowDynatraceSourcePropertiesArgs> dynatrace;
        private @Nullable Output<FlowGoogleAnalyticsSourcePropertiesArgs> googleAnalytics;
        private @Nullable Output<FlowInforNexusSourcePropertiesArgs> inforNexus;
        private @Nullable Output<FlowMarketoSourcePropertiesArgs> marketo;
        private @Nullable Output<FlowS3SourcePropertiesArgs> s3;
        private @Nullable Output<FlowSAPODataSourcePropertiesArgs> sAPOData;
        private @Nullable Output<FlowSalesforceSourcePropertiesArgs> salesforce;
        private @Nullable Output<FlowServiceNowSourcePropertiesArgs> serviceNow;
        private @Nullable Output<FlowSingularSourcePropertiesArgs> singular;
        private @Nullable Output<FlowSlackSourcePropertiesArgs> slack;
        private @Nullable Output<FlowTrendmicroSourcePropertiesArgs> trendmicro;
        private @Nullable Output<FlowVeevaSourcePropertiesArgs> veeva;
        private @Nullable Output<FlowZendeskSourcePropertiesArgs> zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSourceConnectorPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amplitude = defaults.amplitude;
    	      this.datadog = defaults.datadog;
    	      this.dynatrace = defaults.dynatrace;
    	      this.googleAnalytics = defaults.googleAnalytics;
    	      this.inforNexus = defaults.inforNexus;
    	      this.marketo = defaults.marketo;
    	      this.s3 = defaults.s3;
    	      this.sAPOData = defaults.sAPOData;
    	      this.salesforce = defaults.salesforce;
    	      this.serviceNow = defaults.serviceNow;
    	      this.singular = defaults.singular;
    	      this.slack = defaults.slack;
    	      this.trendmicro = defaults.trendmicro;
    	      this.veeva = defaults.veeva;
    	      this.zendesk = defaults.zendesk;
        }

        public Builder amplitude(@Nullable Output<FlowAmplitudeSourcePropertiesArgs> amplitude) {
            this.amplitude = amplitude;
            return this;
        }

        public Builder amplitude(@Nullable FlowAmplitudeSourcePropertiesArgs amplitude) {
            this.amplitude = Output.ofNullable(amplitude);
            return this;
        }

        public Builder datadog(@Nullable Output<FlowDatadogSourcePropertiesArgs> datadog) {
            this.datadog = datadog;
            return this;
        }

        public Builder datadog(@Nullable FlowDatadogSourcePropertiesArgs datadog) {
            this.datadog = Output.ofNullable(datadog);
            return this;
        }

        public Builder dynatrace(@Nullable Output<FlowDynatraceSourcePropertiesArgs> dynatrace) {
            this.dynatrace = dynatrace;
            return this;
        }

        public Builder dynatrace(@Nullable FlowDynatraceSourcePropertiesArgs dynatrace) {
            this.dynatrace = Output.ofNullable(dynatrace);
            return this;
        }

        public Builder googleAnalytics(@Nullable Output<FlowGoogleAnalyticsSourcePropertiesArgs> googleAnalytics) {
            this.googleAnalytics = googleAnalytics;
            return this;
        }

        public Builder googleAnalytics(@Nullable FlowGoogleAnalyticsSourcePropertiesArgs googleAnalytics) {
            this.googleAnalytics = Output.ofNullable(googleAnalytics);
            return this;
        }

        public Builder inforNexus(@Nullable Output<FlowInforNexusSourcePropertiesArgs> inforNexus) {
            this.inforNexus = inforNexus;
            return this;
        }

        public Builder inforNexus(@Nullable FlowInforNexusSourcePropertiesArgs inforNexus) {
            this.inforNexus = Output.ofNullable(inforNexus);
            return this;
        }

        public Builder marketo(@Nullable Output<FlowMarketoSourcePropertiesArgs> marketo) {
            this.marketo = marketo;
            return this;
        }

        public Builder marketo(@Nullable FlowMarketoSourcePropertiesArgs marketo) {
            this.marketo = Output.ofNullable(marketo);
            return this;
        }

        public Builder s3(@Nullable Output<FlowS3SourcePropertiesArgs> s3) {
            this.s3 = s3;
            return this;
        }

        public Builder s3(@Nullable FlowS3SourcePropertiesArgs s3) {
            this.s3 = Output.ofNullable(s3);
            return this;
        }

        public Builder sAPOData(@Nullable Output<FlowSAPODataSourcePropertiesArgs> sAPOData) {
            this.sAPOData = sAPOData;
            return this;
        }

        public Builder sAPOData(@Nullable FlowSAPODataSourcePropertiesArgs sAPOData) {
            this.sAPOData = Output.ofNullable(sAPOData);
            return this;
        }

        public Builder salesforce(@Nullable Output<FlowSalesforceSourcePropertiesArgs> salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        public Builder salesforce(@Nullable FlowSalesforceSourcePropertiesArgs salesforce) {
            this.salesforce = Output.ofNullable(salesforce);
            return this;
        }

        public Builder serviceNow(@Nullable Output<FlowServiceNowSourcePropertiesArgs> serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }

        public Builder serviceNow(@Nullable FlowServiceNowSourcePropertiesArgs serviceNow) {
            this.serviceNow = Output.ofNullable(serviceNow);
            return this;
        }

        public Builder singular(@Nullable Output<FlowSingularSourcePropertiesArgs> singular) {
            this.singular = singular;
            return this;
        }

        public Builder singular(@Nullable FlowSingularSourcePropertiesArgs singular) {
            this.singular = Output.ofNullable(singular);
            return this;
        }

        public Builder slack(@Nullable Output<FlowSlackSourcePropertiesArgs> slack) {
            this.slack = slack;
            return this;
        }

        public Builder slack(@Nullable FlowSlackSourcePropertiesArgs slack) {
            this.slack = Output.ofNullable(slack);
            return this;
        }

        public Builder trendmicro(@Nullable Output<FlowTrendmicroSourcePropertiesArgs> trendmicro) {
            this.trendmicro = trendmicro;
            return this;
        }

        public Builder trendmicro(@Nullable FlowTrendmicroSourcePropertiesArgs trendmicro) {
            this.trendmicro = Output.ofNullable(trendmicro);
            return this;
        }

        public Builder veeva(@Nullable Output<FlowVeevaSourcePropertiesArgs> veeva) {
            this.veeva = veeva;
            return this;
        }

        public Builder veeva(@Nullable FlowVeevaSourcePropertiesArgs veeva) {
            this.veeva = Output.ofNullable(veeva);
            return this;
        }

        public Builder zendesk(@Nullable Output<FlowZendeskSourcePropertiesArgs> zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        public Builder zendesk(@Nullable FlowZendeskSourcePropertiesArgs zendesk) {
            this.zendesk = Output.ofNullable(zendesk);
            return this;
        }
        public FlowSourceConnectorPropertiesArgs build() {
            return new FlowSourceConnectorPropertiesArgs(amplitude, datadog, dynatrace, googleAnalytics, inforNexus, marketo, s3, sAPOData, salesforce, serviceNow, singular, slack, trendmicro, veeva, zendesk);
        }
    }
}
