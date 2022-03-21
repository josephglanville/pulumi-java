// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.eventarc_v1.inputs.DestinationArgs;
import io.pulumi.googlenative.eventarc_v1.inputs.EventFilterArgs;
import io.pulumi.googlenative.eventarc_v1.inputs.TransportArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * Destination specifies where the events should be sent to.
     * 
     */
    @Import(name="destination", required=true)
      private final Output<DestinationArgs> destination;

    public Output<DestinationArgs> getDestination() {
        return this.destination;
    }

    /**
     * null The list of filters that applies to event attributes. Only events that match all the provided filters are sent to the destination.
     * 
     */
    @Import(name="eventFilters", required=true)
      private final Output<List<EventFilterArgs>> eventFilters;

    public Output<List<EventFilterArgs>> getEventFilters() {
        return this.eventFilters;
    }

    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource name of the trigger. Must be unique within the location of the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have the `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. To create Audit Log triggers, the service account should also have the `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * Optional. To deliver messages, Eventarc might use other GCP products as a transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    @Import(name="transport")
      private final @Nullable Output<TransportArgs> transport;

    public Output<TransportArgs> getTransport() {
        return this.transport == null ? Output.empty() : this.transport;
    }

    @Import(name="triggerId", required=true)
      private final Output<String> triggerId;

    public Output<String> getTriggerId() {
        return this.triggerId;
    }

    @Import(name="validateOnly", required=true)
      private final Output<String> validateOnly;

    public Output<String> getValidateOnly() {
        return this.validateOnly;
    }

    public TriggerArgs(
        Output<DestinationArgs> destination,
        Output<List<EventFilterArgs>> eventFilters,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<TransportArgs> transport,
        Output<String> triggerId,
        Output<String> validateOnly) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.eventFilters = Objects.requireNonNull(eventFilters, "expected parameter 'eventFilters' to be non-null");
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.serviceAccount = serviceAccount;
        this.transport = transport;
        this.triggerId = Objects.requireNonNull(triggerId, "expected parameter 'triggerId' to be non-null");
        this.validateOnly = Objects.requireNonNull(validateOnly, "expected parameter 'validateOnly' to be non-null");
    }

    private TriggerArgs() {
        this.destination = Output.empty();
        this.eventFilters = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.serviceAccount = Output.empty();
        this.transport = Output.empty();
        this.triggerId = Output.empty();
        this.validateOnly = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DestinationArgs> destination;
        private Output<List<EventFilterArgs>> eventFilters;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<TransportArgs> transport;
        private Output<String> triggerId;
        private Output<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.eventFilters = defaults.eventFilters;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.transport = defaults.transport;
    	      this.triggerId = defaults.triggerId;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder destination(Output<DestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(DestinationArgs destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder eventFilters(Output<List<EventFilterArgs>> eventFilters) {
            this.eventFilters = Objects.requireNonNull(eventFilters);
            return this;
        }
        public Builder eventFilters(List<EventFilterArgs> eventFilters) {
            this.eventFilters = Output.of(Objects.requireNonNull(eventFilters));
            return this;
        }
        public Builder eventFilters(EventFilterArgs... eventFilters) {
            return eventFilters(List.of(eventFilters));
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Output.ofNullable(serviceAccount);
            return this;
        }
        public Builder transport(@Nullable Output<TransportArgs> transport) {
            this.transport = transport;
            return this;
        }
        public Builder transport(@Nullable TransportArgs transport) {
            this.transport = Output.ofNullable(transport);
            return this;
        }
        public Builder triggerId(Output<String> triggerId) {
            this.triggerId = Objects.requireNonNull(triggerId);
            return this;
        }
        public Builder triggerId(String triggerId) {
            this.triggerId = Output.of(Objects.requireNonNull(triggerId));
            return this;
        }
        public Builder validateOnly(Output<String> validateOnly) {
            this.validateOnly = Objects.requireNonNull(validateOnly);
            return this;
        }
        public Builder validateOnly(String validateOnly) {
            this.validateOnly = Output.of(Objects.requireNonNull(validateOnly));
            return this;
        }        public TriggerArgs build() {
            return new TriggerArgs(destination, eventFilters, labels, location, name, project, serviceAccount, transport, triggerId, validateOnly);
        }
    }
}
