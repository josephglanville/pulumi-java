// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnConnectionRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnConnectionRouteGetArgs Empty = new VpnConnectionRouteGetArgs();

    /**
     * The CIDR block associated with the local subnet of the customer data center.
     * 
     */
    @Import(name="destinationCidrBlock")
      private final @Nullable Output<String> destinationCidrBlock;

    public Output<String> getDestinationCidrBlock() {
        return this.destinationCidrBlock == null ? Output.empty() : this.destinationCidrBlock;
    }

    /**
     * Indicates how the routes were provided.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<String> source;

    public Output<String> getSource() {
        return this.source == null ? Output.empty() : this.source;
    }

    /**
     * The current state of the static route.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public VpnConnectionRouteGetArgs(
        @Nullable Output<String> destinationCidrBlock,
        @Nullable Output<String> source,
        @Nullable Output<String> state) {
        this.destinationCidrBlock = destinationCidrBlock;
        this.source = source;
        this.state = state;
    }

    private VpnConnectionRouteGetArgs() {
        this.destinationCidrBlock = Output.empty();
        this.source = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnConnectionRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> destinationCidrBlock;
        private @Nullable Output<String> source;
        private @Nullable Output<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnConnectionRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.source = defaults.source;
    	      this.state = defaults.state;
        }

        public Builder destinationCidrBlock(@Nullable Output<String> destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public Builder destinationCidrBlock(@Nullable String destinationCidrBlock) {
            this.destinationCidrBlock = Output.ofNullable(destinationCidrBlock);
            return this;
        }
        public Builder source(@Nullable Output<String> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = Output.ofNullable(source);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }        public VpnConnectionRouteGetArgs build() {
            return new VpnConnectionRouteGetArgs(destinationCidrBlock, source, state);
        }
    }
}
