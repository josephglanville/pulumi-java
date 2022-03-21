// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.ContainerStateResponse;
import io.pulumi.azurenative.containerinstance.inputs.EventResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * The instance view of the container instance. Only valid in response.
 * 
 */
public final class ContainerPropertiesResponseInstanceView extends io.pulumi.resources.InvokeArgs {

    public static final ContainerPropertiesResponseInstanceView Empty = new ContainerPropertiesResponseInstanceView();

    /**
     * Current container instance state.
     * 
     */
    @Import(name="currentState", required=true)
      private final ContainerStateResponse currentState;

    public ContainerStateResponse getCurrentState() {
        return this.currentState;
    }

    /**
     * The events of the container instance.
     * 
     */
    @Import(name="events", required=true)
      private final List<EventResponse> events;

    public List<EventResponse> getEvents() {
        return this.events;
    }

    /**
     * Previous container instance state.
     * 
     */
    @Import(name="previousState", required=true)
      private final ContainerStateResponse previousState;

    public ContainerStateResponse getPreviousState() {
        return this.previousState;
    }

    /**
     * The number of times that the container instance has been restarted.
     * 
     */
    @Import(name="restartCount", required=true)
      private final Integer restartCount;

    public Integer getRestartCount() {
        return this.restartCount;
    }

    public ContainerPropertiesResponseInstanceView(
        ContainerStateResponse currentState,
        List<EventResponse> events,
        ContainerStateResponse previousState,
        Integer restartCount) {
        this.currentState = Objects.requireNonNull(currentState, "expected parameter 'currentState' to be non-null");
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.previousState = Objects.requireNonNull(previousState, "expected parameter 'previousState' to be non-null");
        this.restartCount = Objects.requireNonNull(restartCount, "expected parameter 'restartCount' to be non-null");
    }

    private ContainerPropertiesResponseInstanceView() {
        this.currentState = null;
        this.events = List.of();
        this.previousState = null;
        this.restartCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPropertiesResponseInstanceView defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerStateResponse currentState;
        private List<EventResponse> events;
        private ContainerStateResponse previousState;
        private Integer restartCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPropertiesResponseInstanceView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentState = defaults.currentState;
    	      this.events = defaults.events;
    	      this.previousState = defaults.previousState;
    	      this.restartCount = defaults.restartCount;
        }

        public Builder currentState(ContainerStateResponse currentState) {
            this.currentState = Objects.requireNonNull(currentState);
            return this;
        }
        public Builder events(List<EventResponse> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }
        public Builder events(EventResponse... events) {
            return events(List.of(events));
        }
        public Builder previousState(ContainerStateResponse previousState) {
            this.previousState = Objects.requireNonNull(previousState);
            return this;
        }
        public Builder restartCount(Integer restartCount) {
            this.restartCount = Objects.requireNonNull(restartCount);
            return this;
        }        public ContainerPropertiesResponseInstanceView build() {
            return new ContainerPropertiesResponseInstanceView(currentState, events, previousState, restartCount);
        }
    }
}
