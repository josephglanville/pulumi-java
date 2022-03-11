// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelRetentionPeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelRetentionPeriodArgs Empty = new ChannelRetentionPeriodArgs();

    @InputImport(name="numberOfDays")
      private final @Nullable Output<Integer> numberOfDays;

    public Output<Integer> getNumberOfDays() {
        return this.numberOfDays == null ? Output.empty() : this.numberOfDays;
    }

    @InputImport(name="unlimited")
      private final @Nullable Output<Boolean> unlimited;

    public Output<Boolean> getUnlimited() {
        return this.unlimited == null ? Output.empty() : this.unlimited;
    }

    public ChannelRetentionPeriodArgs(
        @Nullable Output<Integer> numberOfDays,
        @Nullable Output<Boolean> unlimited) {
        this.numberOfDays = numberOfDays;
        this.unlimited = unlimited;
    }

    private ChannelRetentionPeriodArgs() {
        this.numberOfDays = Output.empty();
        this.unlimited = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelRetentionPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> numberOfDays;
        private @Nullable Output<Boolean> unlimited;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelRetentionPeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numberOfDays = defaults.numberOfDays;
    	      this.unlimited = defaults.unlimited;
        }

        public Builder numberOfDays(@Nullable Output<Integer> numberOfDays) {
            this.numberOfDays = numberOfDays;
            return this;
        }

        public Builder numberOfDays(@Nullable Integer numberOfDays) {
            this.numberOfDays = Output.ofNullable(numberOfDays);
            return this;
        }

        public Builder unlimited(@Nullable Output<Boolean> unlimited) {
            this.unlimited = unlimited;
            return this;
        }

        public Builder unlimited(@Nullable Boolean unlimited) {
            this.unlimited = Output.ofNullable(unlimited);
            return this;
        }
        public ChannelRetentionPeriodArgs build() {
            return new ChannelRetentionPeriodArgs(numberOfDays, unlimited);
        }
    }
}
