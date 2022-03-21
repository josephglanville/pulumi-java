// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__IntegratedGradientsAttributionResponse;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__SampledShapleyAttributionResponse;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__XraiAttributionResponse;
import java.util.Objects;


/**
 * Message holding configuration options for explaining model predictions. There are three feature attribution methods supported for TensorFlow models: integrated gradients, sampled Shapley, and XRAI. [Learn more about feature attributions.](/ai-platform/prediction/docs/ai-explanations/overview)
 * 
 */
public final class GoogleCloudMlV1__ExplanationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__ExplanationConfigResponse Empty = new GoogleCloudMlV1__ExplanationConfigResponse();

    /**
     * Attributes credit by computing the Aumann-Shapley value taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1703.01365
     * 
     */
    @Import(name="integratedGradientsAttribution", required=true)
      private final GoogleCloudMlV1__IntegratedGradientsAttributionResponse integratedGradientsAttribution;

    public GoogleCloudMlV1__IntegratedGradientsAttributionResponse getIntegratedGradientsAttribution() {
        return this.integratedGradientsAttribution;
    }

    /**
     * An attribution method that approximates Shapley values for features that contribute to the label being predicted. A sampling strategy is used to approximate the value rather than considering all subsets of features.
     * 
     */
    @Import(name="sampledShapleyAttribution", required=true)
      private final GoogleCloudMlV1__SampledShapleyAttributionResponse sampledShapleyAttribution;

    public GoogleCloudMlV1__SampledShapleyAttributionResponse getSampledShapleyAttribution() {
        return this.sampledShapleyAttribution;
    }

    /**
     * Attributes credit by computing the XRAI taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1906.02825 Currently only implemented for models with natural image inputs.
     * 
     */
    @Import(name="xraiAttribution", required=true)
      private final GoogleCloudMlV1__XraiAttributionResponse xraiAttribution;

    public GoogleCloudMlV1__XraiAttributionResponse getXraiAttribution() {
        return this.xraiAttribution;
    }

    public GoogleCloudMlV1__ExplanationConfigResponse(
        GoogleCloudMlV1__IntegratedGradientsAttributionResponse integratedGradientsAttribution,
        GoogleCloudMlV1__SampledShapleyAttributionResponse sampledShapleyAttribution,
        GoogleCloudMlV1__XraiAttributionResponse xraiAttribution) {
        this.integratedGradientsAttribution = Objects.requireNonNull(integratedGradientsAttribution, "expected parameter 'integratedGradientsAttribution' to be non-null");
        this.sampledShapleyAttribution = Objects.requireNonNull(sampledShapleyAttribution, "expected parameter 'sampledShapleyAttribution' to be non-null");
        this.xraiAttribution = Objects.requireNonNull(xraiAttribution, "expected parameter 'xraiAttribution' to be non-null");
    }

    private GoogleCloudMlV1__ExplanationConfigResponse() {
        this.integratedGradientsAttribution = null;
        this.sampledShapleyAttribution = null;
        this.xraiAttribution = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ExplanationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__IntegratedGradientsAttributionResponse integratedGradientsAttribution;
        private GoogleCloudMlV1__SampledShapleyAttributionResponse sampledShapleyAttribution;
        private GoogleCloudMlV1__XraiAttributionResponse xraiAttribution;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ExplanationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integratedGradientsAttribution = defaults.integratedGradientsAttribution;
    	      this.sampledShapleyAttribution = defaults.sampledShapleyAttribution;
    	      this.xraiAttribution = defaults.xraiAttribution;
        }

        public Builder integratedGradientsAttribution(GoogleCloudMlV1__IntegratedGradientsAttributionResponse integratedGradientsAttribution) {
            this.integratedGradientsAttribution = Objects.requireNonNull(integratedGradientsAttribution);
            return this;
        }
        public Builder sampledShapleyAttribution(GoogleCloudMlV1__SampledShapleyAttributionResponse sampledShapleyAttribution) {
            this.sampledShapleyAttribution = Objects.requireNonNull(sampledShapleyAttribution);
            return this;
        }
        public Builder xraiAttribution(GoogleCloudMlV1__XraiAttributionResponse xraiAttribution) {
            this.xraiAttribution = Objects.requireNonNull(xraiAttribution);
            return this;
        }        public GoogleCloudMlV1__ExplanationConfigResponse build() {
            return new GoogleCloudMlV1__ExplanationConfigResponse(integratedGradientsAttribution, sampledShapleyAttribution, xraiAttribution);
        }
    }
}
