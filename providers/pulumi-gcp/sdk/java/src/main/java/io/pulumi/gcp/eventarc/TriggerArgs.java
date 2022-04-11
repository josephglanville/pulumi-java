// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs;
import io.pulumi.gcp.eventarc.inputs.TriggerMatchingCriteriaArgs;
import io.pulumi.gcp.eventarc.inputs.TriggerTransportArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * Required. Destination specifies where the events should be sent to.
     * 
     */
    @Import(name="destination", required=true)
      private final Output<TriggerDestinationArgs> destination;

    public Output<TriggerDestinationArgs> getDestination() {
        return this.destination;
    }

    /**
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }

    /**
     * Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
     * 
     */
    @Import(name="matchingCriterias", required=true)
      private final Output<List<TriggerMatchingCriteriaArgs>> matchingCriterias;

    public Output<List<TriggerMatchingCriteriaArgs>> getMatchingCriterias() {
        return this.matchingCriterias;
    }

    /**
     * Required. The resource name of the trigger. Must be unique within the location on the project and must be in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have `roles/eventarc.eventReceiver` IAM role.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     * 
     */
    @Import(name="transports")
      private final @Nullable Output<List<TriggerTransportArgs>> transports;

    public Output<List<TriggerTransportArgs>> getTransports() {
        return this.transports == null ? Codegen.empty() : this.transports;
    }

    public TriggerArgs(
        Output<TriggerDestinationArgs> destination,
        @Nullable Output<Map<String,String>> labels,
        Output<String> location,
        Output<List<TriggerMatchingCriteriaArgs>> matchingCriterias,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<List<TriggerTransportArgs>> transports) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.labels = labels;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.matchingCriterias = Objects.requireNonNull(matchingCriterias, "expected parameter 'matchingCriterias' to be non-null");
        this.name = name;
        this.project = project;
        this.serviceAccount = serviceAccount;
        this.transports = transports;
    }

    private TriggerArgs() {
        this.destination = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.matchingCriterias = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.transports = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<TriggerDestinationArgs> destination;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> location;
        private Output<List<TriggerMatchingCriteriaArgs>> matchingCriterias;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<List<TriggerTransportArgs>> transports;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.matchingCriterias = defaults.matchingCriterias;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.transports = defaults.transports;
        }

        public Builder destination(Output<TriggerDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(TriggerDestinationArgs destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }
        public Builder matchingCriterias(Output<List<TriggerMatchingCriteriaArgs>> matchingCriterias) {
            this.matchingCriterias = Objects.requireNonNull(matchingCriterias);
            return this;
        }
        public Builder matchingCriterias(List<TriggerMatchingCriteriaArgs> matchingCriterias) {
            this.matchingCriterias = Output.of(Objects.requireNonNull(matchingCriterias));
            return this;
        }
        public Builder matchingCriterias(TriggerMatchingCriteriaArgs... matchingCriterias) {
            return matchingCriterias(List.of(matchingCriterias));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder transports(@Nullable Output<List<TriggerTransportArgs>> transports) {
            this.transports = transports;
            return this;
        }
        public Builder transports(@Nullable List<TriggerTransportArgs> transports) {
            this.transports = Codegen.ofNullable(transports);
            return this;
        }
        public Builder transports(TriggerTransportArgs... transports) {
            return transports(List.of(transports));
        }        public TriggerArgs build() {
            return new TriggerArgs(destination, labels, location, matchingCriterias, name, project, serviceAccount, transports);
        }
    }
}
