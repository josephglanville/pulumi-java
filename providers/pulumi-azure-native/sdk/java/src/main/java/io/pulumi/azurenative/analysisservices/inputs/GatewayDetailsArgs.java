// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The gateway details.
 * 
 */
public final class GatewayDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayDetailsArgs Empty = new GatewayDetailsArgs();

    /**
     * Gateway resource to be associated with the server.
     * 
     */
    @Import(name="gatewayResourceId")
      private final @Nullable Output<String> gatewayResourceId;

    public Output<String> getGatewayResourceId() {
        return this.gatewayResourceId == null ? Output.empty() : this.gatewayResourceId;
    }

    public GatewayDetailsArgs(@Nullable Output<String> gatewayResourceId) {
        this.gatewayResourceId = gatewayResourceId;
    }

    private GatewayDetailsArgs() {
        this.gatewayResourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> gatewayResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayResourceId = defaults.gatewayResourceId;
        }

        public Builder gatewayResourceId(@Nullable Output<String> gatewayResourceId) {
            this.gatewayResourceId = gatewayResourceId;
            return this;
        }
        public Builder gatewayResourceId(@Nullable String gatewayResourceId) {
            this.gatewayResourceId = Output.ofNullable(gatewayResourceId);
            return this;
        }        public GatewayDetailsArgs build() {
            return new GatewayDetailsArgs(gatewayResourceId);
        }
    }
}
