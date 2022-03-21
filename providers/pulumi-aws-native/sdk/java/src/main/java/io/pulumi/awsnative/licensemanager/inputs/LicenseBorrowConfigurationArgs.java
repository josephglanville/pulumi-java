// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class LicenseBorrowConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LicenseBorrowConfigurationArgs Empty = new LicenseBorrowConfigurationArgs();

    @Import(name="allowEarlyCheckIn", required=true)
      private final Output<Boolean> allowEarlyCheckIn;

    public Output<Boolean> getAllowEarlyCheckIn() {
        return this.allowEarlyCheckIn;
    }

    @Import(name="maxTimeToLiveInMinutes", required=true)
      private final Output<Integer> maxTimeToLiveInMinutes;

    public Output<Integer> getMaxTimeToLiveInMinutes() {
        return this.maxTimeToLiveInMinutes;
    }

    public LicenseBorrowConfigurationArgs(
        Output<Boolean> allowEarlyCheckIn,
        Output<Integer> maxTimeToLiveInMinutes) {
        this.allowEarlyCheckIn = Objects.requireNonNull(allowEarlyCheckIn, "expected parameter 'allowEarlyCheckIn' to be non-null");
        this.maxTimeToLiveInMinutes = Objects.requireNonNull(maxTimeToLiveInMinutes, "expected parameter 'maxTimeToLiveInMinutes' to be non-null");
    }

    private LicenseBorrowConfigurationArgs() {
        this.allowEarlyCheckIn = Output.empty();
        this.maxTimeToLiveInMinutes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseBorrowConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> allowEarlyCheckIn;
        private Output<Integer> maxTimeToLiveInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseBorrowConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowEarlyCheckIn = defaults.allowEarlyCheckIn;
    	      this.maxTimeToLiveInMinutes = defaults.maxTimeToLiveInMinutes;
        }

        public Builder allowEarlyCheckIn(Output<Boolean> allowEarlyCheckIn) {
            this.allowEarlyCheckIn = Objects.requireNonNull(allowEarlyCheckIn);
            return this;
        }
        public Builder allowEarlyCheckIn(Boolean allowEarlyCheckIn) {
            this.allowEarlyCheckIn = Output.of(Objects.requireNonNull(allowEarlyCheckIn));
            return this;
        }
        public Builder maxTimeToLiveInMinutes(Output<Integer> maxTimeToLiveInMinutes) {
            this.maxTimeToLiveInMinutes = Objects.requireNonNull(maxTimeToLiveInMinutes);
            return this;
        }
        public Builder maxTimeToLiveInMinutes(Integer maxTimeToLiveInMinutes) {
            this.maxTimeToLiveInMinutes = Output.of(Objects.requireNonNull(maxTimeToLiveInMinutes));
            return this;
        }        public LicenseBorrowConfigurationArgs build() {
            return new LicenseBorrowConfigurationArgs(allowEarlyCheckIn, maxTimeToLiveInMinutes);
        }
    }
}
