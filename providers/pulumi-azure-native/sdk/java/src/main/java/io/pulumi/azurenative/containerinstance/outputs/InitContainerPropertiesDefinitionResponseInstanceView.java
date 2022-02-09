// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.azurenative.containerinstance.outputs.ContainerStateResponse;
import io.pulumi.azurenative.containerinstance.outputs.EventResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class InitContainerPropertiesDefinitionResponseInstanceView {
    private final ContainerStateResponse currentState;
    private final List<EventResponse> events;
    private final ContainerStateResponse previousState;
    private final Integer restartCount;

    @OutputCustomType.Constructor({"currentState","events","previousState","restartCount"})
    private InitContainerPropertiesDefinitionResponseInstanceView(
        ContainerStateResponse currentState,
        List<EventResponse> events,
        ContainerStateResponse previousState,
        Integer restartCount) {
        this.currentState = Objects.requireNonNull(currentState);
        this.events = Objects.requireNonNull(events);
        this.previousState = Objects.requireNonNull(previousState);
        this.restartCount = Objects.requireNonNull(restartCount);
    }

    public ContainerStateResponse getCurrentState() {
        return this.currentState;
    }
    public List<EventResponse> getEvents() {
        return this.events;
    }
    public ContainerStateResponse getPreviousState() {
        return this.previousState;
    }
    public Integer getRestartCount() {
        return this.restartCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitContainerPropertiesDefinitionResponseInstanceView defaults) {
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

        public Builder(InitContainerPropertiesDefinitionResponseInstanceView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentState = defaults.currentState;
    	      this.events = defaults.events;
    	      this.previousState = defaults.previousState;
    	      this.restartCount = defaults.restartCount;
        }

        public Builder setCurrentState(ContainerStateResponse currentState) {
            this.currentState = Objects.requireNonNull(currentState);
            return this;
        }

        public Builder setEvents(List<EventResponse> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setPreviousState(ContainerStateResponse previousState) {
            this.previousState = Objects.requireNonNull(previousState);
            return this;
        }

        public Builder setRestartCount(Integer restartCount) {
            this.restartCount = Objects.requireNonNull(restartCount);
            return this;
        }

        public InitContainerPropertiesDefinitionResponseInstanceView build() {
            return new InitContainerPropertiesDefinitionResponseInstanceView(currentState, events, previousState, restartCount);
        }
    }
}
