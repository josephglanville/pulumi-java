// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * API call volume range and the percentage of revenue to share with the developer when the total number of API calls is within the range.
 * 
 */
public final class GoogleCloudApigeeV1RevenueShareRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1RevenueShareRangeArgs Empty = new GoogleCloudApigeeV1RevenueShareRangeArgs();

    /**
     * Ending value of the range. Set to 0 or `null` for the last range of values.
     * 
     */
    @Import(name="end")
      private final @Nullable Output<String> end;

    public Output<String> getEnd() {
        return this.end == null ? Output.empty() : this.end;
    }

    /**
     * Percentage of the revenue to be shared with the developer. For example, to share 21 percent of the total revenue with the developer, set this value to 21. Specify a decimal number with a maximum of two digits following the decimal point.
     * 
     */
    @Import(name="sharePercentage")
      private final @Nullable Output<Double> sharePercentage;

    public Output<Double> getSharePercentage() {
        return this.sharePercentage == null ? Output.empty() : this.sharePercentage;
    }

    /**
     * Starting value of the range. Set to 0 or `null` for the initial range of values.
     * 
     */
    @Import(name="start")
      private final @Nullable Output<String> start;

    public Output<String> getStart() {
        return this.start == null ? Output.empty() : this.start;
    }

    public GoogleCloudApigeeV1RevenueShareRangeArgs(
        @Nullable Output<String> end,
        @Nullable Output<Double> sharePercentage,
        @Nullable Output<String> start) {
        this.end = end;
        this.sharePercentage = sharePercentage;
        this.start = start;
    }

    private GoogleCloudApigeeV1RevenueShareRangeArgs() {
        this.end = Output.empty();
        this.sharePercentage = Output.empty();
        this.start = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1RevenueShareRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> end;
        private @Nullable Output<Double> sharePercentage;
        private @Nullable Output<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1RevenueShareRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.sharePercentage = defaults.sharePercentage;
    	      this.start = defaults.start;
        }

        public Builder end(@Nullable Output<String> end) {
            this.end = end;
            return this;
        }
        public Builder end(@Nullable String end) {
            this.end = Output.ofNullable(end);
            return this;
        }
        public Builder sharePercentage(@Nullable Output<Double> sharePercentage) {
            this.sharePercentage = sharePercentage;
            return this;
        }
        public Builder sharePercentage(@Nullable Double sharePercentage) {
            this.sharePercentage = Output.ofNullable(sharePercentage);
            return this;
        }
        public Builder start(@Nullable Output<String> start) {
            this.start = start;
            return this;
        }
        public Builder start(@Nullable String start) {
            this.start = Output.ofNullable(start);
            return this;
        }        public GoogleCloudApigeeV1RevenueShareRangeArgs build() {
            return new GoogleCloudApigeeV1RevenueShareRangeArgs(end, sharePercentage, start);
        }
    }
}
