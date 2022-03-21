// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__IntegratedGradientsAttributionArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__SampledShapleyAttributionArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__XraiAttributionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message holding configuration options for explaining model predictions. There are three feature attribution methods supported for TensorFlow models: integrated gradients, sampled Shapley, and XRAI. [Learn more about feature attributions.](/ai-platform/prediction/docs/ai-explanations/overview)
 * 
 */
public final class GoogleCloudMlV1__ExplanationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__ExplanationConfigArgs Empty = new GoogleCloudMlV1__ExplanationConfigArgs();

    /**
     * Attributes credit by computing the Aumann-Shapley value taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1703.01365
     * 
     */
    @Import(name="integratedGradientsAttribution")
      private final @Nullable Output<GoogleCloudMlV1__IntegratedGradientsAttributionArgs> integratedGradientsAttribution;

    public Output<GoogleCloudMlV1__IntegratedGradientsAttributionArgs> getIntegratedGradientsAttribution() {
        return this.integratedGradientsAttribution == null ? Output.empty() : this.integratedGradientsAttribution;
    }

    /**
     * An attribution method that approximates Shapley values for features that contribute to the label being predicted. A sampling strategy is used to approximate the value rather than considering all subsets of features.
     * 
     */
    @Import(name="sampledShapleyAttribution")
      private final @Nullable Output<GoogleCloudMlV1__SampledShapleyAttributionArgs> sampledShapleyAttribution;

    public Output<GoogleCloudMlV1__SampledShapleyAttributionArgs> getSampledShapleyAttribution() {
        return this.sampledShapleyAttribution == null ? Output.empty() : this.sampledShapleyAttribution;
    }

    /**
     * Attributes credit by computing the XRAI taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1906.02825 Currently only implemented for models with natural image inputs.
     * 
     */
    @Import(name="xraiAttribution")
      private final @Nullable Output<GoogleCloudMlV1__XraiAttributionArgs> xraiAttribution;

    public Output<GoogleCloudMlV1__XraiAttributionArgs> getXraiAttribution() {
        return this.xraiAttribution == null ? Output.empty() : this.xraiAttribution;
    }

    public GoogleCloudMlV1__ExplanationConfigArgs(
        @Nullable Output<GoogleCloudMlV1__IntegratedGradientsAttributionArgs> integratedGradientsAttribution,
        @Nullable Output<GoogleCloudMlV1__SampledShapleyAttributionArgs> sampledShapleyAttribution,
        @Nullable Output<GoogleCloudMlV1__XraiAttributionArgs> xraiAttribution) {
        this.integratedGradientsAttribution = integratedGradientsAttribution;
        this.sampledShapleyAttribution = sampledShapleyAttribution;
        this.xraiAttribution = xraiAttribution;
    }

    private GoogleCloudMlV1__ExplanationConfigArgs() {
        this.integratedGradientsAttribution = Output.empty();
        this.sampledShapleyAttribution = Output.empty();
        this.xraiAttribution = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ExplanationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudMlV1__IntegratedGradientsAttributionArgs> integratedGradientsAttribution;
        private @Nullable Output<GoogleCloudMlV1__SampledShapleyAttributionArgs> sampledShapleyAttribution;
        private @Nullable Output<GoogleCloudMlV1__XraiAttributionArgs> xraiAttribution;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ExplanationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integratedGradientsAttribution = defaults.integratedGradientsAttribution;
    	      this.sampledShapleyAttribution = defaults.sampledShapleyAttribution;
    	      this.xraiAttribution = defaults.xraiAttribution;
        }

        public Builder integratedGradientsAttribution(@Nullable Output<GoogleCloudMlV1__IntegratedGradientsAttributionArgs> integratedGradientsAttribution) {
            this.integratedGradientsAttribution = integratedGradientsAttribution;
            return this;
        }
        public Builder integratedGradientsAttribution(@Nullable GoogleCloudMlV1__IntegratedGradientsAttributionArgs integratedGradientsAttribution) {
            this.integratedGradientsAttribution = Output.ofNullable(integratedGradientsAttribution);
            return this;
        }
        public Builder sampledShapleyAttribution(@Nullable Output<GoogleCloudMlV1__SampledShapleyAttributionArgs> sampledShapleyAttribution) {
            this.sampledShapleyAttribution = sampledShapleyAttribution;
            return this;
        }
        public Builder sampledShapleyAttribution(@Nullable GoogleCloudMlV1__SampledShapleyAttributionArgs sampledShapleyAttribution) {
            this.sampledShapleyAttribution = Output.ofNullable(sampledShapleyAttribution);
            return this;
        }
        public Builder xraiAttribution(@Nullable Output<GoogleCloudMlV1__XraiAttributionArgs> xraiAttribution) {
            this.xraiAttribution = xraiAttribution;
            return this;
        }
        public Builder xraiAttribution(@Nullable GoogleCloudMlV1__XraiAttributionArgs xraiAttribution) {
            this.xraiAttribution = Output.ofNullable(xraiAttribution);
            return this;
        }        public GoogleCloudMlV1__ExplanationConfigArgs build() {
            return new GoogleCloudMlV1__ExplanationConfigArgs(integratedGradientsAttribution, sampledShapleyAttribution, xraiAttribution);
        }
    }
}
