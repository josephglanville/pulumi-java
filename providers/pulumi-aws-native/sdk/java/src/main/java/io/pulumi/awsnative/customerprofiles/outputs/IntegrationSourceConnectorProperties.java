// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.awsnative.customerprofiles.outputs.IntegrationMarketoSourceProperties;
import io.pulumi.awsnative.customerprofiles.outputs.IntegrationS3SourceProperties;
import io.pulumi.awsnative.customerprofiles.outputs.IntegrationSalesforceSourceProperties;
import io.pulumi.awsnative.customerprofiles.outputs.IntegrationServiceNowSourceProperties;
import io.pulumi.awsnative.customerprofiles.outputs.IntegrationZendeskSourceProperties;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationSourceConnectorProperties {
    private final @Nullable IntegrationMarketoSourceProperties marketo;
    private final @Nullable IntegrationS3SourceProperties s3;
    private final @Nullable IntegrationSalesforceSourceProperties salesforce;
    private final @Nullable IntegrationServiceNowSourceProperties serviceNow;
    private final @Nullable IntegrationZendeskSourceProperties zendesk;

    @OutputCustomType.Constructor({"marketo","s3","salesforce","serviceNow","zendesk"})
    private IntegrationSourceConnectorProperties(
        @Nullable IntegrationMarketoSourceProperties marketo,
        @Nullable IntegrationS3SourceProperties s3,
        @Nullable IntegrationSalesforceSourceProperties salesforce,
        @Nullable IntegrationServiceNowSourceProperties serviceNow,
        @Nullable IntegrationZendeskSourceProperties zendesk) {
        this.marketo = marketo;
        this.s3 = s3;
        this.salesforce = salesforce;
        this.serviceNow = serviceNow;
        this.zendesk = zendesk;
    }

    public Optional<IntegrationMarketoSourceProperties> getMarketo() {
        return Optional.ofNullable(this.marketo);
    }
    public Optional<IntegrationS3SourceProperties> getS3() {
        return Optional.ofNullable(this.s3);
    }
    public Optional<IntegrationSalesforceSourceProperties> getSalesforce() {
        return Optional.ofNullable(this.salesforce);
    }
    public Optional<IntegrationServiceNowSourceProperties> getServiceNow() {
        return Optional.ofNullable(this.serviceNow);
    }
    public Optional<IntegrationZendeskSourceProperties> getZendesk() {
        return Optional.ofNullable(this.zendesk);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationSourceConnectorProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationMarketoSourceProperties marketo;
        private @Nullable IntegrationS3SourceProperties s3;
        private @Nullable IntegrationSalesforceSourceProperties salesforce;
        private @Nullable IntegrationServiceNowSourceProperties serviceNow;
        private @Nullable IntegrationZendeskSourceProperties zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationSourceConnectorProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.marketo = defaults.marketo;
    	      this.s3 = defaults.s3;
    	      this.salesforce = defaults.salesforce;
    	      this.serviceNow = defaults.serviceNow;
    	      this.zendesk = defaults.zendesk;
        }

        public Builder setMarketo(@Nullable IntegrationMarketoSourceProperties marketo) {
            this.marketo = marketo;
            return this;
        }

        public Builder setS3(@Nullable IntegrationS3SourceProperties s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setSalesforce(@Nullable IntegrationSalesforceSourceProperties salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        public Builder setServiceNow(@Nullable IntegrationServiceNowSourceProperties serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }

        public Builder setZendesk(@Nullable IntegrationZendeskSourceProperties zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        public IntegrationSourceConnectorProperties build() {
            return new IntegrationSourceConnectorProperties(marketo, s3, salesforce, serviceNow, zendesk);
        }
    }
}