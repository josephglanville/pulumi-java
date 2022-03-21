// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleTypeMoneyResponse;
import java.lang.String;
import java.util.Objects;


/**
 * API call volume range and the fees charged when the total number of API calls is within the range.
 * 
 */
public final class GoogleCloudApigeeV1RateRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1RateRangeResponse Empty = new GoogleCloudApigeeV1RateRangeResponse();

    /**
     * Ending value of the range. Set to 0 or `null` for the last range of values.
     * 
     */
    @Import(name="end", required=true)
      private final String end;

    public String getEnd() {
        return this.end;
    }

    /**
     * Fee to charge when total number of API calls falls within this range.
     * 
     */
    @Import(name="fee", required=true)
      private final GoogleTypeMoneyResponse fee;

    public GoogleTypeMoneyResponse getFee() {
        return this.fee;
    }

    /**
     * Starting value of the range. Set to 0 or `null` for the initial range of values.
     * 
     */
    @Import(name="start", required=true)
      private final String start;

    public String getStart() {
        return this.start;
    }

    public GoogleCloudApigeeV1RateRangeResponse(
        String end,
        GoogleTypeMoneyResponse fee,
        String start) {
        this.end = Objects.requireNonNull(end, "expected parameter 'end' to be non-null");
        this.fee = Objects.requireNonNull(fee, "expected parameter 'fee' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
    }

    private GoogleCloudApigeeV1RateRangeResponse() {
        this.end = null;
        this.fee = null;
        this.start = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1RateRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String end;
        private GoogleTypeMoneyResponse fee;
        private String start;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1RateRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.fee = defaults.fee;
    	      this.start = defaults.start;
        }

        public Builder end(String end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }
        public Builder fee(GoogleTypeMoneyResponse fee) {
            this.fee = Objects.requireNonNull(fee);
            return this;
        }
        public Builder start(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }        public GoogleCloudApigeeV1RateRangeResponse build() {
            return new GoogleCloudApigeeV1RateRangeResponse(end, fee, start);
        }
    }
}
