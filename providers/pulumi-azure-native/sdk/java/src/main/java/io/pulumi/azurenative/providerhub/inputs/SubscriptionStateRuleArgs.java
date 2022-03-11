// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.SubscriptionState;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionStateRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionStateRuleArgs Empty = new SubscriptionStateRuleArgs();

    @InputImport(name="allowedActions")
      private final @Nullable Output<List<String>> allowedActions;

    public Output<List<String>> getAllowedActions() {
        return this.allowedActions == null ? Output.empty() : this.allowedActions;
    }

    @InputImport(name="state")
      private final @Nullable Output<Either<String,SubscriptionState>> state;

    public Output<Either<String,SubscriptionState>> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public SubscriptionStateRuleArgs(
        @Nullable Output<List<String>> allowedActions,
        @Nullable Output<Either<String,SubscriptionState>> state) {
        this.allowedActions = allowedActions;
        this.state = state;
    }

    private SubscriptionStateRuleArgs() {
        this.allowedActions = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionStateRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedActions;
        private @Nullable Output<Either<String,SubscriptionState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionStateRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedActions = defaults.allowedActions;
    	      this.state = defaults.state;
        }

        public Builder allowedActions(@Nullable Output<List<String>> allowedActions) {
            this.allowedActions = allowedActions;
            return this;
        }

        public Builder allowedActions(@Nullable List<String> allowedActions) {
            this.allowedActions = Output.ofNullable(allowedActions);
            return this;
        }

        public Builder state(@Nullable Output<Either<String,SubscriptionState>> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable Either<String,SubscriptionState> state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public SubscriptionStateRuleArgs build() {
            return new SubscriptionStateRuleArgs(allowedActions, state);
        }
    }
}
