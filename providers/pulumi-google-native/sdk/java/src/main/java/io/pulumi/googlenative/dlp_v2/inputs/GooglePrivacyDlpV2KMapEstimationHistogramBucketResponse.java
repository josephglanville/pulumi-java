// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A KMapEstimationHistogramBucket message with the following values: min_anonymity: 3 max_anonymity: 5 frequency: 42 means that there are 42 records whose quasi-identifier values correspond to 3, 4 or 5 people in the overlying population. An important particular case is when min_anonymity = max_anonymity = 1: the frequency field then corresponds to the number of uniquely identifiable records.
 * 
 */
public final class GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse Empty = new GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse();

    /**
     * Number of records within these anonymity bounds.
     * 
     */
    @Import(name="bucketSize", required=true)
      private final String bucketSize;

    public String getBucketSize() {
        return this.bucketSize;
    }

    /**
     * Total number of distinct quasi-identifier tuple values in this bucket.
     * 
     */
    @Import(name="bucketValueCount", required=true)
      private final String bucketValueCount;

    public String getBucketValueCount() {
        return this.bucketValueCount;
    }

    /**
     * Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    @Import(name="bucketValues", required=true)
      private final List<GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse> bucketValues;

    public List<GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse> getBucketValues() {
        return this.bucketValues;
    }

    /**
     * Always greater than or equal to min_anonymity.
     * 
     */
    @Import(name="maxAnonymity", required=true)
      private final String maxAnonymity;

    public String getMaxAnonymity() {
        return this.maxAnonymity;
    }

    /**
     * Always positive.
     * 
     */
    @Import(name="minAnonymity", required=true)
      private final String minAnonymity;

    public String getMinAnonymity() {
        return this.minAnonymity;
    }

    public GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse(
        String bucketSize,
        String bucketValueCount,
        List<GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse> bucketValues,
        String maxAnonymity,
        String minAnonymity) {
        this.bucketSize = Objects.requireNonNull(bucketSize, "expected parameter 'bucketSize' to be non-null");
        this.bucketValueCount = Objects.requireNonNull(bucketValueCount, "expected parameter 'bucketValueCount' to be non-null");
        this.bucketValues = Objects.requireNonNull(bucketValues, "expected parameter 'bucketValues' to be non-null");
        this.maxAnonymity = Objects.requireNonNull(maxAnonymity, "expected parameter 'maxAnonymity' to be non-null");
        this.minAnonymity = Objects.requireNonNull(minAnonymity, "expected parameter 'minAnonymity' to be non-null");
    }

    private GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse() {
        this.bucketSize = null;
        this.bucketValueCount = null;
        this.bucketValues = List.of();
        this.maxAnonymity = null;
        this.minAnonymity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketSize;
        private String bucketValueCount;
        private List<GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse> bucketValues;
        private String maxAnonymity;
        private String minAnonymity;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSize = defaults.bucketSize;
    	      this.bucketValueCount = defaults.bucketValueCount;
    	      this.bucketValues = defaults.bucketValues;
    	      this.maxAnonymity = defaults.maxAnonymity;
    	      this.minAnonymity = defaults.minAnonymity;
        }

        public Builder bucketSize(String bucketSize) {
            this.bucketSize = Objects.requireNonNull(bucketSize);
            return this;
        }
        public Builder bucketValueCount(String bucketValueCount) {
            this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
            return this;
        }
        public Builder bucketValues(List<GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse> bucketValues) {
            this.bucketValues = Objects.requireNonNull(bucketValues);
            return this;
        }
        public Builder bucketValues(GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse... bucketValues) {
            return bucketValues(List.of(bucketValues));
        }
        public Builder maxAnonymity(String maxAnonymity) {
            this.maxAnonymity = Objects.requireNonNull(maxAnonymity);
            return this;
        }
        public Builder minAnonymity(String minAnonymity) {
            this.minAnonymity = Objects.requireNonNull(minAnonymity);
            return this;
        }        public GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse build() {
            return new GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse(bucketSize, bucketValueCount, bucketValues, maxAnonymity, minAnonymity);
        }
    }
}
