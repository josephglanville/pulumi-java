// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ItsmReceiverArgs extends io.pulumi.resources.ResourceArgs {

    public static final ItsmReceiverArgs Empty = new ItsmReceiverArgs();

    @InputImport(name="connectionId", required=true)
    private final Input<String> connectionId;

    public Input<String> getConnectionId() {
        return this.connectionId;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="ticketConfiguration", required=true)
    private final Input<String> ticketConfiguration;

    public Input<String> getTicketConfiguration() {
        return this.ticketConfiguration;
    }

    @InputImport(name="workspaceId", required=true)
    private final Input<String> workspaceId;

    public Input<String> getWorkspaceId() {
        return this.workspaceId;
    }

    public ItsmReceiverArgs(
        Input<String> connectionId,
        Input<String> name,
        Input<String> region,
        Input<String> ticketConfiguration,
        Input<String> workspaceId) {
        this.connectionId = Objects.requireNonNull(connectionId, "expected parameter 'connectionId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.ticketConfiguration = Objects.requireNonNull(ticketConfiguration, "expected parameter 'ticketConfiguration' to be non-null");
        this.workspaceId = Objects.requireNonNull(workspaceId, "expected parameter 'workspaceId' to be non-null");
    }

    private ItsmReceiverArgs() {
        this.connectionId = Input.empty();
        this.name = Input.empty();
        this.region = Input.empty();
        this.ticketConfiguration = Input.empty();
        this.workspaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ItsmReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> connectionId;
        private Input<String> name;
        private Input<String> region;
        private Input<String> ticketConfiguration;
        private Input<String> workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ItsmReceiverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionId = defaults.connectionId;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.ticketConfiguration = defaults.ticketConfiguration;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setConnectionId(Input<String> connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }

        public Builder setConnectionId(String connectionId) {
            this.connectionId = Input.of(Objects.requireNonNull(connectionId));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setTicketConfiguration(Input<String> ticketConfiguration) {
            this.ticketConfiguration = Objects.requireNonNull(ticketConfiguration);
            return this;
        }

        public Builder setTicketConfiguration(String ticketConfiguration) {
            this.ticketConfiguration = Input.of(Objects.requireNonNull(ticketConfiguration));
            return this;
        }

        public Builder setWorkspaceId(Input<String> workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Input.of(Objects.requireNonNull(workspaceId));
            return this;
        }

        public ItsmReceiverArgs build() {
            return new ItsmReceiverArgs(connectionId, name, region, ticketConfiguration, workspaceId);
        }
    }
}
