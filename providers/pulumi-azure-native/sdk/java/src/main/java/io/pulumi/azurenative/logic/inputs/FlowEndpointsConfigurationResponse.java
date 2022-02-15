// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.FlowEndpointsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowEndpointsConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final FlowEndpointsConfigurationResponse Empty = new FlowEndpointsConfigurationResponse();

    @InputImport(name="connector")
    private final @Nullable FlowEndpointsResponse connector;

    public Optional<FlowEndpointsResponse> getConnector() {
        return this.connector == null ? Optional.empty() : Optional.ofNullable(this.connector);
    }

    @InputImport(name="workflow")
    private final @Nullable FlowEndpointsResponse workflow;

    public Optional<FlowEndpointsResponse> getWorkflow() {
        return this.workflow == null ? Optional.empty() : Optional.ofNullable(this.workflow);
    }

    public FlowEndpointsConfigurationResponse(
        @Nullable FlowEndpointsResponse connector,
        @Nullable FlowEndpointsResponse workflow) {
        this.connector = connector;
        this.workflow = workflow;
    }

    private FlowEndpointsConfigurationResponse() {
        this.connector = null;
        this.workflow = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowEndpointsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowEndpointsResponse connector;
        private @Nullable FlowEndpointsResponse workflow;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowEndpointsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connector = defaults.connector;
    	      this.workflow = defaults.workflow;
        }

        public Builder setConnector(@Nullable FlowEndpointsResponse connector) {
            this.connector = connector;
            return this;
        }

        public Builder setWorkflow(@Nullable FlowEndpointsResponse workflow) {
            this.workflow = workflow;
            return this;
        }

        public FlowEndpointsConfigurationResponse build() {
            return new FlowEndpointsConfigurationResponse(connector, workflow);
        }
    }
}