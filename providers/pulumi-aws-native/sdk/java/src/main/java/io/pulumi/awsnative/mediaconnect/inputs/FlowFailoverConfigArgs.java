// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.inputs;

import io.pulumi.awsnative.mediaconnect.enums.FlowFailoverConfigState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings for source failover
 * 
 */
public final class FlowFailoverConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowFailoverConfigArgs Empty = new FlowFailoverConfigArgs();

    /**
     * Search window time to look for dash-7 packets
     * 
     */
    @Import(name="recoveryWindow")
      private final @Nullable Output<Integer> recoveryWindow;

    public Output<Integer> getRecoveryWindow() {
        return this.recoveryWindow == null ? Output.empty() : this.recoveryWindow;
    }

    @Import(name="state")
      private final @Nullable Output<FlowFailoverConfigState> state;

    public Output<FlowFailoverConfigState> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public FlowFailoverConfigArgs(
        @Nullable Output<Integer> recoveryWindow,
        @Nullable Output<FlowFailoverConfigState> state) {
        this.recoveryWindow = recoveryWindow;
        this.state = state;
    }

    private FlowFailoverConfigArgs() {
        this.recoveryWindow = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowFailoverConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> recoveryWindow;
        private @Nullable Output<FlowFailoverConfigState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowFailoverConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recoveryWindow = defaults.recoveryWindow;
    	      this.state = defaults.state;
        }

        public Builder recoveryWindow(@Nullable Output<Integer> recoveryWindow) {
            this.recoveryWindow = recoveryWindow;
            return this;
        }
        public Builder recoveryWindow(@Nullable Integer recoveryWindow) {
            this.recoveryWindow = Output.ofNullable(recoveryWindow);
            return this;
        }
        public Builder state(@Nullable Output<FlowFailoverConfigState> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable FlowFailoverConfigState state) {
            this.state = Output.ofNullable(state);
            return this;
        }        public FlowFailoverConfigArgs build() {
            return new FlowFailoverConfigArgs(recoveryWindow, state);
        }
    }
}
