// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetNetworkInterfaceCountRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetNetworkInterfaceCountRequestArgs Empty = new EC2FleetNetworkInterfaceCountRequestArgs();

    @Import(name="max")
      private final @Nullable Output<Integer> max;

    public Output<Integer> getMax() {
        return this.max == null ? Output.empty() : this.max;
    }

    @Import(name="min")
      private final @Nullable Output<Integer> min;

    public Output<Integer> getMin() {
        return this.min == null ? Output.empty() : this.min;
    }

    public EC2FleetNetworkInterfaceCountRequestArgs(
        @Nullable Output<Integer> max,
        @Nullable Output<Integer> min) {
        this.max = max;
        this.min = min;
    }

    private EC2FleetNetworkInterfaceCountRequestArgs() {
        this.max = Output.empty();
        this.min = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetNetworkInterfaceCountRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> max;
        private @Nullable Output<Integer> min;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetNetworkInterfaceCountRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(@Nullable Output<Integer> max) {
            this.max = max;
            return this;
        }
        public Builder max(@Nullable Integer max) {
            this.max = Output.ofNullable(max);
            return this;
        }
        public Builder min(@Nullable Output<Integer> min) {
            this.min = min;
            return this;
        }
        public Builder min(@Nullable Integer min) {
            this.min = Output.ofNullable(min);
            return this;
        }        public EC2FleetNetworkInterfaceCountRequestArgs build() {
            return new EC2FleetNetworkInterfaceCountRequestArgs(max, min);
        }
    }
}
