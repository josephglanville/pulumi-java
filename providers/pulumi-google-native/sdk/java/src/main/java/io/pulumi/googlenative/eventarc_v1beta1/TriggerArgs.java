// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.eventarc_v1beta1.inputs.DestinationArgs;
import io.pulumi.googlenative.eventarc_v1beta1.inputs.MatchingCriteriaArgs;
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
     * Optional. User labels attached to the triggers that can be used to group resources.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * null The criteria by which events are filtered. Only events that match with this criteria will be sent to the destination.
     * 
     */
    @Import(name="matchingCriteria", required=true)
      private final Output<List<MatchingCriteriaArgs>> matchingCriteria;

    public Output<List<MatchingCriteriaArgs>> getMatchingCriteria() {
        return this.matchingCriteria;
    }

    /**
     * The resource name of the trigger. Must be unique within the location on the project and must in `projects/{project}/locations/{location}/triggers/{trigger}` format.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have 'eventarc.events.receiveAuditLogV1Written' permission.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
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
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        Output<List<MatchingCriteriaArgs>> matchingCriteria,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> serviceAccount,
        Output<String> triggerId,
        Output<String> validateOnly) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.labels = labels;
        this.location = location;
        this.matchingCriteria = Objects.requireNonNull(matchingCriteria, "expected parameter 'matchingCriteria' to be non-null");
        this.name = name;
        this.project = project;
        this.serviceAccount = serviceAccount;
        this.triggerId = Objects.requireNonNull(triggerId, "expected parameter 'triggerId' to be non-null");
        this.validateOnly = Objects.requireNonNull(validateOnly, "expected parameter 'validateOnly' to be non-null");
    }

    private TriggerArgs() {
        this.destination = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.matchingCriteria = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.triggerId = Codegen.empty();
        this.validateOnly = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DestinationArgs> destination;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private Output<List<MatchingCriteriaArgs>> matchingCriteria;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> serviceAccount;
        private Output<String> triggerId;
        private Output<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.matchingCriteria = defaults.matchingCriteria;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceAccount = defaults.serviceAccount;
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
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder matchingCriteria(Output<List<MatchingCriteriaArgs>> matchingCriteria) {
            this.matchingCriteria = Objects.requireNonNull(matchingCriteria);
            return this;
        }
        public Builder matchingCriteria(List<MatchingCriteriaArgs> matchingCriteria) {
            this.matchingCriteria = Output.of(Objects.requireNonNull(matchingCriteria));
            return this;
        }
        public Builder matchingCriteria(MatchingCriteriaArgs... matchingCriteria) {
            return matchingCriteria(List.of(matchingCriteria));
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
            return new TriggerArgs(destination, labels, location, matchingCriteria, name, project, serviceAccount, triggerId, validateOnly);
        }
    }
}
