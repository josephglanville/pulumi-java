// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ForwardingConfigurationArgs;
import io.pulumi.azurenative.network.inputs.HeaderActionArgs;
import io.pulumi.azurenative.network.inputs.RedirectConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * One or more actions that will execute, modifying the request and/or response.
 * 
 */
public final class RulesEngineActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulesEngineActionArgs Empty = new RulesEngineActionArgs();

    /**
     * A list of header actions to apply from the request from AFD to the origin.
     * 
     */
    @Import(name="requestHeaderActions")
      private final @Nullable Output<List<HeaderActionArgs>> requestHeaderActions;

    public Output<List<HeaderActionArgs>> getRequestHeaderActions() {
        return this.requestHeaderActions == null ? Output.empty() : this.requestHeaderActions;
    }

    /**
     * A list of header actions to apply from the response from AFD to the client.
     * 
     */
    @Import(name="responseHeaderActions")
      private final @Nullable Output<List<HeaderActionArgs>> responseHeaderActions;

    public Output<List<HeaderActionArgs>> getResponseHeaderActions() {
        return this.responseHeaderActions == null ? Output.empty() : this.responseHeaderActions;
    }

    /**
     * Override the route configuration.
     * 
     */
    @Import(name="routeConfigurationOverride")
      private final @Nullable Output<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfigurationOverride;

    public Output<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> getRouteConfigurationOverride() {
        return this.routeConfigurationOverride == null ? Output.empty() : this.routeConfigurationOverride;
    }

    public RulesEngineActionArgs(
        @Nullable Output<List<HeaderActionArgs>> requestHeaderActions,
        @Nullable Output<List<HeaderActionArgs>> responseHeaderActions,
        @Nullable Output<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfigurationOverride) {
        this.requestHeaderActions = requestHeaderActions;
        this.responseHeaderActions = responseHeaderActions;
        this.routeConfigurationOverride = routeConfigurationOverride;
    }

    private RulesEngineActionArgs() {
        this.requestHeaderActions = Output.empty();
        this.responseHeaderActions = Output.empty();
        this.routeConfigurationOverride = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesEngineActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<HeaderActionArgs>> requestHeaderActions;
        private @Nullable Output<List<HeaderActionArgs>> responseHeaderActions;
        private @Nullable Output<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfigurationOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesEngineActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeaderActions = defaults.requestHeaderActions;
    	      this.responseHeaderActions = defaults.responseHeaderActions;
    	      this.routeConfigurationOverride = defaults.routeConfigurationOverride;
        }

        public Builder requestHeaderActions(@Nullable Output<List<HeaderActionArgs>> requestHeaderActions) {
            this.requestHeaderActions = requestHeaderActions;
            return this;
        }
        public Builder requestHeaderActions(@Nullable List<HeaderActionArgs> requestHeaderActions) {
            this.requestHeaderActions = Output.ofNullable(requestHeaderActions);
            return this;
        }
        public Builder requestHeaderActions(HeaderActionArgs... requestHeaderActions) {
            return requestHeaderActions(List.of(requestHeaderActions));
        }
        public Builder responseHeaderActions(@Nullable Output<List<HeaderActionArgs>> responseHeaderActions) {
            this.responseHeaderActions = responseHeaderActions;
            return this;
        }
        public Builder responseHeaderActions(@Nullable List<HeaderActionArgs> responseHeaderActions) {
            this.responseHeaderActions = Output.ofNullable(responseHeaderActions);
            return this;
        }
        public Builder responseHeaderActions(HeaderActionArgs... responseHeaderActions) {
            return responseHeaderActions(List.of(responseHeaderActions));
        }
        public Builder routeConfigurationOverride(@Nullable Output<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfigurationOverride) {
            this.routeConfigurationOverride = routeConfigurationOverride;
            return this;
        }
        public Builder routeConfigurationOverride(@Nullable Either<ForwardingConfigurationArgs,RedirectConfigurationArgs> routeConfigurationOverride) {
            this.routeConfigurationOverride = Output.ofNullable(routeConfigurationOverride);
            return this;
        }        public RulesEngineActionArgs build() {
            return new RulesEngineActionArgs(requestHeaderActions, responseHeaderActions, routeConfigurationOverride);
        }
    }
}
