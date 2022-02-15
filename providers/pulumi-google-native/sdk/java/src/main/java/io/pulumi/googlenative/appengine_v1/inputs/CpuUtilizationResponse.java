// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class CpuUtilizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CpuUtilizationResponse Empty = new CpuUtilizationResponse();

    @InputImport(name="aggregationWindowLength", required=true)
    private final String aggregationWindowLength;

    public String getAggregationWindowLength() {
        return this.aggregationWindowLength;
    }

    @InputImport(name="targetUtilization", required=true)
    private final Double targetUtilization;

    public Double getTargetUtilization() {
        return this.targetUtilization;
    }

    public CpuUtilizationResponse(
        String aggregationWindowLength,
        Double targetUtilization) {
        this.aggregationWindowLength = Objects.requireNonNull(aggregationWindowLength, "expected parameter 'aggregationWindowLength' to be non-null");
        this.targetUtilization = Objects.requireNonNull(targetUtilization, "expected parameter 'targetUtilization' to be non-null");
    }

    private CpuUtilizationResponse() {
        this.aggregationWindowLength = null;
        this.targetUtilization = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CpuUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregationWindowLength;
        private Double targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(CpuUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationWindowLength = defaults.aggregationWindowLength;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder setAggregationWindowLength(String aggregationWindowLength) {
            this.aggregationWindowLength = Objects.requireNonNull(aggregationWindowLength);
            return this;
        }

        public Builder setTargetUtilization(Double targetUtilization) {
            this.targetUtilization = Objects.requireNonNull(targetUtilization);
            return this;
        }

        public CpuUtilizationResponse build() {
            return new CpuUtilizationResponse(aggregationWindowLength, targetUtilization);
        }
    }
}