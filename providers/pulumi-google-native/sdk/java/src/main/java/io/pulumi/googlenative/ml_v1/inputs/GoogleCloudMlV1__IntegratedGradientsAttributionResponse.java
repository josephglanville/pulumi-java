// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class GoogleCloudMlV1__IntegratedGradientsAttributionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__IntegratedGradientsAttributionResponse Empty = new GoogleCloudMlV1__IntegratedGradientsAttributionResponse();

    @InputImport(name="numIntegralSteps", required=true)
    private final Integer numIntegralSteps;

    public Integer getNumIntegralSteps() {
        return this.numIntegralSteps;
    }

    public GoogleCloudMlV1__IntegratedGradientsAttributionResponse(Integer numIntegralSteps) {
        this.numIntegralSteps = Objects.requireNonNull(numIntegralSteps, "expected parameter 'numIntegralSteps' to be non-null");
    }

    private GoogleCloudMlV1__IntegratedGradientsAttributionResponse() {
        this.numIntegralSteps = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__IntegratedGradientsAttributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numIntegralSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__IntegratedGradientsAttributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numIntegralSteps = defaults.numIntegralSteps;
        }

        public Builder setNumIntegralSteps(Integer numIntegralSteps) {
            this.numIntegralSteps = Objects.requireNonNull(numIntegralSteps);
            return this;
        }

        public GoogleCloudMlV1__IntegratedGradientsAttributionResponse build() {
            return new GoogleCloudMlV1__IntegratedGradientsAttributionResponse(numIntegralSteps);
        }
    }
}