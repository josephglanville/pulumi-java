// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerTriggerArgs Empty = new TriggerTriggerArgs();

    /**
     * The branches that will be included in the trigger configuration. If no branches are specified, the trigger will apply to all branches.
     * 
     */
    @Import(name="branches")
      private final @Nullable Output<List<String>> branches;

    public Output<List<String>> getBranches() {
        return this.branches == null ? Output.empty() : this.branches;
    }

    /**
     * Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.
     * 
     */
    @Import(name="customData")
      private final @Nullable Output<String> customData;

    public Output<String> getCustomData() {
        return this.customData == null ? Output.empty() : this.customData;
    }

    /**
     * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).
     * 
     */
    @Import(name="destinationArn", required=true)
      private final Output<String> destinationArn;

    public Output<String> getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). If no events are specified, the trigger will run for all repository events. Event types include: `all`, `updateReference`, `createReference`, `deleteReference`.
     * 
     */
    @Import(name="events", required=true)
      private final Output<List<String>> events;

    public Output<List<String>> getEvents() {
        return this.events;
    }

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public TriggerTriggerArgs(
        @Nullable Output<List<String>> branches,
        @Nullable Output<String> customData,
        Output<String> destinationArn,
        Output<List<String>> events,
        Output<String> name) {
        this.branches = branches;
        this.customData = customData;
        this.destinationArn = Objects.requireNonNull(destinationArn, "expected parameter 'destinationArn' to be non-null");
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private TriggerTriggerArgs() {
        this.branches = Output.empty();
        this.customData = Output.empty();
        this.destinationArn = Output.empty();
        this.events = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> branches;
        private @Nullable Output<String> customData;
        private Output<String> destinationArn;
        private Output<List<String>> events;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branches = defaults.branches;
    	      this.customData = defaults.customData;
    	      this.destinationArn = defaults.destinationArn;
    	      this.events = defaults.events;
    	      this.name = defaults.name;
        }

        public Builder branches(@Nullable Output<List<String>> branches) {
            this.branches = branches;
            return this;
        }
        public Builder branches(@Nullable List<String> branches) {
            this.branches = Output.ofNullable(branches);
            return this;
        }
        public Builder branches(String... branches) {
            return branches(List.of(branches));
        }
        public Builder customData(@Nullable Output<String> customData) {
            this.customData = customData;
            return this;
        }
        public Builder customData(@Nullable String customData) {
            this.customData = Output.ofNullable(customData);
            return this;
        }
        public Builder destinationArn(Output<String> destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }
        public Builder destinationArn(String destinationArn) {
            this.destinationArn = Output.of(Objects.requireNonNull(destinationArn));
            return this;
        }
        public Builder events(Output<List<String>> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }
        public Builder events(List<String> events) {
            this.events = Output.of(Objects.requireNonNull(events));
            return this;
        }
        public Builder events(String... events) {
            return events(List.of(events));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public TriggerTriggerArgs build() {
            return new TriggerTriggerArgs(branches, customData, destinationArn, events, name);
        }
    }
}
