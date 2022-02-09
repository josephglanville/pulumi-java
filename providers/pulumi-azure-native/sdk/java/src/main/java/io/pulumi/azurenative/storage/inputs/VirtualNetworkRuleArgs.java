// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.enums.Action;
import io.pulumi.azurenative.storage.enums.State;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    @InputImport(name="action")
    private final @Nullable Input<Action> action;

    public Input<Action> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    @InputImport(name="state")
    private final @Nullable Input<Either<String,State>> state;

    public Input<Either<String,State>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    @InputImport(name="virtualNetworkResourceId", required=true)
    private final Input<String> virtualNetworkResourceId;

    public Input<String> getVirtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    public VirtualNetworkRuleArgs(
        @Nullable Input<Action> action,
        @Nullable Input<Either<String,State>> state,
        Input<String> virtualNetworkResourceId) {
        this.action = action == null ? Input.ofNullable(io.pulumi.azurenative.storage.enums.Action.Allow) : action;
        this.state = state;
        this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId, "expected parameter 'virtualNetworkResourceId' to be non-null");
    }

    private VirtualNetworkRuleArgs() {
        this.action = Input.empty();
        this.state = Input.empty();
        this.virtualNetworkResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Action> action;
        private @Nullable Input<Either<String,State>> state;
        private Input<String> virtualNetworkResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.state = defaults.state;
    	      this.virtualNetworkResourceId = defaults.virtualNetworkResourceId;
        }

        public Builder setAction(@Nullable Input<Action> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable Action action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,State>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,State> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setVirtualNetworkResourceId(Input<String> virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId);
            return this;
        }

        public Builder setVirtualNetworkResourceId(String virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Input.of(Objects.requireNonNull(virtualNetworkResourceId));
            return this;
        }

        public VirtualNetworkRuleArgs build() {
            return new VirtualNetworkRuleArgs(action, state, virtualNetworkResourceId);
        }
    }
}
