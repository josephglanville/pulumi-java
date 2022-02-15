// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2LDiversityHistogramBucketResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2LDiversityResultResponse {
    private final List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets;

    @OutputCustomType.Constructor({"sensitiveValueFrequencyHistogramBuckets"})
    private GooglePrivacyDlpV2LDiversityResultResponse(List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets) {
        this.sensitiveValueFrequencyHistogramBuckets = Objects.requireNonNull(sensitiveValueFrequencyHistogramBuckets);
    }

    public List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> getSensitiveValueFrequencyHistogramBuckets() {
        return this.sensitiveValueFrequencyHistogramBuckets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2LDiversityResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2LDiversityResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sensitiveValueFrequencyHistogramBuckets = defaults.sensitiveValueFrequencyHistogramBuckets;
        }

        public Builder setSensitiveValueFrequencyHistogramBuckets(List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets) {
            this.sensitiveValueFrequencyHistogramBuckets = Objects.requireNonNull(sensitiveValueFrequencyHistogramBuckets);
            return this;
        }

        public GooglePrivacyDlpV2LDiversityResultResponse build() {
            return new GooglePrivacyDlpV2LDiversityResultResponse(sensitiveValueFrequencyHistogramBuckets);
        }
    }
}