// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.azurenative.servicebus.enums.NetworkRuleIPAction;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NWRuleSetIpRulesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NWRuleSetIpRulesArgs Empty = new NWRuleSetIpRulesArgs();

    @InputImport(name="action")
    private final @Nullable Input<Either<String,NetworkRuleIPAction>> action;

    public Input<Either<String,NetworkRuleIPAction>> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    @InputImport(name="ipMask")
    private final @Nullable Input<String> ipMask;

    public Input<String> getIpMask() {
        return this.ipMask == null ? Input.empty() : this.ipMask;
    }

    public NWRuleSetIpRulesArgs(
        @Nullable Input<Either<String,NetworkRuleIPAction>> action,
        @Nullable Input<String> ipMask) {
        this.action = action == null ? Input.ofLeft("Allow") : action;
        this.ipMask = ipMask;
    }

    private NWRuleSetIpRulesArgs() {
        this.action = Input.empty();
        this.ipMask = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NWRuleSetIpRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,NetworkRuleIPAction>> action;
        private @Nullable Input<String> ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NWRuleSetIpRulesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder setAction(@Nullable Input<Either<String,NetworkRuleIPAction>> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable Either<String,NetworkRuleIPAction> action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setIpMask(@Nullable Input<String> ipMask) {
            this.ipMask = ipMask;
            return this;
        }

        public Builder setIpMask(@Nullable String ipMask) {
            this.ipMask = Input.ofNullable(ipMask);
            return this;
        }

        public NWRuleSetIpRulesArgs build() {
            return new NWRuleSetIpRulesArgs(action, ipMask);
        }
    }
}
