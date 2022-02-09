// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PeeringServicePrefixEventResponse extends io.pulumi.resources.InvokeArgs {

    public static final PeeringServicePrefixEventResponse Empty = new PeeringServicePrefixEventResponse();

    @InputImport(name="eventDescription", required=true)
    private final String eventDescription;

    public String getEventDescription() {
        return this.eventDescription;
    }

    @InputImport(name="eventLevel", required=true)
    private final String eventLevel;

    public String getEventLevel() {
        return this.eventLevel;
    }

    @InputImport(name="eventSummary", required=true)
    private final String eventSummary;

    public String getEventSummary() {
        return this.eventSummary;
    }

    @InputImport(name="eventTimestamp", required=true)
    private final String eventTimestamp;

    public String getEventTimestamp() {
        return this.eventTimestamp;
    }

    @InputImport(name="eventType", required=true)
    private final String eventType;

    public String getEventType() {
        return this.eventType;
    }

    public PeeringServicePrefixEventResponse(
        String eventDescription,
        String eventLevel,
        String eventSummary,
        String eventTimestamp,
        String eventType) {
        this.eventDescription = Objects.requireNonNull(eventDescription, "expected parameter 'eventDescription' to be non-null");
        this.eventLevel = Objects.requireNonNull(eventLevel, "expected parameter 'eventLevel' to be non-null");
        this.eventSummary = Objects.requireNonNull(eventSummary, "expected parameter 'eventSummary' to be non-null");
        this.eventTimestamp = Objects.requireNonNull(eventTimestamp, "expected parameter 'eventTimestamp' to be non-null");
        this.eventType = Objects.requireNonNull(eventType, "expected parameter 'eventType' to be non-null");
    }

    private PeeringServicePrefixEventResponse() {
        this.eventDescription = null;
        this.eventLevel = null;
        this.eventSummary = null;
        this.eventTimestamp = null;
        this.eventType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringServicePrefixEventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventDescription;
        private String eventLevel;
        private String eventSummary;
        private String eventTimestamp;
        private String eventType;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringServicePrefixEventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventDescription = defaults.eventDescription;
    	      this.eventLevel = defaults.eventLevel;
    	      this.eventSummary = defaults.eventSummary;
    	      this.eventTimestamp = defaults.eventTimestamp;
    	      this.eventType = defaults.eventType;
        }

        public Builder setEventDescription(String eventDescription) {
            this.eventDescription = Objects.requireNonNull(eventDescription);
            return this;
        }

        public Builder setEventLevel(String eventLevel) {
            this.eventLevel = Objects.requireNonNull(eventLevel);
            return this;
        }

        public Builder setEventSummary(String eventSummary) {
            this.eventSummary = Objects.requireNonNull(eventSummary);
            return this;
        }

        public Builder setEventTimestamp(String eventTimestamp) {
            this.eventTimestamp = Objects.requireNonNull(eventTimestamp);
            return this;
        }

        public Builder setEventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }

        public PeeringServicePrefixEventResponse build() {
            return new PeeringServicePrefixEventResponse(eventDescription, eventLevel, eventSummary, eventTimestamp, eventType);
        }
    }
}
