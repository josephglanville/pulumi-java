// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * An attribution method that approximates Shapley values for features that contribute to the label being predicted. A sampling strategy is used to approximate the value rather than considering all subsets of features.
 * 
 */
public final class GoogleCloudMlV1__SampledShapleyAttributionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__SampledShapleyAttributionResponse Empty = new GoogleCloudMlV1__SampledShapleyAttributionResponse();

    /**
     * The number of feature permutations to consider when approximating the Shapley values.
     * 
     */
    @Import(name="numPaths", required=true)
      private final Integer numPaths;

    public Integer getNumPaths() {
        return this.numPaths;
    }

    public GoogleCloudMlV1__SampledShapleyAttributionResponse(Integer numPaths) {
        this.numPaths = Objects.requireNonNull(numPaths, "expected parameter 'numPaths' to be non-null");
    }

    private GoogleCloudMlV1__SampledShapleyAttributionResponse() {
        this.numPaths = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__SampledShapleyAttributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__SampledShapleyAttributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numPaths = defaults.numPaths;
        }

        public Builder numPaths(Integer numPaths) {
            this.numPaths = Objects.requireNonNull(numPaths);
            return this;
        }        public GoogleCloudMlV1__SampledShapleyAttributionResponse build() {
            return new GoogleCloudMlV1__SampledShapleyAttributionResponse(numPaths);
        }
    }
}
