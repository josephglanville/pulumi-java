// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.SubscriptionNotificationOperation;
import io.pulumi.azurenative.providerhub.enums.SubscriptionTransitioningState;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SubscriptionStateOverrideActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionStateOverrideActionArgs Empty = new SubscriptionStateOverrideActionArgs();

    @Import(name="action", required=true)
      private final Output<Either<String,SubscriptionNotificationOperation>> action;

    public Output<Either<String,SubscriptionNotificationOperation>> getAction() {
        return this.action;
    }

    @Import(name="state", required=true)
      private final Output<Either<String,SubscriptionTransitioningState>> state;

    public Output<Either<String,SubscriptionTransitioningState>> getState() {
        return this.state;
    }

    public SubscriptionStateOverrideActionArgs(
        Output<Either<String,SubscriptionNotificationOperation>> action,
        Output<Either<String,SubscriptionTransitioningState>> state) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private SubscriptionStateOverrideActionArgs() {
        this.action = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionStateOverrideActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,SubscriptionNotificationOperation>> action;
        private Output<Either<String,SubscriptionTransitioningState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionStateOverrideActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.state = defaults.state;
        }

        public Builder action(Output<Either<String,SubscriptionNotificationOperation>> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(Either<String,SubscriptionNotificationOperation> action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder state(Output<Either<String,SubscriptionTransitioningState>> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder state(Either<String,SubscriptionTransitioningState> state) {
            this.state = Output.of(Objects.requireNonNull(state));
            return this;
        }        public SubscriptionStateOverrideActionArgs build() {
            return new SubscriptionStateOverrideActionArgs(action, state);
        }
    }
}
