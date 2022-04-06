// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcEndpointConnectionNotificationState extends io.pulumi.resources.ResourceArgs {

    public static final VpcEndpointConnectionNotificationState Empty = new VpcEndpointConnectionNotificationState();

    /**
     * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
     * 
     */
    @Import(name="connectionEvents")
      private final @Nullable Output<List<String>> connectionEvents;

    public Output<List<String>> getConnectionEvents() {
        return this.connectionEvents == null ? Output.empty() : this.connectionEvents;
    }

    /**
     * The ARN of the SNS topic for the notifications.
     * 
     */
    @Import(name="connectionNotificationArn")
      private final @Nullable Output<String> connectionNotificationArn;

    public Output<String> getConnectionNotificationArn() {
        return this.connectionNotificationArn == null ? Output.empty() : this.connectionNotificationArn;
    }

    /**
     * The type of notification.
     * 
     */
    @Import(name="notificationType")
      private final @Nullable Output<String> notificationType;

    public Output<String> getNotificationType() {
        return this.notificationType == null ? Output.empty() : this.notificationType;
    }

    /**
     * The state of the notification.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * The ID of the VPC Endpoint to receive notifications for.
     * 
     */
    @Import(name="vpcEndpointId")
      private final @Nullable Output<String> vpcEndpointId;

    public Output<String> getVpcEndpointId() {
        return this.vpcEndpointId == null ? Output.empty() : this.vpcEndpointId;
    }

    /**
     * The ID of the VPC Endpoint Service to receive notifications for.
     * 
     */
    @Import(name="vpcEndpointServiceId")
      private final @Nullable Output<String> vpcEndpointServiceId;

    public Output<String> getVpcEndpointServiceId() {
        return this.vpcEndpointServiceId == null ? Output.empty() : this.vpcEndpointServiceId;
    }

    public VpcEndpointConnectionNotificationState(
        @Nullable Output<List<String>> connectionEvents,
        @Nullable Output<String> connectionNotificationArn,
        @Nullable Output<String> notificationType,
        @Nullable Output<String> state,
        @Nullable Output<String> vpcEndpointId,
        @Nullable Output<String> vpcEndpointServiceId) {
        this.connectionEvents = connectionEvents;
        this.connectionNotificationArn = connectionNotificationArn;
        this.notificationType = notificationType;
        this.state = state;
        this.vpcEndpointId = vpcEndpointId;
        this.vpcEndpointServiceId = vpcEndpointServiceId;
    }

    private VpcEndpointConnectionNotificationState() {
        this.connectionEvents = Output.empty();
        this.connectionNotificationArn = Output.empty();
        this.notificationType = Output.empty();
        this.state = Output.empty();
        this.vpcEndpointId = Output.empty();
        this.vpcEndpointServiceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointConnectionNotificationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> connectionEvents;
        private @Nullable Output<String> connectionNotificationArn;
        private @Nullable Output<String> notificationType;
        private @Nullable Output<String> state;
        private @Nullable Output<String> vpcEndpointId;
        private @Nullable Output<String> vpcEndpointServiceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointConnectionNotificationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionEvents = defaults.connectionEvents;
    	      this.connectionNotificationArn = defaults.connectionNotificationArn;
    	      this.notificationType = defaults.notificationType;
    	      this.state = defaults.state;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
    	      this.vpcEndpointServiceId = defaults.vpcEndpointServiceId;
        }

        public Builder connectionEvents(@Nullable Output<List<String>> connectionEvents) {
            this.connectionEvents = connectionEvents;
            return this;
        }
        public Builder connectionEvents(@Nullable List<String> connectionEvents) {
            this.connectionEvents = Output.ofNullable(connectionEvents);
            return this;
        }
        public Builder connectionEvents(String... connectionEvents) {
            return connectionEvents(List.of(connectionEvents));
        }
        public Builder connectionNotificationArn(@Nullable Output<String> connectionNotificationArn) {
            this.connectionNotificationArn = connectionNotificationArn;
            return this;
        }
        public Builder connectionNotificationArn(@Nullable String connectionNotificationArn) {
            this.connectionNotificationArn = Output.ofNullable(connectionNotificationArn);
            return this;
        }
        public Builder notificationType(@Nullable Output<String> notificationType) {
            this.notificationType = notificationType;
            return this;
        }
        public Builder notificationType(@Nullable String notificationType) {
            this.notificationType = Output.ofNullable(notificationType);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public Builder vpcEndpointId(@Nullable Output<String> vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }
        public Builder vpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = Output.ofNullable(vpcEndpointId);
            return this;
        }
        public Builder vpcEndpointServiceId(@Nullable Output<String> vpcEndpointServiceId) {
            this.vpcEndpointServiceId = vpcEndpointServiceId;
            return this;
        }
        public Builder vpcEndpointServiceId(@Nullable String vpcEndpointServiceId) {
            this.vpcEndpointServiceId = Output.ofNullable(vpcEndpointServiceId);
            return this;
        }        public VpcEndpointConnectionNotificationState build() {
            return new VpcEndpointConnectionNotificationState(connectionEvents, connectionNotificationArn, notificationType, state, vpcEndpointId, vpcEndpointServiceId);
        }
    }
}