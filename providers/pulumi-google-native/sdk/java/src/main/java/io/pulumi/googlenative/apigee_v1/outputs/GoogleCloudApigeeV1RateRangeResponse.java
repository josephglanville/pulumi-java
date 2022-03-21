// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleTypeMoneyResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudApigeeV1RateRangeResponse {
    /**
     * Ending value of the range. Set to 0 or `null` for the last range of values.
     * 
     */
    private final String end;
    /**
     * Fee to charge when total number of API calls falls within this range.
     * 
     */
    private final GoogleTypeMoneyResponse fee;
    /**
     * Starting value of the range. Set to 0 or `null` for the initial range of values.
     * 
     */
    private final String start;

    @CustomType.Constructor
    private GoogleCloudApigeeV1RateRangeResponse(
        @CustomType.Parameter("end") String end,
        @CustomType.Parameter("fee") GoogleTypeMoneyResponse fee,
        @CustomType.Parameter("start") String start) {
        this.end = end;
        this.fee = fee;
        this.start = start;
    }

    /**
     * Ending value of the range. Set to 0 or `null` for the last range of values.
     * 
    */
    public String getEnd() {
        return this.end;
    }
    /**
     * Fee to charge when total number of API calls falls within this range.
     * 
    */
    public GoogleTypeMoneyResponse getFee() {
        return this.fee;
    }
    /**
     * Starting value of the range. Set to 0 or `null` for the initial range of values.
     * 
    */
    public String getStart() {
        return this.start;
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
