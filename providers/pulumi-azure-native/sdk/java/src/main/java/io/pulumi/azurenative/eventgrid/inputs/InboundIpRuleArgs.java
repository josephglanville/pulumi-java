// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.azurenative.eventgrid.enums.IpActionType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InboundIpRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final InboundIpRuleArgs Empty = new InboundIpRuleArgs();

    /**
     * Action to perform based on the match or no match of the IpMask.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<Either<String,IpActionType>> action;

    public Output<Either<String,IpActionType>> getAction() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * IP Address in CIDR notation e.g., 10.0.0.0/8.
     * 
     */
    @Import(name="ipMask")
      private final @Nullable Output<String> ipMask;

    public Output<String> getIpMask() {
        return this.ipMask == null ? Codegen.empty() : this.ipMask;
    }

    public InboundIpRuleArgs(
        @Nullable Output<Either<String,IpActionType>> action,
        @Nullable Output<String> ipMask) {
        this.action = action;
        this.ipMask = ipMask;
    }

    private InboundIpRuleArgs() {
        this.action = Codegen.empty();
        this.ipMask = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundIpRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,IpActionType>> action;
        private @Nullable Output<String> ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundIpRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder action(@Nullable Output<Either<String,IpActionType>> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable Either<String,IpActionType> action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder ipMask(@Nullable Output<String> ipMask) {
            this.ipMask = ipMask;
            return this;
        }
        public Builder ipMask(@Nullable String ipMask) {
            this.ipMask = Codegen.ofNullable(ipMask);
            return this;
        }        public InboundIpRuleArgs build() {
            return new InboundIpRuleArgs(action, ipMask);
        }
    }
}
