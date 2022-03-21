// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelEvent;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelTransitionEvent;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * When an input is received and the `condition` is `TRUE`, perform the specified `actions`.
 * 
 */
public final class DetectorModelOnInput extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelOnInput Empty = new DetectorModelOnInput();

    /**
     * Specifies the `actions` performed when the `condition` evaluates to `TRUE`.
     * 
     */
    @Import(name="events")
      private final @Nullable List<DetectorModelEvent> events;

    public List<DetectorModelEvent> getEvents() {
        return this.events == null ? List.of() : this.events;
    }

    /**
     * Specifies the `actions` performed, and the next `state` entered, when a `condition` evaluates to `TRUE`.
     * 
     */
    @Import(name="transitionEvents")
      private final @Nullable List<DetectorModelTransitionEvent> transitionEvents;

    public List<DetectorModelTransitionEvent> getTransitionEvents() {
        return this.transitionEvents == null ? List.of() : this.transitionEvents;
    }

    public DetectorModelOnInput(
        @Nullable List<DetectorModelEvent> events,
        @Nullable List<DetectorModelTransitionEvent> transitionEvents) {
        this.events = events;
        this.transitionEvents = transitionEvents;
    }

    private DetectorModelOnInput() {
        this.events = List.of();
        this.transitionEvents = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelOnInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DetectorModelEvent> events;
        private @Nullable List<DetectorModelTransitionEvent> transitionEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelOnInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.transitionEvents = defaults.transitionEvents;
        }

        public Builder events(@Nullable List<DetectorModelEvent> events) {
            this.events = events;
            return this;
        }
        public Builder events(DetectorModelEvent... events) {
            return events(List.of(events));
        }
        public Builder transitionEvents(@Nullable List<DetectorModelTransitionEvent> transitionEvents) {
            this.transitionEvents = transitionEvents;
            return this;
        }
        public Builder transitionEvents(DetectorModelTransitionEvent... transitionEvents) {
            return transitionEvents(List.of(transitionEvents));
        }        public DetectorModelOnInput build() {
            return new DetectorModelOnInput(events, transitionEvents);
        }
    }
}
