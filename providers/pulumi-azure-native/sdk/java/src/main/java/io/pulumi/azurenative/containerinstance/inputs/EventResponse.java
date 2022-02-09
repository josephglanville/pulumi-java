// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class EventResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventResponse Empty = new EventResponse();

    @InputImport(name="count", required=true)
    private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    @InputImport(name="firstTimestamp", required=true)
    private final String firstTimestamp;

    public String getFirstTimestamp() {
        return this.firstTimestamp;
    }

    @InputImport(name="lastTimestamp", required=true)
    private final String lastTimestamp;

    public String getLastTimestamp() {
        return this.lastTimestamp;
    }

    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public EventResponse(
        Integer count,
        String firstTimestamp,
        String lastTimestamp,
        String message,
        String name,
        String type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.firstTimestamp = Objects.requireNonNull(firstTimestamp, "expected parameter 'firstTimestamp' to be non-null");
        this.lastTimestamp = Objects.requireNonNull(lastTimestamp, "expected parameter 'lastTimestamp' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EventResponse() {
        this.count = null;
        this.firstTimestamp = null;
        this.lastTimestamp = null;
        this.message = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String firstTimestamp;
        private String lastTimestamp;
        private String message;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.firstTimestamp = defaults.firstTimestamp;
    	      this.lastTimestamp = defaults.lastTimestamp;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = Objects.requireNonNull(firstTimestamp);
            return this;
        }

        public Builder setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = Objects.requireNonNull(lastTimestamp);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public EventResponse build() {
            return new EventResponse(count, firstTimestamp, lastTimestamp, message, name, type);
        }
    }
}
