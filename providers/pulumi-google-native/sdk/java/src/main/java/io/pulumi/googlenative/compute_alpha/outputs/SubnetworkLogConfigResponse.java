// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SubnetworkLogConfigResponse {
    private final String aggregationInterval;
    private final Boolean enable;
    private final String filterExpr;
    private final Double flowSampling;
    private final String metadata;
    private final List<String> metadataFields;

    @OutputCustomType.Constructor({"aggregationInterval","enable","filterExpr","flowSampling","metadata","metadataFields"})
    private SubnetworkLogConfigResponse(
        String aggregationInterval,
        Boolean enable,
        String filterExpr,
        Double flowSampling,
        String metadata,
        List<String> metadataFields) {
        this.aggregationInterval = Objects.requireNonNull(aggregationInterval);
        this.enable = Objects.requireNonNull(enable);
        this.filterExpr = Objects.requireNonNull(filterExpr);
        this.flowSampling = Objects.requireNonNull(flowSampling);
        this.metadata = Objects.requireNonNull(metadata);
        this.metadataFields = Objects.requireNonNull(metadataFields);
    }

    public String getAggregationInterval() {
        return this.aggregationInterval;
    }
    public Boolean getEnable() {
        return this.enable;
    }
    public String getFilterExpr() {
        return this.filterExpr;
    }
    public Double getFlowSampling() {
        return this.flowSampling;
    }
    public String getMetadata() {
        return this.metadata;
    }
    public List<String> getMetadataFields() {
        return this.metadataFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregationInterval;
        private Boolean enable;
        private String filterExpr;
        private Double flowSampling;
        private String metadata;
        private List<String> metadataFields;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationInterval = defaults.aggregationInterval;
    	      this.enable = defaults.enable;
    	      this.filterExpr = defaults.filterExpr;
    	      this.flowSampling = defaults.flowSampling;
    	      this.metadata = defaults.metadata;
    	      this.metadataFields = defaults.metadataFields;
        }

        public Builder setAggregationInterval(String aggregationInterval) {
            this.aggregationInterval = Objects.requireNonNull(aggregationInterval);
            return this;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setFilterExpr(String filterExpr) {
            this.filterExpr = Objects.requireNonNull(filterExpr);
            return this;
        }

        public Builder setFlowSampling(Double flowSampling) {
            this.flowSampling = Objects.requireNonNull(flowSampling);
            return this;
        }

        public Builder setMetadata(String metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setMetadataFields(List<String> metadataFields) {
            this.metadataFields = Objects.requireNonNull(metadataFields);
            return this;
        }

        public SubnetworkLogConfigResponse build() {
            return new SubnetworkLogConfigResponse(aggregationInterval, enable, filterExpr, flowSampling, metadata, metadataFields);
        }
    }
}