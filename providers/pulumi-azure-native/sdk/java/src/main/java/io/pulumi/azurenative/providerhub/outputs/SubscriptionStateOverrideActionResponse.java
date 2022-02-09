// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SubscriptionStateOverrideActionResponse {
    private final String action;
    private final String state;

    @OutputCustomType.Constructor({"action","state"})
    private SubscriptionStateOverrideActionResponse(
        String action,
        String state) {
        this.action = Objects.requireNonNull(action);
        this.state = Objects.requireNonNull(state);
    }

    public String getAction() {
        return this.action;
    }
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionStateOverrideActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionStateOverrideActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.state = defaults.state;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public SubscriptionStateOverrideActionResponse build() {
            return new SubscriptionStateOverrideActionResponse(action, state);
        }
    }
}
